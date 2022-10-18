package io.onedev.server.web.component.commandpalette;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Splitter;

import io.onedev.server.OneDev;
import io.onedev.server.entitymanager.BuildManager;
import io.onedev.server.entitymanager.IssueManager;
import io.onedev.server.entitymanager.ProjectManager;
import io.onedev.server.entitymanager.SettingManager;
import io.onedev.server.model.Build;
import io.onedev.server.model.Issue;
import io.onedev.server.model.Project;
import io.onedev.server.security.SecurityUtils;
import io.onedev.server.web.page.admin.buildsetting.agent.AgentDetailPage;
import io.onedev.server.web.page.admin.group.GroupPage;
import io.onedev.server.web.page.admin.role.RoleDetailPage;
import io.onedev.server.web.page.admin.user.UserPage;
import io.onedev.server.web.page.project.ProjectPage;
import io.onedev.server.web.page.project.builds.detail.BuildDetailPage;
import io.onedev.server.web.page.project.commits.CommitDetailPage;
import io.onedev.server.web.page.project.issues.boards.IssueBoardsPage;
import io.onedev.server.web.page.project.issues.detail.IssueDetailPage;
import io.onedev.server.web.page.project.issues.milestones.MilestoneDetailPage;
import io.onedev.server.web.page.project.pullrequests.detail.PullRequestDetailPage;

