package io.onedev.server.web.page.project.setting.webhook;

import java.io.Serializable;

import org.apache.wicket.Component;
import org.apache.wicket.feedback.FencedFeedbackPanel;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import io.onedev.server.OneDev;
import io.onedev.server.entitymanager.ProjectManager;
import io.onedev.server.web.editable.PropertyContext;
import io.onedev.server.web.editable.PropertyEditor;
import io.onedev.server.web.page.project.setting.ProjectSettingPage;

@SuppressWarnings("serial")
public class WebHooksPage extends ProjectSettingPage {

	public WebHooksPage(PageParameters params) {
		super(params);
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();

		WebHooksBean bean = new WebHooksBean();
		bean.setWebHooks(getProject().getWebHooks());
		
		PropertyEditor<Serializable> editor = PropertyContext.edit("editor", bean, "webHooks");
		
		Form<?> form = new Form<Void>("form") {

			@Override
			protected void onSubmit() {
				super.onSubmit();
				getSession().success("Web hooks saved");
				getProject().setWebHooks(bean.getWebHooks());
				OneDev.getInstance(ProjectManager.class).save(getProject());
				setResponsePage(WebHooksPage.class, WebHooksPage.paramsOf(getProject()));
			}
			
		};
		form.add(new FencedFeedbackPanel("feedback", form));
		form.add(editor);
		add(form);
	}

	@Override
	protected Component newProjectTitle(String componentId) {
		return new Label(componentId, "Web Hooks");
	}

}
