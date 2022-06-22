/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:17:10 GMT 2022
 */

package org.apache.spark.ui.jobs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.apache.spark.status.AppStatusStore;
import org.apache.spark.status.api.v1.StageData;
import org.apache.spark.ui.jobs.StageDataSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import scala.Option;
import scala.collection.Seq;
import scala.collection.mutable.Queue;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StageDataSource_ESTest extends StageDataSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Queue<Date> queue0 = (Queue<Date>) mock(Queue.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(queue0).sorted(any(scala.math.Ordering.class));
      Seq<StageData> seq0 = (Seq<StageData>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn(queue0).when(seq0).map(any(scala.Function1.class) , any(scala.collection.generic.CanBuildFrom.class));
      StageDataSource stageDataSource0 = new StageDataSource((AppStatusStore) null, seq0, 2, 2, "Duration", true);
      // Undeclared exception!
      try { 
        stageDataSource0.sliceData(2, 53);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.spark.ui.jobs.StageDataSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Queue<Date> queue0 = (Queue<Date>) mock(Queue.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(queue0).sorted(any(scala.math.Ordering.class));
      Seq<StageData> seq0 = (Seq<StageData>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn(queue0).when(seq0).map(any(scala.Function1.class) , any(scala.collection.generic.CanBuildFrom.class));
      StageDataSource stageDataSource0 = new StageDataSource((AppStatusStore) null, seq0, 2, 2, "Duration", false);
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      Option<String> option0 = (Option<String>) mock(Option.class, new ViolatedAssumptionAnswer());
      doReturn(date0).when(option0).getOrElse(any(scala.Function0.class));
      StageData stageData0 = mock(StageData.class, new ViolatedAssumptionAnswer());
      doReturn(option0).when(stageData0).description();
      // Undeclared exception!
      try { 
        stageDataSource0.org$apache$spark$ui$jobs$StageDataSource$$stageRow(stageData0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.shaded.org.mockito.codegen.Date$MockitoMock$1771434743 cannot be cast to java.lang.String
         //
         verifyException("org.apache.spark.ui.jobs.StageDataSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Date date0 = mock(Date.class, new ViolatedAssumptionAnswer());
      Seq<StageData> seq0 = (Seq<StageData>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn(date0).when(seq0).map(any(scala.Function1.class) , any(scala.collection.generic.CanBuildFrom.class));
      StageDataSource stageDataSource0 = null;
      try {
        stageDataSource0 = new StageDataSource((AppStatusStore) null, seq0, 2, 2, "parsing URL ", false);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.shaded.org.mockito.codegen.Date$MockitoMock$1771434743 cannot be cast to scala.collection.SeqLike
         //
         verifyException("org.apache.spark.ui.jobs.StageDataSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AppStatusStore appStatusStore0 = mock(AppStatusStore.class, new ViolatedAssumptionAnswer());
      Seq<StageData> seq0 = (Seq<StageData>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(seq0).map(any(scala.Function1.class) , any(scala.collection.generic.CanBuildFrom.class));
      StageDataSource stageDataSource0 = null;
      try {
        stageDataSource0 = new StageDataSource(appStatusStore0, seq0, (-1L), 23, "Tasks: Succeeded/Total", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unsortable column: Tasks: Succeeded/Total
         //
         verifyException("org.apache.spark.ui.jobs.StageDataSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seq<StageData> seq0 = (Seq<StageData>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(seq0).map(any(scala.Function1.class) , any(scala.collection.generic.CanBuildFrom.class));
      StageDataSource stageDataSource0 = null;
      try {
        stageDataSource0 = new StageDataSource((AppStatusStore) null, seq0, 2, 2, "parsing URL ", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown column: parsing URL 
         //
         verifyException("org.apache.spark.ui.jobs.StageDataSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Queue<Date> queue0 = (Queue<Date>) mock(Queue.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(queue0).sorted(any(scala.math.Ordering.class));
      Seq<StageData> seq0 = (Seq<StageData>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn(queue0).when(seq0).map(any(scala.Function1.class) , any(scala.collection.generic.CanBuildFrom.class));
      StageDataSource stageDataSource0 = new StageDataSource((AppStatusStore) null, seq0, 2, 2, "Duration", false);
      Option<String> option0 = (Option<String>) mock(Option.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(option0).getOrElse(any(scala.Function0.class));
      StageData stageData0 = mock(StageData.class, new ViolatedAssumptionAnswer());
      doReturn(option0).when(stageData0).description();
      doReturn((Option) null).when(stageData0).submissionTime();
      // Undeclared exception!
      try { 
        stageDataSource0.org$apache$spark$ui$jobs$StageDataSource$$stageRow(stageData0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // null
         //
         verifyException("org.apache.spark.ui.jobs.StageDataSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Queue<Date> queue0 = (Queue<Date>) mock(Queue.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(queue0).sorted(any(scala.math.Ordering.class));
      Seq<StageData> seq0 = (Seq<StageData>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn(queue0).when(seq0).map(any(scala.Function1.class) , any(scala.collection.generic.CanBuildFrom.class));
      StageDataSource stageDataSource0 = new StageDataSource((AppStatusStore) null, seq0, 2, 2, "Shuffle Read", false);
      assertEquals(2, stageDataSource0.pageSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AppStatusStore appStatusStore0 = mock(AppStatusStore.class, new ViolatedAssumptionAnswer());
      Seq<StageData> seq0 = (Seq<StageData>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(seq0).map(any(scala.Function1.class) , any(scala.collection.generic.CanBuildFrom.class));
      StageDataSource stageDataSource0 = null;
      try {
        stageDataSource0 = new StageDataSource(appStatusStore0, seq0, 1000L, 2, "Output", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.spark.ui.jobs.StageDataSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Queue<Date> queue0 = (Queue<Date>) mock(Queue.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(queue0).sorted(any(scala.math.Ordering.class));
      Seq<StageData> seq0 = (Seq<StageData>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn(queue0).when(seq0).map(any(scala.Function1.class) , any(scala.collection.generic.CanBuildFrom.class));
      StageDataSource stageDataSource0 = new StageDataSource((AppStatusStore) null, seq0, 2, 2, "Duration", false);
      StageData stageData0 = mock(StageData.class, new ViolatedAssumptionAnswer());
      doReturn((Option) null).when(stageData0).description();
      // Undeclared exception!
      try { 
        stageDataSource0.org$apache$spark$ui$jobs$StageDataSource$$stageRow(stageData0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.spark.ui.jobs.StageDataSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Seq<StageData> seq0 = (Seq<StageData>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(seq0).map(any(scala.Function1.class) , any(scala.collection.generic.CanBuildFrom.class));
      StageDataSource stageDataSource0 = null;
      try {
        stageDataSource0 = new StageDataSource((AppStatusStore) null, seq0, 2L, 2764, "Shuffle Write", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.spark.ui.jobs.StageDataSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Seq<StageData> seq0 = (Seq<StageData>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(seq0).map(any(scala.Function1.class) , any(scala.collection.generic.CanBuildFrom.class));
      StageDataSource stageDataSource0 = null;
      try {
        stageDataSource0 = new StageDataSource((AppStatusStore) null, seq0, 2, 2, "Stage Id", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.spark.ui.jobs.StageDataSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Seq<StageData> seq0 = (Seq<StageData>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(seq0).map(any(scala.Function1.class) , any(scala.collection.generic.CanBuildFrom.class));
      StageDataSource stageDataSource0 = null;
      try {
        stageDataSource0 = new StageDataSource((AppStatusStore) null, seq0, 2, 2, "Pool Name", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.spark.ui.jobs.StageDataSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Seq<StageData> seq0 = (Seq<StageData>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(seq0).map(any(scala.Function1.class) , any(scala.collection.generic.CanBuildFrom.class));
      StageDataSource stageDataSource0 = null;
      try {
        stageDataSource0 = new StageDataSource((AppStatusStore) null, seq0, 2, 2, "Submitted", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.spark.ui.jobs.StageDataSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Seq<StageData> seq0 = (Seq<StageData>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(seq0).map(any(scala.Function1.class) , any(scala.collection.generic.CanBuildFrom.class));
      StageDataSource stageDataSource0 = null;
      try {
        stageDataSource0 = new StageDataSource((AppStatusStore) null, seq0, 2, 2, "Description", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.spark.ui.jobs.StageDataSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seq<StageData> seq0 = (Seq<StageData>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(seq0).map(any(scala.Function1.class) , any(scala.collection.generic.CanBuildFrom.class));
      StageDataSource stageDataSource0 = null;
      try {
        stageDataSource0 = new StageDataSource((AppStatusStore) null, seq0, (-2950L), 2, "Input", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.spark.ui.jobs.StageDataSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Queue<Date> queue0 = (Queue<Date>) mock(Queue.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(queue0).sorted(any(scala.math.Ordering.class));
      Seq<StageData> seq0 = (Seq<StageData>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn(queue0).when(seq0).map(any(scala.Function1.class) , any(scala.collection.generic.CanBuildFrom.class));
      StageDataSource stageDataSource0 = new StageDataSource((AppStatusStore) null, seq0, 2, 2, "Duration", false);
      // Undeclared exception!
      try { 
        stageDataSource0.dataSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.spark.ui.jobs.StageDataSource", e);
      }
  }
}