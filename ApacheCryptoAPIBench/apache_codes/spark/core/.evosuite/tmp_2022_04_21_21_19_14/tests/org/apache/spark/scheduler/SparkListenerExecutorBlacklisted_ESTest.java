/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:31:10 GMT 2022
 */

package org.apache.spark.scheduler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.scheduler.SparkListenerExecutorBlacklisted;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import scala.Function1;
import scala.Option;
import scala.Tuple3;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SparkListenerExecutorBlacklisted_ESTest extends SparkListenerExecutorBlacklisted_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(30, "!C(O2l#^?\f?_Ugim", 30);
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted1 = SparkListenerExecutorBlacklisted.apply(30, "!C(O2l#^?\f?_Ugim", (-747));
      boolean boolean0 = sparkListenerExecutorBlacklisted0.equals(sparkListenerExecutorBlacklisted1);
      assertEquals(30L, sparkListenerExecutorBlacklisted1.copy$default$1());
      assertFalse(sparkListenerExecutorBlacklisted1.equals((Object)sparkListenerExecutorBlacklisted0));
      assertFalse(boolean0);
      assertEquals((-747), sparkListenerExecutorBlacklisted1.taskFailures());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = new SparkListenerExecutorBlacklisted(1, (String) null, 1);
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted1 = SparkListenerExecutorBlacklisted.apply((-25L), "+_Fq4glq", 2366);
      boolean boolean0 = sparkListenerExecutorBlacklisted1.equals(sparkListenerExecutorBlacklisted0);
      assertFalse(boolean0);
      assertEquals((-25L), sparkListenerExecutorBlacklisted1.copy$default$1());
      assertEquals(2366, sparkListenerExecutorBlacklisted1.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(0L, "empty.reduceLeft", 0);
      sparkListenerExecutorBlacklisted0.time();
      assertEquals(0, sparkListenerExecutorBlacklisted0.taskFailures());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply((-380L), "", (-2633));
      long long0 = sparkListenerExecutorBlacklisted0.time();
      assertEquals((-380L), long0);
      assertEquals((-2633), sparkListenerExecutorBlacklisted0.taskFailures());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = new SparkListenerExecutorBlacklisted((-1L), "", 0);
      int int0 = sparkListenerExecutorBlacklisted0.taskFailures();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply((-3656L), "scala.Predef$any2stringadd$", (-1122));
      int int0 = sparkListenerExecutorBlacklisted0.taskFailures();
      assertEquals((-3656L), sparkListenerExecutorBlacklisted0.copy$default$1());
      assertEquals((-1122), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply((-2331L), "scala.UninitializedFieldError$", 1);
      sparkListenerExecutorBlacklisted0.productElement(1);
      assertEquals((-2331L), sparkListenerExecutorBlacklisted0.time());
      assertEquals(1, sparkListenerExecutorBlacklisted0.taskFailures());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(0L, "", (-474));
      sparkListenerExecutorBlacklisted0.executorId();
      assertEquals((-474), sparkListenerExecutorBlacklisted0.taskFailures());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = new SparkListenerExecutorBlacklisted(276, "scala.collection.AbstractIterable", 276);
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted1 = sparkListenerExecutorBlacklisted0.copy(276, "SparkListenerExecutorBlacklisted(276,scala.collection.AbstractIterable,276)", (-2382));
      assertEquals(276L, sparkListenerExecutorBlacklisted1.copy$default$1());
      assertEquals((-2382), sparkListenerExecutorBlacklisted1.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply((-4131L), "B#,", 0);
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted1 = sparkListenerExecutorBlacklisted0.copy((-1L), (String) null, 0);
      sparkListenerExecutorBlacklisted1.executorId();
      assertEquals(0, sparkListenerExecutorBlacklisted1.taskFailures());
      assertEquals((-1L), sparkListenerExecutorBlacklisted1.time());
      assertEquals((-4131L), sparkListenerExecutorBlacklisted0.time());
      assertEquals(0, sparkListenerExecutorBlacklisted0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply((-4131L), "B#,", 0);
      int int0 = sparkListenerExecutorBlacklisted0.copy$default$3();
      assertEquals(0, int0);
      assertEquals((-4131L), sparkListenerExecutorBlacklisted0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = new SparkListenerExecutorBlacklisted(276, "scala.collection.AbstractIterable", 276);
      String string0 = sparkListenerExecutorBlacklisted0.copy$default$2();
      assertEquals("scala.collection.AbstractIterable", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(560L, "", 0);
      sparkListenerExecutorBlacklisted0.copy$default$2();
      assertEquals(0, sparkListenerExecutorBlacklisted0.taskFailures());
      assertEquals(560L, sparkListenerExecutorBlacklisted0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(0L, (String) null, (-889275714));
      sparkListenerExecutorBlacklisted0.copy$default$1();
      assertEquals((-889275714), sparkListenerExecutorBlacklisted0.taskFailures());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(1277L, "scala.collection.AbstractIterable", 254);
      long long0 = sparkListenerExecutorBlacklisted0.copy$default$1();
      assertEquals(1277L, long0);
      assertEquals(254, sparkListenerExecutorBlacklisted0.taskFailures());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = new SparkListenerExecutorBlacklisted(0L, "", 0);
      boolean boolean0 = sparkListenerExecutorBlacklisted0.canEqual(sparkListenerExecutorBlacklisted0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(0L, "", (-474));
      int int0 = sparkListenerExecutorBlacklisted0.copy$default$3();
      assertEquals((-474), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = new SparkListenerExecutorBlacklisted(1, (String) null, 1);
      Object object0 = sparkListenerExecutorBlacklisted0.productElement(1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply((-2331L), "scala.UninitializedFieldError$", 1);
      Object object0 = sparkListenerExecutorBlacklisted0.productElement(2);
      assertEquals(1, object0);
      assertEquals((-2331L), sparkListenerExecutorBlacklisted0.time());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply((-4131L), "B#,", 0);
      sparkListenerExecutorBlacklisted0.executorId();
      assertEquals(0, sparkListenerExecutorBlacklisted0.copy$default$3());
      assertEquals((-4131L), sparkListenerExecutorBlacklisted0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(560L, "", 0);
      long long0 = sparkListenerExecutorBlacklisted0.time();
      assertEquals(0, sparkListenerExecutorBlacklisted0.copy$default$3());
      assertEquals(560L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = new SparkListenerExecutorBlacklisted(276, "scala.collection.AbstractIterable", 276);
      int int0 = sparkListenerExecutorBlacklisted0.productArity();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply((-4131L), "B#,", 0);
      sparkListenerExecutorBlacklisted0.productIterator();
      assertEquals((-4131L), sparkListenerExecutorBlacklisted0.time());
      assertEquals(3, sparkListenerExecutorBlacklisted0.productArity());
      assertEquals(0, sparkListenerExecutorBlacklisted0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(1L, "B5ZF", 0);
      Object object0 = sparkListenerExecutorBlacklisted0.productElement(0);
      assertEquals(1L, object0);
      
      sparkListenerExecutorBlacklisted0.canEqual(object0);
      assertEquals(0, sparkListenerExecutorBlacklisted0.taskFailures());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(1, "L!JW6\"_ orTP_r", 1);
      String string0 = sparkListenerExecutorBlacklisted0.productPrefix();
      assertEquals(1, sparkListenerExecutorBlacklisted0.copy$default$3());
      assertEquals("SparkListenerExecutorBlacklisted", string0);
      assertEquals(1L, sparkListenerExecutorBlacklisted0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = new SparkListenerExecutorBlacklisted(0L, "*X}CFSXH", 1073741824);
      int int0 = sparkListenerExecutorBlacklisted0.taskFailures();
      assertEquals(1073741824, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Option<Tuple3<Object, String, Object>> option0 = SparkListenerExecutorBlacklisted.unapply((SparkListenerExecutorBlacklisted) null);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(1, "L!JW6\"_ orTP_r", 1);
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted1 = new SparkListenerExecutorBlacklisted(1, "L!JW6\"_ orTP_r", 2058005162);
      boolean boolean0 = sparkListenerExecutorBlacklisted0.equals(sparkListenerExecutorBlacklisted1);
      assertFalse(sparkListenerExecutorBlacklisted1.equals((Object)sparkListenerExecutorBlacklisted0));
      assertEquals(1L, sparkListenerExecutorBlacklisted0.copy$default$1());
      assertEquals(1, sparkListenerExecutorBlacklisted0.taskFailures());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(14, "!C(2l#^?\f?_Ugi", 14);
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted1 = SparkListenerExecutorBlacklisted.apply(14, ">QII{", 14);
      boolean boolean0 = sparkListenerExecutorBlacklisted1.equals(sparkListenerExecutorBlacklisted0);
      assertFalse(boolean0);
      assertEquals(14, sparkListenerExecutorBlacklisted1.taskFailures());
      assertEquals(14L, sparkListenerExecutorBlacklisted1.time());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = new SparkListenerExecutorBlacklisted(1570, (String) null, 1570);
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted1 = SparkListenerExecutorBlacklisted.apply(1570, (String) null, 1570);
      boolean boolean0 = sparkListenerExecutorBlacklisted1.equals(sparkListenerExecutorBlacklisted0);
      assertEquals(1570, sparkListenerExecutorBlacklisted0.taskFailures());
      assertTrue(boolean0);
      assertEquals(1570L, sparkListenerExecutorBlacklisted1.time());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(30, (String) null, 30);
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted1 = SparkListenerExecutorBlacklisted.apply(30, "!C(O2l#^?\f?_Ugim", 30);
      boolean boolean0 = sparkListenerExecutorBlacklisted0.equals(sparkListenerExecutorBlacklisted1);
      assertEquals(30L, sparkListenerExecutorBlacklisted1.copy$default$1());
      assertFalse(sparkListenerExecutorBlacklisted1.equals((Object)sparkListenerExecutorBlacklisted0));
      assertEquals(30, sparkListenerExecutorBlacklisted1.taskFailures());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(1, "scala.collection.immutable.$colon$colon", 1);
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted1 = sparkListenerExecutorBlacklisted0.copy(0L, "scala.collection.immutable.$colon$colon", 1);
      boolean boolean0 = sparkListenerExecutorBlacklisted0.equals(sparkListenerExecutorBlacklisted1);
      assertFalse(boolean0);
      assertFalse(sparkListenerExecutorBlacklisted1.equals((Object)sparkListenerExecutorBlacklisted0));
      assertEquals(1, sparkListenerExecutorBlacklisted0.copy$default$3());
      assertEquals(1L, sparkListenerExecutorBlacklisted0.time());
      assertEquals(1, sparkListenerExecutorBlacklisted1.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = new SparkListenerExecutorBlacklisted(0, "", 0);
      Object object0 = sparkListenerExecutorBlacklisted0.productElement(0);
      boolean boolean0 = sparkListenerExecutorBlacklisted0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(24, "!C(O2l#^?\f?_fgim", 24);
      boolean boolean0 = sparkListenerExecutorBlacklisted0.equals(sparkListenerExecutorBlacklisted0);
      assertTrue(boolean0);
      assertEquals(24L, sparkListenerExecutorBlacklisted0.time());
      assertEquals(24, sparkListenerExecutorBlacklisted0.taskFailures());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply((-33), ":{XW!q$ktv/3B~E", (-33));
      // Undeclared exception!
      try { 
        sparkListenerExecutorBlacklisted0.productElement((-33));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000012
         //
         verifyException("org.apache.spark.scheduler.SparkListenerExecutorBlacklisted", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Function1<Tuple3<Object, String, Object>, SparkListenerExecutorBlacklisted> function1_0 = SparkListenerExecutorBlacklisted.tupled();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Function1<Object, Function1<String, Function1<Object, SparkListenerExecutorBlacklisted>>> function1_0 = SparkListenerExecutorBlacklisted.curried();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = new SparkListenerExecutorBlacklisted(1570, (String) null, 1570);
      String string0 = sparkListenerExecutorBlacklisted0.copy$default$2();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(1, "scala.collection.immutable.$colon$colon", 1);
      sparkListenerExecutorBlacklisted0.logEvent();
      assertEquals(1L, sparkListenerExecutorBlacklisted0.time());
      assertEquals(1, sparkListenerExecutorBlacklisted0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(1, "L!JW6\"_ orTP_r", 1);
      sparkListenerExecutorBlacklisted0.hashCode();
      assertEquals(1L, sparkListenerExecutorBlacklisted0.time());
      assertEquals(1, sparkListenerExecutorBlacklisted0.taskFailures());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply((-4), "$uPa", 3);
      long long0 = sparkListenerExecutorBlacklisted0.copy$default$1();
      assertEquals(3, sparkListenerExecutorBlacklisted0.copy$default$3());
      assertEquals((-4L), long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(7, "L!J6\"_ orTPJ_r", 7);
      String string0 = sparkListenerExecutorBlacklisted0.toString();
      assertEquals(3, sparkListenerExecutorBlacklisted0.productArity());
      assertEquals("SparkListenerExecutorBlacklisted(7,L!J6\"_ orTPJ_r,7)", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(24, "", 24);
      int int0 = sparkListenerExecutorBlacklisted0.copy$default$3();
      assertEquals(24, int0);
      assertEquals(24L, sparkListenerExecutorBlacklisted0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = SparkListenerExecutorBlacklisted.apply(1, (String) null, 1);
      SparkListenerExecutorBlacklisted.unapply(sparkListenerExecutorBlacklisted0);
      assertEquals(1, sparkListenerExecutorBlacklisted0.taskFailures());
      assertEquals(1L, sparkListenerExecutorBlacklisted0.copy$default$1());
      assertEquals(1, sparkListenerExecutorBlacklisted0.copy$default$3());
  }
}
