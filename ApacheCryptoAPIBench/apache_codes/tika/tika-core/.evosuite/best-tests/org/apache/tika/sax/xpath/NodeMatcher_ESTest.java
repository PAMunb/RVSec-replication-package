/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:43:18 GMT 2022
 */

package org.apache.tika.sax.xpath;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.tika.sax.xpath.NodeMatcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NodeMatcher_ESTest extends NodeMatcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NodeMatcher nodeMatcher0 = new NodeMatcher();
      boolean boolean0 = nodeMatcher0.matchesAttribute("}Pwk@DcF!|FS-BqlY]", "}Pwk@DcF!|FS-BqlY]");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NodeMatcher nodeMatcher0 = new NodeMatcher();
      boolean boolean0 = nodeMatcher0.matchesText();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NodeMatcher nodeMatcher0 = new NodeMatcher();
      boolean boolean0 = nodeMatcher0.matchesElement();
      assertTrue(boolean0);
  }
}
