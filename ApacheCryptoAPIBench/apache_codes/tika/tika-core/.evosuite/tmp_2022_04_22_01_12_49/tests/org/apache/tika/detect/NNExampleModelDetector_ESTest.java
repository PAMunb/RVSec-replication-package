/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:31:23 GMT 2022
 */

package org.apache.tika.detect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.Enumeration;
import org.apache.tika.detect.NNExampleModelDetector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NNExampleModelDetector_ESTest extends NNExampleModelDetector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NNExampleModelDetector nNExampleModelDetector0 = new NNExampleModelDetector();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        nNExampleModelDetector0.loadDefaultModels((InputStream) pipedInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to read the default media type registry
         //
         verifyException("org.apache.tika.detect.NNExampleModelDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      NNExampleModelDetector nNExampleModelDetector0 = new NNExampleModelDetector();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)56;
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
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("w#Wk|,!b");
      Path path0 = mockFile0.toPath();
      NNExampleModelDetector nNExampleModelDetector0 = null;
      try {
        nNExampleModelDetector0 = new NNExampleModelDetector(path0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to read the default media type registry
         //
         verifyException("org.apache.tika.detect.TrainedModelDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Unable to read the default media type registry");
      NNExampleModelDetector nNExampleModelDetector0 = null;
      try {
        nNExampleModelDetector0 = new NNExampleModelDetector(mockFile0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to read the default media type registry
         //
         verifyException("org.apache.tika.detect.TrainedModelDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      NNExampleModelDetector nNExampleModelDetector0 = new NNExampleModelDetector();
      Enumeration<ByteArrayInputStream> enumeration0 = (Enumeration<ByteArrayInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      nNExampleModelDetector0.loadDefaultModels((InputStream) sequenceInputStream0);
      assertEquals(Integer.MAX_VALUE, nNExampleModelDetector0.getMinLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NNExampleModelDetector nNExampleModelDetector0 = new NNExampleModelDetector();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)51);
      // Undeclared exception!
      try { 
        nNExampleModelDetector0.loadDefaultModels((InputStream) pushbackInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse the model configuration
         //
         verifyException("org.apache.tika.detect.NNExampleModelDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)35;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      NNExampleModelDetector nNExampleModelDetector0 = new NNExampleModelDetector();
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
  public void test10()  throws Throwable  {
      NNExampleModelDetector nNExampleModelDetector0 = new NNExampleModelDetector();
      nNExampleModelDetector0.loadDefaultModels((ClassLoader) null);
      assertEquals(Integer.MAX_VALUE, nNExampleModelDetector0.getMinLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("#\uFFFD \uFFFD\u0000\u0000\uFFFD3\uFFFD");
      NNExampleModelDetector nNExampleModelDetector0 = null;
      try {
        nNExampleModelDetector0 = new NNExampleModelDetector(mockFile0);
        fail("Expecting exception: InvalidPathException");
      
      } catch(InvalidPathException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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