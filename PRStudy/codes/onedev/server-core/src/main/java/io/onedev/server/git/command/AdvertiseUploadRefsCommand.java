package io.onedev.server.git.command;

import java.io.File;
import java.io.OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Preconditions;

import io.onedev.commons.utils.command.Commandline;
import io.onedev.commons.utils.command.LineConsumer;

public class AdvertiseUploadRefsCommand extends GitCommand<Void> {

	private static final Logger logger = LoggerFactory.getLogger(AdvertiseUploadRefsCommand.class);
	
	private OutputStream output;
	
	private String protocol;
	
	public AdvertiseUploadRefsCommand(File gitDir) {
		super(gitDir);
	}

	public AdvertiseUploadRefsCommand output(OutputStream output) {
		this.output = output;
		return this;
	}

	public AdvertiseUploadRefsCommand protocol(String protocol) {
		this.protocol = protocol;
		return this;
	}
	
	@Override
	public Void call() {
		Preconditions.checkNotNull(output);
		
		Commandline cmd = cmd();
		
		if (protocol != null)
			cmd.environments().put("GIT_PROTOCOL", protocol);
		
		cmd.addArgs("upload-pack", "--stateless-rpc", "--advertise-refs", ".");
		cmd.execute(output, new LineConsumer() {

			@Override
			public void consume(String line) {
				logger.error(line);
			}
			
		}).checkReturnCode();
		
		return null;
	}

}
