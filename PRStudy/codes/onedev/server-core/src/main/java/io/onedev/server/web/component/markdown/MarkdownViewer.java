package io.onedev.server.web.component.markdown;

import static org.apache.wicket.ajax.attributes.CallbackParameter.explicit;

import java.util.List;

import javax.annotation.Nullable;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.feedback.FencedFeedbackPanel;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.GenericPanel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.request.IRequestParameters;
import org.apache.wicket.request.cycle.RequestCycle;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.revwalk.RevCommit;
import org.hibernate.StaleStateException;
import org.unbescape.html.HtmlEscape;
import org.unbescape.javascript.JavaScriptEscape;

import io.onedev.commons.loader.AppLoader;
import io.onedev.commons.utils.StringUtils;
import io.onedev.server.OneDev;
import io.onedev.server.entitymanager.BuildManager;
import io.onedev.server.entitymanager.IssueManager;
import io.onedev.server.entitymanager.PullRequestManager;
import io.onedev.server.entitymanager.SettingManager;
import io.onedev.server.entitymanager.UserManager;
import io.onedev.server.markdown.MarkdownManager;
import io.onedev.server.model.Build;
import io.onedev.server.model.Issue;
import io.onedev.server.model.Project;
import io.onedev.server.model.PullRequest;
import io.onedev.server.model.User;
import io.onedev.server.security.SecurityUtils;
import io.onedev.server.util.ColorUtils;
import io.onedev.server.util.DateUtils;
import io.onedev.server.web.asset.emoji.Emojis;
import io.onedev.server.web.asset.lozad.LozadResourceReference;
import io.onedev.server.web.avatar.AvatarManager;
import io.onedev.server.web.behavior.AbstractPostAjaxBehavior;
import io.onedev.server.web.component.build.status.BuildStatusIcon;
import io.onedev.server.web.component.svg.SpriteImage;
import io.onedev.server.web.page.project.ProjectPage;
import io.onedev.server.web.page.project.blob.render.BlobRenderContext;

@SuppressWarnings("serial")
public class MarkdownViewer extends GenericPanel<String> {

	private static final String TASK_CHECKED = "taskchecked";
	
	private static final String REFERENCE_TYPE = "referenceType";
	
	private static final String REFERENCE_ID = "referenceId";
	
	private static final String SUGGESTION_ACTION = "suggestionAction";
	
	private static final String SUGGESTION_CONTENT = "suggestionContent";
	
	private final ContentVersionSupport contentVersionSupport;
	
	private long lastContentVersion;
	
	private AbstractPostAjaxBehavior taskBehavior;
	
	private AbstractPostAjaxBehavior referenceBehavior;
	
	private AbstractPostAjaxBehavior suggestionBehavior;
	
	public MarkdownViewer(String id, IModel<String> model, @Nullable ContentVersionSupport contentVersionSupport) {
		super(id, model);
		this.contentVersionSupport = contentVersionSupport;
		if (contentVersionSupport != null)
			lastContentVersion = contentVersionSupport.getVersion();
	}
	
	protected BlobRenderContext getRenderContext() {
		return null;
	}
	
	@Nullable
	private String renderMarkdown() {
		String markdown = getModelObject();
		if (markdown != null) {
			Project project = null;
			if (getPage() instanceof ProjectPage)
				project = ((ProjectPage) getPage()).getProject(); 
			MarkdownManager manager = AppLoader.getInstance(MarkdownManager.class);
			return manager.process(manager.render(markdown), project, 
					getRenderContext(), getSuggestionSupport(), false);
		} else {
			return null;
		}
	}
	
