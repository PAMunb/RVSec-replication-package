/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:27:38 GMT 2022
 */

package org.apache.tika.detect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.util.List;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.detect.CompositeDetector;
import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.DefaultProbDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.mime.MimeTypes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CompositeDetector_ESTest extends CompositeDetector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ServiceLoader serviceLoader0 = new ServiceLoader();
      Class<Detector> class0 = Detector.class;
      List<Detector> list0 = serviceLoader0.loadDynamicServiceProviders(class0);
      CompositeDetector compositeDetector0 = new CompositeDetector(list0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CompositeDetector compositeDetector0 = new CompositeDetector((MediaTypeRegistry) null, (List<Detector>) null);
      // Undeclared exception!
      try { 
        compositeDetector0.getDetectors();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      Metadata metadata0 = new Metadata();
      MimeTypes mimeTypes0 = new MimeTypes();
      DefaultDetector defaultDetector0 = new DefaultDetector(mimeTypes0);
      try { 
        defaultDetector0.detect(dataInputStream0, metadata0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // mark/reset not supported
         //
         verifyException("java.io.InputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CompositeDetector compositeDetector0 = null;
      try {
        compositeDetector0 = new CompositeDetector((Detector[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      DefaultProbDetector defaultProbDetector0 = new DefaultProbDetector(mimeTypes0);
      List<Detector> list0 = defaultProbDetector0.getDetectors();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      DefaultProbDetector defaultProbDetector0 = new DefaultProbDetector(mimeTypes0);
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)34;
      byteArray0[2] = (byte) (-49);
      byteArray0[3] = (byte)34;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.read();
      Metadata metadata0 = new Metadata();
      MediaType mediaType0 = defaultProbDetector0.detect(byteArrayInputStream0, metadata0);
      assertEquals("text/plain", mediaType0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      MimeTypes mimeTypes0 = new MimeTypes();
      DefaultProbDetector defaultProbDetector0 = new DefaultProbDetector(mimeTypes0);
      MediaType mediaType0 = defaultProbDetector0.detect((InputStream) null, metadata0);
      assertFalse(mediaType0.hasParameters());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Detector[] detectorArray0 = new Detector[2];
      CompositeDetector compositeDetector0 = new CompositeDetector(detectorArray0);
      Metadata metadata0 = new Metadata();
      // Undeclared exception!
      try { 
        compositeDetector0.detect((InputStream) null, metadata0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.detect.CompositeDetector", e);
      }
  }
}