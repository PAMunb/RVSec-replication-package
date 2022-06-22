/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 00:28:31 GMT 2022
 */

package org.apache.spark;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.spark.MapOutputStatistics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MapOutputStatistics_ESTest extends MapOutputStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      long[] longArray0 = new long[0];
      MapOutputStatistics mapOutputStatistics0 = new MapOutputStatistics(0, longArray0);
      int int0 = mapOutputStatistics0.shuffleId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      long[] longArray0 = new long[6];
      MapOutputStatistics mapOutputStatistics0 = new MapOutputStatistics(1, longArray0);
      int int0 = mapOutputStatistics0.shuffleId();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MapOutputStatistics mapOutputStatistics0 = new MapOutputStatistics((-2870), (long[]) null);
      long[] longArray0 = mapOutputStatistics0.bytesByPartitionId();
      assertNull(longArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      long[] longArray0 = new long[0];
      MapOutputStatistics mapOutputStatistics0 = new MapOutputStatistics(0, longArray0);
      long[] longArray1 = mapOutputStatistics0.bytesByPartitionId();
      assertSame(longArray0, longArray1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MapOutputStatistics mapOutputStatistics0 = new MapOutputStatistics((-2870), (long[]) null);
      int int0 = mapOutputStatistics0.shuffleId();
      assertEquals((-2870), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      long[] longArray0 = new long[1];
      MapOutputStatistics mapOutputStatistics0 = new MapOutputStatistics((-868), longArray0);
      long[] longArray1 = mapOutputStatistics0.bytesByPartitionId();
      assertSame(longArray0, longArray1);
  }
}