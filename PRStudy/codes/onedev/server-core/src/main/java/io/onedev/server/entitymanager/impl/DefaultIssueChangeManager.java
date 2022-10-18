package io.onedev.server.entitymanager.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevWalk;
import org.joda.time.DateTime;
import org.quartz.CronScheduleBuilder;
import org.quartz.ScheduleBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.onedev.commons.loader.Listen;
import io.onedev.commons.loader.ListenerRegistry;
import io.onedev.commons.utils.LockUtils;
import io.onedev.server.OneDev;
import io.onedev.server.entitymanager.BuildManager;
import io.onedev.server.entitymanager.IssueChangeManager;
import io.onedev.server.entitymanager.IssueFieldManager;
import io.onedev.server.entitymanager.IssueLinkManager;
import io.onedev.server.entitymanager.IssueManager;
import io.onedev.server.entitymanager.IssueScheduleManager;
import io.onedev.server.entitymanager.ProjectManager;
import io.onedev.server.entitymanager.PullRequestManager;
import io.onedev.server.entitymanager.SettingManager;
import io.onedev.server.event.RefUpdated;
import io.onedev.server.event.build.BuildFinished;
import io.onedev.server.event.issue.IssueChanged;
import io.onedev.server.event.pullrequest.PullRequestChanged;
import io.onedev.server.event.pullrequest.PullRequestOpened;
import io.onedev.server.event.system.SystemStarted;
import io.onedev.server.event.system.SystemStopping;
import io.onedev.server.git.GitUtils;
import io.onedev.server.model.Build;
import io.onedev.server.model.Issue;
import io.onedev.server.model.IssueChange;
import io.onedev.server.model.IssueComment;
import io.onedev.server.model.IssueSchedule;
import io.onedev.server.model.LinkSpec;
import io.onedev.server.model.Milestone;
import io.onedev.server.model.Project;
import io.onedev.server.model.PullRequest;
import io.onedev.server.model.support.issue.TransitionSpec;
import io.onedev.server.model.support.issue.changedata.IssueBatchUpdateData;
import io.onedev.server.model.support.issue.changedata.IssueConfidentialChangeData;
import io.onedev.server.model.support.issue.changedata.IssueFieldChangeData;
import io.onedev.server.model.support.issue.changedata.IssueLinkAddData;
import io.onedev.server.model.support.issue.changedata.IssueLinkChangeData;
import io.onedev.server.model.support.issue.changedata.IssueLinkRemoveData;
import io.onedev.server.model.support.issue.changedata.IssueMilestoneAddData;
import io.onedev.server.model.support.issue.changedata.IssueMilestoneChangeData;
import io.onedev.server.model.support.issue.changedata.IssueMilestoneRemoveData;
import io.onedev.server.model.support.issue.changedata.IssueStateChangeData;
import io.onedev.server.model.support.issue.changedata.IssueTitleChangeData;
import io.onedev.server.model.support.issue.transitiontrigger.BranchUpdateTrigger;
import io.onedev.server.model.support.issue.transitiontrigger.BuildSuccessfulTrigger;
import io.onedev.server.model.support.issue.transitiontrigger.DiscardPullRequestTrigger;
import io.onedev.server.model.support.issue.transitiontrigger.MergePullRequestTrigger;
import io.onedev.server.model.support.issue.transitiontrigger.NoActivityTrigger;
import io.onedev.server.model.support.issue.transitiontrigger.OpenPullRequestTrigger;
import io.onedev.server.model.support.issue.transitiontrigger.PullRequestTrigger;
import io.onedev.server.model.support.issue.transitiontrigger.StateTransitionTrigger;
import io.onedev.server.model.support.pullrequest.changedata.PullRequestDiscardData;
import io.onedev.server.model.support.pullrequest.changedata.PullRequestMergeData;
import io.onedev.server.model.support.pullrequest.changedata.PullRequestReopenData;
import io.onedev.server.persistence.TransactionManager;
import io.onedev.server.persistence.annotation.Sessional;
import io.onedev.server.persistence.annotation.Transactional;
import io.onedev.server.persistence.dao.BaseEntityManager;
import io.onedev.server.persistence.dao.Dao;
import io.onedev.server.search.entity.issue.IssueQuery;
import io.onedev.server.search.entity.issue.IssueQueryLexer;
import io.onedev.server.search.entity.issue.IssueQueryParseOption;
import io.onedev.server.search.entity.issue.StateCriteria;
import io.onedev.server.search.entity.issue.UpdateDateCriteria;
import io.onedev.server.security.SecurityUtils;
import io.onedev.server.util.Input;
import io.onedev.server.util.ProjectScope;
import io.onedev.server.util.ProjectScopedCommit;
import io.onedev.server.util.criteria.Criteria;
import io.onedev.server.util.match.Matcher;
import io.onedev.server.util.match.PathMatcher;
import io.onedev.server.util.match.StringMatcher;
import io.onedev.server.util.patternset.PatternSet;
import io.onedev.server.util.schedule.SchedulableTask;
import io.onedev.server.util.schedule.TaskScheduler;

