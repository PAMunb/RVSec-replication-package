/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 21:08:08 GMT 2022
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LockObjectFactory_ESTest extends LockObjectFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LockObjectFactory lockObjectFactory0 = new LockObjectFactory();
      LockObject lockObject0 = lockObjectFactory0.newLockObject((LockPool) null, (Object) null);
      assertNotNull(lockObject0);
  }
}
