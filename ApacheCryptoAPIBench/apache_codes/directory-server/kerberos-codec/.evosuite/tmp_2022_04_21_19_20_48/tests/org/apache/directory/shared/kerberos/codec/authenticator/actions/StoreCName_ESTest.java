/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:25:42 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.authenticator.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.authenticator.AuthenticatorContainer;
import org.apache.directory.shared.kerberos.codec.authenticator.actions.StoreCName;
import org.apache.directory.shared.kerberos.components.PrincipalName;
import org.apache.directory.shared.kerberos.messages.Authenticator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreCName_ESTest extends StoreCName_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreCName storeCName0 = new StoreCName();
      PrincipalName principalName0 = mock(PrincipalName.class, new ViolatedAssumptionAnswer());
      AuthenticatorContainer authenticatorContainer0 = mock(AuthenticatorContainer.class, new ViolatedAssumptionAnswer());
      doReturn((Authenticator) null).when(authenticatorContainer0).getAuthenticator();
      // Undeclared exception!
      try { 
        storeCName0.setPrincipalName(principalName0, authenticatorContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.authenticator.actions.StoreCName", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreCName storeCName0 = new StoreCName();
      PrincipalName principalName0 = mock(PrincipalName.class, new ViolatedAssumptionAnswer());
      Authenticator authenticator0 = mock(Authenticator.class, new ViolatedAssumptionAnswer());
      AuthenticatorContainer authenticatorContainer0 = mock(AuthenticatorContainer.class, new ViolatedAssumptionAnswer());
      doReturn(authenticator0).when(authenticatorContainer0).getAuthenticator();
      storeCName0.setPrincipalName(principalName0, authenticatorContainer0);
      assertEquals("Authenticator cname", storeCName0.toString());
  }
}
