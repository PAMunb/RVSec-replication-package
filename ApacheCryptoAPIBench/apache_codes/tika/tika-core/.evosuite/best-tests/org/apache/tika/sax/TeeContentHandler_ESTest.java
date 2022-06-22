/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:29:59 GMT 2022
 */

package org.apache.tika.sax;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tika.sax.TeeContentHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.ext.Locator2Impl;
import org.xml.sax.helpers.LocatorImpl;
import org.xml.sax.helpers.XMLFilterImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TeeContentHandler_ESTest extends TeeContentHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[9];
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        teeContentHandler0.characters(charArray0, 63, (-1421));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.TeeContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[1];
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      // Undeclared exception!
      try { 
        teeContentHandler0.endElement("CVS|.svn|.git", "Ys`k[Pa:>Z%Q$", "org.apache.tika.sax.TeeContentHandler");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.TeeContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[1];
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      // Undeclared exception!
      try { 
        teeContentHandler0.startElement("v[o~s", "v[o~s", "v[o~s", (Attributes) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.TeeContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[5];
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        teeContentHandler0.ignorableWhitespace(charArray0, (-356), (-356));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.TeeContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[1];
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      // Undeclared exception!
      try { 
        teeContentHandler0.endPrefixMapping("AKL");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.TeeContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[4];
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      // Undeclared exception!
      try { 
        teeContentHandler0.skippedEntity(".");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.TeeContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[0];
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      teeContentHandler0.skippedEntity((String) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[1];
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      contentHandlerArray0[0] = (ContentHandler) defaultHandler2_0;
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      char[] charArray0 = new char[0];
      teeContentHandler0.ignorableWhitespace(charArray0, (-1300), 819);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[0];
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      char[] charArray0 = new char[6];
      teeContentHandler0.characters(charArray0, 0, 0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[2];
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      contentHandlerArray0[0] = (ContentHandler) xMLFilterImpl0;
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      contentHandlerArray0[1] = (ContentHandler) defaultHandler2_0;
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      teeContentHandler0.endElement("presence:", "`[", "presence:");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[1];
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      contentHandlerArray0[0] = (ContentHandler) defaultHandler2_0;
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      teeContentHandler0.startElement("", (String) null, "z", attributes2Impl0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[1];
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      // Undeclared exception!
      try { 
        teeContentHandler0.endDocument();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.TeeContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[0];
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      teeContentHandler0.endDocument();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[1];
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      // Undeclared exception!
      try { 
        teeContentHandler0.startDocument();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.TeeContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[0];
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      teeContentHandler0.startDocument();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[1];
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      Locator2Impl locator2Impl0 = new Locator2Impl();
      // Undeclared exception!
      try { 
        teeContentHandler0.setDocumentLocator(locator2Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.TeeContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[0];
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      LocatorImpl locatorImpl0 = new LocatorImpl();
      teeContentHandler0.setDocumentLocator(locatorImpl0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[1];
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      // Undeclared exception!
      try { 
        teeContentHandler0.processingInstruction("CVS|.svn|.git", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.TeeContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[0];
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      teeContentHandler0.processingInstruction((String) null, (String) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[1];
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      contentHandlerArray0[0] = (ContentHandler) defaultHandler2_0;
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      teeContentHandler0.endPrefixMapping(")\"(47uT");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[2];
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      // Undeclared exception!
      try { 
        teeContentHandler0.startPrefixMapping("`[", "8sJ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.TeeContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ContentHandler[] contentHandlerArray0 = new ContentHandler[0];
      TeeContentHandler teeContentHandler0 = new TeeContentHandler(contentHandlerArray0);
      teeContentHandler0.startPrefixMapping("<", "[x");
  }
}