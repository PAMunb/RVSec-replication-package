/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 23:04:45 GMT 2022
 */

package org.apache.spark.scheduler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.scheduler.SparkListenerBlockUpdated;
import org.apache.spark.storage.BlockUpdatedInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import scala.Function1;
import scala.Option;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SparkListenerBlockUpdated_ESTest extends SparkListenerBlockUpdated_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BlockUpdatedInfo blockUpdatedInfo0 = mock(BlockUpdatedInfo.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(blockUpdatedInfo0).toString();
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = new SparkListenerBlockUpdated(blockUpdatedInfo0);
      Object object0 = sparkListenerBlockUpdated0.productElement(0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = new SparkListenerBlockUpdated((BlockUpdatedInfo) null);
      boolean boolean0 = sparkListenerBlockUpdated0.canEqual(sparkListenerBlockUpdated0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = new SparkListenerBlockUpdated((BlockUpdatedInfo) null);
      Object object0 = sparkListenerBlockUpdated0.productElement(0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlockUpdatedInfo blockUpdatedInfo0 = mock(BlockUpdatedInfo.class, new ViolatedAssumptionAnswer());
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = new SparkListenerBlockUpdated(blockUpdatedInfo0);
      String string0 = sparkListenerBlockUpdated0.productPrefix();
      assertEquals("SparkListenerBlockUpdated", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = SparkListenerBlockUpdated.apply((BlockUpdatedInfo) null);
      sparkListenerBlockUpdated0.productIterator();
      assertEquals(1, sparkListenerBlockUpdated0.productArity());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = new SparkListenerBlockUpdated((BlockUpdatedInfo) null);
      int int0 = sparkListenerBlockUpdated0.productArity();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = SparkListenerBlockUpdated.apply((BlockUpdatedInfo) null);
      BlockUpdatedInfo blockUpdatedInfo0 = sparkListenerBlockUpdated0.blockUpdatedInfo();
      assertNull(blockUpdatedInfo0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = new SparkListenerBlockUpdated((BlockUpdatedInfo) null);
      Option<BlockUpdatedInfo> option0 = SparkListenerBlockUpdated.unapply(sparkListenerBlockUpdated0);
      assertEquals(1, option0.productArity());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = new SparkListenerBlockUpdated((BlockUpdatedInfo) null);
      boolean boolean0 = sparkListenerBlockUpdated0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = SparkListenerBlockUpdated.apply((BlockUpdatedInfo) null);
      boolean boolean0 = sparkListenerBlockUpdated0.equals(sparkListenerBlockUpdated0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = SparkListenerBlockUpdated.apply((BlockUpdatedInfo) null);
      // Undeclared exception!
      try { 
        sparkListenerBlockUpdated0.productElement((-1140));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000012
         //
         verifyException("org.apache.spark.scheduler.SparkListenerBlockUpdated", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Function1<BlockUpdatedInfo, SparkListenerBlockUpdated> function1_0 = SparkListenerBlockUpdated.compose((Function1<BlockUpdatedInfo, BlockUpdatedInfo>) null);
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = SparkListenerBlockUpdated.apply((BlockUpdatedInfo) null);
      SparkListenerBlockUpdated sparkListenerBlockUpdated1 = sparkListenerBlockUpdated0.copy((BlockUpdatedInfo) null);
      assertNotSame(sparkListenerBlockUpdated0, sparkListenerBlockUpdated1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = new SparkListenerBlockUpdated((BlockUpdatedInfo) null);
      boolean boolean0 = sparkListenerBlockUpdated0.canEqual((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Function1<BlockUpdatedInfo, BlockUpdatedInfo> function1_0 = SparkListenerBlockUpdated.andThen((Function1<SparkListenerBlockUpdated, BlockUpdatedInfo>) null);
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = SparkListenerBlockUpdated.apply((BlockUpdatedInfo) null);
      boolean boolean0 = sparkListenerBlockUpdated0.logEvent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Option<BlockUpdatedInfo> option0 = SparkListenerBlockUpdated.unapply((SparkListenerBlockUpdated) null);
      assertEquals(0, option0.productArity());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = new SparkListenerBlockUpdated((BlockUpdatedInfo) null);
      BlockUpdatedInfo blockUpdatedInfo0 = sparkListenerBlockUpdated0.copy$default$1();
      assertNull(blockUpdatedInfo0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = new SparkListenerBlockUpdated((BlockUpdatedInfo) null);
      sparkListenerBlockUpdated0.hashCode();
      assertEquals(1, sparkListenerBlockUpdated0.productArity());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = new SparkListenerBlockUpdated((BlockUpdatedInfo) null);
      String string0 = sparkListenerBlockUpdated0.toString();
      assertEquals("SparkListenerBlockUpdated(null)", string0);
  }
}
