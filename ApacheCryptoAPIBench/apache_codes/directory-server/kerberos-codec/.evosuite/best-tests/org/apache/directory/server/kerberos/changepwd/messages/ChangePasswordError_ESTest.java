/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:37:05 GMT 2022
 */

package org.apache.directory.server.kerberos.changepwd.messages;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import org.apache.directory.server.kerberos.changepwd.exceptions.ChangePasswdErrorType;
import org.apache.directory.server.kerberos.changepwd.messages.ChangePasswordError;
import org.apache.directory.shared.kerberos.messages.KrbError;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ChangePasswordError_ESTest extends ChangePasswordError_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      KrbError krbError0 = mock(KrbError.class, new ViolatedAssumptionAnswer());
      doReturn(byteArray0).when(krbError0).getEData();
      ChangePasswordError changePasswordError0 = new ChangePasswordError((short)2104, krbError0);
      String string0 = changePasswordError0.getResultString();
      assertEquals("\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      KrbError krbError0 = mock(KrbError.class, new ViolatedAssumptionAnswer());
      doReturn(byteArray0).when(krbError0).getEData();
      ChangePasswordError changePasswordError0 = new ChangePasswordError((short)0, krbError0);
      String string0 = changePasswordError0.getResultString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      KrbError krbError0 = mock(KrbError.class, new ViolatedAssumptionAnswer());
      doReturn(byteArray0).when(krbError0).getEData();
      ChangePasswordError changePasswordError0 = new ChangePasswordError((short)0, krbError0);
      ChangePasswdErrorType changePasswdErrorType0 = changePasswordError0.getResultCode();
      assertEquals("Request failed for an unknown reason.", changePasswdErrorType0.getMessage());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KrbError krbError0 = mock(KrbError.class, new ViolatedAssumptionAnswer());
      doReturn((int)(short)0).when(krbError0).computeLength();
      ChangePasswordError changePasswordError0 = new ChangePasswordError((short)0, krbError0);
      short short0 = changePasswordError0.computeLength();
      assertEquals((short)6, short0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KrbError krbError0 = mock(KrbError.class, new ViolatedAssumptionAnswer());
      doReturn((-864)).when(krbError0).computeLength();
      ChangePasswordError changePasswordError0 = new ChangePasswordError((short)2104, krbError0);
      short short0 = changePasswordError0.computeLength();
      assertEquals((short) (-858), short0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      KrbError krbError0 = mock(KrbError.class, new ViolatedAssumptionAnswer());
      doReturn(byteArray0).when(krbError0).getEData();
      ChangePasswordError changePasswordError0 = new ChangePasswordError((short)2104, krbError0);
      // Undeclared exception!
      try { 
        changePasswordError0.getResultString();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      KrbError krbError0 = mock(KrbError.class, new ViolatedAssumptionAnswer());
      doReturn(byteArray0).when(krbError0).getEData();
      ChangePasswordError changePasswordError0 = new ChangePasswordError(krbError0);
      // Undeclared exception!
      try { 
        changePasswordError0.getResultCode();
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      doReturn((ByteBuffer) null).when(byteBuffer0).get(any(byte[].class));
      doReturn((short)516, (short) (-3974), (short) (-3974)).when(byteBuffer0).getShort();
      try { 
        ChangePasswordError.decode(byteBuffer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Request failed due to being malformed.
         //
         verifyException("org.apache.directory.server.kerberos.changepwd.messages.ChangePasswordError", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ChangePasswordError.decode((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.changepwd.messages.ChangePasswordError", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      doReturn((short)0, (short)0, (short)0).when(byteBuffer0).getShort();
      // Undeclared exception!
      try { 
        ChangePasswordError.decode(byteBuffer0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.changepwd.messages.ChangePasswordError", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KrbError krbError0 = mock(KrbError.class, new ViolatedAssumptionAnswer());
      doReturn((ByteBuffer) null).when(krbError0).encode(any(java.nio.ByteBuffer.class));
      ChangePasswordError changePasswordError0 = new ChangePasswordError((short)0, krbError0);
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      doReturn((ByteBuffer) null).when(byteBuffer0).get(any(byte[].class));
      doReturn((short)6, (short) (-1693), (short)1827).when(byteBuffer0).getShort();
      doReturn((ByteBuffer) null, (ByteBuffer) null, (ByteBuffer) null).when(byteBuffer0).putShort(anyShort());
      doReturn("\"C%ak3 q;V>_tXl6r;.").when(byteBuffer0).toString();
      ByteBuffer byteBuffer1 = changePasswordError0.encode(byteBuffer0);
      ChangePasswordError changePasswordError1 = ChangePasswordError.decode(byteBuffer1);
      assertEquals((short) (-1693), changePasswordError1.getVersionNumber());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ChangePasswordError changePasswordError0 = new ChangePasswordError((KrbError) null);
      // Undeclared exception!
      try { 
        changePasswordError0.computeLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.changepwd.messages.ChangePasswordError", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ChangePasswordError changePasswordError0 = new ChangePasswordError((short)0, (KrbError) null);
      // Undeclared exception!
      try { 
        changePasswordError0.getResultString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.changepwd.messages.ChangePasswordError", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ChangePasswordError changePasswordError0 = new ChangePasswordError((short) (-262), (KrbError) null);
      // Undeclared exception!
      try { 
        changePasswordError0.getResultCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.changepwd.messages.ChangePasswordError", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ChangePasswordError changePasswordError0 = new ChangePasswordError((KrbError) null);
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
  public void test15()  throws Throwable  {
      ChangePasswordError changePasswordError0 = new ChangePasswordError((KrbError) null);
      KrbError krbError0 = changePasswordError0.getKrbError();
      assertNull(krbError0);
  }
}
