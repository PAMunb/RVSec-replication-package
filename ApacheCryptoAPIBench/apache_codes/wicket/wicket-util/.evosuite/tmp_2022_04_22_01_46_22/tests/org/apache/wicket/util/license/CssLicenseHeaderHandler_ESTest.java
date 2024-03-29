/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:14:53 GMT 2022
 */

package org.apache.wicket.util.license;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.List;
import org.apache.wicket.util.license.CssLicenseHeaderHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CssLicenseHeaderHandler_ESTest extends CssLicenseHeaderHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CssLicenseHeaderHandler cssLicenseHeaderHandler0 = new CssLicenseHeaderHandler((List<String>) null);
      String string0 = cssLicenseHeaderHandler0.getLicenseHeaderFilename();
      assertEquals("cssLicense.txt", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CssLicenseHeaderHandler cssLicenseHeaderHandler0 = new CssLicenseHeaderHandler((List<String>) null);
      // Undeclared exception!
      try { 
        cssLicenseHeaderHandler0.checkLicenseHeader((File) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CssLicenseHeaderHandler cssLicenseHeaderHandler0 = new CssLicenseHeaderHandler((List<String>) null);
      // Undeclared exception!
      try { 
        cssLicenseHeaderHandler0.addLicenseHeader((File) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CssLicenseHeaderHandler cssLicenseHeaderHandler0 = new CssLicenseHeaderHandler((List<String>) null);
      List<String> list0 = cssLicenseHeaderHandler0.getSuffixes();
      assertFalse(list0.isEmpty());
  }
}
