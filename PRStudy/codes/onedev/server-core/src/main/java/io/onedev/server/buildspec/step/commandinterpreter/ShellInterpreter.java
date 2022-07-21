package io.onedev.server.buildspec.step.commandinterpreter;

import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import io.onedev.k8shelper.ShellFacade;
import io.onedev.k8shelper.CommandFacade;
import io.onedev.server.util.validation.annotation.Code;
import io.onedev.server.web.editable.annotation.Editable;
import io.onedev.server.web.editable.annotation.Interpolative;

@Editable(order=200, name="Linux Shell")
public class ShellInterpreter extends Interpreter {

	private static final long serialVersionUID = 1L;
	
	private String shell = "bash";

	@Editable(order=100, name="Shell", description="Specify shell to be used")
	@NotEmpty
	public String getShell() {
		return shell;
	}

	public void setShell(String shell) {
		this.shell = shell;
	}

	@Editable(order=110, description="Specify shell commands to execute "
			+ "under the <a href='$docRoot/pages/concepts.md#job-workspace' target='_blank'>job workspace</a>")
	@Interpolative
	@Code(language=Code.SHELL, variableProvider="suggestVariables")
	@Size(min=1, message="may not be empty")
	@Override
	public List<String> getCommands() {
		return super.getCommands();
	}

	@Override
	public void setCommands(List<String> commands) {
		super.setCommands(commands);
	}

	@Override
	public CommandFacade getExecutable(String image, boolean useTTY) {
		return new ShellFacade(image, shell, getCommands(), useTTY);
	}

}
