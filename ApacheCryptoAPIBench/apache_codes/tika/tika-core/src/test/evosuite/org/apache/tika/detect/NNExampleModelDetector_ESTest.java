/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 15:50:09 GMT 2022
 */

package org.apache.tika.detect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import org.apache.tika.detect.NNExampleModelDetector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NNExampleModelDetector_ESTest extends NNExampleModelDetector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NNExampleModelDetector nNExampleModelDetector0 = new NNExampleModelDetector();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = classLoader0.getParent();
      // Undeclared exception!
      try { 
        nNExampleModelDetector0.loadDefaultModels(classLoader1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // required resource org/apache/tika/detect/tika-example.nnmodel not found
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NNExampleModelDetector nNExampleModelDetector0 = new NNExampleModelDetector();
      // Undeclared exception!
      try { 
        nNExampleModelDetector0.loadDefaultModels((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)52;
      NNExampleModelDetector nNExampleModelDetector0 = new NNExampleModelDetector();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        nNExampleModelDetector0.loadDefaultModels((InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      NNExampleModelDetector nNExampleModelDetector0 = null;
      try {
        nNExampleModelDetector0 = new NNExampleModelDetector(path0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to read the default media type registry
         //
         verifyException("org.apache.tika.detect.NNExampleModelDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("4tD3*3u!RMX", "#\uFFFD\uFFFD\uFFFD\u0000\uFFFD\uFFFD\u0004\uFFFD");
      NNExampleModelDetector nNExampleModelDetector0 = null;
      try {
        nNExampleModelDetector0 = new NNExampleModelDetector(mockFile0);
        fail("Expecting exception: InvalidPathException");
      
      } catch(InvalidPathException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      NNExampleModelDetector nNExampleModelDetector0 = null;
      try {
        nNExampleModelDetector0 = new NNExampleModelDetector(mockFile0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to read the default media type registry
         //
         verifyException("org.apache.tika.detect.NNExampleModelDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NNExampleModelDetector nNExampleModelDetector0 = new NNExampleModelDetector();
      byte[] byteArray0 = new byte[10];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.read(byteArray0);
      nNExampleModelDetector0.loadDefaultModels((InputStream) byteArrayInputStream0);
      assertEquals(Integer.MAX_VALUE, nNExampleModelDetector0.getMinLength());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NNExampleModelDetector nNExampleModelDetector0 = new NNExampleModelDetector();
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        nNExampleModelDetector0.loadDefaultModels((InputStream) byteArrayInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse the model configuration
         //
         verifyException("org.apache.tika.detect.NNExampleModelDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NNExampleModelDetector nNExampleModelDetector0 = new NNExampleModelDetector();
      nNExampleModelDetector0.loadDefaultModels((ClassLoader) null);
      assertEquals(Integer.MAX_VALUE, nNExampleModelDetector0.getMinLength());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NNExampleModelDetector nNExampleModelDetector0 = null;
      try {
        nNExampleModelDetector0 = new NNExampleModelDetector((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.detect.TrainedModelDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NNExampleModelDetector nNExampleModelDetector0 = null;
      try {
        nNExampleModelDetector0 = new NNExampleModelDetector((Path) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }
}
