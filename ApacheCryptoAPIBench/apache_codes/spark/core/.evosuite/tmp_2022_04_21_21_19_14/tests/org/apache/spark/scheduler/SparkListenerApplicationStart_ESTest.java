/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 21:52:50 GMT 2022
 */

package org.apache.spark.scheduler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.scheduler.SparkListenerApplicationStart;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import scala.Enumeration;
import scala.Function1;
import scala.Function2;
import scala.Option;
import scala.ScalaReflectionException;
import scala.Tuple6;
import scala.collection.Iterator;
import scala.collection.Map;
import scala.collection.immutable.BitSet;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SparkListenerApplicationStart_ESTest extends SparkListenerApplicationStart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ScalaReflectionException. scalaReflectionException_0 = ScalaReflectionException..MODULE$;
      ScalaReflectionException scalaReflectionException0 = scalaReflectionException_0.apply("KM1");
      Option<String> option0 = scalaReflectionException_0.unapply(scalaReflectionException0);
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("]\"w>", option0, 0L, "KM1", option0, (Option<Map<String, String>>) null);
      SparkListenerApplicationStart sparkListenerApplicationStart1 = sparkListenerApplicationStart0.copy("]\"w>", option0, (-2344L), (String) null, option0, (Option<Map<String, String>>) null);
      assertEquals("]\"w>", sparkListenerApplicationStart0.appName());
      assertEquals((-2344L), sparkListenerApplicationStart1.copy$default$3());
      assertEquals("KM1", sparkListenerApplicationStart0.sparkUser());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("]7u", (Option<String>) null, (-1399L), "]7u", (Option<String>) null, (Option<Map<String, String>>) null);
      SparkListenerApplicationStart sparkListenerApplicationStart1 = sparkListenerApplicationStart0.copy("]7u", (Option<String>) null, (-3543L), (String) null, (Option<String>) null, (Option<Map<String, String>>) null);
      boolean boolean0 = sparkListenerApplicationStart1.equals(sparkListenerApplicationStart0);
      assertFalse(boolean0);
      assertEquals((-1399L), sparkListenerApplicationStart0.copy$default$3());
      assertEquals((-3543L), sparkListenerApplicationStart1.time());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("Uk].O0:cv9Tc", (Option<String>) null, 0L, "", (Option<String>) null, (Option<Map<String, String>>) null);
      sparkListenerApplicationStart0.time();
      assertEquals("Uk].O0:cv9Tc", sparkListenerApplicationStart0.copy$default$1());
      assertEquals("", sparkListenerApplicationStart0.copy$default$4());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("Cf~E", (Option<String>) null, 4477L, "X", (Option<String>) null, (Option<Map<String, String>>) null);
      long long0 = sparkListenerApplicationStart0.time();
      assertEquals(4477L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("a", (Option<String>) null, 4476L, (String) null, (Option<String>) null, (Option<Map<String, String>>) null);
      String string0 = sparkListenerApplicationStart0.sparkUser();
      assertNull(string0);
      assertEquals(4476L, sparkListenerApplicationStart0.time());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("#8BgFDP5E", (Option<String>) null, 0L, "jRhO", (Option<String>) null, (Option<Map<String, String>>) null);
      SparkListenerApplicationStart sparkListenerApplicationStart1 = sparkListenerApplicationStart0.copy("<>&;q}eYI\"Il*8;g", (Option<String>) null, 0L, "", (Option<String>) null, (Option<Map<String, String>>) null);
      String string0 = sparkListenerApplicationStart1.sparkUser();
      assertEquals("<>&;q}eYI\"Il*8;g", sparkListenerApplicationStart1.appName());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ScalaReflectionException. scalaReflectionException_0 = ScalaReflectionException..MODULE$;
      ScalaReflectionException scalaReflectionException0 = scalaReflectionException_0.apply("KM1");
      Option<String> option0 = scalaReflectionException_0.unapply(scalaReflectionException0);
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("]w", option0, 0L, "KM1", option0, (Option<Map<String, String>>) null);
      Option<String> option1 = sparkListenerApplicationStart0.copy$default$5();
      assertNotNull(option1);
      assertEquals("KM1", sparkListenerApplicationStart0.copy$default$4());
      assertEquals("]w", sparkListenerApplicationStart0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart((String) null, (Option<String>) null, 4476L, (String) null, (Option<String>) null, (Option<Map<String, String>>) null);
      String string0 = sparkListenerApplicationStart0.copy$default$4();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("]7u", (Option<String>) null, (-1399L), "", (Option<String>) null, (Option<Map<String, String>>) null);
      String string0 = sparkListenerApplicationStart0.copy$default$4();
      assertEquals("", string0);
      assertEquals((-1399L), sparkListenerApplicationStart0.time());
      assertEquals("]7u", sparkListenerApplicationStart0.appName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("Cf~E", (Option<String>) null, 4477L, "X", (Option<String>) null, (Option<Map<String, String>>) null);
      long long0 = sparkListenerApplicationStart0.copy$default$3();
      assertEquals(4477L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ScalaReflectionException. scalaReflectionException_0 = ScalaReflectionException..MODULE$;
      ScalaReflectionException scalaReflectionException0 = scalaReflectionException_0.apply((String) null);
      Option<String> option0 = scalaReflectionException_0.unapply(scalaReflectionException0);
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("SparkListenerApplicationStart", option0, 4466L, (String) null, option0, (Option<Map<String, String>>) null);
      Option<String> option1 = sparkListenerApplicationStart0.copy$default$2();
      assertNotNull(option1);
      assertEquals(4466L, sparkListenerApplicationStart0.time());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply((String) null, (Option<String>) null, 2051L, (String) null, (Option<String>) null, (Option<Map<String, String>>) null);
      sparkListenerApplicationStart0.copy$default$1();
      assertEquals(2051L, sparkListenerApplicationStart0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ScalaReflectionException. scalaReflectionException_0 = ScalaReflectionException..MODULE$;
      ScalaReflectionException scalaReflectionException0 = scalaReflectionException_0.apply("");
      Option<String> option0 = scalaReflectionException_0.unapply(scalaReflectionException0);
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("", option0, (-1L), "", option0, (Option<Map<String, String>>) null);
      String string0 = sparkListenerApplicationStart0.copy$default$1();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ScalaReflectionException. scalaReflectionException_0 = ScalaReflectionException..MODULE$;
      ScalaReflectionException scalaReflectionException0 = scalaReflectionException_0.apply("");
      Option<String> option0 = scalaReflectionException_0.unapply(scalaReflectionException0);
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("", option0, (-1L), "", option0, (Option<Map<String, String>>) null);
      boolean boolean0 = sparkListenerApplicationStart0.canEqual(scalaReflectionException_0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply((String) null, (Option<String>) null, 4477L, "k", (Option<String>) null, (Option<Map<String, String>>) null);
      String string0 = sparkListenerApplicationStart0.appName();
      assertNull(string0);
      assertEquals(4477L, sparkListenerApplicationStart0.time());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ScalaReflectionException. scalaReflectionException_0 = ScalaReflectionException..MODULE$;
      ScalaReflectionException scalaReflectionException0 = scalaReflectionException_0.apply("");
      Option<String> option0 = scalaReflectionException_0.unapply(scalaReflectionException0);
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("", option0, (-1L), "", option0, (Option<Map<String, String>>) null);
      String string0 = sparkListenerApplicationStart0.appName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ScalaReflectionException. scalaReflectionException_0 = ScalaReflectionException..MODULE$;
      ScalaReflectionException scalaReflectionException0 = scalaReflectionException_0.apply("'F&!0");
      Option<String> option0 = scalaReflectionException_0.unapply(scalaReflectionException0);
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("{td:DphPg[M'kQy", option0, 4477L, "{6nRX>Q1gE`II>n*", option0, (Option<Map<String, String>>) null);
      SparkListenerApplicationStart sparkListenerApplicationStart1 = sparkListenerApplicationStart0.copy("'F&!0", (Option<String>) null, 4477L, "NzK%", option0, (Option<Map<String, String>>) null);
      Option<String> option1 = sparkListenerApplicationStart1.appId();
      assertNull(option1);
      assertEquals("{6nRX>Q1gE`II>n*", sparkListenerApplicationStart0.sparkUser());
      assertEquals("{td:DphPg[M'kQy", sparkListenerApplicationStart0.copy$default$1());
      assertEquals(4477L, sparkListenerApplicationStart0.time());
      assertEquals(4477L, sparkListenerApplicationStart1.copy$default$3());
      assertEquals("NzK%", sparkListenerApplicationStart1.copy$default$4());
      assertEquals("'F&!0", sparkListenerApplicationStart1.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("]7u", (Option<String>) null, (-1399L), "]7u", (Option<String>) null, (Option<Map<String, String>>) null);
      sparkListenerApplicationStart0.appAttemptId();
      assertEquals((-1399L), sparkListenerApplicationStart0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("Cf~E", (Option<String>) null, 4477L, "X", (Option<String>) null, (Option<Map<String, String>>) null);
      Object object0 = sparkListenerApplicationStart0.productElement(3);
      assertEquals("X", object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("scala.collection.Iterator$ConcatIterator", (Option<String>) null, (-1399L), "`v#Uv1BM", (Option<String>) null, (Option<Map<String, String>>) null);
      Enumeration enumeration0 = mock(Enumeration.class, new ViolatedAssumptionAnswer());
      Iterator<Object> iterator0 = sparkListenerApplicationStart0.productIterator();
      BitSet bitSet0 = mock(BitSet.class, new ViolatedAssumptionAnswer());
      doReturn(iterator0).when(bitSet0).iterator();
      Enumeration.ValueSet enumeration_ValueSet0 = enumeration0.new ValueSet(bitSet0);
      Function2<Enumeration.Value, Enumeration.Value, Enumeration.Value> function2_0 = (Function2<Enumeration.Value, Enumeration.Value, Enumeration.Value>) mock(Function2.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        enumeration_ValueSet0.reduceOption(function2_0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Integer
         //
         verifyException("scala.runtime.BoxesRunTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("Cf~E", (Option<String>) null, 4477L, "X", (Option<String>) null, (Option<Map<String, String>>) null);
      Object object0 = sparkListenerApplicationStart0.productElement(4);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("Cf~E", (Option<String>) null, 4477L, "v8X", (Option<String>) null, (Option<Map<String, String>>) null);
      Object object0 = sparkListenerApplicationStart0.productElement(1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("Cf~E", (Option<String>) null, 4477L, "X", (Option<String>) null, (Option<Map<String, String>>) null);
      Object object0 = sparkListenerApplicationStart0.productElement(5);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("Cf", (Option<String>) null, 4477L, "Cf", (Option<String>) null, (Option<Map<String, String>>) null);
      Object object0 = sparkListenerApplicationStart0.productElement(2);
      assertEquals(4477L, object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("scala.collection.Iterator$ConcatIterator", (Option<String>) null, (-1399L), "`v#Uv1BM", (Option<String>) null, (Option<Map<String, String>>) null);
      sparkListenerApplicationStart0.canEqual(sparkListenerApplicationStart0);
      assertEquals("scala.collection.Iterator$ConcatIterator", sparkListenerApplicationStart0.appName());
      assertEquals((-1399L), sparkListenerApplicationStart0.copy$default$3());
      assertEquals("`v#Uv1BM", sparkListenerApplicationStart0.copy$default$4());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ScalaReflectionException. scalaReflectionException_0 = ScalaReflectionException..MODULE$;
      ScalaReflectionException scalaReflectionException0 = scalaReflectionException_0.apply("a");
      Option<String> option0 = scalaReflectionException_0.unapply(scalaReflectionException0);
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("", (Option<String>) null, 4476L, "", option0, (Option<Map<String, String>>) null);
      Option<String> option1 = sparkListenerApplicationStart0.appAttemptId();
      assertEquals(4476L, sparkListenerApplicationStart0.time());
      assertNotNull(option1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("]7u", (Option<String>) null, 0L, "", (Option<String>) null, (Option<Map<String, String>>) null);
      String string0 = sparkListenerApplicationStart0.appName();
      assertEquals("]7u", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("Cf", (Option<String>) null, (-2300L), "Cf", (Option<String>) null, (Option<Map<String, String>>) null);
      String string0 = sparkListenerApplicationStart0.productPrefix();
      assertEquals("SparkListenerApplicationStart", string0);
      assertEquals((-2300L), sparkListenerApplicationStart0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("]7u", (Option<String>) null, (-1399L), "]7u", (Option<String>) null, (Option<Map<String, String>>) null);
      sparkListenerApplicationStart0.sparkUser();
      assertEquals((-1399L), sparkListenerApplicationStart0.time());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ScalaReflectionException. scalaReflectionException_0 = ScalaReflectionException..MODULE$;
      ScalaReflectionException scalaReflectionException0 = scalaReflectionException_0.apply("KM1");
      Option<String> option0 = scalaReflectionException_0.unapply(scalaReflectionException0);
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("]\"w>", option0, 0L, "KM1", option0, (Option<Map<String, String>>) null);
      Option<String> option1 = sparkListenerApplicationStart0.appId();
      assertEquals("]\"w>", sparkListenerApplicationStart0.appName());
      assertNotNull(option1);
      assertEquals("KM1", sparkListenerApplicationStart0.sparkUser());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("]7u", (Option<String>) null, (-1399L), "]7u", (Option<String>) null, (Option<Map<String, String>>) null);
      sparkListenerApplicationStart0.driverLogs();
      assertEquals((-1399L), sparkListenerApplicationStart0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("NCL", (Option<String>) null, (-3906L), "NCL", (Option<String>) null, (Option<Map<String, String>>) null);
      long long0 = sparkListenerApplicationStart0.time();
      assertEquals((-3906L), long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("a", (Option<String>) null, 4476L, "a", (Option<String>) null, (Option<Map<String, String>>) null);
      int int0 = sparkListenerApplicationStart0.productArity();
      assertEquals(6, int0);
      assertEquals(4476L, sparkListenerApplicationStart0.time());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply((String) null, (Option<String>) null, 962L, "n\"px~2%", (Option<String>) null, (Option<Map<String, String>>) null);
      SparkListenerApplicationStart.unapply(sparkListenerApplicationStart0);
      assertEquals(962L, sparkListenerApplicationStart0.time());
      assertEquals(962L, sparkListenerApplicationStart0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("Cf~E", (Option<String>) null, 4477L, "X", (Option<String>) null, (Option<Map<String, String>>) null);
      SparkListenerApplicationStart sparkListenerApplicationStart1 = sparkListenerApplicationStart0.copy("Cf~E", (Option<String>) null, 4477L, "Cf~E", (Option<String>) null, (Option<Map<String, String>>) null);
      boolean boolean0 = sparkListenerApplicationStart0.equals(sparkListenerApplicationStart1);
      assertEquals(4477L, sparkListenerApplicationStart1.time());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("a", (Option<String>) null, 4476L, "a", (Option<String>) null, (Option<Map<String, String>>) null);
      SparkListenerApplicationStart sparkListenerApplicationStart1 = SparkListenerApplicationStart.apply("a", (Option<String>) null, 4476L, (String) null, (Option<String>) null, (Option<Map<String, String>>) null);
      boolean boolean0 = sparkListenerApplicationStart1.equals(sparkListenerApplicationStart0);
      assertEquals(4476L, sparkListenerApplicationStart1.copy$default$3());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("*Li{9iIMafwXnY(A30}o", (Option<String>) null, 4477L, "*Li{9iIMafwXnY(A30}o", (Option<String>) null, (Option<Map<String, String>>) null);
      SparkListenerApplicationStart sparkListenerApplicationStart1 = sparkListenerApplicationStart0.copy("*Li{9iIMafwXnY(A30}o", (Option<String>) null, 4466L, "*Li{9iIMafwXnY(A30}o", (Option<String>) null, (Option<Map<String, String>>) null);
      boolean boolean0 = sparkListenerApplicationStart0.equals(sparkListenerApplicationStart1);
      assertFalse(sparkListenerApplicationStart1.equals((Object)sparkListenerApplicationStart0));
      assertFalse(boolean0);
      assertEquals(4466L, sparkListenerApplicationStart1.time());
      assertEquals(4477L, sparkListenerApplicationStart0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("O", (Option<String>) null, 4477L, "\"Cf", (Option<String>) null, (Option<Map<String, String>>) null);
      SparkListenerApplicationStart sparkListenerApplicationStart1 = sparkListenerApplicationStart0.copy("\"Cf", (Option<String>) null, 4477L, "O", (Option<String>) null, (Option<Map<String, String>>) null);
      boolean boolean0 = sparkListenerApplicationStart0.equals(sparkListenerApplicationStart1);
      assertFalse(boolean0);
      assertEquals(4477L, sparkListenerApplicationStart0.time());
      assertEquals(4477L, sparkListenerApplicationStart1.copy$default$3());
      assertEquals("\"Cf", sparkListenerApplicationStart0.copy$default$4());
      assertEquals("\"Cf", sparkListenerApplicationStart1.copy$default$1());
      assertEquals("O", sparkListenerApplicationStart0.copy$default$1());
      assertEquals("O", sparkListenerApplicationStart1.sparkUser());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("k", (Option<String>) null, 4476L, "k", (Option<String>) null, (Option<Map<String, String>>) null);
      SparkListenerApplicationStart sparkListenerApplicationStart1 = sparkListenerApplicationStart0.copy((String) null, (Option<String>) null, 4476L, "k", (Option<String>) null, (Option<Map<String, String>>) null);
      boolean boolean0 = sparkListenerApplicationStart1.equals(sparkListenerApplicationStart0);
      assertEquals(4476L, sparkListenerApplicationStart1.copy$default$3());
      assertFalse(boolean0);
      assertEquals(4476L, sparkListenerApplicationStart0.time());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply((String) null, (Option<String>) null, 4474L, (String) null, (Option<String>) null, (Option<Map<String, String>>) null);
      boolean boolean0 = sparkListenerApplicationStart0.equals((Object) null);
      assertEquals(4474L, sparkListenerApplicationStart0.copy$default$3());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("Cf", (Option<String>) null, 4477L, "Cf", (Option<String>) null, (Option<Map<String, String>>) null);
      boolean boolean0 = sparkListenerApplicationStart0.equals(sparkListenerApplicationStart0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("Cf~E", (Option<String>) null, 4477L, "Cf~E", (Option<String>) null, (Option<Map<String, String>>) null);
      // Undeclared exception!
      try { 
        sparkListenerApplicationStart0.productElement(944);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000012
         //
         verifyException("org.apache.spark.scheduler.SparkListenerApplicationStart", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("]7u", (Option<String>) null, (-1399L), "]7u", (Option<String>) null, (Option<Map<String, String>>) null);
      long long0 = sparkListenerApplicationStart0.copy$default$3();
      assertEquals((-1399L), long0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Option<Map<String, String>> option0 = SparkListenerApplicationStart.$lessinit$greater$default$6();
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply((String) null, (Option<String>) null, 4477L, (String) null, (Option<String>) null, (Option<Map<String, String>>) null);
      sparkListenerApplicationStart0.copy$default$6();
      assertEquals(4477L, sparkListenerApplicationStart0.time());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Option<Tuple6<String, Option<String>, Object, String, Option<String>, Option<Map<String, String>>>> option0 = SparkListenerApplicationStart.unapply((SparkListenerApplicationStart) null);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Function1<Tuple6<String, Option<String>, Object, String, Option<String>, Option<Map<String, String>>>, SparkListenerApplicationStart> function1_0 = SparkListenerApplicationStart.tupled();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("ouE`k#PHiT^-q0", (Option<String>) null, 4476L, "ouE`k#PHiT^-q0", (Option<String>) null, (Option<Map<String, String>>) null);
      boolean boolean0 = sparkListenerApplicationStart0.logEvent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("\"Cf", (Option<String>) null, 4477L, "\"Cf", (Option<String>) null, (Option<Map<String, String>>) null);
      String string0 = sparkListenerApplicationStart0.copy$default$1();
      assertEquals("\"Cf", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("Cf", (Option<String>) null, 4477L, "Cf", (Option<String>) null, (Option<Map<String, String>>) null);
      Option<String> option0 = sparkListenerApplicationStart0.copy$default$5();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("Cf", (Option<String>) null, 4477L, "Cf", (Option<String>) null, (Option<Map<String, String>>) null);
      SparkListenerApplicationStart sparkListenerApplicationStart1 = sparkListenerApplicationStart0.copy("Cf", (Option<String>) null, 4477L, "Cf", (Option<String>) null, (Option<Map<String, String>>) null);
      boolean boolean0 = sparkListenerApplicationStart0.equals(sparkListenerApplicationStart1);
      assertTrue(boolean0);
      assertEquals(4477L, sparkListenerApplicationStart1.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Function1<String, Function1<Option<String>, Function1<Object, Function1<String, Function1<Option<String>, Function1<Option<Map<String, String>>, SparkListenerApplicationStart>>>>>> function1_0 = SparkListenerApplicationStart.curried();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("]7u", (Option<String>) null, (-1399L), "]7u", (Option<String>) null, (Option<Map<String, String>>) null);
      sparkListenerApplicationStart0.copy$default$2();
      assertEquals((-1399L), sparkListenerApplicationStart0.time());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("Cf~E", (Option<String>) null, 4477L, "Cf~E", (Option<String>) null, (Option<Map<String, String>>) null);
      String string0 = sparkListenerApplicationStart0.copy$default$4();
      assertEquals("Cf~E", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = new SparkListenerApplicationStart("NCL", (Option<String>) null, (-1151L), "NCL", (Option<String>) null, (Option<Map<String, String>>) null);
      String string0 = sparkListenerApplicationStart0.toString();
      assertEquals(6, sparkListenerApplicationStart0.productArity());
      assertEquals("SparkListenerApplicationStart(NCL,null,-1151,NCL,null,null)", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SparkListenerApplicationStart sparkListenerApplicationStart0 = SparkListenerApplicationStart.apply("U", (Option<String>) null, 4476L, "U", (Option<String>) null, (Option<Map<String, String>>) null);
      sparkListenerApplicationStart0.hashCode();
      assertEquals(4476L, sparkListenerApplicationStart0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Option<Map<String, String>> option0 = SparkListenerApplicationStart.apply$default$6();
      assertNotNull(option0);
  }
}