package io.onedev.server.web.page.project.setting.servicedesk;

import org.apache.wicket.Component;
import org.apache.wicket.Session;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import io.onedev.server.OneDev;
import io.onedev.server.entitymanager.ProjectManager;
import io.onedev.server.model.Project;
import io.onedev.server.security.SecurityUtils;
import io.onedev.server.util.Path;
import io.onedev.server.util.PathNode;
import io.onedev.server.web.editable.BeanContext;
import io.onedev.server.web.editable.BeanEditor;
import io.onedev.server.web.page.project.ProjectPage;
import io.onedev.server.web.page.project.dashboard.ProjectDashboardPage;
import io.onedev.server.web.page.project.setting.ProjectSettingPage;
import io.onedev.server.web.page.project.setting.general.GeneralProjectSettingPage;

@SuppressWarnings("serial")
public class ProjectServiceDeskSettingPage extends ProjectSettingPage {

	private BeanEditor editor;
	
	public ProjectServiceDeskSettingPage(PageParameters params) {
		super(params);
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();
		
		ServiceDeskSettingBean bean = new ServiceDeskSettingBean();
		bean.setServiceDeskName(getProject().getServiceDeskName());
		Form<?> form = new Form<Void>("form") {

			@Override
			protected void onSubmit() {
				super.onSubmit();
				
				ProjectManager projectManager = OneDev.getInstance(ProjectManager.class);
				if (bean.getServiceDeskName() != null) {
					Project projectWithSameServiceDeskName = projectManager.findByServiceDeskName(bean.getServiceDeskName());
					if (projectWithSameServiceDeskName != null && !projectWithSameServiceDeskName.equals(getProject())) {
						editor.error(new Path(new PathNode.Named(ServiceDeskSettingBean.PROP_SERVICE_DESK_NAME)),
								"This service desk name has already been used by another project");
					} 
				} 
				if (editor.isValid()) {
					getProject().setServiceDeskName(bean.getServiceDeskName());
					projectManager.save(getProject());
					setResponsePage(ProjectServiceDeskSettingPage.class, ProjectServiceDeskSettingPage.paramsOf(getProject()));
					Session.get().success("Service desk setting updated");
				}
			}
			
		};
		form.add(editor = BeanContext.edit("editor", bean));
		
		add(form);
	}

	@Override
	protected Component newProjectTitle(String componentId) {
		return new Label(componentId, "<span class='text-truncate'>Service Desk Setting</span>").setEscapeModelStrings(false);
	}

	@Override
	protected void navToProject(Project project) {
		if (SecurityUtils.canManage(project)) {
			if (project.isIssueManagement())
				setResponsePage(ProjectServiceDeskSettingPage.class, paramsOf(project.getId()));
			else
				setResponsePage(GeneralProjectSettingPage.class, paramsOf(project.getId()));
		} else {
			setResponsePage(ProjectDashboardPage.class, ProjectPage.paramsOf(project.getId()));
		}
	}
	
}
