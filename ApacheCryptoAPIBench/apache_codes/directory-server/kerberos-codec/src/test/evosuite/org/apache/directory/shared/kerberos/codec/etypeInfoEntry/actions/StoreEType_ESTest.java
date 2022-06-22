/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:15:36 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.etypeInfoEntry.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.api.asn1.ber.tlv.BerValue;
import org.apache.directory.api.asn1.ber.tlv.TLV;
import org.apache.directory.shared.kerberos.codec.etypeInfoEntry.ETypeInfoEntryContainer;
import org.apache.directory.shared.kerberos.codec.etypeInfoEntry.actions.StoreEType;
import org.apache.directory.shared.kerberos.components.ETypeInfoEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreEType_ESTest extends StoreEType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreEType storeEType0 = new StoreEType();
      BerValue berValue0 = mock(BerValue.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(berValue0).getData();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(579).when(tLV0).getLength();
      doReturn(berValue0).when(tLV0).getValue();
      ETypeInfoEntry eTypeInfoEntry0 = mock(ETypeInfoEntry.class, new ViolatedAssumptionAnswer());
      ETypeInfoEntryContainer eTypeInfoEntryContainer0 = mock(ETypeInfoEntryContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(eTypeInfoEntryContainer0).getCurrentTLV();
      doReturn(eTypeInfoEntry0).when(eTypeInfoEntryContainer0).getETypeInfoEntry();
      try { 
        storeEType0.action(eTypeInfoEntryContainer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_00036_0_BYTES_LONG_INTEGER The value is 0 byte long. This is not allowed for an integer
         //
         verifyException("org.apache.directory.shared.kerberos.codec.etypeInfoEntry.actions.StoreEType", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreEType storeEType0 = new StoreEType();
      // Undeclared exception!
      try { 
        storeEType0.action((ETypeInfoEntryContainer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.etypeInfoEntry.actions.StoreEType", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StoreEType storeEType0 = new StoreEType();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tLV0).getLength();
      ETypeInfoEntryContainer eTypeInfoEntryContainer0 = mock(ETypeInfoEntryContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(eTypeInfoEntryContainer0).getCurrentTLV();
      try { 
        storeEType0.action(eTypeInfoEntryContainer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_04067 The LdapMessage should not be empty
         //
         verifyException("org.apache.directory.shared.kerberos.codec.etypeInfoEntry.actions.StoreEType", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StoreEType storeEType0 = new StoreEType();
      byte[] byteArray0 = new byte[1];
      BerValue berValue0 = mock(BerValue.class, new ViolatedAssumptionAnswer());
      doReturn(byteArray0).when(berValue0).getData();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn((-809)).when(tLV0).getLength();
      doReturn(berValue0).when(tLV0).getValue();
      ETypeInfoEntry eTypeInfoEntry0 = mock(ETypeInfoEntry.class, new ViolatedAssumptionAnswer());
      ETypeInfoEntryContainer eTypeInfoEntryContainer0 = mock(ETypeInfoEntryContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(eTypeInfoEntryContainer0).getCurrentTLV();
      doReturn(eTypeInfoEntry0).when(eTypeInfoEntryContainer0).getETypeInfoEntry();
      storeEType0.action(eTypeInfoEntryContainer0);
      assertEquals("ETYPE-INFO-ENTRY etype", storeEType0.toString());
  }
}