/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 00:46:12 GMT 2022
 */

package org.apache.spark.api.python;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.spark.api.python.PythonException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PythonException_ESTest extends PythonException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      MockException mockException0 = new MockException(mockThrowable0);
      PythonException pythonException0 = new PythonException("org.apache.spark.api.python.PythonException", mockException0);
  }
}
