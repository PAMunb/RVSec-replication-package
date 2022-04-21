/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:50:42 GMT 2022
 */

package org.apache.manifoldcf.core.lockmanager;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Set;
import org.apache.manifoldcf.core.lockmanager.LocalLock;
import org.apache.manifoldcf.core.lockmanager.LocalLockPool;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LocalLockPool_ESTest extends LocalLockPool_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalLockPool localLockPool0 = new LocalLockPool();
      LocalLock localLock0 = localLockPool0.getLocalLock((String) null);
      LocalLock localLock1 = localLockPool0.getLocalLock((String) null);
      assertNotNull(localLock1);
      assertSame(localLock1, localLock0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalLockPool localLockPool0 = new LocalLockPool();
      Set<String> set0 = localLockPool0.keySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocalLockPool localLockPool0 = new LocalLockPool();
      localLockPool0.releaseLocalLock("@(#)$Id$");
  }
}