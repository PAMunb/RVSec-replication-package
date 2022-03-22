package br.unb.cic.maven.invoker.model;

import java.util.List;
import java.util.Objects;

public class Project {
    private String baseDir;
    private List<String> modules;

    public Project() {

    }

    public Project(String baseDir, List<String> modules) {
        this.baseDir = baseDir;
        this.modules = modules;
    }

    public String getBaseDir() {
        return baseDir;
    }

    public void setBaseDir(String baseDir) {
        this.baseDir = baseDir;
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseDir, modules);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Project other = (Project) obj;
        return Objects.equals(baseDir, other.baseDir) && Objects.equals(modules, other.modules);
    }

    @Override
    public String toString() {
        return String.format("Project [baseDir=%s, modules=%s]", baseDir, modules);
    }

}
