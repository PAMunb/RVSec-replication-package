/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:17:26 GMT 2022
 */

package org.apache.wicket.util.diff.myers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.wicket.util.diff.myers.PathNode;
import org.apache.wicket.util.diff.myers.Snake;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Snake_ESTest extends Snake_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Snake snake0 = new Snake(0, 0, (PathNode) null);
      boolean boolean0 = snake0.isSnake();
      assertTrue(boolean0);
  }
}