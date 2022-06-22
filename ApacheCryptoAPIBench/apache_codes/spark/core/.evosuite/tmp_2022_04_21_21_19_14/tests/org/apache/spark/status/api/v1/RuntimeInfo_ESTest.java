/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 00:49:27 GMT 2022
 */

package org.apache.spark.status.api.v1;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.spark.status.api.v1.RuntimeInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RuntimeInfo_ESTest extends RuntimeInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RuntimeInfo runtimeInfo0 = new RuntimeInfo("", "p*76QjBH-DKi", (String) null);
      String string0 = runtimeInfo0.scalaVersion();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RuntimeInfo runtimeInfo0 = new RuntimeInfo("", "", "");
      String string0 = runtimeInfo0.scalaVersion();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RuntimeInfo runtimeInfo0 = new RuntimeInfo((String) null, (String) null, "org.apache.spark.status.api.v1.RuntimeInfo");
      String string0 = runtimeInfo0.javaVersion();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RuntimeInfo runtimeInfo0 = new RuntimeInfo("Y%EF!e'HN1MA4=G_f", "Y%EF!e'HN1MA4=G_f", "I");
      String string0 = runtimeInfo0.javaVersion();
      assertEquals("Y%EF!e'HN1MA4=G_f", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RuntimeInfo runtimeInfo0 = new RuntimeInfo("", "p*76QjBH-DKi", (String) null);
      String string0 = runtimeInfo0.javaHome();
      assertEquals("p*76QjBH-DKi", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RuntimeInfo runtimeInfo0 = new RuntimeInfo("", "", "");
      String string0 = runtimeInfo0.javaHome();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RuntimeInfo runtimeInfo0 = new RuntimeInfo("", (String) null, ")c,");
      String string0 = runtimeInfo0.javaHome();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RuntimeInfo runtimeInfo0 = new RuntimeInfo("", (String) null, ")c,");
      String string0 = runtimeInfo0.javaVersion();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      RuntimeInfo runtimeInfo0 = new RuntimeInfo("", (String) null, ")c,");
      String string0 = runtimeInfo0.scalaVersion();
      assertEquals(")c,", string0);
  }
}