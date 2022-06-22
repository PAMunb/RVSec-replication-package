/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:34:12 GMT 2022
 */

package org.apache.tika.sax;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tika.sax.ExpandedTitleContentHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xml.sax.ContentHandler;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.helpers.AttributesImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExpandedTitleContentHandler_ESTest extends ExpandedTitleContentHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExpandedTitleContentHandler expandedTitleContentHandler0 = new ExpandedTitleContentHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      expandedTitleContentHandler0.startElement("http://www.w3.org/1999/xhtml", "TITLE", "http://www.w3.org/1999/xhtml", attributesImpl0);
      expandedTitleContentHandler0.characters((char[]) null, 101, (-1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExpandedTitleContentHandler expandedTitleContentHandler0 = new ExpandedTitleContentHandler();
      expandedTitleContentHandler0.endElement("http://www.w3.org/1999/xhtml", "TITLE", "(v");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExpandedTitleContentHandler expandedTitleContentHandler0 = new ExpandedTitleContentHandler();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      expandedTitleContentHandler0.startElement(",?R,`.*rE&P?k>ED", "TITLE", "aQute.lib.osgi.InstructionFilter", attributes2Impl0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExpandedTitleContentHandler expandedTitleContentHandler0 = new ExpandedTitleContentHandler();
      expandedTitleContentHandler0.startDocument();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExpandedTitleContentHandler expandedTitleContentHandler0 = new ExpandedTitleContentHandler((ContentHandler) null);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      // Undeclared exception!
      try { 
        expandedTitleContentHandler0.startElement((String) null, (String) null, "tm@w#n^/@mlV)M'", attributes2Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.ContentHandlerDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExpandedTitleContentHandler expandedTitleContentHandler0 = new ExpandedTitleContentHandler((ContentHandler) null);
      // Undeclared exception!
      try { 
        expandedTitleContentHandler0.endElement((String) null, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.ContentHandlerDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpandedTitleContentHandler expandedTitleContentHandler0 = new ExpandedTitleContentHandler((ContentHandler) null);
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        expandedTitleContentHandler0.characters(charArray0, (-1628173784), (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.ContentHandlerDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExpandedTitleContentHandler expandedTitleContentHandler0 = new ExpandedTitleContentHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      expandedTitleContentHandler0.startElement("http://www.w3.org/1999/xhtml", "TITLE", "http://www.w3.org/1999/xhtml", attributesImpl0);
      char[] charArray0 = new char[3];
      expandedTitleContentHandler0.characters(charArray0, (-1), 0);
      assertEquals(3, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExpandedTitleContentHandler expandedTitleContentHandler0 = new ExpandedTitleContentHandler();
      expandedTitleContentHandler0.endElement("TITLE", "TITLE", "TITLE");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpandedTitleContentHandler expandedTitleContentHandler0 = new ExpandedTitleContentHandler();
      expandedTitleContentHandler0.endElement("", "_keT", ".xntR");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExpandedTitleContentHandler expandedTitleContentHandler0 = new ExpandedTitleContentHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      expandedTitleContentHandler0.startElement("http://www.w3.org/1999/xhtml", "TITLE", "http://www.w3.org/1999/xhtml", attributesImpl0);
      char[] charArray0 = new char[3];
      expandedTitleContentHandler0.characters(charArray0, (-1), 101);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExpandedTitleContentHandler expandedTitleContentHandler0 = new ExpandedTitleContentHandler();
      AttributesImpl attributesImpl0 = new AttributesImpl();
      expandedTitleContentHandler0.startElement("xmWh}(Fu'", "aQute.lib.osgi.InstructionFilter", "~&zU1nF", attributesImpl0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExpandedTitleContentHandler expandedTitleContentHandler0 = new ExpandedTitleContentHandler((ContentHandler) null);
      // Undeclared exception!
      try { 
        expandedTitleContentHandler0.startDocument();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.ContentHandlerDecorator", e);
      }
  }
}