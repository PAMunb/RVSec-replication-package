/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:37:19 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.krbSafeBody.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.KerberosTime;
import org.apache.directory.shared.kerberos.codec.krbSafeBody.KrbSafeBodyContainer;
import org.apache.directory.shared.kerberos.codec.krbSafeBody.actions.StoreTimestamp;
import org.apache.directory.shared.kerberos.components.KrbSafeBody;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreTimestamp_ESTest extends StoreTimestamp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreTimestamp storeTimestamp0 = new StoreTimestamp();
      KerberosTime kerberosTime0 = mock(KerberosTime.class, new ViolatedAssumptionAnswer());
      KrbSafeBodyContainer krbSafeBodyContainer0 = mock(KrbSafeBodyContainer.class, new ViolatedAssumptionAnswer());
      doReturn((KrbSafeBody) null).when(krbSafeBodyContainer0).getKrbSafeBody();
      // Undeclared exception!
      try { 
        storeTimestamp0.setKerberosTime(kerberosTime0, krbSafeBodyContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.krbSafeBody.actions.StoreTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreTimestamp storeTimestamp0 = new StoreTimestamp();
      KerberosTime kerberosTime0 = mock(KerberosTime.class, new ViolatedAssumptionAnswer());
      KrbSafeBody krbSafeBody0 = mock(KrbSafeBody.class, new ViolatedAssumptionAnswer());
      KrbSafeBodyContainer krbSafeBodyContainer0 = mock(KrbSafeBodyContainer.class, new ViolatedAssumptionAnswer());
      doReturn(krbSafeBody0).when(krbSafeBodyContainer0).getKrbSafeBody();
      storeTimestamp0.setKerberosTime(kerberosTime0, krbSafeBodyContainer0);
      assertEquals("KRB-SAFE-BODY timemstamp", storeTimestamp0.toString());
  }
}
