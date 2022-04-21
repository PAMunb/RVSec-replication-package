/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 15:48:30 GMT 2022
 */

package org.apache.tika.sax;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.EmptyStackException;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.sax.SecureContentHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.junit.runner.RunWith;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.LocatorImpl;
import org.xml.sax.helpers.ParserAdapter;
import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.helpers.XMLReaderAdapter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SecureContentHandler_ESTest extends SecureContentHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultHandler defaultHandler0 = new DefaultHandler();
      byte[] byteArray0 = new byte[2];
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0);
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(defaultHandler0, tikaInputStream0);
      secureContentHandler0.endElement(" output characters", " output characters", ",:][8i|y");
      assertEquals(100L, secureContentHandler0.getMaximumCompressionRatio());
      assertEquals(1000000L, secureContentHandler0.getOutputThreshold());
      assertEquals(100, secureContentHandler0.getMaximumDepth());
      assertEquals(10, secureContentHandler0.getMaximumPackageEntryDepth());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      byte[] byteArray0 = new byte[0];
      Metadata metadata0 = new Metadata();
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0, metadata0);
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(xMLFilterImpl0, tikaInputStream0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      secureContentHandler0.startElement("language", "", "Z", attributes2Impl0);
      assertEquals(10, secureContentHandler0.getMaximumPackageEntryDepth());
      assertEquals(1000000L, secureContentHandler0.getOutputThreshold());
      assertEquals(100, secureContentHandler0.getMaximumDepth());
      assertEquals(100L, secureContentHandler0.getMaximumCompressionRatio());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0);
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(defaultHandler2_0, tikaInputStream0);
      secureContentHandler0.setMaximumDepth(1);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      try { 
        secureContentHandler0.startElement("URL", "3AJG36", "URL", attributes2Impl0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Suspected zip bomb: 1 levels of XML element nesting
         //
         verifyException("org.apache.tika.sax.SecureContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0);
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(defaultHandler2_0, tikaInputStream0);
      assertEquals(1000000L, secureContentHandler0.getOutputThreshold());
      
      secureContentHandler0.setOutputThreshold(0L);
      char[] charArray0 = new char[1];
      secureContentHandler0.ignorableWhitespace(charArray0, 0, 100);
      assertEquals(100L, secureContentHandler0.getMaximumCompressionRatio());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0);
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(defaultHandler2_0, tikaInputStream0);
      assertEquals(1000000L, secureContentHandler0.getOutputThreshold());
      
      secureContentHandler0.setOutputThreshold((-1L));
      secureContentHandler0.ignorableWhitespace((char[]) null, (-925), (-1));
      assertEquals(100L, secureContentHandler0.getMaximumCompressionRatio());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0);
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(defaultHandler2_0, tikaInputStream0);
      assertEquals(1000000L, secureContentHandler0.getOutputThreshold());
      
      secureContentHandler0.setOutputThreshold(0L);
      secureContentHandler0.getOutputThreshold();
      assertEquals(100L, secureContentHandler0.getMaximumCompressionRatio());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(xMLFilterImpl0, (TikaInputStream) null);
      secureContentHandler0.setOutputThreshold((-745L));
      long long0 = secureContentHandler0.getOutputThreshold();
      assertEquals((-745L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      byte[] byteArray0 = new byte[0];
      Metadata metadata0 = new Metadata();
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0, metadata0);
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(xMLFilterImpl0, tikaInputStream0);
      secureContentHandler0.setMaximumPackageEntryDepth((-2488));
      int int0 = secureContentHandler0.getMaximumPackageEntryDepth();
      assertEquals((-2488), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      byte[] byteArray0 = new byte[6];
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0);
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(xMLFilterImpl0, tikaInputStream0);
      secureContentHandler0.setMaximumDepth(0);
      int int0 = secureContentHandler0.getMaximumDepth();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      byte[] byteArray0 = new byte[0];
      Metadata metadata0 = new Metadata();
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0, metadata0);
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(xMLFilterImpl0, tikaInputStream0);
      secureContentHandler0.setMaximumDepth((-1614334704));
      int int0 = secureContentHandler0.getMaximumDepth();
      assertEquals((-1614334704), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(xMLReaderAdapter0, (TikaInputStream) null);
      secureContentHandler0.setMaximumCompressionRatio((-1119055801L));
      long long0 = secureContentHandler0.getMaximumCompressionRatio();
      assertEquals((-1119055801L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(xMLReaderAdapter0, (TikaInputStream) null);
      ParserAdapter parserAdapter0 = new ParserAdapter(xMLReaderAdapter0);
      xMLReaderAdapter0.setDocumentHandler(parserAdapter0);
      // Undeclared exception!
      try { 
        secureContentHandler0.endElement("&l;5^Xg", "&l;5^Xg", "&l;5^Xg");
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xml.sax.helpers.NamespaceSupport", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SecureContentHandler secureContentHandler0 = new SecureContentHandler((ContentHandler) null, (TikaInputStream) null);
      // Undeclared exception!
      try { 
        secureContentHandler0.endElement("$Q!Ze>UTAcxs^>;l=G\"", "$Q!Ze>UTAcxs^>;l=G\"", "$Q!Ze>UTAcxs^>;l=G\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.ContentHandlerDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      byte[] byteArray0 = new byte[3];
      Metadata metadata0 = new Metadata();
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0, metadata0);
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(xMLFilterImpl0, tikaInputStream0);
      secureContentHandler0.setOutputThreshold(2206L);
      char[] charArray0 = new char[2];
      try { 
        secureContentHandler0.characters(charArray0, 10, 4111);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Suspected zip bomb: 3 input bytes produced 4111 output characters
         //
         verifyException("org.apache.tika.sax.SecureContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(xMLReaderAdapter0, (TikaInputStream) null);
      // Undeclared exception!
      try { 
        secureContentHandler0.characters((char[]) null, (-1432813312), (-1432813312));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.SecureContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      byte[] byteArray0 = new byte[6];
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0);
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(xMLFilterImpl0, tikaInputStream0);
      secureContentHandler0.endElement("Message-From", "div", "Message-From");
      assertEquals(100, secureContentHandler0.getMaximumDepth());
      assertEquals(10, secureContentHandler0.getMaximumPackageEntryDepth());
      assertEquals(1000000L, secureContentHandler0.getOutputThreshold());
      assertEquals(100L, secureContentHandler0.getMaximumCompressionRatio());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(xMLReaderAdapter0, (TikaInputStream) null);
      secureContentHandler0.startElement("div", "div", "div", attributes2Impl0);
      assertEquals(100L, secureContentHandler0.getMaximumCompressionRatio());
      assertEquals(1000000L, secureContentHandler0.getOutputThreshold());
      assertEquals(10, secureContentHandler0.getMaximumPackageEntryDepth());
      assertEquals(100, secureContentHandler0.getMaximumDepth());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SecureContentHandler secureContentHandler0 = new SecureContentHandler((ContentHandler) null, (TikaInputStream) null);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      // Undeclared exception!
      try { 
        secureContentHandler0.startElement("org.apache.tika.utils.DateUtils", "org.apache.tika.utils.DateUtils", "org.apache.tika.utils.DateUtils", attributesImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.ContentHandlerDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0);
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(defaultHandler2_0, tikaInputStream0);
      char[] charArray0 = new char[6];
      secureContentHandler0.setOutputThreshold((-1050L));
      secureContentHandler0.ignorableWhitespace(charArray0, (-478), (-478));
      assertEquals((-1050L), secureContentHandler0.getOutputThreshold());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0);
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(defaultHandler2_0, tikaInputStream0);
      try { 
        secureContentHandler0.ignorableWhitespace((char[]) null, 2146750217, 2146750217);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Suspected zip bomb: 2 input bytes produced 2146750217 output characters
         //
         verifyException("org.apache.tika.sax.SecureContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(xMLReaderAdapter0, (TikaInputStream) null);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)12, 1101);
      TikaInputStream tikaInputStream0 = TikaInputStream.get((InputStream) byteArrayInputStream0);
      SecureContentHandler secureContentHandler1 = new SecureContentHandler(secureContentHandler0, tikaInputStream0);
      // Undeclared exception!
      try { 
        secureContentHandler1.ignorableWhitespace((char[]) null, 10, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.SecureContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      byte[] byteArray0 = new byte[0];
      Metadata metadata0 = new Metadata();
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0, metadata0);
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(xMLFilterImpl0, tikaInputStream0);
      LocatorImpl locatorImpl0 = new LocatorImpl();
      MockIOException mockIOException0 = new MockIOException();
      SAXParseException sAXParseException0 = new SAXParseException("rights", locatorImpl0, mockIOException0);
      secureContentHandler0.throwIfCauseOf(sAXParseException0);
      assertEquals(10, secureContentHandler0.getMaximumPackageEntryDepth());
      assertEquals(1000000L, secureContentHandler0.getOutputThreshold());
      assertEquals(100, secureContentHandler0.getMaximumDepth());
      assertEquals(100L, secureContentHandler0.getMaximumCompressionRatio());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(xMLReaderAdapter0, (TikaInputStream) null);
      secureContentHandler0.setMaximumDepth((-4761));
      try { 
        secureContentHandler0.startElement("div", "div", "div", attributes2Impl0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Suspected zip bomb: 1 levels of XML element nesting
         //
         verifyException("org.apache.tika.sax.SecureContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultHandler defaultHandler0 = new DefaultHandler();
      byte[] byteArray0 = new byte[5];
      Metadata metadata0 = new Metadata();
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0, metadata0);
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(defaultHandler0, tikaInputStream0);
      long long0 = secureContentHandler0.getMaximumCompressionRatio();
      assertEquals(10, secureContentHandler0.getMaximumPackageEntryDepth());
      assertEquals(100, secureContentHandler0.getMaximumDepth());
      assertEquals(1000000L, secureContentHandler0.getOutputThreshold());
      assertEquals(100L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      byte[] byteArray0 = new byte[6];
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0);
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(xMLFilterImpl0, tikaInputStream0);
      int int0 = secureContentHandler0.getMaximumDepth();
      assertEquals(10, secureContentHandler0.getMaximumPackageEntryDepth());
      assertEquals(1000000L, secureContentHandler0.getOutputThreshold());
      assertEquals(100L, secureContentHandler0.getMaximumCompressionRatio());
      assertEquals(100, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultHandler defaultHandler0 = new DefaultHandler();
      byte[] byteArray0 = new byte[5];
      Metadata metadata0 = new Metadata();
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0, metadata0);
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(defaultHandler0, tikaInputStream0);
      int int0 = secureContentHandler0.getMaximumPackageEntryDepth();
      assertEquals(1000000L, secureContentHandler0.getOutputThreshold());
      assertEquals(100L, secureContentHandler0.getMaximumCompressionRatio());
      assertEquals(10, int0);
      assertEquals(100, secureContentHandler0.getMaximumDepth());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultHandler defaultHandler0 = new DefaultHandler();
      byte[] byteArray0 = new byte[5];
      Metadata metadata0 = new Metadata();
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0, metadata0);
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(defaultHandler0, tikaInputStream0);
      long long0 = secureContentHandler0.getOutputThreshold();
      assertEquals(10, secureContentHandler0.getMaximumPackageEntryDepth());
      assertEquals(1000000L, long0);
      assertEquals(100L, secureContentHandler0.getMaximumCompressionRatio());
      assertEquals(100, secureContentHandler0.getMaximumDepth());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultHandler defaultHandler0 = new DefaultHandler();
      byte[] byteArray0 = new byte[5];
      Metadata metadata0 = new Metadata();
      TikaInputStream tikaInputStream0 = TikaInputStream.get(byteArray0, metadata0);
      SecureContentHandler secureContentHandler0 = new SecureContentHandler(defaultHandler0, tikaInputStream0);
      secureContentHandler0.characters((char[]) null, (byte)14, 10);
      assertEquals(100L, secureContentHandler0.getMaximumCompressionRatio());
      assertEquals(1000000L, secureContentHandler0.getOutputThreshold());
      assertEquals(100, secureContentHandler0.getMaximumDepth());
      assertEquals(10, secureContentHandler0.getMaximumPackageEntryDepth());
  }
}
