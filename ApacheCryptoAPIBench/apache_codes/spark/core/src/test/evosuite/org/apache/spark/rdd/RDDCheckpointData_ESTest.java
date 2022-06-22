/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 23:24:36 GMT 2022
 */

package org.apache.spark.rdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.rdd.LocalRDDCheckpointData;
import org.apache.spark.rdd.RDD;
import org.apache.spark.storage.StorageLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import scala.Enumeration;
import scala.Option;
import scala.reflect.ClassTag;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RDDCheckpointData_ESTest extends RDDCheckpointData_ESTest_scaffolding {

//  @Test(timeout = 4000)
//  public void test00()  throws Throwable  {
//      RDD<Option<None.>> rDD0 = (RDD<Option<None.>>) mock(RDD.class, new ViolatedAssumptionAnswer());
//      LocalRDDCheckpointData<Option<None.>> localRDDCheckpointData0 = new LocalRDDCheckpointData<Option<None.>>(rDD0, (ClassTag<Option<None.>>) null);
//      localRDDCheckpointData0.cpState_$eq((Enumeration.Value) null);
//      localRDDCheckpointData0.cpState();
//  }
//
//  @Test(timeout = 4000)
//  public void test01()  throws Throwable  {
//      RDD<Option<None.>> rDD0 = (RDD<Option<None.>>) mock(RDD.class, new ViolatedAssumptionAnswer());
//      doReturn((StorageLevel) null).when(rDD0).getStorageLevel();
//      LocalRDDCheckpointData<Option<None.>> localRDDCheckpointData0 = new LocalRDDCheckpointData<Option<None.>>(rDD0, (ClassTag<Option<None.>>) null);
//      // Undeclared exception!
//      try { 
//        localRDDCheckpointData0.doCheckpoint();
//        fail("Expecting exception: NullPointerException");
//      
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.apache.spark.rdd.LocalRDDCheckpointData", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test02()  throws Throwable  {
//      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
//      doReturn((String) null).when(storageLevel0).toString();
//      doReturn(false).when(storageLevel0).useDisk();
//      RDD<Option<None.>> rDD0 = (RDD<Option<None.>>) mock(RDD.class, new ViolatedAssumptionAnswer());
//      doReturn(storageLevel0).when(rDD0).getStorageLevel();
//      LocalRDDCheckpointData<Option<None.>> localRDDCheckpointData0 = new LocalRDDCheckpointData<Option<None.>>(rDD0, (ClassTag<Option<None.>>) null);
//      // Undeclared exception!
//      try { 
//        localRDDCheckpointData0.doCheckpoint();
//        fail("Expecting exception: AssertionError");
//      
//      } catch(AssertionError e) {
//         //
//         // assumption failed: Storage level null is not appropriate for local checkpointing
//         //
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test03()  throws Throwable  {
//      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
//      doReturn((String) null).when(storageLevel0).toString();
//      doReturn(false).when(storageLevel0).useDisk();
//      RDD<Option<None.>> rDD0 = (RDD<Option<None.>>) mock(RDD.class, new ViolatedAssumptionAnswer());
//      doReturn(storageLevel0).when(rDD0).getStorageLevel();
//      LocalRDDCheckpointData<Option<None.>> localRDDCheckpointData0 = new LocalRDDCheckpointData<Option<None.>>(rDD0, (ClassTag<Option<None.>>) null);
//      // Undeclared exception!
//      try { 
//        localRDDCheckpointData0.checkpoint();
//        fail("Expecting exception: AssertionError");
//      
//      } catch(AssertionError e) {
//         //
//         // assumption failed: Storage level null is not appropriate for local checkpointing
//         //
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test04()  throws Throwable  {
//      RDD<Option<None.>> rDD0 = (RDD<Option<None.>>) mock(RDD.class, new ViolatedAssumptionAnswer());
//      LocalRDDCheckpointData<Option<None.>> localRDDCheckpointData0 = new LocalRDDCheckpointData<Option<None.>>(rDD0, (ClassTag<Option<None.>>) null);
//      localRDDCheckpointData0.cpState();
//  }
//
//  @Test(timeout = 4000)
//  public void test05()  throws Throwable  {
//      RDD<Option<None.>> rDD0 = (RDD<Option<None.>>) mock(RDD.class, new ViolatedAssumptionAnswer());
//      LocalRDDCheckpointData<Option<None.>> localRDDCheckpointData0 = new LocalRDDCheckpointData<Option<None.>>(rDD0, (ClassTag<Option<None.>>) null);
//      Enumeration.Value enumeration_Value0 = mock(Enumeration.Value.class, new ViolatedAssumptionAnswer());
//      doReturn((String) null).when(enumeration_Value0).toString();
//      localRDDCheckpointData0.cpState_$eq(enumeration_Value0);
//      localRDDCheckpointData0.checkpoint();
//  }
//
//  @Test(timeout = 4000)
//  public void test06()  throws Throwable  {
//      RDD<Option<None.>> rDD0 = (RDD<Option<None.>>) mock(RDD.class, new ViolatedAssumptionAnswer());
//      LocalRDDCheckpointData<Option<None.>> localRDDCheckpointData0 = new LocalRDDCheckpointData<Option<None.>>(rDD0, (ClassTag<Option<None.>>) null);
//      localRDDCheckpointData0.cpState_$eq((Enumeration.Value) null);
//      localRDDCheckpointData0.checkpoint();
//  }
//
//  @Test(timeout = 4000)
//  public void test07()  throws Throwable  {
//      RDD<Option<None.>> rDD0 = (RDD<Option<None.>>) mock(RDD.class, new ViolatedAssumptionAnswer());
//      doReturn((StorageLevel) null).when(rDD0).getStorageLevel();
//      LocalRDDCheckpointData<Option<None.>> localRDDCheckpointData0 = new LocalRDDCheckpointData<Option<None.>>(rDD0, (ClassTag<Option<None.>>) null);
//      // Undeclared exception!
//      try { 
//        localRDDCheckpointData0.checkpoint();
//        fail("Expecting exception: NullPointerException");
//      
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("org.apache.spark.rdd.LocalRDDCheckpointData", e);
//      }
//  }
//
//  @Test(timeout = 4000)
//  public void test08()  throws Throwable  {
//      RDD<Option<None.>> rDD0 = (RDD<Option<None.>>) mock(RDD.class, new ViolatedAssumptionAnswer());
//      LocalRDDCheckpointData<Option<None.>> localRDDCheckpointData0 = new LocalRDDCheckpointData<Option<None.>>(rDD0, (ClassTag<Option<None.>>) null);
//      localRDDCheckpointData0.cpState_$eq((Enumeration.Value) null);
//      localRDDCheckpointData0.isCheckpointed();
//  }
//
//  @Test(timeout = 4000)
//  public void test09()  throws Throwable  {
//      RDD<Option<Object>> rDD0 = (RDD<Option<Object>>) mock(RDD.class, new ViolatedAssumptionAnswer());
//      LocalRDDCheckpointData<Option<Object>> localRDDCheckpointData0 = new LocalRDDCheckpointData<Option<Object>>(rDD0, (ClassTag<Option<Object>>) null);
//      localRDDCheckpointData0.isCheckpointed();
//  }
//
//  @Test(timeout = 4000)
//  public void test10()  throws Throwable  {
//      RDD<Option<None.>> rDD0 = (RDD<Option<None.>>) mock(RDD.class, new ViolatedAssumptionAnswer());
//      LocalRDDCheckpointData<Option<None.>> localRDDCheckpointData0 = new LocalRDDCheckpointData<Option<None.>>(rDD0, (ClassTag<Option<None.>>) null);
//      localRDDCheckpointData0.getPartitions();
//  }
}