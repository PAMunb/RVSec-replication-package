package io.onedev.server.model;

import static io.onedev.server.model.AbstractEntity.PROP_NUMBER;
import static io.onedev.server.model.Issue.PROP_COMMENT_COUNT;
import static io.onedev.server.model.Issue.PROP_NO_SPACE_TITLE;
import static io.onedev.server.model.Issue.PROP_STATE;
import static io.onedev.server.model.Issue.PROP_SUBMIT_DATE;
import static io.onedev.server.model.Issue.PROP_TITLE;
import static io.onedev.server.model.Issue.PROP_UUID;
import static io.onedev.server.model.Issue.PROP_VOTE_COUNT;
import static io.onedev.server.model.IssueSchedule.NAME_MILESTONE;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.revwalk.RevCommit;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import edu.emory.mathcs.backport.java.util.Collections;
import io.onedev.server.OneDev;
import io.onedev.server.entitymanager.GroupManager;
import io.onedev.server.entitymanager.PullRequestManager;
import io.onedev.server.entitymanager.SettingManager;
import io.onedev.server.entitymanager.UserManager;
import io.onedev.server.entityreference.Referenceable;
import io.onedev.server.infomanager.CommitInfoManager;
import io.onedev.server.infomanager.PullRequestInfoManager;
import io.onedev.server.infomanager.UserInfoManager;
import io.onedev.server.model.support.EntityWatch;
import io.onedev.server.model.support.LastUpdate;
import io.onedev.server.model.support.administration.GlobalIssueSetting;
import io.onedev.server.model.support.inputspec.InputSpec;
import io.onedev.server.model.support.issue.field.spec.FieldSpec;
import io.onedev.server.search.entity.SortField;
import io.onedev.server.security.SecurityUtils;
import io.onedev.server.storage.AttachmentStorageSupport;
import io.onedev.server.util.ComponentContext;
import io.onedev.server.util.Input;
import io.onedev.server.util.ProjectScopedNumber;
import io.onedev.server.web.editable.BeanDescriptor;
import io.onedev.server.web.editable.PropertyDescriptor;
import io.onedev.server.web.editable.annotation.Editable;
import io.onedev.server.web.util.IssueAware;
import io.onedev.server.web.util.WicketUtils;

@Entity
@Table(
		indexes={
				@Index(columnList="o_project_id"), @Index(columnList=PROP_STATE), 
				@Index(columnList=PROP_UUID),
				@Index(columnList=PROP_TITLE), @Index(columnList=PROP_NO_SPACE_TITLE),  
				@Index(columnList=PROP_NUMBER), @Index(columnList=PROP_SUBMIT_DATE), 
				@Index(columnList="o_submitter_id"), @Index(columnList=PROP_VOTE_COUNT), 
				@Index(columnList=PROP_COMMENT_COUNT), @Index(columnList=LastUpdate.COLUMN_DATE), 
				@Index(columnList="o_numberScope_id")}, 
		uniqueConstraints={@UniqueConstraint(columnNames={"o_numberScope_id", PROP_NUMBER})})
//use dynamic update in order not to overwrite other edits while background threads change update date
@DynamicUpdate
@Editable
public class Issue extends AbstractEntity implements Referenceable, AttachmentStorageSupport {

	private static final long serialVersionUID = 1L;
	
	public static final int MAX_TITLE_LEN = 255;
	
	public static final int MAX_DESCRIPTION_LEN = 14000;

	public static final String NAME_PROJECT = "Project";
	
	public static final String PROP_PROJECT = "project";
	
	public static final String NAME_STATE = "State";
	
	public static final String PROP_STATE = "state";
	
	public static final String PROP_STATE_ORDINAL = "stateOrdinal";
	
	public static final String NAME_TITLE = "Title";
	
	public static final String PROP_TITLE = "title";
	
	public static final String NAME_DESCRIPTION = "Description";
	
	public static final String PROP_DESCRIPTION = "description";
	
	public static final String NAME_COMMENT = "Comment";
	
