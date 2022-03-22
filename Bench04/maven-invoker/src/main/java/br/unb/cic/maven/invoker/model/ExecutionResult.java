package br.unb.cic.maven.invoker.model;

import java.util.Objects;

public class ExecutionResult {
    private String baseDir;
    private boolean passed;
    private long timeMillis;
    private Exception exception;

    public ExecutionResult(String baseDir, boolean passed, long timeMillis) {
        this(baseDir, passed, timeMillis, null);
    }

    public ExecutionResult(String baseDir, boolean passed, long timeMillis, Exception exception) {
        this.baseDir = baseDir;
        this.passed = passed;
        this.timeMillis = timeMillis;
        this.exception = exception;
    }

    public String getBaseDir() {
        return baseDir;
    }

    public boolean isPassed() {
        return passed;
    }

    public long getTimeMillis() {
        return timeMillis;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseDir, exception, passed, timeMillis);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ExecutionResult other = (ExecutionResult) obj;
        return Objects.equals(baseDir, other.baseDir) && Objects.equals(exception, other.exception) && passed == other.passed && timeMillis == other.timeMillis;
    }

    @Override
    public String toString() {
        return String.format("ExecutionResult [baseDir=%s, passed=%s, timeMillis=%s]", baseDir, passed, timeMillis);
    }

}
