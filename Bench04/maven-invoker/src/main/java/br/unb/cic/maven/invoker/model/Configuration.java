package br.unb.cic.maven.invoker.model;

import java.util.List;
import java.util.Objects;

public class Configuration {
    private List<Project> projects;

    public Configuration() {
        
    }
    public Configuration(List<Project> projects) {
        this.projects = projects;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public int hashCode() {
        return Objects.hash(projects);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Configuration other = (Configuration) obj;
        return Objects.equals(projects, other.projects);
    }

    @Override
    public String toString() {
        return String.format("Configuration [projects=%s]", projects);
    }

}
