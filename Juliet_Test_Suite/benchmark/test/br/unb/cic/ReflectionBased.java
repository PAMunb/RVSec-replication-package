package br.unb.cic;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.common.reflect.ClassPath;

import br.unb.cic.mop.eh.ErrorCollector;

/*
 * testcases.CWE129_Improper_Validation_of_Array_Index.s04
testcases.CWE129_Improper_Validation_of_Array_Index.s05
testcases.CWE190_Integer_Overflow.s01
testcases.CWE190_Integer_Overflow.s03
testcases.CWE190_Integer_Overflow.s04
testcases.CWE190_Integer_Overflow.s05
testcases.CWE190_Integer_Overflow.s06
testcases.CWE190_Integer_Overflow.s07
testcases.CWE191_Integer_Underflow.s01
testcases.CWE191_Integer_Underflow.s02
testcases.CWE191_Integer_Underflow.s03
testcases.CWE191_Integer_Underflow.s04
testcases.CWE191_Integer_Underflow.s05
testcases.CWE197_Numeric_Truncation_Error.s02
testcases.CWE256_Plaintext_Storage_of_Password
testcases.CWE315_Plaintext_Storage_in_Cookie
testcases.CWE319_Cleartext_Tx_Sensitive_Info
testcases.CWE321_Hard_Coded_Cryptographic_Key
testcases.CWE325_Missing_Required_Cryptographic_Step
testcases.CWE327_Use_Broken_Crypto
CWE328 ???????
testcases.CWE329_Not_Using_Random_IV_with_CBC_Mode
testcases.CWE336_Same_Seed_in_PRNG
testcases.CWE338_Weak_PRNG
testcases.CWE369_Divide_by_Zero.s02
testcases.CWE369_Divide_by_Zero.s03
testcases.CWE398_Poor_Code_Quality
testcases.CWE400_Resource_Exhaustion.s02
testcases.CWE400_Resource_Exhaustion.s03
testcases.CWE404_Improper_Resource_Shutdown
testcases.CWE478_Missing_Default_Case_in_Switch
testcases.CWE481_Assigning_Instead_of_Comparing
testcases.CWE482_Comparing_Instead_of_Assigning
testcases.CWE483_Incorrect_Block_Delimitation
testcases.CWE484_Omitted_Break_Statement_in_Switch
testcases.CWE506_Embedded_Malicious_Code
testcases.CWE511_Logic_Time_Bomb
testcases.CWE570_Expression_Always_False
testcases.CWE571_Expression_Always_True
testcases.CWE674_Uncontrolled_Recursion
testcases.CWE759_Unsalted_One_Way_Hash
testcases.CWE760_Predictable_Salt_One_Way_Hash
testcases.CWE772_Missing_Release_of_Resource
testcases.CWE789_Uncontrolled_Mem_Alloc.s03
 */

public abstract class ReflectionBased {

    private PrintStream original, dummy = null;
    private Logger logger;

    private int executions = 0;
    private int errors = 0;
    private int timeouts = 0;

    @BeforeClass
    public static void setUp() {
        ErrorCollector.instance().reset();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        ErrorCollector.instance().printErrors();
    }

    @Test
    public void executeBenchmark() {
//        setupStandardOutput();
        Set<Class<?>> classes = null;

        try {
            setupLogger();
            classes = findBenchmarkClasses();
        } catch (IOException ex) {
            Assert.fail(ex.getMessage());
        }

        Assert.assertTrue(classes.size() > 0);

        executions = 0;
        errors = 0;

        Set<String> classNames = new HashSet<>();
        String[] emptyArray = {};
        ExecutorService executor = Executors.newCachedThreadPool();
        
        for (Class<?> c : classes) {
            // logger.log(Level.WARNING,"Class: "+c);
            System.err.println("CLASS: " + c.getName());
            Method mainMethod = findMainMethod(c);

            classNames.add(c.getName());

            
            Callable<Object> task = new Callable<Object>() {
                public Object call() {
                    try {
                        if (mainMethod != null) {
                            switch (mainMethod.getParameterCount()) {
                                case 0:
                                    mainMethod.invoke(null);
                                    executions++;
                                    break;
                                case 1:
                                    mainMethod.invoke(null, (Object) emptyArray);
                                    executions++;
                                    break;
                                default:
                                    logger.log(Level.WARNING, String.format("Error in class %s. Method main has %d parameters", c.getName(), mainMethod.getParameterCount()));
                            }
                        }
                    } catch (IllegalArgumentException ex) {
                        logger.log(Level.WARNING, "Error on method: " + mainMethod.toString());
                        errors++;
                    } catch (Exception ex) {
                        logger.log(Level.WARNING, ex.getCause() + " " + ex.getMessage() + " when executing " + c.getName());
                        ex.getCause().printStackTrace();
                        errors++;
                    }
                    return null;
                }
            };
            Future<Object> future = executor.submit(task);
            try {
                future.get(1, TimeUnit.SECONDS);
                executions++;
                System.err.println("executou ********************************");
            } catch (TimeoutException ex) {
                // handle the timeout
                System.err.println(">>>>> TIMEOUT");
                timeouts++;
            } catch (InterruptedException e) {
                // handle the interrupts
            } catch (ExecutionException e) {
                // handle other exceptions
            } finally {
                future.cancel(true); // may or may not desire this
            }

        }
        
        System.err.println("TERMINOU !!!!!!!!!!!!!!!!!!!!!!");
        System.err.println("executions="+executions);

        Assert.assertTrue(executions > 0);

        logger.log(Level.WARNING, "number of classes: " + classes.size());
        logger.log(Level.WARNING, "number of distinct classes: " + classNames.size());
        logger.log(Level.WARNING, "number of executed methods: " + executions);
        logger.log(Level.WARNING, "number of executions with errors: " + errors);

//        restoreStandardOutput();
    }

    /* finds the classes of our second benchmark */
    private Set<Class<?>> findBenchmarkClasses() throws IOException {
        ClassPath cp = ClassPath.from(getClass().getClassLoader());

        Set<Class<?>> classes = new HashSet<>();

        // cp.getTopLevelClassesRecursive(definePackage()).stream().forEach(ci ->
        // classes.add(ci.load()));
        cp.getTopLevelClassesRecursive(definePackage())
                .stream()
                .filter(ci -> "Main".equals(ci.getSimpleName()))
                //.filter(ci -> ci.getName().contains("CWE256_Plaintext_Storage_of_Password"))
                //.filter(ci -> ci.getName().contains("CWE197_Numeric_Truncation_Error"))
//                .sorted()
                .forEach(ci -> classes.add(ci.load()));

        return classes;
    }

    protected abstract String definePackage();

    /* finds the main method of a given class */
    private Method findMainMethod(Class<?> c) {
        Method mainMethod = null;
        Method[] methods = c.getDeclaredMethods();

        for (Method m : methods) {
            if ("main".equals(m.getName())) {
                return m;
            }
        }
        return null;
    }

    /* We use the following method to "silence" the standard output stream */
    private void setupStandardOutput() {
        original = System.out;
        dummy = new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                // do nothing ...
            }
        });
        System.setOut(dummy);
    }

    /* We use the following method to restore the standard output */
    private void restoreStandardOutput() {
        System.setOut(original);
    }

    private void setupLogger() throws IOException {
        FileHandler handler = new FileHandler("target/logger.txt", true);

        handler.setFormatter(new SimpleFormatter());
        handler.setLevel(Level.WARNING);

        logger = Logger.getLogger("");
        logger.setLevel(Level.WARNING);

        logger.addHandler(handler);
    }

}
