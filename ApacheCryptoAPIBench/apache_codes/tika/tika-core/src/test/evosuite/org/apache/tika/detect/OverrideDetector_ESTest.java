/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 13:51:30 GMT 2022
 */

package org.apache.tika.detect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.PipedInputStream;
import org.apache.tika.detect.OverrideDetector;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OverrideDetector_ESTest extends OverrideDetector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OverrideDetector overrideDetector0 = new OverrideDetector();
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        overrideDetector0.detect(byteArrayInputStream0, (Metadata) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.detect.OverrideDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OverrideDetector overrideDetector0 = new OverrideDetector();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Metadata metadata0 = new Metadata();
      MediaType mediaType0 = overrideDetector0.detect(pipedInputStream0, metadata0);
      assertFalse(mediaType0.hasParameters());
  }
}
