/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:41:15 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.krbError.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.krbError.KrbErrorContainer;
import org.apache.directory.shared.kerberos.codec.krbError.actions.StoreRealm;
import org.apache.directory.shared.kerberos.messages.KrbError;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreRealm_ESTest extends StoreRealm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreRealm storeRealm0 = new StoreRealm();
      // Undeclared exception!
      try { 
        storeRealm0.setRealm("4rxt~V>HT", (KrbErrorContainer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.krbError.actions.StoreRealm", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreRealm storeRealm0 = new StoreRealm();
      KrbError krbError0 = mock(KrbError.class, new ViolatedAssumptionAnswer());
      KrbErrorContainer krbErrorContainer0 = mock(KrbErrorContainer.class, new ViolatedAssumptionAnswer());
      doReturn(krbError0).when(krbErrorContainer0).getKrbError();
      storeRealm0.setRealm("w#BK!", krbErrorContainer0);
      assertEquals("KRB-ERROR realm value", storeRealm0.toString());
  }
}