	public static final String PROP_COMMENTS = "comments";
	
	public static final String PROP_CHANGES = "changes";
	
	public static final String NAME_SUBMITTER = "Submitter";
	
	public static final String PROP_SUBMITTER = "submitter";
	
	public static final String NAME_SUBMIT_DATE = "Submit Date";
	
	public static final String PROP_SUBMIT_DATE = "submitDate";
	
	public static final String NAME_VOTE_COUNT = "Vote Count";
	
	public static final String PROP_VOTE_COUNT = "voteCount";
	
	public static final String NAME_COMMENT_COUNT = "Comment Count";
	
	public static final String PROP_COMMENT_COUNT = "commentCount";
	
	public static final String NAME_UPDATE_DATE = "Update Date";
	
	public static final String PROP_LAST_UPDATE = "lastUpdate";
	
	public static final String PROP_FIELDS = "fields";
	
	public static final String PROP_AUTHORIZATIONS = "authorizations";
		
	public static final String PROP_SOURCE_LINKS = "sourceLinks";
	
	public static final String PROP_TARGET_LINKS = "targetLinks";
	
	public static final String PROP_SCHEDULES = "schedules";
	
	public static final String PROP_UUID = "uuid";
	
	public static final String PROP_ID = "id";
	
	public static final String PROP_NO_SPACE_TITLE = "noSpaceTitle";
	
	public static final String PROP_CONFIDENTIAL = "confidential";
	
	public static final Set<String> ALL_FIELDS = Sets.newHashSet(
			NAME_PROJECT, NAME_NUMBER, NAME_STATE, NAME_TITLE, NAME_SUBMITTER, 
			NAME_DESCRIPTION, NAME_COMMENT, NAME_SUBMIT_DATE, NAME_UPDATE_DATE, 
			NAME_VOTE_COUNT, NAME_COMMENT_COUNT, NAME_MILESTONE);
	
	public static final List<String> QUERY_FIELDS = Lists.newArrayList(
			NAME_PROJECT, NAME_NUMBER, NAME_STATE, NAME_TITLE, NAME_DESCRIPTION, 
			NAME_COMMENT, NAME_SUBMIT_DATE, NAME_UPDATE_DATE, NAME_VOTE_COUNT, 
			NAME_COMMENT_COUNT, NAME_MILESTONE);

	public static final Map<String, SortField<Issue>> ORDER_FIELDS = new LinkedHashMap<>();
	
	static {
		ORDER_FIELDS.put(NAME_VOTE_COUNT, new SortField<Issue>(PROP_VOTE_COUNT, new Comparator<Issue>() {

			@Override
			public int compare(Issue o1, Issue o2) {
				return o1.getVoteCount() - o1.getVoteCount();
			}
			
		}));
		ORDER_FIELDS.put(NAME_COMMENT_COUNT, new SortField<Issue>(PROP_COMMENT_COUNT, new Comparator<Issue>() {

			@Override
			public int compare(Issue o1, Issue o2) {
				return o1.getCommentCount() - o2.getCommentCount();
			}
			
		}));
		ORDER_FIELDS.put(NAME_NUMBER, new SortField<Issue>(PROP_NUMBER, new Comparator<Issue>() {

			@Override
			public int compare(Issue o1, Issue o2) {
				return (int)(o1.getNumber() - o2.getNumber());
			}
			
		}));
		ORDER_FIELDS.put(NAME_STATE, new SortField<Issue>(PROP_STATE_ORDINAL, new Comparator<Issue>() {

			@Override
			public int compare(Issue o1, Issue o2) {
				return o1.getStateOrdinal() - o2.getStateOrdinal();
			}
			
		}));
		ORDER_FIELDS.put(NAME_SUBMIT_DATE, new SortField<Issue>(PROP_SUBMIT_DATE, new Comparator<Issue>() {

			@Override
			public int compare(Issue o1, Issue o2) {
				return o1.getSubmitDate().compareTo(o2.getSubmitDate());
			}
			
		}));
		ORDER_FIELDS.put(NAME_PROJECT, new SortField<Issue>(PROP_PROJECT, new Comparator<Issue>() {

			@Override
			public int compare(Issue o1, Issue o2) {
				return o1.getProject().getId().compareTo(o2.getProject().getId());
			}
			
		}));
		ORDER_FIELDS.put(NAME_UPDATE_DATE, new SortField<Issue>(PROP_LAST_UPDATE + "." + LastUpdate.PROP_DATE, new Comparator<Issue>() {

			@Override
			public int compare(Issue o1, Issue o2) {
				return o1.getLastUpdate().getDate().compareTo(o2.getLastUpdate().getDate());
			}
			
		}));	
	}
	
