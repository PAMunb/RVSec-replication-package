/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 15:46:50 GMT 2022
 */

package org.apache.tika.extractor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.PipedInputStream;
import org.apache.tika.extractor.ParsingEmbeddedDocumentExtractor;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xml.sax.ContentHandler;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.helpers.XMLFilterImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ParsingEmbeddedDocumentExtractor_ESTest extends ParsingEmbeddedDocumentExtractor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParsingEmbeddedDocumentExtractor parsingEmbeddedDocumentExtractor0 = new ParsingEmbeddedDocumentExtractor((ParseContext) null);
      Metadata metadata0 = new Metadata();
      // Undeclared exception!
      try { 
        parsingEmbeddedDocumentExtractor0.shouldParseEmbedded(metadata0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.extractor.ParsingEmbeddedDocumentExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParseContext parseContext0 = new ParseContext();
      ParsingEmbeddedDocumentExtractor parsingEmbeddedDocumentExtractor0 = new ParsingEmbeddedDocumentExtractor(parseContext0);
      Metadata metadata0 = new Metadata();
      // Undeclared exception!
      try { 
        parsingEmbeddedDocumentExtractor0.parseEmbedded((InputStream) null, (ContentHandler) null, metadata0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.extractor.ParsingEmbeddedDocumentExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParseContext parseContext0 = new ParseContext();
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ParsingEmbeddedDocumentExtractor parsingEmbeddedDocumentExtractor0 = new ParsingEmbeddedDocumentExtractor(parseContext0);
      byte[] byteArray0 = new byte[0];
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0);
      Metadata metadata0 = new Metadata();
      tikaInputStream0.setOpenContainer(defaultHandler2_0);
      parsingEmbeddedDocumentExtractor0.parseEmbedded(tikaInputStream0, defaultHandler2_0, metadata0, false);
      assertFalse(tikaInputStream0.hasFile());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ParseContext parseContext0 = new ParseContext();
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ParsingEmbeddedDocumentExtractor parsingEmbeddedDocumentExtractor0 = new ParsingEmbeddedDocumentExtractor(parseContext0);
      byte[] byteArray0 = new byte[0];
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0);
      Metadata metadata0 = new Metadata();
      parsingEmbeddedDocumentExtractor0.parseEmbedded(tikaInputStream0, defaultHandler2_0, metadata0, false);
      assertEquals(0L, tikaInputStream0.getPosition());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ParseContext parseContext0 = new ParseContext();
      ParsingEmbeddedDocumentExtractor parsingEmbeddedDocumentExtractor0 = new ParsingEmbeddedDocumentExtractor(parseContext0);
      Metadata metadata0 = new Metadata();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      parsingEmbeddedDocumentExtractor0.parseEmbedded(pipedInputStream0, xMLFilterImpl0, metadata0, true);
      assertEquals(0, metadata0.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ParseContext parseContext0 = new ParseContext();
      Metadata metadata0 = new Metadata();
      metadata0.add("resourceName", "tiff:SamplesPerPixel");
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      ParsingEmbeddedDocumentExtractor parsingEmbeddedDocumentExtractor0 = new ParsingEmbeddedDocumentExtractor(parseContext0);
      // Undeclared exception!
      try { 
        parsingEmbeddedDocumentExtractor0.parseEmbedded((InputStream) null, xMLFilterImpl0, metadata0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.io.ProxyInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ParseContext parseContext0 = new ParseContext();
      Metadata metadata0 = new Metadata();
      metadata0.add("resourceName", "tiff:SamplesPerPixel");
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      ParsingEmbeddedDocumentExtractor parsingEmbeddedDocumentExtractor0 = new ParsingEmbeddedDocumentExtractor(parseContext0);
      // Undeclared exception!
      try { 
        parsingEmbeddedDocumentExtractor0.parseEmbedded((InputStream) null, xMLFilterImpl0, metadata0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.io.ProxyInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ParseContext parseContext0 = new ParseContext();
      Metadata metadata0 = new Metadata();
      ParsingEmbeddedDocumentExtractor parsingEmbeddedDocumentExtractor0 = new ParsingEmbeddedDocumentExtractor(parseContext0);
      boolean boolean0 = parsingEmbeddedDocumentExtractor0.shouldParseEmbedded(metadata0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ParseContext parseContext0 = new ParseContext();
      ParsingEmbeddedDocumentExtractor parsingEmbeddedDocumentExtractor0 = new ParsingEmbeddedDocumentExtractor(parseContext0);
      Metadata metadata0 = new Metadata();
      metadata0.add("resourceName", "");
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      // Undeclared exception!
      try { 
        parsingEmbeddedDocumentExtractor0.parseEmbedded((InputStream) null, xMLFilterImpl0, metadata0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.io.ProxyInputStream", e);
      }
  }
}