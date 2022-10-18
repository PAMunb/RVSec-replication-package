package io.onedev.server.web.page.project.blob.render.source;

import static org.apache.wicket.ajax.attributes.CallbackParameter.explicit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.annotation.Nullable;
import javax.servlet.http.Cookie;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxChannel;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.attributes.AjaxRequestAttributes;
import org.apache.wicket.ajax.attributes.AjaxRequestAttributes.Method;
import org.apache.wicket.ajax.form.OnChangeAjaxBehavior;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.behavior.AttributeAppender;
import org.apache.wicket.core.request.handler.IPartialPageRequestHandler;
import org.apache.wicket.extensions.markup.html.repeater.tree.ITreeProvider;
import org.apache.wicket.extensions.markup.html.repeater.tree.NestedTree;
import org.apache.wicket.extensions.markup.html.repeater.tree.theme.HumanTheme;
import org.apache.wicket.feedback.FencedFeedbackPanel;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.head.OnLoadHeaderItem;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Fragment;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.IRequestParameters;
import org.apache.wicket.request.cycle.RequestCycle;
import org.apache.wicket.request.http.WebRequest;
import org.apache.wicket.request.http.WebResponse;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.eclipse.jgit.lib.FileMode;
import org.eclipse.jgit.revwalk.RevCommit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.unbescape.html.HtmlEscape;
import org.unbescape.javascript.JavaScriptEscape;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Preconditions;

import io.onedev.commons.jsymbol.Symbol;
import io.onedev.commons.jsymbol.SymbolExtractor;
import io.onedev.commons.jsymbol.SymbolExtractorRegistry;
import io.onedev.commons.utils.LinearRange;
import io.onedev.commons.utils.PlanarRange;
import io.onedev.commons.utils.StringUtils;
import io.onedev.server.OneDev;
import io.onedev.server.codequality.CodeProblem;
import io.onedev.server.codequality.CodeProblemContribution;
import io.onedev.server.codequality.CoverageStatus;
import io.onedev.server.codequality.LineCoverageContribution;
import io.onedev.server.entitymanager.BuildManager;
import io.onedev.server.entitymanager.CodeCommentManager;
import io.onedev.server.entitymanager.CodeCommentReplyManager;
import io.onedev.server.entitymanager.CodeCommentStatusChangeManager;
import io.onedev.server.git.BlameBlock;
import io.onedev.server.git.Blob;
import io.onedev.server.git.BlobIdent;
import io.onedev.server.git.GitUtils;
import io.onedev.server.git.command.BlameCommand;
import io.onedev.server.model.Build;
import io.onedev.server.model.CodeComment;
import io.onedev.server.model.CodeCommentReply;
import io.onedev.server.model.CodeCommentStatusChange;
import io.onedev.server.model.Project;
import io.onedev.server.model.User;
import io.onedev.server.model.support.CompareContext;
import io.onedev.server.model.support.Mark;
import io.onedev.server.search.code.CodeSearchManager;
import io.onedev.server.search.code.hit.QueryHit;
import io.onedev.server.security.SecurityUtils;
import io.onedev.server.util.DateUtils;
import io.onedev.server.util.match.MatchScoreProvider;
import io.onedev.server.util.match.MatchScoreUtils;
import io.onedev.server.util.patternset.PatternSet;
import io.onedev.server.web.ajaxlistener.ConfirmLeaveListener;
import io.onedev.server.web.asset.selectbytyping.SelectByTypingResourceReference;
import io.onedev.server.web.behavior.AbstractPostAjaxBehavior;
import io.onedev.server.web.behavior.OnTypingDoneBehavior;
import io.onedev.server.web.behavior.WebSocketObserver;
import io.onedev.server.web.behavior.blamemessage.BlameMessageBehavior;
import io.onedev.server.web.component.codecomment.CodeCommentPanel;
import io.onedev.server.web.component.floating.FloatingPanel;
import io.onedev.server.web.component.link.ViewStateAwareAjaxLink;
import io.onedev.server.web.component.markdown.SuggestionSupport;
import io.onedev.server.web.component.menu.MenuItem;
import io.onedev.server.web.component.modal.ModalLink;
import io.onedev.server.web.component.modal.ModalPanel;
import io.onedev.server.web.component.project.comment.CommentInput;
import io.onedev.server.web.component.sourceformat.OptionChangeCallback;
import io.onedev.server.web.component.sourceformat.SourceFormatPanel;
import io.onedev.server.web.component.suggestionapply.SuggestionApplyBean;
import io.onedev.server.web.component.suggestionapply.SuggestionApplyModalPanel;
import io.onedev.server.web.component.svg.SpriteImage;
import io.onedev.server.web.component.symboltooltip.SymbolTooltipPanel;
import io.onedev.server.web.page.project.blob.render.BlobRenderContext;
import io.onedev.server.web.page.project.blob.render.BlobRenderContext.Mode;
import io.onedev.server.web.page.project.blob.render.BlobRendererer;
import io.onedev.server.web.page.project.blob.render.view.BlobViewPanel;
import io.onedev.server.web.page.project.blob.render.view.Positionable;
import io.onedev.server.web.page.project.blob.search.SearchMenuContributor;
import io.onedev.server.web.page.project.commits.CommitDetailPage;
import io.onedev.server.web.util.AnnotationInfo;
import io.onedev.server.web.util.CodeCommentInfo;
import io.onedev.server.web.util.ProjectAttachmentSupport;
import io.onedev.server.web.util.WicketUtils;

