/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:51:22 GMT 2022
 */

package org.apache.directory.server.kerberos.shared.crypto.encryption;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.server.kerberos.shared.crypto.encryption.Aes128CtsSha1Encryption;
import org.apache.directory.server.kerberos.shared.crypto.encryption.ArcFourHmacMd5Encryption;
import org.apache.directory.server.kerberos.shared.crypto.encryption.Des3CbcSha1KdEncryption;
import org.apache.directory.server.kerberos.shared.crypto.encryption.DesCbcCrcEncryption;
import org.apache.directory.server.kerberos.shared.crypto.encryption.DesCbcMd5Encryption;
import org.apache.directory.server.kerberos.shared.crypto.encryption.KeyUsage;
import org.apache.directory.server.kerberos.shared.crypto.encryption.NullEncryption;
import org.apache.directory.shared.kerberos.components.EncryptionKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EncryptionEngine_ESTest extends EncryptionEngine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      NullEncryption nullEncryption0 = new NullEncryption();
      byte[] byteArray1 = nullEncryption0.padString(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
      assertEquals(8, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Des3CbcSha1KdEncryption des3CbcSha1KdEncryption0 = new Des3CbcSha1KdEncryption();
      byte[] byteArray0 = new byte[7];
      DesCbcMd5Encryption desCbcMd5Encryption0 = new DesCbcMd5Encryption();
      byte[] byteArray1 = des3CbcSha1KdEncryption0.setParity(byteArray0);
      byte[] byteArray2 = desCbcMd5Encryption0.padString(byteArray1);
      assertSame(byteArray2, byteArray1);
      assertArrayEquals(new byte[] {(byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      NullEncryption nullEncryption0 = new NullEncryption();
      byte[] byteArray1 = nullEncryption0.deriveRandom((byte[]) null, byteArray0, 29, (byte)79);
      assertNotNull(byteArray1);
      assertEquals(9, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArcFourHmacMd5Encryption arcFourHmacMd5Encryption0 = new ArcFourHmacMd5Encryption();
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = arcFourHmacMd5Encryption0.deriveRandom(byteArray0, byteArray0, (byte)44, (byte)55);
      assertEquals(6, byteArray1.length);
      assertArrayEquals(new byte[] {(byte) (-34), (byte)24, (byte) (-119), (byte)65, (byte) (-93), (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DesCbcMd5Encryption desCbcMd5Encryption0 = new DesCbcMd5Encryption();
      desCbcMd5Encryption0.setBit(byteArray0, (byte)16, 16);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NullEncryption nullEncryption0 = new NullEncryption();
      byte[] byteArray0 = new byte[10];
      byte[] byteArray1 = nullEncryption0.removeTrailingBytes(byteArray0, 8, 2);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DesCbcMd5Encryption desCbcMd5Encryption0 = new DesCbcMd5Encryption();
      KeyUsage keyUsage0 = KeyUsage.TGS_REQ_PA_TGS_REQ_PADATA_AP_REQ_AUTHNT_CKSUM_TGS_SESS_KEY;
      byte[] byteArray0 = desCbcMd5Encryption0.getUsageKc(keyUsage0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)6, (byte) (-103)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NullEncryption nullEncryption0 = new NullEncryption();
      byte[] byteArray0 = nullEncryption0.getRandomBytes(1155);
      nullEncryption0.setBit(byteArray0, 1155, 1155);
      assertEquals(1155, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NullEncryption nullEncryption0 = new NullEncryption();
      byte[] byteArray0 = nullEncryption0.getRandomBytes((byte)0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ArcFourHmacMd5Encryption arcFourHmacMd5Encryption0 = new ArcFourHmacMd5Encryption();
      int int0 = arcFourHmacMd5Encryption0.getBit(byteArray0, (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NullEncryption nullEncryption0 = new NullEncryption();
      byte[] byteArray0 = new byte[9];
      byteArray0[7] = (byte) (-57);
      int int0 = nullEncryption0.getBit(byteArray0, (byte)57);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NullEncryption nullEncryption0 = new NullEncryption();
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = nullEncryption0.deriveRandom((byte[]) null, byteArray0, (byte)79, (byte)0);
      assertEquals(0, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Des3CbcSha1KdEncryption des3CbcSha1KdEncryption0 = new Des3CbcSha1KdEncryption();
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = des3CbcSha1KdEncryption0.concatenateBytes(byteArray0, byteArray0);
      assertEquals(14, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DesCbcMd5Encryption desCbcMd5Encryption0 = new DesCbcMd5Encryption();
      // Undeclared exception!
      try { 
        desCbcMd5Encryption0.setBit((byte[]) null, (-1380), (-1380));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      DesCbcCrcEncryption desCbcCrcEncryption0 = new DesCbcCrcEncryption();
      // Undeclared exception!
      try { 
        desCbcCrcEncryption0.setBit(byteArray0, (-143), 3027);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -17
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NullEncryption nullEncryption0 = new NullEncryption();
      // Undeclared exception!
      try { 
        nullEncryption0.removeTrailingBytes((byte[]) null, (-2404), 28);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      NullEncryption nullEncryption0 = new NullEncryption();
      // Undeclared exception!
      try { 
        nullEncryption0.removeTrailingBytes(byteArray0, 36, 36);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      NullEncryption nullEncryption0 = new NullEncryption();
      // Undeclared exception!
      try { 
        nullEncryption0.removeTrailingBytes(byteArray0, (-103), (-103));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NullEncryption nullEncryption0 = new NullEncryption();
      // Undeclared exception!
      try { 
        nullEncryption0.removeLeadingBytes((byte[]) null, (byte)0, (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      NullEncryption nullEncryption0 = new NullEncryption();
      // Undeclared exception!
      try { 
        nullEncryption0.removeLeadingBytes(byteArray0, 332, 332);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      NullEncryption nullEncryption0 = new NullEncryption();
      // Undeclared exception!
      try { 
        nullEncryption0.removeLeadingBytes(byteArray0, (byte) (-46), (byte) (-46));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -92
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DesCbcMd5Encryption desCbcMd5Encryption0 = new DesCbcMd5Encryption();
      // Undeclared exception!
      try { 
        desCbcMd5Encryption0.padString((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DesCbcCrcEncryption desCbcCrcEncryption0 = new DesCbcCrcEncryption();
      // Undeclared exception!
      try { 
        desCbcCrcEncryption0.getUsageKi((KeyUsage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NullEncryption nullEncryption0 = new NullEncryption();
      // Undeclared exception!
      try { 
        nullEncryption0.getUsageKe((KeyUsage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DesCbcCrcEncryption desCbcCrcEncryption0 = new DesCbcCrcEncryption();
      // Undeclared exception!
      try { 
        desCbcCrcEncryption0.getUsageKc((KeyUsage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NullEncryption nullEncryption0 = new NullEncryption();
      // Undeclared exception!
      try { 
        nullEncryption0.getRandomBytes((-3339));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DesCbcMd5Encryption desCbcMd5Encryption0 = new DesCbcMd5Encryption();
      // Undeclared exception!
      try { 
        desCbcMd5Encryption0.getBit((byte[]) null, 27);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      NullEncryption nullEncryption0 = new NullEncryption();
      // Undeclared exception!
      nullEncryption0.deriveRandom(byteArray0, byteArray0, (-45), (-45));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DesCbcMd5Encryption desCbcMd5Encryption0 = new DesCbcMd5Encryption();
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        desCbcMd5Encryption0.deriveRandom(byteArray0, byteArray0, 70, 70);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      NullEncryption nullEncryption0 = new NullEncryption();
      // Undeclared exception!
      try { 
        nullEncryption0.deriveRandom(byteArray0, byteArray0, 91, (-2301));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Des3CbcSha1KdEncryption des3CbcSha1KdEncryption0 = new Des3CbcSha1KdEncryption();
      byte[] byteArray1 = new byte[0];
      // Undeclared exception!
      try { 
        des3CbcSha1KdEncryption0.deriveRandom(byteArray1, byteArray0, 23, 23);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      NullEncryption nullEncryption0 = new NullEncryption();
      // Undeclared exception!
      try { 
        nullEncryption0.deriveRandom(byteArray0, byteArray0, 4, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      NullEncryption nullEncryption0 = new NullEncryption();
      // Undeclared exception!
      try { 
        nullEncryption0.deriveRandom(byteArray0, byteArray0, 0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DesCbcMd5Encryption desCbcMd5Encryption0 = new DesCbcMd5Encryption();
      // Undeclared exception!
      try { 
        desCbcMd5Encryption0.concatenateBytes((byte[]) null, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      NullEncryption nullEncryption0 = new NullEncryption();
      byte[] byteArray1 = nullEncryption0.removeTrailingBytes(byteArray0, (byte)0, (byte)0);
      assertNotSame(byteArray1, byteArray0);
      assertEquals(8, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      NullEncryption nullEncryption0 = new NullEncryption();
      byte[] byteArray1 = nullEncryption0.removeLeadingBytes(byteArray0, (byte)0, (byte)0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      NullEncryption nullEncryption0 = new NullEncryption();
      byte[] byteArray1 = nullEncryption0.removeLeadingBytes(byteArray0, (byte)0, 8);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Aes128CtsSha1Encryption aes128CtsSha1Encryption0 = new Aes128CtsSha1Encryption();
      KeyUsage keyUsage0 = KeyUsage.TGS_REQ_PA_TGS_REQ_PADATA_AP_REQ_AUTHNT_CKSUM_TGS_SESS_KEY;
      byte[] byteArray0 = aes128CtsSha1Encryption0.getUsageKe(keyUsage0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)6, (byte) (-86)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      DesCbcMd5Encryption desCbcMd5Encryption0 = new DesCbcMd5Encryption();
      EncryptionKey encryptionKey0 = new EncryptionKey();
      KeyUsage keyUsage0 = KeyUsage.KRB_PRIV_ENC_PART_CHOSEN_KEY;
      // Undeclared exception!
      try { 
        desCbcMd5Encryption0.getEncryptedData(encryptionKey0, byteArray0, keyUsage0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing argument
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DesCbcCrcEncryption desCbcCrcEncryption0 = new DesCbcCrcEncryption();
      KeyUsage keyUsage0 = KeyUsage.AS_REP_ENC_PART_WITH_CKEY;
      byte[] byteArray0 = desCbcCrcEncryption0.getUsageKi(keyUsage0);
      // Undeclared exception!
      try { 
        desCbcCrcEncryption0.getBit(byteArray0, 765);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 95
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DesCbcMd5Encryption desCbcMd5Encryption0 = new DesCbcMd5Encryption();
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = desCbcMd5Encryption0.padString(byteArray0);
      byte[] byteArray2 = desCbcMd5Encryption0.concatenateBytes(byteArray1, byteArray1);
      assertEquals(0, byteArray2.length);
      assertNotSame(byteArray2, byteArray1);
  }
}