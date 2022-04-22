/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:40:18 GMT 2022
 */

package org.apache.spark.scheduler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import scala.Function1;
import scala.Option;
import scala.Tuple2;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SparkListenerExecutorUnblacklisted_ESTest extends SparkListenerExecutorUnblacklisted_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted(1759L, "next on empty iterator");
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted1 = SparkListenerExecutorUnblacklisted.apply((-3044L), "next on empty iterator");
      boolean boolean0 = sparkListenerExecutorUnblacklisted0.equals(sparkListenerExecutorUnblacklisted1);
      assertFalse(boolean0);
      assertEquals((-3044L), sparkListenerExecutorUnblacklisted1.copy$default$1());
      assertFalse(sparkListenerExecutorUnblacklisted1.equals((Object)sparkListenerExecutorUnblacklisted0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = SparkListenerExecutorUnblacklisted.apply(0L, "");
      long long0 = sparkListenerExecutorUnblacklisted0.time();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted(5095L, "EH@>v#ok2L!");
      long long0 = sparkListenerExecutorUnblacklisted0.time();
      assertEquals(5095L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted(1006L, "");
      Object object0 = sparkListenerExecutorUnblacklisted0.productElement(1);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted((-1L), (String) null);
      String string0 = sparkListenerExecutorUnblacklisted0.executorId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = SparkListenerExecutorUnblacklisted.apply((-882L), "J?8`:F>j_~{oLxn-i");
      sparkListenerExecutorUnblacklisted0.executorId();
      assertEquals((-882L), sparkListenerExecutorUnblacklisted0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = SparkListenerExecutorUnblacklisted.apply((-882L), "J?8`:F>j_~{oLxn-i");
      sparkListenerExecutorUnblacklisted0.copy(0L, "J?8`:F>j_~{oLxn-i");
      assertEquals((-882L), sparkListenerExecutorUnblacklisted0.time());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = SparkListenerExecutorUnblacklisted.apply(0L, "/fC3@h(>oR9");
      String string0 = sparkListenerExecutorUnblacklisted0.copy$default$2();
      assertEquals("/fC3@h(>oR9", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted(0L, "");
      String string0 = sparkListenerExecutorUnblacklisted0.copy$default$2();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = SparkListenerExecutorUnblacklisted.apply(0L, "/fC3@h(>oR9");
      long long0 = sparkListenerExecutorUnblacklisted0.copy$default$1();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = SparkListenerExecutorUnblacklisted.apply((-1L), "org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted");
      long long0 = sparkListenerExecutorUnblacklisted0.copy$default$1();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = SparkListenerExecutorUnblacklisted.apply(0L, "");
      boolean boolean0 = sparkListenerExecutorUnblacklisted0.canEqual(sparkListenerExecutorUnblacklisted0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted((-1010L), (String) null);
      Object object0 = sparkListenerExecutorUnblacklisted0.productElement(1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted(152L, "");
      String string0 = sparkListenerExecutorUnblacklisted0.executorId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted((-1L), "true");
      sparkListenerExecutorUnblacklisted0.productIterator();
      assertEquals(2, sparkListenerExecutorUnblacklisted0.productArity());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted((-1291L), "0I:j");
      long long0 = sparkListenerExecutorUnblacklisted0.time();
      assertEquals((-1291L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted(5095L, "EH@>v#ok2L!");
      int int0 = sparkListenerExecutorUnblacklisted0.productArity();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = SparkListenerExecutorUnblacklisted.apply(0L, "org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted");
      Object object0 = sparkListenerExecutorUnblacklisted0.productElement(0);
      boolean boolean0 = sparkListenerExecutorUnblacklisted0.canEqual(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Option<Tuple2<Object, String>> option0 = SparkListenerExecutorUnblacklisted.unapply((SparkListenerExecutorUnblacklisted) null);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted(1L, "org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted");
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted1 = new SparkListenerExecutorUnblacklisted(1L, "org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted$");
      boolean boolean0 = sparkListenerExecutorUnblacklisted0.equals(sparkListenerExecutorUnblacklisted1);
      assertFalse(boolean0);
      assertEquals(1L, sparkListenerExecutorUnblacklisted1.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted(1L, (String) null);
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted1 = SparkListenerExecutorUnblacklisted.apply(1L, (String) null);
      boolean boolean0 = sparkListenerExecutorUnblacklisted1.equals(sparkListenerExecutorUnblacklisted0);
      assertTrue(boolean0);
      assertEquals(1L, sparkListenerExecutorUnblacklisted0.time());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted(123L, "|YM^H");
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted1 = sparkListenerExecutorUnblacklisted0.copy(123L, (String) null);
      boolean boolean0 = sparkListenerExecutorUnblacklisted1.equals(sparkListenerExecutorUnblacklisted0);
      assertFalse(boolean0);
      assertEquals(123L, sparkListenerExecutorUnblacklisted1.time());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted(830L, "");
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted1 = new SparkListenerExecutorUnblacklisted(1610L, "");
      boolean boolean0 = sparkListenerExecutorUnblacklisted0.equals(sparkListenerExecutorUnblacklisted1);
      assertFalse(boolean0);
      assertFalse(sparkListenerExecutorUnblacklisted1.equals((Object)sparkListenerExecutorUnblacklisted0));
      assertEquals(1610L, sparkListenerExecutorUnblacklisted1.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = SparkListenerExecutorUnblacklisted.apply(1684L, "");
      boolean boolean0 = sparkListenerExecutorUnblacklisted0.equals("");
      assertEquals(1684L, sparkListenerExecutorUnblacklisted0.copy$default$1());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted((-1L), "org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted");
      boolean boolean0 = sparkListenerExecutorUnblacklisted0.equals(sparkListenerExecutorUnblacklisted0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted(15, "org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted");
      // Undeclared exception!
      try { 
        sparkListenerExecutorUnblacklisted0.productElement(15);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000002
         //
         verifyException("org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted(1610L, "org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted$");
      sparkListenerExecutorUnblacklisted0.hashCode();
      assertEquals(1610L, sparkListenerExecutorUnblacklisted0.time());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted((-2753L), "");
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted1 = sparkListenerExecutorUnblacklisted0.copy((-2753L), "");
      assertEquals((-2753L), sparkListenerExecutorUnblacklisted1.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted((-2071L), "_-");
      String string0 = sparkListenerExecutorUnblacklisted0.toString();
      assertEquals(2, sparkListenerExecutorUnblacklisted0.productArity());
      assertEquals("SparkListenerExecutorUnblacklisted(-2071,_-)", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted((-13L), (String) null);
      String string0 = sparkListenerExecutorUnblacklisted0.copy$default$2();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Function1<Tuple2<Object, String>, SparkListenerExecutorUnblacklisted> function1_0 = SparkListenerExecutorUnblacklisted.tupled();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted((-1L), "org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted");
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted1 = new SparkListenerExecutorUnblacklisted((-1L), "org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted");
      boolean boolean0 = sparkListenerExecutorUnblacklisted0.equals(sparkListenerExecutorUnblacklisted1);
      assertEquals((-1L), sparkListenerExecutorUnblacklisted1.copy$default$1());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted((-1291L), "0I:j");
      String string0 = sparkListenerExecutorUnblacklisted0.productPrefix();
      assertEquals("SparkListenerExecutorUnblacklisted", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = new SparkListenerExecutorUnblacklisted(1610L, "org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted$");
      long long0 = sparkListenerExecutorUnblacklisted0.copy$default$1();
      assertEquals(1610L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = SparkListenerExecutorUnblacklisted.apply(0L, "");
      boolean boolean0 = sparkListenerExecutorUnblacklisted0.logEvent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Function1<Object, Function1<String, SparkListenerExecutorUnblacklisted>> function1_0 = SparkListenerExecutorUnblacklisted.curried();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = SparkListenerExecutorUnblacklisted.apply((-2024L), "BMVxfo&IP");
      SparkListenerExecutorUnblacklisted.unapply(sparkListenerExecutorUnblacklisted0);
      assertEquals((-2024L), sparkListenerExecutorUnblacklisted0.time());
      assertEquals((-2024L), sparkListenerExecutorUnblacklisted0.copy$default$1());
  }
}
