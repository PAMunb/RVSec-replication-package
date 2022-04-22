/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:33:12 GMT 2022
 */

package org.apache.tika.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.tika.io.LookaheadInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LookaheadInputStream_ESTest extends LookaheadInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1078);
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream(byteArrayInputStream0, 511);
      lookaheadInputStream0.skip(1078);
      lookaheadInputStream0.read();
      lookaheadInputStream0.read();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-33);
      byteArray0[2] = (byte) (-123);
      byteArray0[3] = (byte) (-21);
      byteArray0[4] = (byte)4;
      byteArray0[5] = (byte)50;
      byteArray0[6] = (byte)76;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream(byteArrayInputStream0, 34);
      lookaheadInputStream0.read();
      lookaheadInputStream0.available();
      lookaheadInputStream0.available();
      lookaheadInputStream0.available();
      lookaheadInputStream0.read();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1078);
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream(byteArrayInputStream0, 511);
      lookaheadInputStream0.read();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)52;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte) (-81);
      byteArray0[3] = (byte)46;
      byteArray0[4] = (byte)2;
      pipedOutputStream0.write(byteArray0, 4, (int) (byte)1);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)85;
      byteArray1[1] = (byte) (-2);
      byteArray1[2] = (byte) (-1);
      byteArray1[3] = (byte)0;
      pipedOutputStream0.write(byteArray1);
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream(dataInputStream0, 1600);
      lookaheadInputStream0.markSupported();
      byte[] byteArray2 = new byte[0];
      lookaheadInputStream0.read();
      // Undeclared exception!
      try { 
        lookaheadInputStream0.read(byteArray2, (-1367), (-1367));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream((InputStream) null, 508);
      lookaheadInputStream0.skip((-976L));
      LookaheadInputStream lookaheadInputStream1 = new LookaheadInputStream(lookaheadInputStream0, 508);
      // Undeclared exception!
      try { 
        lookaheadInputStream1.skip((-976L));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream((InputStream) null, 0);
      byte[] byteArray0 = new byte[2];
      lookaheadInputStream0.read(byteArray0);
      lookaheadInputStream0.skip((-1L));
      lookaheadInputStream0.skip((-1));
      // Undeclared exception!
      try { 
        lookaheadInputStream0.read();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("org.apache.tika.io.LookaheadInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream(sequenceInputStream0, 0);
      byte[] byteArray0 = new byte[8];
      int int0 = lookaheadInputStream0.read(byteArray0, 0, (-1));
      sequenceInputStream0.skip((-1));
      LookaheadInputStream lookaheadInputStream1 = new LookaheadInputStream(lookaheadInputStream0, 673);
      int int1 = lookaheadInputStream1.read();
      assertEquals(0, lookaheadInputStream0.available());
      assertEquals(0, lookaheadInputStream1.available());
      assertTrue(int1 == int0);
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream(sequenceInputStream0, 0);
      byte[] byteArray0 = new byte[8];
      lookaheadInputStream0.read(byteArray0, 0, (-1));
      sequenceInputStream0.skip((-1));
      lookaheadInputStream0.read(byteArray0);
      lookaheadInputStream0.read(byteArray0, (int) (byte) (-92), (int) (byte)25);
      lookaheadInputStream0.skip((-1L));
      assertEquals(1, lookaheadInputStream0.available());
      
      lookaheadInputStream0.skip((byte)25);
      lookaheadInputStream0.reset();
      assertEquals(0, lookaheadInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream((InputStream) null, 0);
      byte[] byteArray0 = new byte[3];
      lookaheadInputStream0.read(byteArray0);
      lookaheadInputStream0.skip((-1));
      // Undeclared exception!
      try { 
        lookaheadInputStream0.read(byteArray0, (-1), 1324);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream((InputStream) null, 508);
      lookaheadInputStream0.skip((-976L));
      LookaheadInputStream lookaheadInputStream1 = new LookaheadInputStream(lookaheadInputStream0, 508);
      // Undeclared exception!
      try { 
        lookaheadInputStream1.read();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream(pipedInputStream0, 4);
      byte[] byteArray0 = new byte[1];
      lookaheadInputStream0.reset();
      byteArray0[0] = (byte)123;
      try { 
        lookaheadInputStream0.read(byteArray0, 4, (int) (byte)123);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream((InputStream) null, 508);
      lookaheadInputStream0.skip((-976L));
      // Undeclared exception!
      try { 
        lookaheadInputStream0.read();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -976
         //
         verifyException("org.apache.tika.io.LookaheadInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      LookaheadInputStream lookaheadInputStream0 = null;
      try {
        lookaheadInputStream0 = new LookaheadInputStream(dataInputStream0, 13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream((InputStream) null, 673);
      boolean boolean0 = lookaheadInputStream0.markSupported();
      assertEquals(0, lookaheadInputStream0.available());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      sequenceInputStream0.skip(0L);
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream(sequenceInputStream0, 0);
      int int0 = lookaheadInputStream0.available();
      assertEquals(0, int0);
      
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-88);
      byteArray0[1] = (byte)31;
      byteArray0[2] = (byte) (-5);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-47);
      byteArray0[5] = (byte) (-10);
      byteArray0[6] = (byte)0;
      int int1 = lookaheadInputStream0.read(byteArray0, (int) (byte) (-88), 0);
      lookaheadInputStream0.markSupported();
      lookaheadInputStream0.read();
      boolean boolean0 = lookaheadInputStream0.markSupported();
      assertTrue(boolean0);
      
      int int2 = lookaheadInputStream0.read();
      assertTrue(int2 == int1);
      assertEquals((-1), int2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream(bufferedInputStream0, 0);
      lookaheadInputStream0.reset();
      lookaheadInputStream0.close();
      lookaheadInputStream0.mark(0);
      int int0 = lookaheadInputStream0.read();
      assertEquals(0, lookaheadInputStream0.available());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1078);
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream(pipedInputStream0, 1078);
      assertEquals(0, lookaheadInputStream0.available());
      
      try { 
        lookaheadInputStream0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // mark/reset not supported
         //
         verifyException("java.io.InputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1078);
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream(pipedInputStream0, 63);
      try { 
        lookaheadInputStream0.skip(1078);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1078);
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream(pipedInputStream0, 1078);
      try { 
        lookaheadInputStream0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream(pipedInputStream0, 664);
      lookaheadInputStream0.mark(664);
      try { 
        lookaheadInputStream0.skip(1324L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream((InputStream) null, 0);
      lookaheadInputStream0.mark(0);
      assertEquals(0, lookaheadInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream((InputStream) null, 2817);
      assertEquals(0, lookaheadInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)46;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)46;
      sequenceInputStream0.read(byteArray0, 0, (int) (byte)0);
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream(dataInputStream0, 0);
      int int0 = lookaheadInputStream0.available();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream((InputStream) null, 0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-29);
      byteArray0[1] = (byte) (-80);
      lookaheadInputStream0.read(byteArray0);
      lookaheadInputStream0.skip((-1L));
      lookaheadInputStream0.skip(0L);
      // Undeclared exception!
      try { 
        lookaheadInputStream0.read(byteArray0, 1591, (int) (byte) (-80));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream((InputStream) null, 0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-92);
      lookaheadInputStream0.read(byteArray0);
      lookaheadInputStream0.skip((-1L));
      long long0 = lookaheadInputStream0.skip(0L);
      assertEquals(1, lookaheadInputStream0.available());
      assertEquals(0L, long0);
      
      // Undeclared exception!
      try { 
        lookaheadInputStream0.read();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.tika.io.LookaheadInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream(sequenceInputStream0, 0);
      byte[] byteArray0 = new byte[8];
      lookaheadInputStream0.read(byteArray0, 0, (-1));
      sequenceInputStream0.skip((-1));
      byteArray0[0] = (byte)25;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)116;
      byteArray0[4] = (byte)46;
      byteArray0[5] = (byte)84;
      byteArray0[6] = (byte) (-15);
      byteArray0[7] = (byte)46;
      lookaheadInputStream0.read(byteArray0, 1, (-4369));
      int int0 = lookaheadInputStream0.read();
      int int1 = lookaheadInputStream0.read(byteArray0, (int) (byte)0, (int) (byte)46);
      assertTrue(int1 == int0);
      assertEquals(0, lookaheadInputStream0.available());
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream((InputStream) null, 673);
      int int0 = lookaheadInputStream0.read();
      assertEquals((-1), int0);
      assertEquals(0, lookaheadInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream((InputStream) null, 508);
      long long0 = lookaheadInputStream0.skip((-13L));
      assertEquals(13, lookaheadInputStream0.available());
      assertEquals((-13L), long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream((InputStream) null, 515);
      lookaheadInputStream0.close();
      int int0 = lookaheadInputStream0.read();
      assertEquals(0, lookaheadInputStream0.available());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream((InputStream) null, 508);
      LookaheadInputStream lookaheadInputStream1 = new LookaheadInputStream(lookaheadInputStream0, 508);
      int int0 = lookaheadInputStream1.read();
      assertEquals(0, lookaheadInputStream1.available());
      assertEquals((-1), int0);
      assertEquals(0, lookaheadInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-1);
      byte byte0 = (byte) (-26);
      byteArray0[2] = (byte) (-26);
      byteArray0[3] = (byte) (-39);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.read();
      byteArrayInputStream0.read();
      byteArrayInputStream0.read();
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream(byteArrayInputStream0, 673);
      lookaheadInputStream0.close();
      lookaheadInputStream0.close();
      lookaheadInputStream0.read();
      byteArrayInputStream0.read();
      lookaheadInputStream0.skip(0L);
      // Undeclared exception!
      try { 
        byteArrayInputStream0.read(byteArray0, (-2845), (int) (byte) (-39));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream((InputStream) null, 0);
      int int0 = lookaheadInputStream0.read();
      assertEquals(0, lookaheadInputStream0.available());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(825);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      sequenceInputStream0.close();
      sequenceInputStream0.available();
      LookaheadInputStream lookaheadInputStream0 = new LookaheadInputStream(sequenceInputStream0, 825);
      try { 
        pipedInputStream0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LookaheadInputStream lookaheadInputStream0 = null;
      try {
        lookaheadInputStream0 = new LookaheadInputStream((InputStream) null, (-3887));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.io.LookaheadInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-80);
      byteArray0[1] = (byte)46;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)79;
      byteArray0[4] = (byte) (-85);
      byteArray0[5] = (byte)14;
      byteArray0[6] = (byte)4;
      sequenceInputStream0.read(byteArray0);
      LookaheadInputStream lookaheadInputStream0 = null;
      try {
        lookaheadInputStream0 = new LookaheadInputStream(sequenceInputStream0, (-1189));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.io.LookaheadInputStream", e);
      }
  }
}
