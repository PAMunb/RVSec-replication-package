/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:02:08 GMT 2022
 */

package org.apache.tika.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.tika.exception.UnsupportedFormatException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnsupportedFormatException_ESTest extends UnsupportedFormatException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnsupportedFormatException unsupportedFormatException0 = new UnsupportedFormatException("");
  }
}
