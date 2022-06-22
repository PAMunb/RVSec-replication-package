/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:14:46 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.etypeInfo2Entry.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.api.asn1.ber.tlv.TLV;
import org.apache.directory.shared.kerberos.codec.etypeInfo2Entry.ETypeInfo2EntryContainer;
import org.apache.directory.shared.kerberos.codec.etypeInfo2Entry.actions.ETypeInfo2EntryInit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ETypeInfo2EntryInit_ESTest extends ETypeInfo2EntryInit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ETypeInfo2EntryInit eTypeInfo2EntryInit0 = new ETypeInfo2EntryInit();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(648).when(tLV0).getLength();
      ETypeInfo2EntryContainer eTypeInfo2EntryContainer0 = mock(ETypeInfo2EntryContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(eTypeInfo2EntryContainer0).getCurrentTLV();
      eTypeInfo2EntryInit0.action(eTypeInfo2EntryContainer0);
      assertEquals("Creates a ETYPE-INFO2-ENTRY instance", eTypeInfo2EntryInit0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ETypeInfo2EntryInit eTypeInfo2EntryInit0 = new ETypeInfo2EntryInit();
      ETypeInfo2EntryContainer eTypeInfo2EntryContainer0 = mock(ETypeInfo2EntryContainer.class, new ViolatedAssumptionAnswer());
      doReturn((TLV) null).when(eTypeInfo2EntryContainer0).getCurrentTLV();
      // Undeclared exception!
      try { 
        eTypeInfo2EntryInit0.action(eTypeInfo2EntryContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.etypeInfo2Entry.actions.ETypeInfo2EntryInit", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ETypeInfo2EntryInit eTypeInfo2EntryInit0 = new ETypeInfo2EntryInit();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tLV0).getLength();
      ETypeInfo2EntryContainer eTypeInfo2EntryContainer0 = mock(ETypeInfo2EntryContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(eTypeInfo2EntryContainer0).getCurrentTLV();
      try { 
        eTypeInfo2EntryInit0.action(eTypeInfo2EntryContainer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_04067 The LdapMessage should not be empty
         //
         verifyException("org.apache.directory.shared.kerberos.codec.etypeInfo2Entry.actions.ETypeInfo2EntryInit", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ETypeInfo2EntryInit eTypeInfo2EntryInit0 = new ETypeInfo2EntryInit();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn((-1854)).when(tLV0).getLength();
      ETypeInfo2EntryContainer eTypeInfo2EntryContainer0 = mock(ETypeInfo2EntryContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(eTypeInfo2EntryContainer0).getCurrentTLV();
      eTypeInfo2EntryInit0.action(eTypeInfo2EntryContainer0);
      assertEquals("Creates a ETYPE-INFO2-ENTRY instance", eTypeInfo2EntryInit0.toString());
  }
}