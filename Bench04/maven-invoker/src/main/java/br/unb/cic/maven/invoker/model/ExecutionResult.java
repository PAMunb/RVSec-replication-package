package br.unb.cic.maven.invoker.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExecutionResult implements Serializable {
	private static final long serialVersionUID = 1L;

	private String baseDir;
	private String profile;
	private boolean passed;
	private long timeMillis;
	private Exception exception;
	
	public ExecutionResult(String baseDir, String profile, boolean passed, long timeMillis) {
		this.baseDir = baseDir;
		this.profile = profile;
		this.passed = passed;
		this.timeMillis = timeMillis;
	}
	
}
