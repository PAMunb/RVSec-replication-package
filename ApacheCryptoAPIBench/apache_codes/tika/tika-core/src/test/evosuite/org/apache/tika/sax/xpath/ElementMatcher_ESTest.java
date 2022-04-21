/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:01:47 GMT 2022
 */

package org.apache.tika.sax.xpath;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tika.sax.xpath.ElementMatcher;
import org.apache.tika.sax.xpath.Matcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ElementMatcher_ESTest extends ElementMatcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ElementMatcher elementMatcher0 = new ElementMatcher();
      Matcher matcher0 = elementMatcher0.descend("/o~M@l&MyMy'f8O", "/o~M@l&MyMy'f8O");
      // Undeclared exception!
      try { 
        matcher0.matchesElement();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ElementMatcher elementMatcher0 = new ElementMatcher();
      boolean boolean0 = elementMatcher0.matchesElement();
      assertTrue(boolean0);
  }
}