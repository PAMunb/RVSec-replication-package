/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:34:27 GMT 2022
 */

package org.apache.directory.shared.kerberos.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import org.apache.directory.shared.kerberos.codec.types.EncryptionType;
import org.apache.directory.shared.kerberos.components.ETypeInfo2;
import org.apache.directory.shared.kerberos.components.ETypeInfo2Entry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ETypeInfo2_ESTest extends ETypeInfo2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2();
      EncryptionType encryptionType0 = EncryptionType.RC4_MD4;
      ETypeInfo2Entry eTypeInfo2Entry0 = new ETypeInfo2Entry(encryptionType0);
      eTypeInfo2_0.addETypeInfo2Entry(eTypeInfo2Entry0);
      ETypeInfo2 eTypeInfo2_1 = new ETypeInfo2();
      boolean boolean0 = eTypeInfo2_0.equals(eTypeInfo2_1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2();
      EncryptionType encryptionType0 = EncryptionType.RC4_MD4;
      ETypeInfo2Entry eTypeInfo2Entry0 = new ETypeInfo2Entry(encryptionType0);
      eTypeInfo2_0.addETypeInfo2Entry(eTypeInfo2Entry0);
      eTypeInfo2_0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ETypeInfo2Entry[] eTypeInfo2EntryArray0 = new ETypeInfo2Entry[3];
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2(eTypeInfo2EntryArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      try { 
        eTypeInfo2_0.encode(byteBuffer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_138 The PDU buffer size is too small !
         //
         verifyException("org.apache.directory.shared.kerberos.components.ETypeInfo2", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2();
      EncryptionType encryptionType0 = EncryptionType.RSAES_OAEP_ENV_OID;
      ETypeInfo2Entry eTypeInfo2Entry0 = new ETypeInfo2Entry(encryptionType0);
      eTypeInfo2_0.addETypeInfo2Entry(eTypeInfo2Entry0);
      String string0 = eTypeInfo2_0.toString();
      assertEquals("ETYPE-INFO2-ENTRY : {\n    etype: rsaES-OAEP-ENV-OID (14)\n}\n", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2();
      EncryptionType encryptionType0 = EncryptionType.RC4_MD4;
      ETypeInfo2Entry eTypeInfo2Entry0 = new ETypeInfo2Entry(encryptionType0);
      eTypeInfo2_0.addETypeInfo2Entry(eTypeInfo2Entry0);
      ETypeInfo2Entry[] eTypeInfo2EntryArray0 = eTypeInfo2_0.getETypeInfo2Entries();
      assertEquals(1, eTypeInfo2EntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ETypeInfo2Entry[] eTypeInfo2EntryArray0 = new ETypeInfo2Entry[1];
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2(eTypeInfo2EntryArray0);
      // Undeclared exception!
      try { 
        eTypeInfo2_0.equals(eTypeInfo2_0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.ETypeInfo2", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1974);
      ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
      // Undeclared exception!
      try { 
        eTypeInfo2_0.encode(byteBuffer1);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.DirectByteBufferR", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2();
      eTypeInfo2_0.addETypeInfo2Entry((ETypeInfo2Entry) null);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1495);
      // Undeclared exception!
      try { 
        eTypeInfo2_0.encode(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.ETypeInfo2", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ETypeInfo2Entry[] eTypeInfo2EntryArray0 = new ETypeInfo2Entry[1];
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2(eTypeInfo2EntryArray0);
      // Undeclared exception!
      try { 
        eTypeInfo2_0.addETypeInfo2Entry((ETypeInfo2Entry) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ETypeInfo2Entry[] eTypeInfo2EntryArray0 = new ETypeInfo2Entry[2];
      ETypeInfo2Entry eTypeInfo2Entry0 = new ETypeInfo2Entry();
      eTypeInfo2EntryArray0[0] = eTypeInfo2Entry0;
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2(eTypeInfo2EntryArray0);
      // Undeclared exception!
      try { 
        eTypeInfo2_0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.ETypeInfo2", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2();
      String string0 = eTypeInfo2_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2();
      try { 
        eTypeInfo2_0.encode((ByteBuffer) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_148 Cannot put a PDU in a null buffer !
         //
         verifyException("org.apache.directory.shared.kerberos.components.ETypeInfo2", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1974);
      eTypeInfo2_0.encode(byteBuffer0);
      assertEquals(2, byteBuffer0.position());
      assertEquals(1972, byteBuffer0.remaining());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EncryptionType encryptionType0 = EncryptionType.RSAES_OAEP_ENV_OID;
      ETypeInfo2Entry eTypeInfo2Entry0 = new ETypeInfo2Entry(encryptionType0);
      ETypeInfo2Entry[] eTypeInfo2EntryArray0 = new ETypeInfo2Entry[2];
      eTypeInfo2EntryArray0[0] = eTypeInfo2Entry0;
      eTypeInfo2EntryArray0[1] = eTypeInfo2Entry0;
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2(eTypeInfo2EntryArray0);
      eTypeInfo2_0.computeLength();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(7);
      ByteBuffer byteBuffer1 = eTypeInfo2Entry0.encode(byteBuffer0);
      try { 
        eTypeInfo2_0.encode(byteBuffer1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_138 The PDU buffer size is too small !
         //
         verifyException("org.apache.directory.shared.kerberos.components.ETypeInfo2", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2();
      int int0 = eTypeInfo2_0.computeLength();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ETypeInfo2Entry[] eTypeInfo2EntryArray0 = new ETypeInfo2Entry[1];
      EncryptionType encryptionType0 = EncryptionType.RC4_MD4;
      ETypeInfo2Entry eTypeInfo2Entry0 = new ETypeInfo2Entry(encryptionType0);
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2();
      eTypeInfo2_0.addETypeInfo2Entry(eTypeInfo2Entry0);
      ETypeInfo2 eTypeInfo2_1 = new ETypeInfo2(eTypeInfo2EntryArray0);
      boolean boolean0 = eTypeInfo2_0.equals(eTypeInfo2_1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EncryptionType encryptionType0 = EncryptionType.RC4_MD4;
      ETypeInfo2Entry eTypeInfo2Entry0 = new ETypeInfo2Entry(encryptionType0);
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2();
      eTypeInfo2_0.addETypeInfo2Entry(eTypeInfo2Entry0);
      boolean boolean0 = eTypeInfo2_0.equals(eTypeInfo2_0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2();
      ETypeInfo2Entry[] eTypeInfo2EntryArray0 = new ETypeInfo2Entry[1];
      ETypeInfo2 eTypeInfo2_1 = new ETypeInfo2(eTypeInfo2EntryArray0);
      boolean boolean0 = eTypeInfo2_0.equals(eTypeInfo2_1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2();
      boolean boolean0 = eTypeInfo2_0.equals((ETypeInfo2) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ETypeInfo2Entry[] eTypeInfo2EntryArray0 = new ETypeInfo2Entry[13];
      EncryptionType encryptionType0 = EncryptionType.DES_CBC_MD5;
      ETypeInfo2Entry eTypeInfo2Entry0 = new ETypeInfo2Entry(encryptionType0);
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2(eTypeInfo2EntryArray0);
      boolean boolean0 = eTypeInfo2_0.contains(eTypeInfo2Entry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ETypeInfo2Entry[] eTypeInfo2EntryArray0 = new ETypeInfo2Entry[1];
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2(eTypeInfo2EntryArray0);
      boolean boolean0 = eTypeInfo2_0.contains((ETypeInfo2Entry) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2((ETypeInfo2Entry[]) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ETypeInfo2Entry[] eTypeInfo2EntryArray0 = new ETypeInfo2Entry[2];
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2(eTypeInfo2EntryArray0);
      // Undeclared exception!
      try { 
        eTypeInfo2_0.computeLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.ETypeInfo2", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2();
      ETypeInfo2Entry[] eTypeInfo2EntryArray0 = eTypeInfo2_0.getETypeInfo2Entries();
      assertEquals(0, eTypeInfo2EntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ETypeInfo2 eTypeInfo2_0 = new ETypeInfo2();
      EncryptionType encryptionType0 = EncryptionType.RESERVED4;
      ETypeInfo2Entry eTypeInfo2Entry0 = new ETypeInfo2Entry(encryptionType0);
      eTypeInfo2_0.addETypeInfo2Entry(eTypeInfo2Entry0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2906);
      eTypeInfo2_0.encode(byteBuffer0);
      assertEquals(2897, byteBuffer0.remaining());
      assertEquals("java.nio.HeapByteBuffer[pos=9 lim=2906 cap=2906]", byteBuffer0.toString());
  }
}
