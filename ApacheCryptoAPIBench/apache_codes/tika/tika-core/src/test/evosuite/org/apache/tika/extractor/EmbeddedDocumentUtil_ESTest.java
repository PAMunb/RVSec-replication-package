/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 13:35:23 GMT 2022
 */

package org.apache.tika.extractor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.extractor.EmbeddedDocumentUtil;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmbeddedDocumentUtil_ESTest extends EmbeddedDocumentUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<TikaConfig> class0 = TikaConfig.class;
      // Undeclared exception!
      try { 
        EmbeddedDocumentUtil.tryToFindExistingLeafParser(class0, (ParseContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.extractor.EmbeddedDocumentUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      // Undeclared exception!
      try { 
        EmbeddedDocumentUtil.recordException(mockThrowable0, (Metadata) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.extractor.EmbeddedDocumentUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        EmbeddedDocumentUtil.recordEmbeddedStreamException((Throwable) null, (Metadata) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.extractor.EmbeddedDocumentUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        EmbeddedDocumentUtil.getEmbeddedDocumentExtractor((ParseContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.extractor.EmbeddedDocumentUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EmbeddedDocumentUtil embeddedDocumentUtil0 = null;
      try {
        embeddedDocumentUtil0 = new EmbeddedDocumentUtil((ParseContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.extractor.EmbeddedDocumentUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ParseContext parseContext0 = new ParseContext();
      // Undeclared exception!
      EmbeddedDocumentUtil.getEmbeddedDocumentExtractor(parseContext0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<TikaConfig> class0 = TikaConfig.class;
      ParseContext parseContext0 = new ParseContext();
      Parser parser0 = EmbeddedDocumentUtil.tryToFindExistingLeafParser(class0, parseContext0);
      assertNull(parser0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      Metadata metadata0 = new Metadata();
      EmbeddedDocumentUtil.recordEmbeddedStreamException(mockThrowable0, metadata0);
      assertNull(mockThrowable0.getMessage());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      Metadata metadata0 = new Metadata();
      EmbeddedDocumentUtil.recordException(mockThrowable0, metadata0);
      assertNull(mockThrowable0.getMessage());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ParseContext parseContext0 = new ParseContext();
      EmbeddedDocumentUtil embeddedDocumentUtil0 = new EmbeddedDocumentUtil(parseContext0);
  }
}
