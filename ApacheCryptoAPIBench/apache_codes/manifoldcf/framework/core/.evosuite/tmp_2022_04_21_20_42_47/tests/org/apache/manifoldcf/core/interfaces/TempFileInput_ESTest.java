/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:55:35 GMT 2022
 */

package org.apache.manifoldcf.core.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import org.apache.manifoldcf.core.interfaces.BinaryInput;
import org.apache.manifoldcf.core.interfaces.TempFileInput;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TempFileInput_ESTest extends TempFileInput_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Supposed directory '");
      TempFileInput tempFileInput0 = null;
      try {
        tempFileInput0 = new TempFileInput(mockFile0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.system.ManifoldCF", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      TempFileInput tempFileInput0 = null;
      try {
        tempFileInput0 = new TempFileInput(byteArrayInputStream0, 3310L, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.system.ManifoldCF", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      TempFileInput tempFileInput0 = null;
      try {
        tempFileInput0 = new TempFileInput(pushbackInputStream0, 65536, 1181);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TempFileInput tempFileInput0 = new TempFileInput();
      MockFile mockFile0 = new MockFile("c9zVj,A[M@8!-z@M:v%");
      tempFileInput0.file = (File) mockFile0;
      try { 
        tempFileInput0.openStream();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Can't create stream: null
         //
         verifyException("org.apache.manifoldcf.core.interfaces.TempFileInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.shouldAllThrowIOExceptions();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-70), (byte)0);
      TempFileInput tempFileInput0 = null;
      try {
        tempFileInput0 = new TempFileInput(byteArrayInputStream0, (byte)0, (byte)0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // IO exception while creating backing file: Simulated IOException
         //
         verifyException("org.apache.manifoldcf.core.interfaces.BinaryInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      TempFileInput tempFileInput0 = null;
      try {
        tempFileInput0 = new TempFileInput(pipedInputStream0, (byte) (-22), (byte) (-22));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TempFileInput tempFileInput0 = null;
      try {
        tempFileInput0 = new TempFileInput((InputStream) null, 2862933555777941757L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.TempFileInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      TempFileInput tempFileInput0 = null;
      try {
        tempFileInput0 = new TempFileInput(pipedInputStream0, (-18L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      TempFileInput tempFileInput0 = null;
      try {
        tempFileInput0 = new TempFileInput(pipedInputStream0, 15000L);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TempFileInput tempFileInput0 = null;
      try {
        tempFileInput0 = new TempFileInput((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.TempFileInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-49), 1073741823);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      TempFileInput tempFileInput0 = null;
      try {
        tempFileInput0 = new TempFileInput(pushbackInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      TempFileInput tempFileInput0 = null;
      try {
        tempFileInput0 = new TempFileInput(pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TempFileInput tempFileInput0 = new TempFileInput();
      tempFileInput0.calculateLength();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TempFileInput tempFileInput0 = new TempFileInput();
      File file0 = MockFile.createTempFile("opening backing file", "c9zVj,A[M@8!-z@M:v%");
      tempFileInput0.file = file0;
      tempFileInput0.calculateLength();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TempFileInput tempFileInput0 = new TempFileInput((InputStream) null, 0L);
      tempFileInput0.calculateLength();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TempFileInput tempFileInput0 = new TempFileInput((InputStream) null, 0L);
      BinaryInput binaryInput0 = tempFileInput0.transfer();
      tempFileInput0.openStream();
      assertNotSame(tempFileInput0, binaryInput0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TempFileInput tempFileInput0 = new TempFileInput();
      File file0 = MockFile.createTempFile("opening backing file", "c9zVj,A[M@8!-z@M:v%");
      tempFileInput0.file = file0;
      tempFileInput0.openStream();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      TempFileInput tempFileInput0 = new TempFileInput(pushbackInputStream0);
      InputStream inputStream0 = tempFileInput0.getStream();
      assertEquals(1, inputStream0.available());
      assertNotNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TempFileInput tempFileInput0 = new TempFileInput();
      MockFile mockFile0 = new MockFile("@(#)$Id$");
      tempFileInput0.file = (File) mockFile0;
      // Undeclared exception!
      try { 
        tempFileInput0.discard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.system.ManifoldCF", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TempFileInput tempFileInput0 = new TempFileInput((InputStream) null, 0L);
      tempFileInput0.discard();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 125, (byte) (-58));
      TempFileInput tempFileInput0 = new TempFileInput(byteArrayInputStream0, 2614L, (byte)36);
  }
}
