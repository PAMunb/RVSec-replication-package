/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:31:28 GMT 2022
 */

package org.apache.tika.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.Map;
import org.apache.tika.config.LoadErrorHandler;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.detect.DefaultEncodingDetector;
import org.apache.tika.detect.EncodingDetector;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.parser.DefaultParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultParser_ESTest extends DefaultParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MediaTypeRegistry mediaTypeRegistry0 = new MediaTypeRegistry();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ServiceLoader serviceLoader0 = new ServiceLoader(classLoader0);
      DefaultParser defaultParser0 = new DefaultParser(mediaTypeRegistry0, serviceLoader0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MediaTypeRegistry mediaTypeRegistry0 = new MediaTypeRegistry();
      DefaultParser defaultParser0 = new DefaultParser(mediaTypeRegistry0);
      ParseContext parseContext0 = new ParseContext();
      Map<MediaType, Parser> map0 = defaultParser0.getParsers(parseContext0);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser((MediaTypeRegistry) null);
      ParseContext parseContext0 = new ParseContext();
      // Undeclared exception!
      try { 
        defaultParser0.getParsers(parseContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.parser.CompositeParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MediaTypeRegistry mediaTypeRegistry0 = new MediaTypeRegistry();
      DefaultEncodingDetector defaultEncodingDetector0 = new DefaultEncodingDetector();
      DefaultParser defaultParser0 = null;
      try {
        defaultParser0 = new DefaultParser(mediaTypeRegistry0, (ServiceLoader) null, defaultEncodingDetector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.parser.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MediaTypeRegistry mediaTypeRegistry0 = new MediaTypeRegistry();
      DefaultParser defaultParser0 = null;
      try {
        defaultParser0 = new DefaultParser(mediaTypeRegistry0, (ServiceLoader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.detect.DefaultEncodingDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MediaTypeRegistry mediaTypeRegistry0 = new MediaTypeRegistry();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      LoadErrorHandler loadErrorHandler0 = mock(LoadErrorHandler.class, new ViolatedAssumptionAnswer());
      ServiceLoader serviceLoader0 = new ServiceLoader(classLoader0, loadErrorHandler0, false);
      DefaultParser defaultParser0 = new DefaultParser(mediaTypeRegistry0, serviceLoader0);
      List<Parser> list0 = defaultParser0.getAllComponentParsers();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MediaTypeRegistry mediaTypeRegistry0 = new MediaTypeRegistry();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      LoadErrorHandler loadErrorHandler0 = mock(LoadErrorHandler.class, new ViolatedAssumptionAnswer());
      ServiceLoader serviceLoader0 = new ServiceLoader(classLoader0, loadErrorHandler0, false);
      DefaultParser defaultParser0 = new DefaultParser(mediaTypeRegistry0, serviceLoader0);
      ParseContext parseContext0 = new ParseContext();
      Map<MediaType, Parser> map0 = defaultParser0.getParsers(parseContext0);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MediaTypeRegistry mediaTypeRegistry0 = new MediaTypeRegistry();
      ServiceLoader serviceLoader0 = new ServiceLoader();
      DefaultParser defaultParser0 = new DefaultParser(mediaTypeRegistry0, serviceLoader0, (EncodingDetector) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MediaTypeRegistry mediaTypeRegistry0 = new MediaTypeRegistry();
      DefaultParser defaultParser0 = new DefaultParser(mediaTypeRegistry0);
      List<Parser> list0 = defaultParser0.getAllComponentParsers();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MediaTypeRegistry mediaTypeRegistry0 = new MediaTypeRegistry();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      DefaultParser defaultParser0 = new DefaultParser(mediaTypeRegistry0, classLoader0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser((ClassLoader) null);
  }
}