/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 21:59:25 GMT 2022
 */

package org.apache.spark.storage;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.apache.spark.storage.BlockId;
import org.apache.spark.storage.BlockInfoManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import scala.Function0;
import scala.Option;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BlockInfoManager_ESTest extends BlockInfoManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      blockInfoManager0.registerTask((-178L));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      Function0<String> function0_0 = (Function0<String>) mock(Function0.class, new ViolatedAssumptionAnswer());
      blockInfoManager0.logTrace(function0_0);
      blockInfoManager0.org$apache$spark$internal$Logging$$log_();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      blockInfoManager0.get(blockId0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      blockInfoManager0.initializeLogIfNecessary(false, true);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      blockInfoManager0.org$apache$spark$storage$BlockInfoManager$$currentTaskAttemptId();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      blockInfoManager0.logName();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      blockInfoManager0.log();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      blockInfoManager0.initializeLogIfNecessary(false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      Logger logger0 = blockInfoManager0.org$apache$spark$internal$Logging$$log_();
      blockInfoManager0.org$apache$spark$internal$Logging$$log__$eq(logger0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        blockInfoManager0.unlock(blockId0, (Option<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.spark.storage.BlockInfoManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(blockId0).toString();
      // Undeclared exception!
      try { 
        blockInfoManager0.assertBlockIsLockedForWriting(blockId0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Block null does not exist
         //
         verifyException("org.apache.spark.storage.BlockInfoManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      blockInfoManager0.lockForWriting(blockId0, false);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      blockInfoManager0.lockForReading(blockId0, false);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      Function0<String> function0_0 = (Function0<String>) mock(Function0.class, new ViolatedAssumptionAnswer());
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      blockInfoManager0.logTrace(function0_0, throwable0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      Function0<String> function0_0 = (Function0<String>) mock(Function0.class, new ViolatedAssumptionAnswer());
      blockInfoManager0.logError(function0_0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        blockInfoManager0.downgradeLock(blockId0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // None.get
         //
         verifyException("scala.None$", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      blockInfoManager0.lockForWriting$default$2();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      Function0<String> function0_0 = (Function0<String>) mock(Function0.class, new ViolatedAssumptionAnswer());
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      blockInfoManager0.logInfo(function0_0, throwable0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      blockInfoManager0.isTraceEnabled();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      blockInfoManager0.clear();
      blockInfoManager0.getNumberOfMapEntries();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      Function0<String> function0_0 = (Function0<String>) mock(Function0.class, new ViolatedAssumptionAnswer());
      blockInfoManager0.logDebug(function0_0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      blockInfoManager0.lockForReading$default$2();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      blockInfoManager0.releaseAllLocksForTask(1L);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      BlockId blockId0 = mock(BlockId.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(blockId0).toString();
      // Undeclared exception!
      try { 
        blockInfoManager0.removeBlock(blockId0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Task -1024 called remove() on non-existent block null
         //
         verifyException("org.apache.spark.storage.BlockInfoManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      Function0<String> function0_0 = (Function0<String>) mock(Function0.class, new ViolatedAssumptionAnswer());
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      blockInfoManager0.logWarning(function0_0, throwable0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      Function0<String> function0_0 = (Function0<String>) mock(Function0.class, new ViolatedAssumptionAnswer());
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      blockInfoManager0.logDebug(function0_0, throwable0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      blockInfoManager0.getNumberOfMapEntries();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      Function0<String> function0_0 = (Function0<String>) mock(Function0.class, new ViolatedAssumptionAnswer());
      blockInfoManager0.logWarning(function0_0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      Function0<String> function0_0 = (Function0<String>) mock(Function0.class, new ViolatedAssumptionAnswer());
      blockInfoManager0.logInfo(function0_0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      blockInfoManager0.initializeLogIfNecessary$default$2();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      blockInfoManager0.entries();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BlockInfoManager blockInfoManager0 = new BlockInfoManager();
      Function0<String> function0_0 = (Function0<String>) mock(Function0.class, new ViolatedAssumptionAnswer());
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      blockInfoManager0.logError(function0_0, throwable0);
  }
}
