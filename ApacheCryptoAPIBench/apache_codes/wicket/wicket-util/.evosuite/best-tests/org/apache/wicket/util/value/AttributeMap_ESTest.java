/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:18:47 GMT 2022
 */

package org.apache.wicket.util.value;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.wicket.util.value.AttributeMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AttributeMap_ESTest extends AttributeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AttributeMap attributeMap0 = new AttributeMap();
      AttributeMap attributeMap1 = new AttributeMap(attributeMap0);
      assertTrue(attributeMap1.equals((Object)attributeMap0));
  }
}