	private static ThreadLocal<Stack<Issue>> stack =  new ThreadLocal<Stack<Issue>>() {

		@Override
		protected Stack<Issue> initialValue() {
			return new Stack<Issue>();
		}
	
	};
	
	@Column(nullable=false)
	private String state;
	
	@Column(nullable=false)
	private int stateOrdinal;
	
	@Column(nullable=false, length=MAX_TITLE_LEN)
	private String title;
	
	@Column(length=MAX_DESCRIPTION_LEN)
	private String description;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(nullable=false)
	private Project numberScope;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(nullable=false)
	private Project project;
	
	@OneToMany(mappedBy="issue", cascade=CascadeType.REMOVE)
	private Collection<IssueSchedule> schedules = new ArrayList<>();
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(nullable=false)
	private User submitter;
	
	@Column(nullable=false)
	private Date submitDate = new Date();
	
	private int voteCount;
	
	private int commentCount;
	
	@Column(nullable=false)
	private String uuid = UUID.randomUUID().toString();

	private long number;
	
	private String threadingReference;
	
	@Embedded
	private LastUpdate lastUpdate;
	
	// used for title search in markdown editor
	@Column(nullable=false)
	@JsonIgnore
	private String noSpaceTitle;
	
	private boolean confidential;
	
	@OneToMany(mappedBy="issue", cascade=CascadeType.REMOVE)
	private Collection<IssueField> fields = new ArrayList<>();
	
	@OneToMany(mappedBy="issue", cascade=CascadeType.REMOVE)
	private Collection<IssueComment> comments = new ArrayList<>();
	
	@OneToMany(mappedBy="issue", cascade=CascadeType.REMOVE)
	private Collection<IssueChange> changes = new ArrayList<>();
	
	@OneToMany(mappedBy="issue", cascade=CascadeType.REMOVE)
	private Collection<IssueVote> votes = new ArrayList<>();
	
	@OneToMany(mappedBy="issue", cascade=CascadeType.REMOVE)
	private Collection<IssueWatch> watches = new ArrayList<>();
	
	@OneToMany(mappedBy="issue", cascade=CascadeType.REMOVE)
	@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
	private Collection<IssueAuthorization> authorizations = new ArrayList<>();
	
	@OneToMany(mappedBy=IssueLink.PROP_TARGET, cascade=CascadeType.REMOVE)
	private Collection<IssueLink> sourceLinks = new ArrayList<>();
	
	@OneToMany(mappedBy=IssueLink.PROP_SOURCE, cascade=CascadeType.REMOVE)
	private Collection<IssueLink> targetLinks = new ArrayList<>();
	
	private transient List<FixCommit> commits;
	
	private transient List<PullRequest> pullRequests;
	
	private transient Map<String, Input> fieldInputs;
	
