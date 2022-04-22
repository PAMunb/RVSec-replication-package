/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:27:59 GMT 2022
 */

package org.apache.tika.fork;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import org.apache.tika.fork.ContentHandlerResource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import org.xml.sax.ContentHandler;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.helpers.XMLReaderAdapter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ContentHandlerResource_ESTest extends ContentHandlerResource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLFilterImpl0);
      // Undeclared exception!
      try { 
        contentHandlerResource0.process(dataInputStream0, (DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte) (-34);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(".*");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl((XMLReader) null);
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLFilterImpl0);
      // Undeclared exception!
      try { 
        contentHandlerResource0.process(dataInputStream0, dataOutputStream0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.fork.ContentHandlerResource", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource((ContentHandler) null);
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-15), 7);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        contentHandlerResource0.process(dataInputStream0, (DataOutputStream) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLFilterImpl0);
      try { 
        contentHandlerResource0.process(dataInputStream0, (DataOutputStream) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      byte[] byteArray0 = new byte[8];
      byteArray0[5] = (byte) (-20);
      byteArray0[1] = (byte)8;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(".*");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLFilterImpl0);
      contentHandlerResource0.process(dataInputStream0, dataOutputStream0);
      try { 
        contentHandlerResource0.process(dataInputStream0, dataOutputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLFilterImpl0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)4;
      byteArray0[1] = (byte)4;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      contentHandlerResource0.process(dataInputStream0, (DataOutputStream) null);
      assertEquals(1, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(defaultHandler2_0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      contentHandlerResource0.process(dataInputStream0, (DataOutputStream) null);
      assertEquals(4, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      byte[] byteArray0 = new byte[18];
      byteArray0[1] = (byte)8;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(".*");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLFilterImpl0);
      contentHandlerResource0.process(dataInputStream0, dataOutputStream0);
      contentHandlerResource0.process(dataInputStream0, dataOutputStream0);
      assertEquals(12, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[27];
      byteArray0[8] = (byte)5;
      byteArray0[1] = (byte)5;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(".*");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl((XMLReader) null);
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLFilterImpl0);
      contentHandlerResource0.process(dataInputStream0, dataOutputStream0);
      try { 
        contentHandlerResource0.process(dataInputStream0, dataOutputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[27];
      byteArray0[1] = (byte)5;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(".*");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl((XMLReader) null);
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLFilterImpl0);
      contentHandlerResource0.process(dataInputStream0, dataOutputStream0);
      contentHandlerResource0.process(dataInputStream0, dataOutputStream0);
      assertEquals(18, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)3;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLFilterImpl0);
      try { 
        contentHandlerResource0.process(dataInputStream0, (DataOutputStream) null);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLFilterImpl0);
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)2;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)36);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      contentHandlerResource0.process(dataInputStream0, (DataOutputStream) null);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      Throwable throwable0 = contentHandlerResource0.process(dataInputStream0, dataOutputStream0);
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter(xMLFilterImpl0);
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLReaderAdapter0);
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      contentHandlerResource0.process(dataInputStream0, (DataOutputStream) null);
      Throwable throwable0 = contentHandlerResource0.process(dataInputStream0, (DataOutputStream) null);
      assertNull(throwable0);
  }
}
