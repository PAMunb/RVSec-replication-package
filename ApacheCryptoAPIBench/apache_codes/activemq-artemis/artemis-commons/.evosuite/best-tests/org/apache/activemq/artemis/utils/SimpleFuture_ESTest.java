/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:10:02 GMT 2022
 */

package org.apache.activemq.artemis.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.activemq.artemis.utils.SimpleFuture;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimpleFuture_ESTest extends SimpleFuture_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleFuture simpleFuture0 = SimpleFuture.dumb();
      assertNotNull(simpleFuture0);
  }
}