public abstract class ParsedUrl implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private final List<UrlSegment> parsedSegments;
	
	public ParsedUrl(String[] segments) {
		parsedSegments = new ArrayList<>();
		
		StringBuilder builder = new StringBuilder();
		for (String segment: segments) {
			if (segment.contains("$") || segment.contains("#")) {
				if (builder.length() != 0) {
					parsedSegments.add(new FixedSegment(builder.toString()));
					builder = new StringBuilder();
				}
				boolean optional = segment.contains("#");
				String paramName = StringUtils.strip(segment, "$#{}");
				switch (paramName) {
				case ProjectPage.PARAM_PROJECT:
					parsedSegments.add(new ProjectParam(optional));
					break;
				case IssueDetailPage.PARAM_ISSUE:
					parsedSegments.add(new IssueParam(optional));
					break;
				case PullRequestDetailPage.PARAM_REQUEST:
					parsedSegments.add(new PullRequestParam(optional));
					break;
				case BuildDetailPage.PARAM_BUILD:
					parsedSegments.add(new BuildParam(optional));
					break;
				case UserPage.PARAM_USER:
					parsedSegments.add(new UserParam(optional));
					break;
				case GroupPage.PARAM_GROUP:
					parsedSegments.add(new GroupParam(optional));
					break;
				case RoleDetailPage.PARAM_ROLE:
					parsedSegments.add(new RoleParam(optional));
					break;
				case RevisionAndPathParam.NAME:
					parsedSegments.add(new RevisionAndPathParam(optional));
					break;
				case CommitDetailPage.PARAM_COMMIT:
					parsedSegments.add(new CommitParam(optional));
					break;
				case IssueBoardsPage.PARAM_BOARD:
					parsedSegments.add(new BoardParam(optional));
					break;
				case AgentDetailPage.PARAM_AGENT:
					parsedSegments.add(new AgentParam(optional));
					break;
				case MilestoneDetailPage.PARAM_MILESTONE:
					parsedSegments.add(new MilestoneParam(optional));
					break;
				default:
					throw new IgnoredUrlParam(paramName);
				}
			} else {
				if (builder.length() != 0)
					builder.append("/");
				builder.append(segment);
			}
		}
		if (builder.length() != 0)
			parsedSegments.add(new FixedSegment(builder.toString()));
	}
	
	private boolean isApplicable(Project project, String path) {
		List<String> segments = Splitter.on("/").splitToList(path);
		String segment1 = segments.get(0);
		String segment2 = segments.size()>1? segments.get(1): "";
		switch (segment1) {
		case "settings":
			if (SecurityUtils.canManage(project)) {
				if (segment2.equals("service-desk")) {
					return OneDev.getInstance(SettingManager.class).getServiceDeskSetting() != null 
							&& project.isIssueManagement();
				} else {
					return true;
				}
			} else {
				return false;
			}
		case "files":
		case "commits":
		case "pulls":
		case "compare":
		case "branches":
		case "tags":
		case "code-comments":
			return project.isCodeManagement() && SecurityUtils.canReadCode(project);
		case "stats":
			switch (segment2) {
			case "contribs":
			case "lines":
				return project.isCodeManagement() && SecurityUtils.canReadCode(project);
			default:
				return true;
			}
		case "boards":
		case "issues":
			return project.isIssueManagement();
		case "milestones":
			if (project.isIssueManagement()) {
				if (segment2.equals("new"))
					return SecurityUtils.canManageIssues(project);
				else
					return true;
			} else {
				return false;
			}
		case "builds":
			return project.isCodeManagement();
		default:
			return true;
		}
	}
	
	public Map<String, SuggestionContent> suggest(String matchWith, int count) {
		Map<String, SuggestionContent> suggestions = new LinkedHashMap<>();
		Map<String, String> paramValues = new HashMap<>();
		if (getProject() != null) {
			paramValues.put(ProjectPage.PARAM_PROJECT, String.valueOf(getProject().getId()));
			if (matchWith.startsWith("/"))
				return suggestions;
		} else {
			matchWith = StringUtils.stripStart(matchWith, "/");
		}
		
		int index = 0;
		List<String> segments = new ArrayList<>();
		for (UrlSegment segment: parsedSegments) {
			boolean hasMoreSegments = parsedSegments.size() > index+1;
			boolean hasMoreRequiredSegments = false;
			for (int i=index+1; i<parsedSegments.size(); i++) {
				UrlSegment leftOverSegment = parsedSegments.get(i);
				if (leftOverSegment instanceof FixedSegment 
						|| !((ParamSegment) leftOverSegment).isOptional()) {
					hasMoreRequiredSegments = true;
					break;
				}
			}
			
			if (segment instanceof FixedSegment) {
				FixedSegment fixedSegment = (FixedSegment) segment;
				String path = fixedSegment.getPath();

				if ((index == 0 && getProject() != null 
						|| index != 0 && parsedSegments.get(index-1) instanceof ProjectParam)
					&& !isApplicable(getProject(paramValues), path)) { 
						break;
				}
				
				if (matchWith.startsWith(path)) { 
					if (matchWith.length() == path.length()) {
						segments.add(path);
						addSuggestion(suggestions, segments, hasMoreSegments, hasMoreRequiredSegments);
						break;
					} else if (matchWith.charAt(path.length()) == '/') {
						matchWith = matchWith.substring(path.length()+1);
						segments.add(path);
					} else {
						suggestions.clear();
						break;
					}
				} else if (path.contains(matchWith)) {
					segments.add(fixedSegment.getPath());
					addSuggestion(suggestions, segments, hasMoreSegments, hasMoreRequiredSegments);
					break;
				} else {
					suggestions.clear();
					break;
				}
			} else {
				ParamSegment paramSegment = (ParamSegment) segment;
				String paramValue = StringUtils.substringBefore(matchWith, "/");
				if (paramSegment.isExactMatch(paramValue, paramValues)) {
					paramValues.put(paramSegment.getName(), paramValue);
					segments.add(paramValue);
					if (matchWith.contains("/")) {
						matchWith = StringUtils.substringAfter(matchWith, "/");
					} else {
						addSuggestion(suggestions, segments, hasMoreSegments, hasMoreRequiredSegments);
						break;
					}
				} else {
					Map<String, String> paramSuggestions = paramSegment.suggest(matchWith, paramValues, count);
					for (Map.Entry<String, String> entry: paramSuggestions.entrySet()) {
						if (entry.getValue() != null) {
							List<String> segmentsCopy = new ArrayList<>(segments);
							segmentsCopy.add(entry.getValue());
							String joined = StringUtils.join(segmentsCopy, "/");
							String url = !hasMoreRequiredSegments? makeAbsoluteIfNecessary(joined): null;
							String searchBase = hasMoreSegments? makeAbsoluteIfNecessary(joined + "/"): null;
							suggestions.put(entry.getKey(), new SuggestionContent(url, searchBase));
						} else {
							suggestions.put(entry.getKey(), null);
						}
					}
					break;
				}
			}
			index++;
		}
		
		if (index == parsedSegments.size() && matchWith.length() != 0)
			suggestions.clear();
		
		return suggestions;
	}
	
	private void addSuggestion(Map<String, SuggestionContent> suggestions, List<String> segments, 
			boolean hasMoreSegments, boolean hasMoreRequiredSegments) {
		String joined = StringUtils.join(segments, "/");
		
		String url = !hasMoreRequiredSegments? makeAbsoluteIfNecessary(joined): null;
		String searchBase = hasMoreSegments? makeAbsoluteIfNecessary(joined + "/"): null;
		
		suggestions.put(makeAbsoluteIfNecessary(joined), new SuggestionContent(url, searchBase));
	}
	
	private String makeAbsoluteIfNecessary(String url) {
		if (getProject() != null)
			return url;
		else
			return "/" + url;
	}
	
	@Nullable
	protected abstract Project getProject();
	
	@Override
	public String toString() {
		return StringUtils.join(parsedSegments, "/");
	}
	
	static Project getProject(Map<String, String> paramValues) {
		Long projectId = Long.valueOf(paramValues.get(ProjectPage.PARAM_PROJECT));
		return OneDev.getInstance(ProjectManager.class).load(projectId);
	}
	
	static Build getBuild(Map<String, String> paramValues) {
		Long buildNumber = Long.valueOf(paramValues.get(BuildDetailPage.PARAM_BUILD));
		return OneDev.getInstance(BuildManager.class).find(getProject(paramValues), buildNumber);
	}
	
	static Issue getIssue(Map<String, String> paramValues) {
		Long issueNumber = Long.valueOf(paramValues.get(IssueDetailPage.PARAM_ISSUE));
		return OneDev.getInstance(IssueManager.class).find(getProject(paramValues), issueNumber);
	}
	
}
