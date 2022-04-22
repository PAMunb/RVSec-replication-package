/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:13:53 GMT 2022
 */

package org.apache.wicket.util.license;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.List;
import org.apache.wicket.util.license.PropertiesLicenseHeaderHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PropertiesLicenseHeaderHandler_ESTest extends PropertiesLicenseHeaderHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PropertiesLicenseHeaderHandler propertiesLicenseHeaderHandler0 = new PropertiesLicenseHeaderHandler((List<String>) null);
      // Undeclared exception!
      try { 
        propertiesLicenseHeaderHandler0.checkLicenseHeader((File) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PropertiesLicenseHeaderHandler propertiesLicenseHeaderHandler0 = new PropertiesLicenseHeaderHandler((List<String>) null);
      List<String> list0 = propertiesLicenseHeaderHandler0.getSuffixes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PropertiesLicenseHeaderHandler propertiesLicenseHeaderHandler0 = new PropertiesLicenseHeaderHandler((List<String>) null);
      // Undeclared exception!
      try { 
        propertiesLicenseHeaderHandler0.addLicenseHeader((File) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PropertiesLicenseHeaderHandler propertiesLicenseHeaderHandler0 = new PropertiesLicenseHeaderHandler((List<String>) null);
      String string0 = propertiesLicenseHeaderHandler0.getLicenseHeaderFilename();
      assertEquals("propertiesLicense.txt", string0);
  }
}
