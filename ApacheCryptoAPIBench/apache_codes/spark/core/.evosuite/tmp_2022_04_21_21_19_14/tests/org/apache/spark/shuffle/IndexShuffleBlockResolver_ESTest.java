/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:01:32 GMT 2022
 */

package org.apache.spark.shuffle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.SparkConf;
import org.apache.spark.shuffle.IndexShuffleBlockResolver;
import org.apache.spark.storage.BlockManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IndexShuffleBlockResolver_ESTest extends IndexShuffleBlockResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BlockManager blockManager0 = IndexShuffleBlockResolver.$lessinit$greater$default$2();
      assertNull(blockManager0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SparkConf sparkConf0 = mock(SparkConf.class, new ViolatedAssumptionAnswer());
      doReturn((SparkConf) null).when(sparkConf0).clone();
      IndexShuffleBlockResolver indexShuffleBlockResolver0 = null;
      try {
        indexShuffleBlockResolver0 = new IndexShuffleBlockResolver(sparkConf0, (BlockManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.spark.network.netty.SparkTransportConf$", e);
      }
  }
}
