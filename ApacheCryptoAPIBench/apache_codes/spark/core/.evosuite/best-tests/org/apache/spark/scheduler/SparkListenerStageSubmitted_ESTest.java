/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:32:17 GMT 2022
 */

package org.apache.spark.scheduler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Properties;
import org.apache.spark.scheduler.SparkListenerStageSubmitted;
import org.apache.spark.scheduler.StageInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import scala.Function1;
import scala.Option;
import scala.Tuple2;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SparkListenerStageSubmitted_ESTest extends SparkListenerStageSubmitted_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StageInfo stageInfo0 = mock(StageInfo.class, new ViolatedAssumptionAnswer());
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = new SparkListenerStageSubmitted(stageInfo0, (Properties) null);
      SparkListenerStageSubmitted sparkListenerStageSubmitted1 = sparkListenerStageSubmitted0.copy((StageInfo) null, (Properties) null);
      StageInfo stageInfo1 = sparkListenerStageSubmitted1.stageInfo();
      assertNull(stageInfo1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StageInfo stageInfo0 = mock(StageInfo.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(stageInfo0).toString();
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = SparkListenerStageSubmitted.apply(stageInfo0, (Properties) null);
      boolean boolean0 = sparkListenerStageSubmitted0.canEqual((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StageInfo stageInfo0 = mock(StageInfo.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(stageInfo0).toString();
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = SparkListenerStageSubmitted.apply(stageInfo0, (Properties) null);
      Object object0 = sparkListenerStageSubmitted0.productElement(0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StageInfo stageInfo0 = mock(StageInfo.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(stageInfo0).toString();
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = SparkListenerStageSubmitted.apply(stageInfo0, (Properties) null);
      Object object0 = sparkListenerStageSubmitted0.productElement(1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = new SparkListenerStageSubmitted((StageInfo) null, (Properties) null);
      Properties properties0 = sparkListenerStageSubmitted0.properties();
      assertNull(properties0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StageInfo stageInfo0 = mock(StageInfo.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(stageInfo0).toString();
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = SparkListenerStageSubmitted.apply(stageInfo0, (Properties) null);
      boolean boolean0 = sparkListenerStageSubmitted0.canEqual(sparkListenerStageSubmitted0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = new SparkListenerStageSubmitted((StageInfo) null, (Properties) null);
      sparkListenerStageSubmitted0.productIterator();
      assertEquals(2, sparkListenerStageSubmitted0.productArity());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = SparkListenerStageSubmitted.apply((StageInfo) null, (Properties) null);
      String string0 = sparkListenerStageSubmitted0.productPrefix();
      assertEquals("SparkListenerStageSubmitted", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = SparkListenerStageSubmitted.apply((StageInfo) null, (Properties) null);
      int int0 = sparkListenerStageSubmitted0.productArity();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = SparkListenerStageSubmitted.apply((StageInfo) null, (Properties) null);
      Option<Tuple2<StageInfo, Properties>> option0 = SparkListenerStageSubmitted.unapply(sparkListenerStageSubmitted0);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StageInfo stageInfo0 = mock(StageInfo.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(stageInfo0).toString();
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = SparkListenerStageSubmitted.apply(stageInfo0, (Properties) null);
      StageInfo stageInfo1 = sparkListenerStageSubmitted0.copy$default$1();
      SparkListenerStageSubmitted sparkListenerStageSubmitted1 = SparkListenerStageSubmitted.apply(stageInfo1, (Properties) null);
      boolean boolean0 = sparkListenerStageSubmitted0.equals(sparkListenerStageSubmitted1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StageInfo stageInfo0 = mock(StageInfo.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(stageInfo0).toString();
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = new SparkListenerStageSubmitted(stageInfo0, (Properties) null);
      SparkListenerStageSubmitted sparkListenerStageSubmitted1 = sparkListenerStageSubmitted0.copy((StageInfo) null, (Properties) null);
      boolean boolean0 = sparkListenerStageSubmitted1.equals(sparkListenerStageSubmitted0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StageInfo stageInfo0 = mock(StageInfo.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(stageInfo0).toString();
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = SparkListenerStageSubmitted.apply(stageInfo0, (Properties) null);
      StageInfo stageInfo1 = mock(StageInfo.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(stageInfo1).toString();
      SparkListenerStageSubmitted sparkListenerStageSubmitted1 = sparkListenerStageSubmitted0.copy(stageInfo1, (Properties) null);
      boolean boolean0 = sparkListenerStageSubmitted0.equals(sparkListenerStageSubmitted1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = SparkListenerStageSubmitted.apply((StageInfo) null, (Properties) null);
      boolean boolean0 = sparkListenerStageSubmitted0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = new SparkListenerStageSubmitted((StageInfo) null, (Properties) null);
      boolean boolean0 = sparkListenerStageSubmitted0.equals(sparkListenerStageSubmitted0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = SparkListenerStageSubmitted.apply((StageInfo) null, (Properties) null);
      // Undeclared exception!
      try { 
        sparkListenerStageSubmitted0.productElement(813);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000012
         //
         verifyException("org.apache.spark.scheduler.SparkListenerStageSubmitted", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Properties properties0 = SparkListenerStageSubmitted.$lessinit$greater$default$2();
      assertNull(properties0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Function1<Tuple2<StageInfo, Properties>, SparkListenerStageSubmitted> function1_0 = SparkListenerStageSubmitted.tupled();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Option<Tuple2<StageInfo, Properties>> option0 = SparkListenerStageSubmitted.unapply((SparkListenerStageSubmitted) null);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Properties properties0 = SparkListenerStageSubmitted.apply$default$2();
      assertNull(properties0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = new SparkListenerStageSubmitted((StageInfo) null, (Properties) null);
      SparkListenerStageSubmitted sparkListenerStageSubmitted1 = sparkListenerStageSubmitted0.copy((StageInfo) null, (Properties) null);
      boolean boolean0 = sparkListenerStageSubmitted0.equals(sparkListenerStageSubmitted1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Function1<StageInfo, Function1<Properties, SparkListenerStageSubmitted>> function1_0 = SparkListenerStageSubmitted.curried();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = new SparkListenerStageSubmitted((StageInfo) null, (Properties) null);
      sparkListenerStageSubmitted0.hashCode();
      assertEquals(2, sparkListenerStageSubmitted0.productArity());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = new SparkListenerStageSubmitted((StageInfo) null, (Properties) null);
      Properties properties0 = sparkListenerStageSubmitted0.copy$default$2();
      assertNull(properties0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = new SparkListenerStageSubmitted((StageInfo) null, (Properties) null);
      String string0 = sparkListenerStageSubmitted0.toString();
      assertEquals(2, sparkListenerStageSubmitted0.productArity());
      assertEquals("SparkListenerStageSubmitted(null,null)", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = new SparkListenerStageSubmitted((StageInfo) null, (Properties) null);
      StageInfo stageInfo0 = sparkListenerStageSubmitted0.copy$default$1();
      assertNull(stageInfo0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = SparkListenerStageSubmitted.apply((StageInfo) null, (Properties) null);
      boolean boolean0 = sparkListenerStageSubmitted0.logEvent();
      assertTrue(boolean0);
  }
}
