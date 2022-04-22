/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:20:27 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.hostAddress.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.hostAddress.HostAddressContainer;
import org.apache.directory.shared.kerberos.codec.hostAddress.actions.StoreAddrType;
import org.apache.directory.shared.kerberos.components.HostAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreAddrType_ESTest extends StoreAddrType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreAddrType storeAddrType0 = new StoreAddrType();
      HostAddressContainer hostAddressContainer0 = mock(HostAddressContainer.class, new ViolatedAssumptionAnswer());
      doReturn((HostAddress) null).when(hostAddressContainer0).getHostAddress();
      // Undeclared exception!
      try { 
        storeAddrType0.setIntegerValue(1766, hostAddressContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.hostAddress.actions.StoreAddrType", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreAddrType storeAddrType0 = new StoreAddrType();
      HostAddress hostAddress0 = mock(HostAddress.class, new ViolatedAssumptionAnswer());
      HostAddressContainer hostAddressContainer0 = mock(HostAddressContainer.class, new ViolatedAssumptionAnswer());
      doReturn(hostAddress0).when(hostAddressContainer0).getHostAddress();
      storeAddrType0.setIntegerValue((-2202), hostAddressContainer0);
      assertEquals("Creates a HostAddress instance", storeAddrType0.toString());
  }
}