/**
 * Make sure to add only one source view panel per page
 * 
 * @author robin
 *
 */
@SuppressWarnings("serial")
public class SourceViewPanel extends BlobViewPanel implements Positionable, SearchMenuContributor {

	private static final Logger logger = LoggerFactory.getLogger(SourceViewPanel.class);
	
	private static final String COOKIE_OUTLINE = "sourceView.outline";
	
	private static final String COOKIE_OUTLINE_WIDTH = "sourceView.outline.width";
	
	private static final String COOKIE_COMMENT_WIDTH = "sourceView.comment.width";
	
	private final List<Symbol> symbols = new ArrayList<>();
	
	private final IModel<AnnotationInfo> annotationInfoModel = new LoadableDetachableModel<AnnotationInfo>() {

		@Override
		protected AnnotationInfo load() {
			Project project = context.getProject();
			RevCommit commitId = context.getCommit();
			String path = context.getBlobIdent().path;
			
			CodeCommentManager codeCommentManager = OneDev.getInstance(CodeCommentManager.class);
			Map<CodeComment, PlanarRange> comments = codeCommentManager.queryInHistory(project, commitId, path);

			Set<CodeProblem> problems = new HashSet<>();
			Map<Integer, CoverageStatus> coverages = new HashMap<>();
			
			List<String> lines = context.getProject().getBlob(context.getBlobIdent(), true).getText().getLines();
			BuildManager buildManager = OneDev.getInstance(BuildManager.class);
			for (Build build: buildManager.query(project, commitId, null, null, null, new HashMap<>(), null)) {
				for (CodeProblemContribution contribution: OneDev.getExtensions(CodeProblemContribution.class)) {
					for (CodeProblem problem: contribution.getCodeProblems(build, path, context.getProblemReport())) 
						problems.add(problem.normalizeRange(lines));
				}
				for (LineCoverageContribution contribution: OneDev.getExtensions(LineCoverageContribution.class)) { 
					contribution.getLineCoverages(build, path, context.getCoverageReport()).forEach((key, value)->{
						coverages.merge(key, value, (v1, v2)->v1.mergeWith(v2));
					});
				}
			}
			
			return new AnnotationInfo(CodeCommentInfo.groupByLine(comments), CodeProblem.groupByLine(problems), coverages);
		}
		
	};
	
	private WebMarkupContainer commentContainer;
	
	private WebMarkupContainer outline;
	
	private SourceFormatPanel sourceFormat;
	
	private SymbolTooltipPanel symbolTooltip;
	
	private AbstractPostAjaxBehavior ajaxBehavior;
	
	private BlameMessageBehavior blameMessageBehavior;
	
	private final boolean viewPlainMode;
	
	public SourceViewPanel(String id, BlobRenderContext context, boolean viewPlainMode) {
		super(id, context);
		
		this.viewPlainMode = viewPlainMode;
		
		Blob blob = context.getProject().getBlob(context.getBlobIdent(), true);
		
		String blobName = context.getBlobIdent().getName();
		SymbolExtractor<Symbol> extractor = SymbolExtractorRegistry.getExtractor(blobName);
		if (extractor != null) {
			CodeSearchManager searchManager = OneDev.getInstance(CodeSearchManager.class);
			List<Symbol> cachedSymbols = searchManager.getSymbols(context.getProject(), blob.getBlobId(), 
					blob.getIdent().path);
			if (cachedSymbols != null) {
				symbols.addAll(cachedSymbols);
			} else {
				try {
					symbols.addAll(extractor.extract(null, StringUtils.removeBOM(blob.getText().getContent())));
				} catch (Exception e) {
					logger.trace("Can not extract symbols from blob: " + context.getBlobIdent(), e);
				}
			}
		}
		
	}
	
	@Override
	protected WebMarkupContainer newFormats(String id) {
		sourceFormat = new SourceFormatPanel(id, null, new OptionChangeCallback() {
			
			@Override
			public void onOptioneChange(AjaxRequestTarget target) {
				String script = String.format("onedev.server.sourceView.onTabSizeChange(%s);", sourceFormat.getTabSize());
				target.appendJavaScript(script);
			}
			
		}, new OptionChangeCallback() {

			@Override
			public void onOptioneChange(AjaxRequestTarget target) {
				String script = String.format("onedev.server.sourceView.onLineWrapModeChange('%s');", sourceFormat.getLineWrapMode());
				target.appendJavaScript(script);
			}
			
		});
		return sourceFormat;
	}

	@Override
	public WebMarkupContainer newExtraOptions(String id) {
		WebMarkupContainer actions = new Fragment(id, "actionsFrag", this);
		if (hasOutline()) {
			actions.add(new CheckBox("outline", Model.of(isOutlineVisibleInitially())).add(new OnChangeAjaxBehavior() {

				@Override
				protected void updateAjaxAttributes(AjaxRequestAttributes attributes) {
					super.updateAjaxAttributes(attributes);
					attributes.setMethod(Method.POST);
				}

				@Override
				protected void onUpdate(AjaxRequestTarget target) {
					toggleOutline(target);
				}
				
			}));
		} else {
			actions.add(new WebMarkupContainer("outline").setVisible(false));
		}
		return actions;
	}
	
