/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:37:42 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.encKrbPrivPart.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.encKrbPrivPart.EncKrbPrivPartContainer;
import org.apache.directory.shared.kerberos.codec.encKrbPrivPart.actions.StoreRecipientAddress;
import org.apache.directory.shared.kerberos.components.EncKrbPrivPart;
import org.apache.directory.shared.kerberos.components.HostAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreRecipientAddress_ESTest extends StoreRecipientAddress_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreRecipientAddress storeRecipientAddress0 = new StoreRecipientAddress();
      HostAddress hostAddress0 = mock(HostAddress.class, new ViolatedAssumptionAnswer());
      EncKrbPrivPartContainer encKrbPrivPartContainer0 = mock(EncKrbPrivPartContainer.class, new ViolatedAssumptionAnswer());
      doReturn((EncKrbPrivPart) null).when(encKrbPrivPartContainer0).getEncKrbPrivPart();
      // Undeclared exception!
      try { 
        storeRecipientAddress0.setAddress(hostAddress0, encKrbPrivPartContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.encKrbPrivPart.actions.StoreRecipientAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreRecipientAddress storeRecipientAddress0 = new StoreRecipientAddress();
      HostAddress hostAddress0 = mock(HostAddress.class, new ViolatedAssumptionAnswer());
      EncKrbPrivPart encKrbPrivPart0 = mock(EncKrbPrivPart.class, new ViolatedAssumptionAnswer());
      EncKrbPrivPartContainer encKrbPrivPartContainer0 = mock(EncKrbPrivPartContainer.class, new ViolatedAssumptionAnswer());
      doReturn(encKrbPrivPart0).when(encKrbPrivPartContainer0).getEncKrbPrivPart();
      storeRecipientAddress0.setAddress(hostAddress0, encKrbPrivPartContainer0);
      assertEquals("EncKrbPrivPart r-address", storeRecipientAddress0.toString());
  }
}