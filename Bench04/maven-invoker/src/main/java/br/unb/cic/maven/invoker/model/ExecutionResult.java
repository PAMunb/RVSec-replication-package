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

	private String project;
	private String profile;
	private boolean passed;
	private long time;
	private Exception exception;
	
	public ExecutionResult(String project, String profile, boolean passed, long time) {
		this.project = project;
		this.profile = profile;
		this.passed = passed;
		this.time = time;
	}
	
}
