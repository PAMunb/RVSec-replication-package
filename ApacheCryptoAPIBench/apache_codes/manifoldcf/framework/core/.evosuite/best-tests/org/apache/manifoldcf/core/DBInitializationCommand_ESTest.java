/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 21:06:50 GMT 2022
 */

package org.apache.manifoldcf.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.manifoldcf.core.DBCreate;
import org.apache.manifoldcf.core.DBDrop;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DBInitializationCommand_ESTest extends DBInitializationCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DBDrop dBDrop0 = new DBDrop((String) null, "(");
      String string0 = dBDrop0.getUserName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DBDrop dBDrop0 = new DBDrop("", "");
      String string0 = dBDrop0.getUserName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DBDrop dBDrop0 = new DBDrop((String) null, (String) null);
      String string0 = dBDrop0.getPassword();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DBDrop dBDrop0 = new DBDrop("wPSG5", "wPSG5");
      String string0 = dBDrop0.getPassword();
      assertEquals("wPSG5", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DBDrop dBDrop0 = new DBDrop("Unable to locate configured LoggerContextFactory {}", "");
      String string0 = dBDrop0.getPassword();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DBDrop dBDrop0 = new DBDrop((String) null, (String) null);
      try { 
        dBDrop0.execute();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Initialization failed: Could not read configuration file '/home/pedro/lcf/properties.xml'
         //
         verifyException("org.apache.manifoldcf.core.system.ManifoldCF", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DBCreate dBCreate0 = new DBCreate("?ZlS<sJJ#WKQ56ChBR#", "?ZlS<sJJ#WKQ56ChBR#");
      String string0 = dBCreate0.getUserName();
      assertEquals("?ZlS<sJJ#WKQ56ChBR#", string0);
  }
}