package br.unb.cic;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.ArrayList; 
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.common.reflect.ClassPath;

import br.unb.cic.mop.eh.ErrorCollector;

public abstract class ReflectionBased {

    private PrintStream original, dummy = null;
    private Logger logger;
    
    //    private static final List<String> packagesToExclude = Arrays.asList("CWE256", "CWE319", "CWE321", "CWE506");

    private static final List<String> packagesToExclude = new ArrayList<>(); // Arrays.asList("CWE256", "CWE319", "CWE321", "CWE506");


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
        setupStandardOutput();
        Set<Class<?>> classes = null;

        try {
            setupLogger();
            classes = findBenchmarkClasses();
        } catch (IOException ex) {
            Assert.fail(ex.getMessage());
        }
        Assert.assertTrue(classes.size() > 0);

        int executions = 0;
        int errors = 0;

        Set<String> classNames = new HashSet<>();
        String[] emptyArray = {};
                
        for (Class<?> c : classes) {            
            if(exclude(c.getName())) {
                continue;
            }
            
            System.err.println(c.getName());
            
            Method mainMethod = findMainMethod(c);
           
            try {
                if (mainMethod != null) {
                    classNames.add(c.getName());
                    
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
            
        }

        Assert.assertTrue(executions > 0);

        //logger.log(Level.WARNING, "number of classes: " + classes.size());
        logger.log(Level.WARNING, "number of distinct classes: " + classNames.size());
        logger.log(Level.WARNING, "number of executed methods: " + executions);
        logger.log(Level.WARNING, "number of executions with errors: " + errors);

        restoreStandardOutput();
    }

    /* finds the classes of our second benchmark */
    private Set<Class<?>> findBenchmarkClasses() throws IOException {
        ClassPath cp = ClassPath.from(getClass().getClassLoader());

        Set<Class<?>> classes = new HashSet<>();

        cp.getTopLevelClassesRecursive(definePackage())
                .stream()
                .filter(ci -> "Main".equals(ci.getSimpleName()))
                //.filter(ci -> ci.getName().contains("CWE256_Plaintext_Storage_of_Password"))
                .forEach(ci -> classes.add(ci.load()));

        return classes;
    }

    protected abstract String definePackage();

    private boolean exclude(String clazz) {
        for (String pack : packagesToExclude) {
            if(clazz.contains(pack)) {
                return true;
            }
        }
        return false;
    }
    
    /* finds the main method of a given class */
    private Method findMainMethod(Class<?> c) {
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

        handler.setFormatter(new SimpleFormatter() {
            private static final String format = "[%1$tF %1$tT] [%2$-7s] %3$s %n";

            @Override
            public synchronized String format(LogRecord lr) {
                return String.format(format,
                        new Date(lr.getMillis()),
                        lr.getLevel().getLocalizedName(),
                        lr.getMessage()
                );
            }
        });
        
        //handler.setFormatter(new SimpleFormatter());               
        handler.setLevel(Level.WARNING);

        logger = Logger.getLogger("");
        logger.setLevel(Level.WARNING);

        logger.addHandler(handler);
    }

}

/* packages that uses JCA
 * 
testcases.CWE129_Improper_Validation_of_Array_Index.s04
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
CWE328 
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
