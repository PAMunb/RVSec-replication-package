/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:46:45 GMT 2022
 */

package org.apache.directory.shared.kerberos.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import org.apache.directory.shared.kerberos.codec.types.EncryptionType;
import org.apache.directory.shared.kerberos.components.EncryptionKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EncryptionKey_ESTest extends EncryptionKey_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      EncryptionType encryptionType0 = EncryptionType.UNKNOWN;
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, byteArray0, (-116));
      encryptionKey0.computeLength();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)0);
      try { 
        encryptionKey0.encode(byteBuffer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_138 The PDU buffer size is too small !
         //
         verifyException("org.apache.directory.shared.kerberos.components.EncryptionKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EncryptionType encryptionType0 = EncryptionType.RESERVED6;
      byte[] byteArray0 = new byte[10];
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, byteArray0);
      int int0 = encryptionKey0.computeLength();
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EncryptionType encryptionType0 = EncryptionType.DES_CBC_MD5;
      byte[] byteArray0 = new byte[4];
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, byteArray0, (byte)14);
      int int0 = encryptionKey0.getKeyVersion();
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EncryptionKey encryptionKey0 = new EncryptionKey();
      encryptionKey0.setKeyVersion((-3916));
      int int0 = encryptionKey0.getKeyVersion();
      assertEquals((-3916), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EncryptionKey encryptionKey0 = new EncryptionKey();
      byte[] byteArray0 = encryptionKey0.getKeyValue();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EncryptionType encryptionType0 = EncryptionType.SUBKEY_KEYMATERIAL;
      byte[] byteArray0 = new byte[4];
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, byteArray0, 108);
      encryptionKey0.getKeyValue();
      assertEquals(108, encryptionKey0.getKeyVersion());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EncryptionKey encryptionKey0 = new EncryptionKey();
      encryptionKey0.getKeyType();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EncryptionType encryptionType0 = EncryptionType.DES_CBC_MD5;
      byte[] byteArray0 = new byte[2];
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, byteArray0);
      EncryptionType encryptionType1 = encryptionKey0.getKeyType();
      assertEquals("des-cbc-md5", encryptionType1.getName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EncryptionType encryptionType0 = EncryptionType.DES_CBC_MD5;
      byte[] byteArray0 = new byte[2];
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, byteArray0);
      EncryptionType encryptionType1 = EncryptionType.RC4_MD4;
      encryptionKey0.setKeyType(encryptionType1);
      EncryptionType encryptionType2 = encryptionKey0.getKeyType();
      assertNotSame(encryptionType2, encryptionType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncryptionKey encryptionKey0 = new EncryptionKey();
      // Undeclared exception!
      try { 
        encryptionKey0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.EncryptionKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EncryptionKey encryptionKey0 = new EncryptionKey();
      // Undeclared exception!
      try { 
        encryptionKey0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.EncryptionKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EncryptionKey encryptionKey0 = new EncryptionKey();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(587);
      // Undeclared exception!
      try { 
        encryptionKey0.encode(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.EncryptionKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EncryptionKey encryptionKey0 = new EncryptionKey();
      // Undeclared exception!
      try { 
        encryptionKey0.computeLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.EncryptionKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EncryptionKey encryptionKey0 = new EncryptionKey();
      try { 
        encryptionKey0.encode((ByteBuffer) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_148 Cannot put a PDU in a null buffer !
         //
         verifyException("org.apache.directory.shared.kerberos.components.EncryptionKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EncryptionType encryptionType0 = EncryptionType.RESERVED6;
      byte[] byteArray0 = new byte[0];
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, byteArray0, 320);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(270);
      encryptionKey0.encode(byteBuffer0);
      assertEquals("java.nio.DirectByteBuffer[pos=11 lim=270 cap=270]", byteBuffer0.toString());
      assertEquals(320, encryptionKey0.getKeyVersion());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EncryptionKey encryptionKey0 = new EncryptionKey();
      EncryptionType encryptionType0 = EncryptionType.SHA1WITHRSAENCRYPTION_CMSOID;
      encryptionKey0.setKeyType(encryptionType0);
      int int0 = encryptionKey0.computeLength();
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EncryptionKey encryptionKey0 = new EncryptionKey();
      EncryptionKey encryptionKey1 = new EncryptionKey();
      boolean boolean0 = encryptionKey0.equals(encryptionKey1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EncryptionKey encryptionKey0 = new EncryptionKey();
      EncryptionType encryptionType0 = EncryptionType.MD5WITHRSAENCRYPTION_CMSOID;
      byte[] byteArray0 = new byte[5];
      EncryptionKey encryptionKey1 = new EncryptionKey(encryptionType0, byteArray0, 583);
      encryptionKey0.setKeyType(encryptionType0);
      boolean boolean0 = encryptionKey1.equals(encryptionKey0);
      assertEquals(583, encryptionKey1.getKeyVersion());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EncryptionKey encryptionKey0 = new EncryptionKey();
      EncryptionType encryptionType0 = EncryptionType.MD5WITHRSAENCRYPTION_CMSOID;
      byte[] byteArray0 = new byte[5];
      EncryptionKey encryptionKey1 = new EncryptionKey(encryptionType0, byteArray0, 583);
      boolean boolean0 = encryptionKey1.equals(encryptionKey0);
      assertEquals(583, encryptionKey1.getKeyVersion());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EncryptionKey encryptionKey0 = new EncryptionKey();
      boolean boolean0 = encryptionKey0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EncryptionKey encryptionKey0 = new EncryptionKey();
      boolean boolean0 = encryptionKey0.equals(encryptionKey0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EncryptionType encryptionType0 = EncryptionType.DES_CBC_MD5;
      byte[] byteArray0 = new byte[2];
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, byteArray0);
      Object object0 = new Object();
      boolean boolean0 = encryptionKey0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EncryptionType encryptionType0 = EncryptionType.DES_CBC_MD5;
      byte[] byteArray0 = new byte[2];
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, byteArray0);
      encryptionKey0.destroy();
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EncryptionKey encryptionKey0 = new EncryptionKey();
      encryptionKey0.destroy();
      assertNull(encryptionKey0.getKeyType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EncryptionType encryptionType0 = EncryptionType.NULL;
      byte[] byteArray0 = new byte[0];
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, byteArray0);
      String string0 = encryptionKey0.toString();
      assertEquals("null (0) (0)", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EncryptionKey encryptionKey0 = new EncryptionKey();
      int int0 = encryptionKey0.getKeyVersion();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EncryptionType encryptionType0 = EncryptionType.DES_CBC_MD5;
      byte[] byteArray0 = new byte[2];
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, byteArray0);
      encryptionKey0.hashCode();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EncryptionKey encryptionKey0 = new EncryptionKey();
      byte[] byteArray0 = new byte[4];
      encryptionKey0.setKeyValue(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EncryptionType encryptionType0 = EncryptionType.NULL;
      byte[] byteArray0 = new byte[0];
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, byteArray0);
      EncryptionType encryptionType1 = encryptionKey0.getKeyType();
      assertSame(encryptionType0, encryptionType1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EncryptionType encryptionType0 = EncryptionType.RESERVED6;
      byte[] byteArray0 = new byte[0];
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, byteArray0, 320);
      encryptionKey0.getKeyValue();
      assertEquals(320, encryptionKey0.getKeyVersion());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      EncryptionType encryptionType0 = EncryptionType.SUBKEY_KEYMATERIAL;
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, byteArray0, 1860);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1860);
      ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
      // Undeclared exception!
      try { 
        encryptionKey0.encode(byteBuffer1);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapByteBufferR", e);
      }
  }
}
