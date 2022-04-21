/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 15:52:47 GMT 2022
 */

package org.apache.tika.sax;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.Writer;
import org.apache.tika.sax.WriteOutContentHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;
import org.xml.sax.SAXException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WriteOutContentHandler_ESTest extends WriteOutContentHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(writer0, 2383);
      char[] charArray0 = new char[6];
      writeOutContentHandler0.ignorableWhitespace(charArray0, 2383, 2383);
      try { 
        writeOutContentHandler0.ignorableWhitespace(charArray0, 0, 2383);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Your document contained more than 2383 characters, and so your requested limit has been reached. To receive the full text of the document, increase your limit. (Text up to the limit is however available).
         //
         verifyException("org.apache.tika.sax.WriteOutContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(writer0, (-2371));
      char[] charArray0 = new char[8];
      writeOutContentHandler0.ignorableWhitespace(charArray0, 1, (-2371));
      assertEquals(8, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OutputStream outputStream0 = mock(OutputStream.class, new ViolatedAssumptionAnswer());
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(outputStream0);
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        writeOutContentHandler0.ignorableWhitespace(charArray0, 2199, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(writer0, 2383);
      char[] charArray0 = new char[3];
      writeOutContentHandler0.ignorableWhitespace(charArray0, 2383, 2383);
      try { 
        writeOutContentHandler0.characters(charArray0, 2383, 843);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Your document contained more than 2383 characters, and so your requested limit has been reached. To receive the full text of the document, increase your limit. (Text up to the limit is however available).
         //
         verifyException("org.apache.tika.sax.WriteOutContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(writer0, 100000);
      writeOutContentHandler0.characters((char[]) null, 0, (-1590));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(0);
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        writeOutContentHandler0.characters(charArray0, (-3263), 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(writer0, (-2825));
      char[] charArray0 = new char[3];
      try { 
        writeOutContentHandler0.characters(charArray0, (-1), 100000);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Your document contained more than -2825 characters, and so your requested limit has been reached. To receive the full text of the document, increase your limit. (Text up to the limit is however available).
         //
         verifyException("org.apache.tika.sax.WriteOutContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(0);
      WriteOutContentHandler writeOutContentHandler1 = new WriteOutContentHandler(writeOutContentHandler0, 0);
      assertFalse(writeOutContentHandler1.equals((Object)writeOutContentHandler0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(writer0);
      char[] charArray0 = new char[6];
      writeOutContentHandler0.characters(charArray0, 3664, 3664);
      assertEquals(6, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(1);
      char[] charArray0 = new char[2];
      try { 
        writeOutContentHandler0.ignorableWhitespace(charArray0, 1, 100000);
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // Your document contained more than 1 characters, and so your requested limit has been reached. To receive the full text of the document, increase your limit. (Text up to the limit is however available).
         //
         verifyException("org.apache.tika.sax.WriteOutContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler();
      SAXException sAXException0 = new SAXException();
      MockException mockException0 = new MockException(sAXException0);
      boolean boolean0 = writeOutContentHandler0.isWriteLimitReached(mockException0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler();
      MockException mockException0 = new MockException();
      boolean boolean0 = writeOutContentHandler0.isWriteLimitReached(mockException0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler();
      // Undeclared exception!
      try { 
        writeOutContentHandler0.ignorableWhitespace((char[]) null, 100008, 100008);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler();
      // Undeclared exception!
      try { 
        writeOutContentHandler0.ignorableWhitespace((char[]) null, (-1491), (-1491));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      WriteOutContentHandler writeOutContentHandler0 = new WriteOutContentHandler(pipedOutputStream0);
      // Undeclared exception!
      try { 
        writeOutContentHandler0.characters((char[]) null, 63, 63);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
