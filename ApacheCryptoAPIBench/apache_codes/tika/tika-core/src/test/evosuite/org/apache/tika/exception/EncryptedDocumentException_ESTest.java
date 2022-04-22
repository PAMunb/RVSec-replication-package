/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:45:46 GMT 2022
 */

package org.apache.tika.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.tika.exception.EncryptedDocumentException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EncryptedDocumentException_ESTest extends EncryptedDocumentException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EncryptedDocumentException encryptedDocumentException0 = new EncryptedDocumentException("");
      EncryptedDocumentException encryptedDocumentException1 = new EncryptedDocumentException("", encryptedDocumentException0);
      assertFalse(encryptedDocumentException1.equals((Object)encryptedDocumentException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EncryptedDocumentException encryptedDocumentException0 = new EncryptedDocumentException();
      EncryptedDocumentException encryptedDocumentException1 = new EncryptedDocumentException(encryptedDocumentException0);
      assertFalse(encryptedDocumentException1.equals((Object)encryptedDocumentException0));
  }
}
