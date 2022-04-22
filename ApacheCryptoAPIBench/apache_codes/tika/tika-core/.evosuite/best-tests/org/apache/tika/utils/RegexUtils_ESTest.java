/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:38:38 GMT 2022
 */

package org.apache.tika.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.apache.tika.utils.RegexUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RegexUtils_ESTest extends RegexUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      List<String> list0 = RegexUtils.extractLinks("|HY%0cd:xu");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      List<String> list0 = RegexUtils.extractLinks("");
      assertFalse(list0.contains(""));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      List<String> list0 = RegexUtils.extractLinks("<:!WXP");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      List<String> list0 = RegexUtils.extractLinks((String) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RegexUtils regexUtils0 = new RegexUtils();
  }
}
