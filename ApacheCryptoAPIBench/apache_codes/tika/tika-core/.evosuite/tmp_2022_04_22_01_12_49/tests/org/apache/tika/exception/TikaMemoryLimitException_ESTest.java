/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:45:52 GMT 2022
 */

package org.apache.tika.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.tika.exception.TikaMemoryLimitException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TikaMemoryLimitException_ESTest extends TikaMemoryLimitException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TikaMemoryLimitException tikaMemoryLimitException0 = new TikaMemoryLimitException("77#");
  }
}