/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 20 11:27:48 GMT 2022
 */

package org.apache.activemq.artemis.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import org.apache.activemq.artemis.utils.ConcurrentUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConcurrentUtil_ESTest extends ConcurrentUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = ConcurrentUtil.await((Condition) null, (-370L));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        ConcurrentUtil.await((Condition) null, 36L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.utils.ConcurrentUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AbstractQueuedSynchronizer abstractQueuedSynchronizer0 = mock(AbstractQueuedSynchronizer.class, new ViolatedAssumptionAnswer());
      AbstractQueuedSynchronizer.ConditionObject abstractQueuedSynchronizer_ConditionObject0 = abstractQueuedSynchronizer0.new ConditionObject();
      // Undeclared exception!
      try { 
        ConcurrentUtil.await(abstractQueuedSynchronizer_ConditionObject0, 322L);
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.locks.AbstractQueuedSynchronizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AbstractQueuedSynchronizer abstractQueuedSynchronizer0 = mock(AbstractQueuedSynchronizer.class, new ViolatedAssumptionAnswer());
      AbstractQueuedSynchronizer.ConditionObject abstractQueuedSynchronizer_ConditionObject0 = abstractQueuedSynchronizer0.new ConditionObject();
      boolean boolean0 = ConcurrentUtil.await(abstractQueuedSynchronizer_ConditionObject0, 0L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConcurrentUtil concurrentUtil0 = new ConcurrentUtil();
  }
}
