/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:45:21 GMT 2022
 */

package org.apache.tika.language.detect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tika.language.detect.LanguageDetector;
import org.apache.tika.language.detect.LanguageHandler;
import org.apache.tika.language.detect.LanguageResult;
import org.apache.tika.language.detect.LanguageWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LanguageHandler_ESTest extends LanguageHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LanguageWriter languageWriter0 = mock(LanguageWriter.class, new ViolatedAssumptionAnswer());
      doReturn((LanguageResult) null).when(languageWriter0).getLanguage();
      LanguageHandler languageHandler0 = new LanguageHandler(languageWriter0);
      LanguageResult languageResult0 = languageHandler0.getLanguage();
      assertNull(languageResult0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LanguageHandler languageHandler0 = new LanguageHandler((LanguageWriter) null);
      // Undeclared exception!
      try { 
        languageHandler0.getDetector();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.language.detect.LanguageHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LanguageHandler languageHandler0 = null;
      try {
        languageHandler0 = new LanguageHandler((LanguageDetector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.language.detect.LanguageWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LanguageDetector languageDetector0 = mock(LanguageDetector.class, new ViolatedAssumptionAnswer());
      LanguageHandler languageHandler0 = new LanguageHandler(languageDetector0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LanguageHandler languageHandler0 = null;
      try {
        languageHandler0 = new LanguageHandler();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No language detectors available
         //
         verifyException("org.apache.tika.language.detect.LanguageDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LanguageHandler languageHandler0 = new LanguageHandler((LanguageWriter) null);
      // Undeclared exception!
      try { 
        languageHandler0.getLanguage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.language.detect.LanguageHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LanguageWriter languageWriter0 = mock(LanguageWriter.class, new ViolatedAssumptionAnswer());
      doReturn((LanguageDetector) null).when(languageWriter0).getDetector();
      LanguageHandler languageHandler0 = new LanguageHandler(languageWriter0);
      LanguageDetector languageDetector0 = languageHandler0.getDetector();
      assertNull(languageDetector0);
  }
}
