/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:15:01 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.krbSafe.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import org.apache.directory.api.asn1.ber.tlv.TLV;
import org.apache.directory.shared.kerberos.codec.krbSafe.KrbSafeContainer;
import org.apache.directory.shared.kerberos.codec.krbSafe.actions.StoreSafeBody;
import org.apache.directory.shared.kerberos.messages.KrbSafe;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreSafeBody_ESTest extends StoreSafeBody_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreSafeBody storeSafeBody0 = new StoreSafeBody();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn((-1476)).when(tLV0).getLength();
      KrbSafeContainer krbSafeContainer0 = mock(KrbSafeContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(krbSafeContainer0).getCurrentTLV();
      doReturn((ByteBuffer) null, (ByteBuffer) null).when(krbSafeContainer0).getStream();
      // Undeclared exception!
      try { 
        storeSafeBody0.action(krbSafeContainer0);
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
      StoreSafeBody storeSafeBody0 = new StoreSafeBody();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tLV0).getExpectedLength();
      doReturn(1340, 0).when(tLV0).getLength();
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      KrbSafe krbSafe0 = mock(KrbSafe.class, new ViolatedAssumptionAnswer());
      KrbSafeContainer krbSafeContainer0 = mock(KrbSafeContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(krbSafeContainer0).getCurrentTLV();
      doReturn(byteBuffer0, byteBuffer0).when(krbSafeContainer0).getStream();
      doReturn(krbSafe0).when(krbSafeContainer0).getKrbSafe();
      storeSafeBody0.action(krbSafeContainer0);
      assertEquals("KRB-SAFE safe-body", storeSafeBody0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StoreSafeBody storeSafeBody0 = new StoreSafeBody();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tLV0).getLength();
      KrbSafeContainer krbSafeContainer0 = mock(KrbSafeContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(krbSafeContainer0).getCurrentTLV();
      try { 
        storeSafeBody0.action(krbSafeContainer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_04067 The LdapMessage should not be empty
         //
         verifyException("org.apache.directory.shared.kerberos.codec.krbSafe.actions.StoreSafeBody", e);
      }
  }
}
