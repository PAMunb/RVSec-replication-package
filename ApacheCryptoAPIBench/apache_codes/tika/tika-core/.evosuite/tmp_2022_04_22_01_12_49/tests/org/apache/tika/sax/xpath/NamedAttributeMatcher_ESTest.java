/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:36:56 GMT 2022
 */

package org.apache.tika.sax.xpath;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tika.sax.xpath.NamedAttributeMatcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NamedAttributeMatcher_ESTest extends NamedAttributeMatcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NamedAttributeMatcher namedAttributeMatcher0 = new NamedAttributeMatcher((String) null, (String) null);
      // Undeclared exception!
      try { 
        namedAttributeMatcher0.matchesAttribute((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NamedAttributeMatcher namedAttributeMatcher0 = new NamedAttributeMatcher(".1DW5{W_[", ".1DW5{W_[");
      boolean boolean0 = namedAttributeMatcher0.matchesAttribute((String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NamedAttributeMatcher namedAttributeMatcher0 = new NamedAttributeMatcher((String) null, "");
      boolean boolean0 = namedAttributeMatcher0.matchesAttribute((String) null, "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NamedAttributeMatcher namedAttributeMatcher0 = new NamedAttributeMatcher((String) null, "");
      boolean boolean0 = namedAttributeMatcher0.matchesAttribute((String) null, "%cfQX]L8H-|.lYd#");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NamedAttributeMatcher namedAttributeMatcher0 = new NamedAttributeMatcher((String) null, "");
      boolean boolean0 = namedAttributeMatcher0.matchesAttribute("%cfQX]L8H-|.lYd#", "JPb{7[v");
      assertFalse(boolean0);
  }
}