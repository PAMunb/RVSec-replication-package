/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:28:20 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.adKdcIssued.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.adKdcIssued.AdKdcIssuedContainer;
import org.apache.directory.shared.kerberos.codec.adKdcIssued.actions.StoreISName;
import org.apache.directory.shared.kerberos.components.AdKdcIssued;
import org.apache.directory.shared.kerberos.components.PrincipalName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreISName_ESTest extends StoreISName_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreISName storeISName0 = new StoreISName();
      PrincipalName principalName0 = mock(PrincipalName.class, new ViolatedAssumptionAnswer());
      AdKdcIssuedContainer adKdcIssuedContainer0 = mock(AdKdcIssuedContainer.class, new ViolatedAssumptionAnswer());
      doReturn((AdKdcIssued) null).when(adKdcIssuedContainer0).getAdKdcIssued();
      // Undeclared exception!
      try { 
        storeISName0.setPrincipalName(principalName0, adKdcIssuedContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.adKdcIssued.actions.StoreISName", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreISName storeISName0 = new StoreISName();
      PrincipalName principalName0 = mock(PrincipalName.class, new ViolatedAssumptionAnswer());
      AdKdcIssued adKdcIssued0 = mock(AdKdcIssued.class, new ViolatedAssumptionAnswer());
      AdKdcIssuedContainer adKdcIssuedContainer0 = mock(AdKdcIssuedContainer.class, new ViolatedAssumptionAnswer());
      doReturn(adKdcIssued0).when(adKdcIssuedContainer0).getAdKdcIssued();
      storeISName0.setPrincipalName(principalName0, adKdcIssuedContainer0);
      assertEquals("AD-KDCIssued i-sname", storeISName0.toString());
  }
}