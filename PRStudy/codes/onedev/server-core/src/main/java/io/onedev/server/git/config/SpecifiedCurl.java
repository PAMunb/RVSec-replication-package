package io.onedev.server.git.config;

import org.hibernate.validator.constraints.NotEmpty;

import io.onedev.server.web.editable.annotation.Editable;
import io.onedev.server.web.editable.annotation.OmitName;

@Editable(name="Use Specified curl", order=200)
public class SpecifiedCurl extends CurlConfig {

	private static final long serialVersionUID = 1L;
	
	private String curlPath;
	
	@Editable(name="curl Path", description="Specify path to curl executable, for instance: <tt>/usr/bin/curl</tt>")
	@OmitName
	@NotEmpty
	public String getCurlPath() {
		return curlPath;
	}

	public void setCurlPath(String curlPath) {
		this.curlPath = curlPath;
	}

	@Override
	public String getExecutable() {
		return curlPath;
	}

}
