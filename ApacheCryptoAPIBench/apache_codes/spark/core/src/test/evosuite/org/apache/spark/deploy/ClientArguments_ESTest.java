/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 21:46:51 GMT 2022
 */

package org.apache.spark.deploy;

//import org.junit.Test;
//import static org.junit.Assert.*;
//import static org.evosuite.runtime.EvoAssertions.*;
//import org.apache.log4j.Level;
//import org.apache.spark.deploy.ClientArguments;
//import org.evosuite.runtime.EvoRunner;
//import org.evosuite.runtime.EvoRunnerParameters;
//import org.evosuite.runtime.System;
//import org.junit.runner.RunWith;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ClientArguments_ESTest { //extends ClientArguments_ESTest_scaffolding {

//  @Test(timeout = 4000)
//  public void test00()  throws Throwable  {
//      String[] stringArray0 = new String[7];
//      stringArray0[0] = "-s";
//      stringArray0[1] = "launch";
//      stringArray0[3] = "; F=~RKmx?wD|L";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: System.SystemExitException");
//      
//      } catch(System.SystemExitException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.evosuite.runtime.System", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test01()  throws Throwable  {
//      String[] stringArray0 = new String[8];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "Failed when loading Spark properties from ";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      clientArguments0.memory_$eq((-2895));
//      int int0 = clientArguments0.memory();
//      assertEquals((-2895), int0);
//  }
//
//  @Test(timeout = 4000)
//  public void test02()  throws Throwable  {
//      String[] stringArray0 = new String[8];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "kill";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      clientArguments0.jarUrl_$eq(stringArray0[5]);
//      clientArguments0.jarUrl();
//      assertEquals(1024, clientArguments0.memory());
//      assertEquals(1, clientArguments0.DEFAULT_CORES());
//  }
//
//  @Test(timeout = 4000)
//  public void test03()  throws Throwable  {
//      String[] stringArray0 = new String[8];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "Failed when toading Spark properties frm ";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      clientArguments0.jarUrl_$eq("jpiUHs");
//      clientArguments0.jarUrl();
//      assertEquals(1024, clientArguments0.DEFAULT_MEMORY());
//      assertEquals(1, clientArguments0.cores());
//  }
//
//  @Test(timeout = 4000)
//  public void test04()  throws Throwable  {
//      String[] stringArray0 = new String[9];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "kill";
//      stringArray0[2] = "kill";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      clientArguments0.driverId();
//      assertEquals(1024, clientArguments0.memory());
//      assertEquals(1, clientArguments0.DEFAULT_CORES());
//  }
//
//  @Test(timeout = 4000)
//  public void test05()  throws Throwable  {
//      String[] stringArray0 = new String[8];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "Failed when loading Spark properties from ";
//      stringArray0[2] = "";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      clientArguments0.driverId();
//      assertEquals(1024, clientArguments0.memory());
//      assertEquals(1, clientArguments0.cores());
//  }
//
//  @Test(timeout = 4000)
//  public void test06()  throws Throwable  {
//      String[] stringArray0 = new String[8];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "Failed when loading Spark properties from ";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      clientArguments0.cores_$eq(0);
//      int int0 = clientArguments0.cores();
//      assertEquals(1, clientArguments0.DEFAULT_CORES());
//      assertEquals(0, int0);
//  }
//
//  @Test(timeout = 4000)
//  public void test07()  throws Throwable  {
//      // Undeclared exception!
//      try { 
//        ClientArguments.isValidJarUrl((String) null);
//        fail("Expecting exception: NullPointerException");
//      
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test08()  throws Throwable  {
//      String[] stringArray0 = new String[28];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "kill";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      clientArguments0.masters_$eq(stringArray0);
//      assertEquals(1024, clientArguments0.DEFAULT_MEMORY());
//      assertEquals(1, clientArguments0.cores());
//  }
//
//  @Test(timeout = 4000)
//  public void test09()  throws Throwable  {
//      String[] stringArray0 = new String[8];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "Failed when loading Spark properties from ";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      clientArguments0.supervise_$eq(false);
//      assertFalse(clientArguments0.supervise());
//      assertEquals(1024, clientArguments0.DEFAULT_MEMORY());
//      assertEquals(1, clientArguments0.DEFAULT_CORES());
//  }
//
//  @Test(timeout = 4000)
//  public void test10()  throws Throwable  {
//      String[] stringArray0 = new String[3];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "kill";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      clientArguments0.driverId_$eq("kill");
//      assertEquals(1024, clientArguments0.memory());
//      assertEquals(1, clientArguments0.DEFAULT_CORES());
//  }
//
//  @Test(timeout = 4000)
//  public void test11()  throws Throwable  {
//      String[] stringArray0 = new String[8];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "Faled when loading Sparkpropertes from ";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      clientArguments0.cmd_$eq("D-s&eMbPq'SqOl4&%5N");
//      assertEquals(1, clientArguments0.cores());
//      assertEquals(1024, clientArguments0.memory());
//  }
//
//  @Test(timeout = 4000)
//  public void test12()  throws Throwable  {
//      boolean boolean0 = ClientArguments.isValidJarUrl("e5:?8");
//      assertFalse(boolean0);
//  }
//
//  @Test(timeout = 4000)
//  public void test13()  throws Throwable  {
//      boolean boolean0 = ClientArguments.isValidJarUrl("Ex3:/Y");
//      assertFalse(boolean0);
//  }
//
//  @Test(timeout = 4000)
//  public void test14()  throws Throwable  {
//      String[] stringArray0 = new String[2];
//      stringArray0[0] = "kill";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: System.SystemExitException");
//      
//      } catch(System.SystemExitException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.evosuite.runtime.System", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test15()  throws Throwable  {
//      String[] stringArray0 = new String[1];
//      stringArray0[0] = "kill";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: System.SystemExitException");
//      
//      } catch(System.SystemExitException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.evosuite.runtime.System", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test16()  throws Throwable  {
//      String[] stringArray0 = new String[8];
//      stringArray0[0] = "launch";
//      stringArray0[2] = "launch";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: System.SystemExitException");
//      
//      } catch(System.SystemExitException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.evosuite.runtime.System", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test17()  throws Throwable  {
//      String[] stringArray0 = new String[7];
//      stringArray0[0] = "launch";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: NullPointerException");
//      
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test18()  throws Throwable  {
//      String[] stringArray0 = new String[3];
//      stringArray0[0] = "launch";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: System.SystemExitException");
//      
//      } catch(System.SystemExitException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.evosuite.runtime.System", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test19()  throws Throwable  {
//      String[] stringArray0 = new String[2];
//      stringArray0[0] = "launch";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: System.SystemExitException");
//      
//      } catch(System.SystemExitException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.evosuite.runtime.System", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test20()  throws Throwable  {
//      String[] stringArray0 = new String[1];
//      stringArray0[0] = "launch";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: System.SystemExitException");
//      
//      } catch(System.SystemExitException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.evosuite.runtime.System", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test21()  throws Throwable  {
//      String[] stringArray0 = new String[2];
//      stringArray0[0] = "-v";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: System.SystemExitException");
//      
//      } catch(System.SystemExitException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.evosuite.runtime.System", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test22()  throws Throwable  {
//      String[] stringArray0 = new String[1];
//      stringArray0[0] = "-h";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: System.SystemExitException");
//      
//      } catch(System.SystemExitException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.evosuite.runtime.System", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test23()  throws Throwable  {
//      String[] stringArray0 = new String[1];
//      stringArray0[0] = "--help";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: System.SystemExitException");
//      
//      } catch(System.SystemExitException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.evosuite.runtime.System", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test24()  throws Throwable  {
//      String[] stringArray0 = new String[7];
//      stringArray0[0] = "--memory";
//      stringArray0[1] = "--memory";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: System.SystemExitException");
//      
//      } catch(System.SystemExitException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.evosuite.runtime.System", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test25()  throws Throwable  {
//      String[] stringArray0 = new String[2];
//      stringArray0[0] = "-m";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: NullPointerException");
//      
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.apache.spark.network.util.JavaUtils", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test26()  throws Throwable  {
//      String[] stringArray0 = new String[1];
//      stringArray0[0] = "--memory";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: System.SystemExitException");
//      
//      } catch(System.SystemExitException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.evosuite.runtime.System", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test27()  throws Throwable  {
//      String[] stringArray0 = new String[6];
//      stringArray0[0] = "--cores";
//      stringArray0[1] = "0";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: System.SystemExitException");
//      
//      } catch(System.SystemExitException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.evosuite.runtime.System", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test28()  throws Throwable  {
//      String[] stringArray0 = new String[2];
//      stringArray0[0] = "--cores";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: System.SystemExitException");
//      
//      } catch(System.SystemExitException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.evosuite.runtime.System", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test29()  throws Throwable  {
//      String[] stringArray0 = new String[1];
//      stringArray0[0] = "-c";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: System.SystemExitException");
//      
//      } catch(System.SystemExitException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.evosuite.runtime.System", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test30()  throws Throwable  {
//      String[] stringArray0 = new String[20];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "kill";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      clientArguments0.driverId();
//      assertEquals(1024, clientArguments0.DEFAULT_MEMORY());
//      assertEquals(1, clientArguments0.cores());
//  }
//
//  @Test(timeout = 4000)
//  public void test31()  throws Throwable  {
//      String[] stringArray0 = new String[20];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "kill";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      clientArguments0.masters();
//      assertEquals(1024, clientArguments0.DEFAULT_MEMORY());
//      assertEquals(1, clientArguments0.cores());
//  }
//
//  @Test(timeout = 4000)
//  public void test32()  throws Throwable  {
//      String[] stringArray0 = new String[20];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "kill";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      clientArguments0.mainClass();
//      assertEquals(1, clientArguments0.cores());
//      assertEquals(1024, clientArguments0.DEFAULT_MEMORY());
//  }
//
//  @Test(timeout = 4000)
//  public void test33()  throws Throwable  {
//      String[] stringArray0 = new String[28];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "kill";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      clientArguments0.driverOptions();
//      assertEquals(1024, clientArguments0.DEFAULT_MEMORY());
//      assertEquals(1, clientArguments0.DEFAULT_CORES());
//  }
//
//  @Test(timeout = 4000)
//  public void test34()  throws Throwable  {
//      String[] stringArray0 = new String[6];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "kill";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      int int0 = clientArguments0.cores();
//      assertEquals(1, int0);
//      assertEquals(1024, clientArguments0.memory());
//  }
//
//  @Test(timeout = 4000)
//  public void test35()  throws Throwable  {
//      String[] stringArray0 = new String[20];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "kill";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      int int0 = clientArguments0.memory();
//      assertEquals(1, clientArguments0.DEFAULT_CORES());
//      assertEquals(1024, int0);
//  }
//
//  @Test(timeout = 4000)
//  public void test36()  throws Throwable  {
//      String[] stringArray0 = new String[20];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "kill";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      clientArguments0.cmd();
//      assertEquals(1024, clientArguments0.DEFAULT_MEMORY());
//      assertEquals(1, clientArguments0.DEFAULT_CORES());
//  }
//
//  @Test(timeout = 4000)
//  public void test37()  throws Throwable  {
//      int int0 = ClientArguments.DEFAULT_MEMORY();
//      assertEquals(1024, int0);
//  }
//
//  @Test(timeout = 4000)
//  public void test38()  throws Throwable  {
//      String[] stringArray0 = new String[5];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      clientArguments0.jarUrl();
//      assertEquals(1, clientArguments0.cores());
//      assertEquals(1024, clientArguments0.memory());
//  }
//
//  @Test(timeout = 4000)
//  public void test39()  throws Throwable  {
//      String[] stringArray0 = new String[20];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "kill";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      Level level0 = clientArguments0.logLevel();
//      clientArguments0.logLevel_$eq(level0);
//      assertEquals(1024, clientArguments0.memory());
//      assertEquals(1, clientArguments0.cores());
//  }
//
//  @Test(timeout = 4000)
//  public void test40()  throws Throwable  {
//      String[] stringArray0 = new String[20];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "kill";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      clientArguments0.mainClass_$eq("kill");
//      clientArguments0.mainClass();
//      assertEquals(1, clientArguments0.DEFAULT_CORES());
//      assertEquals(1024, clientArguments0.memory());
//  }
//
//  @Test(timeout = 4000)
//  public void test41()  throws Throwable  {
//      boolean boolean0 = ClientArguments.DEFAULT_SUPERVISE();
//      assertFalse(boolean0);
//  }
//
//  @Test(timeout = 4000)
//  public void test42()  throws Throwable  {
//      int int0 = ClientArguments.DEFAULT_CORES();
//      assertEquals(1, int0);
//  }
//
//  @Test(timeout = 4000)
//  public void test43()  throws Throwable  {
//      String[] stringArray0 = new String[18];
//      stringArray0[0] = "--supervise";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: System.SystemExitException");
//      
//      } catch(System.SystemExitException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.evosuite.runtime.System", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test44()  throws Throwable  {
//      String[] stringArray0 = new String[5];
//      stringArray0[0] = "kill";
//      stringArray0[1] = "/ZY";
//      ClientArguments clientArguments0 = new ClientArguments(stringArray0);
//      clientArguments0.supervise();
//      assertEquals(1, clientArguments0.DEFAULT_CORES());
//      assertEquals(1024, clientArguments0.memory());
//  }
//
//  @Test(timeout = 4000)
//  public void test45()  throws Throwable  {
//      String[] stringArray0 = new String[1];
//      stringArray0[0] = "--verbose";
//      ClientArguments clientArguments0 = null;
//      try {
//        clientArguments0 = new ClientArguments(stringArray0);
//        fail("Expecting exception: System.SystemExitException");
//      
//      } catch(System.SystemExitException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.evosuite.runtime.System", e);
//      }
//  }
}
