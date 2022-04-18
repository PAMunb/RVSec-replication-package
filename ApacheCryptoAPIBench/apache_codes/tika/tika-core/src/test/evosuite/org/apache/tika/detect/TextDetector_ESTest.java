/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 13:47:50 GMT 2022
 */

package org.apache.tika.detect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.detect.TextDetector;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TextDetector_ESTest extends TextDetector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TextDetector textDetector0 = new TextDetector((-313));
      MockFile mockFile0 = new MockFile("C.J");
      File file0 = MockFile.createTempFile("C.J", "C.J", (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      Metadata metadata0 = new Metadata();
      try { 
        textDetector0.detect(mockFileInputStream0, metadata0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // mark/reset not supported
         //
         verifyException("java.io.InputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TextDetector textDetector0 = new TextDetector();
      Metadata metadata0 = new Metadata();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        textDetector0.detect(dataInputStream0, metadata0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TextDetector textDetector0 = new TextDetector((-2296));
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      Metadata metadata0 = new Metadata();
      // Undeclared exception!
      try { 
        textDetector0.detect(bufferedInputStream0, metadata0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TextDetector textDetector0 = new TextDetector(1);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)47;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      Metadata metadata0 = new Metadata();
      MediaType mediaType0 = textDetector0.detect(dataInputStream0, metadata0);
      assertEquals("text", mediaType0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TextDetector textDetector0 = new TextDetector();
      byte[] byteArray0 = new byte[4];
      Metadata metadata0 = new Metadata();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte)107);
      MediaType mediaType0 = textDetector0.detect(byteArrayInputStream0, metadata0);
      assertEquals("application", mediaType0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TextDetector textDetector0 = new TextDetector();
      Metadata metadata0 = new Metadata();
      MediaType mediaType0 = textDetector0.detect((InputStream) null, metadata0);
      assertFalse(mediaType0.hasParameters());
  }
}
