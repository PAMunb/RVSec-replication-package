/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:35:06 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.kdcReqBody.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.kdcReqBody.KdcReqBodyContainer;
import org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreAddresses;
import org.apache.directory.shared.kerberos.components.HostAddresses;
import org.apache.directory.shared.kerberos.components.KdcReqBody;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreAddresses_ESTest extends StoreAddresses_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreAddresses storeAddresses0 = new StoreAddresses();
      HostAddresses hostAddresses0 = mock(HostAddresses.class, new ViolatedAssumptionAnswer());
      KdcReqBodyContainer kdcReqBodyContainer0 = mock(KdcReqBodyContainer.class, new ViolatedAssumptionAnswer());
      doReturn((KdcReqBody) null).when(kdcReqBodyContainer0).getKdcReqBody();
      // Undeclared exception!
      try { 
        storeAddresses0.setHostAddresses(hostAddresses0, kdcReqBodyContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreAddresses", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreAddresses storeAddresses0 = new StoreAddresses();
      HostAddresses hostAddresses0 = mock(HostAddresses.class, new ViolatedAssumptionAnswer());
      KdcReqBody kdcReqBody0 = mock(KdcReqBody.class, new ViolatedAssumptionAnswer());
      KdcReqBodyContainer kdcReqBodyContainer0 = mock(KdcReqBodyContainer.class, new ViolatedAssumptionAnswer());
      doReturn(kdcReqBody0).when(kdcReqBodyContainer0).getKdcReqBody();
      storeAddresses0.setHostAddresses(hostAddresses0, kdcReqBodyContainer0);
      assertEquals("KDC-REQ-BODY addresses", storeAddresses0.toString());
  }
}
