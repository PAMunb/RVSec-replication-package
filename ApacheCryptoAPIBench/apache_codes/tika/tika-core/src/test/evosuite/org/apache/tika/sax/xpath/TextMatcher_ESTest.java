/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 13:55:07 GMT 2022
 */

package org.apache.tika.sax.xpath;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tika.sax.xpath.Matcher;
import org.apache.tika.sax.xpath.TextMatcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TextMatcher_ESTest extends TextMatcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Matcher matcher0 = Matcher.FAIL;
      // Undeclared exception!
      try { 
        matcher0.matchesText();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TextMatcher textMatcher0 = new TextMatcher();
      assertFalse(textMatcher0.matchesElement());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TextMatcher textMatcher0 = (TextMatcher)TextMatcher.INSTANCE;
      boolean boolean0 = textMatcher0.matchesText();
      assertTrue(boolean0);
  }
}
