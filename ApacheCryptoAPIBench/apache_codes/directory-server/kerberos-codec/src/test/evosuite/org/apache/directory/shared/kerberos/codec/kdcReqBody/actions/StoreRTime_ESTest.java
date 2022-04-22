/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:26:52 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.kdcReqBody.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.KerberosTime;
import org.apache.directory.shared.kerberos.codec.kdcReqBody.KdcReqBodyContainer;
import org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreRTime;
import org.apache.directory.shared.kerberos.components.KdcReqBody;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreRTime_ESTest extends StoreRTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreRTime storeRTime0 = new StoreRTime();
      KdcReqBodyContainer kdcReqBodyContainer0 = mock(KdcReqBodyContainer.class, new ViolatedAssumptionAnswer());
      doReturn((KdcReqBody) null).when(kdcReqBodyContainer0).getKdcReqBody();
      // Undeclared exception!
      try { 
        storeRTime0.setKerberosTime((KerberosTime) null, kdcReqBodyContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreRTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreRTime storeRTime0 = new StoreRTime();
      KerberosTime kerberosTime0 = mock(KerberosTime.class, new ViolatedAssumptionAnswer());
      KdcReqBody kdcReqBody0 = mock(KdcReqBody.class, new ViolatedAssumptionAnswer());
      KdcReqBodyContainer kdcReqBodyContainer0 = mock(KdcReqBodyContainer.class, new ViolatedAssumptionAnswer());
      doReturn(kdcReqBody0).when(kdcReqBodyContainer0).getKdcReqBody();
      storeRTime0.setKerberosTime(kerberosTime0, kdcReqBodyContainer0);
      assertEquals("Stores the RTime", storeRTime0.toString());
  }
}
