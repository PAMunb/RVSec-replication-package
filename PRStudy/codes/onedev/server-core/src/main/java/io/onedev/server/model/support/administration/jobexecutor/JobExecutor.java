package io.onedev.server.model.support.administration.jobexecutor;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;
import javax.ws.rs.core.Response;

import org.hibernate.validator.constraints.NotEmpty;

import com.google.common.base.Splitter;
import com.google.common.base.Throwables;

import io.onedev.commons.loader.ExtensionPoint;
import io.onedev.commons.utils.FileUtils;
import io.onedev.server.OneDev;
import io.onedev.server.buildspec.job.JobContext;
import io.onedev.server.util.ExceptionUtils;
import io.onedev.server.util.PKCS12CertExtractor;
import io.onedev.server.util.ServerConfig;
import io.onedev.server.util.usage.Usage;
import io.onedev.server.util.validation.annotation.DnsName;
import io.onedev.server.web.editable.annotation.Editable;
import io.onedev.server.web.editable.annotation.JobAuthorization;

@ExtensionPoint
@Editable
public abstract class JobExecutor implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean enabled = true;
	
	private String name;
	
	private String jobAuthorization;
	
	private int cacheTTL = 7;
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Editable(order=10)
	@DnsName //this name may be used as namespace/network prefixes, so put a strict constraint
	@NotEmpty
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Editable(order=10000, placeholder="Can be used by any jobs", 
			description="Optionally specify jobs authorized to use this executor")
	@JobAuthorization
	@Nullable
	public String getJobAuthorization() {
		return jobAuthorization;
	}

	public void setJobAuthorization(String jobAuthorization) {
		this.jobAuthorization = jobAuthorization;
	}

	@Editable(order=50000, group="More Settings", description="Specify job cache TTL (time to live) by days. "
			+ "OneDev may create multiple job caches even for same cache key to avoid cache conflicts when "
			+ "running jobs concurrently. This setting tells OneDev to remove caches inactive for specified "
			+ "time period to save disk space")
	public int getCacheTTL() {
		return cacheTTL;
	}

	public void setCacheTTL(int cacheTTL) {
		this.cacheTTL = cacheTTL;
	}
	
	public abstract void execute(String jobToken, JobContext context);
	
	public boolean isPlaceholderAllowed() {
		return true;
	}
	
	public Usage onDeleteProject(String projectPath) {
		Usage usage = new Usage();
		if (jobAuthorization != null 
				&& io.onedev.server.job.authorization.JobAuthorization.parse(jobAuthorization).isUsingProject(projectPath)) {
			usage.add("job requirement" );
		}
		return usage;
	}
	
	public void onMoveProject(String oldPath, String newPath) {
		if (jobAuthorization != null) {
			io.onedev.server.job.authorization.JobAuthorization parsedJobAuthorization = 
					io.onedev.server.job.authorization.JobAuthorization.parse(jobAuthorization);
			parsedJobAuthorization.onMoveProject(oldPath, newPath);
			jobAuthorization = parsedJobAuthorization.toString();
		}
	}

	public Usage onDeleteUser(String userName) {
		Usage usage = new Usage();
		if (jobAuthorization != null 
				&& io.onedev.server.job.authorization.JobAuthorization.parse(jobAuthorization).isUsingUser(userName)) {
			usage.add("job authorization" );
		}
		return usage;
	}
	
	public void onRenameUser(String oldName, String newName) {
		if (jobAuthorization != null) {
			io.onedev.server.job.authorization.JobAuthorization parsedJobAuthorization = 
					io.onedev.server.job.authorization.JobAuthorization.parse(jobAuthorization);
			parsedJobAuthorization.onRenameUser(oldName, newName);
			jobAuthorization = parsedJobAuthorization.toString();
		}
	}
	
	protected List<String> getTrustCertContent() {
		List<String> trustCertContent = new ArrayList<>();
		ServerConfig serverConfig = OneDev.getInstance(ServerConfig.class); 
		File keystoreFile = serverConfig.getKeystoreFile();
		if (keystoreFile != null) {
			String password = serverConfig.getKeystorePassword();
			for (Map.Entry<String, String> entry: new PKCS12CertExtractor(keystoreFile, password).extact().entrySet()) 
				trustCertContent.addAll(Splitter.on('\n').trimResults().splitToList(entry.getValue()));
		}
		if (serverConfig.getTrustCertsDir() != null) {
			for (File file: serverConfig.getTrustCertsDir().listFiles()) {
				if (file.isFile()) {
					try {
						trustCertContent.addAll(FileUtils.readLines(file, UTF_8));
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				}
			}
		}
		return trustCertContent;
	}
	
	protected String getErrorMessage(Exception exception) {
		Response response = ExceptionUtils.buildResponse(exception);
		if (response != null) 
			return response.getEntity().toString();
		else
			return Throwables.getStackTraceAsString(exception);
	}
	
}
