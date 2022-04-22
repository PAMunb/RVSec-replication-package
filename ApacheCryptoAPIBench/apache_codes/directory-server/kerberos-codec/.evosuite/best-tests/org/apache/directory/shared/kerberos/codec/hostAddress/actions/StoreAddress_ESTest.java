/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:21:44 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.hostAddress.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.hostAddress.HostAddressContainer;
import org.apache.directory.shared.kerberos.codec.hostAddress.actions.StoreAddress;
import org.apache.directory.shared.kerberos.components.HostAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreAddress_ESTest extends StoreAddress_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreAddress storeAddress0 = new StoreAddress();
      // Undeclared exception!
      try { 
        storeAddress0.setOctetString((byte[]) null, (HostAddressContainer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.hostAddress.actions.StoreAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreAddress storeAddress0 = new StoreAddress();
      HostAddress hostAddress0 = mock(HostAddress.class, new ViolatedAssumptionAnswer());
      HostAddressContainer hostAddressContainer0 = mock(HostAddressContainer.class, new ViolatedAssumptionAnswer());
      doReturn(hostAddress0).when(hostAddressContainer0).getHostAddress();
      storeAddress0.setOctetString((byte[]) null, hostAddressContainer0);
      assertEquals("Store the HostAddress' address", storeAddress0.toString());
  }
}