	private void toggleOutline(AjaxRequestTarget target) {
		WebResponse response = (WebResponse) RequestCycle.get().getResponse();
		Cookie cookie;
		if (outline.isVisible()) {
			cookie = new Cookie(COOKIE_OUTLINE, "no");
			outline.setVisible(false);
		} else {
			cookie = new Cookie(COOKIE_OUTLINE, "yes");
			outline.setVisible(true);
		}
		cookie.setPath("/");
		cookie.setMaxAge(Integer.MAX_VALUE);
		response.addCookie(cookie);
		target.add(outline);
		target.appendJavaScript("onedev.server.sourceView.onToggleOutline();");
	}

	private String convertToJson(Object obj) {
		try {
			return OneDev.getInstance(ObjectMapper.class).writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	protected void onInitialize() {
		super.onInitialize();

		commentContainer = new WebMarkupContainer("comment", Model.of((PlanarRange)null)) {
			
			@Override
			public void renderHead(IHeaderResponse response) {
				super.renderHead(response);
				response.render(OnDomReadyHeaderItem.forScript("onedev.server.sourceView.initComment();"));
			}

		};
		
		float commentWidth;
		WebRequest request = (WebRequest) RequestCycle.get().getRequest();
		Cookie cookie = request.getCookie(COOKIE_COMMENT_WIDTH);
		if (cookie != null) 
			commentWidth = Float.parseFloat(cookie.getValue());
		else 
			commentWidth = 300;
		
		commentContainer.add(AttributeAppender.append("style", "width:" + commentWidth + "px"));
		
		if (context.getOpenComment() != null) {
			for (List<CodeCommentInfo> listOfCommentInfos: annotationInfoModel.getObject().getComments().values()) {
				for (CodeCommentInfo commentInfo: listOfCommentInfos) {
					if (commentInfo.getId() == context.getOpenComment().getId()) {
						commentContainer.setDefaultModelObject(commentInfo.getRange());
						break;
					}
				}
			}
		}
		
		WebMarkupContainer head = new WebMarkupContainer("head");
		head.setOutputMarkupId(true);
		commentContainer.add(head);
		
		head.add(new WebMarkupContainer("outdated") {

			@Override
			protected void onConfigure() {
				super.onConfigure();
				setVisible(commentContainer.getDefaultModelObject() == null);
			}
			
		});
		
		head.add(new AjaxLink<Void>("locate") {

			@Override
			public void onClick(AjaxRequestTarget target) {
				PlanarRange range = (PlanarRange) commentContainer.getDefaultModelObject();
				String position = BlobRendererer.getSourcePosition(range);
				position(target, position);
				context.onPosition(target, position);
				target.appendJavaScript(String.format("$('#%s').blur();", getMarkupId()));
			}

			@Override
			protected void onConfigure() {
				super.onConfigure();
				setVisible(commentContainer.getDefaultModelObject() != null);
			}
			
		}.setOutputMarkupId(true));
		
		head.add(new Label("status", new LoadableDetachableModel<String>() {

			@Override
			protected String load() {
				if (context.getOpenComment().isResolved()) {
					return String.format(
							"<svg class='icon text-success mr-1'><use xlink:href='%s'/></svg>", 
							SpriteImage.getVersionedHref("tick-circle-o"));
				} else {
					return String.format(
							"<svg class='icon text-warning mr-1'><use xlink:href='%s'/></svg>", 
							SpriteImage.getVersionedHref("dot"));
				}
			}
			
		}) {

			@Override
			protected void onInitialize() {
				super.onInitialize();
				
				add(AttributeAppender.replace("title", new AbstractReadOnlyModel<String>() {

					@Override
					public String getObject() {
						return context.getOpenComment().isResolved()? "Resolved": "Unresolved";
					}
					
				}));
				
				add(new WebSocketObserver() {
					
					@Override
					public void onObservableChanged(IPartialPageRequestHandler handler) {
						handler.add(component);
					}
					
					@Override
					public Collection<String> getObservables() {
						Set<String> observables = new HashSet<>();
						if (context.getOpenComment() != null)
							observables.add(CodeComment.getWebSocketObservable(context.getOpenComment().getId()));
						return observables;
					}
					
				});
				
				setEscapeModelStrings(false);
			}

			@Override
			protected void onConfigure() {
				super.onConfigure();
				setVisible(context.getOpenComment() != null);
			}
			
		}.setOutputMarkupId(true));
		
		head.add(new AjaxLink<Void>("close") {

			@Override
			protected void updateAjaxAttributes(AjaxRequestAttributes attributes) {
				super.updateAjaxAttributes(attributes);
				attributes.getAjaxCallListeners().add(new ConfirmLeaveListener(commentContainer));
			}
			
			@Override
			public void onClick(AjaxRequestTarget target) {
				closeComment(target);
			}
			
		});
		
		commentContainer.setOutputMarkupPlaceholderTag(true);
		
		if (context.getOpenComment() != null) {
			CodeCommentPanel commentPanel = new CodeCommentPanel("body", context.getOpenComment().getId()) {

				@Override
				protected void onDeleteComment(AjaxRequestTarget target, CodeComment comment) {
					SourceViewPanel.this.onCommentDeleted(target);
				}

				@Override
				protected void onSaveComment(AjaxRequestTarget target, CodeComment comment) {
					OneDev.getInstance(CodeCommentManager.class).save(comment);
					target.add(commentContainer.get("head"));
				}

				@Override
				protected void onSaveCommentReply(AjaxRequestTarget target, CodeCommentReply reply) {
					SourceViewPanel.this.onSaveCommentReply(reply);
				}

				@Override
				protected void onSaveCommentStatusChange(AjaxRequestTarget target, CodeCommentStatusChange change, String note) {
					SourceViewPanel.this.onSaveCommentStatusChange(change, note);
				}
				
				@Override
				protected boolean isContextDifferent(CompareContext compareContext) {
					return SourceViewPanel.this.isContextDifferent(compareContext);
				}

				@Override
				protected SuggestionSupport getSuggestionSupport() {
					return SourceViewPanel.this.getSuggestionSupport(context.getOpenComment().getMark());
				}

			};
			commentContainer.add(commentPanel);
		} else {
			commentContainer.add(new WebMarkupContainer("body"));
			commentContainer.setVisible(false);
		}
		
		add(commentContainer);
		
		add(ajaxBehavior = new AbstractPostAjaxBehavior() {
			
			@Override
			protected void respond(AjaxRequestTarget target) {
				IRequestParameters params = RequestCycle.get().getRequest().getPostParameters();
				switch(params.getParameterValue("action").toString("")) {
				case "openSelectionPopover": 
					PlanarRange range = getRange(params, "param1", "param2", "param3", "param4");
							
					String position = BlobRendererer.getSourcePosition(range);
					String script = String.format("onedev.server.sourceView.openSelectionPopover(%s, '%s', %s);", 
							convertToJson(range), context.getPositionUrl(position), SecurityUtils.getUser()!=null);
					target.appendJavaScript(script);
					break;
				case "addComment": 
					Preconditions.checkNotNull(SecurityUtils.getUser());
					
					range = getRange(params, "param1", "param2", "param3", "param4");
					commentContainer.setDefaultModelObject(range);
					
					Fragment fragment = new Fragment("body", "newCommentFrag", SourceViewPanel.this);
					fragment.setOutputMarkupId(true);
					
					Form<?> form = new Form<Void>("form");
					
					String uuid = UUID.randomUUID().toString();
					
					CommentInput contentInput;
					
					StringBuilder mentions = new StringBuilder();

					for (User user: context.getProject().getAuthors(context.getBlobIdent().path, context.getCommit(), 
							new LinearRange(range.getFromRow(), range.getToRow()))) {
						mentions.append("@").append(user.getName()).append(" ");
					}
					
					Mark mark = new Mark();
					mark.setCommitHash(context.getCommit().name());
					mark.setPath(context.getBlobIdent().path);
					mark.setRange(range);
					
					form.add(contentInput = new CommentInput("content", Model.of(mentions.toString()), true) {

						@Override
						protected ProjectAttachmentSupport getAttachmentSupport() {
							return new ProjectAttachmentSupport(context.getProject(), uuid, 
									SecurityUtils.canManageCodeComments(context.getProject()));
						}

						@Override
						protected SuggestionSupport getSuggestionSupport() {
							return SourceViewPanel.this.getSuggestionSupport(mark);
						}

						@Override
						protected Project getProject() {
							return context.getProject();
						}
						
					});
					contentInput.setRequired(true).setLabel(Model.of("Comment"));
					
					FencedFeedbackPanel feedback = new FencedFeedbackPanel("feedback", form); 
					feedback.setOutputMarkupPlaceholderTag(true);
					form.add(feedback);
					
					form.add(new AjaxLink<Void>("cancel") {

						@Override
						protected void updateAjaxAttributes(AjaxRequestAttributes attributes) {
							super.updateAjaxAttributes(attributes);
							attributes.getAjaxCallListeners().add(new ConfirmLeaveListener(form));
						}
						
						@Override
						public void onClick(AjaxRequestTarget target) {
							clearComment(target);
							target.appendJavaScript("onedev.server.sourceView.clearMark();");
							target.appendJavaScript("$(window).resize();");
							context.onPosition(target, null);
						}
						
					});
					
					form.add(new AjaxButton("save") {

						@Override
						protected void onError(AjaxRequestTarget target, Form<?> form) {
							super.onError(target, form);
							target.add(feedback);
						}

						@Override
						protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
							super.onSubmit(target, form);
							
							CodeComment comment = new CodeComment();
							comment.setUUID(uuid);
							
							comment.setMark(mark);
							comment.setContent(contentInput.getModelObject());
							comment.setUser(SecurityUtils.getUser());
							comment.setProject(context.getProject());
							comment.setCompareContext(getCompareContext());
							
							OneDev.getInstance(CodeCommentManager.class).save(comment);
							
							CodeCommentPanel commentPanel = new CodeCommentPanel(fragment.getId(), comment.getId()) {

								@Override
								protected void onDeleteComment(AjaxRequestTarget target, CodeComment comment) {
									SourceViewPanel.this.onCommentDeleted(target);
								}

								@Override
								protected void onSaveComment(AjaxRequestTarget target, CodeComment comment) {
									OneDev.getInstance(CodeCommentManager.class).save(comment);
									target.add(commentContainer.get("head"));
								}

								@Override
								protected void onSaveCommentReply(AjaxRequestTarget target, CodeCommentReply reply) {
									SourceViewPanel.this.onSaveCommentReply(reply);
								}

								@Override
								protected void onSaveCommentStatusChange(AjaxRequestTarget target, CodeCommentStatusChange change, String note) {
									SourceViewPanel.this.onSaveCommentStatusChange(change, note);
								}
								
								@Override
								protected boolean isContextDifferent(CompareContext compareContext) {
									return SourceViewPanel.this.isContextDifferent(compareContext);
								}

								@Override
								protected SuggestionSupport getSuggestionSupport() {
									return SourceViewPanel.this.getSuggestionSupport(mark);
								}

							};
							commentContainer.replace(commentPanel);
							target.add(commentContainer);

							String script = String.format("onedev.server.sourceView.onCommentAdded(%s);", 
									convertToJson(new CodeCommentInfo(comment, range)));
							target.appendJavaScript(script);
							
							context.onCommentOpened(target, comment, range);
						}

					});
					fragment.add(form);
					commentContainer.replace(fragment);
					commentContainer.setVisible(true);
					target.add(commentContainer);
					context.onAddComment(target, range);
					target.appendJavaScript(String.format("onedev.server.sourceView.onAddComment(%s);", convertToJson(range)));
					break;
				case "openComment":
					Long commentId = params.getParameterValue("param1").toLong();
					range = getRange(params, "param2", "param3", "param4", "param5");
					commentContainer.setDefaultModelObject(range);
					
					CodeCommentPanel commentPanel = new CodeCommentPanel("body", commentId) {

						@Override
						protected void onDeleteComment(AjaxRequestTarget target, CodeComment comment) {
							SourceViewPanel.this.onCommentDeleted(target);
						}

						@Override
						protected void onSaveComment(AjaxRequestTarget target, CodeComment comment) {
							OneDev.getInstance(CodeCommentManager.class).save(comment);
							target.add(commentContainer.get("head"));
						}

						@Override
						protected void onSaveCommentReply(AjaxRequestTarget target, CodeCommentReply reply) {
							SourceViewPanel.this.onSaveCommentReply(reply);
						}

						@Override
						protected void onSaveCommentStatusChange(AjaxRequestTarget target, CodeCommentStatusChange change, String note) {
							SourceViewPanel.this.onSaveCommentStatusChange(change, note);
						}
						
						@Override
						protected boolean isContextDifferent(CompareContext compareContext) {
							return SourceViewPanel.this.isContextDifferent(compareContext);
						}

						@Override
						protected SuggestionSupport getSuggestionSupport() {
							return SourceViewPanel.this.getSuggestionSupport(getComment().getMark());
						}

					};
					commentContainer.replace(commentPanel);
					commentContainer.setVisible(true);
					target.add(commentContainer);
					
					CodeComment comment = OneDev.getInstance(CodeCommentManager.class).load(commentId);
					script = String.format("onedev.server.sourceView.onCommentOpened(%s);", 
							convertToJson(new CodeCommentInfo(comment, range)));
					target.appendJavaScript(script);
					context.onCommentOpened(target, comment, range);
					break;
				case "outlineSearch":
					new ModalPanel(target) {

						@Override
						protected Component newContent(String id) {
							return newOutlineSearchPanel(id, this);
						}
						
					};
					break;
				case "syncOutline": 
					int line = params.getParameterValue("param1").toInt();
					int ch = params.getParameterValue("param2").toInt();
					Symbol closest = null;
					for (Symbol symbol: symbols) {
						PlanarRange scope = symbol.getScope();
						if (scope != null) {
							if (contains(scope, line, ch)) {
								if (closest != null) {
									if (contains(closest.getScope(), scope.getFromRow(), scope.getFromColumn()) 
											&& contains(closest.getScope(), scope.getToRow(), scope.getToColumn())) {
										closest = symbol;
									}
								} else {
									closest = symbol;
								}
							}
						}
					}
					if (closest != null) {
						@SuppressWarnings("unchecked")
						NestedTree<Symbol> tree = (NestedTree<Symbol>) outline.get("body");
						Symbol current = closest;
						while (current != null) {
							tree.expand(current);
							current = current.getParent();
						}
						script = String.format("onedev.server.sourceView.syncOutline('%s');", 
								getSymbolId(symbols, closest));
						target.appendJavaScript(script);
					}
					break;
				}
			}
			
		});
		
		add(blameMessageBehavior = new BlameMessageBehavior() {
			
			@Override
			protected Project getProject() {
				return context.getProject();
			}
		});
		
		outline = new WebMarkupContainer("outline") {

			@Override
			public void renderHead(IHeaderResponse response) {
				super.renderHead(response);
				response.render(OnDomReadyHeaderItem.forScript("onedev.server.sourceView.initOutline();"));
			}
			
		};
		
		float outlineWidth;
		cookie = request.getCookie(COOKIE_OUTLINE_WIDTH);
		if (cookie != null) 
			outlineWidth = Float.parseFloat(cookie.getValue());
		else 
			outlineWidth = 300;
		
		outline.add(AttributeAppender.append("style", "width:" + outlineWidth + "px"));
		outline.add(new AjaxLink<Void>("close") {

			@Override
			public void onClick(AjaxRequestTarget target) {
				toggleOutline(target);
			}
			
		});
		
		IModel<HashSet<Symbol>> state = new Model<HashSet<Symbol>>(new HashSet<>(getChildSymbols(symbols, null)));
		NestedTree<Symbol> tree = new NestedTree<Symbol>("body", newSymbolTreeProvider(symbols), state) {

			@Override
			protected void onInitialize() {
				super.onInitialize();
				add(new HumanTheme());				
			}

			@Override
			protected Component newContentComponent(String id, IModel<Symbol> nodeModel) {
				Symbol symbol = nodeModel.getObject();
				
				Fragment fragment = new Fragment(id, "outlineNodeFrag", SourceViewPanel.this);
				fragment.setMarkupId(getSymbolId(symbols, symbol));
				fragment.setOutputMarkupId(true);
				
				AjaxLink<Void> link = new ViewStateAwareAjaxLink<Void>("link") {

					@Override
					public void onClick(AjaxRequestTarget target) {
						context.onSelect(target, context.getBlobIdent(),
								BlobRendererer.getSourcePosition(symbol.getPosition()));
					}
					
				};
				link.add(symbol.renderIcon("icon"));
				link.add(symbol.render("label", null));
				
				fragment.add(link);
				
				return fragment;
			}
			
		};		
		
		outline.add(tree);
		
		outline.setOutputMarkupPlaceholderTag(true);
		add(outline);
		
		outline.setVisible(isOutlineVisibleInitially());
		
		add(symbolTooltip = new SymbolTooltipPanel("symbolTooltip") {

			@Override
			protected void onSelect(AjaxRequestTarget target, QueryHit hit) {
				BlobIdent blobIdent = new BlobIdent(
						getRevision(), hit.getBlobPath(), FileMode.REGULAR_FILE.getBits());
				context.onSelect(target, blobIdent, BlobRendererer.getSourcePosition(hit.getTokenPos()));
			}

			@Override
			protected void onOccurrencesQueried(AjaxRequestTarget target, List<QueryHit> hits) {
				context.onSearchComplete(target, hits);
			}

			@Override
			protected String getBlobPath() {
				return context.getBlobIdent().path;
			}

			@Override
			protected Project getProject() {
				return context.getProject();
			}
			
		});
	}

	private boolean isOutlineVisibleInitially() {
		if (hasOutline()) {
			WebRequest request = (WebRequest) RequestCycle.get().getRequest();
			Cookie cookie = request.getCookie(COOKIE_OUTLINE);
			if (cookie != null) {
				return cookie.getValue().equals("yes");
			} else {
				return !WicketUtils.isDevice();
			}
		} else {
			return false;
		}
	}
	
	private boolean contains(PlanarRange scope, int line, int ch) {
		int fromLine = scope.getFromRow();
		int toLine = scope.getToRow();
		int fromCh = scope.getFromColumn();
		int toCh = scope.getToColumn();
		return (fromLine < line || fromLine == line && fromCh<=ch) && (toLine > line || toLine == line && toCh >= ch);
	}
	
	private CompareContext getCompareContext() {
		CompareContext compareContext = new CompareContext();
		compareContext.setOldCommitHash(context.getCommit().name());
		compareContext.setNewCommitHash(context.getCommit().name());
		if (context.getBlobIdent().path != null)
			compareContext.setCurrentFile(context.getBlobIdent().path);
		return compareContext;
	}
	
	private PlanarRange getRange(IRequestParameters params, String beginLineParam, String beginCharParam, 
			String endLineParam, String endCharParam) {
		int beginLine = params.getParameterValue(beginLineParam).toInt();
		int beginChar = params.getParameterValue(beginCharParam).toInt();
		int endLine = params.getParameterValue(endLineParam).toInt();
		int endChar = params.getParameterValue(endCharParam).toInt();
		return new PlanarRange(beginLine, beginChar, endLine, endChar);
	}

	private void clearComment(AjaxRequestTarget target) {
		commentContainer.replace(new WebMarkupContainer("body"));
		commentContainer.setVisible(false);
		target.add(commentContainer);
	}
	
	@Override
	protected void onDetach() {
		annotationInfoModel.detach();
		super.onDetach();
	}

	private void onCommentDeleted(AjaxRequestTarget target) {
		clearComment(target);
		target.appendJavaScript("onedev.server.sourceView.onCommentDeleted();");
		context.onCommentClosed(target);
	}
	
	private boolean hasOutline() {
		for (Symbol symbol: symbols) {
			if (symbol.isDisplayInOutline())
				return true;
		}
		return false;
	}
	
	private List<Symbol> getChildSymbols(List<Symbol> symbols, @Nullable Symbol parentSymbol) {
		List<Symbol> children = new ArrayList<>();
		for (Symbol symbol: symbols) {
			if (symbol.isDisplayInOutline() && symbol.getOutlineParent() == parentSymbol)
				children.add(symbol);
		}
		return children;
	}
	
	private String getJsonOfBlameInfos(boolean blamed) {
		String jsonOfBlameInfos;
		if (blamed) {
			List<BlameInfo> blameInfos = new ArrayList<>();
			
			String commitHash = context.getCommit().name();
			
			BlameCommand cmd = new BlameCommand(context.getProject().getGitDir());
			cmd.commitHash(commitHash).file(context.getBlobIdent().path);
			for (BlameBlock blame: cmd.call()) {
				BlameInfo blameInfo = new BlameInfo();
				blameInfo.commitDate = DateUtils.formatDate(blame.getCommit().getCommitter().getWhen());
				blameInfo.authorName = HtmlEscape.escapeHtml5(blame.getCommit().getAuthor().getName());
				blameInfo.hash = blame.getCommit().getHash();
				blameInfo.abbreviatedHash = GitUtils.abbreviateSHA(blame.getCommit().getHash(), 7);
				CommitDetailPage.State state = new CommitDetailPage.State();
				state.revision = blame.getCommit().getHash();
				if (context.getBlobIdent().path != null)
					state.pathFilter = PatternSet.quoteIfNecessary(context.getBlobIdent().path);
				PageParameters params = CommitDetailPage.paramsOf(context.getProject(), state);
				blameInfo.url = RequestCycle.get().urlFor(CommitDetailPage.class, params).toString();
				blameInfo.ranges = blame.getRanges();
				blameInfos.add(blameInfo);
			}
			jsonOfBlameInfos = convertToJson(blameInfos);
		} else {
			jsonOfBlameInfos = "undefined";
		}
		return jsonOfBlameInfos;
	}
	
	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		
		response.render(JavaScriptHeaderItem.forReference(new SourceViewResourceReference()));
		
		Blob blob = context.getProject().getBlob(context.getBlobIdent(), true);
		
		String jsonOfBlameInfos = getJsonOfBlameInfos(context.getMode() == Mode.BLAME);
		
		CodeCommentInfo openCommentInfo;
		if (context.getOpenComment() != null) {
			PlanarRange range = (PlanarRange) commentContainer.getDefaultModelObject();
			if (range != null)
				openCommentInfo = new CodeCommentInfo(context.getOpenComment(), range);
			else
				openCommentInfo = null;
		} else { 
			openCommentInfo = null;
		}

		CharSequence callback = ajaxBehavior.getCallbackFunction(
				explicit("action"), explicit("param1"), explicit("param2"), 
				explicit("param3"), explicit("param4"), explicit("param5"));
		
		PlanarRange markRange = BlobRendererer.getSourceRange(context.getPosition());
		if (markRange == null)
			markRange = (PlanarRange) commentContainer.getDefaultModelObject();
		else
			markRange = markRange.normalize(blob.getText().getLines());
		
		String script = String.format("onedev.server.sourceView.onDomReady("
				+ "'%s', '%s', %s, %s, '%s', '%s', %s, %s, %s, %s, '%s', %s);", 
				JavaScriptEscape.escapeJavaScript(context.getBlobIdent().path),
				JavaScriptEscape.escapeJavaScript(blob.getText().getContent()),
				convertToJson(openCommentInfo),
				convertToJson(markRange),
				symbolTooltip.getMarkupId(), 
				context.getBlobIdent().revision, 
				jsonOfBlameInfos, 
				callback, 
				blameMessageBehavior.getCallback(),
				sourceFormat.getTabSize(),
				sourceFormat.getLineWrapMode(), 
				convertToJson(annotationInfoModel.getObject()));
		response.render(OnDomReadyHeaderItem.forScript(script));
		
		if (markRange != null) {
			script = String.format("onedev.server.sourceView.onWindowLoad(%s);", convertToJson(markRange));
			response.render(OnLoadHeaderItem.forScript(script));
		}
	}

