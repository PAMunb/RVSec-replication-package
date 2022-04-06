package br.unb.cic.maven.invoker;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.maven.shared.invoker.MavenInvocationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.unb.cic.maven.invoker.io.ConfigurationParserYaml;
import br.unb.cic.maven.invoker.model.Configuration;
import br.unb.cic.maven.invoker.model.ExecutionResult;
import br.unb.cic.maven.invoker.model.Project;

public class Main {
	private static final Logger log = LoggerFactory.getLogger(Main.class);
	
	private static final String CONFIG_FILE = "configuration.yaml";

	private ConfigurationParserYaml configParser = new ConfigurationParserYaml();

	public void execute(String configurationFileName) throws IOException {
		log.info("Starting execution: "+configurationFileName);
		File configurationFile = new File(configurationFileName);

		Configuration configuration = configParser.read(configurationFile);

		List<ExecutionResult> results = new LinkedList<>();

		MavenInvoker invoker = new MavenInvoker();

		for (String profile : configuration.getProfiles()) {
			for (Project project : configuration.getProjects()) {
				try {
					ExecutionResult result = invoker.execute(project, profile);
					results.add(result);
				} catch (MavenInvocationException e) {
					e.printStackTrace();
				}
			}
		}

//        System.out.println("RESULTS: ");   
//        System.out.format("%25s%10s%15s%n", "PROJECT", "PASSED", "TIME (ms)");
//        for (ExecutionResult result : results) {
//            System.out.format("%25s%10b%15s%n", result.getBaseDir(), result.isPassed(), result.getTimeMillis());
//        }

	}

	public static void main(String[] args) {
		String file = CONFIG_FILE;
		if (args.length == 1) {
			file = args[0];
		}

		try {
			new Main().execute(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
