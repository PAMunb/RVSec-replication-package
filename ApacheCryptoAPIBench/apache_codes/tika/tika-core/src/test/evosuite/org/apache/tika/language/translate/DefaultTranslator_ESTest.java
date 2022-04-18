/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 13:47:17 GMT 2022
 */

package org.apache.tika.language.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.language.translate.DefaultTranslator;
import org.apache.tika.language.translate.Translator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultTranslator_ESTest extends DefaultTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultTranslator defaultTranslator0 = new DefaultTranslator();
      List<Translator> list0 = defaultTranslator0.getTranslators();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultTranslator defaultTranslator0 = new DefaultTranslator((ServiceLoader) null);
      // Undeclared exception!
      try { 
        defaultTranslator0.translate("", "tBAa8r", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.language.translate.DefaultTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultTranslator defaultTranslator0 = new DefaultTranslator((ServiceLoader) null);
      // Undeclared exception!
      try { 
        defaultTranslator0.translate("P^'aENS7tQ\":81b", "3M=");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.language.translate.DefaultTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultTranslator defaultTranslator0 = new DefaultTranslator((ServiceLoader) null);
      // Undeclared exception!
      try { 
        defaultTranslator0.isAvailable();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.language.translate.DefaultTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultTranslator defaultTranslator0 = new DefaultTranslator();
      boolean boolean0 = defaultTranslator0.isAvailable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultTranslator defaultTranslator0 = new DefaultTranslator();
      try { 
        defaultTranslator0.translate("", "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No translators currently available
         //
         verifyException("org.apache.tika.language.translate.DefaultTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultTranslator defaultTranslator0 = new DefaultTranslator();
      try { 
        defaultTranslator0.translate("cpHe", "cpHe", "cpHe");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No translators currently available
         //
         verifyException("org.apache.tika.language.translate.DefaultTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DefaultTranslator defaultTranslator0 = new DefaultTranslator();
      Translator translator0 = defaultTranslator0.getTranslator();
      assertNull(translator0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DefaultTranslator defaultTranslator0 = new DefaultTranslator((ServiceLoader) null);
      // Undeclared exception!
      try { 
        defaultTranslator0.getTranslator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.language.translate.DefaultTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DefaultTranslator defaultTranslator0 = new DefaultTranslator((ServiceLoader) null);
      // Undeclared exception!
      try { 
        defaultTranslator0.getTranslators();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.language.translate.DefaultTranslator", e);
      }
  }
}
