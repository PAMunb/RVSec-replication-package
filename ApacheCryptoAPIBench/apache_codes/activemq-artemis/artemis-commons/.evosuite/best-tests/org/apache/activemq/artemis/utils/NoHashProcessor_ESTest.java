/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:08:54 GMT 2022
 */

package org.apache.activemq.artemis.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.activemq.artemis.utils.NoHashProcessor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NoHashProcessor_ESTest extends NoHashProcessor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NoHashProcessor noHashProcessor0 = new NoHashProcessor();
      String string0 = noHashProcessor0.hash((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NoHashProcessor noHashProcessor0 = new NoHashProcessor();
      String string0 = noHashProcessor0.hash("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NoHashProcessor noHashProcessor0 = new NoHashProcessor();
      char[] charArray0 = new char[0];
      boolean boolean0 = noHashProcessor0.compare(charArray0, "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NoHashProcessor noHashProcessor0 = new NoHashProcessor();
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        noHashProcessor0.compare(charArray0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.utils.NoHashProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NoHashProcessor noHashProcessor0 = new NoHashProcessor();
      String string0 = noHashProcessor0.hash(" 96(]]Co{]d6");
      assertEquals(" 96(]]Co{]d6", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NoHashProcessor noHashProcessor0 = new NoHashProcessor();
      boolean boolean0 = noHashProcessor0.compare((char[]) null, "");
      assertFalse(boolean0);
  }
}
