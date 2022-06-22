/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:02:29 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.options;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.options.ApOptions;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ApOptions_ESTest extends ApOptions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ApOptions apOptions0 = new ApOptions();
      apOptions0.setFlag(1);
      String string0 = apOptions0.toString();
      assertEquals("USE_SESSION_KEY", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ApOptions apOptions0 = new ApOptions();
      apOptions0.setFlag(0);
      String string0 = apOptions0.toString();
      assertEquals("RESERVED", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ApOptions apOptions0 = new ApOptions();
      apOptions0.setBit(2);
      String string0 = apOptions0.toString();
      assertEquals("MUTUAL_REQUIRED", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ApOptions apOptions0 = new ApOptions();
      String string0 = apOptions0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ApOptions apOptions0 = new ApOptions((byte[]) null);
      // Undeclared exception!
      try { 
        apOptions0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.options.Options", e);
      }
  }
}