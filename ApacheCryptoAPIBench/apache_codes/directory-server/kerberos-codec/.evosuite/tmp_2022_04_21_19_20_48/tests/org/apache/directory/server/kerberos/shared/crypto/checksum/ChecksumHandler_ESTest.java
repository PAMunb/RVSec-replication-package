/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:50:59 GMT 2022
 */

package org.apache.directory.server.kerberos.shared.crypto.checksum;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.server.kerberos.shared.crypto.checksum.ChecksumHandler;
import org.apache.directory.server.kerberos.shared.crypto.encryption.KeyUsage;
import org.apache.directory.shared.kerberos.components.Checksum;
import org.apache.directory.shared.kerberos.crypto.checksum.ChecksumType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ChecksumHandler_ESTest extends ChecksumHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChecksumHandler checksumHandler0 = new ChecksumHandler();
      byte[] byteArray0 = new byte[8];
      ChecksumType checksumType0 = ChecksumType.HMAC_SHA1_96_AES128;
      byte[] byteArray1 = new byte[1];
      // Undeclared exception!
      try { 
        checksumHandler0.calculateChecksum(checksumType0, byteArray1, byteArray0, (KeyUsage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ChecksumHandler checksumHandler0 = new ChecksumHandler();
      ChecksumType checksumType0 = ChecksumType.RSA_MD5;
      KeyUsage keyUsage0 = KeyUsage.TGS_REP_ENC_PART_TGS_AUTHNT_SUB_KEY;
      Checksum checksum0 = new Checksum(checksumType0, (byte[]) null);
      // Undeclared exception!
      try { 
        checksumHandler0.verifyChecksum(checksum0, (byte[]) null, (byte[]) null, keyUsage0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ChecksumHandler checksumHandler0 = new ChecksumHandler();
      ChecksumType checksumType0 = ChecksumType.HMAC_SHA1_96_AES128;
      KeyUsage keyUsage0 = KeyUsage.TGS_REQ_PA_TGS_REQ_PADATA_AP_REQ_AUTHNT_CKSUM_TGS_SESS_KEY;
      Checksum checksum0 = new Checksum(checksumType0, (byte[]) null);
      // Undeclared exception!
      try { 
        checksumHandler0.verifyChecksum(checksum0, (byte[]) null, (byte[]) null, keyUsage0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing argument
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ChecksumHandler checksumHandler0 = new ChecksumHandler();
      ChecksumType checksumType0 = ChecksumType.HMAC_SHA1_96_AES128;
      KeyUsage keyUsage0 = KeyUsage.AS_REP_ENC_PART_WITH_CKEY;
      // Undeclared exception!
      try { 
        checksumHandler0.calculateChecksum(checksumType0, (byte[]) null, (byte[]) null, keyUsage0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing argument
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ChecksumHandler checksumHandler0 = new ChecksumHandler();
      ChecksumType checksumType0 = ChecksumType.RSA_MD5;
      byte[] byteArray0 = new byte[1];
      KeyUsage keyUsage0 = KeyUsage.TGS_REP_ENC_PART_TGS_AUTHNT_SUB_KEY;
      Checksum checksum0 = checksumHandler0.calculateChecksum(checksumType0, byteArray0, byteArray0, keyUsage0);
      byte[] byteArray1 = new byte[7];
      try { 
        checksumHandler0.verifyChecksum(checksum0, byteArray1, byteArray0, keyUsage0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Message stream modified
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.checksum.ChecksumHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ChecksumHandler checksumHandler0 = new ChecksumHandler();
      Checksum checksum0 = new Checksum();
      KeyUsage keyUsage0 = KeyUsage.TGS_REQ_KDC_REQ_BODY_AUTHZ_DATA_ENC_WITH_AUTHNT_SUB_KEY;
      try { 
        checksumHandler0.verifyChecksum(checksum0, (byte[]) null, (byte[]) null, keyUsage0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // KDC has no support for checksum type
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.checksum.ChecksumHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ChecksumHandler checksumHandler0 = new ChecksumHandler();
      KeyUsage keyUsage0 = KeyUsage.KRB_PRIV_ENC_PART_CHOSEN_KEY;
      try { 
        checksumHandler0.verifyChecksum((Checksum) null, (byte[]) null, (byte[]) null, keyUsage0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Inappropriate type of checksum in message
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.checksum.ChecksumHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ChecksumHandler checksumHandler0 = new ChecksumHandler();
      ChecksumType checksumType0 = ChecksumType.RSA_MD5;
      byte[] byteArray0 = new byte[1];
      KeyUsage keyUsage0 = KeyUsage.TGS_REQ_PA_TGS_REQ_PADATA_AP_REQ_AUTHNT_CKSUM_TGS_SESS_KEY;
      Checksum checksum0 = checksumHandler0.calculateChecksum(checksumType0, byteArray0, byteArray0, keyUsage0);
      checksumHandler0.verifyChecksum(checksum0, byteArray0, byteArray0, keyUsage0);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ChecksumHandler checksumHandler0 = new ChecksumHandler();
      KeyUsage keyUsage0 = KeyUsage.AS_REP_ENC_PART_WITH_CKEY;
      ChecksumType checksumType0 = ChecksumType.RSA_MD4_DES_K;
      try { 
        checksumHandler0.calculateChecksum(checksumType0, (byte[]) null, (byte[]) null, keyUsage0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // KDC has no support for checksum type
         //
         verifyException("org.apache.directory.server.kerberos.shared.crypto.checksum.ChecksumHandler", e);
      }
  }
}
