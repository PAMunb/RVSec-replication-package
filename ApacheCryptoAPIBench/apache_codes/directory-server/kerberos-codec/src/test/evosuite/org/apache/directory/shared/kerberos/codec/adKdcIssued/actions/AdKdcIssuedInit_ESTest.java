/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:10:32 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.adKdcIssued.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.api.asn1.ber.tlv.TLV;
import org.apache.directory.shared.kerberos.codec.adKdcIssued.AdKdcIssuedContainer;
import org.apache.directory.shared.kerberos.codec.adKdcIssued.actions.AdKdcIssuedInit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AdKdcIssuedInit_ESTest extends AdKdcIssuedInit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AdKdcIssuedInit adKdcIssuedInit0 = new AdKdcIssuedInit();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn((-23)).when(tLV0).getLength();
      AdKdcIssuedContainer adKdcIssuedContainer0 = mock(AdKdcIssuedContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(adKdcIssuedContainer0).getCurrentTLV();
      adKdcIssuedInit0.action(adKdcIssuedContainer0);
      assertEquals("Creates a AD-KDCIssued instance", adKdcIssuedInit0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AdKdcIssuedInit adKdcIssuedInit0 = new AdKdcIssuedInit();
      AdKdcIssuedContainer adKdcIssuedContainer0 = mock(AdKdcIssuedContainer.class, new ViolatedAssumptionAnswer());
      doReturn((TLV) null).when(adKdcIssuedContainer0).getCurrentTLV();
      // Undeclared exception!
      try { 
        adKdcIssuedInit0.action(adKdcIssuedContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.adKdcIssued.actions.AdKdcIssuedInit", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AdKdcIssuedInit adKdcIssuedInit0 = new AdKdcIssuedInit();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tLV0).getLength();
      AdKdcIssuedContainer adKdcIssuedContainer0 = mock(AdKdcIssuedContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(adKdcIssuedContainer0).getCurrentTLV();
      try { 
        adKdcIssuedInit0.action(adKdcIssuedContainer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_04067 The LdapMessage should not be empty
         //
         verifyException("org.apache.directory.shared.kerberos.codec.adKdcIssued.actions.AdKdcIssuedInit", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AdKdcIssuedInit adKdcIssuedInit0 = new AdKdcIssuedInit();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(250).when(tLV0).getLength();
      AdKdcIssuedContainer adKdcIssuedContainer0 = mock(AdKdcIssuedContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(adKdcIssuedContainer0).getCurrentTLV();
      adKdcIssuedInit0.action(adKdcIssuedContainer0);
      assertEquals("Creates a AD-KDCIssued instance", adKdcIssuedInit0.toString());
  }
}
