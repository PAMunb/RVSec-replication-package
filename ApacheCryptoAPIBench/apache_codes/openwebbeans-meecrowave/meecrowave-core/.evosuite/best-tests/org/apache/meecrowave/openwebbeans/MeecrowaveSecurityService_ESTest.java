/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 21:15:47 GMT 2022
 */

package org.apache.meecrowave.openwebbeans;

import org.junit.Test;
import static org.junit.Assert.*;
import java.security.Principal;
import org.apache.meecrowave.openwebbeans.MeecrowaveSecurityService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MeecrowaveSecurityService_ESTest extends MeecrowaveSecurityService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MeecrowaveSecurityService meecrowaveSecurityService0 = new MeecrowaveSecurityService();
      Principal principal0 = meecrowaveSecurityService0.getCurrentPrincipal();
      assertNotNull(principal0);
  }
}