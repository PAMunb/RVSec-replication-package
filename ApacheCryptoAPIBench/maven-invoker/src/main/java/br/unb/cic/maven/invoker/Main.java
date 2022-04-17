package br.unb.cic.maven.invoker;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.maven.shared.invoker.MavenInvocationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.unb.cic.maven.invoker.io.ConfigurationReader;
import br.unb.cic.maven.invoker.io.ResultsWriter;
import br.unb.cic.maven.invoker.model.Configuration;
import br.unb.cic.maven.invoker.model.ExecutionResult;
import br.unb.cic.maven.invoker.model.Project;

public class Main {
	private static final Logger log = LoggerFactory.getLogger(Main.class);

	private static final String CONFIG_FILE = "configuration.yaml";
	private static final String RESULTS_FILE = "results.csv";

	private ConfigurationReader configReader = new ConfigurationReader();
	private ResultsWriter resultsWriter = new ResultsWriter();

	public void execute(String configurationFileName) throws IOException {
		log.info("Starting execution: " + configurationFileName);
		File configurationFile = new File(configurationFileName);
		
		Long start = System.currentTimeMillis();

		Configuration configuration = configReader.read(configurationFile);

		List<ExecutionResult> results = new LinkedList<>();

		MavenInvoker invoker = new MavenInvoker();

		int runCont = 0;
		while (runCont < configuration.getRuns()) {
			log.info("RUN: " + (runCont + 1));
			for (String profile : configuration.getProfiles()) {
				log.info("PROFILE: " + profile);
				for (Project project : configuration.getProjects()) {
					log.info("PROJECT: " + project.getBaseDir());
					try {
						ExecutionResult result = invoker.execute(project, profile);
						results.add(result);
						log.info(String.format("Executed: project=%s, profile=%s, passed=%b, time=%d", result.getProject(), result.getProfile(), result.isPassed(), result.getTime()));
					} catch (MavenInvocationException e) {
						log.error("Error while executing: profile '" + profile + "' on project '" + project + "' ", e);
					}
				}
			}
			runCont++;
		}

		Long end = System.currentTimeMillis();
		log.info("Finished execution: "+(end-start)+"ms");
		
		log.info("Saving results: " + results.size());
		resultsWriter.write(results, RESULTS_FILE);
	}

	public static void main(String[] args) {
		String file = CONFIG_FILE;
		if (args.length == 1) {
			file = args[0];
		}

		try {
			new Main().execute(file);
		} catch (Exception e) {
			log.error("Error",e);
		}
	}

}
