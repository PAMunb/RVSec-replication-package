/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:03:31 GMT 2022
 */

package org.apache.tika.language.detect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.IllformedLocaleException;
import org.apache.tika.language.detect.LanguageNames;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LanguageNames_ESTest extends LanguageNames_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = LanguageNames.makeName("", (String) null, "");
      assertEquals("und", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = LanguageNames.getMacroLanguage((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = LanguageNames.getMacroLanguage("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = LanguageNames.equals("ElPvT", "und");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        LanguageNames.normalizeName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        LanguageNames.isMacroLanguage((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        LanguageNames.hasMacroLanguage((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        LanguageNames.equals((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = LanguageNames.getMacroLanguage("und");
      assertEquals("und", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = LanguageNames.normalizeName("_9akj74Z+g2SWh#K");
      assertEquals("und", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = LanguageNames.isMacroLanguage("_9akj74Z+g2SWh#K");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LanguageNames languageNames0 = new LanguageNames();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = LanguageNames.hasMacroLanguage("und");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = LanguageNames.equals("und", "und");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        LanguageNames.makeName("und", "", "4Zwe,%FwT@DS0}p-$");
        fail("Expecting exception: IllformedLocaleException");
      
      } catch(IllformedLocaleException e) {
         //
         // Ill-formed region: 4Zwe,%FwT@DS0}p-$ [at index 0]
         //
         verifyException("java.util.Locale$Builder", e);
      }
  }
}
