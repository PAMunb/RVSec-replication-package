/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 13:26:24 GMT 2022
 */

package org.apache.activemq.artemis.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.activemq.artemis.utils.SimpleFuture;
import org.apache.activemq.artemis.utils.SimpleFutureImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleFuture_ESTest extends SimpleFuture_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleFutureImpl<Object> simpleFutureImpl0 = new SimpleFutureImpl<Object>();
      simpleFutureImpl0.set((Object) null);
      assertFalse(simpleFutureImpl0.isCancelled());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleFutureImpl<Integer> simpleFutureImpl0 = new SimpleFutureImpl<Integer>();
      simpleFutureImpl0.fail((Throwable) null);
      assertFalse(simpleFutureImpl0.isCancelled());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleFuture simpleFuture0 = SimpleFuture.dumb();
      Object object0 = simpleFuture0.get();
      assertNull(object0);
  }
}
