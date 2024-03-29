/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:07:20 GMT 2022
 */

package org.apache.spark;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.FetchFailed;
import org.apache.spark.storage.BlockManagerId;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import scala.Function1;
import scala.Option;
import scala.Tuple5;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FetchFailed_ESTest extends FetchFailed_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, (-2096), (-2096), (-2096), "3tLP");
      FetchFailed fetchFailed1 = new FetchFailed((BlockManagerId) null, (-2096), (-2096), 4, "");
      boolean boolean0 = fetchFailed0.equals(fetchFailed1);
      assertEquals((-2096), fetchFailed1.copy$default$2());
      assertFalse(boolean0);
      assertEquals(4, fetchFailed1.reduceId());
      assertEquals((-2096), fetchFailed1.mapId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, 4, (-889275714), 4, "");
      FetchFailed fetchFailed1 = new FetchFailed((BlockManagerId) null, 4, (-1), (-889275714), "");
      boolean boolean0 = fetchFailed1.equals(fetchFailed0);
      assertEquals(4, fetchFailed1.shuffleId());
      assertFalse(boolean0);
      assertEquals((-1), fetchFailed1.mapId());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FetchFailed fetchFailed0 = FetchFailed.apply((BlockManagerId) null, 2794, 195, 2794, "lnVk`EmHdQeylG!1Y(C");
      FetchFailed fetchFailed1 = FetchFailed.apply((BlockManagerId) null, 195, 195, 195, "lnVk`EmHdQeylG!1Y(C");
      boolean boolean0 = fetchFailed0.equals(fetchFailed1);
      assertFalse(boolean0);
      assertEquals(195, fetchFailed0.mapId());
      assertEquals(2794, fetchFailed0.copy$default$2());
      assertEquals(2794, fetchFailed0.copy$default$4());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      FetchFailed fetchFailed0 = new FetchFailed(blockManagerId0, 0, 0, 0, "*mMA)[K`8~");
      int int0 = fetchFailed0.shuffleId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      FetchFailed fetchFailed0 = new FetchFailed(blockManagerId0, 0, 0, 2420, "n6IwN");
      BlockManagerId blockManagerId1 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(blockManagerId1).toString();
      FetchFailed fetchFailed1 = fetchFailed0.copy(blockManagerId1, 2420, 0, (-2176), "\n)");
      int int0 = fetchFailed1.shuffleId();
      assertEquals(0, fetchFailed1.copy$default$3());
      assertEquals(2420, int0);
      assertEquals((-2176), fetchFailed1.reduceId());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      FetchFailed fetchFailed0 = new FetchFailed(blockManagerId0, 0, (-1011), (-1011), "MLB0|NOEze!PF_kF");
      BlockManagerId blockManagerId1 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn("k=K%1u").when(blockManagerId1).toString();
      FetchFailed fetchFailed1 = fetchFailed0.copy(blockManagerId1, 0, 0, 0, "MLB0|NOEze!PF_kF");
      int int0 = fetchFailed1.reduceId();
      assertEquals(0, int0);
      assertEquals(0, fetchFailed1.copy$default$2());
      assertEquals(0, fetchFailed1.copy$default$3());
      assertEquals((-1011), fetchFailed0.copy$default$4());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      FetchFailed fetchFailed0 = new FetchFailed(blockManagerId0, 0, 0, 2420, "n6IwN");
      BlockManagerId blockManagerId1 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(blockManagerId1).toString();
      FetchFailed fetchFailed1 = fetchFailed0.copy(blockManagerId1, 2420, 0, (-2176), "\n)");
      int int0 = fetchFailed1.reduceId();
      assertEquals(2420, fetchFailed1.shuffleId());
      assertEquals(0, fetchFailed1.copy$default$3());
      assertEquals((-2176), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, 4, (-889275714), 4, "");
      Object object0 = fetchFailed0.productElement(0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(blockManagerId0).toString();
      FetchFailed fetchFailed0 = FetchFailed.apply(blockManagerId0, 1420, 0, 1420, "");
      BlockManagerId blockManagerId1 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(blockManagerId1).toString();
      FetchFailed fetchFailed1 = fetchFailed0.copy(blockManagerId1, 1420, 962, 0, (String) null);
      fetchFailed1.message();
      assertEquals(0, fetchFailed0.copy$default$3());
      assertEquals(1420, fetchFailed0.copy$default$2());
      assertEquals(1420, fetchFailed1.copy$default$2());
      assertEquals(1420, fetchFailed0.reduceId());
      assertEquals(962, fetchFailed1.mapId());
      assertEquals(0, fetchFailed1.copy$default$4());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(blockManagerId0).toString();
      FetchFailed fetchFailed0 = FetchFailed.apply(blockManagerId0, 0, Integer.MAX_VALUE, 0, "scala.collection.mutable.HashEntry$class");
      fetchFailed0.message();
      assertEquals(Integer.MAX_VALUE, fetchFailed0.mapId());
      assertEquals(0, fetchFailed0.shuffleId());
      assertEquals(0, fetchFailed0.reduceId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(blockManagerId0).toString();
      FetchFailed fetchFailed0 = FetchFailed.apply(blockManagerId0, (-272), 0, 1503, "M9fV[Q)Y(wG");
      FetchFailed fetchFailed1 = fetchFailed0.copy((BlockManagerId) null, 0, 41, 198, "UwIQ");
      int int0 = fetchFailed1.mapId();
      assertEquals(198, fetchFailed1.copy$default$4());
      assertEquals(41, int0);
      assertEquals(0, fetchFailed1.shuffleId());
      assertEquals(0, fetchFailed0.copy$default$3());
      assertEquals(1503, fetchFailed0.reduceId());
      assertEquals((-272), fetchFailed0.copy$default$2());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(blockManagerId0).toString();
      FetchFailed fetchFailed0 = FetchFailed.apply(blockManagerId0, 0, 0, 0, "7At}~.h6R )'4kAv");
      BlockManagerId blockManagerId1 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(blockManagerId1).toString();
      FetchFailed fetchFailed1 = fetchFailed0.copy(blockManagerId1, (-459), (-852), 3367, "7At}~.h6R )'4kAv");
      int int0 = fetchFailed1.mapId();
      assertEquals(0, fetchFailed0.copy$default$2());
      assertEquals(0, fetchFailed0.copy$default$3());
      assertEquals(0, fetchFailed0.reduceId());
      assertEquals((-852), int0);
      assertEquals((-459), fetchFailed1.copy$default$2());
      assertEquals(3367, fetchFailed1.copy$default$4());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(blockManagerId0).toString();
      FetchFailed fetchFailed0 = FetchFailed.apply(blockManagerId0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null);
      fetchFailed0.copy$default$5();
      assertEquals(Integer.MAX_VALUE, fetchFailed0.reduceId());
      assertEquals(Integer.MAX_VALUE, fetchFailed0.shuffleId());
      assertEquals(Integer.MAX_VALUE, fetchFailed0.mapId());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, 4, (-889275714), 4, "");
      String string0 = fetchFailed0.copy$default$5();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      FetchFailed fetchFailed0 = new FetchFailed(blockManagerId0, 4877, 4877, 4877, "");
      int int0 = fetchFailed0.copy$default$4();
      assertEquals(4877, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(blockManagerId0).toString();
      FetchFailed fetchFailed0 = FetchFailed.apply(blockManagerId0, (-313), 2114, (-125), "3d;-((i(z7v:8n4[Pb");
      int int0 = fetchFailed0.copy$default$4();
      assertEquals((-313), fetchFailed0.copy$default$2());
      assertEquals(2114, fetchFailed0.mapId());
      assertEquals((-125), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, 4, (-889275714), 4, "");
      FetchFailed fetchFailed1 = fetchFailed0.copy((BlockManagerId) null, (-889275714), 0, (-1572), "");
      int int0 = fetchFailed1.copy$default$3();
      assertEquals(0, int0);
      assertEquals((-889275714), fetchFailed1.shuffleId());
      assertEquals((-1572), fetchFailed1.reduceId());
      assertEquals((-889275714), fetchFailed0.mapId());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      FetchFailed fetchFailed0 = new FetchFailed(blockManagerId0, 4877, 4877, 4877, "");
      BlockManagerId blockManagerId1 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(blockManagerId1).toString();
      FetchFailed fetchFailed1 = fetchFailed0.copy(blockManagerId1, (-3713), (-3713), 4877, "");
      int int0 = fetchFailed1.copy$default$3();
      assertEquals((-3713), int0);
      assertEquals((-3713), fetchFailed1.shuffleId());
      assertEquals(4877, fetchFailed1.reduceId());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, 4, (-889275714), 4, "");
      FetchFailed fetchFailed1 = fetchFailed0.copy((BlockManagerId) null, 0, (-2172), (-324), "");
      int int0 = fetchFailed1.copy$default$2();
      assertEquals(0, int0);
      assertEquals(4, fetchFailed0.shuffleId());
      assertEquals((-324), fetchFailed1.copy$default$4());
      assertEquals((-2172), fetchFailed1.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, (-2096), (-2096), (-2096), "3tLP");
      int int0 = fetchFailed0.copy$default$2();
      assertEquals((-2096), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      FetchFailed fetchFailed0 = new FetchFailed(blockManagerId0, (-557), (-942), (-557), "p{kNV`7;J73B");
      boolean boolean0 = fetchFailed0.canEqual(fetchFailed0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      FetchFailed fetchFailed0 = new FetchFailed(blockManagerId0, 0, 0, 0, "O!+:9?Iv");
      Object object0 = fetchFailed0.productElement(3);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FetchFailed fetchFailed0 = FetchFailed.apply((BlockManagerId) null, (-1), (-2788), (-1), ", shuffleId=");
      Object object0 = fetchFailed0.productElement(2);
      assertEquals((-2788), object0);
      assertEquals((-1), fetchFailed0.copy$default$2());
      assertEquals((-1), fetchFailed0.copy$default$4());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      FetchFailed fetchFailed0 = new FetchFailed(blockManagerId0, 0, 0, 0, "O!+:9?Iv");
      Object object0 = fetchFailed0.productElement(1);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FetchFailed fetchFailed0 = FetchFailed.apply((BlockManagerId) null, (-1), (-2788), (-1), ", shuffleId=");
      fetchFailed0.productElement(4);
      assertEquals((-2788), fetchFailed0.mapId());
      assertEquals((-1), fetchFailed0.copy$default$2());
      assertEquals((-1), fetchFailed0.reduceId());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      FetchFailed fetchFailed0 = new FetchFailed(blockManagerId0, (-1742), 1565550863, 267, "FetchFailed");
      int int0 = fetchFailed0.shuffleId();
      assertEquals((-1742), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      FetchFailed fetchFailed0 = new FetchFailed(blockManagerId0, (-1742), 1565550863, 267, "FetchFailed");
      String string0 = fetchFailed0.productPrefix();
      assertEquals("FetchFailed", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, (-2096), (-2096), (-2096), "3tLP");
      fetchFailed0.productIterator();
      assertEquals(5, fetchFailed0.productArity());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, 4, (-2096), 2, "");
      String string0 = fetchFailed0.message();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, (-2096), (-2096), (-2096), "3tLP");
      BlockManagerId blockManagerId0 = fetchFailed0.bmAddress();
      assertNull(blockManagerId0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(blockManagerId0).toString();
      FetchFailed fetchFailed0 = new FetchFailed(blockManagerId0, 0, (-1011), (-1011), "MLB0|NOEze!PF_kF");
      Object object0 = fetchFailed0.productElement(0);
      boolean boolean0 = fetchFailed0.canEqual(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(blockManagerId0).toString();
      FetchFailed fetchFailed0 = FetchFailed.apply(blockManagerId0, (-272), 0, 1503, "M9fV[Q)Y(wG");
      int int0 = fetchFailed0.mapId();
      assertEquals((-272), fetchFailed0.shuffleId());
      assertEquals(0, int0);
      assertEquals(1503, fetchFailed0.copy$default$4());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FetchFailed fetchFailed0 = FetchFailed.apply((BlockManagerId) null, (-2), (-2), (-2), "");
      int int0 = fetchFailed0.productArity();
      assertEquals((-2), fetchFailed0.reduceId());
      assertEquals((-2), fetchFailed0.shuffleId());
      assertEquals((-2), fetchFailed0.mapId());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      FetchFailed fetchFailed0 = new FetchFailed(blockManagerId0, (-1742), 1565550863, 267, "FetchFailed");
      int int0 = fetchFailed0.reduceId();
      assertEquals(267, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, 2811, 2811, 2811, (String) null);
      String string0 = fetchFailed0.toErrorString();
      assertEquals("FetchFailed(null, shuffleId=2811, mapId=2811, reduceId=2811, message=\nnull\n)", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(blockManagerId0).toString();
      FetchFailed fetchFailed0 = FetchFailed.apply(blockManagerId0, 2771, 2771, 2771, "B)");
      String string0 = fetchFailed0.toErrorString();
      assertEquals("FetchFailed(null, shuffleId=2771, mapId=2771, reduceId=2771, message=\nB)\n)", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FetchFailed fetchFailed0 = FetchFailed.apply((BlockManagerId) null, 461845907, 461845907, 461845907, "");
      FetchFailed.unapply(fetchFailed0);
      assertEquals(461845907, fetchFailed0.copy$default$4());
      assertEquals(461845907, fetchFailed0.copy$default$2());
      assertEquals(461845907, fetchFailed0.mapId());
      assertEquals(461845907, fetchFailed0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, (-30), (-30), (-30), "gmNCD7'V\u0002'D7UD");
      FetchFailed fetchFailed1 = new FetchFailed((BlockManagerId) null, (-30), (-30), (-30), "Dtf/Btxg--0xAJn");
      boolean boolean0 = fetchFailed0.equals(fetchFailed1);
      assertEquals((-30), fetchFailed1.copy$default$3());
      assertFalse(boolean0);
      assertEquals((-30), fetchFailed1.copy$default$4());
      assertEquals((-30), fetchFailed1.shuffleId());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, (-490), (-490), (-490), "FetchFailed(");
      FetchFailed fetchFailed1 = new FetchFailed((BlockManagerId) null, (-490), (-490), (-490), (String) null);
      FetchFailed fetchFailed2 = fetchFailed0.copy((BlockManagerId) null, (-490), (-490), (-490), (String) null);
      boolean boolean0 = fetchFailed1.equals(fetchFailed2);
      assertEquals((-490), fetchFailed1.mapId());
      assertEquals((-490), fetchFailed2.copy$default$2());
      assertTrue(boolean0);
      assertEquals((-490), fetchFailed2.reduceId());
      assertFalse(fetchFailed0.equals((Object)fetchFailed2));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, (-30), (-30), (-30), "gmNCD7'V\u0002'D7UD");
      FetchFailed fetchFailed1 = new FetchFailed((BlockManagerId) null, (-30), (-30), (-30), (String) null);
      boolean boolean0 = fetchFailed1.equals(fetchFailed0);
      assertFalse(boolean0);
      assertEquals((-30), fetchFailed1.copy$default$2());
      assertEquals((-30), fetchFailed1.copy$default$4());
      assertEquals((-30), fetchFailed1.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, (-27), (-27), (-27), "gmNCD7'V\u0002'D7UD");
      FetchFailed fetchFailed1 = new FetchFailed((BlockManagerId) null, (-27), (-27), 2, "gmNCD7'V\u0002'D7UD");
      boolean boolean0 = fetchFailed1.equals(fetchFailed0);
      assertFalse(boolean0);
      assertFalse(fetchFailed0.equals((Object)fetchFailed1));
      assertEquals((-27), fetchFailed1.shuffleId());
      assertEquals(2, fetchFailed1.reduceId());
      assertEquals((-27), fetchFailed1.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FetchFailed fetchFailed0 = FetchFailed.apply((BlockManagerId) null, (-208), (-208), (-208), (String) null);
      FetchFailed fetchFailed1 = fetchFailed0.copy((BlockManagerId) null, (-208), 1469, 1469, (String) null);
      boolean boolean0 = fetchFailed0.equals(fetchFailed1);
      assertFalse(boolean0);
      assertEquals((-208), fetchFailed1.shuffleId());
      assertEquals(1469, fetchFailed1.reduceId());
      assertEquals((-208), fetchFailed0.copy$default$2());
      assertEquals(1469, fetchFailed1.mapId());
      assertEquals((-208), fetchFailed0.copy$default$3());
      assertEquals((-208), fetchFailed0.copy$default$4());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(blockManagerId0).toString();
      FetchFailed fetchFailed0 = new FetchFailed(blockManagerId0, 9, 568, 568, "");
      BlockManagerId blockManagerId1 = fetchFailed0.copy$default$1();
      FetchFailed fetchFailed1 = FetchFailed.apply(blockManagerId1, 366, 568, 9, ", ");
      boolean boolean0 = fetchFailed0.equals(fetchFailed1);
      assertEquals(568, fetchFailed1.copy$default$3());
      assertEquals(9, fetchFailed1.copy$default$4());
      assertFalse(boolean0);
      assertEquals(366, fetchFailed1.shuffleId());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(blockManagerId0).toString();
      FetchFailed fetchFailed0 = new FetchFailed(blockManagerId0, (-1703), 25, 25, "0gS!6");
      FetchFailed fetchFailed1 = FetchFailed.apply((BlockManagerId) null, (-1703), (-1703), 25, "0gS!6");
      boolean boolean0 = fetchFailed1.equals(fetchFailed0);
      assertFalse(boolean0);
      assertEquals(25, fetchFailed1.copy$default$4());
      assertEquals((-1703), fetchFailed1.copy$default$3());
      assertEquals((-1703), fetchFailed1.shuffleId());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(blockManagerId0).toString();
      FetchFailed fetchFailed0 = new FetchFailed(blockManagerId0, (-3980), (-3980), (-3980), "n+.v&R");
      BlockManagerId blockManagerId1 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(blockManagerId1).toString();
      FetchFailed fetchFailed1 = FetchFailed.apply(blockManagerId1, (-3980), (-3980), (-3980), "n+.v&R");
      boolean boolean0 = fetchFailed0.equals(fetchFailed1);
      assertEquals((-3980), fetchFailed1.copy$default$2());
      assertEquals((-3980), fetchFailed1.mapId());
      assertEquals((-3980), fetchFailed1.copy$default$4());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, 526, 526, 526, (String) null);
      boolean boolean0 = fetchFailed0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, (-828), (-828), (-828), "FetchFailed(");
      boolean boolean0 = fetchFailed0.equals(fetchFailed0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FetchFailed fetchFailed0 = FetchFailed.apply((BlockManagerId) null, (-204), (-204), (-204), "");
      // Undeclared exception!
      try { 
        fetchFailed0.productElement((-204));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000012
         //
         verifyException("org.apache.spark.FetchFailed", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, 51, 51, 51, "b");
      fetchFailed0.hashCode();
      assertEquals(51, fetchFailed0.copy$default$3());
      assertEquals(51, fetchFailed0.shuffleId());
      assertEquals(51, fetchFailed0.copy$default$4());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Option<Tuple5<BlockManagerId, Object, Object, Object, String>> option0 = FetchFailed.unapply((FetchFailed) null);
      assertEquals("None", option0.productPrefix());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, (-30), (-30), (-30), "gmNCD7'V\u0002'D7UD");
      FetchFailed fetchFailed1 = new FetchFailed((BlockManagerId) null, (-30), (-30), (-30), "gmNCD7'V\u0002'D7UD");
      boolean boolean0 = fetchFailed1.equals(fetchFailed0);
      assertTrue(boolean0);
      assertEquals((-30), fetchFailed1.reduceId());
      assertEquals((-30), fetchFailed1.copy$default$2());
      assertEquals((-30), fetchFailed1.mapId());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, (-2117), (-2117), (-2117), "3tLP");
      String string0 = fetchFailed0.copy$default$5();
      assertEquals("3tLP", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, 4, 4, 4, "");
      BlockManagerId blockManagerId0 = fetchFailed0.copy$default$1();
      assertNull(blockManagerId0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Function1<BlockManagerId, Function1<Object, Function1<Object, Function1<Object, Function1<String, FetchFailed>>>>> function1_0 = FetchFailed.curried();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      FetchFailed fetchFailed0 = new FetchFailed(blockManagerId0, (-1), 474, (-1), (String) null);
      int int0 = fetchFailed0.copy$default$3();
      assertEquals(474, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FetchFailed fetchFailed0 = new FetchFailed((BlockManagerId) null, 4, (-889275735), 4, "");
      int int0 = fetchFailed0.copy$default$2();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FetchFailed fetchFailed0 = FetchFailed.apply((BlockManagerId) null, (-2), (-2), (-2), "");
      boolean boolean0 = fetchFailed0.countTowardsTaskFailures();
      assertFalse(boolean0);
      assertEquals((-2), fetchFailed0.reduceId());
      assertEquals((-2), fetchFailed0.copy$default$3());
      assertEquals((-2), fetchFailed0.shuffleId());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      FetchFailed fetchFailed0 = new FetchFailed(blockManagerId0, 0, 0, 0, "FetchFailed(");
      int int0 = fetchFailed0.copy$default$4();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Function1<Tuple5<BlockManagerId, Object, Object, Object, String>, FetchFailed> function1_0 = FetchFailed.tupled();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FetchFailed fetchFailed0 = FetchFailed.apply((BlockManagerId) null, (-2), (-2), (-2), "");
      String string0 = fetchFailed0.toString();
      assertEquals("FetchFailed(null,-2,-2,-2,)", string0);
      assertEquals(5, fetchFailed0.productArity());
  }
}
