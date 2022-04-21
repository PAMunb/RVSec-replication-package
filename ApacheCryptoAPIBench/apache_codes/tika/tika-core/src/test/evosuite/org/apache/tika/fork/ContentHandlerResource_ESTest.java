/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 15:46:45 GMT 2022
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
import java.io.SequenceInputStream;
import org.apache.tika.fork.ContentHandlerResource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLFilterImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ContentHandlerResource_ESTest extends ContentHandlerResource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultHandler defaultHandler0 = new DefaultHandler();
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(defaultHandler0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
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
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLFilterImpl0);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-832), (byte)4);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      // Undeclared exception!
      try { 
        contentHandlerResource0.process(dataInputStream0, (DataOutputStream) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource((ContentHandler) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream(3218);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      try { 
        contentHandlerResource0.process(dataInputStream0, dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLFilterImpl0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)40;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      contentHandlerResource0.process(dataInputStream0, (DataOutputStream) null);
      assertEquals(1, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLFilterImpl0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      contentHandlerResource0.process(dataInputStream0, (DataOutputStream) null);
      assertEquals(3, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLFilterImpl0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)4;
      byteArray0[2] = (byte)7;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      contentHandlerResource0.process(dataInputStream0, (DataOutputStream) null);
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
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)6;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLFilterImpl0);
      contentHandlerResource0.process(dataInputStream0, (DataOutputStream) null);
      assertEquals(5, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLFilterImpl0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)5;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
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
  public void test08()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLFilterImpl0);
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)2;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, 2);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      Throwable throwable0 = contentHandlerResource0.process(dataInputStream0, dataOutputStream0);
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultHandler defaultHandler0 = new DefaultHandler();
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(defaultHandler0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      Throwable throwable0 = contentHandlerResource0.process(dataInputStream0, (DataOutputStream) null);
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      ContentHandlerResource contentHandlerResource0 = new ContentHandlerResource(xMLFilterImpl0);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      contentHandlerResource0.process(dataInputStream0, (DataOutputStream) null);
      assertEquals(5, byteArrayInputStream0.available());
  }
}