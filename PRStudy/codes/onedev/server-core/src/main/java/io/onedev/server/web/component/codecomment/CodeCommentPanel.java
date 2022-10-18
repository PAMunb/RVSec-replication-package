package io.onedev.server.web.component.codecomment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.annotation.Nullable;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.attributes.AjaxRequestAttributes;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.behavior.AttributeAppender;
import org.apache.wicket.behavior.Behavior;
import org.apache.wicket.core.request.handler.IPartialPageRequestHandler;
import org.apache.wicket.feedback.FencedFeedbackPanel;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.markup.html.panel.Fragment;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.markup.repeater.RepeatingView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.cycle.RequestCycle;

import com.google.common.collect.Sets;

import io.onedev.server.OneDev;
import io.onedev.server.entitymanager.CodeCommentManager;
import io.onedev.server.entitymanager.CodeCommentReplyManager;
import io.onedev.server.entitymanager.CodeCommentStatusChangeManager;
import io.onedev.server.entitymanager.UrlManager;
import io.onedev.server.entitymanager.UserManager;
import io.onedev.server.infomanager.UserInfoManager;
import io.onedev.server.model.CodeComment;
import io.onedev.server.model.CodeCommentReply;
import io.onedev.server.model.CodeCommentStatusChange;
import io.onedev.server.model.Project;
import io.onedev.server.model.User;
import io.onedev.server.model.support.CompareContext;
import io.onedev.server.security.SecurityUtils;
import io.onedev.server.util.DateUtils;
import io.onedev.server.util.UrlUtils;
import io.onedev.server.web.ajaxlistener.ConfirmClickListener;
import io.onedev.server.web.ajaxlistener.ConfirmLeaveListener;
import io.onedev.server.web.behavior.WebSocketObserver;
import io.onedev.server.web.component.markdown.AttachmentSupport;
import io.onedev.server.web.component.markdown.MarkdownViewer;
import io.onedev.server.web.component.markdown.SuggestionSupport;
import io.onedev.server.web.component.project.comment.CommentInput;
import io.onedev.server.web.component.user.ident.Mode;
import io.onedev.server.web.component.user.ident.UserIdentPanel;
import io.onedev.server.web.util.ProjectAttachmentSupport;

@SuppressWarnings("serial")
public abstract class CodeCommentPanel extends Panel {

	private final Long commentId;
	
	private RepeatingView activitiesView;
	
	/**
	 * We pass comment id instead of comment model as we want to make sure that 
	 * comment is always loaded upon usage as this panel is involved in websocket
	 * update and websocket update does not detach models at end of request which 
	 * may result in Hibernate lazy load exception when the comment is used again
	 * in next request 
	 * 
	 * @param id
	 * @param commentId
	 */
	public CodeCommentPanel(String id, Long commentId) {
		super(id);
		this.commentId = commentId;
	}

	public CodeComment getComment() {
		return OneDev.getInstance(CodeCommentManager.class).load(commentId);
	}

