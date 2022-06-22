/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:44:12 GMT 2022
 */

package org.apache.spark.storage;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.storage.ShuffleBlockId;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import scala.Function1;
import scala.Option;
import scala.Tuple3;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ShuffleBlockId_ESTest extends ShuffleBlockId_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply(3810, 3810, (-588));
      ShuffleBlockId shuffleBlockId1 = ShuffleBlockId.apply(3810, 3810, (-1229));
      boolean boolean0 = shuffleBlockId0.equals(shuffleBlockId1);
      assertEquals(3810, shuffleBlockId1.copy$default$2());
      assertFalse(shuffleBlockId1.equals((Object)shuffleBlockId0));
      assertEquals((-1229), shuffleBlockId1.reduceId());
      assertEquals(3810, shuffleBlockId1.shuffleId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId(1, 1, 1);
      ShuffleBlockId shuffleBlockId1 = ShuffleBlockId.apply(1, 169, 169);
      boolean boolean0 = shuffleBlockId1.equals(shuffleBlockId0);
      assertEquals(1, shuffleBlockId1.copy$default$1());
      assertEquals(169, shuffleBlockId1.copy$default$3());
      assertFalse(boolean0);
      assertEquals(169, shuffleBlockId1.copy$default$2());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId(487, 621, 2);
      ShuffleBlockId shuffleBlockId1 = shuffleBlockId0.copy(2, 2504, 1989);
      boolean boolean0 = shuffleBlockId0.equals(shuffleBlockId1);
      assertFalse(boolean0);
      assertEquals(2504, shuffleBlockId1.copy$default$2());
      assertEquals(2, shuffleBlockId1.copy$default$1());
      assertEquals(1989, shuffleBlockId1.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId((-1253), (-889275714), 2504);
      int int0 = shuffleBlockId0.shuffleId();
      assertEquals((-1253), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId(0, 0, 0);
      int int0 = shuffleBlockId0.reduceId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply((-529), (-529), (-529));
      int int0 = shuffleBlockId0.reduceId();
      assertEquals((-529), shuffleBlockId0.mapId());
      assertEquals((-529), int0);
      assertEquals((-529), shuffleBlockId0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId((-294), 0, 3148);
      int int0 = shuffleBlockId0.mapId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId((-1694), (-1), (-1));
      int int0 = shuffleBlockId0.mapId();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId(111, 1, 1);
      ShuffleBlockId shuffleBlockId1 = shuffleBlockId0.copy(3, 3434, (-953));
      assertEquals(3, shuffleBlockId1.shuffleId());
      assertEquals((-953), shuffleBlockId1.copy$default$3());
      assertEquals(3434, shuffleBlockId1.mapId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply(3787, 2433880, 0);
      ShuffleBlockId shuffleBlockId1 = shuffleBlockId0.copy(0, 0, 677);
      int int0 = shuffleBlockId1.shuffleId();
      assertEquals(0, shuffleBlockId0.copy$default$3());
      assertEquals(0, int0);
      assertEquals(3787, shuffleBlockId0.shuffleId());
      assertEquals(677, shuffleBlockId1.reduceId());
      assertEquals(2433880, shuffleBlockId0.copy$default$2());
      assertEquals(0, shuffleBlockId1.mapId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply((-529), (-529), (-529));
      ShuffleBlockId shuffleBlockId1 = shuffleBlockId0.copy((-524), (-1), 0);
      int int0 = shuffleBlockId1.copy$default$3();
      assertEquals((-1), shuffleBlockId1.mapId());
      assertEquals(0, int0);
      assertEquals((-529), shuffleBlockId0.shuffleId());
      assertEquals((-529), shuffleBlockId0.copy$default$2());
      assertEquals((-529), shuffleBlockId0.copy$default$3());
      assertEquals((-524), shuffleBlockId1.shuffleId());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId(25, 0, 0);
      ShuffleBlockId shuffleBlockId1 = shuffleBlockId0.copy(25, 0, 25);
      int int0 = shuffleBlockId1.copy$default$3();
      assertEquals(0, shuffleBlockId1.mapId());
      assertEquals(25, shuffleBlockId1.copy$default$1());
      assertEquals(25, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId(0, 0, 0);
      int int0 = shuffleBlockId0.copy$default$2();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply(4398, 4398, 4398);
      int int0 = shuffleBlockId0.copy$default$2();
      assertEquals(4398, shuffleBlockId0.shuffleId());
      assertEquals(4398, shuffleBlockId0.reduceId());
      assertEquals(4398, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId(0, 0, 0);
      int int0 = shuffleBlockId0.copy$default$1();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply(865, 865, 297);
      int int0 = shuffleBlockId0.copy$default$1();
      assertEquals(297, shuffleBlockId0.copy$default$3());
      assertEquals(865, shuffleBlockId0.mapId());
      assertEquals(865, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply(4398, 4398, 4398);
      shuffleBlockId0.canEqual(shuffleBlockId0);
      assertEquals(4398, shuffleBlockId0.copy$default$1());
      assertEquals(4398, shuffleBlockId0.copy$default$2());
      assertEquals(4398, shuffleBlockId0.reduceId());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply((-1142), 0, 435);
      assertEquals(0, shuffleBlockId0.mapId());
      assertEquals((-1142), shuffleBlockId0.copy$default$1());
      assertEquals(435, shuffleBlockId0.reduceId());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply(0, (-1203), 2609);
      assertEquals(0, shuffleBlockId0.copy$default$1());
      assertEquals((-1203), shuffleBlockId0.copy$default$2());
      assertEquals(2609, shuffleBlockId0.reduceId());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId(2604, 2604, 2604);
      int int0 = shuffleBlockId0.productArity();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply((-889275714), (-889275714), (-889275714));
      shuffleBlockId0.canEqual((Object) null);
      assertEquals((-889275714), shuffleBlockId0.copy$default$1());
      assertEquals((-889275714), shuffleBlockId0.reduceId());
      assertEquals((-889275714), shuffleBlockId0.mapId());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply(3810, 3810, (-588));
      int int0 = shuffleBlockId0.mapId();
      assertEquals(3810, int0);
      assertEquals(3810, shuffleBlockId0.shuffleId());
      assertEquals((-588), shuffleBlockId0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply(3787, 2433880, 0);
      int int0 = shuffleBlockId0.shuffleId();
      assertEquals(3787, int0);
      assertEquals(0, shuffleBlockId0.reduceId());
      assertEquals(2433880, shuffleBlockId0.mapId());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId(111, 1, 1);
      int int0 = shuffleBlockId0.reduceId();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Option<Tuple3<Object, Object, Object>> option0 = ShuffleBlockId.unapply((ShuffleBlockId) null);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId((-328), (-328), (-328));
      ShuffleBlockId shuffleBlockId1 = shuffleBlockId0.copy((-328), (-328), 1);
      boolean boolean0 = shuffleBlockId0.equals(shuffleBlockId1);
      assertFalse(shuffleBlockId1.equals((Object)shuffleBlockId0));
      assertFalse(boolean0);
      assertEquals((-328), shuffleBlockId1.mapId());
      assertEquals(1, shuffleBlockId1.reduceId());
      assertEquals((-328), shuffleBlockId1.shuffleId());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId((-889275739), (-889275739), 2720);
      ShuffleBlockId shuffleBlockId1 = new ShuffleBlockId((-889275739), 2720, 2720);
      boolean boolean0 = shuffleBlockId0.equals(shuffleBlockId1);
      assertEquals(2720, shuffleBlockId1.mapId());
      assertFalse(shuffleBlockId1.equals((Object)shuffleBlockId0));
      assertEquals((-889275739), shuffleBlockId1.copy$default$1());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId((-889275713), (-889275713), (-889275713));
      ShuffleBlockId shuffleBlockId1 = new ShuffleBlockId((-1028477365), (-889275713), (-1028477365));
      boolean boolean0 = shuffleBlockId1.equals(shuffleBlockId0);
      assertEquals((-1028477365), shuffleBlockId1.shuffleId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId(1, 1, 1);
      Object object0 = shuffleBlockId0.productElement(1);
      assertEquals(1, object0);
      
      boolean boolean0 = shuffleBlockId0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply((-889275718), (-889275718), (-889275718));
      boolean boolean0 = shuffleBlockId0.equals(shuffleBlockId0);
      assertTrue(boolean0);
      assertEquals((-889275718), shuffleBlockId0.mapId());
      assertEquals((-889275718), shuffleBlockId0.copy$default$3());
      assertEquals((-889275718), shuffleBlockId0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId(2, 2, 2);
      Object object0 = shuffleBlockId0.productElement(2);
      assertEquals(2, object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply((-889275714), (-889275714), (-889275714));
      // Undeclared exception!
      try { 
        shuffleBlockId0.productElement((-889275714));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000004
         //
         verifyException("org.apache.spark.storage.ShuffleBlockId", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId((-3266), (-3266), (-3266));
      Object object0 = shuffleBlockId0.productElement(0);
      assertEquals((-3266), object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply((-889275718), (-889275718), (-889275718));
      ShuffleBlockId shuffleBlockId1 = new ShuffleBlockId((-889275718), (-889275718), (-889275718));
      boolean boolean0 = shuffleBlockId0.equals(shuffleBlockId1);
      assertEquals((-889275718), shuffleBlockId1.copy$default$1());
      assertEquals((-889275718), shuffleBlockId1.copy$default$3());
      assertTrue(boolean0);
      assertEquals((-889275718), shuffleBlockId1.copy$default$2());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId(92, 92, 92);
      String string0 = shuffleBlockId0.productPrefix();
      assertEquals("ShuffleBlockId", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply((-889275714), (-889275714), (-889275714));
      shuffleBlockId0.productIterator();
      assertEquals(3, shuffleBlockId0.productArity());
      assertEquals((-889275714), shuffleBlockId0.mapId());
      assertEquals((-889275714), shuffleBlockId0.copy$default$1());
      assertEquals((-889275714), shuffleBlockId0.reduceId());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId((-889275714), (-889275714), (-889275714));
      String string0 = shuffleBlockId0.name();
      assertEquals("shuffle_-889275714_-889275714_-889275714", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply((-3229), (-3229), (-3229));
      shuffleBlockId0.hashCode();
      assertEquals((-3229), shuffleBlockId0.copy$default$3());
      assertEquals((-3229), shuffleBlockId0.mapId());
      assertEquals((-3229), shuffleBlockId0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Function1<Tuple3<Object, Object, Object>, ShuffleBlockId> function1_0 = ShuffleBlockId.tupled();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Function1<Object, Function1<Object, Function1<Object, ShuffleBlockId>>> function1_0 = ShuffleBlockId.curried();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply((-1), (-1), (-135));
      int int0 = shuffleBlockId0.copy$default$3();
      assertEquals((-1), shuffleBlockId0.copy$default$1());
      assertEquals((-135), int0);
      assertEquals((-1), shuffleBlockId0.copy$default$2());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = new ShuffleBlockId(1, (-2547), (-2547));
      int int0 = shuffleBlockId0.copy$default$2();
      assertEquals((-2547), int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply((-345), (-345), (-345));
      ShuffleBlockId.unapply(shuffleBlockId0);
      assertEquals((-345), shuffleBlockId0.copy$default$1());
      assertEquals((-345), shuffleBlockId0.copy$default$2());
      assertEquals((-345), shuffleBlockId0.copy$default$3());
      assertEquals((-345), shuffleBlockId0.reduceId());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ShuffleBlockId shuffleBlockId0 = ShuffleBlockId.apply((-889275714), (-889275714), (-889275714));
      int int0 = shuffleBlockId0.copy$default$1();
      assertEquals((-889275714), int0);
      assertEquals((-889275714), shuffleBlockId0.mapId());
      assertEquals((-889275714), shuffleBlockId0.reduceId());
  }
}