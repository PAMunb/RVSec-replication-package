/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:50:37 GMT 2022
 */

package org.apache.directory.shared.kerberos.messages;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import org.apache.directory.shared.kerberos.KerberosTime;
import org.apache.directory.shared.kerberos.codec.types.EncryptionType;
import org.apache.directory.shared.kerberos.components.EncryptionKey;
import org.apache.directory.shared.kerberos.messages.EncApRepPart;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EncApRepPart_ESTest extends EncApRepPart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      Integer integer0 = Integer.valueOf(0);
      encApRepPart0.setSeqNumber(integer0);
      int int0 = encApRepPart0.computeLength();
      assertEquals(33, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      EncryptionType encryptionType0 = EncryptionType.RC4_HMAC;
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, (byte[]) null);
      encApRepPart0.setSubkey(encryptionKey0);
      int int0 = encApRepPart0.computeLength();
      assertEquals(41, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      EncryptionType encryptionType0 = EncryptionType.RC4_HMAC;
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, (byte[]) null);
      encApRepPart0.setSubkey(encryptionKey0);
      EncryptionKey encryptionKey1 = encApRepPart0.getSubkey();
      assertEquals(0, encryptionKey1.getKeyVersion());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      byte[] byteArray0 = new byte[7];
      EncryptionType encryptionType0 = EncryptionType.RESERVED4;
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, byteArray0, (byte)54);
      encApRepPart0.setSubkey(encryptionKey0);
      EncryptionKey encryptionKey1 = encApRepPart0.getSubkey();
      assertSame(encryptionKey1, encryptionKey0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      EncryptionType encryptionType0 = EncryptionType.DSAWITHSHA1_CMSOID;
      byte[] byteArray0 = new byte[1];
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, byteArray0, (-1101));
      encApRepPart0.setSubkey(encryptionKey0);
      EncryptionKey encryptionKey1 = encApRepPart0.getSubkey();
      assertEquals(EncryptionType.DSAWITHSHA1_CMSOID, encryptionKey1.getKeyType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      Integer integer0 = new Integer(0);
      encApRepPart0.setSeqNumber(integer0);
      Integer integer1 = encApRepPart0.getSeqNumber();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      Integer integer0 = new Integer(199);
      encApRepPart0.setSeqNumber(integer0);
      Integer integer1 = encApRepPart0.getSeqNumber();
      assertEquals(199, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      Integer integer0 = new Integer((-2954));
      encApRepPart0.setSeqNumber(integer0);
      Integer integer1 = encApRepPart0.getSeqNumber();
      assertEquals((-2954), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      encApRepPart0.setCusec(171);
      int int0 = encApRepPart0.getCusec();
      assertEquals(171, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      encApRepPart0.setCusec((-96));
      int int0 = encApRepPart0.getCusec();
      assertEquals((-96), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      KerberosTime kerberosTime0 = new KerberosTime((-22L));
      encApRepPart0.setCTime(kerberosTime0);
      KerberosTime kerberosTime1 = encApRepPart0.getCTime();
      assertEquals(604800000, KerberosTime.WEEK);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      KerberosTime kerberosTime0 = KerberosTime.INFINITY;
      encApRepPart0.setCTime(kerberosTime0);
      KerberosTime kerberosTime1 = encApRepPart0.getCTime();
      assertEquals(86400000, KerberosTime.DAY);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      KerberosTime kerberosTime0 = new KerberosTime((-9223372036854775808L));
      encApRepPart0.setCTime(kerberosTime0);
      KerberosTime kerberosTime1 = encApRepPart0.getCTime();
      assertFalse(kerberosTime1.isZero());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      EncryptionKey encryptionKey0 = new EncryptionKey();
      encApRepPart0.setSubkey(encryptionKey0);
      // Undeclared exception!
      try { 
        encApRepPart0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.EncryptionKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      byte[] byteArray0 = new byte[5];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      try { 
        encApRepPart0.encode(byteBuffer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_138 The PDU buffer size is too small !
         //
         verifyException("org.apache.directory.shared.kerberos.messages.EncApRepPart", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      Integer integer0 = new Integer((-2954));
      encApRepPart0.setSeqNumber(integer0);
      String string0 = encApRepPart0.toString();
      assertEquals("EncApRepPart : \n    ctime : null\n    cusec : 0\n    seq-number : -2954\n", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      EncryptionType encryptionType0 = EncryptionType.RC4_HMAC_OLD_EXP;
      byte[] byteArray0 = new byte[5];
      EncryptionKey encryptionKey0 = new EncryptionKey(encryptionType0, byteArray0);
      encApRepPart0.setSubkey(encryptionKey0);
      String string0 = encApRepPart0.toString();
      assertEquals("EncApRepPart : \n    ctime : null\n    cusec : 0\n    subkey : rc4-hmac-old-exp (-135) (-135)\n", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      KerberosTime kerberosTime0 = KerberosTime.INFINITY;
      encApRepPart0.setSeqNumber((Integer) 60000);
      encApRepPart0.setCTime(kerberosTime0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(60000);
      encApRepPart0.encode(byteBuffer0);
      assertEquals(59960, byteBuffer0.remaining());
      assertEquals(40, byteBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      EncryptionKey encryptionKey0 = new EncryptionKey();
      encApRepPart0.setSubkey(encryptionKey0);
      KerberosTime kerberosTime0 = KerberosTime.INFINITY;
      encApRepPart0.setCTime(kerberosTime0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(86400000);
      // Undeclared exception!
      try { 
        encApRepPart0.encode(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.EncryptionKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      // Undeclared exception!
      try { 
        encApRepPart0.encode((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.messages.EncApRepPart", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      int int0 = encApRepPart0.getCusec();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      EncryptionKey encryptionKey0 = new EncryptionKey();
      encApRepPart0.setSubkey(encryptionKey0);
      // Undeclared exception!
      try { 
        encApRepPart0.computeLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.EncryptionKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      KerberosTime kerberosTime0 = KerberosTime.INFINITY;
      encApRepPart0.setCTime(kerberosTime0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(60000);
      encApRepPart0.encode(byteBuffer0);
      assertEquals(33, byteBuffer0.position());
      assertEquals(59967, byteBuffer0.remaining());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      Integer integer0 = encApRepPart0.getSeqNumber();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      EncryptionKey encryptionKey0 = encApRepPart0.getSubkey();
      assertNull(encryptionKey0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EncApRepPart encApRepPart0 = new EncApRepPart();
      KerberosTime kerberosTime0 = encApRepPart0.getCTime();
      assertNull(kerberosTime0);
  }
}
