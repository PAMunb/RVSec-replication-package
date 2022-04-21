/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 15:36:29 GMT 2022
 */

package org.apache.tika.mime;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.List;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.mime.MimeType;
import org.apache.tika.mime.MimeTypes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MimeTypes_ESTest extends MimeTypes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MediaType mediaType0 = new MediaType("application/xml", "(aZ~&M");
      MimeType mimeType0 = new MimeType(mediaType0);
      mimeTypes0.setSuperType(mimeType0, mediaType0);
      assertEquals("application/xml/(az~&m", mimeType0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Metadata metadata0 = new Metadata();
      MediaType mediaType0 = mimeTypes0.detect(byteArrayInputStream0, metadata0);
      MimeType mimeType0 = mimeTypes0.getMimeType("coverage");
      mimeTypes0.addAlias(mimeType0, mediaType0);
      assertEquals(65536, mimeTypes0.getMinLength());
      assertEquals("application/octet-stream", mediaType0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      mimeTypes0.init();
      assertEquals(65536, mimeTypes0.getMinLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      Metadata metadata0 = new Metadata();
      metadata0.set("Content-Type", ">>b7Ae>");
      MediaType mediaType0 = mimeTypes0.detect((InputStream) null, metadata0);
      assertEquals("octet-stream", mediaType0.getSubtype());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MediaType mediaType0 = MediaType.APPLICATION_XML;
      MimeType mimeType0 = new MimeType(mediaType0);
      mimeTypes0.addPattern(mimeType0, "7$[SGb9,Ft|]\"uLvcO`");
      assertFalse(mimeType0.hasMagic());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = mimeTypes0.readMagicHeader(byteArrayInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = mimeTypes0.readMagicHeader(sequenceInputStream0);
      assertEquals(0, byteArray0.length);
      assertEquals(65536, mimeTypes0.getMinLength());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        mimeTypes0.readMagicHeader(dataInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-353), 65536);
      // Undeclared exception!
      try { 
        mimeTypes0.readMagicHeader(byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      try { 
        mimeTypes0.readMagicHeader(pushbackInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      // Undeclared exception!
      try { 
        mimeTypes0.getMimeType((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Name is missing
         //
         verifyException("org.apache.tika.mime.Patterns", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ClassLoader classLoader1 = classLoader0.getParent();
      // Undeclared exception!
      try { 
        MimeTypes.getDefaultMimeTypes(classLoader1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0);
      Metadata metadata0 = new Metadata();
      // Undeclared exception!
      try { 
        mimeTypes0.detect(bufferedInputStream0, metadata0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      Metadata metadata0 = new Metadata();
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-126), 13);
      // Undeclared exception!
      try { 
        mimeTypes0.detect(byteArrayInputStream0, metadata0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      Metadata metadata0 = new Metadata();
      try { 
        mimeTypes0.detect(mockFileInputStream0, metadata0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // mark/reset not supported
         //
         verifyException("java.io.InputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      // Undeclared exception!
      try { 
        mimeTypes0.addPattern((MimeType) null, "coverage", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pattern and/or mime type is missing
         //
         verifyException("org.apache.tika.mime.Patterns", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      // Undeclared exception!
      try { 
        mimeTypes0.addAlias((MimeType) null, (MediaType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.mime.MimeTypes", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      // Undeclared exception!
      try { 
        mimeTypes0.add((MimeType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      MimeTypes.getDefaultMimeTypes(classLoader0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      MimeTypes.getDefaultMimeTypes((ClassLoader) null);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeType mimeType0 = mimeTypes0.forName("text/html");
      assertNotNull(mimeType0);
      assertEquals("text/html", mimeType0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeType mimeType0 = mimeTypes0.forName("application/octet-stream");
      assertEquals("application/octet-stream", mimeType0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      byte[] byteArray0 = new byte[1];
      List<MimeType> list0 = mimeTypes0.getMimeType(byteArray0);
      assertEquals(65536, mimeTypes0.getMinLength());
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      byte[] byteArray0 = new byte[0];
      List<MimeType> list0 = mimeTypes0.getMimeType(byteArray0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      int int0 = mimeTypes0.getMinLength();
      assertEquals(65536, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeType mimeType0 = mimeTypes0.getMimeType("!S");
      mimeTypes0.addPattern(mimeType0, "\"Hw]P8RAg%C<L<?V", false);
      assertEquals("", mimeType0.getDescription());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MediaType mediaType0 = MediaType.OCTET_STREAM;
      // Undeclared exception!
      try { 
        mimeTypes0.setSuperType((MimeType) null, mediaType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.mime.MimeTypes", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      Metadata metadata0 = new Metadata();
      metadata0.set("Content-Type", "text/plain");
      MediaType mediaType0 = mimeTypes0.detect((InputStream) null, metadata0);
      assertEquals("text", mediaType0.getType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      mimeTypes0.getMimeType("text/plain");
      // Undeclared exception!
      mimeTypes0.getMimeType((File) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeType mimeType0 = mimeTypes0.getRegisteredMimeType("application/xml");
      assertNotNull(mimeType0);
      
      mimeTypes0.add(mimeType0);
      assertEquals("application/xml", mimeType0.getName());
      assertEquals("application/xml", mimeType0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeType mimeType0 = mimeTypes0.getRegisteredMimeType("text/html");
      assertNull(mimeType0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      try { 
        mimeTypes0.getRegisteredMimeType("9");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid media type name: 9
         //
         verifyException("org.apache.tika.mime.MimeTypes", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      try { 
        mimeTypes0.forName("R3");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid media type name: R3
         //
         verifyException("org.apache.tika.mime.MimeTypes", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      // Undeclared exception!
      try { 
        mimeTypes0.readMagicHeader((InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // InputStream is missing
         //
         verifyException("org.apache.tika.mime.MimeTypes", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        mimeTypes0.detect(byteArrayInputStream0, (Metadata) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.mime.MimeTypes", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      // Undeclared exception!
      try { 
        mimeTypes0.getMimeType((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Data is missing
         //
         verifyException("org.apache.tika.mime.MimeTypes", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MediaTypeRegistry mediaTypeRegistry0 = mimeTypes0.getMediaTypeRegistry();
      assertNotNull(mediaTypeRegistry0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      MimeTypes.getDefaultMimeTypes();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      // Undeclared exception!
      try { 
        mimeTypes0.addPattern((MimeType) null, "OPEN_CHOICE");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pattern and/or mime type is missing
         //
         verifyException("org.apache.tika.mime.Patterns", e);
      }
  }
}
