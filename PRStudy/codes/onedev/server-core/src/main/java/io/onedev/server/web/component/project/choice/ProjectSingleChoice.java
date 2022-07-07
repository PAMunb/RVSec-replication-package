package io.onedev.server.web.component.project.choice;

import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.model.IModel;

import io.onedev.server.model.Project;
import io.onedev.server.web.component.select2.Select2Choice;

@SuppressWarnings("serial")
public class ProjectSingleChoice extends Select2Choice<Project> {

	public ProjectSingleChoice(String id, IModel<Project> model, AbstractProjectChoiceProvider choiceProvider) {
		super(id, model, choiceProvider);
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();
		getSettings().setAllowClear(!isRequired());
		if (isRequired())
			getSettings().setPlaceholder("Choose a project...");
		else
			getSettings().setPlaceholder("Not specified");
		getSettings().setFormatResult("onedev.server.projectChoiceFormatter.formatResult");
		getSettings().setFormatSelection("onedev.server.projectChoiceFormatter.formatSelection");
		getSettings().setEscapeMarkup("onedev.server.projectChoiceFormatter.escapeMarkup");
		setConvertEmptyInputStringToNull(true);
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		
		response.render(JavaScriptHeaderItem.forReference(new ProjectChoiceResourceReference()));
	}
	
}