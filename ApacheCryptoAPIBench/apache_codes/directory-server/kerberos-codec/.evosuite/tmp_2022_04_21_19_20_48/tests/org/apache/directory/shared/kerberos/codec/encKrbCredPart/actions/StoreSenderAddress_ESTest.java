/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:27:38 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.encKrbCredPart.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.encKrbCredPart.EncKrbCredPartContainer;
import org.apache.directory.shared.kerberos.codec.encKrbCredPart.actions.StoreSenderAddress;
import org.apache.directory.shared.kerberos.components.EncKrbCredPart;
import org.apache.directory.shared.kerberos.components.HostAddress;
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
      EncKrbCredPart encKrbCredPart0 = mock(EncKrbCredPart.class, new ViolatedAssumptionAnswer());
      EncKrbCredPartContainer encKrbCredPartContainer0 = mock(EncKrbCredPartContainer.class, new ViolatedAssumptionAnswer());
      doReturn(encKrbCredPart0).when(encKrbCredPartContainer0).getEncKrbCredPart();
      storeSenderAddress0.setAddress(hostAddress0, encKrbCredPartContainer0);
      assertEquals("EncKrbCredPart s-address", storeSenderAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreSenderAddress storeSenderAddress0 = new StoreSenderAddress();
      // Undeclared exception!
      try { 
        storeSenderAddress0.setAddress((HostAddress) null, (EncKrbCredPartContainer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.encKrbCredPart.actions.StoreSenderAddress", e);
      }
  }
}