	private transient Collection<User> participants;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		stateOrdinal = getIssueSetting().getStateOrdinal(state);
	}

	public int getStateOrdinal() {
		return stateOrdinal;
	}

	public void setStateOrdinal(int stateOrdinal) {
		this.stateOrdinal = stateOrdinal;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = StringUtils.abbreviate(title, MAX_TITLE_LEN);
		noSpaceTitle = StringUtils.deleteWhitespace(this.title);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = StringUtils.abbreviate(description, MAX_DESCRIPTION_LEN);
	}

	public boolean isConfidential() {
		return confidential;
	}

	public void setConfidential(boolean confidential) {
		this.confidential = confidential;
	}

	public Project getNumberScope() {
		return numberScope;
	}

	public void setNumberScope(Project numberScope) {
		this.numberScope = numberScope;
	}

	@Override
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getUUID() {
		return uuid;
	}

	public void setUUID(String uuid) {
		this.uuid = uuid;
	}

	@Nullable
	public String getThreadingReference() {
		return threadingReference;
	}

	public void setThreadingReference(String threadingReference) {
		this.threadingReference = threadingReference;
	}
	
	public String getEffectiveThreadingReference() {
		String threadingReference = getThreadingReference();
		if (threadingReference == null)
			threadingReference = "<" + getUUID() + "@onedev>";
		return threadingReference;
	}
	
	@Override
	public long getNumber() {
		return number;
	}
	
	@Override
	public String getType() {
		return "issue";
	}
	
	public void setNumber(long number) {
		this.number = number;
	}

	public LastUpdate getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(LastUpdate lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public User getSubmitter() {
		return submitter;
	}

	public void setSubmitter(User submitter) {
		this.submitter = submitter;
	}

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public Collection<IssueSchedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(Collection<IssueSchedule> schedules) {
		this.schedules = schedules;
	}

	public Collection<IssueComment> getComments() {
		return comments;
	}

	public void setComments(Collection<IssueComment> comments) {
		this.comments = comments;
	}

	public Collection<IssueChange> getChanges() {
		return changes;
	}

	public void setChanges(Collection<IssueChange> changes) {
		this.changes = changes;
	}

	public Collection<IssueVote> getVotes() {
		return votes;
	}

	public void setVotes(Collection<IssueVote> votes) {
		this.votes = votes;
	}

	@Override
	public Collection<IssueWatch> getWatches() {
		return watches;
	}

	public void setWatches(Collection<IssueWatch> watches) {
		this.watches = watches;
	}
	
	@Override
	public EntityWatch getWatch(User user, boolean createIfNotExist) {
		if (createIfNotExist) {
			IssueWatch watch = (IssueWatch) super.getWatch(user, false);
			if (watch == null) {
				watch = new IssueWatch();
				watch.setIssue(this);
				watch.setUser(user);
				getWatches().add(watch);
			}
			return watch;
		} else {
			return super.getWatch(user, false);
		}
	}

	public Collection<IssueAuthorization> getAuthorizations() {
		return authorizations;
	}

	public void setAuthorizations(Collection<IssueAuthorization> authorizations) {
		this.authorizations = authorizations;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public Collection<IssueField> getFields() {
		return fields;
	}

	public void setFields(Collection<IssueField> fields) {
		this.fields = fields;
	}
	
	public Collection<IssueLink> getSourceLinks() {
		return sourceLinks;
	}
	
	public void setSourceLinks(Collection<IssueLink> sourceLinks) {
		this.sourceLinks = sourceLinks;
	}

	public Collection<IssueLink> getTargetLinks() {
		return targetLinks;
	}

	public void setTargetLinks(Collection<IssueLink> targetLinks) {
		this.targetLinks = targetLinks;
	}
	
	public Collection<IssueLink> getLinks() {
		List<IssueLink> links = new ArrayList<>();
		links.addAll(sourceLinks);
		links.addAll(targetLinks);
		return links;
	}
	
	public boolean isVisitedAfter(Date date) {
		User user = SecurityUtils.getUser();
		if (user != null) {
			Date visitDate = OneDev.getInstance(UserInfoManager.class).getIssueVisitDate(user, this);
			return visitDate != null && visitDate.getTime()>date.getTime();
		} else {
			return true;
		}
	}
	
	public Collection<String> getFieldNames() {
		return getFields().stream().map(it->it.getName()).collect(Collectors.toSet());
	}
	
	public Map<String, Input> getFieldInputs() {
		if (fieldInputs == null) {
			fieldInputs = new LinkedHashMap<>();
	
			Map<String, List<IssueField>> fieldMap = new HashMap<>(); 
			for (IssueField field: getFields()) {
				List<IssueField> fieldsOfName = fieldMap.get(field.getName());
				if (fieldsOfName == null) {
					fieldsOfName = new ArrayList<>();
					fieldMap.put(field.getName(), fieldsOfName);
				}
				fieldsOfName.add(field);
			}
			for (FieldSpec fieldSpec: getIssueSetting().getFieldSpecs()) {
				String fieldName = fieldSpec.getName();
				List<IssueField> fields = fieldMap.get(fieldName);
				if (fields != null) {
					Collections.sort(fields, new Comparator<IssueField>() {

						@Override
						public int compare(IssueField o1, IssueField o2) {
							long result = o1.getOrdinal() - o2.getOrdinal();
							if (result > 0)
								return 1;
							else if (result < 0)
								return -1;
							else
								return 0;
						}
						
					});
					String type = fields.iterator().next().getType();
					List<String> values = new ArrayList<>();
					for (IssueField field: fields) {
						if (field.getValue() != null)
							values.add(field.getValue());
					}
					if (!fieldSpec.isAllowMultiple() && values.size() > 1) 
						values = Lists.newArrayList(values.iterator().next());
					fieldInputs.put(fieldName, new Input(fieldName, type, values));
				}
			}
		}
		return fieldInputs;
	}
	
	public static String getWebSocketObservable(Long issueId) {
		return Issue.class.getName() + ":" + issueId;
	}
	
	public static String getListWebSocketObservable(Long projectId) {
		return Issue.class.getName() + ":list:" + projectId;
	}

	@Nullable
	public Object getFieldValue(String fieldName) {
		Input input = getFieldInputs().get(fieldName);
		
		if (input != null) 
			return input.getTypedValue(getIssueSetting().getFieldSpec(fieldName));
		else
			return null;
	}
	
	private GlobalIssueSetting getIssueSetting() {
		return OneDev.getInstance(SettingManager.class).getIssueSetting();
	}
	
	public long getFieldOrdinal(String fieldName, String fieldValue) {
		GlobalIssueSetting issueSetting = OneDev.getInstance(SettingManager.class).getIssueSetting();
		FieldSpec fieldSpec = issueSetting.getFieldSpec(fieldName);
		if (fieldSpec != null) 
			return fieldSpec.getOrdinal(fieldValue);
		else 
			return -1;
	}
	
	public Serializable getFieldBean(Class<?> fieldBeanClass, boolean withDefaultValue) {
		BeanDescriptor beanDescriptor = new BeanDescriptor(fieldBeanClass);
		Serializable fieldBean = (Serializable) beanDescriptor.newBeanInstance();

		for (List<PropertyDescriptor> groupProperties: beanDescriptor.getProperties().values()) {
			for (PropertyDescriptor property: groupProperties) {
				Input input = getFieldInputs().get(property.getDisplayName());
				if (input != null) {
					FieldSpec fieldSpec = getIssueSetting().getFieldSpec(input.getName());
					property.setPropertyValue(fieldBean, input.getTypedValue(fieldSpec));
				} else if (!withDefaultValue) {
					property.setPropertyValue(fieldBean, null);
				}
			}
		}
		return fieldBean;
	}
	
	public void removeFields(Collection<String> fieldNames) {
		for (Iterator<IssueField> it = getFields().iterator(); it.hasNext();) {
			if (fieldNames.contains(it.next().getName()))
				it.remove();
		}
		fieldInputs = null;
	}
	
	public void setFieldValues(Map<String, Object> fieldValues) {
		for (Map.Entry<String, Object> entry: fieldValues.entrySet())
			setFieldValue(entry.getKey(), entry.getValue());
	}
	
	public void setFieldValue(String fieldName, @Nullable Object fieldValue) {
		for (Iterator<IssueField> it = getFields().iterator(); it.hasNext();) {
			if (fieldName.equals(it.next().getName()))
				it.remove();
		}
		
		FieldSpec fieldSpec = getIssueSetting().getFieldSpec(fieldName);
		if (fieldSpec != null) {
			List<String> strings = fieldSpec.convertToStrings(fieldValue);
			if (!strings.isEmpty()) {
				for (String string: strings) {
					IssueField field = new IssueField();
					field.setIssue(this);
					field.setName(fieldName);
					field.setOrdinal(getFieldOrdinal(fieldName, string));
					field.setType(fieldSpec.getType());
					field.setValue(string);
					getFields().add(field);
				}
			} else {
				IssueField field = new IssueField();
				field.setIssue(this);
				field.setName(fieldName);
				field.setOrdinal(getFieldOrdinal(fieldName, null));
				field.setType(fieldSpec.getType());
				getFields().add(field);
			}
		}
		fieldInputs = null;
	}

	public boolean isFieldVisible(String fieldName) {
		return isFieldVisible(fieldName, Sets.newHashSet());
	}
	
	public Collection<User> getParticipants() {
		if (participants == null) {
			participants = new LinkedHashSet<>();
			if (getSubmitter() != null)
				participants.add(getSubmitter());
			UserManager userManager = OneDev.getInstance(UserManager.class);
			for (IssueField field: getFields()) {
				if (field.getType().equals(InputSpec.USER)) {
					if (field.getValue() != null) {
						User user = userManager.findByName(field.getValue());
						if (user != null)
							participants.add(user);
					}
				} else if (field.getType().equals(InputSpec.GROUP)) {
					if (field.getValue() != null) {
						Group group = OneDev.getInstance(GroupManager.class).find(field.getValue());
						if (group != null)
							participants.addAll(group.getMembers());
					}
				}
			}
			for (IssueComment comment: getComments()) {
				if (comment.getUser() != null)
					participants.add(comment.getUser());
			}
			for (IssueChange change: getChanges()) {
				if (change.getUser() != null)
					participants.add(change.getUser());
			}
			participants.remove(userManager.getSystem());
		}
		return participants;
	}

	private boolean isFieldVisible(String fieldName, Set<String> checkedFieldNames) {
		if (!checkedFieldNames.add(fieldName))
			return false;
		
		FieldSpec fieldSpec = getIssueSetting().getFieldSpec(fieldName);
		if (fieldSpec != null) {
			if (fieldSpec.getShowCondition() != null) {
				Input dependentInput = getFieldInputs().get(fieldSpec.getShowCondition().getInputName());
				if (dependentInput != null) {
					if (fieldSpec.getShowCondition().getValueMatcher().matches(dependentInput.getValues()))
						return isFieldVisible(dependentInput.getName(), checkedFieldNames);
					else
						return false;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
	
	public List<PullRequest> getPullRequests() {
		if (pullRequests == null) {
			pullRequests = new ArrayList<>();

			PullRequestInfoManager infoManager = OneDev.getInstance(PullRequestInfoManager.class); 
			Collection<Long> pullRequestIds = new HashSet<>();
			for (FixCommit commit: getCommits()) 
				pullRequestIds.addAll(infoManager.getPullRequestIds(commit.getProject(), commit.getCommit()));		
			
			for (Long requestId: pullRequestIds) {
				PullRequest request = OneDev.getInstance(PullRequestManager.class).get(requestId);
				if (request != null && !pullRequests.contains(request))
					pullRequests.add(request);
			}
			Collections.sort(pullRequests, new Comparator<PullRequest>() {

				@Override
				public int compare(PullRequest o1, PullRequest o2) {
					return o2.getId().compareTo(o1.getId());
				}
				
			});
		}
		return pullRequests;
	}
	
	public List<FixCommit> getCommits() {
		if (commits == null) {
			commits = new ArrayList<>();
			CommitInfoManager commitInfoManager = OneDev.getInstance(CommitInfoManager.class); 
			
			getProject().getTree().stream().filter(it->it.isCodeManagement()).forEach(it-> {
				for (ObjectId commitId: commitInfoManager.getFixCommits(it, getId())) {
					RevCommit commit = it.getRevCommit(commitId, false);
					if (commit != null)
						commits.add(new FixCommit(it, commit));
				}
			});
			
			Collections.sort(commits, new Comparator<FixCommit>() {
	
				@Override
				public int compare(FixCommit o1, FixCommit o2) {
					return o2.getCommit().getCommitTime() - o1.getCommit().getCommitTime();
				}
				
			});
		}
		return commits;		
	}

	@Override
	public Project getAttachmentProject() {
		return project;
	}
	
	@Override
	public String getAttachmentGroup() {
		return uuid;
	}

	public ProjectScopedNumber getFQN() {
		return new ProjectScopedNumber(getProject(), getNumber());
	}
	
	public String getNumberAndTitle() {
		return "#" + getNumber() + " - " + getTitle();
	}
	
	public Collection<Milestone> getMilestones() {
		return getSchedules().stream().map(it->it.getMilestone()).collect(Collectors.toList());
	}
	
	public IssueSchedule addSchedule(Milestone milestone) {
		IssueSchedule schedule = new IssueSchedule();
		schedule.setIssue(this);
		schedule.setMilestone(milestone);
		getSchedules().add(schedule);
		return schedule;
	}
	
	@Nullable
	public IssueSchedule removeSchedule(Milestone milestone) {
		for (Iterator<IssueSchedule> it = getSchedules().iterator(); it.hasNext();) {
			IssueSchedule schedule = it.next();
			if (schedule.getMilestone().equals(milestone)) {
				it.remove();
				return schedule;
			}
		}
		return null;
	}
	
	@Nullable
	public Issue findLinkedIssue(LinkSpec spec, boolean opposite) {
		if (spec.getOpposite() != null) {
			if (opposite) {
				for (IssueLink link: getSourceLinks()) {
					if (link.getSpec().equals(spec)) 
						return link.getSource();
				}
				return null;
			} else {
				for (IssueLink link: getTargetLinks()) {
					if (link.getSpec().equals(spec)) 
						return link.getTarget();
				}
				return null;
			}
		} else {
			for (IssueLink link: getLinks()) {
				if (link.getSpec().equals(spec)) 
					return link.getLinked(this);
			}
			return null;
		}
	}
	
	public List<Issue> findLinkedIssues(LinkSpec spec, boolean opposite) {
		if (spec.getOpposite() != null) {
			if (opposite) {
				return getSourceLinks().stream()
						.filter(it->it.getSpec().equals(spec))
						.sorted()
						.map(it->it.getSource())
						.sorted(spec.getOpposite().getParsedIssueQuery(getProject()))
						.collect(Collectors.toList());
			} else {
				return getTargetLinks().stream()
						.filter(it->it.getSpec().equals(spec))
						.sorted()
						.map(it->it.getTarget())
						.sorted(spec.getParsedIssueQuery(getProject()))
						.collect(Collectors.toList());
			}
		} else {
			return getLinks().stream()
					.filter(it->it.getSpec().equals(spec))
					.sorted()
					.map(it->it.getLinked(this))
					.sorted(spec.getParsedIssueQuery(getProject()))
					.collect(Collectors.toList());
		}
	}
	
	@Nullable
	public static Issue get() {
		if (!stack.get().isEmpty()) { 
			return stack.get().peek();
		} else {
			ComponentContext componentContext = ComponentContext.get();
			if (componentContext != null) {
				IssueAware issueAware = WicketUtils.findInnermost(componentContext.getComponent(), IssueAware.class);
				if (issueAware != null) 
					return issueAware.getIssue();
			}
			return null;
		}
	}
	
	public static void push(@Nullable Issue issue) {
		stack.get().push(issue);
	}

	public static void pop() {
		stack.get().pop();
	}
	
	public static class FixCommit {
		
		private final Project project;
		
		private final RevCommit commit;
		
		public FixCommit(Project project, RevCommit commit) {
			this.project = project;
			this.commit = commit;
		}

		public Project getProject() {
			return project;
		}

		public RevCommit getCommit() {
			return commit;
		}
		
	}
	
}
