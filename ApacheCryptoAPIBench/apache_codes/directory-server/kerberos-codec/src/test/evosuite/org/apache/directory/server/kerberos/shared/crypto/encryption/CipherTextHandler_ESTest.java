/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:19:11 GMT 2022
 */

package org.apache.directory.server.kerberos.shared.crypto.encryption;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import org.apache.directory.api.asn1.Asn1Object;
import org.apache.directory.server.kerberos.shared.crypto.encryption.CipherTextHandler;
import org.apache.directory.server.kerberos.shared.crypto.encryption.KeyUsage;
import org.apache.directory.shared.kerberos.codec.types.EncryptionType;
import org.apache.directory.shared.kerberos.components.EncryptedData;
import org.apache.directory.shared.kerberos.components.EncryptionKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CipherTextHandler_ESTest extends CipherTextHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CipherTextHandler cipherTextHandler0 = new CipherTextHandler();
      EncryptionType encryptionType0 = EncryptionType.RC4_HMAC;
      EncryptionKey encryptionKey0 = mock(EncryptionKey.class, new ViolatedAssumptionAnswer());
      doReturn(encryptionType0, (EncryptionType) null).when(encryptionKey0).getKeyType();
      doReturn(1619, 0).when(encryptionKey0).getKeyVersion();
      byte[] byteArray0 = new byte[3];
      KeyUsage keyUsage0 = mock(KeyUsage.class, new ViolatedAssumptionAnswer());
      EncryptedData encryptedData0 = cipherTextHandler0.encrypt(encryptionKey0, byteArray0, keyUsage0);
      KeyUsage keyUsage1 = mock(KeyUsage.class, new ViolatedAssumptionAnswer());
      EncryptedData encryptedData1 = cipherTextHandler0.seal(encryptionKey0, encryptedData0, keyUsage1);
      assertEquals(EncryptionType.RC4_HMAC, encryptedData1.getEType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CipherTextHandler cipherTextHandler0 = new CipherTextHandler();
      EncryptionType encryptionType0 = EncryptionType.RC4_HMAC;
      EncryptionKey encryptionKey0 = mock(EncryptionKey.class, new ViolatedAssumptionAnswer());
      doReturn(encryptionType0, (EncryptionType) null).when(encryptionKey0).getKeyType();
      doReturn((-1020), 0).when(encryptionKey0).getKeyVersion();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)49;
      byteArray0[1] = (byte) (-53);
      byteArray0[2] = (byte)49;
      KeyUsage keyUsage0 = mock(KeyUsage.class, new ViolatedAssumptionAnswer());
      EncryptedData encryptedData0 = cipherTextHandler0.encrypt(encryptionKey0, byteArray0, keyUsage0);
      KeyUsage keyUsage1 = mock(KeyUsage.class, new ViolatedAssumptionAnswer());
      cipherTextHandler0.seal(encryptionKey0, encryptedData0, keyUsage1);
      EncryptionKey encryptionKey1 = mock(EncryptionKey.class, new ViolatedAssumptionAnswer());
      doReturn(encryptionType0, (EncryptionType) null).when(encryptionKey1).getKeyType();
      KeyUsage keyUsage2 = mock(KeyUsage.class, new ViolatedAssumptionAnswer());
      try { 
        cipherTextHandler0.decrypt(encryptionKey1, encryptedData0, keyUsage2);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // KDC has no support for encryption type
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.CipherTextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CipherTextHandler cipherTextHandler0 = new CipherTextHandler();
      EncryptionType encryptionType0 = EncryptionType.RC4_HMAC;
      EncryptionKey encryptionKey0 = mock(EncryptionKey.class, new ViolatedAssumptionAnswer());
      doReturn(encryptionType0).when(encryptionKey0).getKeyType();
      doReturn(0).when(encryptionKey0).getKeyVersion();
      byte[] byteArray0 = new byte[3];
      KeyUsage keyUsage0 = mock(KeyUsage.class, new ViolatedAssumptionAnswer());
      EncryptedData encryptedData0 = cipherTextHandler0.encrypt(encryptionKey0, byteArray0, keyUsage0);
      EncryptionKey encryptionKey1 = mock(EncryptionKey.class, new ViolatedAssumptionAnswer());
      doReturn((EncryptionType) null).when(encryptionKey1).getKeyType();
      KeyUsage keyUsage1 = mock(KeyUsage.class, new ViolatedAssumptionAnswer());
      try { 
        cipherTextHandler0.seal(encryptionKey1, encryptedData0, keyUsage1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // KDC has no support for encryption type
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.CipherTextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CipherTextHandler cipherTextHandler0 = new CipherTextHandler();
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      EncryptionKey encryptionKey0 = mock(EncryptionKey.class, new ViolatedAssumptionAnswer());
      doReturn(690).when(encryptionKey0).computeLength();
      doReturn(byteBuffer0).when(encryptionKey0).encode(any(java.nio.ByteBuffer.class));
      KeyUsage keyUsage0 = mock(KeyUsage.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        cipherTextHandler0.seal(encryptionKey0, encryptionKey0, keyUsage0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CipherTextHandler cipherTextHandler0 = new CipherTextHandler();
      // Undeclared exception!
      try { 
        cipherTextHandler0.seal((EncryptionKey) null, (Asn1Object) null, (KeyUsage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.CipherTextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CipherTextHandler cipherTextHandler0 = new CipherTextHandler();
      EncryptionKey encryptionKey0 = mock(EncryptionKey.class, new ViolatedAssumptionAnswer());
      doReturn((-125)).when(encryptionKey0).computeLength();
      KeyUsage keyUsage0 = mock(KeyUsage.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        cipherTextHandler0.seal(encryptionKey0, encryptionKey0, keyUsage0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CipherTextHandler cipherTextHandler0 = new CipherTextHandler();
      byte[] byteArray0 = new byte[3];
      EncryptionKey encryptionKey0 = mock(EncryptionKey.class, new ViolatedAssumptionAnswer());
      doReturn((EncryptionType) null).when(encryptionKey0).getKeyType();
      KeyUsage keyUsage0 = mock(KeyUsage.class, new ViolatedAssumptionAnswer());
      try { 
        cipherTextHandler0.encrypt(encryptionKey0, byteArray0, keyUsage0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // KDC has no support for encryption type
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.CipherTextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CipherTextHandler cipherTextHandler0 = new CipherTextHandler();
      // Undeclared exception!
      try { 
        cipherTextHandler0.encrypt((EncryptionKey) null, (byte[]) null, (KeyUsage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.CipherTextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CipherTextHandler cipherTextHandler0 = new CipherTextHandler();
      EncryptionType encryptionType0 = EncryptionType.DES3_CBC_SHA1_KD;
      EncryptionKey encryptionKey0 = mock(EncryptionKey.class, new ViolatedAssumptionAnswer());
      doReturn(encryptionType0).when(encryptionKey0).getKeyType();
      doReturn((byte[]) null).when(encryptionKey0).getKeyValue();
      KeyUsage keyUsage0 = mock(KeyUsage.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(keyUsage0).getOrdinal();
      // Undeclared exception!
      try { 
        cipherTextHandler0.encrypt(encryptionKey0, (byte[]) null, keyUsage0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing argument
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CipherTextHandler cipherTextHandler0 = new CipherTextHandler();
      // Undeclared exception!
      try { 
        cipherTextHandler0.decrypt((EncryptionKey) null, (EncryptedData) null, (KeyUsage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.CipherTextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CipherTextHandler cipherTextHandler0 = new CipherTextHandler();
      EncryptionType encryptionType0 = EncryptionType.DES3_CBC_SHA1_KD;
      EncryptionKey encryptionKey0 = mock(EncryptionKey.class, new ViolatedAssumptionAnswer());
      doReturn(encryptionType0, encryptionType0).when(encryptionKey0).getKeyType();
      doReturn((byte[]) null).when(encryptionKey0).getKeyValue();
      KeyUsage keyUsage0 = mock(KeyUsage.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(keyUsage0).getOrdinal();
      // Undeclared exception!
      try { 
        cipherTextHandler0.decrypt(encryptionKey0, (EncryptedData) null, keyUsage0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing argument
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }
}
