/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:02:54 GMT 2022
 */

package org.apache.tika.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.tika.concurrent.SimpleThreadPoolExecutor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimpleThreadPoolExecutor_ESTest extends SimpleThreadPoolExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleThreadPoolExecutor simpleThreadPoolExecutor0 = new SimpleThreadPoolExecutor();
      boolean boolean0 = simpleThreadPoolExecutor0.prestartCoreThread();
      assertTrue(boolean0);
  }
}
