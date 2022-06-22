/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:35:57 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.adAndOr;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.shared.kerberos.codec.adAndOr.AdAndOrContainer;
import org.apache.directory.shared.kerberos.components.AdAndOr;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AdAndOrContainer_ESTest extends AdAndOrContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AdAndOrContainer adAndOrContainer0 = new AdAndOrContainer();
      adAndOrContainer0.setAdAndOr((AdAndOr) null);
      AdAndOr adAndOr0 = adAndOrContainer0.getAdAndOr();
      assertNull(adAndOr0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AdAndOrContainer adAndOrContainer0 = new AdAndOrContainer();
      AdAndOr adAndOr0 = adAndOrContainer0.getAdAndOr();
      adAndOrContainer0.setAdAndOr(adAndOr0);
      assertEquals(0, adAndOr0.getConditionCount());
  }
}