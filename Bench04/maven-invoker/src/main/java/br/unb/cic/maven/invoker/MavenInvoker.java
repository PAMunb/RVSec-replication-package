package br.unb.cic.maven.invoker;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.InvocationRequest;
import org.apache.maven.shared.invoker.InvocationResult;
import org.apache.maven.shared.invoker.Invoker;
import org.apache.maven.shared.invoker.MavenInvocationException;

import br.unb.cic.maven.invoker.model.ExecutionResult;
import br.unb.cic.maven.invoker.model.Project;

public class MavenInvoker {
    private Invoker invoker = new DefaultInvoker();

    public ExecutionResult execute(Project project) throws MavenInvocationException {
        return execute(project.getBaseDir(), project.getModules());
    }
    
    public ExecutionResult execute(String baseDir, List<String> projects) throws MavenInvocationException {
        System.out.println("Executing: "+baseDir);
        String pomFile = baseDir + File.separator + "pom.xml";

        InvocationRequest request = new DefaultInvocationRequest();
        request.setPomFile(new File(pomFile));
        request.setGoals(Arrays.asList("clean", "test"));
        request.setAlsoMake(true);
        request.setBaseDirectory(new File(baseDir));
        request.setBatchMode(true);
        request.setProjects(projects);
        request.setQuiet(true);

        long start = System.currentTimeMillis();
        InvocationResult result = invoker.execute(request);
        long end = System.currentTimeMillis();

        boolean passed = result.getExitCode() == 0;

        ExecutionResult executionResult = new ExecutionResult(baseDir, passed, (end - start));

        if (!passed) {
            executionResult.setException(result.getExecutionException());
        }

        return executionResult;
    }
    
}
