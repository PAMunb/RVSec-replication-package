/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:07:10 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.kdcReq.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import org.apache.directory.api.asn1.ber.tlv.TLV;
import org.apache.directory.shared.kerberos.codec.kdcReq.KdcReqContainer;
import org.apache.directory.shared.kerberos.codec.kdcReq.actions.StoreKdcReqBody;
import org.apache.directory.shared.kerberos.components.KdcReq;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreKdcReqBody_ESTest extends StoreKdcReqBody_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreKdcReqBody storeKdcReqBody0 = new StoreKdcReqBody();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(tLV0).getLength();
      KdcReqContainer kdcReqContainer0 = mock(KdcReqContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(kdcReqContainer0).getCurrentTLV();
      doReturn((ByteBuffer) null, (ByteBuffer) null).when(kdcReqContainer0).getStream();
      // Undeclared exception!
      try { 
        storeKdcReqBody0.action(kdcReqContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.api.asn1.ber.Asn1Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreKdcReqBody storeKdcReqBody0 = new StoreKdcReqBody();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tLV0).getLength();
      KdcReqContainer kdcReqContainer0 = mock(KdcReqContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(kdcReqContainer0).getCurrentTLV();
      try { 
        storeKdcReqBody0.action(kdcReqContainer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_04067 The LdapMessage should not be empty
         //
         verifyException("org.apache.directory.shared.kerberos.codec.kdcReq.actions.StoreKdcReqBody", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StoreKdcReqBody storeKdcReqBody0 = new StoreKdcReqBody();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(2276).when(tLV0).getLength();
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      KdcReq kdcReq0 = mock(KdcReq.class, new ViolatedAssumptionAnswer());
      KdcReqContainer kdcReqContainer0 = mock(KdcReqContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(kdcReqContainer0).getCurrentTLV();
      doReturn(byteBuffer0, byteBuffer0).when(kdcReqContainer0).getStream();
      doReturn(kdcReq0).when(kdcReqContainer0).getKdcReq();
      storeKdcReqBody0.action(kdcReqContainer0);
      assertEquals("Stores the KDC-REQ-BODY", storeKdcReqBody0.toString());
  }
}
