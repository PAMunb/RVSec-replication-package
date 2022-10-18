package io.onedev.server.web.component.issue.transitionoption;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.attributes.AjaxRequestAttributes;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.behavior.Behavior;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.cycle.RequestCycle;

import com.google.common.collect.Lists;

import io.onedev.server.OneDev;
import io.onedev.server.entitymanager.UserManager;
import io.onedev.server.model.Issue;
import io.onedev.server.model.Project;
import io.onedev.server.model.User;
import io.onedev.server.model.support.issue.field.FieldUtils;
import io.onedev.server.model.support.issue.transitiontrigger.PressButtonTrigger;
import io.onedev.server.security.SecurityUtils;
import io.onedev.server.web.ajaxlistener.ConfirmLeaveListener;
import io.onedev.server.web.component.markdown.AttachmentSupport;
import io.onedev.server.web.component.project.comment.CommentInput;
import io.onedev.server.web.editable.BeanContext;
import io.onedev.server.web.editable.BeanEditor;
import io.onedev.server.web.util.ProjectAttachmentSupport;

@SuppressWarnings("serial")
public abstract class TransitionOptionPanel extends Panel {

	private String comment;
	
	public TransitionOptionPanel(String id) {
		super(id);
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();
		
		Class<?> fieldBeanClass = FieldUtils.getFieldBeanClass();
		Serializable fieldBean = getIssue().getFieldBean(fieldBeanClass, true);

		Form<?> form = new Form<Void>("form") {

			@Override
			protected void onError() {
				super.onError();
				RequestCycle.get().find(AjaxRequestTarget.class).add(this);
			}
			
		};
		
		add(form);
		
		form.add(new Label("title", "Issue Transition (" + getTrigger().getButtonLabel() + ")"));
		
		Collection<String> propertyNames = FieldUtils.getEditablePropertyNames(getIssue().getProject(), 
				fieldBeanClass, getTrigger().getPromptFields());
		BeanEditor editor = BeanContext.edit("fields", fieldBean, propertyNames, false); 
		form.add(editor);
		
		form.add(new CommentInput("comment", new PropertyModel<String>(this, "comment"), false) {

			@Override
			protected AttachmentSupport getAttachmentSupport() {
				return new ProjectAttachmentSupport(getProject(), getIssue().getUUID(), 
						SecurityUtils.canManageIssues(getProject()));
			}

			@Override
			protected Project getProject() {
				return getIssue().getProject();
			}
			
			@Override
			protected List<Behavior> getInputBehaviors() {
				return Lists.newArrayList(AttributeModifier.replace("placeholder", "Leave a comment"));
			}
			
			@Override
			protected List<User> getMentionables() {
				return OneDev.getInstance(UserManager.class).queryAndSort(getIssue().getParticipants());
			}
			
		});

		form.add(new AjaxButton("ok") {

			@Override
			protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
				super.onSubmit(target, form);

				Collection<String> editableFields = FieldUtils.getEditableFields(
						getIssue().getProject(), getTrigger().getPromptFields()); 
				Map<String, Object> fieldValues = FieldUtils.getFieldValues(
						editor.newComponentContext(), fieldBean, editableFields);
				onTransit(target, fieldValues, comment);
			}
			
		});
		form.add(new AjaxLink<Void>("cancel") {

			@Override
			public void onClick(AjaxRequestTarget target) {
				onCancel(target);
			}
			
			@Override
			protected void updateAjaxAttributes(AjaxRequestAttributes attributes) {
				super.updateAjaxAttributes(attributes);
				attributes.getAjaxCallListeners().add(new ConfirmLeaveListener());
			}
			
		});
		
		form.add(new AjaxLink<Void>("close") {

			@Override
			public void onClick(AjaxRequestTarget target) {
				onCancel(target);
			}
			
			@Override
			protected void updateAjaxAttributes(AjaxRequestAttributes attributes) {
				super.updateAjaxAttributes(attributes);
				attributes.getAjaxCallListeners().add(new ConfirmLeaveListener());
			}
			
		});
		
		setOutputMarkupId(true);
	}
	
	protected abstract Issue getIssue();

	protected abstract PressButtonTrigger getTrigger();
	
	protected abstract void onTransit(AjaxRequestTarget target, Map<String, Object> fieldValues, @Nullable String comment);
	
	protected abstract void onCancel(AjaxRequestTarget target);
	
}
