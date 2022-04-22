/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:13:51 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.encApRepPart.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.api.asn1.ber.tlv.TLV;
import org.apache.directory.shared.kerberos.codec.encApRepPart.EncApRepPartContainer;
import org.apache.directory.shared.kerberos.codec.encApRepPart.actions.EncApRepPartInit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EncApRepPartInit_ESTest extends EncApRepPartInit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EncApRepPartInit encApRepPartInit0 = new EncApRepPartInit();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(1605).when(tLV0).getLength();
      EncApRepPartContainer encApRepPartContainer0 = mock(EncApRepPartContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(encApRepPartContainer0).getCurrentTLV();
      encApRepPartInit0.action(encApRepPartContainer0);
      assertEquals("Creates an EncApRepPart instance", encApRepPartInit0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EncApRepPartInit encApRepPartInit0 = new EncApRepPartInit();
      // Undeclared exception!
      try { 
        encApRepPartInit0.action((EncApRepPartContainer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.encApRepPart.actions.EncApRepPartInit", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EncApRepPartInit encApRepPartInit0 = new EncApRepPartInit();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tLV0).getLength();
      EncApRepPartContainer encApRepPartContainer0 = mock(EncApRepPartContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(encApRepPartContainer0).getCurrentTLV();
      try { 
        encApRepPartInit0.action(encApRepPartContainer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_04067 The LdapMessage should not be empty
         //
         verifyException("org.apache.directory.shared.kerberos.codec.encApRepPart.actions.EncApRepPartInit", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EncApRepPartInit encApRepPartInit0 = new EncApRepPartInit();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn((-4916)).when(tLV0).getLength();
      EncApRepPartContainer encApRepPartContainer0 = mock(EncApRepPartContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(encApRepPartContainer0).getCurrentTLV();
      encApRepPartInit0.action(encApRepPartContainer0);
      assertEquals("Creates an EncApRepPart instance", encApRepPartInit0.toString());
  }
}
