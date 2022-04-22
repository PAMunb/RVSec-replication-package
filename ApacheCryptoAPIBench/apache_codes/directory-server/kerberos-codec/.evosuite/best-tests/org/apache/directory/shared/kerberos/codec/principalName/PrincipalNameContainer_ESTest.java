/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:35:11 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.principalName;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.shared.kerberos.codec.principalName.PrincipalNameContainer;
import org.apache.directory.shared.kerberos.components.PrincipalName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PrincipalNameContainer_ESTest extends PrincipalNameContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PrincipalNameContainer principalNameContainer0 = new PrincipalNameContainer();
      PrincipalName principalName0 = principalNameContainer0.getPrincipalName();
      assertNull(principalName0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PrincipalNameContainer principalNameContainer0 = new PrincipalNameContainer();
      principalNameContainer0.setPrincipalName((PrincipalName) null);
      assertEquals(0, principalNameContainer0.getDecodedBytes());
  }
}
