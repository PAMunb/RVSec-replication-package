/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:03:50 GMT 2022
 */

package org.apache.tika.io;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.tika.io.ClosedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ClosedInputStream_ESTest extends ClosedInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClosedInputStream closedInputStream0 = new ClosedInputStream();
      int int0 = closedInputStream0.read();
      assertEquals((-1), int0);
  }
}
