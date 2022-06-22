/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:26:51 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.kdcReqBody.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.kdcReqBody.KdcReqBodyContainer;
import org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreCName;
import org.apache.directory.shared.kerberos.components.KdcReqBody;
import org.apache.directory.shared.kerberos.components.PrincipalName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreCName_ESTest extends StoreCName_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreCName storeCName0 = new StoreCName();
      PrincipalName principalName0 = mock(PrincipalName.class, new ViolatedAssumptionAnswer());
      KdcReqBodyContainer kdcReqBodyContainer0 = mock(KdcReqBodyContainer.class, new ViolatedAssumptionAnswer());
      doReturn((KdcReqBody) null).when(kdcReqBodyContainer0).getKdcReqBody();
      // Undeclared exception!
      try { 
        storeCName0.setPrincipalName(principalName0, kdcReqBodyContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreCName", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreCName storeCName0 = new StoreCName();
      PrincipalName principalName0 = mock(PrincipalName.class, new ViolatedAssumptionAnswer());
      KdcReqBody kdcReqBody0 = mock(KdcReqBody.class, new ViolatedAssumptionAnswer());
      KdcReqBodyContainer kdcReqBodyContainer0 = mock(KdcReqBodyContainer.class, new ViolatedAssumptionAnswer());
      doReturn(kdcReqBody0).when(kdcReqBodyContainer0).getKdcReqBody();
      storeCName0.setPrincipalName(principalName0, kdcReqBodyContainer0);
      assertEquals("Stores the CName", storeCName0.toString());
  }
}