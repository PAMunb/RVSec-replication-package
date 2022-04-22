/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:13:03 GMT 2022
 */

package org.apache.wicket.util.diff.myers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.wicket.util.diff.myers.DiffNode;
import org.apache.wicket.util.diff.myers.PathNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DiffNode_ESTest extends DiffNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DiffNode diffNode0 = new DiffNode(181, 181, (PathNode) null);
      DiffNode diffNode1 = new DiffNode(181, 181, diffNode0);
      assertFalse(diffNode1.isSnake());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DiffNode diffNode0 = new DiffNode((-1), (-1), (PathNode) null);
      boolean boolean0 = diffNode0.isSnake();
      assertFalse(boolean0);
  }
}