	@SuppressWarnings("unused")
	private static class BlameInfo {
		
		String abbreviatedHash;
		
		String hash;
		
		String url;
		
		String authorName;
		
		String commitDate;
		
		List<LinearRange> ranges;
	}
	
	private String getSymbolId(List<Symbol> symbols, Symbol symbol) {
		return "outline-symbol-" + symbols.indexOf(symbol);
	}

	@Override
	protected boolean isEditSupported() {
		return true;
	}
	
	@Override
	public void position(AjaxRequestTarget target, String position) {
		String script;
		PlanarRange mark = BlobRendererer.getSourceRange(position);
		if (mark != null) 
			script = String.format("onedev.server.sourceView.mark(%s, true);", convertToJson(mark));
		else 
			script = String.format("onedev.server.sourceView.clearMark();");
		target.appendJavaScript(script);
	}

	private ITreeProvider<Symbol> newSymbolTreeProvider(List<Symbol> symbols) {
		return new ITreeProvider<Symbol>() {

			@Override
			public void detach() {
			}

			@Override
			public Iterator<? extends Symbol> getRoots() {
				return getChildSymbols(symbols, null).iterator();
			}

			@Override
			public boolean hasChildren(Symbol symbol) {
				return !getChildSymbols(symbols, symbol).isEmpty();
			}

			@Override
			public Iterator<? extends Symbol> getChildren(Symbol symbol) {
				return getChildSymbols(symbols, symbol).iterator();
			}

			@Override
			public IModel<Symbol> model(Symbol symbol) {
				return Model.of(symbol);
			}
			
		};		
	}
	
