/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:06:33 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.krbError.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.api.asn1.ber.tlv.TLV;
import org.apache.directory.shared.kerberos.codec.krbError.KrbErrorContainer;
import org.apache.directory.shared.kerberos.codec.krbError.actions.KrbErrorInit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class KrbErrorInit_ESTest extends KrbErrorInit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KrbErrorInit krbErrorInit0 = new KrbErrorInit();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn((-4071)).when(tLV0).getLength();
      KrbErrorContainer krbErrorContainer0 = mock(KrbErrorContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(krbErrorContainer0).getCurrentTLV();
      krbErrorInit0.action(krbErrorContainer0);
      assertEquals("Creates a KrbError instance", krbErrorInit0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KrbErrorInit krbErrorInit0 = new KrbErrorInit();
      KrbErrorContainer krbErrorContainer0 = mock(KrbErrorContainer.class, new ViolatedAssumptionAnswer());
      doReturn((TLV) null).when(krbErrorContainer0).getCurrentTLV();
      // Undeclared exception!
      try { 
        krbErrorInit0.action(krbErrorContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.krbError.actions.KrbErrorInit", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(384).when(tLV0).getLength();
      KrbErrorContainer krbErrorContainer0 = mock(KrbErrorContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(krbErrorContainer0).getCurrentTLV();
      KrbErrorInit krbErrorInit0 = new KrbErrorInit();
      krbErrorInit0.action(krbErrorContainer0);
      assertEquals("Creates a KrbError instance", krbErrorInit0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      KrbErrorInit krbErrorInit0 = new KrbErrorInit();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tLV0).getLength();
      KrbErrorContainer krbErrorContainer0 = mock(KrbErrorContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(krbErrorContainer0).getCurrentTLV();
      try { 
        krbErrorInit0.action(krbErrorContainer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_04067 The LdapMessage should not be empty
         //
         verifyException("org.apache.directory.shared.kerberos.codec.krbError.actions.KrbErrorInit", e);
      }
  }
}