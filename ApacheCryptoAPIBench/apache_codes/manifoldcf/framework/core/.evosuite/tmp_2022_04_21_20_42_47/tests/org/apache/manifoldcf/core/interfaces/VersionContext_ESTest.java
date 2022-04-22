/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 21:08:43 GMT 2022
 */

package org.apache.manifoldcf.core.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.manifoldcf.core.interfaces.ConfigParams;
import org.apache.manifoldcf.core.interfaces.Specification;
import org.apache.manifoldcf.core.interfaces.VersionContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class VersionContext_ESTest extends VersionContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConfigParams configParams0 = mock(ConfigParams.class, new ViolatedAssumptionAnswer());
      Specification specification0 = mock(Specification.class, new ViolatedAssumptionAnswer());
      VersionContext versionContext0 = new VersionContext((String) null, configParams0, specification0);
      String string0 = versionContext0.getVersionString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConfigParams configParams0 = mock(ConfigParams.class, new ViolatedAssumptionAnswer());
      VersionContext versionContext0 = new VersionContext("", configParams0, (Specification) null);
      String string0 = versionContext0.getVersionString();
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VersionContext versionContext0 = new VersionContext("", (ConfigParams) null, (Specification) null);
      versionContext0.getParams();
      assertEquals("", versionContext0.getVersionString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ConfigParams configParams0 = mock(ConfigParams.class, new ViolatedAssumptionAnswer());
      VersionContext versionContext0 = new VersionContext("", configParams0, (Specification) null);
      versionContext0.getSpecification();
      assertEquals("", versionContext0.getVersionString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConfigParams configParams0 = mock(ConfigParams.class, new ViolatedAssumptionAnswer());
      VersionContext versionContext0 = new VersionContext("@(#)$Id: Configuration.java 988245 2010-08-23 18:39:35Z kwright $", configParams0, (Specification) null);
      String string0 = versionContext0.getVersionString();
      assertNotNull(string0);
      assertEquals("@(#)$Id: Configuration.java 988245 2010-08-23 18:39:35Z kwright $", string0);
  }
}