	private WebMarkupContainer newCommentOrReplyContainer() {
		WebMarkupContainer viewFragment = new Fragment("comment", "commentOrReplyViewFrag", this);
		viewFragment.setOutputMarkupId(true);
		
		viewFragment.add(AttributeAppender.append("class", new LoadableDetachableModel<String>() {

			@Override
			protected String load() {
				return getComment().isVisitedAfter(getComment().getCreateDate())?"": "new";
			}
			
		}));
		
		viewFragment.add(new UserIdentPanel("userAvatar", getComment().getUser(), Mode.AVATAR));
		viewFragment.add(new Label("userName", getComment().getUser().getDisplayName()));
		viewFragment.add(new Label("action", "commented"));
		viewFragment.add(new Label("date", DateUtils.formatAge(getComment().getCreateDate()))
				.add(new AttributeAppender("title", DateUtils.formatDateTime(getComment().getCreateDate()))));
		if (isContextDifferent(getComment().getCompareContext())) {
			String url = OneDev.getInstance(UrlManager.class).urlFor(getComment());
			viewFragment.add(new ExternalLink("context", UrlUtils.makeRelative(url)) {

				@Override
				protected void onComponentTag(ComponentTag tag) {
					super.onComponentTag(tag);
					tag.put("title", "Current context is different from the context when this comment is added, click to show the comment context");
				}
				
			});
		} else {
			viewFragment.add(new WebMarkupContainer("context").setVisible(false));
		}

		viewFragment.add(new MarkdownViewer("content", new IModel<String>() {

			@Override
			public String getObject() {
				return getComment().getContent();
			}

			@Override
			public void detach() {
			}

			@Override
			public void setObject(String object) {
				CodeComment comment = getComment();
				comment.setContent(object);
				OneDev.getInstance(CodeCommentManager.class).save(comment);				
			}
			
		}, null) {

			@Override
			protected SuggestionSupport getSuggestionSupport() {
				return CodeCommentPanel.this.getSuggestionSupport();
			}
			
		});
		
		viewFragment.add(new WebMarkupContainer("anchor").setVisible(false));

		WebMarkupContainer foot = new WebMarkupContainer("foot");
		foot.setVisible(SecurityUtils.canModifyOrDelete(getComment()));
		foot.add(new AjaxLink<Void>("edit") {

			@Override
			public void onClick(AjaxRequestTarget target) {
				Fragment editFragment = new Fragment(viewFragment.getId(), "commentOrReplyEditFrag", CodeCommentPanel.this);
				
				Form<?> form = new Form<Void>("form");
				form.setOutputMarkupId(true);
				
				CommentInput contentInput = new CommentInput("content", Model.of(getComment().getContent()), true) {

					@Override
					protected AttachmentSupport getAttachmentSupport() {
						return new ProjectAttachmentSupport(getComment().getProject(), getComment().getUUID(), 
								SecurityUtils.canManageCodeComments(getProject()));
					}

					@Override
					protected SuggestionSupport getSuggestionSupport() {
						return CodeCommentPanel.this.getSuggestionSupport();
					}

					@Override
					protected Project getProject() {
						return getComment().getProject();
					}

					@Override
					protected List<User> getMentionables() {
						return OneDev.getInstance(UserManager.class).queryAndSort(getComment().getParticipants());
					}
					
				};
				form.add(contentInput);
				contentInput.setRequired(true);
				contentInput.setLabel(Model.of("Comment"));
				
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
						WebMarkupContainer commentOrReplyContainer = newCommentOrReplyContainer();
						editFragment.replaceWith(commentOrReplyContainer);
						target.add(commentOrReplyContainer);
					}
					
				});
				
				form.add(new AjaxButton("save") {

					@Override
					protected void onInitialize() {
						super.onInitialize();
						add(new Label("label", "Save"));
						add(AttributeAppender.append("class", "dirty-aware"));
					}

					@Override
					protected void onError(AjaxRequestTarget target, Form<?> form) {
						super.onError(target, form);
						target.add(feedback);
					}

					@Override
					protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
						super.onSubmit(target, form);

						CodeComment comment = getComment();
						comment.setContent(contentInput.getModelObject());
						WebMarkupContainer commentOrReplyContainer = newCommentOrReplyContainer();
						editFragment.replaceWith(commentOrReplyContainer);
						target.add(commentOrReplyContainer);
						onSaveComment(target, comment);
					}

				});
				
