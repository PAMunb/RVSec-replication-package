/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:44:26 GMT 2022
 */

package org.apache.tika.io;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.InputStream;
import org.apache.tika.io.CloseShieldInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CloseShieldInputStream_ESTest extends CloseShieldInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CloseShieldInputStream closeShieldInputStream0 = new CloseShieldInputStream((InputStream) null);
      closeShieldInputStream0.close();
  }
}