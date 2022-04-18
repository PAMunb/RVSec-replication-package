/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 13:52:43 GMT 2022
 */

package org.apache.tika.language;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.tika.language.LanguageProfile;
import org.apache.tika.language.ProfilingHandler;
import org.apache.tika.language.ProfilingWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProfilingHandler_ESTest extends ProfilingHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ProfilingWriter profilingWriter0 = mock(ProfilingWriter.class, new ViolatedAssumptionAnswer());
      ProfilingHandler profilingHandler0 = new ProfilingHandler(profilingWriter0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ProfilingHandler profilingHandler0 = new ProfilingHandler();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LanguageProfile languageProfile0 = mock(LanguageProfile.class, new ViolatedAssumptionAnswer());
      ProfilingHandler profilingHandler0 = new ProfilingHandler(languageProfile0);
  }
}
