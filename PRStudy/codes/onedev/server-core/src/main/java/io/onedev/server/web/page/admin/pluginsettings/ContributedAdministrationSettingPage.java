package io.onedev.server.web.page.admin.pluginsettings;

import java.io.Serializable;

import javax.annotation.Nullable;
import javax.validation.Validator;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormComponentUpdatingBehavior;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import io.onedev.server.OneDev;
import io.onedev.server.entitymanager.SettingManager;
import io.onedev.server.web.editable.BeanContext;
import io.onedev.server.web.editable.BeanEditor;
import io.onedev.server.web.editable.EditableUtils;
import io.onedev.server.web.page.admin.AdministrationPage;
import io.onedev.server.web.page.layout.ContributedAdministrationSetting;
import io.onedev.server.web.page.layout.AdministrationSettingContribution;

@SuppressWarnings("serial")
public class ContributedAdministrationSettingPage extends AdministrationPage {

	public static final String PARAM_SETTING = "setting";
	
	private Class<? extends ContributedAdministrationSetting> settingClass;
	
	public ContributedAdministrationSettingPage(PageParameters params) {
		super(params);
		
		String settingName = params.get(PARAM_SETTING).toString();
		
		for (AdministrationSettingContribution contribution: 
				OneDev.getExtensions(AdministrationSettingContribution.class)) {
			for (Class<? extends ContributedAdministrationSetting> each: contribution.getSettingClasses()) {
				if (getSettingName(each).equals(settingName)) { 
					settingClass = each;
					break;
				}
			}
			if (settingClass != null)
				break;
		}

		if (settingClass == null)
			throw new RuntimeException("Unexpected setting: " + settingName);
	}

	private SettingManager getSettingManager() {
		return OneDev.getInstance(SettingManager.class);		
	}
	
	@Override
	protected void onInitialize() {
		super.onInitialize();
		
		String help = EditableUtils.getDescription(settingClass);
		if (help != null)
			add(new Label("help", help).setEscapeModelStrings(false));
		else
			add(new WebMarkupContainer("help").setVisible(false));
		
		Form<?> form = new Form<Void>("form") {

			@Override
			protected void onSubmit() {
				super.onSubmit();
				
				Component editor = get("editor");
				if (editor instanceof BeanEditor && editor.isVisible())
					getSettingManager().saveContributedSetting(settingClass, (ContributedAdministrationSetting) ((BeanEditor)editor).getModelObject());
				else
					getSettingManager().saveContributedSetting(settingClass, null);
				
				getSession().success("Setting has been saved");
				
				setResponsePage(ContributedAdministrationSettingPage.class, paramsOf(settingClass));
			}
			
		};
		
		form.add(new CheckBox("enable", new IModel<Boolean>() {
			
			@Override
			public void detach() {
			}

			@Override
			public Boolean getObject() {
				Component beanEditor = form.get("editor");
				return beanEditor != null && beanEditor.isVisible();
			}

			@Override
			public void setObject(Boolean object) {
				Component beanEditor = form.get("editor");
				if (beanEditor instanceof BeanEditor || !object) {
					beanEditor.setVisible(object);
				} else {
					try {
						form.replace(newBeanEditor(settingClass.newInstance()));
					} catch (InstantiationException | IllegalAccessException e) {
						throw new RuntimeException(e);
					}
				}
			}
			
		}) {

			@Override
			protected void onConfigure() {
				super.onConfigure();
				try {
					setVisible(!OneDev.getInstance(Validator.class).validate(settingClass.newInstance()).isEmpty());
				} catch (InstantiationException | IllegalAccessException e) {
					throw new RuntimeException(e);
				}
			}
			
		}.add(new AjaxFormComponentUpdatingBehavior("click"){

			@Override
			protected void onUpdate(AjaxRequestTarget target) {
				target.add(form.get("editor"));
			}
			
		}));
		
		Serializable setting = getSettingManager().getContributedSetting(settingClass);
		form.add(newBeanEditor(setting));
		
		add(form);
	}
	
	private Component newBeanEditor(@Nullable Serializable setting) {
		Component beanEditor;
		if (setting != null)
			beanEditor = BeanContext.edit("editor", setting);
		else 
			beanEditor = new WebMarkupContainer("editor").setVisible(false);
		beanEditor.setOutputMarkupPlaceholderTag(true);
		return beanEditor;
	}

	@Override
	protected Component newTopbarTitle(String componentId) {
		return new Label(componentId, EditableUtils.getDisplayName(settingClass));
	}

	private static String getSettingName(Class<?> settingClass) {
		return EditableUtils.getDisplayName(settingClass).replace(' ', '-').toLowerCase();
	}
	
	public static PageParameters paramsOf(Class<?> settingClass) {
		PageParameters params = new PageParameters();
		params.add(PARAM_SETTING, getSettingName(settingClass));
		return params;
	}
	
}
