/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 20 11:27:33 GMT 2022
 */

package org.apache.activemq.artemis.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.netty.util.concurrent.DefaultThreadFactory;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.activemq.artemis.utils.ReferenceCounterUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ReferenceCounterUtil_ESTest extends ReferenceCounterUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      MockThread mockThread0 = new MockThread();
      MockThread mockThread1 = new MockThread(mockThread0, "");
      MockThread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler) null);
      MockThread mockThread2 = new MockThread(threadGroup0, mockThread1, "");
      MockThread mockThread3 = new MockThread(mockThread2);
      ReferenceCounterUtil referenceCounterUtil0 = new ReferenceCounterUtil(mockThread3);
      MockThread.getAllStackTraces();
      referenceCounterUtil0.setTask(mockThread1);
      referenceCounterUtil0.setTask(mockThread0);
      MockThread.reset();
      MockThread.interrupted();
      referenceCounterUtil0.getTask();
      Thread[] threadArray0 = new Thread[1];
      threadArray0[0] = (Thread) mockThread1;
      MockThread.enumerate(threadArray0);
      referenceCounterUtil0.increment();
      referenceCounterUtil0.setTask(mockThread0);
      referenceCounterUtil0.setTask(mockThread2);
      referenceCounterUtil0.getTask();
      referenceCounterUtil0.setTask(mockThread2);
      referenceCounterUtil0.getTask();
      referenceCounterUtil0.getTask();
      referenceCounterUtil0.check();
      referenceCounterUtil0.increment();
      mockThread3.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler) null);
      referenceCounterUtil0.check();
      referenceCounterUtil0.getCount();
      referenceCounterUtil0.decrement();
      referenceCounterUtil0.check();
      referenceCounterUtil0.getCount();
      referenceCounterUtil0.getTask();
      referenceCounterUtil0.check();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockThread mockThread0 = new MockThread("'JzoHD");
      ClassLoader classLoader0 = mockThread0.getContextClassLoader();
      ClassLoader classLoader1 = classLoader0.getParent();
      mockThread0.getStackTrace();
      MockThread.reset();
      mockThread0.setContextClassLoader(classLoader0);
      mockThread0.getContextClassLoader();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(44);
      ReferenceCounterUtil referenceCounterUtil0 = new ReferenceCounterUtil(mockThread0, scheduledThreadPoolExecutor0);
      MockThread mockThread1 = new MockThread(mockThread0);
      mockThread0.setContextClassLoader(classLoader1);
      mockThread1.getStackTrace();
      referenceCounterUtil0.increment();
      Runnable runnable0 = referenceCounterUtil0.getTask();
      referenceCounterUtil0.check();
      referenceCounterUtil0.getCount();
      referenceCounterUtil0.decrement();
      referenceCounterUtil0.check();
      referenceCounterUtil0.check();
      ForkJoinTask.getPool();
      ReferenceCounterUtil referenceCounterUtil1 = new ReferenceCounterUtil((Executor) null);
      referenceCounterUtil1.setTask(runnable0);
      referenceCounterUtil0.decrement();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockThread mockThread0 = new MockThread("'JzoHD");
      ClassLoader classLoader0 = mockThread0.getContextClassLoader();
      ClassLoader classLoader1 = classLoader0.getParent();
      mockThread0.getStackTrace();
      MockThread.reset();
      mockThread0.setContextClassLoader(classLoader0);
      mockThread0.getContextClassLoader();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(44);
      ReferenceCounterUtil referenceCounterUtil0 = new ReferenceCounterUtil(mockThread0, scheduledThreadPoolExecutor0);
      MockThread mockThread1 = new MockThread(mockThread0);
      mockThread0.setContextClassLoader(classLoader1);
      mockThread1.getStackTrace();
      mockThread1.getStackTrace();
      referenceCounterUtil0.setTask(mockThread1);
      Callable<Delayed> callable0 = (Callable<Delayed>) mock(Callable.class, new ViolatedAssumptionAnswer());
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      referenceCounterUtil0.check();
      scheduledThreadPoolExecutor0.schedule(callable0, 1L, timeUnit0);
      referenceCounterUtil0.setTask(mockThread0);
      referenceCounterUtil0.check();
      referenceCounterUtil0.getTask();
      referenceCounterUtil0.getCount();
      referenceCounterUtil0.getCount();
      referenceCounterUtil0.getCount();
      referenceCounterUtil0.increment();
      int int0 = referenceCounterUtil0.decrement();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ReferenceCounterUtil referenceCounterUtil0 = new ReferenceCounterUtil();
      assertEquals(0, referenceCounterUtil0.getCount());
      
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      MockThread mockThread0 = new MockThread(threadGroup0, "}}}kv;on;");
      MockThread.dumpStack();
      referenceCounterUtil0.setTask(mockThread0);
      referenceCounterUtil0.increment();
      referenceCounterUtil0.decrement();
      Runnable runnable0 = referenceCounterUtil0.getTask();
      referenceCounterUtil0.setTask(runnable0);
      referenceCounterUtil0.check();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      classLoader0.setDefaultAssertionStatus(true);
      classLoader0.setPackageAssertionStatus("}}}kv;on;", true);
      ClassLoader classLoader1 = classLoader0.getParent();
      classLoader0.clearAssertionStatus();
      classLoader1.clearAssertionStatus();
      mockThread0.setContextClassLoader(classLoader1);
      referenceCounterUtil0.getCount();
      referenceCounterUtil0.decrement();
      referenceCounterUtil0.decrement();
      mockThread0.getStackTrace();
      referenceCounterUtil0.getCount();
      referenceCounterUtil0.setTask(mockThread0);
      referenceCounterUtil0.getTask();
      referenceCounterUtil0.check();
      referenceCounterUtil0.getCount();
      referenceCounterUtil0.check();
      referenceCounterUtil0.increment();
      MockThread mockThread1 = (MockThread)referenceCounterUtil0.getTask();
      assertFalse(mockThread1.isDaemon());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ReferenceCounterUtil referenceCounterUtil0 = new ReferenceCounterUtil();
      referenceCounterUtil0.getTask();
      assertEquals(0, referenceCounterUtil0.getCount());
      
      // Undeclared exception!
      try { 
        referenceCounterUtil0.check();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.utils.ReferenceCounterUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ReferenceCounterUtil referenceCounterUtil0 = new ReferenceCounterUtil();
      assertEquals(0, referenceCounterUtil0.getCount());
      
      int int0 = referenceCounterUtil0.decrement();
      MockThread mockThread0 = new MockThread("Uz!^^7tBDf");
      referenceCounterUtil0.setTask(mockThread0);
      referenceCounterUtil0.increment();
      referenceCounterUtil0.decrement();
      referenceCounterUtil0.check();
      referenceCounterUtil0.check();
      referenceCounterUtil0.getTask();
      referenceCounterUtil0.decrement();
      referenceCounterUtil0.getCount();
      int int1 = referenceCounterUtil0.getCount();
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ReferenceCounterUtil referenceCounterUtil0 = new ReferenceCounterUtil((Runnable) null);
      // Undeclared exception!
      try { 
        referenceCounterUtil0.check();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.utils.ReferenceCounterUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0);
      scheduledThreadPoolExecutor0.setCorePoolSize(0);
      scheduledThreadPoolExecutor0.getLargestPoolSize();
      ReferenceCounterUtil referenceCounterUtil0 = new ReferenceCounterUtil(scheduledThreadPoolExecutor0);
      referenceCounterUtil0.decrement();
      referenceCounterUtil0.getTask();
      referenceCounterUtil0.setTask((Runnable) null);
      referenceCounterUtil0.increment();
      scheduledThreadPoolExecutor0.setCorePoolSize(0);
      referenceCounterUtil0.getCount();
      referenceCounterUtil0.increment();
      referenceCounterUtil0.check();
      referenceCounterUtil0.check();
      referenceCounterUtil0.increment();
      referenceCounterUtil0.setTask((Runnable) null);
      assertEquals(2, referenceCounterUtil0.getCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ForkJoinTask.getPool();
      ReferenceCounterUtil referenceCounterUtil0 = new ReferenceCounterUtil((Executor) null);
      int int0 = referenceCounterUtil0.getCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ReferenceCounterUtil referenceCounterUtil0 = new ReferenceCounterUtil();
      referenceCounterUtil0.increment();
      // Undeclared exception!
      try { 
        referenceCounterUtil0.decrement();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.utils.ReferenceCounterUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultThreadFactory defaultThreadFactory0 = new DefaultThreadFactory("org.apache.activemq.artemis.utils.ReferenceCounterUtil", false);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0, defaultThreadFactory0);
      scheduledThreadPoolExecutor0.isTerminating();
      ReferenceCounterUtil referenceCounterUtil0 = new ReferenceCounterUtil(scheduledThreadPoolExecutor0);
      MockThread mockThread0 = new MockThread("");
      Thread[] threadArray0 = new Thread[2];
      Thread[] threadArray1 = new Thread[1];
      threadArray1[0] = (Thread) mockThread0;
      MockThread.enumerate(threadArray1);
      MockThread.interrupted();
      defaultThreadFactory0.newThread(mockThread0);
      referenceCounterUtil0.increment();
      scheduledThreadPoolExecutor0.remove(mockThread0);
      threadArray0[0] = (Thread) mockThread0;
      threadArray0[1] = (Thread) mockThread0;
      MockThread.enumerate(threadArray0);
      referenceCounterUtil0.setTask(mockThread0);
      referenceCounterUtil0.getTask();
      referenceCounterUtil0.decrement();
      referenceCounterUtil0.increment();
      referenceCounterUtil0.check();
      assertEquals(1, referenceCounterUtil0.getCount());
  }
}
