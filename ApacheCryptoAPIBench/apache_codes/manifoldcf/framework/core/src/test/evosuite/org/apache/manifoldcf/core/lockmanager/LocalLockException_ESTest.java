/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:52:29 GMT 2022
 */

package org.apache.manifoldcf.core.lockmanager;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.manifoldcf.core.lockmanager.LocalLockException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LocalLockException_ESTest extends LocalLockException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalLockException localLockException0 = new LocalLockException("");
  }
}
