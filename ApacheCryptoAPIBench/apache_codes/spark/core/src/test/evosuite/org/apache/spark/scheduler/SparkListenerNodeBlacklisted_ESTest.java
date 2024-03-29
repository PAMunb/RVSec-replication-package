/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:34:32 GMT 2022
 */

package org.apache.spark.scheduler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.scheduler.SparkListenerNodeBlacklisted;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import scala.Function1;
import scala.Option;
import scala.Tuple3;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SparkListenerNodeBlacklisted_ESTest extends SparkListenerNodeBlacklisted_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(1976L, "8TQH", 2);
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted1 = SparkListenerNodeBlacklisted.apply(2, (String) null, 1330);
      boolean boolean0 = sparkListenerNodeBlacklisted0.equals(sparkListenerNodeBlacklisted1);
      assertFalse(boolean0);
      assertEquals(2L, sparkListenerNodeBlacklisted1.copy$default$1());
      assertEquals(1330, sparkListenerNodeBlacklisted1.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(1144L, "", 25);
      long long0 = sparkListenerNodeBlacklisted0.time();
      assertEquals(1144L, long0);
      assertEquals(25, sparkListenerNodeBlacklisted0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = new SparkListenerNodeBlacklisted((-1399L), "V*Z(Vl", 621);
      long long0 = sparkListenerNodeBlacklisted0.time();
      assertEquals((-1399L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply((-36L), "org.apache.spark.scheduler.SparkListenerNodeBlacklisted$", 1);
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted1 = sparkListenerNodeBlacklisted0.copy(1L, (String) null, 3597);
      sparkListenerNodeBlacklisted1.productElement(1);
      assertEquals(1, sparkListenerNodeBlacklisted0.executorFailures());
      assertEquals(3597, sparkListenerNodeBlacklisted1.executorFailures());
      assertEquals((-36L), sparkListenerNodeBlacklisted0.time());
      assertEquals(1L, sparkListenerNodeBlacklisted1.time());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = new SparkListenerNodeBlacklisted((-2014L), (String) null, (-1709));
      String string0 = sparkListenerNodeBlacklisted0.hostId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = new SparkListenerNodeBlacklisted(0L, "", 6);
      String string0 = sparkListenerNodeBlacklisted0.hostId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply((-1422L), "", 0);
      int int0 = sparkListenerNodeBlacklisted0.executorFailures();
      assertEquals((-1422L), sparkListenerNodeBlacklisted0.copy$default$1());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(1144L, "", 25);
      int int0 = sparkListenerNodeBlacklisted0.executorFailures();
      assertEquals(25, int0);
      assertEquals(1144L, sparkListenerNodeBlacklisted0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(0L, "8ylq1lz>VQ%W", (-2017));
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted1 = sparkListenerNodeBlacklisted0.copy(0L, "8ylq1lz>VQ%W", (-2017));
      assertTrue(sparkListenerNodeBlacklisted1.equals((Object)sparkListenerNodeBlacklisted0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(0L, "V*Z(Vl", 0);
      int int0 = sparkListenerNodeBlacklisted0.copy$default$3();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply((-36L), "org.apache.spark.scheduler.SparkListenerNodeBlacklisted$", 1);
      int int0 = sparkListenerNodeBlacklisted0.copy$default$3();
      assertEquals(1, int0);
      assertEquals((-36L), sparkListenerNodeBlacklisted0.time());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(2981L, (String) null, 348);
      sparkListenerNodeBlacklisted0.copy$default$2();
      assertEquals(348, sparkListenerNodeBlacklisted0.copy$default$3());
      assertEquals(2981L, sparkListenerNodeBlacklisted0.time());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(1144L, "", 25);
      sparkListenerNodeBlacklisted0.copy$default$2();
      assertEquals(25, sparkListenerNodeBlacklisted0.executorFailures());
      assertEquals(1144L, sparkListenerNodeBlacklisted0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(1589L, "}bRoa", 0);
      long long0 = sparkListenerNodeBlacklisted0.copy$default$1();
      assertEquals(0, sparkListenerNodeBlacklisted0.executorFailures());
      assertEquals(1589L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply((-1455L), "", 1048576);
      long long0 = sparkListenerNodeBlacklisted0.copy$default$1();
      assertEquals((-1455L), long0);
      assertEquals(1048576, sparkListenerNodeBlacklisted0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply((-1422L), "", 0);
      sparkListenerNodeBlacklisted0.canEqual(sparkListenerNodeBlacklisted0);
      assertEquals(0, sparkListenerNodeBlacklisted0.copy$default$3());
      assertEquals((-1422L), sparkListenerNodeBlacklisted0.time());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply((-36L), "org.apache.spark.scheduler.SparkListenerNodeBlacklisted$", 1);
      sparkListenerNodeBlacklisted0.productElement(1);
      assertEquals(1, sparkListenerNodeBlacklisted0.executorFailures());
      assertEquals((-36L), sparkListenerNodeBlacklisted0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(1976L, "8TQH", 2);
      Object object0 = sparkListenerNodeBlacklisted0.productElement(2);
      assertEquals(2, object0);
      assertEquals(1976L, sparkListenerNodeBlacklisted0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply((-1455L), "", 1048576);
      String string0 = sparkListenerNodeBlacklisted0.productPrefix();
      assertEquals(1048576, sparkListenerNodeBlacklisted0.copy$default$3());
      assertEquals((-1455L), sparkListenerNodeBlacklisted0.time());
      assertEquals("SparkListenerNodeBlacklisted", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(0L, "8ylq1lz>VQ%W", (-2017));
      int int0 = sparkListenerNodeBlacklisted0.productArity();
      assertEquals(3, int0);
      assertEquals((-2017), sparkListenerNodeBlacklisted0.executorFailures());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(0L, "V*Z(Vl", 0);
      Object object0 = sparkListenerNodeBlacklisted0.productElement(0);
      sparkListenerNodeBlacklisted0.canEqual(object0);
      assertEquals(0, sparkListenerNodeBlacklisted0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply((-36L), "org.apache.spark.scheduler.SparkListenerNodeBlacklisted$", 1);
      sparkListenerNodeBlacklisted0.productIterator();
      assertEquals(1, sparkListenerNodeBlacklisted0.copy$default$3());
      assertEquals(3, sparkListenerNodeBlacklisted0.productArity());
      assertEquals((-36L), sparkListenerNodeBlacklisted0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(16, "~{FTHF?CDGo![goN", 16);
      sparkListenerNodeBlacklisted0.hostId();
      assertEquals(16, sparkListenerNodeBlacklisted0.executorFailures());
      assertEquals(16L, sparkListenerNodeBlacklisted0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(0L, "V*Z(Vl", 0);
      sparkListenerNodeBlacklisted0.time();
      assertEquals(0, sparkListenerNodeBlacklisted0.executorFailures());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(1L, "", (-1685));
      int int0 = sparkListenerNodeBlacklisted0.executorFailures();
      assertEquals((-1685), int0);
      assertEquals(1L, sparkListenerNodeBlacklisted0.time());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = new SparkListenerNodeBlacklisted((-866), "", (-866));
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted1 = new SparkListenerNodeBlacklisted((-866), "aCOdH#FJb&@", (-866));
      boolean boolean0 = sparkListenerNodeBlacklisted1.equals(sparkListenerNodeBlacklisted0);
      assertFalse(boolean0);
      assertEquals((-866L), sparkListenerNodeBlacklisted1.time());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(1, "&jbKk(", 1);
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted1 = sparkListenerNodeBlacklisted0.copy(1, (String) null, 1);
      boolean boolean0 = sparkListenerNodeBlacklisted1.equals(sparkListenerNodeBlacklisted0);
      assertFalse(boolean0);
      assertEquals(1, sparkListenerNodeBlacklisted0.copy$default$3());
      assertEquals(1L, sparkListenerNodeBlacklisted1.time());
      assertEquals(1L, sparkListenerNodeBlacklisted0.time());
      assertEquals(1, sparkListenerNodeBlacklisted1.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply((-10), "", (-10));
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted1 = sparkListenerNodeBlacklisted0.copy((-10), "", 2144074943);
      boolean boolean0 = sparkListenerNodeBlacklisted1.equals(sparkListenerNodeBlacklisted0);
      assertFalse(sparkListenerNodeBlacklisted0.equals((Object)sparkListenerNodeBlacklisted1));
      assertFalse(boolean0);
      assertEquals((-10), sparkListenerNodeBlacklisted0.executorFailures());
      assertEquals((-10L), sparkListenerNodeBlacklisted0.copy$default$1());
      assertEquals((-10L), sparkListenerNodeBlacklisted1.time());
      assertEquals(2144074943, sparkListenerNodeBlacklisted1.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply((-1703L), "scala.runtime.BoxesRunTime", (-866));
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted1 = SparkListenerNodeBlacklisted.apply((-866), "scala.runtime.BoxesRunTime", (-866));
      boolean boolean0 = sparkListenerNodeBlacklisted0.equals(sparkListenerNodeBlacklisted1);
      assertFalse(sparkListenerNodeBlacklisted1.equals((Object)sparkListenerNodeBlacklisted0));
      assertFalse(boolean0);
      assertEquals((-866L), sparkListenerNodeBlacklisted1.copy$default$1());
      assertEquals((-866), sparkListenerNodeBlacklisted1.executorFailures());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(24, "&jby>(", 24);
      boolean boolean0 = sparkListenerNodeBlacklisted0.equals((Object) null);
      assertEquals(24, sparkListenerNodeBlacklisted0.executorFailures());
      assertEquals(24L, sparkListenerNodeBlacklisted0.time());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(0L, "/MYX=jUXm", 0);
      boolean boolean0 = sparkListenerNodeBlacklisted0.equals(sparkListenerNodeBlacklisted0);
      assertTrue(boolean0);
      assertEquals(0, sparkListenerNodeBlacklisted0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = new SparkListenerNodeBlacklisted((-9L), "org.apache.spark.scheduler.SparkListenerNodeBlacklisted$", (-1));
      // Undeclared exception!
      try { 
        sparkListenerNodeBlacklisted0.productElement((-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000002
         //
         verifyException("org.apache.spark.scheduler.SparkListenerNodeBlacklisted", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(1, "g", 1);
      SparkListenerNodeBlacklisted.unapply(sparkListenerNodeBlacklisted0);
      assertEquals(1L, sparkListenerNodeBlacklisted0.copy$default$1());
      assertEquals(1, sparkListenerNodeBlacklisted0.executorFailures());
      assertEquals(1L, sparkListenerNodeBlacklisted0.time());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Function1<Object, Function1<String, Function1<Object, SparkListenerNodeBlacklisted>>> function1_0 = SparkListenerNodeBlacklisted.curried();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(0L, "", (-1));
      sparkListenerNodeBlacklisted0.hashCode();
      assertEquals((-1), sparkListenerNodeBlacklisted0.executorFailures());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = new SparkListenerNodeBlacklisted((-655L), (String) null, (-55));
      int int0 = sparkListenerNodeBlacklisted0.copy$default$3();
      assertEquals((-55), int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(0L, "8ylq1lz>VQ%W", (-2017));
      sparkListenerNodeBlacklisted0.copy$default$1();
      assertEquals((-2017), sparkListenerNodeBlacklisted0.executorFailures());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply((-36L), "org.apache.spark.scheduler.SparkListenerNodeBlacklisted$", 1);
      sparkListenerNodeBlacklisted0.copy$default$2();
      assertEquals(1, sparkListenerNodeBlacklisted0.executorFailures());
      assertEquals((-36L), sparkListenerNodeBlacklisted0.time());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply((-10), "Y", (-10));
      sparkListenerNodeBlacklisted0.logEvent();
      assertEquals((-10), sparkListenerNodeBlacklisted0.copy$default$3());
      assertEquals((-10L), sparkListenerNodeBlacklisted0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(16, "mptRy.las", 16);
      String string0 = sparkListenerNodeBlacklisted0.toString();
      assertEquals("SparkListenerNodeBlacklisted(16,mptRy.las,16)", string0);
      assertEquals(3, sparkListenerNodeBlacklisted0.productArity());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Option<Tuple3<Object, String, Object>> option0 = SparkListenerNodeBlacklisted.unapply((SparkListenerNodeBlacklisted) null);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Function1<Tuple3<Object, String, Object>, SparkListenerNodeBlacklisted> function1_0 = SparkListenerNodeBlacklisted.tupled();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply((-1L), (String) null, (-2135875627));
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted1 = sparkListenerNodeBlacklisted0.copy((-1L), (String) null, (-2135875627));
      boolean boolean0 = sparkListenerNodeBlacklisted0.equals(sparkListenerNodeBlacklisted1);
      assertTrue(boolean0);
      assertEquals((-1L), sparkListenerNodeBlacklisted1.time());
      assertEquals((-2135875627), sparkListenerNodeBlacklisted1.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = SparkListenerNodeBlacklisted.apply(16, "_NW6Yn$Bal`#GOSnn", 16);
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted1 = sparkListenerNodeBlacklisted0.copy(16, "_NW6Yn$Bal`#GOSnn", 0);
      boolean boolean0 = sparkListenerNodeBlacklisted1.equals(sparkListenerNodeBlacklisted0);
      assertFalse(boolean0);
      assertEquals(16L, sparkListenerNodeBlacklisted1.copy$default$1());
      assertEquals(16L, sparkListenerNodeBlacklisted0.time());
      assertEquals(0, sparkListenerNodeBlacklisted1.copy$default$3());
      assertFalse(sparkListenerNodeBlacklisted0.equals((Object)sparkListenerNodeBlacklisted1));
      assertEquals(16, sparkListenerNodeBlacklisted0.copy$default$3());
  }
}
