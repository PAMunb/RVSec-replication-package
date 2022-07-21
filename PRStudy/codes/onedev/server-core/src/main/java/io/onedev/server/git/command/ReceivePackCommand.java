package io.onedev.server.git.command;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.annotation.Nullable;

import com.google.common.base.Preconditions;

import io.onedev.commons.utils.command.Commandline;
import io.onedev.commons.utils.command.ExecutionResult;

public class ReceivePackCommand extends GitCommand<ExecutionResult> {

	private InputStream stdin;
	
	private OutputStream stdout;
	
	private OutputStream stderr;
	
	private boolean statelessRpc;
	
	private String protocol;
	
	public ReceivePackCommand(File gitDir, Map<String, String> environments) {
		super(gitDir, environments);
	}
	
	public ReceivePackCommand stdin(InputStream stdin) {
		this.stdin = stdin;
		return this;
	}
	
	public ReceivePackCommand stdout(OutputStream stdout) {
		this.stdout = stdout;
		return this;
	}
	
	public ReceivePackCommand stderr(OutputStream stderr) {
		this.stderr = stderr;
		return this;
	}
	
	public ReceivePackCommand statelessRpc(boolean statelessRpc) {
		this.statelessRpc = statelessRpc;
		return this;
	}
	
	public ReceivePackCommand protocol(@Nullable String protocol) {
		this.protocol = protocol;
		return this;
	}
	
	@Override
	public ExecutionResult call() {
		Preconditions.checkNotNull(stdin);
		Preconditions.checkNotNull(stdout);
		Preconditions.checkNotNull(stderr);
		
		Commandline cmd = cmd();
		
		if (protocol != null)
			cmd.environments().put("GIT_PROTOCOL", protocol);
		
		cmd.addArgs("receive-pack");
		if (statelessRpc)
			cmd.addArgs("--stateless-rpc");
		cmd.addArgs(".");
		
    	return cmd.execute(stdout, stderr, stdin);
	}

}
