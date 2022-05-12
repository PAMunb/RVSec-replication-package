/*
@description This abstract class is the base for the majority of
test cases that are not Servlet or class based issue and have both
a "bad" and "good" function.

*/

package testcasesupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public abstract class AbstractTestCase extends AbstractTestCaseBase
{

    public static final String DB_CONNECTION = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
    public static final String DB_USER = "sa";
    public static final String DB_PASSWORD = "123456";

    public abstract void bad() throws Throwable;

    public abstract void good() throws Throwable;

    public FileInputStream getConfiguration() throws FileNotFoundException, URISyntaxException {
        return new FileInputStream(new File(Thread.currentThread().getContextClassLoader().getResource("testcases/common/config.properties").toURI()));
    }

    @Override
    public void runTest(String className)
    {
        IO.writeLine("Starting tests for Class " + className);

        try
        {
            good();

            IO.writeLine("Completed good() for Class " + className);
        }
        catch (Throwable throwableException)
        {
            IO.writeLine("Caught a throwable from good() for Class " + className);

            IO.writeLine("Throwable's message = " + throwableException.getMessage());

            StackTraceElement stackTraceElements[] = throwableException.getStackTrace();

            IO.writeLine("Stack trace below");

            for (StackTraceElement stackTraceElement : stackTraceElements)
            {
                IO.writeLine(stackTraceElement.toString());
            }
        }

        try
        {
            bad();

            IO.writeLine("Completed bad() for Class " + className);
        }
        catch (Throwable throwableException)
        {
            IO.writeLine("Caught a throwable from bad() for Class " + className);

            IO.writeLine("Throwable's message = " + throwableException.getMessage());

            StackTraceElement stackTraceElements[] = throwableException.getStackTrace();

            IO.writeLine("Stack trace below");

            for (StackTraceElement stackTraceElement : stackTraceElements)
            {
                IO.writeLine(stackTraceElement.toString());
            }
        }
    } /* runTest */
}
