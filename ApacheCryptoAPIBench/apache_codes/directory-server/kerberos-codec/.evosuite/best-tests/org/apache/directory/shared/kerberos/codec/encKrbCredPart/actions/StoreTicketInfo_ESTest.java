/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:06:12 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.encKrbCredPart.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import org.apache.directory.api.asn1.ber.tlv.TLV;
import org.apache.directory.shared.kerberos.codec.encKrbCredPart.EncKrbCredPartContainer;
import org.apache.directory.shared.kerberos.codec.encKrbCredPart.actions.StoreTicketInfo;
import org.apache.directory.shared.kerberos.components.EncKrbCredPart;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreTicketInfo_ESTest extends StoreTicketInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreTicketInfo storeTicketInfo0 = new StoreTicketInfo();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tLV0).getExpectedLength();
      doReturn(555, 0).when(tLV0).getLength();
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      ByteBuffer byteBuffer1 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      EncKrbCredPart encKrbCredPart0 = mock(EncKrbCredPart.class, new ViolatedAssumptionAnswer());
      EncKrbCredPartContainer encKrbCredPartContainer0 = mock(EncKrbCredPartContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(encKrbCredPartContainer0).getCurrentTLV();
      doReturn(byteBuffer0, byteBuffer1).when(encKrbCredPartContainer0).getStream();
      doReturn(encKrbCredPart0).when(encKrbCredPartContainer0).getEncKrbCredPart();
      storeTicketInfo0.action(encKrbCredPartContainer0);
      assertNull(storeTicketInfo0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreTicketInfo storeTicketInfo0 = new StoreTicketInfo();
      EncKrbCredPartContainer encKrbCredPartContainer0 = mock(EncKrbCredPartContainer.class, new ViolatedAssumptionAnswer());
      doReturn((TLV) null).when(encKrbCredPartContainer0).getCurrentTLV();
      // Undeclared exception!
      try { 
        storeTicketInfo0.action(encKrbCredPartContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.encKrbCredPart.actions.StoreTicketInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn((-2584)).when(tLV0).getLength();
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      EncKrbCredPart encKrbCredPart0 = mock(EncKrbCredPart.class, new ViolatedAssumptionAnswer());
      EncKrbCredPartContainer encKrbCredPartContainer0 = mock(EncKrbCredPartContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(encKrbCredPartContainer0).getCurrentTLV();
      doReturn((ByteBuffer) null, (ByteBuffer) null).when(encKrbCredPartContainer0).getStream();
      StoreTicketInfo storeTicketInfo0 = new StoreTicketInfo();
      // Undeclared exception!
      try { 
        storeTicketInfo0.action(encKrbCredPartContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.api.asn1.ber.Asn1Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StoreTicketInfo storeTicketInfo0 = new StoreTicketInfo();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tLV0).getLength();
      EncKrbCredPartContainer encKrbCredPartContainer0 = mock(EncKrbCredPartContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(encKrbCredPartContainer0).getCurrentTLV();
      try { 
        storeTicketInfo0.action(encKrbCredPartContainer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_04067 The LdapMessage should not be empty
         //
         verifyException("org.apache.directory.shared.kerberos.codec.encKrbCredPart.actions.StoreTicketInfo", e);
      }
  }
}