	@Override
	protected void onInitialize() {
		super.onInitialize();

		FencedFeedbackPanel feedback = new FencedFeedbackPanel("feedback", this);
		feedback.setOutputMarkupPlaceholderTag(true);
		add(feedback);
		
		if (RequestCycle.get().find(AjaxRequestTarget.class) != null) {
			/*
			 *  Render it as html will cause issue when markdown contains some html
			 *  entities such as "&#27;" and when the component is rendered via ajax. 
			 *  
			 *  This is because some html valid chars are not valid xml chars (the 
			 *  component html will be sent to browser via xml when render via ajax) 
			 */
			add(new WebMarkupContainer("content") {

				@Override
				protected void onComponentTag(ComponentTag tag) {
					super.onComponentTag(tag);
					String rendered = renderMarkdown();
					if (rendered != null)
						tag.put("data-content", rendered);
				}
				
			});
		} else {
			add(new Label("content", new LoadableDetachableModel<String>() {

				@Override
				protected String load() {
					return renderMarkdown();
				}
				
			}).setEscapeModelStrings(false));
		}
		
		add(taskBehavior = new AbstractPostAjaxBehavior() {
			
			@Override
			protected void respond(AjaxRequestTarget target) {
				IRequestParameters params = RequestCycle.get().getRequest().getPostParameters();
				int taskPosition = params.getParameterValue(SourcePositionTrackExtension.DATA_START_ATTRIBUTE).toInt();
				boolean taskChecked = params.getParameterValue(TASK_CHECKED).toBoolean();
				String markdown = HtmlEscape.unescapeHtml(getComponent().getDefaultModelObjectAsString());
				String beforeTask = markdown.substring(0, taskPosition);
				String fromTask = markdown.substring(taskPosition);
				String beforeBracket = StringUtils.substringBefore(fromTask, "[");
				String afterBracket = StringUtils.substringAfter(fromTask, "]");
				String taskStatus = taskChecked?"x":" ";
				markdown = beforeTask + beforeBracket + "[" + taskStatus + "]" + afterBracket;

				try {
					if (contentVersionSupport.getVersion() != lastContentVersion)
						throw new StaleStateException("");
					setDefaultModelObject(markdown);
				} catch (StaleStateException e) {
					warn("Some one changed the content you are editing. The content has now been reloaded, "
							+ "please try again.");
				}
				target.add(MarkdownViewer.this);
				lastContentVersion = contentVersionSupport.getVersion();
			}
			
		});
		
		add(referenceBehavior = new AbstractPostAjaxBehavior() {

			@Override
			protected void respond(AjaxRequestTarget target) {
				IRequestParameters params = RequestCycle.get().getRequest().getPostParameters();
				String referenceType = params.getParameterValue(REFERENCE_TYPE).toString("");
				String referenceId = params.getParameterValue(REFERENCE_ID).toString();
				switch (referenceType) {
				case "issue":
					Issue issue = OneDev.getInstance(IssueManager.class).findByFQN(referenceId);
					// check permission here as issue project may not be the same as current project
					if (issue != null && SecurityUtils.canAccess(issue)) {
						String color = OneDev.getInstance(SettingManager.class).getIssueSetting().getStateSpec(issue.getState()).getColor();
						String script = String.format("onedev.server.markdown.renderIssueTooltip('%s', '%s', '%s', '%s');", 
								Emojis.getInstance().apply(JavaScriptEscape.escapeJavaScript(issue.getTitle())), 
								JavaScriptEscape.escapeJavaScript(issue.getState()), 
								ColorUtils.isLight(color)? "black": "white", color);
						target.appendJavaScript(script);
					} else {
						target.appendJavaScript("onedev.server.markdown.renderIssueTooltip();");
					}
					break;
				case "pull request":
					PullRequest request = OneDev.getInstance(PullRequestManager.class).findByFQN(referenceId);
					// check permission here as target project may not be the same as current project
					if (request != null && SecurityUtils.canReadCode(request.getTargetProject())) {
 	 					String status = request.getStatus().toString();
						String statusCss;
						switch (request.getStatus()) {
						case OPEN:
							statusCss = "badge-warning";
							break;
						case MERGED:
							statusCss = "badge-success";
							break;
						default:
							statusCss = "badge-danger";
						}
						
						String script = String.format("onedev.server.markdown.renderPullRequestTooltip('%s', '%s', '%s');", 
								Emojis.getInstance().apply(JavaScriptEscape.escapeJavaScript(request.getTitle())), 
								status, statusCss);
						target.appendJavaScript(script);
					} else {
						target.appendJavaScript("onedev.server.markdown.renderPullRequestTooltip();");
					}
					break;
				case "build":
					Build build = OneDev.getInstance(BuildManager.class).find(referenceId);
					// check permission here as build project may not be the same as current project
					if (build != null && SecurityUtils.canAccess(build)) {
						String iconHref = SpriteImage.getVersionedHref(BuildStatusIcon.getIconHref(build.getStatus()));
						String iconCss = BuildStatusIcon.getIconClass(build.getStatus());
						
						String title = build.getJobName();
						if (build.getVersion() != null)
							title += " : " + build.getVersion();
						String script = String.format("onedev.server.markdown.renderBuildTooltip('%s', '%s', '%s');", 
								JavaScriptEscape.escapeJavaScript(title), iconHref, iconCss);
						target.appendJavaScript(script);
					} else {
						target.appendJavaScript("onedev.server.markdown.renderBuildTooltip();");
					}
					break;
				case "user":
					User user = OneDev.getInstance(UserManager.class).findByName(referenceId);
					if (user != null) {
						String avatarUrl = OneDev.getInstance(AvatarManager.class).getAvatarUrl(user);
						String script = String.format("onedev.server.markdown.renderUserTooltip('%s', '%s')", 
								JavaScriptEscape.escapeJavaScript(avatarUrl), 
								JavaScriptEscape.escapeJavaScript(user.getDisplayName()));
						target.appendJavaScript(script);
					}
					break;
				case "commit":
					ProjectPage page = (ProjectPage) getPage();
					RevCommit commit = page.getProject().getRevCommit(ObjectId.fromString(referenceId), false);
					if (commit != null && SecurityUtils.canReadCode(page.getProject())) {
						String script = String.format("onedev.server.markdown.renderCommitTooltip('%s', '%s', '%s');", 
								JavaScriptEscape.escapeJavaScript(commit.getAuthorIdent().getName()), 
								JavaScriptEscape.escapeJavaScript(DateUtils.formatAge(commit.getCommitterIdent().getWhen())), 
								JavaScriptEscape.escapeJavaScript(commit.getFullMessage()));
						target.appendJavaScript(script);
					} else {
						target.appendJavaScript("onedev.server.markdown.renderCommitTooltip();");
					}
					break;
				default:
					throw new RuntimeException("Unrecognized reference type: " + referenceType);
				}
			}
			
		});
		
		add(suggestionBehavior = new AbstractPostAjaxBehavior() {

			@Override
			protected void respond(AjaxRequestTarget target) {
				IRequestParameters params = RequestCycle.get().getRequest().getPostParameters();
				String suggestionAction = params.getParameterValue(SUGGESTION_ACTION).toString();
				String suggestionContent = params.getParameterValue(SUGGESTION_CONTENT).toString();
				List<String> suggestion = StringUtils.splitToLines(suggestionContent);
				switch (suggestionAction) {
				case "apply":
					getSuggestionSupport().getApplySupport().applySuggestion(target, suggestion);
					break;
				case "addToBatch":
					getSuggestionSupport().getApplySupport().getBatchSupport().addToBatch(target, suggestion);
					break;
				case "removeFromBatch":
					getSuggestionSupport().getApplySupport().getBatchSupport().removeFromBatch(target);
					break;
				default:
					throw new RuntimeException("Unrecognized suggestion action: " + suggestionAction);
				}
			}
			
		});
		
		setOutputMarkupId(true);
	}
	
	@Nullable
	protected SuggestionSupport getSuggestionSupport() {
		return null;
	}
	
	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		
		response.render(JavaScriptHeaderItem.forReference(new LozadResourceReference()));
		response.render(JavaScriptHeaderItem.forReference(new MarkdownResourceReference()));
		
		CharSequence taskCallback = taskBehavior.getCallbackFunction(
				explicit(SourcePositionTrackExtension.DATA_START_ATTRIBUTE), 
				explicit(TASK_CHECKED));
		
		CharSequence referenceCallback = referenceBehavior.getCallbackFunction(
				explicit(REFERENCE_TYPE), explicit(REFERENCE_ID));
		
		CharSequence suggestionCallback = suggestionBehavior.getCallbackFunction(
				explicit(SUGGESTION_ACTION), explicit(SUGGESTION_CONTENT));
		
		String script = String.format("onedev.server.markdown.onViewerDomReady('%s', %s, '%s', %s, %s);", 
				getMarkupId(), 
				contentVersionSupport!=null?taskCallback:"undefined", 
				SourcePositionTrackExtension.DATA_START_ATTRIBUTE, 
				referenceCallback, suggestionCallback);
		response.render(OnDomReadyHeaderItem.forScript(script));
	}

}
