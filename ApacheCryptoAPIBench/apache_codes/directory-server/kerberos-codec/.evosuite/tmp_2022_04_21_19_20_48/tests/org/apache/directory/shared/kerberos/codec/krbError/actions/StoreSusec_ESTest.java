/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:38:34 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.krbError.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.krbError.KrbErrorContainer;
import org.apache.directory.shared.kerberos.codec.krbError.actions.StoreSusec;
import org.apache.directory.shared.kerberos.messages.KrbError;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreSusec_ESTest extends StoreSusec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreSusec storeSusec0 = new StoreSusec();
      KrbErrorContainer krbErrorContainer0 = mock(KrbErrorContainer.class, new ViolatedAssumptionAnswer());
      doReturn((KrbError) null).when(krbErrorContainer0).getKrbError();
      // Undeclared exception!
      try { 
        storeSusec0.setIntegerValue(1, krbErrorContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.krbError.actions.StoreSusec", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreSusec storeSusec0 = new StoreSusec();
      KrbError krbError0 = mock(KrbError.class, new ViolatedAssumptionAnswer());
      KrbErrorContainer krbErrorContainer0 = mock(KrbErrorContainer.class, new ViolatedAssumptionAnswer());
      doReturn(krbError0).when(krbErrorContainer0).getKrbError();
      storeSusec0.setIntegerValue(699, krbErrorContainer0);
      assertEquals("KRB-ERROR susec", storeSusec0.toString());
  }
}
