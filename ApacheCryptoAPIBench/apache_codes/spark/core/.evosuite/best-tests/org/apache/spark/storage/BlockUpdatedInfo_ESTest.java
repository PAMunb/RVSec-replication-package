/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:01:53 GMT 2022
 */

package org.apache.spark.storage;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.storage.BlockId;
import org.apache.spark.storage.BlockManagerId;
import org.apache.spark.storage.BlockUpdatedInfo;
import org.apache.spark.storage.StorageLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import scala.Option;
import scala.Tuple5;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BlockUpdatedInfo_ESTest extends BlockUpdatedInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, (BlockId) null, (StorageLevel) null, (-872L), (-872L));
      BlockUpdatedInfo blockUpdatedInfo1 = blockUpdatedInfo0.copy((BlockManagerId) null, (BlockId) null, (StorageLevel) null, (-872L), 1L);
      boolean boolean0 = blockUpdatedInfo0.equals(blockUpdatedInfo1);
      assertEquals((-872L), blockUpdatedInfo1.copy$default$4());
      assertFalse(boolean0);
      assertEquals(1L, blockUpdatedInfo1.copy$default$5());
      assertFalse(blockUpdatedInfo1.equals((Object)blockUpdatedInfo0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(storageLevel0).toString();
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(blockId0).toString();
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, blockId0, storageLevel0, 3008L, 337L);
      BlockId blockId1 = blockUpdatedInfo0.copy$default$2();
      StorageLevel storageLevel1 = blockUpdatedInfo0.copy$default$3();
      BlockUpdatedInfo blockUpdatedInfo1 = blockUpdatedInfo0.copy((BlockManagerId) null, blockId1, storageLevel1, 337L, 1794L);
      boolean boolean0 = blockUpdatedInfo0.equals(blockUpdatedInfo1);
      assertFalse(boolean0);
      assertEquals(337L, blockUpdatedInfo1.memSize());
      assertEquals(1794L, blockUpdatedInfo1.diskSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(blockManagerId0).toString();
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(storageLevel0).toString();
      BlockUpdatedInfo blockUpdatedInfo0 = BlockUpdatedInfo.apply(blockManagerId0, (BlockId) null, storageLevel0, 0L, 0L);
      Object object0 = blockUpdatedInfo0.productElement(1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(blockManagerId0).toString();
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(storageLevel0).toString();
      BlockUpdatedInfo blockUpdatedInfo0 = BlockUpdatedInfo.apply(blockManagerId0, (BlockId) null, storageLevel0, 2527L, 2527L);
      long long0 = blockUpdatedInfo0.memSize();
      assertEquals(2527L, blockUpdatedInfo0.diskSize());
      assertEquals(2527L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo(blockManagerId0, blockId0, (StorageLevel) null, (-1L), (-1L));
      long long0 = blockUpdatedInfo0.memSize();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(blockManagerId0).toString();
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(blockId0).toString();
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(storageLevel0).toString();
      BlockUpdatedInfo blockUpdatedInfo0 = BlockUpdatedInfo.apply(blockManagerId0, blockId0, storageLevel0, (-1505L), 0L);
      long long0 = blockUpdatedInfo0.diskSize();
      assertEquals(0L, long0);
      assertEquals((-1505L), blockUpdatedInfo0.memSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo(blockManagerId0, blockId0, (StorageLevel) null, (-1L), (-1L));
      long long0 = blockUpdatedInfo0.diskSize();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(blockManagerId0).toString();
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(blockId0).toString();
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(storageLevel0).toString();
      BlockUpdatedInfo blockUpdatedInfo0 = BlockUpdatedInfo.apply(blockManagerId0, blockId0, storageLevel0, 411L, 411L);
      long long0 = blockUpdatedInfo0.copy$default$5();
      assertEquals(411L, long0);
      assertEquals(411L, blockUpdatedInfo0.memSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo(blockManagerId0, blockId0, storageLevel0, 0L, (-2469L));
      long long0 = blockUpdatedInfo0.copy$default$5();
      assertEquals((-2469L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo(blockManagerId0, blockId0, storageLevel0, 0L, 1480L);
      long long0 = blockUpdatedInfo0.copy$default$4();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(blockManagerId0).toString();
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(storageLevel0).toString();
      BlockUpdatedInfo blockUpdatedInfo0 = BlockUpdatedInfo.apply(blockManagerId0, (BlockId) null, storageLevel0, 0L, 0L);
      BlockManagerId blockManagerId1 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(blockManagerId1).toString();
      StorageLevel storageLevel1 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(storageLevel1).toString();
      BlockUpdatedInfo blockUpdatedInfo1 = blockUpdatedInfo0.copy(blockManagerId1, (BlockId) null, storageLevel1, 388L, 0L);
      long long0 = blockUpdatedInfo1.copy$default$4();
      assertEquals(388L, long0);
      assertEquals(0L, blockUpdatedInfo1.diskSize());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(blockManagerId0).toString();
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(blockId0).toString();
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(storageLevel0).toString();
      BlockUpdatedInfo blockUpdatedInfo0 = BlockUpdatedInfo.apply(blockManagerId0, blockId0, storageLevel0, (-1505L), 0L);
      Object object0 = blockUpdatedInfo0.productElement(0);
      blockUpdatedInfo0.canEqual(object0);
      assertEquals((-1505L), blockUpdatedInfo0.copy$default$4());
      assertEquals(0L, blockUpdatedInfo0.copy$default$5());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, blockId0, storageLevel0, (-1502L), 0L);
      BlockManagerId blockManagerId0 = blockUpdatedInfo0.blockManagerId();
      assertNull(blockManagerId0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo(blockManagerId0, blockId0, storageLevel0, 0L, (-1L));
      BlockManagerId blockManagerId1 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(blockManagerId1).toString();
      StorageLevel storageLevel1 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(storageLevel1).toString();
      BlockUpdatedInfo blockUpdatedInfo1 = blockUpdatedInfo0.copy(blockManagerId1, (BlockId) null, storageLevel1, 0L, 0L);
      BlockId blockId1 = blockUpdatedInfo1.blockId();
      assertNull(blockId1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, blockId0, (StorageLevel) null, (-5579L), 337L);
      Object object0 = blockUpdatedInfo0.productElement(4);
      assertEquals(337L, object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(storageLevel0).toString();
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, blockId0, storageLevel0, 3032L, (-2450L));
      Object object0 = blockUpdatedInfo0.productElement(2);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn("<xg", "<xg").when(blockManagerId0).toString();
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      doReturn("<xg", "<xg").when(storageLevel0).toString();
      BlockUpdatedInfo blockUpdatedInfo0 = BlockUpdatedInfo.apply(blockManagerId0, (BlockId) null, storageLevel0, 0L, 0L);
      Object object0 = blockUpdatedInfo0.productElement(3);
      assertEquals(0L, object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, (BlockId) null, storageLevel0, 0L, 2812L);
      long long0 = blockUpdatedInfo0.diskSize();
      assertEquals(2812L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, (BlockId) null, (StorageLevel) null, 374L, 374L);
      StorageLevel storageLevel0 = blockUpdatedInfo0.storageLevel();
      assertNull(storageLevel0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(blockManagerId0).toString();
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(storageLevel0).toString();
      BlockUpdatedInfo blockUpdatedInfo0 = BlockUpdatedInfo.apply(blockManagerId0, (BlockId) null, storageLevel0, 0L, 0L);
      long long0 = blockUpdatedInfo0.memSize();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, (BlockId) null, (StorageLevel) null, 0L, 0L);
      String string0 = blockUpdatedInfo0.productPrefix();
      assertEquals("BlockUpdatedInfo", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, (BlockId) null, (StorageLevel) null, (-748L), (-748L));
      int int0 = blockUpdatedInfo0.productArity();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, blockId0, (StorageLevel) null, (-5579L), 337L);
      blockUpdatedInfo0.productIterator();
      assertEquals(5, blockUpdatedInfo0.productArity());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo(blockManagerId0, (BlockId) null, (StorageLevel) null, 1503L, 1503L);
      boolean boolean0 = blockUpdatedInfo0.canEqual(blockUpdatedInfo0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, (BlockId) null, (StorageLevel) null, (-842L), (-842L));
      BlockUpdatedInfo blockUpdatedInfo1 = new BlockUpdatedInfo((BlockManagerId) null, (BlockId) null, (StorageLevel) null, (-4533L), (-4533L));
      boolean boolean0 = blockUpdatedInfo1.equals(blockUpdatedInfo0);
      assertFalse(boolean0);
      assertEquals((-4533L), blockUpdatedInfo1.memSize());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(storageLevel0).toString();
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, (BlockId) null, storageLevel0, 2651L, 2651L);
      StorageLevel storageLevel1 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(storageLevel1).toString();
      BlockUpdatedInfo blockUpdatedInfo1 = new BlockUpdatedInfo((BlockManagerId) null, (BlockId) null, storageLevel1, 2651L, 2651L);
      boolean boolean0 = blockUpdatedInfo1.equals(blockUpdatedInfo0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(storageLevel0).toString();
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, (BlockId) null, storageLevel0, (-2639L), (-2639L));
      BlockUpdatedInfo blockUpdatedInfo1 = new BlockUpdatedInfo((BlockManagerId) null, (BlockId) null, (StorageLevel) null, 1482L, (-3975L));
      boolean boolean0 = blockUpdatedInfo1.equals(blockUpdatedInfo0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(blockId0).toString();
      BlockUpdatedInfo blockUpdatedInfo0 = BlockUpdatedInfo.apply((BlockManagerId) null, blockId0, (StorageLevel) null, (-846L), (-846L));
      BlockId blockId1 = blockUpdatedInfo0.copy$default$2();
      BlockUpdatedInfo blockUpdatedInfo1 = new BlockUpdatedInfo((BlockManagerId) null, blockId1, (StorageLevel) null, (-846L), 1L);
      boolean boolean0 = blockUpdatedInfo1.equals(blockUpdatedInfo0);
      assertFalse(blockUpdatedInfo0.equals((Object)blockUpdatedInfo1));
      assertEquals((-846L), blockUpdatedInfo0.copy$default$5());
      assertEquals((-846L), blockUpdatedInfo0.memSize());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(blockId0).toString();
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, blockId0, storageLevel0, 987L, 987L);
      BlockUpdatedInfo blockUpdatedInfo1 = blockUpdatedInfo0.copy((BlockManagerId) null, (BlockId) null, (StorageLevel) null, 0L, 3072L);
      boolean boolean0 = blockUpdatedInfo1.equals(blockUpdatedInfo0);
      assertEquals(0L, blockUpdatedInfo1.memSize());
      assertFalse(boolean0);
      assertEquals(3072L, blockUpdatedInfo1.diskSize());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(blockId0).toString();
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, blockId0, (StorageLevel) null, (-878L), (-878L));
      BlockId blockId1 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(blockId1).toString();
      BlockUpdatedInfo blockUpdatedInfo1 = BlockUpdatedInfo.apply((BlockManagerId) null, blockId1, (StorageLevel) null, (-878L), (-555L));
      boolean boolean0 = blockUpdatedInfo0.equals(blockUpdatedInfo1);
      assertFalse(boolean0);
      assertEquals((-555L), blockUpdatedInfo1.diskSize());
      assertEquals((-878L), blockUpdatedInfo1.copy$default$4());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(blockManagerId0).toString();
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(storageLevel0).toString();
      BlockUpdatedInfo blockUpdatedInfo0 = BlockUpdatedInfo.apply(blockManagerId0, (BlockId) null, storageLevel0, (-876L), (-876L));
      BlockUpdatedInfo blockUpdatedInfo1 = BlockUpdatedInfo.apply(blockManagerId0, (BlockId) null, storageLevel0, (-876L), (-876L));
      boolean boolean0 = blockUpdatedInfo0.equals(blockUpdatedInfo1);
      assertTrue(boolean0);
      assertEquals((-876L), blockUpdatedInfo1.copy$default$4());
      assertEquals((-876L), blockUpdatedInfo1.copy$default$5());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(blockManagerId0).toString();
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo(blockManagerId0, (BlockId) null, storageLevel0, (-1963L), (-1963L));
      StorageLevel storageLevel1 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(storageLevel1).toString();
      BlockUpdatedInfo blockUpdatedInfo1 = blockUpdatedInfo0.copy((BlockManagerId) null, (BlockId) null, storageLevel1, (-1668L), (-1963L));
      boolean boolean0 = blockUpdatedInfo1.equals(blockUpdatedInfo0);
      assertEquals((-1668L), blockUpdatedInfo1.copy$default$4());
      assertEquals((-1963L), blockUpdatedInfo1.diskSize());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(blockManagerId0).toString();
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo(blockManagerId0, (BlockId) null, (StorageLevel) null, (-872L), (-872L));
      BlockManagerId blockManagerId1 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(blockManagerId1).toString();
      BlockUpdatedInfo blockUpdatedInfo1 = BlockUpdatedInfo.apply(blockManagerId1, (BlockId) null, (StorageLevel) null, (-872L), (-872L));
      boolean boolean0 = blockUpdatedInfo1.equals(blockUpdatedInfo0);
      assertEquals((-872L), blockUpdatedInfo1.copy$default$4());
      assertFalse(boolean0);
      assertEquals((-872L), blockUpdatedInfo1.diskSize());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BlockUpdatedInfo blockUpdatedInfo0 = BlockUpdatedInfo.apply((BlockManagerId) null, (BlockId) null, (StorageLevel) null, (-831L), (-831L));
      boolean boolean0 = blockUpdatedInfo0.equals((Object) null);
      assertEquals((-831L), blockUpdatedInfo0.diskSize());
      assertEquals((-831L), blockUpdatedInfo0.copy$default$4());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, (BlockId) null, (StorageLevel) null, (-872L), (-872L));
      boolean boolean0 = blockUpdatedInfo0.equals(blockUpdatedInfo0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, (BlockId) null, (StorageLevel) null, (-1623L), (-1623L));
      // Undeclared exception!
      try { 
        blockUpdatedInfo0.productElement((-2146860103));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000002
         //
         verifyException("org.apache.spark.storage.BlockUpdatedInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Option<Tuple5<BlockManagerId, BlockId, StorageLevel, Object, Object>> option0 = BlockUpdatedInfo.unapply((BlockUpdatedInfo) null);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, (BlockId) null, (StorageLevel) null, (-748L), (-748L));
      BlockManagerId blockManagerId0 = blockUpdatedInfo0.copy$default$1();
      assertNull(blockManagerId0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BlockUpdatedInfo blockUpdatedInfo0 = BlockUpdatedInfo.apply((BlockManagerId) null, (BlockId) null, (StorageLevel) null, (-15L), (-15L));
      blockUpdatedInfo0.copy$default$2();
      assertEquals((-15L), blockUpdatedInfo0.copy$default$4());
      assertEquals((-15L), blockUpdatedInfo0.copy$default$5());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, (BlockId) null, (StorageLevel) null, (-748L), (-748L));
      blockUpdatedInfo0.hashCode();
      assertEquals((-748L), blockUpdatedInfo0.memSize());
      assertEquals((-748L), blockUpdatedInfo0.diskSize());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo(blockManagerId0, (BlockId) null, storageLevel0, (-2091L), (-2091L));
      long long0 = blockUpdatedInfo0.copy$default$4();
      assertEquals((-2091L), long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BlockManagerId blockManagerId0 = mock(BlockManagerId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(blockManagerId0).toString();
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(blockId0).toString();
      StorageLevel storageLevel0 = mock(StorageLevel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(storageLevel0).toString();
      BlockUpdatedInfo blockUpdatedInfo0 = BlockUpdatedInfo.apply(blockManagerId0, blockId0, storageLevel0, 0L, 0L);
      long long0 = blockUpdatedInfo0.copy$default$5();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, (BlockId) null, (StorageLevel) null, 3023L, 3023L);
      String string0 = blockUpdatedInfo0.toString();
      assertEquals(5, blockUpdatedInfo0.productArity());
      assertEquals("BlockUpdatedInfo(null,null,null,3023,3023)", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BlockUpdatedInfo blockUpdatedInfo0 = new BlockUpdatedInfo((BlockManagerId) null, (BlockId) null, (StorageLevel) null, (-748L), (-748L));
      BlockUpdatedInfo.unapply(blockUpdatedInfo0);
      assertEquals((-748L), blockUpdatedInfo0.copy$default$4());
      assertEquals((-748L), blockUpdatedInfo0.diskSize());
      assertEquals((-748L), blockUpdatedInfo0.memSize());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BlockUpdatedInfo blockUpdatedInfo0 = BlockUpdatedInfo.apply((BlockManagerId) null, (BlockId) null, (StorageLevel) null, (-846L), (-846L));
      blockUpdatedInfo0.copy$default$3();
      assertEquals((-846L), blockUpdatedInfo0.diskSize());
      assertEquals((-846L), blockUpdatedInfo0.memSize());
  }
}
