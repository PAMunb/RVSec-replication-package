/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:21:09 GMT 2022
 */

package org.apache.tika.extractor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PushbackInputStream;
import org.apache.tika.extractor.EmbeddedDocumentUtil;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MimeTypes;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;
import org.xml.sax.SAXParseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EmbeddedDocumentUtil_ESTest extends EmbeddedDocumentUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<PushbackInputStream> class0 = PushbackInputStream.class;
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
      MockIOException mockIOException0 = new MockIOException("resourceName");
      // Undeclared exception!
      try { 
        EmbeddedDocumentUtil.recordEmbeddedStreamException(mockIOException0, (Metadata) null);
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
  public void test3()  throws Throwable  {
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
  public void test4()  throws Throwable  {
      ParseContext parseContext0 = new ParseContext();
      // Undeclared exception!
      EmbeddedDocumentUtil.getEmbeddedDocumentExtractor(parseContext0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<MimeTypes> class0 = MimeTypes.class;
      ParseContext parseContext0 = new ParseContext();
      Parser parser0 = EmbeddedDocumentUtil.tryToFindExistingLeafParser(class0, parseContext0);
      assertNull(parser0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Metadata metadata0 = new Metadata();
      MockIOException mockIOException0 = new MockIOException("subject");
      SAXParseException sAXParseException0 = new SAXParseException("subject", "format", "", 0, 0, mockIOException0);
      EmbeddedDocumentUtil.recordEmbeddedStreamException(sAXParseException0, metadata0);
      assertEquals(1, metadata0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockException mockException0 = new MockException();
      Metadata metadata0 = new Metadata();
      EmbeddedDocumentUtil.recordException(mockException0, metadata0);
      assertEquals(1, metadata0.size());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ParseContext parseContext0 = new ParseContext();
      EmbeddedDocumentUtil embeddedDocumentUtil0 = new EmbeddedDocumentUtil(parseContext0);
  }
}
