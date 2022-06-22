/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:33:45 GMT 2022
 */

package org.apache.tika.sax;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Writer;
import org.apache.tika.sax.WriteOutContentHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.helpers.DefaultHandler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WriteOutContentHandler_ESTest extends WriteOutContentHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(0);
      char[] charArray0 = new char[7];
      writeOutContentHandler0.ignorableWhitespace(charArray0, 0, 0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(defaultHandler2_0, 21);
      char[] charArray0 = new char[2];
      writeOutContentHandler0.characters(charArray0, (-1), (-1));
      try { 
        writeOutContentHandler0.characters(charArray0, 61, 2472);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Your document contained more than 21 characters, and so your requested limit has been reached. To receive the full text of the document, increase your limit. (Text up to the limit is however available).
         //
         verifyException("org.apache.tika.sax.WriteOutContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(defaultHandler2_0, (-2371));
      char[] charArray0 = new char[3];
      try { 
        writeOutContentHandler0.characters(charArray0, 4, 4);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Your document contained more than -2371 characters, and so your requested limit has been reached. To receive the full text of the document, increase your limit. (Text up to the limit is however available).
         //
         verifyException("org.apache.tika.sax.WriteOutContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler((Writer) null, (-3441));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(writer0);
      char[] charArray0 = new char[0];
      writeOutContentHandler0.ignorableWhitespace(charArray0, 1590, (-3127));
      assertArrayEquals(new char[] {}, charArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultHandler defaultHandler0 = new DefaultHandler();
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(defaultHandler0, 1);
      char[] charArray0 = new char[0];
      writeOutContentHandler0.characters(charArray0, (-737), (-294));
      try { 
        writeOutContentHandler0.ignorableWhitespace(charArray0, (-2133), 1173);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Your document contained more than 1 characters, and so your requested limit has been reached. To receive the full text of the document, increase your limit. (Text up to the limit is however available).
         //
         verifyException("org.apache.tika.sax.WriteOutContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(defaultHandler2_0, (-1929));
      try { 
        writeOutContentHandler0.ignorableWhitespace((char[]) null, 0, 465);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Your document contained more than -1929 characters, and so your requested limit has been reached. To receive the full text of the document, increase your limit. (Text up to the limit is however available).
         //
         verifyException("org.apache.tika.sax.WriteOutContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(7);
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        writeOutContentHandler0.characters(charArray0, 7, 7);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WriteOutContentHandler writeOutContentHandler0 = null;
      try {
        writeOutContentHandler0 = new WriteOutContentHandler((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler();
      MockThrowable mockThrowable0 = new MockThrowable();
      MockException mockException0 = new MockException(mockThrowable0);
      boolean boolean0 = writeOutContentHandler0.isWriteLimitReached(mockException0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler();
      SAXException sAXException0 = new SAXException();
      boolean boolean0 = writeOutContentHandler0.isWriteLimitReached(sAXException0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler();
      // Undeclared exception!
      try { 
        writeOutContentHandler0.isWriteLimitReached((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.WriteOutContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(0);
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        writeOutContentHandler0.ignorableWhitespace(charArray0, 1, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler();
      // Undeclared exception!
      try { 
        writeOutContentHandler0.ignorableWhitespace((char[]) null, 1216, 1216);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler((Writer) null);
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        writeOutContentHandler0.characters(charArray0, '*', 823);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.ToTextContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(objectOutputStream0);
  }
}