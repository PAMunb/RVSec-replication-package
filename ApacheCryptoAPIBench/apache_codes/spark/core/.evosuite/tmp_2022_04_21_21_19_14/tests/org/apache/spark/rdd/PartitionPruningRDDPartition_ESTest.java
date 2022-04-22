/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 00:15:23 GMT 2022
 */

package org.apache.spark.rdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.spark.Partition;
import org.apache.spark.rdd.PartitionPruningRDDPartition;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PartitionPruningRDDPartition_ESTest extends PartitionPruningRDDPartition_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Partition partition0 = mock(Partition.class, new ViolatedAssumptionAnswer());
      PartitionPruningRDDPartition partitionPruningRDDPartition0 = new PartitionPruningRDDPartition(0, partition0);
      PartitionPruningRDDPartition partitionPruningRDDPartition1 = new PartitionPruningRDDPartition((-1393), partitionPruningRDDPartition0);
      partitionPruningRDDPartition1.parentSplit();
      assertEquals((-1393), partitionPruningRDDPartition1.index());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Partition partition0 = mock(Partition.class, new ViolatedAssumptionAnswer());
      PartitionPruningRDDPartition partitionPruningRDDPartition0 = new PartitionPruningRDDPartition(419, partition0);
      PartitionPruningRDDPartition partitionPruningRDDPartition1 = new PartitionPruningRDDPartition(419, partitionPruningRDDPartition0);
      Partition partition1 = partitionPruningRDDPartition1.parentSplit();
      assertEquals(419, partition1.index());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Partition partition0 = mock(Partition.class, new ViolatedAssumptionAnswer());
      PartitionPruningRDDPartition partitionPruningRDDPartition0 = new PartitionPruningRDDPartition((-765), partition0);
      PartitionPruningRDDPartition partitionPruningRDDPartition1 = new PartitionPruningRDDPartition((-765), partitionPruningRDDPartition0);
      Partition partition1 = partitionPruningRDDPartition1.parentSplit();
      assertEquals((-765), partition1.index());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Partition partition0 = mock(Partition.class, new ViolatedAssumptionAnswer());
      PartitionPruningRDDPartition partitionPruningRDDPartition0 = new PartitionPruningRDDPartition(1445, partition0);
      int int0 = partitionPruningRDDPartition0.index();
      assertEquals(1445, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PartitionPruningRDDPartition partitionPruningRDDPartition0 = new PartitionPruningRDDPartition(0, (Partition) null);
      PartitionPruningRDDPartition partitionPruningRDDPartition1 = new PartitionPruningRDDPartition((-2561), partitionPruningRDDPartition0);
      int int0 = partitionPruningRDDPartition1.index();
      assertEquals((-2561), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Partition partition0 = mock(Partition.class, new ViolatedAssumptionAnswer());
      PartitionPruningRDDPartition partitionPruningRDDPartition0 = new PartitionPruningRDDPartition(0, partition0);
      partitionPruningRDDPartition0.equals(partitionPruningRDDPartition0);
      assertEquals(0, partitionPruningRDDPartition0.index());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PartitionPruningRDDPartition partitionPruningRDDPartition0 = new PartitionPruningRDDPartition(0, (Partition) null);
      int int0 = partitionPruningRDDPartition0.index();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PartitionPruningRDDPartition partitionPruningRDDPartition0 = new PartitionPruningRDDPartition(0, (Partition) null);
      partitionPruningRDDPartition0.parentSplit();
      assertEquals(0, partitionPruningRDDPartition0.index());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PartitionPruningRDDPartition partitionPruningRDDPartition0 = new PartitionPruningRDDPartition(0, (Partition) null);
      partitionPruningRDDPartition0.hashCode();
      assertEquals(0, partitionPruningRDDPartition0.index());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PartitionPruningRDDPartition partitionPruningRDDPartition0 = new PartitionPruningRDDPartition(0, (Partition) null);
      partitionPruningRDDPartition0.equals((Object) null);
      assertEquals(0, partitionPruningRDDPartition0.index());
  }
}
