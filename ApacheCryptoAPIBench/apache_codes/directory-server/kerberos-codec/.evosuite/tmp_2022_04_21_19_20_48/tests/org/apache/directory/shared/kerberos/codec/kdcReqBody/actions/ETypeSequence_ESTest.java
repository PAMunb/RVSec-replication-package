/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:18:20 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.kdcReqBody.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.api.asn1.ber.tlv.TLV;
import org.apache.directory.shared.kerberos.codec.kdcReqBody.KdcReqBodyContainer;
import org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.ETypeSequence;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ETypeSequence_ESTest extends ETypeSequence_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ETypeSequence eTypeSequence0 = new ETypeSequence();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(2441).when(tLV0).getLength();
      KdcReqBodyContainer kdcReqBodyContainer0 = mock(KdcReqBodyContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(kdcReqBodyContainer0).getCurrentTLV();
      eTypeSequence0.action(kdcReqBodyContainer0);
      assertEquals("KDC-REQ-BODY EType sequence", eTypeSequence0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ETypeSequence eTypeSequence0 = new ETypeSequence();
      KdcReqBodyContainer kdcReqBodyContainer0 = mock(KdcReqBodyContainer.class, new ViolatedAssumptionAnswer());
      doReturn((TLV) null).when(kdcReqBodyContainer0).getCurrentTLV();
      // Undeclared exception!
      try { 
        eTypeSequence0.action(kdcReqBodyContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.ETypeSequence", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ETypeSequence eTypeSequence0 = new ETypeSequence();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tLV0).getLength();
      KdcReqBodyContainer kdcReqBodyContainer0 = mock(KdcReqBodyContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(kdcReqBodyContainer0).getCurrentTLV();
      eTypeSequence0.action(kdcReqBodyContainer0);
      assertEquals("KDC-REQ-BODY EType sequence", eTypeSequence0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ETypeSequence eTypeSequence0 = new ETypeSequence();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn((-2581)).when(tLV0).getLength();
      KdcReqBodyContainer kdcReqBodyContainer0 = mock(KdcReqBodyContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(kdcReqBodyContainer0).getCurrentTLV();
      eTypeSequence0.action(kdcReqBodyContainer0);
      assertEquals("KDC-REQ-BODY EType sequence", eTypeSequence0.toString());
  }
}
