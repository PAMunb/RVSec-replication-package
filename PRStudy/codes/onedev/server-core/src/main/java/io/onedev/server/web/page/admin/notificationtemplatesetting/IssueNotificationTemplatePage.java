package io.onedev.server.web.page.admin.notificationtemplatesetting;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.attributes.AjaxRequestAttributes;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.google.common.collect.Lists;

import io.onedev.server.OneDev;
import io.onedev.server.entitymanager.SettingManager;
import io.onedev.server.model.support.administration.notificationtemplate.NotificationTemplateSetting;
import io.onedev.server.web.ajaxlistener.ConfirmClickListener;
import io.onedev.server.web.editable.BeanContext;
import io.onedev.server.web.editable.BeanEditor;
import io.onedev.server.web.page.admin.AdministrationPage;

@SuppressWarnings("serial")
public class IssueNotificationTemplatePage extends AdministrationPage {

	public IssueNotificationTemplatePage(PageParameters params) {
		super(params);
	}

	private SettingManager getSettingManager() {
		return OneDev.getInstance(SettingManager.class);
	}
	
	@Override
	protected void onInitialize() {
		super.onInitialize();

		NotificationTemplateSetting setting = getSettingManager().getNotificationTemplateSetting();
		
		Map<String, String> variableHelp = new LinkedHashMap<>();
		variableHelp.put("issue", " represents the <a href='https://code.onedev.io/projects/160/blob/main/server-core/src/main/java/io/onedev/server/model/Issue.java' target='_blank'>issue</a> object to be notified");
		add(new Label("notificationTemplateHelp", NotificationTemplateSetting.getTemplateHelp(variableHelp))
				.setEscapeModelStrings(false));
		
		BeanEditor editor = BeanContext.edit("editor", setting, Lists.newArrayList(NotificationTemplateSetting.PROP_ISSUE_NOTIFICATION_TEMPLATE), false);
		
		Button saveButton = new Button("save") {

			@Override
			public void onSubmit() {
				super.onSubmit();
				
				getSettingManager().saveNotificationTemplateSetting(setting);
				getSession().success("Issue notification template has been saved");
			}
			
		};
		
		AjaxLink<?> useDefaultLink;
		add(useDefaultLink = new AjaxLink<Void>("useDefault") {

			@Override
			protected void updateAjaxAttributes(AjaxRequestAttributes attributes) {
				super.updateAjaxAttributes(attributes);
				attributes.getAjaxCallListeners().add(new ConfirmClickListener("Do you really want to use default template?"));
			}

			@Override
			public void onClick(AjaxRequestTarget target) {
				setting.setIssueNotificationTemplate(NotificationTemplateSetting.DEFAULT_TEMPLATE);
				getSettingManager().saveNotificationTemplateSetting(setting);
				setResponsePage(IssueNotificationTemplatePage.class);
			}

			@Override
			protected void onComponentTag(ComponentTag tag) {
				super.onComponentTag(tag);
				configure();
				if (!isEnabled())
					tag.put("disabled", "disabled");
			}

			@Override
			protected void onConfigure() {
				super.onConfigure();
				setEnabled(!setting.getIssueNotificationTemplate().equals(NotificationTemplateSetting.DEFAULT_TEMPLATE));
			}

		});
		
		Form<?> form = new Form<Void>("form");
		form.add(editor);
		form.add(saveButton);
		form.add(useDefaultLink);
		
		add(form);
	}

	@Override
	protected Component newTopbarTitle(String componentId) {
		return new Label(componentId, "Issue Notification Template");
	}

}