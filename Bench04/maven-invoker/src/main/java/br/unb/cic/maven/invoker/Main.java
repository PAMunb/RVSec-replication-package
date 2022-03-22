package br.unb.cic.maven.invoker;

import com.opencsv.exceptions.CsvValidationException;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.maven.shared.invoker.MavenInvocationException;

import br.unb.cic.maven.invoker.model.Configuration;
import br.unb.cic.maven.invoker.model.ExecutionResult;
import br.unb.cic.maven.invoker.model.Project;

public class Main {
    private static final String CONFIG_FILE = "configuration.csv";

    public void execute(String configurationFileName) throws CsvValidationException, IOException {
        File file = new File(configurationFileName);

        Configuration configuration = ConfigurationReader.read(file);

        List<ExecutionResult> results = new LinkedList<>();
        
        MavenInvoker invoker = new MavenInvoker();

        for (Project project : configuration.getProjects()) {
            try {
                ExecutionResult result = invoker.execute(project);
                results.add(result);
            } catch (MavenInvocationException e) {
                e.printStackTrace();
            }
        }
        
        System.err.println("RESULTS: ");        
        for (ExecutionResult result : results) {
//            System.out.println(result);
            System.out.format("%20s%10b%15s%n", result.getBaseDir(), result.isPassed(), result.getTimeMillis());
        }

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
