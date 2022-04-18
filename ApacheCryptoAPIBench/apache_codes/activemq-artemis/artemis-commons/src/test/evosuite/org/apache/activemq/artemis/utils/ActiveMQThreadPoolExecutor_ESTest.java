/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 13:24:46 GMT 2022
 */

package org.apache.activemq.artemis.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.netty.util.concurrent.DefaultThreadFactory;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.apache.activemq.artemis.utils.ActiveMQThreadPoolExecutor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ActiveMQThreadPoolExecutor_ESTest extends ActiveMQThreadPoolExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      DefaultThreadFactory defaultThreadFactory0 = new DefaultThreadFactory("%P,", true);
      ActiveMQThreadPoolExecutor activeMQThreadPoolExecutor0 = null;
      try {
        activeMQThreadPoolExecutor0 = new ActiveMQThreadPoolExecutor((-161), 0, 0, timeUnit0, defaultThreadFactory0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      ActiveMQThreadPoolExecutor activeMQThreadPoolExecutor0 = null;
      try {
        activeMQThreadPoolExecutor0 = new ActiveMQThreadPoolExecutor(0, 956, 0, timeUnit0, (ThreadFactory) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      DefaultThreadFactory defaultThreadFactory0 = new DefaultThreadFactory(" task: ");
      ActiveMQThreadPoolExecutor activeMQThreadPoolExecutor0 = new ActiveMQThreadPoolExecutor(1807, 1807, 1807, timeUnit0, defaultThreadFactory0);
  }
}
