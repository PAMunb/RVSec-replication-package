/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:38:57 GMT 2022
 */

package org.apache.directory.server.kerberos.shared.crypto.checksum;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.server.kerberos.shared.crypto.checksum.RsaMd5Checksum;
import org.apache.directory.server.kerberos.shared.crypto.encryption.KeyUsage;
import org.apache.directory.shared.kerberos.crypto.checksum.ChecksumType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RsaMd5Checksum_ESTest extends RsaMd5Checksum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RsaMd5Checksum rsaMd5Checksum0 = new RsaMd5Checksum();
      // Undeclared exception!
      try { 
        rsaMd5Checksum0.calculateChecksum((byte[]) null, (byte[]) null, (KeyUsage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RsaMd5Checksum rsaMd5Checksum0 = new RsaMd5Checksum();
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = rsaMd5Checksum0.calculateChecksum(byteArray0, byteArray0, (KeyUsage) null);
      byte[] byteArray2 = rsaMd5Checksum0.calculateChecksum(byteArray0, byteArray1, (KeyUsage) null);
      assertNotSame(byteArray0, byteArray2);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RsaMd5Checksum rsaMd5Checksum0 = new RsaMd5Checksum();
      ChecksumType checksumType0 = rsaMd5Checksum0.checksumType();
      assertEquals(ChecksumType.RSA_MD5, checksumType0);
  }
}