				editFragment.add(form);
				editFragment.setOutputMarkupId(true);
				viewFragment.replaceWith(editFragment);
				target.add(editFragment);
			}
			
		});
		
		foot.add(new AjaxLink<Void>("delete") {

			@Override
			protected void updateAjaxAttributes(AjaxRequestAttributes attributes) {
				super.updateAjaxAttributes(attributes);
				String confirmMessage;
				if (getComment().getReplies().isEmpty()) {
					confirmMessage = "Do you really want to delete this comment?";
				} else {
					confirmMessage = "Deleting this comment will also delete all replies, do you really "
							+ "want to continue?";
				}
				attributes.getAjaxCallListeners().add(new ConfirmClickListener(confirmMessage));
			}

			@Override
			public void onClick(AjaxRequestTarget target) {
				onDeleteComment(target, getComment());
				OneDev.getInstance(CodeCommentManager.class).delete(getComment());
			}
			
		});
		
		viewFragment.add(foot);		
		return viewFragment;
	}
	
	private WebMarkupContainer newActionsContainer() {
		WebMarkupContainer actionsContainer = new Fragment("actions", "actionsFrag", this) {

			@Override
			protected void onConfigure() {
				super.onConfigure();
				setVisible(SecurityUtils.getUser() != null);
			}
			
		};
		actionsContainer.setOutputMarkupId(true);
		actionsContainer.add(new AjaxLink<Void>("reply") {

			@Override
			public void onClick(AjaxRequestTarget target) {
				onAddReply(target, null);
			}
			
		});
		actionsContainer.add(new AjaxLink<Void>("resolve") {

			@Override
			public void onClick(AjaxRequestTarget target) {
				onAddReply(target, true);
			}

			@Override
			protected void onConfigure() {
				super.onConfigure();
				setVisible(!getComment().isResolved());
			}
			
		});
		actionsContainer.add(new AjaxLink<Void>("unresolve") {

			@Override
			public void onClick(AjaxRequestTarget target) {
				onAddReply(target, false);
			}
			
			@Override
			protected void onConfigure() {
				super.onConfigure();
				setVisible(getComment().isResolved());
			}
			
		});
		return actionsContainer;
	}
	
	private List<CodeCommentActivity> getActivities() {
		List<CodeCommentActivity> activities = new ArrayList<>();

		for (CodeCommentStatusChange change: getComment().getChanges()) 
			activities.add(new CodeCommentStatusChangeActivity(change));
		
		for (CodeCommentReply comment: getComment().getReplies())  
			activities.add(new CodeCommentReplyActivity(comment));
		
		activities.sort((o1, o2) -> {
			if (o1.getDate().getTime()<o2.getDate().getTime())
				return -1;
			else if (o1.getDate().getTime()>o2.getDate().getTime())
				return 1;
			else 
				return 0;
		});
		
		return activities;
	}
	
	@Override
	protected void onInitialize() {
		super.onInitialize();

		add(newCommentOrReplyContainer());
		
		activitiesView = new RepeatingView("activities");

		List<CodeCommentActivity> activities = new ArrayList<>();

		for (CodeCommentStatusChange change: getComment().getChanges()) 
			activities.add(new CodeCommentStatusChangeActivity(change));
		
		for (CodeCommentReply comment: getComment().getReplies())  
			activities.add(new CodeCommentReplyActivity(comment));
		
		activities.sort((o1, o2) -> {
			if (o1.getDate().getTime()<o2.getDate().getTime())
				return -1;
			else if (o1.getDate().getTime()>o2.getDate().getTime())
				return 1;
			else 
				return 0;
		});

		for (CodeCommentActivity activity: activities) {
			Component activityContainer = activity.render(activitiesView.newChildId());				
			if (!getComment().isVisitedAfter(activity.getDate()))
				activityContainer.add(AttributeAppender.append("class", "new"));
			activitiesView.add(activityContainer);			
		}
		add(activitiesView);
		add(newActionsContainer());
		
		add(new WebSocketObserver() {
			
			@Override
			@SuppressWarnings("deprecation")
			public void onObservableChanged(IPartialPageRequestHandler handler) {
				Component prevActivityContainer;
				if (activitiesView.size() > 0)
					prevActivityContainer = activitiesView.get(activitiesView.size()-1);
				else
					prevActivityContainer = null;
				
				List<CodeCommentActivity> newActivities = new ArrayList<>();
				for (CodeCommentActivity activity: getActivities()) {
					if (prevActivityContainer == null) {
						newActivities.add(activity);
					} else {
						CodeCommentActivity lastActivity = (CodeCommentActivity)prevActivityContainer.getDefaultModelObject();
						if (activity.getDate().getTime() > lastActivity.getDate().getTime()) 
							newActivities.add(activity);
					}
				}

				for (CodeCommentActivity activity: newActivities) {
					Component newActivityContainer = activity.render(activitiesView.newChildId()); 
					newActivityContainer.add(AttributeAppender.append("class", "new"));
					activitiesView.add(newActivityContainer);

					String script;
					if (prevActivityContainer != null) {
						script = String.format("$(\"<div id='%s'></div>\").insertAfter('#%s');", 
								newActivityContainer.getMarkupId(), prevActivityContainer.getMarkupId());
					} else {
						script = String.format("$(\"<div id='%s'></div>\").insertAfter('#%s');", 
								newActivityContainer.getMarkupId(), CodeCommentPanel.this.get("comment").getMarkupId());
					}
					handler.prependJavaScript(script);
					handler.add(newActivityContainer);
					prevActivityContainer = newActivityContainer;
				}
				
				OneDev.getInstance(UserInfoManager.class).visitCodeComment(SecurityUtils.getUser(), getComment());
			}
			
			@Override
			public Collection<String> getObservables() {
				return Sets.newHashSet(CodeComment.getWebSocketObservable(commentId));
			}
			
		});
		
		setOutputMarkupId(true);
	}

	@Override
	protected void onBeforeRender() {
		if (SecurityUtils.getUser() != null) 
			OneDev.getInstance(UserInfoManager.class).visitCodeComment(SecurityUtils.getUser(), getComment());
		super.onBeforeRender();
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		response.render(CssHeaderItem.forReference(new CodeCommentCssResourceReference()));
	}
	
	@Nullable
	protected abstract SuggestionSupport getSuggestionSupport();

	private void onAddReply(AjaxRequestTarget target, @Nullable Boolean resolved) {
		Fragment editFragment = new Fragment("actions", "commentOrReplyEditFrag", CodeCommentPanel.this);
		
		Form<?> form = new Form<Void>("form");

		CommentInput contentInput = new CommentInput("content", Model.of(""), true) {

			@Override
			protected AttachmentSupport getAttachmentSupport() {
				return new ProjectAttachmentSupport(getProject(), getComment().getUUID(),
						SecurityUtils.canManageCodeComments(getProject()));
			}

			@Override
			protected SuggestionSupport getSuggestionSupport() {
				return CodeCommentPanel.this.getSuggestionSupport();
			}
			
			@Override
			protected Project getProject() {
				return getComment().getProject();
			}

			@Override
			protected List<Behavior> getInputBehaviors() {
				List<Behavior> behaviors = new ArrayList<>();
				if (resolved != null)
					behaviors.add(AttributeModifier.replace("placeholder", "Leave a note"));
				return behaviors;
			}

			@Override
			protected List<User> getMentionables() {
				return OneDev.getInstance(UserManager.class).queryAndSort(getComment().getParticipants());
			}
			
		};
		contentInput.setRequired(resolved == null);
		contentInput.setLabel(Model.of("Content"));
		form.add(contentInput);
		
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
				WebMarkupContainer actionsContainer = newActionsContainer();
				editFragment.replaceWith(actionsContainer);
				target.add(actionsContainer);
			}
			
		});
		
		AjaxButton saveButton = new AjaxButton("save") {

			@Override
			protected void onInitialize() {
				super.onInitialize();
				if (resolved != null) {
					add(new Label("label", "Ok"));
				} else {
					add(new Label("label", "Save"));
					add(AttributeAppender.append("class", "dirty-aware"));
				}
			}

			@Override
			protected void onError(AjaxRequestTarget target, Form<?> form) {
				super.onError(target, form);
				target.add(feedback);
			}

			@Override
			protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
				super.onSubmit(target, form);

				if (resolved == null) {
					CodeCommentReply reply = new CodeCommentReply();
					reply.setComment(getComment());
					reply.setDate(new Date());
					reply.setUser(SecurityUtils.getUser());
					reply.setContent(contentInput.getModelObject());
					
					onSaveCommentReply(target, reply);
				} else {
					CodeCommentStatusChange change = new CodeCommentStatusChange();
					change.setComment(getComment());
					change.setDate(new Date());
					change.setUser(SecurityUtils.getUser());
					change.setResolved(resolved);
					
					onSaveCommentStatusChange(target, change, contentInput.getModelObject());
				}
				
				WebMarkupContainer actionsContainer = newActionsContainer();
				editFragment.replaceWith(actionsContainer);
				target.add(actionsContainer);
			}

		};
		form.add(saveButton);
		
		editFragment.add(form);
		editFragment.add(AttributeAppender.append("class", "activity"));
		
		editFragment.setOutputMarkupId(true);
		get("actions").replaceWith(editFragment);
		target.add(editFragment);	
		
		String script = String.format(""
				+ "setTimeout(function() {"
				+ "  document.getElementById('%s').scrollIntoViewIfNeeded(false);"
				+ "}, 0);", 
				saveButton.getMarkupId());
		target.appendJavaScript(script);
	}
	
	protected abstract void onDeleteComment(AjaxRequestTarget target, CodeComment comment);
	
	protected abstract void onSaveComment(AjaxRequestTarget target, CodeComment comment);

	protected abstract void onSaveCommentReply(AjaxRequestTarget target, CodeCommentReply reply);
	
	protected abstract void onSaveCommentStatusChange(AjaxRequestTarget target, CodeCommentStatusChange change, @Nullable String note);
	
	protected abstract boolean isContextDifferent(CompareContext compareContext);
	
	private interface CodeCommentActivity extends Serializable {
		
		Date getDate();
		
		Component render(String componentId);
		
		User getUser();
		
		String getAnchor();
	}
	
	private class CodeCommentStatusChangeActivity implements CodeCommentActivity {

		private final Long changeId;
		
		public CodeCommentStatusChangeActivity(CodeCommentStatusChange change) {
			changeId = change.getId();
		}
		
		@Override
		public Component render(String componentId) {
			Fragment fragment = new Fragment(componentId, "statusChangeFrag", CodeCommentPanel.this, Model.of(this));
			fragment.add(new UserIdentPanel("userAvatar", getChange().getUser(), Mode.AVATAR));
			fragment.add(new Label("userName", getChange().getUser().getDisplayName()));
			if (getChange().isResolved())
				fragment.add(new Label("action", "resolved"));
			else
				fragment.add(new Label("action", "unresolved"));
			fragment.add(new Label("date", DateUtils.formatAge(getComment().getCreateDate()))
					.add(new AttributeAppender("title", DateUtils.formatDateTime(getComment().getCreateDate()))));
			if (isContextDifferent(getChange().getCompareContext())) {
				String url = OneDev.getInstance(UrlManager.class).urlFor(getChange());
				fragment.add(new ExternalLink("context", UrlUtils.makeRelative(url)) {

					@Override
					protected void onComponentTag(ComponentTag tag) {
						super.onComponentTag(tag);
						tag.put("title", "Current context is different from this action, click to show the comment context");
					}
					
				});
			} else {
				fragment.add(new WebMarkupContainer("context").setVisible(false));
			}
			fragment.add(AttributeAppender.append("class", "status-change"));
			fragment.setMarkupId(getChange().getAnchor());
			
			fragment.setOutputMarkupId(true);
			
			return fragment;
		}

		public CodeCommentStatusChange getChange() {
			return OneDev.getInstance(CodeCommentStatusChangeManager.class).load(changeId);
		}
		
		@Override
		public Date getDate() {
			return getChange().getDate();
		}

		@Override
		public String getAnchor() {
			return getChange().getAnchor();
		}

		@Override
		public User getUser() {
			return getChange().getUser();
		}

	}
	
	public class CodeCommentReplyActivity implements CodeCommentActivity {

		private final Long replyId;
		
		public CodeCommentReplyActivity(CodeCommentReply reply) {
			replyId = reply.getId();
		}
		
		@Override
		public Component render(String componentId) {
			CodeCommentReply reply = getReply();
			Fragment viewFragment = new Fragment(componentId, "commentOrReplyViewFrag", 
					CodeCommentPanel.this, Model.of(this));
			viewFragment.setOutputMarkupId(true);
			viewFragment.setMarkupId(reply.getAnchor());
			viewFragment.add(AttributeAppender.append("name", reply.getAnchor()));
			
			viewFragment.add(new UserIdentPanel("userAvatar", reply.getUser(), Mode.AVATAR));
			viewFragment.add(new Label("userName", reply.getUser().getDisplayName()));
			viewFragment.add(new Label("action", "replied"));
			viewFragment.add(new Label("date", DateUtils.formatAge(reply.getDate()))
					.add(new AttributeAppender("title", DateUtils.formatDateTime(reply.getDate()))));
			if (isContextDifferent(reply.getCompareContext())) {
				String url = OneDev.getInstance(UrlManager.class).urlFor(reply);
				viewFragment.add(new ExternalLink("context", UrlUtils.makeRelative(url)) {

					@Override
					protected void onComponentTag(ComponentTag tag) {
						super.onComponentTag(tag);
						tag.put("title", "Current context is different from the context when this reply is added, click to show the reply context");
					}
					
				});
			} else {
				viewFragment.add(new WebMarkupContainer("context").setVisible(false));
			}
			
			viewFragment.add(new WebMarkupContainer("anchor") {

				@Override
				protected void onComponentTag(ComponentTag tag) {
					tag.put("href", "#" + getReply().getAnchor());
				}
				
			});
			
			viewFragment.add(new MarkdownViewer("content", new IModel<String>() {

				@Override
				public void detach() {
				}

				@Override
				public String getObject() {
					return getReply().getContent();
				}

				@Override
				public void setObject(String object) {
					CodeCommentReply reply = getReply();
					reply.setContent(object);
					onSaveCommentReply(RequestCycle.get().find(AjaxRequestTarget.class), reply);
				}
				
			}, null) {
				
				@Override
				protected SuggestionSupport getSuggestionSupport() {
					return CodeCommentPanel.this.getSuggestionSupport();
				}
				
			});			
			
			WebMarkupContainer foot = new WebMarkupContainer("foot");
			foot.setVisible(SecurityUtils.canModifyOrDelete(reply));
			
			foot.add(new AjaxLink<Void>("edit") {

				@Override
				public void onClick(AjaxRequestTarget target) {
					Fragment editFragment = new Fragment(viewFragment.getId(), 
							"commentOrReplyEditFrag", CodeCommentPanel.this, 
							Model.of(replyId));
					
					Form<?> form = new Form<Void>("form");
					CommentInput contentInput = new CommentInput("content", Model.of(getReply().getContent()), true) {

						@Override
						protected SuggestionSupport getSuggestionSupport() {
							return CodeCommentPanel.this.getSuggestionSupport();
						}
						
						@Override
						protected AttachmentSupport getAttachmentSupport() {
							return new ProjectAttachmentSupport(getProject(), getComment().getUUID(), 
									SecurityUtils.canManageCodeComments(getProject()));
						}

						@Override
						protected Project getProject() {
							return getComment().getProject();
						}

						@Override
						protected List<User> getMentionables() {
							return OneDev.getInstance(UserManager.class).queryAndSort(getComment().getParticipants());
						}

					};
					contentInput.setRequired(true);
					contentInput.setLabel(Model.of("Comment"));
					form.add(contentInput);
					
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
							Component activityContainer = new CodeCommentReplyActivity(getReply()).render(componentId);
							editFragment.replaceWith(activityContainer);
							target.add(activityContainer);
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

							CodeCommentReply reply = getReply();
							reply.setContent(contentInput.getModelObject());
							onSaveCommentReply(target, reply);
							reply.setContent(contentInput.getModelObject());
							
							Component activityContainer = new CodeCommentReplyActivity(reply).render(componentId);
							editFragment.replaceWith(activityContainer);
							target.add(activityContainer);
						}

					}.add(new Label("label", "Save")));
					
					editFragment.add(form);
					editFragment.setOutputMarkupId(true);
					editFragment.add(AttributeAppender.append("class", "reply"));
					
					viewFragment.replaceWith(editFragment);
					target.add(editFragment);
				}
				
			});
			foot.add(new AjaxLink<Void>("delete") {

				@Override
				protected void updateAjaxAttributes(AjaxRequestAttributes attributes) {
					super.updateAjaxAttributes(attributes);
					attributes.getAjaxCallListeners().add(new ConfirmClickListener("Do you really want to delete this reply?"));
				}

				@Override
				public void onClick(AjaxRequestTarget target) {
					viewFragment.remove();
					OneDev.getInstance(CodeCommentReplyManager.class).delete(getReply());
					target.appendJavaScript(String.format("$('#%s').remove();", viewFragment.getMarkupId()));
				}
				
			});
			
			viewFragment.add(foot);		
			
			viewFragment.add(AttributeAppender.append("class", "reply"));
			
			return viewFragment;			
		}
		
		public Long getCommentId() {
			return replyId;
		}
		
		public CodeCommentReply getReply() {
			return OneDev.getInstance(CodeCommentReplyManager.class).load(replyId);
		}

		@Override
		public Date getDate() {
			return getReply().getDate();
		}

		@Override
		public String getAnchor() {
			return getReply().getAnchor();
		}

		@Override
		public User getUser() {
			return getReply().getUser();
		}
		
	}	
}
