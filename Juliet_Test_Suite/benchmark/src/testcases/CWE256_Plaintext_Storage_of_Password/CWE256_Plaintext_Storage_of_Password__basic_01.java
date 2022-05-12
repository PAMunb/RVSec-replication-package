/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE256_Plaintext_Storage_of_Password__basic_01.java
Label Definition File: CWE256_Plaintext_Storage_of_Password__basic.label.xml
Template File: sources-sinks-01.tmpl.java
*/
/*
* @description
* CWE: 256 Plaintext Storage of a Password.  Read the password from a Properties file or a regular file.  In the good case, read the file from the console.
* BadSource:  Read password from a .properties file (from the property named password)
* GoodSource: Read password from a .properties file (from the property named password) and then decrypt it
* Sinks:
*    GoodSink: Decrypt password and use decrypted password as password to connect to DB
*    BadSink : Use password as password to connect to DB
* Flow Variant: 01 Baseline
*
* */

package testcases.CWE256_Plaintext_Storage_of_Password;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import testcasesupport.AbstractTestCase;
import testcasesupport.IO;

public class CWE256_Plaintext_Storage_of_Password__basic_01 extends AbstractTestCase
{

//    private static final String DB_CONNECTION = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
//    private static final String DB_USER = "sa";
//    private static final String DB_PASSWORD = "123456";

    @Override
    public void bad() throws Throwable
    {
        String password;

        password = ""; /* init password */

        /* retrieve the property */
        Properties properties = new Properties();
        FileInputStream streamFileInput = null;
        try
        {
            String fileName = "../common/config.properties";
            File file = new File(fileName);
            System.err.println("01="+file.exists());
            System.err.println("02="+new File("").getAbsolutePath());
            System.err.println("03="+new File("target/classes/testcases/common/config.properties").getAbsolutePath());
            System.err.println("03="+new File("target/classes/testcases/common/config.properties").exists());
            System.err.println("03="+new File("./../common/config.properties").exists());
            System.err.println("04="+getClass().getClassLoader().getResourceAsStream(fileName));
            System.err.println("05="+CWE256_Plaintext_Storage_of_Password__basic_01.class.getClassLoader().getResourceAsStream(fileName));
            System.err.println("06="+Thread.currentThread().getContextClassLoader().getResourceAsStream("testcases/common/config.properties"));
            System.err.println("06="+Thread.currentThread().getContextClassLoader().getResource("testcases/common/config.properties"));
            System.err.println("07="+ClassLoader.getSystemResourceAsStream("testcases/common/config.properties"));
//            System.err.println("05="+new File("tes"));

            //streamFileInput = new FileInputStream("../common/config.properties");
            //streamFileInput = new FileInputStream("target/classes/testcases/common/config.properties");

            //streamFileInput = new FileInputStream(new File(Thread.currentThread().getContextClassLoader().getResource("testcases/common/config.properties").toURI()));
            streamFileInput = getConfiguration();

            properties.load(streamFileInput);

            password = properties.getProperty("password");
            System.err.println("************ PASSWORD: "+password);
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }
        finally
        {
            /* clean up stream reading objects */
            try
            {
                if (streamFileInput != null)
                {
                    streamFileInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
            }
        }

        /* POTENTIAL FLAW: The raw password read from the .properties file is passed on (without being decrypted) */

        /* POTENTIAL FLAW: Use password as a password to connect to a DB  (without being decrypted) */

        Connection dBConnection = null;
        try
        {
            //dBConnection = DriverManager.getConnection("192.168.105.23", "sa", password);
            dBConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, password);
            System.err.println("CONECTOU NO BANCO ******************************");
        }
        catch (SQLException exceptSql)
        {
            IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
        }
        finally
        {
            try
            {
                if (dBConnection != null)
                {
                    dBConnection.close();
                }
            }
            catch (SQLException exceptSql)
            {
                IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
            }
        }

    }

    @Override
    public void good() throws Throwable
    {
//        goodG2B();
//        goodB2G();
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B() throws Throwable
    {
        String password;

        password = ""; /* init password */

        /* retrieve the property */
        Properties properties = new Properties();

        FileInputStream streamFileInput = null;
        try
        {
            streamFileInput = new FileInputStream("../common/config.properties");
            properties.load(streamFileInput);

            password = properties.getProperty("password");
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }
        finally
        {
            /* clean up stream reading objects */
            try
            {
                if (streamFileInput != null)
                {
                    streamFileInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
            }
        }

        /* FIX: password is decrypted before being passed on */
        {
            Cipher aesCipher = Cipher.getInstance("AES");

            /* INCIDENTAL: CWE-321: Use of Hard-coded Cryptographic Key */
            SecretKeySpec secretKeySpec = new SecretKeySpec("ABCDEFGHABCDEFGH".getBytes("UTF-8"), "AES");
            aesCipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            String decryptedPassword = new String(aesCipher.doFinal(password.getBytes("UTF-8")), "UTF-8");
            password = decryptedPassword;
        }

        /* POTENTIAL FLAW: Use password as a password to connect to a DB  (without being decrypted) */

        Connection dBConnection = null;
        try
        {
            dBConnection = DriverManager.getConnection("192.168.105.23", "sa", password);
        }
        catch (SQLException exceptSql)
        {
            IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
        }
        finally
        {
            try
            {
                if (dBConnection != null)
                {
                    dBConnection.close();
                }
            }
            catch (SQLException exceptSql)
            {
                IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
            }
        }

    }

    /* goodB2G() - use badsource and goodsink */
    private void goodB2G() throws Throwable
    {
        String password;

        password = ""; /* init password */

        /* retrieve the property */
        Properties properties = new Properties();
        FileInputStream streamFileInput = null;
        try
        {
            streamFileInput = new FileInputStream("../common/config.properties");
            properties.load(streamFileInput);

            password = properties.getProperty("password");
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }
        finally
        {
            /* clean up stream reading objects */
            try
            {
                if (streamFileInput != null)
                {
                    streamFileInput.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
            }
        }

        /* POTENTIAL FLAW: The raw password read from the .properties file is passed on (without being decrypted) */

        /* FIX: password is decrypted before being used as a database password */
        {
            Cipher aesCipher = Cipher.getInstance("AES");

            /* INCIDENTAL: Hardcoded crypto */
            SecretKeySpec secretKeySpec = new SecretKeySpec("ABCDEFGHABCDEFGH".getBytes("UTF-8"), "AES");
            aesCipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            String decryptedPassword = new String(aesCipher.doFinal(password.getBytes("UTF-8")), "UTF-8");
            password = decryptedPassword;
        }

        Connection dBConnection = null;
        try
        {
            dBConnection = DriverManager.getConnection("192.168.105.23", "sa", password);
        }
        catch (SQLException exceptSql)
        {
            IO.logger.log(Level.WARNING, "Error getting database connection", exceptSql);
        }
        finally
        {
            try
            {
                if (dBConnection != null)
                {
                    dBConnection.close();
                }
            }
            catch (SQLException exceptSql)
            {
                IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
            }
        }

    }

    /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the testcases as one
     * application, which is how source code analysis tools are tested.
     */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

