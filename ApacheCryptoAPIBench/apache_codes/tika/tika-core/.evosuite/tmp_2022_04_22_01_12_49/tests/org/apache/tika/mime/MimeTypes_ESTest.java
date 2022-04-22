/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:17:45 GMT 2022
 */

package org.apache.tika.mime;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.List;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.mime.MimeType;
import org.apache.tika.mime.MimeTypes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MimeTypes_ESTest extends MimeTypes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeType mimeType0 = mimeTypes0.getMimeType("K");
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Metadata metadata0 = new Metadata();
      MediaType mediaType0 = mimeTypes0.detect(byteArrayInputStream0, metadata0);
      mimeTypes0.setSuperType(mimeType0, mediaType0);
      assertEquals(65536, mimeTypes0.getMinLength());
      assertEquals("application/octet-stream", mediaType0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MediaType mediaType0 = MediaType.TEXT_HTML;
      MimeType mimeType0 = new MimeType(mediaType0);
      mimeTypes0.addPattern(mimeType0, "6", true);
      assertEquals("", mimeType0.getUniformTypeIdentifier());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeType mimeType0 = mimeTypes0.getMimeType("#g");
      mimeTypes0.addAlias(mimeType0, (MediaType) null);
      assertEquals("application/octet-stream", mimeType0.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      mimeTypes0.init();
      assertEquals(65536, mimeTypes0.getMinLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeType mimeType0 = mimeTypes0.getMimeType("#g");
      mimeTypes0.addPattern(mimeType0, "N_~r6_;");
      assertEquals("application/octet-stream", mimeType0.getName());
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
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-19), (byte) (-31));
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      byte[] byteArray1 = mimeTypes0.readMagicHeader(sequenceInputStream0);
      assertEquals(65536, mimeTypes0.getMinLength());
      assertEquals(0, byteArray1.length);
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
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        mimeTypes0.readMagicHeader(pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      // Undeclared exception!
      try { 
        mimeTypes0.detect((InputStream) null, (Metadata) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.mime.MimeTypes", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      Metadata metadata0 = new Metadata();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0, 1);
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
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-450), (byte)9);
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
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Metadata metadata0 = new Metadata();
      try { 
        mimeTypes0.detect(pipedInputStream0, metadata0);
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
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      // Undeclared exception!
      MimeTypes.getDefaultMimeTypes((ClassLoader) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeType mimeType0 = mimeTypes0.forName("cryRM9n/c#0WFXZ_`K");
      assertNotNull(mimeType0);
      assertEquals("cryrm9n/c#0wfxz_`k", mimeType0.getName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      try { 
        mimeTypes0.forName((String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid media type name: null
         //
         verifyException("org.apache.tika.mime.MimeTypes", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeType mimeType0 = mimeTypes0.forName("application/xml");
      assertEquals("application/xml", mimeType0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      byte[] byteArray0 = new byte[2];
      List<MimeType> list0 = mimeTypes0.getMimeType(byteArray0);
      assertFalse(list0.isEmpty());
      assertEquals(65536, mimeTypes0.getMinLength());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      byte[] byteArray0 = new byte[0];
      List<MimeType> list0 = mimeTypes0.getMimeType(byteArray0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      int int0 = mimeTypes0.getMinLength();
      assertEquals(65536, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      // Undeclared exception!
      try { 
        mimeTypes0.addPattern((MimeType) null, "", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pattern and/or mime type is missing
         //
         verifyException("org.apache.tika.mime.Patterns", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Metadata metadata0 = new Metadata();
      MediaType mediaType0 = mimeTypes0.detect(byteArrayInputStream0, metadata0);
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
  public void test26()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeType mimeType0 = mimeTypes0.getRegisteredMimeType("application/octet-stream");
      assertNotNull(mimeType0);
      assertEquals("application/octet-stream", mimeType0.getName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeType mimeType0 = mimeTypes0.getRegisteredMimeType("6#osd/pT'%");
      assertNull(mimeType0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      try { 
        mimeTypes0.getRegisteredMimeType((String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid media type name: null
         //
         verifyException("org.apache.tika.mime.MimeTypes", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      Metadata metadata0 = new Metadata();
      metadata0.add("Content-Type", "_W{o=");
      MediaType mediaType0 = mimeTypes0.detect((InputStream) null, metadata0);
      assertEquals("application/octet-stream", mediaType0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MimeType mimeType0 = mimeTypes0.getMimeType("");
      mimeType0.addRootXML("application/xml", "");
      mimeTypes0.add(mimeType0);
      assertEquals("", mimeType0.getExtension());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MediaTypeRegistry mediaTypeRegistry0 = mimeTypes0.getMediaTypeRegistry();
      assertNotNull(mediaTypeRegistry0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      MimeTypes.getDefaultMimeTypes();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      // Undeclared exception!
      try { 
        mimeTypes0.addPattern((MimeType) null, "70iU,[_$9\u0007icU4S");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pattern and/or mime type is missing
         //
         verifyException("org.apache.tika.mime.Patterns", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MimeTypes mimeTypes0 = new MimeTypes();
      MockFile mockFile0 = new MockFile(";K{");
      // Undeclared exception!
      mimeTypes0.getMimeType((File) mockFile0);
  }
}
