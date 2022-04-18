/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 18 12:31:52 GMT 2022
 */

package org.apache.manifoldcf.core.lockmanager;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.manifoldcf.core.lockmanager.LockObject;
import org.apache.manifoldcf.core.lockmanager.LockObjectFactory;
import org.apache.manifoldcf.core.lockmanager.LockPool;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LockObjectFactory_ESTest extends LockObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LockObjectFactory lockObjectFactory0 = new LockObjectFactory();
      LockPool lockPool0 = new LockPool(lockObjectFactory0);
      LockObject lockObject0 = lockObjectFactory0.newLockObject(lockPool0, lockPool0);
      assertNotNull(lockObject0);
  }
}
