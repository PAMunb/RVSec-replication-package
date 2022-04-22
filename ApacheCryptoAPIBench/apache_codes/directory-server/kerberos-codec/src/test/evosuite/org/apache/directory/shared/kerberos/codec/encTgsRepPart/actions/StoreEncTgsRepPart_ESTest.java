/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:13:23 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.encTgsRepPart.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import org.apache.directory.api.asn1.ber.tlv.TLV;
import org.apache.directory.shared.kerberos.codec.encTgsRepPart.EncTgsRepPartContainer;
import org.apache.directory.shared.kerberos.codec.encTgsRepPart.actions.StoreEncTgsRepPart;
import org.apache.directory.shared.kerberos.messages.EncTgsRepPart;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreEncTgsRepPart_ESTest extends StoreEncTgsRepPart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreEncTgsRepPart storeEncTgsRepPart0 = new StoreEncTgsRepPart();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn((-1693)).when(tLV0).getExpectedLength();
      doReturn((-1693), (-2739)).when(tLV0).getLength();
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      EncTgsRepPart encTgsRepPart0 = mock(EncTgsRepPart.class, new ViolatedAssumptionAnswer());
      EncTgsRepPartContainer encTgsRepPartContainer0 = mock(EncTgsRepPartContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(encTgsRepPartContainer0).getCurrentTLV();
      doReturn(byteBuffer0, byteBuffer0).when(encTgsRepPartContainer0).getStream();
      doReturn(encTgsRepPart0).when(encTgsRepPartContainer0).getEncTgsRepPart();
      storeEncTgsRepPart0.action(encTgsRepPartContainer0);
      assertEquals("Add an EncTgsRepPart instance", storeEncTgsRepPart0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreEncTgsRepPart storeEncTgsRepPart0 = new StoreEncTgsRepPart();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(504).when(tLV0).getLength();
      EncTgsRepPartContainer encTgsRepPartContainer0 = mock(EncTgsRepPartContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(encTgsRepPartContainer0).getCurrentTLV();
      doReturn((ByteBuffer) null, (ByteBuffer) null).when(encTgsRepPartContainer0).getStream();
      // Undeclared exception!
      try { 
        storeEncTgsRepPart0.action(encTgsRepPartContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.api.asn1.ber.Asn1Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StoreEncTgsRepPart storeEncTgsRepPart0 = new StoreEncTgsRepPart();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tLV0).getLength();
      EncTgsRepPartContainer encTgsRepPartContainer0 = mock(EncTgsRepPartContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(encTgsRepPartContainer0).getCurrentTLV();
      try { 
        storeEncTgsRepPart0.action(encTgsRepPartContainer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_04067 The LdapMessage should not be empty
         //
         verifyException("org.apache.directory.shared.kerberos.codec.encTgsRepPart.actions.StoreEncTgsRepPart", e);
      }
  }
}
