/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 00:10:59 GMT 2022
 */

package org.apache.spark.status.api.v1;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.spark.status.api.v1.MemoryMetrics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MemoryMetrics_ESTest extends MemoryMetrics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MemoryMetrics memoryMetrics0 = new MemoryMetrics(2703L, 2703L, (-1L), (-507L));
      long long0 = memoryMetrics0.usedOnHeapStorageMemory();
      assertEquals(2703L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MemoryMetrics memoryMetrics0 = new MemoryMetrics((-1L), (-1L), 2328L, 2328L);
      long long0 = memoryMetrics0.usedOnHeapStorageMemory();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MemoryMetrics memoryMetrics0 = new MemoryMetrics(0L, 0L, 0L, 0L);
      long long0 = memoryMetrics0.usedOffHeapStorageMemory();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MemoryMetrics memoryMetrics0 = new MemoryMetrics((-1L), (-1L), 2328L, 2328L);
      long long0 = memoryMetrics0.usedOffHeapStorageMemory();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MemoryMetrics memoryMetrics0 = new MemoryMetrics((-1L), (-1L), 2328L, 2328L);
      long long0 = memoryMetrics0.totalOnHeapStorageMemory();
      assertEquals(2328L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MemoryMetrics memoryMetrics0 = new MemoryMetrics(2703L, 2703L, (-1L), (-507L));
      long long0 = memoryMetrics0.totalOnHeapStorageMemory();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MemoryMetrics memoryMetrics0 = new MemoryMetrics(211L, 0L, 211L, 510L);
      long long0 = memoryMetrics0.totalOffHeapStorageMemory();
      assertEquals(510L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MemoryMetrics memoryMetrics0 = new MemoryMetrics(2703L, 2703L, (-1L), (-507L));
      long long0 = memoryMetrics0.totalOffHeapStorageMemory();
      assertEquals((-507L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MemoryMetrics memoryMetrics0 = new MemoryMetrics(0L, 0L, 0L, 0L);
      long long0 = memoryMetrics0.totalOnHeapStorageMemory();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MemoryMetrics memoryMetrics0 = new MemoryMetrics(0L, 0L, 0L, 0L);
      long long0 = memoryMetrics0.usedOnHeapStorageMemory();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MemoryMetrics memoryMetrics0 = new MemoryMetrics(0L, 0L, 0L, 0L);
      long long0 = memoryMetrics0.totalOffHeapStorageMemory();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MemoryMetrics memoryMetrics0 = new MemoryMetrics((-1004L), 4566L, (-1004L), 4566L);
      long long0 = memoryMetrics0.usedOffHeapStorageMemory();
      assertEquals(4566L, long0);
  }
}