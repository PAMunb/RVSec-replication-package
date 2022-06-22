/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:53:02 GMT 2022
 */

package org.apache.spark.scheduler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.scheduler.GettingResultEvent;
import org.apache.spark.scheduler.TaskInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import scala.Function1;
import scala.Option;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GettingResultEvent_ESTest extends GettingResultEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TaskInfo taskInfo0 = mock(TaskInfo.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(taskInfo0).toString();
      GettingResultEvent gettingResultEvent0 = new GettingResultEvent(taskInfo0);
      Object object0 = gettingResultEvent0.productElement(0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GettingResultEvent gettingResultEvent0 = new GettingResultEvent((TaskInfo) null);
      boolean boolean0 = gettingResultEvent0.canEqual(gettingResultEvent0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GettingResultEvent gettingResultEvent0 = new GettingResultEvent((TaskInfo) null);
      Object object0 = gettingResultEvent0.productElement(0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GettingResultEvent gettingResultEvent0 = new GettingResultEvent((TaskInfo) null);
      gettingResultEvent0.productIterator();
      assertEquals(1, gettingResultEvent0.productArity());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GettingResultEvent gettingResultEvent0 = GettingResultEvent.apply((TaskInfo) null);
      int int0 = gettingResultEvent0.productArity();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GettingResultEvent gettingResultEvent0 = new GettingResultEvent((TaskInfo) null);
      TaskInfo taskInfo0 = gettingResultEvent0.taskInfo();
      assertNull(taskInfo0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GettingResultEvent gettingResultEvent0 = new GettingResultEvent((TaskInfo) null);
      String string0 = gettingResultEvent0.productPrefix();
      assertEquals("GettingResultEvent", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GettingResultEvent gettingResultEvent0 = new GettingResultEvent((TaskInfo) null);
      Option<TaskInfo> option0 = GettingResultEvent.unapply(gettingResultEvent0);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GettingResultEvent gettingResultEvent0 = new GettingResultEvent((TaskInfo) null);
      GettingResultEvent gettingResultEvent1 = new GettingResultEvent((TaskInfo) null);
      boolean boolean0 = gettingResultEvent0.equals(gettingResultEvent1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GettingResultEvent gettingResultEvent0 = GettingResultEvent.apply((TaskInfo) null);
      boolean boolean0 = gettingResultEvent0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GettingResultEvent gettingResultEvent0 = new GettingResultEvent((TaskInfo) null);
      boolean boolean0 = gettingResultEvent0.equals(gettingResultEvent0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GettingResultEvent gettingResultEvent0 = GettingResultEvent.apply((TaskInfo) null);
      // Undeclared exception!
      try { 
        gettingResultEvent0.productElement(3262);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000012
         //
         verifyException("org.apache.spark.scheduler.GettingResultEvent", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GettingResultEvent gettingResultEvent0 = new GettingResultEvent((TaskInfo) null);
      TaskInfo taskInfo0 = gettingResultEvent0.copy$default$1();
      assertNull(taskInfo0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GettingResultEvent gettingResultEvent0 = GettingResultEvent.apply((TaskInfo) null);
      gettingResultEvent0.hashCode();
      assertEquals(1, gettingResultEvent0.productArity());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Option<TaskInfo> option0 = GettingResultEvent.unapply((GettingResultEvent) null);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Function1<TaskInfo, TaskInfo> function1_0 = GettingResultEvent.andThen((Function1<GettingResultEvent, TaskInfo>) null);
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GettingResultEvent gettingResultEvent0 = GettingResultEvent.apply((TaskInfo) null);
      boolean boolean0 = gettingResultEvent0.canEqual((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GettingResultEvent gettingResultEvent0 = new GettingResultEvent((TaskInfo) null);
      GettingResultEvent gettingResultEvent1 = gettingResultEvent0.copy((TaskInfo) null);
      assertTrue(gettingResultEvent1.equals((Object)gettingResultEvent0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GettingResultEvent gettingResultEvent0 = new GettingResultEvent((TaskInfo) null);
      String string0 = gettingResultEvent0.toString();
      assertEquals("GettingResultEvent(null)", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Function1<TaskInfo, GettingResultEvent> function1_0 = GettingResultEvent.compose((Function1<TaskInfo, TaskInfo>) null);
      assertNotNull(function1_0);
  }
}