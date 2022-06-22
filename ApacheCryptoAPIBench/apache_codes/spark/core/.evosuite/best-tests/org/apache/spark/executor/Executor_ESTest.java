/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:15:58 GMT 2022
 */

package org.apache.spark.executor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URL;
import org.apache.spark.SparkConf;
import org.apache.spark.SparkEnv;
import org.apache.spark.executor.Executor;
import org.apache.spark.storage.BlockManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import scala.collection.Seq;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Executor_ESTest extends Executor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SparkEnv sparkEnv0 = mock(SparkEnv.class, new ViolatedAssumptionAnswer());
      doReturn((BlockManager) null).when(sparkEnv0).blockManager();
      doReturn((SparkConf) null).when(sparkEnv0).conf();
      Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = Executor.$lessinit$greater$default$6();
      Executor executor0 = null;
      try {
        executor0 = new Executor("aT'qD!", "~hs2#", sparkEnv0, (Seq<URL>) null, false, thread_UncaughtExceptionHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.spark.executor.Executor", e);
      }
  }
}