	private void closeComment(AjaxRequestTarget target) {
		clearComment(target);
		context.onCommentClosed(target);
		target.appendJavaScript("onedev.server.sourceView.onCloseComment();");
	}
	
	private NestedTree<Symbol> newOutlineSearchTree(ModalPanel modal, List<Symbol> symbols, Set<Symbol> state) {
		NestedTree<Symbol> tree = new NestedTree<Symbol>("content", newSymbolTreeProvider(symbols), Model.ofSet(state)) {

			@Override
			protected void onInitialize() {
				super.onInitialize();
				add(new HumanTheme());				
			}

			@Override
			protected Component newContentComponent(String id, IModel<Symbol> nodeModel) {
				Fragment fragment = new Fragment(id, "outlineNodeFrag", SourceViewPanel.this);
				
				Symbol symbol = nodeModel.getObject();
				
				AjaxLink<Void> link = new ViewStateAwareAjaxLink<Void>("link") {

					@Override
					public void onClick(AjaxRequestTarget target) {
						modal.close();
						context.onSelect(target, context.getBlobIdent(), BlobRendererer.getSourcePosition(symbol.getPosition()));
					}
					
				};
				link.add(symbol.renderIcon("icon"));
				link.add(symbol.render("label", null));
				link.add(AttributeAppender.replace("class", "selectable"));
				
				for (Symbol each: symbols) {
					if (each.isDisplayInOutline()) {
						if (symbol == each)
							link.add(AttributeAppender.append("class", "active"));
						break;
					}
				}
				
				fragment.add(link);
				fragment.setOutputMarkupId(true);
				
				return fragment;
			}
			
		};		

		tree.setOutputMarkupId(true);
		
		return tree;
	}
	
