package br.unb.cic.maven.invoker.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import br.unb.cic.maven.invoker.model.ExecutionResult;

public class ResultsWriter {

	public void write(List<ExecutionResult> results, String out) throws IOException {
		List<String> list = new ArrayList<>(results.size() + 1);
		list.add("project,profile,passed,time,exception");

		results.forEach(r -> list.add(String.format("%s,%s,%b,%d,%s", r.getProject(), r.getProfile(), r.isPassed(), r.getTime(), (Objects.isNull(r.getException())?"":r.getException()))));

		Files.write(Paths.get(out), list);
	}

}
