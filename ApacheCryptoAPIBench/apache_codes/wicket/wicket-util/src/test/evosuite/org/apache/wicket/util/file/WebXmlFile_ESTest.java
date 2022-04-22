/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:56:16 GMT 2022
 */

package org.apache.wicket.util.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Set;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import org.apache.wicket.util.file.WebXmlFile;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xml.sax.SAXParseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WebXmlFile_ESTest extends WebXmlFile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WebXmlFile webXmlFile0 = new WebXmlFile();
      // Undeclared exception!
      try { 
        webXmlFile0.getUniqueFilterPath(true, (FilterConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.file.WebXmlFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WebXmlFile webXmlFile0 = new WebXmlFile();
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 580, (byte)1);
      try { 
        webXmlFile0.getUniqueFilterPath(false, "", (InputStream) byteArrayInputStream0);
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WebXmlFile webXmlFile0 = new WebXmlFile();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        webXmlFile0.getUniqueFilterPath(false, ")o6~aK%[oMk78", (InputStream) dataInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WebXmlFile webXmlFile0 = new WebXmlFile();
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), (byte)1);
      // Undeclared exception!
      try { 
        webXmlFile0.getUniqueFilterPath(true, "", (InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WebXmlFile webXmlFile0 = new WebXmlFile();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        webXmlFile0.getUniqueFilterPath(false, "", (InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WebXmlFile webXmlFile0 = new WebXmlFile();
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-127);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        webXmlFile0.getUniqueFilterPath(false, (String) null, (InputStream) byteArrayInputStream0);
        fail("Expecting exception: CharConversionException");
      
      } catch(CharConversionException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WebXmlFile webXmlFile0 = new WebXmlFile();
      // Undeclared exception!
      try { 
        webXmlFile0.getFilterPath(true, (ServletContext) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.file.WebXmlFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WebXmlFile webXmlFile0 = new WebXmlFile();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        webXmlFile0.getFilterPath(false, "`[", (InputStream) byteArrayInputStream0);
        fail("Expecting exception: SAXParseException");
      
      } catch(SAXParseException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WebXmlFile webXmlFile0 = new WebXmlFile();
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, true, false).when(enumeration0).hasMoreElements();
      doReturn((Object) null).when(enumeration0).nextElement();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        webXmlFile0.getFilterPath(true, "O:N'+6:>h?>UBF`", (InputStream) sequenceInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.SequenceInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WebXmlFile webXmlFile0 = new WebXmlFile();
      // Undeclared exception!
      try { 
        webXmlFile0.getFilterPath(true, "web.xml: url mapping found for ", (InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // InputStream cannot be null
         //
         verifyException("javax.xml.parsers.DocumentBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WebXmlFile webXmlFile0 = new WebXmlFile();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1198), (byte)1);
      // Undeclared exception!
      try { 
        webXmlFile0.getFilterPath(false, "/Mh{cCAV\"2o9SS", (InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1198
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WebXmlFile webXmlFile0 = new WebXmlFile();
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      try { 
        webXmlFile0.getFilterPath(true, ">uaOe5uS}+S", (InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WebXmlFile webXmlFile0 = new WebXmlFile();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-28);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        webXmlFile0.getFilterPath(true, "p<4:TZsh9wWb6~|*[2", (InputStream) byteArrayInputStream0);
        fail("Expecting exception: CharConversionException");
      
      } catch(CharConversionException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      WebXmlFile webXmlFile0 = new WebXmlFile();
      ServletContext servletContext0 = mock(ServletContext.class, new ViolatedAssumptionAnswer());
      doReturn((InputStream) null).when(servletContext0).getResourceAsStream(anyString());
      Set<String> set0 = webXmlFile0.getFilterPath(true, servletContext0, "org.apache.wicket.util.file.WebXmlFile");
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WebXmlFile webXmlFile0 = new WebXmlFile();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ServletContext servletContext0 = mock(ServletContext.class, new ViolatedAssumptionAnswer());
      doReturn(pipedInputStream0).when(servletContext0).getResourceAsStream(anyString());
      Set<String> set0 = webXmlFile0.getFilterPath(true, servletContext0, "Error reading servlet/filter path from web.xml");
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      WebXmlFile webXmlFile0 = new WebXmlFile();
      ServletContext servletContext0 = mock(ServletContext.class, new ViolatedAssumptionAnswer());
      doReturn((InputStream) null).when(servletContext0).getResourceAsStream(anyString());
      FilterConfig filterConfig0 = mock(FilterConfig.class, new ViolatedAssumptionAnswer());
      doReturn(") o<LWN,O").when(filterConfig0).getFilterName();
      doReturn(servletContext0).when(filterConfig0).getServletContext();
      String string0 = webXmlFile0.getUniqueFilterPath(false, filterConfig0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      WebXmlFile webXmlFile0 = new WebXmlFile();
      // Undeclared exception!
      try { 
        webXmlFile0.getUniqueFilterPath(true, "Dh", (InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // InputStream cannot be null
         //
         verifyException("javax.xml.parsers.DocumentBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      WebXmlFile webXmlFile0 = new WebXmlFile();
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-584), (byte)50);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      ServletContext servletContext0 = mock(ServletContext.class, new ViolatedAssumptionAnswer());
      doReturn(bufferedInputStream0).when(servletContext0).getResourceAsStream(anyString());
      FilterConfig filterConfig0 = mock(FilterConfig.class, new ViolatedAssumptionAnswer());
      doReturn(") o<LWN,O").when(filterConfig0).getFilterName();
      doReturn(servletContext0).when(filterConfig0).getServletContext();
      // Undeclared exception!
      try { 
        webXmlFile0.getUniqueFilterPath(false, filterConfig0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }
}