	private Component newOutlineSearchPanel(String id, ModalPanel modal) {
		Fragment fragment = new Fragment(id, "outlineSearchFrag", SourceViewPanel.this) {
			
			@Override
			public void renderHead(IHeaderResponse response) {
				super.renderHead(response);
				
				response.render(JavaScriptHeaderItem.forReference(new SelectByTypingResourceReference()));
				
				String script = String.format("$('#%s>.outline-search>.modal-body>input').selectByTyping('#%s>.outline-search>.modal-body>div');", 
						getMarkupId(), getMarkupId());
				response.render(OnDomReadyHeaderItem.forScript(script));
			}
			
		};
		fragment.add(new AjaxLink<Void>("close") {

			@Override
			public void onClick(AjaxRequestTarget target) {
				modal.close();
			}
			
		});

		TextField<String> searchField = new TextField<>("input", Model.of(""));
		fragment.add(searchField);
		
		searchField.add(new OnTypingDoneBehavior(100) {
			
			@Override
			protected void updateAjaxAttributes(AjaxRequestAttributes attributes) {
				super.updateAjaxAttributes(attributes);
				attributes.setChannel(new AjaxChannel("outline-search", AjaxChannel.Type.DROP));
			}

			@Override
			protected void onTypingDone(AjaxRequestTarget target) {
				String searchInput = StringUtils.trimToNull(searchField.getInput());
				
				MatchScoreProvider<Symbol> matchScoreProvider = new MatchScoreProvider<Symbol>() {

					@Override
					public double getMatchScore(Symbol object) {
						return MatchScoreUtils.getMatchScore(object.getName(), searchInput);
					}
					
				};
				
				List<Symbol> matchedSymbols = MatchScoreUtils.filterAndSort(symbols, matchScoreProvider);
				
				List<Symbol> filteredSymbols = new ArrayList<>();
				for (Symbol matchSymbol: matchedSymbols) {
					Symbol currentSymbol = matchSymbol;
					while (currentSymbol != null) {
						if (!filteredSymbols.contains(currentSymbol))
							filteredSymbols.add(currentSymbol);
						currentSymbol = currentSymbol.getOutlineParent();
					}
				}
				
				Set<Symbol> state = new HashSet<>(filteredSymbols);
				NestedTree<Symbol> tree = newOutlineSearchTree(modal, filteredSymbols, state);
				fragment.replace(tree);
				target.add(tree);
			}
			
		});	
		
		Set<Symbol> state = new HashSet<>((getChildSymbols(symbols, null)));
		fragment.add(newOutlineSearchTree(modal, symbols, state));
		
		fragment.setOutputMarkupId(true);
		
		return fragment;
	}
	
