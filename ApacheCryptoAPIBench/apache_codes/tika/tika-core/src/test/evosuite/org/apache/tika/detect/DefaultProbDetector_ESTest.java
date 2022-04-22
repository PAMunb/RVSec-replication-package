/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:39:44 GMT 2022
 */

package org.apache.tika.detect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URL;
import java.util.Enumeration;
import java.util.List;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.detect.DefaultProbDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.mime.MimeTypes;
import org.apache.tika.mime.ProbabilisticMimeDetectionSelector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultProbDetector_ESTest extends DefaultProbDetector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ProbabilisticMimeDetectionSelector probabilisticMimeDetectionSelector0 = mock(ProbabilisticMimeDetectionSelector.class, new ViolatedAssumptionAnswer());
      doReturn((MediaTypeRegistry) null).when(probabilisticMimeDetectionSelector0).getMediaTypeRegistry();
      ServiceLoader serviceLoader0 = mock(ServiceLoader.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(serviceLoader0).loadStaticServiceProviders(any(java.lang.Class.class));
      DefaultProbDetector defaultProbDetector0 = null;
      try {
        defaultProbDetector0 = new DefaultProbDetector(probabilisticMimeDetectionSelector0, serviceLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MediaTypeRegistry mediaTypeRegistry0 = mock(MediaTypeRegistry.class, new ViolatedAssumptionAnswer());
      ProbabilisticMimeDetectionSelector probabilisticMimeDetectionSelector0 = mock(ProbabilisticMimeDetectionSelector.class, new ViolatedAssumptionAnswer());
      doReturn(mediaTypeRegistry0).when(probabilisticMimeDetectionSelector0).getMediaTypeRegistry();
      ClassLoader classLoader0 = mock(ClassLoader.class, new ViolatedAssumptionAnswer());
      doReturn((Enumeration) null).when(classLoader0).getResources(anyString());
      DefaultProbDetector defaultProbDetector0 = null;
      try {
        defaultProbDetector0 = new DefaultProbDetector(probabilisticMimeDetectionSelector0, classLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MediaTypeRegistry mediaTypeRegistry0 = mock(MediaTypeRegistry.class, new ViolatedAssumptionAnswer());
      ProbabilisticMimeDetectionSelector probabilisticMimeDetectionSelector0 = mock(ProbabilisticMimeDetectionSelector.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(probabilisticMimeDetectionSelector0).toString();
      doReturn(mediaTypeRegistry0).when(probabilisticMimeDetectionSelector0).getMediaTypeRegistry();
      Enumeration<URL> enumeration0 = (Enumeration<URL>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      ClassLoader classLoader0 = mock(ClassLoader.class, new ViolatedAssumptionAnswer());
      doReturn(enumeration0).when(classLoader0).getResources(anyString());
      DefaultProbDetector defaultProbDetector0 = new DefaultProbDetector(probabilisticMimeDetectionSelector0, classLoader0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      DefaultProbDetector defaultProbDetector0 = new DefaultProbDetector(mimeTypes0);
      List<Detector> list0 = defaultProbDetector0.getDetectors();
      assertFalse(list0.isEmpty());
  }
}
