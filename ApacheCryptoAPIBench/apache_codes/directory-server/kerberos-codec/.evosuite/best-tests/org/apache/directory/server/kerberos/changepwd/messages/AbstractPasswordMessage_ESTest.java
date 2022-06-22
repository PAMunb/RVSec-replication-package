/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:28:00 GMT 2022
 */

package org.apache.directory.server.kerberos.changepwd.messages;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import org.apache.directory.server.kerberos.changepwd.messages.ChangePasswordError;
import org.apache.directory.server.kerberos.changepwd.messages.ChangePasswordReply;
import org.apache.directory.server.kerberos.changepwd.messages.ChangePasswordRequest;
import org.apache.directory.shared.kerberos.messages.ApRep;
import org.apache.directory.shared.kerberos.messages.ApReq;
import org.apache.directory.shared.kerberos.messages.KrbError;
import org.apache.directory.shared.kerberos.messages.KrbPriv;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractPasswordMessage_ESTest extends AbstractPasswordMessage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KrbError krbError0 = mock(KrbError.class, new ViolatedAssumptionAnswer());
      doReturn((ByteBuffer) null).when(krbError0).encode(any(java.nio.ByteBuffer.class));
      ApRep apRep0 = mock(ApRep.class, new ViolatedAssumptionAnswer());
      doReturn((ByteBuffer) null).when(apRep0).encode(any(java.nio.ByteBuffer.class));
      KrbPriv krbPriv0 = mock(KrbPriv.class, new ViolatedAssumptionAnswer());
      doReturn((ByteBuffer) null).when(krbPriv0).encode(any(java.nio.ByteBuffer.class));
      ChangePasswordReply changePasswordReply0 = new ChangePasswordReply(apRep0, krbPriv0);
      ChangePasswordError changePasswordError0 = new ChangePasswordError(krbError0);
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      doReturn((ByteBuffer) null, (ByteBuffer) null, (ByteBuffer) null, (ByteBuffer) null, (ByteBuffer) null).when(byteBuffer0).putShort(anyShort());
      ByteBuffer byteBuffer1 = changePasswordError0.encode(byteBuffer0);
      changePasswordReply0.encode(byteBuffer1);
      assertEquals((short) (-128), changePasswordError0.getVersionNumber());
      assertEquals((short) (-128), changePasswordReply0.getVersionNumber());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ApRep apRep0 = mock(ApRep.class, new ViolatedAssumptionAnswer());
      KrbPriv krbPriv0 = mock(KrbPriv.class, new ViolatedAssumptionAnswer());
      ChangePasswordReply changePasswordReply0 = new ChangePasswordReply(apRep0, krbPriv0);
      KrbPriv krbPriv1 = changePasswordReply0.getPrivateMessage();
      ApReq apReq0 = mock(ApReq.class, new ViolatedAssumptionAnswer());
      ChangePasswordRequest changePasswordRequest0 = new ChangePasswordRequest((short)2068, apReq0, krbPriv1);
      short short0 = changePasswordRequest0.getVersionNumber();
      assertEquals((short)2068, short0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ApRep apRep0 = mock(ApRep.class, new ViolatedAssumptionAnswer());
      KrbPriv krbPriv0 = mock(KrbPriv.class, new ViolatedAssumptionAnswer());
      ChangePasswordReply changePasswordReply0 = new ChangePasswordReply(apRep0, krbPriv0);
      short short0 = changePasswordReply0.getVersionNumber();
      assertEquals((short) (-128), short0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ApRep apRep0 = mock(ApRep.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(apRep0).computeLength();
      KrbPriv krbPriv0 = mock(KrbPriv.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(krbPriv0).computeLength();
      ChangePasswordReply changePasswordReply0 = new ChangePasswordReply((short)754, apRep0, krbPriv0);
      changePasswordReply0.computeLength();
      assertEquals((short)754, changePasswordReply0.getVersionNumber());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ApRep apRep0 = mock(ApRep.class, new ViolatedAssumptionAnswer());
      doReturn((-2418)).when(apRep0).computeLength();
      KrbPriv krbPriv0 = mock(KrbPriv.class, new ViolatedAssumptionAnswer());
      doReturn((int)(short)754).when(krbPriv0).computeLength();
      ChangePasswordReply changePasswordReply0 = new ChangePasswordReply((short)754, apRep0, krbPriv0);
      changePasswordReply0.computeLength();
      assertEquals((short)754, changePasswordReply0.getVersionNumber());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ChangePasswordError changePasswordError0 = new ChangePasswordError((short)0, (KrbError) null);
      // Undeclared exception!
      try { 
        changePasswordError0.encode((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.changepwd.messages.ChangePasswordError", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ApRep apRep0 = mock(ApRep.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(apRep0).computeLength();
      ChangePasswordReply changePasswordReply0 = new ChangePasswordReply((short)0, apRep0, (KrbPriv) null);
      // Undeclared exception!
      try { 
        changePasswordReply0.computeLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.changepwd.messages.ChangePasswordReply", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ApRep apRep0 = mock(ApRep.class, new ViolatedAssumptionAnswer());
      ChangePasswordReply changePasswordReply0 = new ChangePasswordReply((short)0, apRep0, (KrbPriv) null);
      short short0 = changePasswordReply0.getVersionNumber();
      assertEquals((short)0, short0);
  }
}