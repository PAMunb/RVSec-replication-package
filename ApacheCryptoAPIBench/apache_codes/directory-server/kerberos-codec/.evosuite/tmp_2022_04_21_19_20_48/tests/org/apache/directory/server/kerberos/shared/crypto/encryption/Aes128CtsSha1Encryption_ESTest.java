/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:35:17 GMT 2022
 */

package org.apache.directory.server.kerberos.shared.crypto.encryption;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.server.kerberos.shared.crypto.encryption.Aes128CtsSha1Encryption;
import org.apache.directory.shared.kerberos.codec.types.EncryptionType;
import org.apache.directory.shared.kerberos.crypto.checksum.ChecksumType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Aes128CtsSha1Encryption_ESTest extends Aes128CtsSha1Encryption_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Aes128CtsSha1Encryption aes128CtsSha1Encryption0 = new Aes128CtsSha1Encryption();
      int int0 = aes128CtsSha1Encryption0.getKeyLength();
      assertEquals(128, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Aes128CtsSha1Encryption aes128CtsSha1Encryption0 = new Aes128CtsSha1Encryption();
      EncryptionType encryptionType0 = aes128CtsSha1Encryption0.getEncryptionType();
      assertEquals("aes128-cts-hmac-sha1-96", encryptionType0.getName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Aes128CtsSha1Encryption aes128CtsSha1Encryption0 = new Aes128CtsSha1Encryption();
      ChecksumType checksumType0 = aes128CtsSha1Encryption0.checksumType();
      assertEquals(15, checksumType0.getValue());
  }
}
