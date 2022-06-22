/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:38:54 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.krbCredInfo.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.krbCredInfo.KrbCredInfoContainer;
import org.apache.directory.shared.kerberos.codec.krbCredInfo.actions.StoreKey;
import org.apache.directory.shared.kerberos.components.EncryptionKey;
import org.apache.directory.shared.kerberos.components.KrbCredInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreKey_ESTest extends StoreKey_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreKey storeKey0 = new StoreKey();
      KrbCredInfo krbCredInfo0 = mock(KrbCredInfo.class, new ViolatedAssumptionAnswer());
      KrbCredInfoContainer krbCredInfoContainer0 = mock(KrbCredInfoContainer.class, new ViolatedAssumptionAnswer());
      doReturn(krbCredInfo0).when(krbCredInfoContainer0).getKrbCredInfo();
      storeKey0.setEncryptionKey((EncryptionKey) null, krbCredInfoContainer0);
      assertEquals("KrbCredInfo key", storeKey0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreKey storeKey0 = new StoreKey();
      // Undeclared exception!
      try { 
        storeKey0.setEncryptionKey((EncryptionKey) null, (KrbCredInfoContainer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.krbCredInfo.actions.StoreKey", e);
      }
  }
}