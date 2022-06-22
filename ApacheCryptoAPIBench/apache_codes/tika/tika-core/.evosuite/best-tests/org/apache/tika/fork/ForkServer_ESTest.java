/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:30:15 GMT 2022
 */

package org.apache.tika.fork;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.fork.InputStreamProxy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ForkServer_ESTest extends ForkServer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(3551);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      ForkServer forkServer0 = new ForkServer(dataInputStream0, (OutputStream) null, 3551);
      forkServer0.processRequests();
      assertEquals(0L, forkServer0.getValue());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(8);
      ForkServer forkServer0 = new ForkServer((InputStream) null, byteArrayOutputStream0, (-1621L));
      // Undeclared exception!
      try { 
        forkServer0.run();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout value is negative
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      try { 
        ForkServer.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.fork.ForkServer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 5);
      ForkServer forkServer0 = new ForkServer(pipedInputStream0, pipedOutputStream0, 5);
      // Undeclared exception!
      try { 
        forkServer0.run();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[1];
      try { 
        ForkServer.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Long", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ForkServer.main(stringArray0);
      // Undeclared exception!
      try { 
        ForkServer.main(stringArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // factory already defined
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      InputStreamProxy inputStreamProxy0 = new InputStreamProxy(42);
      ForkServer forkServer0 = new ForkServer(inputStreamProxy0, (OutputStream) null, 0L);
      forkServer0.update((byte[]) null, 42, 9);
      assertEquals(0L, forkServer0.getValue());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      InputStreamProxy inputStreamProxy0 = new InputStreamProxy(42);
      ForkServer forkServer0 = new ForkServer(inputStreamProxy0, (OutputStream) null, 0L);
      forkServer0.reset();
      assertEquals(0L, forkServer0.getValue());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      InputStreamProxy inputStreamProxy0 = new InputStreamProxy(42);
      ForkServer forkServer0 = new ForkServer(inputStreamProxy0, (OutputStream) null, 0L);
      forkServer0.update((-2258));
      assertEquals(0L, forkServer0.getValue());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      InputStreamProxy inputStreamProxy0 = new InputStreamProxy(42);
      ForkServer forkServer0 = new ForkServer(inputStreamProxy0, (OutputStream) null, 0L);
      long long0 = forkServer0.getValue();
      assertEquals(0L, long0);
  }
}