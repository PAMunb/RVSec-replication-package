/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:30:22 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.authenticator.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.authenticator.AuthenticatorContainer;
import org.apache.directory.shared.kerberos.codec.authenticator.actions.StoreCusec;
import org.apache.directory.shared.kerberos.messages.Authenticator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreCusec_ESTest extends StoreCusec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreCusec storeCusec0 = new StoreCusec();
      Authenticator authenticator0 = mock(Authenticator.class, new ViolatedAssumptionAnswer());
      AuthenticatorContainer authenticatorContainer0 = mock(AuthenticatorContainer.class, new ViolatedAssumptionAnswer());
      doReturn(authenticator0).when(authenticatorContainer0).getAuthenticator();
      storeCusec0.setIntegerValue(1, authenticatorContainer0);
      assertEquals("Authenticator cusec", storeCusec0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreCusec storeCusec0 = new StoreCusec();
      // Undeclared exception!
      try { 
        storeCusec0.setIntegerValue(0, (AuthenticatorContainer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.authenticator.actions.StoreCusec", e);
      }
  }
}