/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 15:46:12 GMT 2022
 */

package org.apache.tika.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.IOException;
import org.apache.tika.io.NullInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NullInputStream_ESTest extends NullInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream((-2806L));
      long long0 = nullInputStream0.skip(1L);
      assertEquals((-2806L), nullInputStream0.getPosition());
      assertEquals((-2806L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(2147483647L);
      nullInputStream0.mark((byte)0);
      nullInputStream0.skip((-2283L));
      nullInputStream0.reset();
      assertTrue(nullInputStream0.markSupported());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(2147483647L);
      byte[] byteArray0 = new byte[5];
      nullInputStream0.read(byteArray0, 0, 1125);
      nullInputStream0.mark((byte)0);
      nullInputStream0.reset();
      assertEquals(1125L, nullInputStream0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream((-1L));
      byte[] byteArray0 = new byte[7];
      int int0 = nullInputStream0.read(byteArray0, (-2120640101), (-1));
      assertEquals((-1L), nullInputStream0.getPosition());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream((-2069L));
      int int0 = nullInputStream0.read();
      assertEquals(1L, nullInputStream0.getPosition());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(2147483647L);
      int int0 = nullInputStream0.available();
      assertTrue(nullInputStream0.markSupported());
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(0L);
      int int0 = nullInputStream0.available();
      assertTrue(nullInputStream0.markSupported());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(0L, true, true);
      byte[] byteArray0 = new byte[0];
      nullInputStream0.processBytes(byteArray0, 35, 35);
      assertEquals(0, nullInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(2147483647L);
      long long0 = nullInputStream0.skip((byte)0);
      assertTrue(nullInputStream0.markSupported());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(2147483647L);
      byte[] byteArray0 = new byte[5];
      int int0 = nullInputStream0.read(byteArray0, (int) (byte)0, 0);
      assertTrue(nullInputStream0.markSupported());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(1L);
      byte[] byteArray0 = new byte[0];
      int int0 = nullInputStream0.read(byteArray0);
      assertTrue(nullInputStream0.markSupported());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream((-4967L), true, true);
      nullInputStream0.markSupported();
      assertEquals(0, nullInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream((byte)0);
      nullInputStream0.getSize();
      assertTrue(nullInputStream0.markSupported());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(2147483647L);
      long long0 = nullInputStream0.getSize();
      assertTrue(nullInputStream0.markSupported());
      assertEquals(2147483647L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(2147483647L);
      nullInputStream0.skip((-272L));
      long long0 = nullInputStream0.getPosition();
      assertEquals((-272L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(0L, true, true);
      try { 
        nullInputStream0.skip(0L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.io.NullInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(0L, true, true);
      byte[] byteArray0 = new byte[0];
      try { 
        nullInputStream0.read(byteArray0, (-1), (-1));
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.io.NullInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(5559L);
      // Undeclared exception!
      try { 
        nullInputStream0.read((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.io.NullInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(0L);
      byte[] byteArray0 = new byte[1];
      nullInputStream0.read(byteArray0);
      try { 
        nullInputStream0.read(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Read after end of file
         //
         verifyException("org.apache.tika.io.NullInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(0L, true, true);
      try { 
        nullInputStream0.read();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.io.NullInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream((-1511L), false, false);
      byte[] byteArray0 = new byte[9];
      int int0 = nullInputStream0.read(byteArray0, (int) (byte)0, (int) (byte) (-1));
      assertEquals((-1511L), nullInputStream0.getPosition());
      assertEquals((-1511), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      NullInputStream nullInputStream0 = new NullInputStream((-4L), true, true);
      nullInputStream0.read(byteArray0);
      try { 
        nullInputStream0.read(byteArray0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.io.NullInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(1L, true, true);
      long long0 = nullInputStream0.skip(910L);
      assertEquals(1L, nullInputStream0.getPosition());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(1L, true, true);
      nullInputStream0.mark((-1));
      nullInputStream0.skip((-1));
      assertEquals(2, nullInputStream0.available());
      
      nullInputStream0.reset();
      assertEquals(1L, nullInputStream0.getSize());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream((-269L), false, false);
      // Undeclared exception!
      try { 
        nullInputStream0.reset();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Mark not supported
         //
         verifyException("org.apache.tika.io.NullInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(1L, true, true);
      try { 
        nullInputStream0.reset();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // No position has been marked
         //
         verifyException("org.apache.tika.io.NullInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(2147483647L);
      byte[] byteArray0 = new byte[5];
      nullInputStream0.read(byteArray0, 0, 1125);
      long long0 = nullInputStream0.getPosition();
      assertEquals(2147482522, nullInputStream0.available());
      assertEquals(1125L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream((-3205L));
      nullInputStream0.skip((-3205L));
      byte[] byteArray0 = new byte[0];
      nullInputStream0.read(byteArray0);
      try { 
        nullInputStream0.read(byteArray0, (-1), (-1));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Read after end of file
         //
         verifyException("org.apache.tika.io.NullInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(2113L);
      int int0 = nullInputStream0.read();
      assertEquals(2112, nullInputStream0.available());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(0L);
      nullInputStream0.skip(0L);
      try { 
        nullInputStream0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Read after end of file
         //
         verifyException("org.apache.tika.io.NullInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(0L);
      nullInputStream0.read();
      try { 
        nullInputStream0.skip((-1));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Skip after end of file
         //
         verifyException("org.apache.tika.io.NullInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream((-14L), false, false);
      // Undeclared exception!
      try { 
        nullInputStream0.mark(0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Mark not supported
         //
         verifyException("org.apache.tika.io.NullInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(1L, true, true);
      nullInputStream0.mark((-1));
      try { 
        nullInputStream0.reset();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Marked position [0] is no longer valid - passed the read limit [-1]
         //
         verifyException("org.apache.tika.io.NullInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(2147483638L);
      nullInputStream0.skip((-15L));
      int int0 = nullInputStream0.available();
      assertEquals((-15L), nullInputStream0.getPosition());
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream((-2496L), true, true);
      int int0 = nullInputStream0.available();
      assertEquals(0, int0);
      assertTrue(nullInputStream0.markSupported());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(2147483638L);
      int int0 = nullInputStream0.available();
      assertEquals(2147483638, int0);
      assertTrue(nullInputStream0.markSupported());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(0L);
      int int0 = nullInputStream0.processByte();
      assertTrue(nullInputStream0.markSupported());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(3007L, false, false);
      boolean boolean0 = nullInputStream0.markSupported();
      assertEquals(3007, nullInputStream0.available());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(1L, true, true);
      nullInputStream0.close();
      assertTrue(nullInputStream0.markSupported());
      assertEquals(1, nullInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream(1L, true, true);
      byte[] byteArray0 = new byte[7];
      int int0 = nullInputStream0.read(byteArray0);
      assertEquals(1L, nullInputStream0.getPosition());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream((-118L));
      long long0 = nullInputStream0.getSize();
      assertTrue(nullInputStream0.markSupported());
      assertEquals((-118L), long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NullInputStream nullInputStream0 = new NullInputStream((-2496L), true, true);
      nullInputStream0.getPosition();
      assertEquals((-2496L), nullInputStream0.getSize());
      assertTrue(nullInputStream0.markSupported());
  }
}
