/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 15:43:01 GMT 2022
 */

package org.apache.tika.mime;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.charset.Charset;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MimeType;
import org.apache.tika.mime.MimeTypeException;
import org.apache.tika.mime.MimeTypes;
import org.apache.tika.mime.MimeTypesReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.ext.Locator2Impl;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.LocatorImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MimeTypesReader_ESTest extends MimeTypesReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassLoader.getSystemClassLoader();
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeTypesReader mimeTypesReader0 = new MimeTypesReader(mimeTypes0);
      mimeTypesReader0.endDocument();
      Document document0 = mock(Document.class, new ViolatedAssumptionAnswer());
      doReturn((NamedNodeMap) null).when(document0).getAttributes();
      doReturn((String) null).when(document0).getNodeName();
      doReturn((short) (-3310), (short)1).when(document0).getNodeType();
      try { 
        mimeTypesReader0.read(document0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Failed to parse type registry
         //
         verifyException("org.apache.tika.mime.MimeTypesReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      mimeTypes0.getMimeType("SeWD1pW}[:eA*3d#ze");
      MimeTypesReader mimeTypesReader0 = new MimeTypesReader(mimeTypes0);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      attributesImpl0.getIndex((String) null, "application/octet-stream");
      mimeTypes0.init();
      attributesImpl0.getType((-5094));
      mimeTypesReader0.startElement("text/plain", "", "text/plain", attributesImpl0);
      mimeTypesReader0.startElement("glob", "application/octet-stream", "application/xml", attributesImpl0);
      System.setCurrentTimeMillis(0L);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeTypesReader mimeTypesReader0 = new MimeTypesReader(mimeTypes0);
      mimeTypesReader0.endDocument();
      Document document0 = mock(Document.class, new ViolatedAssumptionAnswer());
      doReturn((short)0, (short)0).when(document0).getNodeType();
      mimeTypesReader0.read(document0);
      MimeTypeException mimeTypeException0 = new MimeTypeException("");
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl(attributesImpl0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeTypesReader mimeTypesReader0 = new MimeTypesReader(mimeTypes0);
      Document document0 = mock(Document.class, new ViolatedAssumptionAnswer());
      doReturn((short)0, (short)0).when(document0).getNodeType();
      mimeTypesReader0.read(document0);
      mimeTypesReader0.resolveEntity("", "application/octet-stream");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      int int0 = (-1580);
      try { 
        pipedInputStream0.connect(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Already connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeTypesReader mimeTypesReader0 = new MimeTypesReader(mimeTypes0);
      // Undeclared exception!
      try { 
        mimeTypesReader0.read((InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // InputStream cannot be null
         //
         verifyException("javax.xml.parsers.SAXParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeTypesReader mimeTypesReader0 = new MimeTypesReader(mimeTypes0);
      MimeType mimeType0 = mimeTypes0.getMimeType(" value, but received a ");
      String string0 = "`-*\\NieU5";
      Locator2Impl locator2Impl0 = new Locator2Impl();
      LocatorImpl locatorImpl0 = new LocatorImpl(locator2Impl0);
      MimeTypeException mimeTypeException0 = new MimeTypeException("");
      MockException mockException0 = new MockException(mimeTypeException0);
      SAXParseException sAXParseException0 = new SAXParseException("`-*NieU5", locatorImpl0, mockException0);
      locatorImpl0.getSystemId();
      locatorImpl0.getColumnNumber();
      MimeTypeException mimeTypeException1 = new MimeTypeException(" value, but received a ", sAXParseException0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      Attributes2Impl attributes2Impl1 = new Attributes2Impl(attributes2Impl0);
      AttributesImpl attributesImpl0 = new AttributesImpl(attributes2Impl1);
      try { 
        mimeTypesReader0.handleGlobError(mimeType0, "[vgTL@J4j&D#HOU", mimeTypeException1, "CLOSED_CHOICE", attributesImpl0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         //  value, but received a 
         //
         verifyException("org.apache.tika.mime.MimeTypesReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeTypesReader mimeTypesReader0 = new MimeTypesReader(mimeTypes0);
      MimeTypeException mimeTypeException0 = new MimeTypeException("creator");
      AttributesImpl attributesImpl0 = new AttributesImpl();
      AttributesImpl attributesImpl1 = new AttributesImpl(attributesImpl0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl(attributesImpl1);
      try { 
        mimeTypesReader0.handleMimeError("application/octet-stream", mimeTypeException0, "creator", attributes2Impl0);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // creator
         //
         verifyException("org.apache.tika.mime.MimeTypesReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeTypesReader mimeTypesReader0 = new MimeTypesReader(mimeTypes0);
      mimeTypesReader0.endElement("", (String) null, (String) null);
      mimeTypesReader0.skippedEntity((String) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream(10000);
      MediaType.audio("");
      Charset charset0 = Charset.defaultCharset();
      MediaType mediaType0 = null;
      try {
        mediaType0 = new MediaType((MediaType) null, charset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.mime.MediaType", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeTypesReader mimeTypesReader0 = new MimeTypesReader(mimeTypes0);
      mimeTypesReader0.resolveEntity("", "application/octet-stream");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      int int0 = (-1580);
      try { 
        pipedInputStream0.connect(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Already connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeTypesReader mimeTypesReader0 = new MimeTypesReader(mimeTypes0);
      char[] charArray0 = new char[2];
      charArray0[0] = 's';
      charArray0[1] = 'C';
      mimeTypesReader0.resolveEntity("application/octet-stream", "text/plain");
      mimeTypesReader0.characters(charArray0, 841, 91);
      mimeTypesReader0.resolveEntity("application/octet-stream", "application/octet-stream");
      int int0 = 1530;
      mimeTypesReader0.characters(charArray0, 1530, 1530);
      String string0 = null;
      try { 
        mimeTypes0.forName((String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid media type name: null
         //
         verifyException("org.apache.tika.mime.MimeTypes", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      MimeTypes.getDefaultMimeTypes((ClassLoader) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      MimeTypes.getDefaultMimeTypes(classLoader0);
  }
}
