/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:22:17 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.krbSafeBody.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.krbSafeBody.KrbSafeBodyContainer;
import org.apache.directory.shared.kerberos.codec.krbSafeBody.actions.StoreSenderAddress;
import org.apache.directory.shared.kerberos.components.HostAddress;
import org.apache.directory.shared.kerberos.components.KrbSafeBody;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreSenderAddress_ESTest extends StoreSenderAddress_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreSenderAddress storeSenderAddress0 = new StoreSenderAddress();
      HostAddress hostAddress0 = mock(HostAddress.class, new ViolatedAssumptionAnswer());
      KrbSafeBody krbSafeBody0 = mock(KrbSafeBody.class, new ViolatedAssumptionAnswer());
      KrbSafeBodyContainer krbSafeBodyContainer0 = mock(KrbSafeBodyContainer.class, new ViolatedAssumptionAnswer());
      doReturn(krbSafeBody0).when(krbSafeBodyContainer0).getKrbSafeBody();
      storeSenderAddress0.setAddress(hostAddress0, krbSafeBodyContainer0);
      assertEquals("KRB-SAFE-BODY s-address", storeSenderAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreSenderAddress storeSenderAddress0 = new StoreSenderAddress();
      // Undeclared exception!
      try { 
        storeSenderAddress0.setAddress((HostAddress) null, (KrbSafeBodyContainer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.krbSafeBody.actions.StoreSenderAddress", e);
      }
  }
}