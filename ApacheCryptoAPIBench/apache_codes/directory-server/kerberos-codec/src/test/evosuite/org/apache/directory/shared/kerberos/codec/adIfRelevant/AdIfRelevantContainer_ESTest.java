/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:29:51 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.adIfRelevant;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.shared.kerberos.codec.adIfRelevant.AdIfRelevantContainer;
import org.apache.directory.shared.kerberos.components.AdIfRelevant;
import org.apache.directory.shared.kerberos.components.AuthorizationData;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AdIfRelevantContainer_ESTest extends AdIfRelevantContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AdIfRelevantContainer adIfRelevantContainer0 = new AdIfRelevantContainer();
      adIfRelevantContainer0.setAuthorizationData((AuthorizationData) null);
      AdIfRelevant adIfRelevant0 = adIfRelevantContainer0.getAdIfRelevant();
      assertNull(adIfRelevant0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AdIfRelevantContainer adIfRelevantContainer0 = new AdIfRelevantContainer();
      AdIfRelevant adIfRelevant0 = adIfRelevantContainer0.getAdIfRelevant();
      assertNotNull(adIfRelevant0);
  }
}
