/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:49:46 GMT 2022
 */

package org.apache.wicket.util.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Enumeration;
import org.apache.wicket.util.io.IOUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[3] = 'z';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0, 3, 3);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      boolean boolean0 = IOUtils.contentEquals((Reader) charArrayReader1, (Reader) charArrayReader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(3);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        IOUtils.contentEquals((InputStream) mockFileInputStream0, (InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("Bz#");
      try { 
        IOUtils.write("#3VE8 ~p']-mr", (OutputStream) mockPrintStream0, "");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("closing resource failed: ", "closing resource failed: ");
      StringBuilder stringBuilder0 = new StringBuilder("closing resource failed: ");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      IOUtils.write(stringBuilder0, (OutputStream) mockPrintStream0);
      assertEquals(25L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.wicket.util.io.IOUtils", "org.apache.wicket.util.io.IOUtils");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      IOUtils.closeQuietly(dataInputStream0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = IOUtils.toString((InputStream) byteArrayInputStream0);
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = IOUtils.toString((InputStream) sequenceInputStream0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.wicket.util.io.IOUtils", "org.apache.wicket.util.io.IOUtils");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      char[] charArray0 = IOUtils.toCharArray((InputStream) mockFileInputStream0, (String) null);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      char[] charArray0 = IOUtils.toCharArray((InputStream) byteArrayInputStream0);
      assertEquals(5, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0, 3, 3);
      byte[] byteArray0 = IOUtils.toByteArray((Reader) charArrayReader0, (String) null);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0, 3, 3);
      IOUtils.toByteArray((Reader) charArrayReader0);
      String string0 = IOUtils.toString((Reader) charArrayReader0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0, 3, 0);
      byte[] byteArray0 = IOUtils.toByteArray((Reader) charArrayReader0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.wicket.util.io.IOUtils", "org.apache.wicket.util.io.IOUtils");
      MockFileReader mockFileReader0 = new MockFileReader(file0);
      MockFileWriter mockFileWriter0 = new MockFileWriter("org.apache.wicket.util.io.IOUtils");
      int int0 = IOUtils.copy((Reader) mockFileReader0, (Writer) mockFileWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.write(charArray0, (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.io.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[3];
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        IOUtils.write(charArray0, (Writer) pipedWriter0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[4];
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("!Ihh/s V");
      mockFileOutputStream0.close();
      try { 
        IOUtils.write(charArray0, (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        IOUtils.write(byteArray0, (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.io.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        IOUtils.write(byteArray0, (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.io.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("!Ihh/s V");
      byte[] byteArray0 = new byte[0];
      try { 
        IOUtils.write(byteArray0, (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileReader mockFileReader0 = new MockFileReader(fileDescriptor0);
      // Undeclared exception!
      try { 
        IOUtils.toString((Reader) mockFileReader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.toString((InputStream) null, "blY8^ebIisn");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        IOUtils.toString((InputStream) sequenceInputStream0, "");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.toString((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.toCharArray((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.io.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Charset charset0 = Charset.defaultCharset();
      InputStreamReader inputStreamReader0 = new InputStreamReader(pipedInputStream0, charset0);
      try { 
        IOUtils.toCharArray((Reader) inputStreamReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        IOUtils.toCharArray((InputStream) pipedInputStream0, "");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        IOUtils.toCharArray((InputStream) pipedInputStream0, (String) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        IOUtils.toCharArray((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      try { 
        IOUtils.toByteArray((Reader) charArrayReader0, "");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      InputStreamReader inputStreamReader0 = new InputStreamReader(pipedInputStream0);
      try { 
        IOUtils.toByteArray((Reader) inputStreamReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-80), 1495);
      // Undeclared exception!
      try { 
        IOUtils.toByteArray((InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        IOUtils.toByteArray((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      // Undeclared exception!
      try { 
        IOUtils.copy((Reader) null, (Writer) pipedWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.io.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      PipedReader pipedReader0 = new PipedReader(2);
      try { 
        IOUtils.copy((Reader) pipedReader0, (Writer) stringWriter0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("LvI:{=E$v2#BX");
      try { 
        IOUtils.copy((Reader) null, (OutputStream) mockFileOutputStream0, "LvI:{=E$v2#BX");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockFile mockFile0 = new MockFile("closing resource failed: ", "closing resource failed: ");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      PipedReader pipedReader0 = new PipedReader();
      try { 
        IOUtils.copy((Reader) pipedReader0, (OutputStream) mockPrintStream0, (String) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.wicket.util.io.IOUtils", "org.apache.wicket.util.io.IOUtils");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(mockFileInputStream0, mockFileInputStream0);
      try { 
        IOUtils.copy((InputStream) sequenceInputStream0, (OutputStream) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.contentEquals((Reader) null, (Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.wicket.util.io.IOUtils", "org.apache.wicket.util.io.IOUtils");
      MockFileReader mockFileReader0 = new MockFileReader(file0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("vr<dMp~ S7lW?", false);
      IOUtils.copy((Reader) mockFileReader0, (OutputStream) mockFileOutputStream0, (String) null);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("org.apache.wicket.util.io.IOUtils");
      char[] charArray0 = new char[7];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = IOUtils.copy((Reader) charArrayReader0, (Writer) mockFileWriter0);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      // Undeclared exception!
      try { 
        IOUtils.write(stringBuilder0, (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.io.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.write("-&;)}[", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.io.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("V}}oRF");
      BufferedWriter bufferedWriter0 = new BufferedWriter(mockPrintWriter0);
      IOUtils.close(bufferedWriter0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MockFile mockFile0 = new MockFile("!Ihh/s V");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0, false);
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      IOUtils.copy((InputStream) sequenceInputStream0, (Writer) mockFileWriter0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Charset charset0 = Charset.defaultCharset();
      InputStreamReader inputStreamReader0 = new InputStreamReader(pipedInputStream0, charset0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        IOUtils.copy((Reader) inputStreamReader0, (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0, 3, 2538);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      boolean boolean0 = IOUtils.contentEquals((Reader) charArrayReader0, (Reader) charArrayReader1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0, 3, 3);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      boolean boolean0 = IOUtils.contentEquals((Reader) charArrayReader1, (Reader) charArrayReader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.wicket.util.io.IOUtils", "org.apache.wicket.util.io.IOUtils");
      MockFileReader mockFileReader0 = new MockFileReader(file0);
      boolean boolean0 = IOUtils.contentEquals((Reader) mockFileReader0, (Reader) mockFileReader0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      LineNumberReader lineNumberReader0 = new LineNumberReader(pipedReader0);
      try { 
        IOUtils.contentEquals((Reader) lineNumberReader0, (Reader) lineNumberReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.wicket.util.io.IOUtils", "org.apache.wicket.util.io.IOUtils");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      boolean boolean0 = IOUtils.contentEquals((InputStream) mockFileInputStream0, (InputStream) mockFileInputStream0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(3);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      try { 
        IOUtils.contentEquals((InputStream) bufferedInputStream0, (InputStream) dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.copy((Reader) null, (OutputStream) null, "org.apache.commons.io.filefilter.EmptyFileFilter");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      IOUtils.toByteArray((InputStream) byteArrayInputStream0);
      char[] charArray0 = IOUtils.toCharArray((InputStream) byteArrayInputStream0);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.wicket.util.io.IOUtils", "org.apache.wicket.util.io.IOUtils");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      byte[] byteArray0 = IOUtils.toByteArray((InputStream) mockFileInputStream0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.wicket.util.io.IOUtils", "org.apache.wicket.util.io.IOUtils");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      StringBuilder stringBuilder0 = new StringBuilder();
      try { 
        IOUtils.write(stringBuilder0, (OutputStream) mockPrintStream0, "");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      IOUtils.write((StringBuilder) null, (OutputStream) mockPrintStream0, "Oj{g{U");
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.io.filefilter.HiddenFileFilter");
      StringBuilder stringBuilder0 = new StringBuilder("org.apache.commons.io.filefilter.HiddenFileFilter");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      IOUtils.write(stringBuilder0, (OutputStream) mockPrintStream0, (String) null);
      assertEquals(49L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      // Undeclared exception!
      try { 
        IOUtils.write(stringBuilder0, (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.io.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.wicket.util.io.IOUtils", "org.apache.wicket.util.io.IOUtils");
      MockFileWriter mockFileWriter0 = new MockFileWriter(file0);
      IOUtils.write((StringBuilder) null, (Writer) mockFileWriter0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.wicket.util.io.IOUtils", "org.apache.wicket.util.io.IOUtils");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      IOUtils.write((String) null, (OutputStream) mockPrintStream0, "org.apache.wicket.util.io.IOUtils");
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.write("org.apache.wicket.util.io.IOUtils", (OutputStream) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.io.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      java.io.ByteArrayOutputStream byteArrayOutputStream0 = new java.io.ByteArrayOutputStream(0);
      IOUtils.write((String) null, (OutputStream) byteArrayOutputStream0);
      assertEquals("", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      File file0 = MockFile.createTempFile("s(5Z2,<F/*J}#'w[", "org.apache.commons.io.filefilter.CanReadFileFilter", (File) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      IOUtils.write("", (Writer) mockPrintWriter0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      MockFile mockFile0 = new MockFile("!Ihh/s V");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      IOUtils.write((String) null, (Writer) mockPrintWriter0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      char[] charArray0 = new char[9];
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        IOUtils.write(charArray0, (OutputStream) pipedOutputStream0, "Oj{g{U");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      char[] charArray0 = new char[4];
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        IOUtils.write(charArray0, (OutputStream) pipedOutputStream0, (String) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      IOUtils.write((char[]) null, (OutputStream) pipedOutputStream0, (String) null);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      char[] charArray0 = new char[7];
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("!Ihh/s V");
      IOUtils.write(charArray0, (OutputStream) mockFileOutputStream0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("8xCAvM");
      IOUtils.write((char[]) null, (OutputStream) mockFileOutputStream0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      char[] charArray0 = new char[7];
      MockFile mockFile0 = new MockFile("C~N?%qvg)=V1", "C~N?%qvg)=V1");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      IOUtils.write(charArray0, (Writer) mockPrintWriter0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("org.apache.wicket.util.io.IOUtils");
      IOUtils.write((char[]) null, (Writer) mockFileWriter0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("3*['f:~J*n?b");
      byte[] byteArray0 = new byte[1];
      IOUtils.write(byteArray0, (Writer) mockPrintWriter0, (String) null);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("C~N?%qvg)=V1");
      try { 
        IOUtils.write(byteArray0, (Writer) mockPrintWriter0, "IJ&aZjL{}CbkU@\"(RfC");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("Xp+");
      IOUtils.write((byte[]) null, (Writer) mockPrintWriter0, "");
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("V}}oRF");
      IOUtils.write(byteArray0, (Writer) mockPrintWriter0);
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("V}}oRF");
      IOUtils.write((byte[]) null, (Writer) mockPrintWriter0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("!Ihh/s V");
      byte[] byteArray0 = new byte[1];
      IOUtils.write(byteArray0, (OutputStream) mockFileOutputStream0);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("!Ihh/s V");
      IOUtils.write((byte[]) null, (OutputStream) mockFileOutputStream0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      IOUtils.toString((Reader) charArrayReader0);
      char[] charArray1 = IOUtils.toCharArray((Reader) charArrayReader0);
      assertEquals(0, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(4);
      try { 
        IOUtils.toString((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.toCharArray((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.toCharArray((InputStream) null, "closing resource failed: ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      char[] charArray1 = IOUtils.toCharArray((Reader) charArrayReader0);
      assertEquals(9, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.toByteArray((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.io.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.wicket.util.io.IOUtils", "org.apache.wicket.util.io.IOUtils");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      IOUtils.closeQuietly(dataInputStream0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.wicket.util.io.IOUtils", "org.apache.wicket.util.io.IOUtils");
      MockFileReader mockFileReader0 = new MockFileReader(file0);
      byte[] byteArray0 = IOUtils.toByteArray((Reader) mockFileReader0, (String) null);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.toByteArray((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.io.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = IOUtils.toString((InputStream) sequenceInputStream0, (String) null);
      assertEquals("", string0);
  }
}