	@Override
	public List<MenuItem> getMenuItems(FloatingPanel dropdown) {
		List<MenuItem> menuItems = new ArrayList<>();
		if (hasOutline()) {
			menuItems.add(new MenuItem() {

				@Override
				public String getShortcut() {
					return "O";
				}

				@Override
				public String getLabel() {
					return "Outline Search";
				}

				@Override
				public WebMarkupContainer newLink(String id) {
					return new ModalLink(id) {

						@Override
						public void onClick(AjaxRequestTarget target) {
							super.onClick(target);
							dropdown.close();
						}
						
						@Override
						protected Component newContent(String id, ModalPanel modal) {
							return newOutlineSearchPanel(id, modal);
						}
						
					};
				}
				
			});
		} 
		return menuItems;
	}

	private boolean isContextDifferent(CompareContext compareContext) {
		String commitHash = context.getCommit().name();
		return !compareContext.getOldCommitHash().equals(commitHash) 
				|| !compareContext.getNewCommitHash().equals(commitHash);
	}
	
	@Override
	protected boolean isViewPlainSupported() {
		return viewPlainMode;
	}
	
	private void onSaveCommentReply(CodeCommentReply reply) {
		reply.setCompareContext(getCompareContext());
		OneDev.getInstance(CodeCommentReplyManager.class).save(reply);
	}
	
