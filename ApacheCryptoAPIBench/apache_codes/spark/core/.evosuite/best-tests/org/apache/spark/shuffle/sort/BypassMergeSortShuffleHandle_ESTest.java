/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 00:03:05 GMT 2022
 */

package org.apache.spark.shuffle.sort;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.spark.ShuffleDependency;
import org.apache.spark.shuffle.sort.BypassMergeSortShuffleHandle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BypassMergeSortShuffleHandle_ESTest extends BypassMergeSortShuffleHandle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BypassMergeSortShuffleHandle<Integer, Integer> bypassMergeSortShuffleHandle0 = new BypassMergeSortShuffleHandle<Integer, Integer>((-2925), (-2925), (ShuffleDependency<Integer, Integer, Integer>) null);
      assertNotNull(bypassMergeSortShuffleHandle0);
      assertEquals((-2925), bypassMergeSortShuffleHandle0.numMaps());
      assertEquals((-2925), bypassMergeSortShuffleHandle0.shuffleId());
  }
}