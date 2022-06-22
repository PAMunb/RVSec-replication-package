/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:10:11 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.etypeInfo.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import org.apache.directory.api.asn1.ber.tlv.TLV;
import org.apache.directory.shared.kerberos.codec.etypeInfo.ETypeInfoContainer;
import org.apache.directory.shared.kerberos.codec.etypeInfo.actions.AddETypeInfoEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AddETypeInfoEntry_ESTest extends AddETypeInfoEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AddETypeInfoEntry addETypeInfoEntry0 = new AddETypeInfoEntry();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn((-1586)).when(tLV0).getLength();
      ETypeInfoContainer eTypeInfoContainer0 = mock(ETypeInfoContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(eTypeInfoContainer0).getCurrentTLV();
      doReturn((ByteBuffer) null, (ByteBuffer) null).when(eTypeInfoContainer0).getStream();
      // Undeclared exception!
      try { 
        addETypeInfoEntry0.action(eTypeInfoContainer0);
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
      AddETypeInfoEntry addETypeInfoEntry0 = new AddETypeInfoEntry();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tLV0).getLength();
      ETypeInfoContainer eTypeInfoContainer0 = mock(ETypeInfoContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(eTypeInfoContainer0).getCurrentTLV();
      try { 
        addETypeInfoEntry0.action(eTypeInfoContainer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_04067 The LdapMessage should not be empty
         //
         verifyException("org.apache.directory.shared.kerberos.codec.etypeInfo.actions.AddETypeInfoEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AddETypeInfoEntry addETypeInfoEntry0 = new AddETypeInfoEntry();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tLV0).getExpectedLength();
      doReturn(1125, 0).when(tLV0).getLength();
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      ETypeInfoContainer eTypeInfoContainer0 = mock(ETypeInfoContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(eTypeInfoContainer0).getCurrentTLV();
      doReturn(byteBuffer0, byteBuffer0).when(eTypeInfoContainer0).getStream();
      addETypeInfoEntry0.action(eTypeInfoContainer0);
      assertEquals("Add an ETypeInfoEntry instance", addETypeInfoEntry0.toString());
  }
}