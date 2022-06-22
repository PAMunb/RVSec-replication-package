/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 21:00:59 GMT 2022
 */

package org.apache.manifoldcf.core.lockmanager;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.manifoldcf.core.lockmanager.LocalLock;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LocalLock_ESTest extends LocalLock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalLock localLock0 = new LocalLock();
      boolean boolean0 = localLock0.hasNonExWriteLock();
      assertFalse(localLock0.hasWriteLock());
      assertFalse(localLock0.hasReadLock());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalLock localLock0 = new LocalLock();
      boolean boolean0 = localLock0.hasReadLock();
      assertFalse(localLock0.hasNonExWriteLock());
      assertFalse(localLock0.hasWriteLock());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocalLock localLock0 = new LocalLock();
      boolean boolean0 = localLock0.hasWriteLock();
      assertFalse(localLock0.hasNonExWriteLock());
      assertFalse(localLock0.hasReadLock());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LocalLock localLock0 = new LocalLock();
      localLock0.decrementNonExWriteLocks();
      boolean boolean0 = localLock0.hasNonExWriteLock();
      assertFalse(localLock0.hasReadLock());
      assertFalse(localLock0.hasWriteLock());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LocalLock localLock0 = new LocalLock();
      assertFalse(localLock0.hasNonExWriteLock());
      
      localLock0.incrementNonExWriteLocks();
      boolean boolean0 = localLock0.hasNonExWriteLock();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LocalLock localLock0 = new LocalLock();
      localLock0.decrementWriteLocks();
      boolean boolean0 = localLock0.hasWriteLock();
      assertFalse(localLock0.hasNonExWriteLock());
      assertFalse(localLock0.hasReadLock());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LocalLock localLock0 = new LocalLock();
      assertFalse(localLock0.hasReadLock());
      
      localLock0.incrementReadLocks();
      boolean boolean0 = localLock0.hasReadLock();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LocalLock localLock0 = new LocalLock();
      localLock0.decrementReadLocks();
      boolean boolean0 = localLock0.hasReadLock();
      assertFalse(localLock0.hasNonExWriteLock());
      assertFalse(localLock0.hasWriteLock());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LocalLock localLock0 = new LocalLock();
      assertFalse(localLock0.hasWriteLock());
      
      localLock0.incrementWriteLocks();
      boolean boolean0 = localLock0.hasWriteLock();
      assertTrue(boolean0);
  }
}