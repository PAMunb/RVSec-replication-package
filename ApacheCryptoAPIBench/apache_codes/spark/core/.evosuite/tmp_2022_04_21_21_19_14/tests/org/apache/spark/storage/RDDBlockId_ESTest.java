/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 23:01:10 GMT 2022
 */

package org.apache.spark.storage;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.storage.RDDBlockId;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import scala.Function1;
import scala.Option;
import scala.Tuple2;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RDDBlockId_ESTest extends RDDBlockId_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RDDBlockId rDDBlockId0 = RDDBlockId.apply(0, 0);
      RDDBlockId rDDBlockId1 = new RDDBlockId(0, (-1971));
      boolean boolean0 = rDDBlockId0.equals(rDDBlockId1);
      assertFalse(boolean0);
      assertEquals(0, rDDBlockId0.splitIndex());
      assertEquals(0, rDDBlockId0.rddId());
      assertFalse(rDDBlockId1.equals((Object)rDDBlockId0));
      assertEquals((-1971), rDDBlockId1.splitIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RDDBlockId rDDBlockId0 = new RDDBlockId((-1298), 0);
      RDDBlockId rDDBlockId1 = rDDBlockId0.copy(39, (-1298));
      boolean boolean0 = rDDBlockId0.equals(rDDBlockId1);
      assertFalse(boolean0);
      assertEquals(39, rDDBlockId1.rddId());
      assertEquals((-1298), rDDBlockId1.copy$default$2());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RDDBlockId rDDBlockId0 = RDDBlockId.apply(0, 0);
      int int0 = rDDBlockId0.splitIndex();
      assertEquals(0, int0);
      assertEquals(0, rDDBlockId0.rddId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RDDBlockId rDDBlockId0 = new RDDBlockId(0, (-3029));
      int int0 = rDDBlockId0.splitIndex();
      assertEquals((-3029), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RDDBlockId rDDBlockId0 = RDDBlockId.apply(2, 0);
      int int0 = rDDBlockId0.rddId();
      assertEquals(0, rDDBlockId0.splitIndex());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RDDBlockId rDDBlockId0 = new RDDBlockId((-1298), 0);
      int int0 = rDDBlockId0.rddId();
      assertEquals((-1298), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RDDBlockId rDDBlockId0 = RDDBlockId.apply(915, 915);
      RDDBlockId rDDBlockId1 = rDDBlockId0.copy((-3252), 1);
      assertEquals(915, rDDBlockId0.copy$default$1());
      assertEquals((-3252), rDDBlockId1.copy$default$1());
      assertEquals(915, rDDBlockId0.splitIndex());
      assertEquals(1, rDDBlockId1.splitIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RDDBlockId rDDBlockId0 = new RDDBlockId(1073741824, 1073741824);
      int int0 = rDDBlockId0.copy$default$2();
      assertEquals(1073741824, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RDDBlockId rDDBlockId0 = RDDBlockId.apply((-889275714), (-2534));
      int int0 = rDDBlockId0.copy$default$2();
      assertEquals((-2534), int0);
      assertEquals((-889275714), rDDBlockId0.rddId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RDDBlockId rDDBlockId0 = RDDBlockId.apply(0, 0);
      int int0 = rDDBlockId0.copy$default$1();
      assertEquals(0, int0);
      assertEquals(0, rDDBlockId0.copy$default$2());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RDDBlockId rDDBlockId0 = new RDDBlockId((-1298), 0);
      RDDBlockId rDDBlockId1 = rDDBlockId0.copy(39, (-1298));
      int int0 = rDDBlockId1.copy$default$1();
      assertEquals(39, int0);
      assertEquals((-1298), rDDBlockId1.splitIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RDDBlockId rDDBlockId0 = new RDDBlockId(0, 0);
      boolean boolean0 = rDDBlockId0.canEqual(rDDBlockId0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RDDBlockId rDDBlockId0 = RDDBlockId.apply(0, 0);
      int int0 = rDDBlockId0.rddId();
      assertEquals(0, rDDBlockId0.splitIndex());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RDDBlockId rDDBlockId0 = new RDDBlockId(1073741824, 1073741824);
      int int0 = rDDBlockId0.splitIndex();
      assertEquals(1073741824, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RDDBlockId rDDBlockId0 = new RDDBlockId(0, 0);
      int int0 = rDDBlockId0.productArity();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RDDBlockId rDDBlockId0 = new RDDBlockId(229, 229);
      RDDBlockId rDDBlockId1 = RDDBlockId.apply((-1979), (-1979));
      boolean boolean0 = rDDBlockId0.equals(rDDBlockId1);
      assertEquals((-1979), rDDBlockId1.copy$default$1());
      assertEquals((-1979), rDDBlockId1.copy$default$2());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RDDBlockId rDDBlockId0 = new RDDBlockId(0, 1278);
      RDDBlockId rDDBlockId1 = rDDBlockId0.copy(0, 0);
      boolean boolean0 = rDDBlockId1.equals(rDDBlockId0);
      assertEquals(0, rDDBlockId1.copy$default$1());
      assertFalse(rDDBlockId0.equals((Object)rDDBlockId1));
      assertFalse(boolean0);
      assertEquals(0, rDDBlockId1.copy$default$2());
      assertEquals(1278, rDDBlockId0.copy$default$2());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RDDBlockId rDDBlockId0 = new RDDBlockId((-956), (-956));
      boolean boolean0 = rDDBlockId0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RDDBlockId rDDBlockId0 = new RDDBlockId(32767, 32767);
      boolean boolean0 = rDDBlockId0.equals(rDDBlockId0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RDDBlockId rDDBlockId0 = new RDDBlockId(2, 2);
      // Undeclared exception!
      try { 
        rDDBlockId0.productElement(2);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000002
         //
         verifyException("org.apache.spark.storage.RDDBlockId", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RDDBlockId rDDBlockId0 = RDDBlockId.apply(1, 1);
      Object object0 = rDDBlockId0.productElement(1);
      assertEquals(1, object0);
      assertEquals(1, rDDBlockId0.rddId());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RDDBlockId rDDBlockId0 = RDDBlockId.apply(1073741824, 1073741824);
      RDDBlockId.unapply(rDDBlockId0);
      assertEquals(1073741824, rDDBlockId0.rddId());
      assertEquals(1073741824, rDDBlockId0.splitIndex());
      assertEquals(1073741824, rDDBlockId0.copy$default$2());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RDDBlockId rDDBlockId0 = new RDDBlockId(0, 0);
      int int0 = rDDBlockId0.copy$default$2();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RDDBlockId rDDBlockId0 = new RDDBlockId((-3605), (-3605));
      int int0 = rDDBlockId0.copy$default$1();
      assertEquals((-3605), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Option<Tuple2<Object, Object>> option0 = RDDBlockId.unapply((RDDBlockId) null);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Function1<Object, Function1<Object, RDDBlockId>> function1_0 = RDDBlockId.curried();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RDDBlockId rDDBlockId0 = new RDDBlockId(0, 0);
      Object object0 = rDDBlockId0.productElement(0);
      assertEquals(0, object0);
      
      rDDBlockId0.canEqual(object0);
      assertEquals(0, rDDBlockId0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RDDBlockId rDDBlockId0 = new RDDBlockId(229, 229);
      String string0 = rDDBlockId0.productPrefix();
      assertEquals("RDDBlockId", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RDDBlockId rDDBlockId0 = RDDBlockId.apply(1073741839, 1073741839);
      String string0 = rDDBlockId0.name();
      assertEquals("rdd_1073741839_1073741839", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Function1<Tuple2<Object, Object>, RDDBlockId> function1_0 = RDDBlockId.tupled();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RDDBlockId rDDBlockId0 = new RDDBlockId(32767, 32767);
      RDDBlockId rDDBlockId1 = rDDBlockId0.copy(32767, 32767);
      boolean boolean0 = rDDBlockId1.equals(rDDBlockId0);
      assertTrue(boolean0);
      assertEquals(32767, rDDBlockId1.copy$default$2());
      assertEquals(32767, rDDBlockId1.rddId());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RDDBlockId rDDBlockId0 = RDDBlockId.apply((-34), (-34));
      rDDBlockId0.hashCode();
      assertEquals((-34), rDDBlockId0.copy$default$2());
      assertEquals((-34), rDDBlockId0.rddId());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RDDBlockId rDDBlockId0 = RDDBlockId.apply(0, 0);
      rDDBlockId0.productIterator();
      assertEquals(0, rDDBlockId0.rddId());
      assertEquals(0, rDDBlockId0.splitIndex());
      assertEquals(2, rDDBlockId0.productArity());
  }
}