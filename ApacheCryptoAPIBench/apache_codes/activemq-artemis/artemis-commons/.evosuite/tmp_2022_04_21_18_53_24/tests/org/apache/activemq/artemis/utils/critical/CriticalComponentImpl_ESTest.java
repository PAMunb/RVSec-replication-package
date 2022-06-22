/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:04:26 GMT 2022
 */

package org.apache.activemq.artemis.utils.critical;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.activemq.artemis.utils.critical.CriticalAnalyzer;
import org.apache.activemq.artemis.utils.critical.CriticalAnalyzerImpl;
import org.apache.activemq.artemis.utils.critical.CriticalComponentImpl;
import org.apache.activemq.artemis.utils.critical.EmptyCriticalAnalyzer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CriticalComponentImpl_ESTest extends CriticalComponentImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CriticalAnalyzerImpl criticalAnalyzerImpl0 = new CriticalAnalyzerImpl();
      criticalAnalyzerImpl0.start();
      CriticalComponentImpl criticalComponentImpl0 = new CriticalComponentImpl(criticalAnalyzerImpl0, 3444);
      CriticalAnalyzer criticalAnalyzer0 = criticalComponentImpl0.getCriticalAnalyzer();
      assertSame(criticalAnalyzer0, criticalAnalyzerImpl0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CriticalComponentImpl criticalComponentImpl0 = new CriticalComponentImpl((CriticalAnalyzer) null, (-386));
      CriticalAnalyzer criticalAnalyzer0 = criticalComponentImpl0.getCriticalAnalyzer();
      assertFalse(criticalAnalyzer0.isStarted());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CriticalAnalyzerImpl criticalAnalyzerImpl0 = new CriticalAnalyzerImpl();
      CriticalComponentImpl criticalComponentImpl0 = new CriticalComponentImpl(criticalAnalyzerImpl0, 6183);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CriticalComponentImpl criticalComponentImpl0 = new CriticalComponentImpl((CriticalAnalyzer) null, 33);
      // Undeclared exception!
      try { 
        criticalComponentImpl0.isExpired(33);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.utils.critical.CriticalComponentImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CriticalAnalyzerImpl criticalAnalyzerImpl0 = new CriticalAnalyzerImpl();
      CriticalComponentImpl criticalComponentImpl0 = null;
      try {
        criticalComponentImpl0 = new CriticalComponentImpl(criticalAnalyzerImpl0, (-3019));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.utils.critical.CriticalComponentImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CriticalAnalyzerImpl criticalAnalyzerImpl0 = new CriticalAnalyzerImpl();
      CriticalComponentImpl criticalComponentImpl0 = new CriticalComponentImpl(criticalAnalyzerImpl0, 250);
      // Undeclared exception!
      try { 
        criticalComponentImpl0.leaveCritical(3211);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3211
         //
         verifyException("org.apache.activemq.artemis.utils.critical.CriticalComponentImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CriticalComponentImpl criticalComponentImpl0 = new CriticalComponentImpl((CriticalAnalyzer) null, (-386));
      criticalComponentImpl0.leaveCritical(1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CriticalAnalyzerImpl criticalAnalyzerImpl0 = new CriticalAnalyzerImpl();
      CriticalComponentImpl criticalComponentImpl0 = new CriticalComponentImpl(criticalAnalyzerImpl0, 555);
      // Undeclared exception!
      try { 
        criticalComponentImpl0.enterCritical(555);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 555
         //
         verifyException("org.apache.activemq.artemis.utils.critical.CriticalComponentImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      EmptyCriticalAnalyzer emptyCriticalAnalyzer0 = EmptyCriticalAnalyzer.getInstance();
      CriticalComponentImpl criticalComponentImpl0 = new CriticalComponentImpl(emptyCriticalAnalyzer0, 2850);
      criticalComponentImpl0.enterCritical(2850);
  }
}