@Singleton
public class DefaultIssueChangeManager extends BaseEntityManager<IssueChange>
		implements IssueChangeManager, SchedulableTask {

	private static final Logger logger = LoggerFactory.getLogger(DefaultIssueChangeManager.class);
	
	private static final int MAX_FIXED_ISSUES = 1000;
	
	private final IssueManager issueManager;
	
	private final IssueFieldManager issueFieldManager;
	
	private final TransactionManager transactionManager;
	
	private final ProjectManager projectManager;
	
	private final PullRequestManager pullRequestManager;
	
	private final BuildManager buildManager;
	
	private final IssueScheduleManager issueScheduleManager;
	
	private final IssueLinkManager issueLinkManager;
	
	private final ExecutorService executorService;
	
	private final ListenerRegistry listenerRegistry;
	
	private final TaskScheduler taskScheduler;
	
	private String taskId;
	
	@Inject
	public DefaultIssueChangeManager(Dao dao, TransactionManager transactionManager, 
			IssueManager issueManager,  IssueFieldManager issueFieldManager,
			ProjectManager projectManager, BuildManager buildManager, 
			ExecutorService executorService, PullRequestManager pullRequestManager, 
			ListenerRegistry listenerRegistry, TaskScheduler taskScheduler, 
			IssueScheduleManager issueScheduleManager, IssueLinkManager issueLinkManager) {
		super(dao);
		this.issueManager = issueManager;
		this.issueFieldManager = issueFieldManager;
		this.transactionManager = transactionManager;
		this.projectManager = projectManager;
		this.pullRequestManager = pullRequestManager;
		this.buildManager = buildManager;
		this.executorService = executorService;
		this.listenerRegistry = listenerRegistry;
		this.taskScheduler = taskScheduler;
		this.issueScheduleManager = issueScheduleManager;
		this.issueLinkManager = issueLinkManager;
	}

	@Transactional
	@Override
	public void save(IssueChange change, String note) {
		dao.persist(change);
		if (note != null) {
			IssueComment comment = new IssueComment();
			comment.setContent(note);
			comment.setUser(change.getUser());
			comment.setIssue(change.getIssue());
			comment.setDate(change.getDate());
			dao.persist(comment);
			comment.getIssue().setCommentCount(comment.getIssue().getCommentCount()+1);
		}
		
		listenerRegistry.post(new IssueChanged(change, note));
	}
	
	@Override
	public void save(IssueChange change) {
		save(change, null);
	}
	
	@Transactional
	@Override
	public void changeTitle(Issue issue, String title) {
		String prevTitle = issue.getTitle();
		if (!title.equals(prevTitle)) {
			issue.setTitle(title);
			
			IssueChange change = new IssueChange();
			change.setIssue(issue);
			change.setUser(SecurityUtils.getUser());
			change.setData(new IssueTitleChangeData(prevTitle, issue.getTitle()));
			save(change);
			dao.persist(issue);
		}
	}

	@Transactional
	@Override
	public void changeConfidential(Issue issue, boolean confidential) {
		boolean prevConfidential = issue.isConfidential();
		if (confidential != prevConfidential) {
			issue.setConfidential(confidential);
			
			IssueChange change = new IssueChange();
			change.setIssue(issue);
			change.setUser(SecurityUtils.getUser());
			change.setData(new IssueConfidentialChangeData(prevConfidential, issue.isConfidential()));
			save(change);
			dao.persist(issue);
		}
	}
	
	@Transactional
	@Override
	public void addSchedule(Issue issue, Milestone milestone) {
		issueScheduleManager.save(issue.addSchedule(milestone));
		
		IssueChange change = new IssueChange();
		change.setIssue(issue);
		change.setData(new IssueMilestoneAddData(milestone.getName()));
		change.setUser(SecurityUtils.getUser());
		save(change);
	}
	
	@Transactional
	@Override
	public void removeSchedule(Issue issue, Milestone milestone) {
		IssueSchedule schedule = issue.removeSchedule(milestone);
		if (schedule != null) {
			issueScheduleManager.delete(schedule);
			IssueChange change = new IssueChange();
			change.setIssue(issue);
			change.setData(new IssueMilestoneRemoveData(milestone.getName()));
			change.setUser(SecurityUtils.getUser());
			save(change);
		}
	}
	
	@Transactional
	@Override
	public void changeFields(Issue issue, Map<String, Object> fieldValues) {
		Map<String, Input> prevFields = issue.getFieldInputs(); 
		issue.setFieldValues(fieldValues);
		if (!prevFields.equals(issue.getFieldInputs())) {
			issueFieldManager.saveFields(issue);
			
			IssueChange change = new IssueChange();
			change.setIssue(issue);
			change.setUser(SecurityUtils.getUser());
			change.setData(new IssueFieldChangeData(prevFields, issue.getFieldInputs()));
			save(change);
		}
	}
	
	@Transactional
	@Override
	public void changeState(Issue issue, String state, Map<String, Object> fieldValues, 
			Collection<String> removeFields, @Nullable String comment) {
		String prevState = issue.getState();
		Map<String, Input> prevFields = issue.getFieldInputs();
		
		issue.setState(state);
		issue.removeFields(removeFields);
		issue.setFieldValues(fieldValues);
		
		issueFieldManager.saveFields(issue);
		
		IssueChange change = new IssueChange();
		change.setIssue(issue);
		change.setUser(SecurityUtils.getUser());
		change.setData(new IssueStateChangeData(prevState, issue.getState(), 
				prevFields, issue.getFieldInputs()));
		save(change, comment);
	}
	
	@Transactional
	@Override
	public void batchUpdate(Iterator<? extends Issue> issues, @Nullable String state, @Nullable Boolean confidential,
			@Nullable Collection<Milestone> milestones, Map<String, Object> fieldValues, @Nullable String comment) {
		while (issues.hasNext()) {
			Issue issue = issues.next();
			String prevState = issue.getState();
			boolean prevConfidential = issue.isConfidential();
			Collection<Milestone> prevMilestones = issue.getMilestones();
			Map<String, Input> prevFields = issue.getFieldInputs();
			if (state != null)
				issue.setState(state);
			
			if (confidential != null)
				issue.setConfidential(confidential);
			
			if (milestones != null) 
				issueScheduleManager.syncMilestones(issue, milestones);
			
			issue.setFieldValues(fieldValues);
			issueFieldManager.saveFields(issue);

			if (!prevState.equals(issue.getState()) 
					|| prevConfidential != issue.isConfidential()
					|| !prevFields.equals(issue.getFieldInputs()) 
					|| !new HashSet<>(prevMilestones).equals(new HashSet<>(issue.getMilestones()))) {
				IssueChange change = new IssueChange();
				change.setIssue(issue);
				change.setUser(SecurityUtils.getUser());
				
				List<Milestone> prevMilestoneList = new ArrayList<>(prevMilestones);
				prevMilestoneList.sort(new Milestone.DatesAndStatusComparator());
				List<Milestone> currentMilestoneList = new ArrayList<>(issue.getMilestones());
				currentMilestoneList.sort(new Milestone.DatesAndStatusComparator());
				change.setData(new IssueBatchUpdateData(prevState, issue.getState(), 
						prevConfidential, issue.isConfidential(), prevMilestoneList, 
						currentMilestoneList, prevFields, issue.getFieldInputs()));
				save(change, comment);
			}
		}
	}
	
	private List<TransitionSpec> getTransitionSpecs() {
		return OneDev.getInstance(SettingManager.class).getIssueSetting().getTransitionSpecs();
	}
	
	@Transactional
	@Listen
	public void on(IssueChanged event) {
		if (event.getChange().getData() instanceof IssueStateChangeData) {
			Long issueId = event.getIssue().getId();
			Long projectId = event.getIssue().getProject().getId();
			
			transactionManager.runAfterCommit(new Runnable() {

				@Override
				public void run() {
					executorService.execute(new Runnable() {

						@Override
						public void run() {
				        	LockUtils.call(getLockKey(projectId), new Callable<Void>() {

								@Override
								public Void call() throws Exception {
									transactionManager.run(new Runnable() {

										@Override
										public void run() {
											try {
												SecurityUtils.bindAsSystem();
												Issue issue = issueManager.load(issueId);
												
												IssueQueryParseOption option = new IssueQueryParseOption().withCurrentIssueCriteria(true);
												for (TransitionSpec transition: getTransitionSpecs()) {
													if (transition.getTrigger() instanceof StateTransitionTrigger) {
														Project project = issue.getProject();
														ProjectScope projectScope = new ProjectScope(project, true, true);
														StateTransitionTrigger trigger = (StateTransitionTrigger) transition.getTrigger();
														if (trigger.getStates().contains(issue.getState())) {
															IssueQuery query = IssueQuery.parse(project, trigger.getIssueQuery(), option, true);
															List<Criteria<Issue>> criterias = new ArrayList<>();
															
															List<Criteria<Issue>> fromStateCriterias = new ArrayList<>();
															for (String fromState: transition.getFromStates()) 
																fromStateCriterias.add(new StateCriteria(fromState, IssueQueryLexer.Is));
															
															criterias.add(Criteria.orCriterias(fromStateCriterias));
															if (query.getCriteria() != null)
																criterias.add(query.getCriteria());
															query = new IssueQuery(Criteria.andCriterias(criterias), new ArrayList<>());
															Issue.push(issue);
															try {
																for (Issue each: issueManager.query(
																		projectScope, query, true, 0, Integer.MAX_VALUE)) {
																	String message = "State changed as issue #" + issue.getNumber() 
																			+ " transited to '" + issue.getState() + "'";
																	changeState(each, transition.getToState(), new HashMap<>(), 
																			transition.getRemoveFields(), message);
																}
															} finally {
																Issue.pop();
															}
														}
													}      												
												}
											} catch (Exception e) {
												logger.error("Error changing issue state", e);
											}
										}
									});
									return null;
								}
				        	});
						}
					});
				}
			});				
		}
	}
	
	@Transactional
	@Listen
	public void on(BuildFinished event) {
		Long buildId = event.getBuild().getId();
		Long projectId = event.getBuild().getProject().getId();
		transactionManager.runAfterCommit(new Runnable() {

			@Override
			public void run() {
				executorService.execute(new Runnable() {

					@Override
					public void run() {
			        	LockUtils.call(getLockKey(projectId), new Callable<Void>() {

							@Override
							public Void call() throws Exception {
								transactionManager.run(new Runnable() {

									@Override
									public void run() {
										try {
											SecurityUtils.bindAsSystem();
											Build build = buildManager.load(buildId);

											IssueQueryParseOption option = new IssueQueryParseOption().withCurrentBuildCriteria(true);
											for (TransitionSpec transition: getTransitionSpecs()) {
												if (transition.getTrigger() instanceof BuildSuccessfulTrigger) {
													Project project = build.getProject();
													ProjectScope projectScope = new ProjectScope(project, true, true);
													BuildSuccessfulTrigger trigger = (BuildSuccessfulTrigger) transition.getTrigger();
													String branches = trigger.getBranches();
													ObjectId commitId = ObjectId.fromString(build.getCommitHash());
													if ((trigger.getJobNames() == null || PatternSet.parse(trigger.getJobNames()).matches(new StringMatcher(), build.getJobName())) 
															&& build.getStatus() == Build.Status.SUCCESSFUL
															&& (branches == null || project.isCommitOnBranches(commitId, branches))) {
														IssueQuery query = IssueQuery.parse(project, trigger.getIssueQuery(), option, true);
														List<Criteria<Issue>> criterias = new ArrayList<>();
														
														List<Criteria<Issue>> fromStateCriterias = new ArrayList<>();
														for (String fromState: transition.getFromStates()) 
															fromStateCriterias.add(new StateCriteria(fromState, IssueQueryLexer.Is));
														
														criterias.add(Criteria.orCriterias(fromStateCriterias));
														if (query.getCriteria() != null)
															criterias.add(query.getCriteria());
														query = new IssueQuery(Criteria.andCriterias(criterias), new ArrayList<>());
														Build.push(build);
														try {
															for (Issue issue: issueManager.query(projectScope, query, true, 0, Integer.MAX_VALUE)) {
																String message = "State changed as build #" + build.getNumber() + " is successful";
																changeState(issue, transition.getToState(), new HashMap<>(), 
																		transition.getRemoveFields(), message);
															}
														} finally {
															Build.pop();
														}
													}
												}      												
											}
										} catch (Exception e) {
											logger.error("Error changing issue state", e);
										}
									}
								});
								return null;
							}
			        	});
					}
				});
			}
		});
	}
	
	private void on(PullRequest request, Class<? extends PullRequestTrigger> triggerClass) {
		Long requestId = request.getId();
		Long projectId = request.getTargetProject().getId();
		transactionManager.runAfterCommit(new Runnable() {

			@Override
			public void run() {
				executorService.execute(new Runnable() {

					@Override
					public void run() {
						LockUtils.call(getLockKey(projectId), new Callable<Void>() {

							@Override
							public Void call() throws Exception {
								transactionManager.run(new Runnable() {

									@Override
									public void run() {
										try {
											SecurityUtils.bindAsSystem();
											Matcher matcher = new PathMatcher();
											PullRequest request = pullRequestManager.load(requestId);
											Project project = request.getTargetProject();
											ProjectScope projectScope = new ProjectScope(project, true, true);
											IssueQueryParseOption option = new IssueQueryParseOption().withCurrentPullRequestCriteria(true);
											for (TransitionSpec transition: getTransitionSpecs()) {
												if (transition.getTrigger().getClass() == triggerClass) {
													PullRequestTrigger trigger = (PullRequestTrigger) transition.getTrigger();
													if (trigger.getBranches() == null || PatternSet.parse(trigger.getBranches()).matches(matcher, request.getTargetBranch())) {
														IssueQuery query = IssueQuery.parse(project, trigger.getIssueQuery(), option, true);
														List<Criteria<Issue>> criterias = new ArrayList<>();
														
														List<Criteria<Issue>> fromStateCriterias = new ArrayList<>();
														for (String fromState: transition.getFromStates()) 
															fromStateCriterias.add(new StateCriteria(fromState, IssueQueryLexer.Is));
														
														criterias.add(Criteria.orCriterias(fromStateCriterias));
														if (query.getCriteria() != null)
															criterias.add(query.getCriteria());
														query = new IssueQuery(Criteria.andCriterias(criterias), new ArrayList<>());
														PullRequest.push(request);
														try {
															for (Issue issue: issueManager.query(projectScope, query, true, 0, Integer.MAX_VALUE)) {
																String statusName = request.getStatus().toString().toLowerCase();
																changeState(issue, transition.getToState(), new HashMap<>(), 
																		transition.getRemoveFields(), 
																		"State changed as pull request #" + request.getNumber() + " is " + statusName);
															}
														} finally {
															PullRequest.pop();
														}
													}
												}
											}
										} catch (Exception e) {
											logger.error("Error changing issue state", e);
										}
									}
								});
								return null;
							}
							
						});
					}
					
				});
			}
		});
	}
	
	@Transactional
	@Listen
	public void on(PullRequestChanged event) { 
		if (event.getChange().getData() instanceof PullRequestMergeData) 
			on(event.getRequest(), MergePullRequestTrigger.class);
		else if (event.getChange().getData() instanceof PullRequestDiscardData) 
			on(event.getRequest(), DiscardPullRequestTrigger.class);
		else if (event.getChange().getData() instanceof PullRequestReopenData) 
			on(event.getRequest(), OpenPullRequestTrigger.class);
	}
	
	@Transactional
	@Listen
	public void on(PullRequestOpened event) {
		on(event.getRequest(), OpenPullRequestTrigger.class);
	}
	
	private String getLockKey(Long projectId) {
		return "change-issue-state-" + projectId;
	}

	@Transactional
	@Listen
	public void on(RefUpdated event) {
		String refName = event.getRefName();
		String branchName = GitUtils.ref2branch(refName);
		ObjectId newCommitId = event.getNewCommitId();
		if (!newCommitId.equals(ObjectId.zeroId()) && branchName != null) {
			/*
			 * Transit states of issues fixed by commits under the new branch. Note that ideally 
			 * we should also transit states of issues fixed by builds under the new branch. 
			 * However that will be very cost. To work around this, when a branch is pushed, new 
			 * builds should be running on that branch in order to get issue states transited 
			 */
			Project project = event.getProject();
			Long projectId = project.getId();
			ObjectId oldCommitId = event.getOldCommitId();
			
			transactionManager.runAfterCommit(new Runnable() {

				@Override
				public void run() {
					executorService.execute(new Runnable() {

						@Override
						public void run() {
				        	LockUtils.call(getLockKey(projectId), new Callable<Void>() {

								@Override
								public Void call() throws Exception {
									transactionManager.run(new Runnable() {

										@Override
										public void run() {
											try {
												SecurityUtils.bindAsSystem();
												Project project = projectManager.load(projectId);
												ProjectScope projectScope = new ProjectScope(project, true, true);
												Set<Long> fixedIssueIds = new HashSet<>();
												try (RevWalk revWalk = new RevWalk(project.getRepository())) {
													revWalk.markStart(revWalk.lookupCommit(newCommitId));
													if (oldCommitId.equals(ObjectId.zeroId())) {
														/*
														 * In case a new branch is pushed, we only process new commits not in any existing branches
														 * for performance reason. This is reasonable as state of fixed issues by commits in 
														 * existing branches most probably is already transited        
														 */
														for (Ref ref: project.getRepository().getRefDatabase().getRefsByPrefix(Constants.R_HEADS)) {
															if (!ref.getName().equals(refName))
																revWalk.markUninteresting(revWalk.lookupCommit(ref.getObjectId()));
														}
													} else {
														revWalk.markUninteresting(revWalk.lookupCommit(oldCommitId));
													}
													RevCommit commit;
													while ((commit = revWalk.next()) != null) {
														fixedIssueIds.addAll(project.parseFixedIssueIds(commit.getFullMessage()));
														if (fixedIssueIds.size() > MAX_FIXED_ISSUES)
															break;
													}
												} 
												
												IssueQueryParseOption option = new IssueQueryParseOption().withCurrentCommitCriteria(true);
												for (TransitionSpec transition: getTransitionSpecs()) {
													if (transition.getTrigger() instanceof BranchUpdateTrigger) {
														BranchUpdateTrigger trigger = (BranchUpdateTrigger) transition.getTrigger();
														String branches = trigger.getBranches();
														Matcher matcher = new PathMatcher();
														if (branches == null || PatternSet.parse(branches).matches(matcher, branchName)) {
															IssueQuery query = IssueQuery.parse(project, trigger.getIssueQuery(), option, true);
															List<Criteria<Issue>> criterias = new ArrayList<>();
															
															List<Criteria<Issue>> fromStateCriterias = new ArrayList<>();
															for (String fromState: transition.getFromStates()) 
																fromStateCriterias.add(new StateCriteria(fromState, IssueQueryLexer.Is));
															
															criterias.add(Criteria.orCriterias(fromStateCriterias));
															if (query.getCriteria() != null)
																criterias.add(query.getCriteria());
															query = new IssueQuery(Criteria.andCriterias(criterias), new ArrayList<>());
															ProjectScopedCommit.push(new ProjectScopedCommit(project, newCommitId) {

																private static final long serialVersionUID = 1L;

																@Override
																public Collection<Long> getFixedIssueIds() {
																	return fixedIssueIds;
																}
																
															});
															try {
																for (Issue issue: issueManager.query(projectScope, query, true, 0, Integer.MAX_VALUE)) {
																	changeState(issue, transition.getToState(), new HashMap<>(), 
																			transition.getRemoveFields(), "State changed as code fixing the issue is committed");
																}
															} finally {
																ProjectScopedCommit.pop();
															}
														}
													}
												}
											} catch (Exception e) {
												logger.error("Error changing issue state", e);
											}
										}
									});
									return null;
								}
				        		
				        	});							
						}
						
					});
				}
			});
		}
	}

	@Transactional
	@Override
	public void execute() {
		IssueQueryParseOption option = new IssueQueryParseOption();
		for (TransitionSpec transition: getTransitionSpecs()) {
			if (transition.getTrigger() instanceof NoActivityTrigger) {
				NoActivityTrigger trigger = (NoActivityTrigger) transition.getTrigger();
				IssueQuery query = IssueQuery.parse(null, trigger.getIssueQuery(), option, false);
				List<Criteria<Issue>> criterias = new ArrayList<>();
				
				List<Criteria<Issue>> fromStateCriterias = new ArrayList<>();
				for (String fromState: transition.getFromStates()) 
					fromStateCriterias.add(new StateCriteria(fromState, IssueQueryLexer.Is));
				
				criterias.add(Criteria.orCriterias(fromStateCriterias));
				if (query.getCriteria() != null)
					criterias.add(query.getCriteria());
				
				criterias.add(new UpdateDateCriteria(
						new DateTime().minusDays(trigger.getDays()).toDate(), 
						IssueQueryLexer.IsUntil));
				
				query = new IssueQuery(Criteria.andCriterias(criterias), new ArrayList<>());
				
				for (Issue issue: issueManager.query(null, query, true, 0, Integer.MAX_VALUE)) {
					changeState(issue, transition.getToState(), new HashMap<>(), 
							transition.getRemoveFields(), null);
				}
			}
		}
	}
	
	@Sessional
	@Override
	public List<IssueChange> queryAfter(Long afterChangeId, int count) {
		return dao.queryAfter(IssueChange.class, afterChangeId, count);
	}

	@Override
	public ScheduleBuilder<?> getScheduleBuilder() {
		return CronScheduleBuilder.dailyAtHourAndMinute(1, 0);
	}

	@Listen
	public void on(SystemStarted event) {
		taskId = taskScheduler.schedule(this);
	}

	@Listen
	public void on(SystemStopping event) {
		taskScheduler.unschedule(taskId);
	}

	@Transactional
	@Override
	public void changeMilestones(Issue issue, Collection<Milestone> milestones) {
		Collection<Milestone> prevMilestones = new HashSet<>(issue.getMilestones());
		if (!prevMilestones.equals(new HashSet<>(milestones))) {
			issueScheduleManager.syncMilestones(issue, milestones);
			IssueChange change = new IssueChange();
			change.setIssue(issue);
			change.setUser(SecurityUtils.getUser());
			
			List<Milestone> prevMilestoneList = new ArrayList<>(prevMilestones);
			prevMilestoneList.sort(new Milestone.DatesAndStatusComparator());
			List<Milestone> currentMilestoneList = new ArrayList<>(milestones);
			currentMilestoneList.sort(new Milestone.DatesAndStatusComparator());
			change.setData(new IssueMilestoneChangeData(prevMilestoneList, currentMilestoneList));
			save(change);
		}
		
	}

	@Transactional
	@Override
	public void changeLink(LinkSpec spec, Issue issue, Issue linkedIssue, boolean opposite) {
		Issue prevLinkedIssue = issue.findLinkedIssue(spec, opposite);
		
		List<Issue> linkedIssues = new ArrayList<>();
		if (linkedIssue != null)
			linkedIssues.add(linkedIssue);
		issueLinkManager.syncLinks(spec, issue, linkedIssues, opposite);
		
		IssueChange change = new IssueChange();
		change.setIssue(issue);
		change.setUser(SecurityUtils.getUser());
		
		IssueLinkChangeData data = new IssueLinkChangeData(spec.getName(opposite), 
				getLinkedIssueInfo(issue, prevLinkedIssue), 
				getLinkedIssueInfo(issue, linkedIssue));
		change.setData(data);
		save(change);
		
		logLinkedSideChange(spec, issue, prevLinkedIssue, linkedIssue, opposite);
	}
	
	private void logLinkedSideChange(LinkSpec spec, Issue issue, @Nullable Issue prevLinkedIssue, 
			@Nullable Issue linkedIssue, boolean opposite) {
		String linkName;
		boolean multiple;
		if (spec.getOpposite() != null) {
			linkName = opposite?spec.getName():spec.getOpposite().getName();
			multiple = opposite?spec.isMultiple():spec.getOpposite().isMultiple(); 
		} else {
			linkName = spec.getName();
			multiple = spec.isMultiple();
		}
		if (prevLinkedIssue != null) {
			IssueChange change = new IssueChange();
			change.setIssue(prevLinkedIssue);
			change.setUser(SecurityUtils.getUser());
			String prevIssueSummary = getLinkedIssueInfo(prevLinkedIssue, issue);
			if (multiple)
				change.setData(new IssueLinkRemoveData(linkName, prevIssueSummary));
			else
				change.setData(new IssueLinkChangeData(linkName, prevIssueSummary, null));
			save(change);
		} 
		if (linkedIssue != null) {
			IssueChange change = new IssueChange();
			change.setIssue(linkedIssue);
			change.setUser(SecurityUtils.getUser());
			String issueSummary = getLinkedIssueInfo(linkedIssue, issue);
			if (multiple)
				change.setData(new IssueLinkAddData(linkName, issueSummary));
			else
				change.setData(new IssueLinkChangeData(linkName, null, issueSummary));
			save(change);
		}
	}
	
	@Nullable
	private String getLinkedIssueInfo(Issue issue, @Nullable Issue linkedIssue) {
		if (linkedIssue != null) {
			if (linkedIssue.getNumberScope().equals(issue.getNumberScope()))
				return "#" + linkedIssue.getNumber();
			else
				return linkedIssue.getProject() + "#" + linkedIssue.getNumber();
		} else {
			return null;
		}
	}

	@Transactional
	@Override
	public void addLink(LinkSpec spec, Issue issue, Issue linkedIssue, boolean opposite) {
		Collection<Issue> linkedIssues = issue.findLinkedIssues(spec, opposite);
		linkedIssues.add(linkedIssue);
		issueLinkManager.syncLinks(spec, issue, linkedIssues, opposite);
		
		IssueChange change = new IssueChange();
		change.setIssue(issue);
		change.setUser(SecurityUtils.getUser());
	
		String linkName = spec.getName(opposite);
		IssueLinkAddData data = new IssueLinkAddData(linkName, getLinkedIssueInfo(issue, linkedIssue));
		change.setData(data);
		save(change);
		
		logLinkedSideChange(spec, issue, null, linkedIssue, opposite);
	}

	@Transactional
	@Override
	public void removeLink(LinkSpec spec, Issue issue, Issue linkedIssue, boolean opposite) {
		Collection<Issue> linkedIssues = issue.findLinkedIssues(spec, opposite);
		linkedIssues.remove(linkedIssue);
		issueLinkManager.syncLinks(spec, issue, linkedIssues, opposite);
		
		IssueChange change = new IssueChange();
		change.setIssue(issue);
		change.setUser(SecurityUtils.getUser());
		
		String linkName = spec.getName(opposite);
		IssueLinkRemoveData data = new IssueLinkRemoveData(linkName, getLinkedIssueInfo(issue, linkedIssue));
		change.setData(data);
		save(change);
		
		logLinkedSideChange(spec, issue, linkedIssue, null, opposite);
	}
	
}
