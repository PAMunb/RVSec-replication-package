/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:10:27 GMT 2022
 */

package org.apache.activemq.artemis.utils.critical;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.activemq.artemis.utils.critical.CriticalAnalyzerImpl;
import org.apache.activemq.artemis.utils.critical.CriticalComponent;
import org.apache.activemq.artemis.utils.critical.EmptyCriticalAnalyzer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CriticalAnalyzer_ESTest extends CriticalAnalyzer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CriticalAnalyzerImpl criticalAnalyzerImpl0 = new CriticalAnalyzerImpl();
      CriticalComponent criticalComponent0 = mock(CriticalComponent.class, new ViolatedAssumptionAnswer());
      criticalAnalyzerImpl0.add(criticalComponent0);
      int int0 = criticalAnalyzerImpl0.getNumberOfComponents();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmptyCriticalAnalyzer emptyCriticalAnalyzer0 = EmptyCriticalAnalyzer.getInstance();
      emptyCriticalAnalyzer0.clear();
      assertEquals(0L, emptyCriticalAnalyzer0.getCheckTimeNanoSeconds());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmptyCriticalAnalyzer emptyCriticalAnalyzer0 = EmptyCriticalAnalyzer.getInstance();
      int int0 = emptyCriticalAnalyzer0.getNumberOfComponents();
      assertEquals(0, int0);
  }
}
