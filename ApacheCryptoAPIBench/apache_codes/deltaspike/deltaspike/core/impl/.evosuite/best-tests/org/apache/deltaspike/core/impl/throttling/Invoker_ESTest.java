/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:16:33 GMT 2022
 */

package org.apache.deltaspike.core.impl.throttling;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import java.util.concurrent.Semaphore;
import javax.interceptor.InvocationContext;
import org.apache.deltaspike.core.impl.throttling.Invoker;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Invoker_ESTest extends Invoker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Semaphore semaphore0 = mock(Semaphore.class, new ViolatedAssumptionAnswer());
      Invoker invoker0 = new Invoker(semaphore0, 364, 0L);
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(invocationContext0).proceed();
      invoker0.invoke(invocationContext0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Semaphore semaphore0 = mock(Semaphore.class, new ViolatedAssumptionAnswer());
      Invoker invoker0 = new Invoker(semaphore0, 2068, 0L);
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      doReturn(invoker0).when(invocationContext0).proceed();
      invoker0.invoke(invocationContext0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Semaphore semaphore0 = mock(Semaphore.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(semaphore0).tryAcquire(anyInt() , anyLong() , any(java.util.concurrent.TimeUnit.class));
      Invoker invoker0 = new Invoker(semaphore0, 1, 1);
      InvocationContext invocationContext0 = mock(InvocationContext.class, new ViolatedAssumptionAnswer());
      doReturn((Method) null).when(invocationContext0).getMethod();
      try { 
        invoker0.invoke(invocationContext0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can't acquire 1 permits for null in 1ms
         //
         verifyException("org.apache.deltaspike.core.impl.throttling.Invoker", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Semaphore semaphore0 = new Semaphore((-786));
      Invoker invoker0 = new Invoker(semaphore0, (-786), (-631L));
      try { 
        invoker0.invoke((InvocationContext) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.Semaphore", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Semaphore semaphore0 = new Semaphore(180, false);
      Invoker invoker0 = new Invoker(semaphore0, 2085, 180);
      try { 
        invoker0.invoke((InvocationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.deltaspike.core.impl.throttling.Invoker", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Semaphore semaphore0 = new Semaphore(627);
      Invoker invoker0 = new Invoker(semaphore0, 627, 627);
      try { 
        invoker0.invoke((InvocationContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.deltaspike.core.impl.throttling.Invoker", e);
      }
  }
}
