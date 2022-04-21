/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 15:35:17 GMT 2022
 */

package org.apache.tika.sax;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.UnsupportedEncodingException;
import org.apache.tika.sax.BasicContentHandlerFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import org.xml.sax.ContentHandler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BasicContentHandlerFactory_ESTest extends BasicContentHandlerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.HTML;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, (-1));
      ContentHandler contentHandler0 = basicContentHandlerFactory0.getNewContentHandler();
      assertNotNull(contentHandler0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicContentHandlerFactory.parseHandlerType("aQute.lib.osgi.InstructionFilter", (BasicContentHandlerFactory.HANDLER_TYPE) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory((BasicContentHandlerFactory.HANDLER_TYPE) null, 34);
      basicContentHandlerFactory0.getType();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.TEXT;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, (-2167));
      // Undeclared exception!
      try { 
        basicContentHandlerFactory0.getNewContentHandler((OutputStream) null, "<k^Mko8]uf9J1r_");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory((BasicContentHandlerFactory.HANDLER_TYPE) null, 2);
      // Undeclared exception!
      try { 
        basicContentHandlerFactory0.getNewContentHandler();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.BasicContentHandlerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.XML;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, (-1));
      try { 
        basicContentHandlerFactory0.getNewContentHandler((OutputStream) pipedOutputStream0, ",sHp|K");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.HTML;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, (-1));
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      try { 
        basicContentHandlerFactory0.getNewContentHandler((OutputStream) byteArrayOutputStream0, "");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.BODY;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, 1297);
      try { 
        basicContentHandlerFactory0.getNewContentHandler((OutputStream) pipedOutputStream0, "body");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.XML;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, 146);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("H");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      try { 
        basicContentHandlerFactory0.getNewContentHandler((OutputStream) mockPrintStream0, "H");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.TEXT;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, 1775);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, true);
      try { 
        basicContentHandlerFactory0.getNewContentHandler((OutputStream) mockPrintStream0, "q/GoYy#DzW{h~7ia3");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.BODY;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, (-1389));
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      try { 
        basicContentHandlerFactory0.getNewContentHandler((OutputStream) byteArrayOutputStream0, "");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.IGNORE;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, 0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("presence:", false);
      ContentHandler contentHandler0 = basicContentHandlerFactory0.getNewContentHandler((OutputStream) mockFileOutputStream0, "presence:");
      assertNotNull(contentHandler0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.HTML;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, 0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Y~+", true);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockFileOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(filterOutputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      try { 
        basicContentHandlerFactory0.getNewContentHandler((OutputStream) objectOutputStream0, "VV@M9f >Zx)}RcU|L");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.HTML;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, (-3169));
      ContentHandler contentHandler0 = basicContentHandlerFactory0.getNewContentHandler();
      assertNotNull(contentHandler0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.TEXT;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, (-2654));
      ContentHandler contentHandler0 = basicContentHandlerFactory0.getNewContentHandler();
      assertNotNull(contentHandler0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.XML;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, 0);
      ContentHandler contentHandler0 = basicContentHandlerFactory0.getNewContentHandler();
      assertNotNull(contentHandler0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.TEXT;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, 1775);
      ContentHandler contentHandler0 = basicContentHandlerFactory0.getNewContentHandler();
      assertNotNull(contentHandler0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.XML;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, (-3065));
      ContentHandler contentHandler0 = basicContentHandlerFactory0.getNewContentHandler();
      assertNotNull(contentHandler0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.HTML;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, 0);
      ContentHandler contentHandler0 = basicContentHandlerFactory0.getNewContentHandler();
      assertNotNull(contentHandler0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.BODY;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, (-1389));
      ContentHandler contentHandler0 = basicContentHandlerFactory0.getNewContentHandler();
      assertNotNull(contentHandler0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.BODY;
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE1 = BasicContentHandlerFactory.parseHandlerType("TEXT", basicContentHandlerFactory_HANDLER_TYPE0);
      assertEquals(BasicContentHandlerFactory.HANDLER_TYPE.TEXT, basicContentHandlerFactory_HANDLER_TYPE1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.TEXT;
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE1 = BasicContentHandlerFactory.parseHandlerType("html", basicContentHandlerFactory_HANDLER_TYPE0);
      assertEquals(BasicContentHandlerFactory.HANDLER_TYPE.HTML, basicContentHandlerFactory_HANDLER_TYPE1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.BODY;
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE1 = BasicContentHandlerFactory.parseHandlerType("BODY", basicContentHandlerFactory_HANDLER_TYPE0);
      assertEquals(BasicContentHandlerFactory.HANDLER_TYPE.BODY, basicContentHandlerFactory_HANDLER_TYPE1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.BODY;
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE1 = BasicContentHandlerFactory.parseHandlerType("xml", basicContentHandlerFactory_HANDLER_TYPE0);
      assertEquals(BasicContentHandlerFactory.HANDLER_TYPE.XML, basicContentHandlerFactory_HANDLER_TYPE1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.TEXT;
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE1 = BasicContentHandlerFactory.parseHandlerType("txt", basicContentHandlerFactory_HANDLER_TYPE0);
      assertEquals(BasicContentHandlerFactory.HANDLER_TYPE.TEXT, basicContentHandlerFactory_HANDLER_TYPE1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.BODY;
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE1 = BasicContentHandlerFactory.parseHandlerType("IGNORE", basicContentHandlerFactory_HANDLER_TYPE0);
      assertEquals(BasicContentHandlerFactory.HANDLER_TYPE.IGNORE, basicContentHandlerFactory_HANDLER_TYPE1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.IGNORE;
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE1 = BasicContentHandlerFactory.parseHandlerType((String) null, basicContentHandlerFactory_HANDLER_TYPE0);
      assertSame(basicContentHandlerFactory_HANDLER_TYPE0, basicContentHandlerFactory_HANDLER_TYPE1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.TEXT;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, 1775);
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE1 = basicContentHandlerFactory0.getType();
      assertEquals(BasicContentHandlerFactory.HANDLER_TYPE.TEXT, basicContentHandlerFactory_HANDLER_TYPE1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.IGNORE;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, 0);
      ContentHandler contentHandler0 = basicContentHandlerFactory0.getNewContentHandler();
      assertNotNull(contentHandler0);
  }
}
