/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:16:54 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.hostAddresses.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import org.apache.directory.api.asn1.ber.tlv.TLV;
import org.apache.directory.shared.kerberos.codec.hostAddresses.HostAddressesContainer;
import org.apache.directory.shared.kerberos.codec.hostAddresses.actions.AddHostAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AddHostAddress_ESTest extends AddHostAddress_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AddHostAddress addHostAddress0 = new AddHostAddress();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn((-1927)).when(tLV0).getLength();
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      HostAddressesContainer hostAddressesContainer0 = mock(HostAddressesContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(hostAddressesContainer0).getCurrentTLV();
      doReturn((ByteBuffer) null, (ByteBuffer) null).when(hostAddressesContainer0).getStream();
      // Undeclared exception!
      try { 
        addHostAddress0.action(hostAddressesContainer0);
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
      AddHostAddress addHostAddress0 = new AddHostAddress();
      HostAddressesContainer hostAddressesContainer0 = mock(HostAddressesContainer.class, new ViolatedAssumptionAnswer());
      doReturn((TLV) null).when(hostAddressesContainer0).getCurrentTLV();
      // Undeclared exception!
      try { 
        addHostAddress0.action(hostAddressesContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.hostAddresses.actions.AddHostAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AddHostAddress addHostAddress0 = new AddHostAddress();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tLV0).getLength();
      HostAddressesContainer hostAddressesContainer0 = mock(HostAddressesContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(hostAddressesContainer0).getCurrentTLV();
      try { 
        addHostAddress0.action(hostAddressesContainer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_04067 The LdapMessage should not be empty
         //
         verifyException("org.apache.directory.shared.kerberos.codec.hostAddresses.actions.AddHostAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AddHostAddress addHostAddress0 = new AddHostAddress();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tLV0).getExpectedLength();
      doReturn(248, 0).when(tLV0).getLength();
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      HostAddressesContainer hostAddressesContainer0 = mock(HostAddressesContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(hostAddressesContainer0).getCurrentTLV();
      doReturn(byteBuffer0, byteBuffer0).when(hostAddressesContainer0).getStream();
      addHostAddress0.action(hostAddressesContainer0);
      assertEquals("Add an HostAddress instance", addHostAddress0.toString());
  }
}
