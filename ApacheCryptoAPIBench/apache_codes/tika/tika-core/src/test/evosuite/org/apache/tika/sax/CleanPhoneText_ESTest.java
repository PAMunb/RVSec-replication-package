/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 15:53:53 GMT 2022
 */

package org.apache.tika.sax;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.apache.tika.sax.CleanPhoneText;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CleanPhoneText_ESTest extends CleanPhoneText_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<String> arrayList0 = CleanPhoneText.extractPhoneNumbers("");
      assertEquals(0, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = CleanPhoneText.clean("N");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        CleanPhoneText.extractPhoneNumbers((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.CleanPhoneText", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        CleanPhoneText.clean((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.CleanPhoneText", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = CleanPhoneText.clean("thirty[W_]{0,3}4");
      assertEquals("30034", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayList<String> arrayList0 = CleanPhoneText.extractPhoneNumbers("([{(<]{0,3}[2-9][W_]{0,3}d[W_]{0,3}d[W_]{0,6}[2-9][W_]{0,3}d[W_]{0,3}d[W_]{0,6}d[W_]{0,3}d[W_]{0,3}d[W_]{0,3}d)");
      assertFalse(arrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CleanPhoneText cleanPhoneText0 = new CleanPhoneText();
  }
}