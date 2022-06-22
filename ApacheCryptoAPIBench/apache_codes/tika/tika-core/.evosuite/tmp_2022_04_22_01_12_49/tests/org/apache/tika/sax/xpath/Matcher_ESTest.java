/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:44:52 GMT 2022
 */

package org.apache.tika.sax.xpath;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.tika.sax.xpath.Matcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Matcher_ESTest extends Matcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Matcher matcher0 = new Matcher();
      boolean boolean0 = matcher0.matchesElement();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Matcher matcher0 = new Matcher();
      boolean boolean0 = matcher0.matchesText();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Matcher matcher0 = new Matcher();
      Matcher matcher1 = matcher0.descend("", "");
      assertFalse(matcher1.matchesElement());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Matcher matcher0 = Matcher.FAIL;
      boolean boolean0 = matcher0.matchesAttribute("", "");
      assertFalse(boolean0);
  }
}