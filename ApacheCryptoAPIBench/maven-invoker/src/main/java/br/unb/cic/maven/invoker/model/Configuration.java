package br.unb.cic.maven.invoker.model;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Configuration implements Serializable {
	private static final long serialVersionUID = 1L;

	private int runs = 1;
	private List<String> profiles;
	private List<Project> projects;

}