	private void onSaveCommentStatusChange(CodeCommentStatusChange change, String note) {
		change.setCompareContext(getCompareContext());
		OneDev.getInstance(CodeCommentStatusChangeManager.class).save(change, note);
	}
	
	private SuggestionSupport getSuggestionSupport(Mark mark) {
		return new SuggestionSupport() {
			
			@Override
			public SuggestFor getSuggestFor() {
				return context.getProject().getBlob(mark.getBlobIdent(), true).getText()
						.getSuggestFor(mark.getPath(), mark.getRange());
			}
			
			@Override
			public ApplySupport getApplySupport() {
				if (SecurityUtils.canWriteCode(context.getProject())) {
					return new ApplySupport() {
	
						@Override
						public void applySuggestion(AjaxRequestTarget target, List<String> suggestion) {
							SuggestionApplyBean bean = new SuggestionApplyBean();
							String refName = context.getRefName();
							if (refName != null) {
								String branch = GitUtils.ref2branch(refName);
								if (branch != null)
									bean.setBranch(branch);
							}
							new SuggestionApplyModalPanel(target, bean) {

								@Override
								protected CodeComment getComment() {
									return context.getOpenComment();
								}

								@Override
								protected List<String> getSuggestion() {
									return suggestion;
								}

							};								
						}
	
						@Override
						public BatchApplySupport getBatchSupport() {
							return null;
						}
						
					};
				} else {
					return null;
				}
			}

			@Override
			public boolean isOutdated() {
				return false;
			}
			
		};
	}
	
}
