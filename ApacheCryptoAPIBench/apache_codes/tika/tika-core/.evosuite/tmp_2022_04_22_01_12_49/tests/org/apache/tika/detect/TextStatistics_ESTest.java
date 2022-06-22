/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:28:26 GMT 2022
 */

package org.apache.tika.detect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tika.detect.TextStatistics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TextStatistics_ESTest extends TextStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      assertEquals(0, textStatistics0.count());
      assertNotNull(textStatistics0);
      
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-15);
      textStatistics0.addData(byteArray0, 2, 1);
      assertEquals(6, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-15), (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(1, textStatistics0.count());
      
      boolean boolean0 = textStatistics0.looksLikeUTF8();
      assertTrue(boolean0);
      assertEquals(1, textStatistics0.count());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      assertEquals(0, textStatistics0.count());
      assertNotNull(textStatistics0);
      
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)95;
      textStatistics0.addData(byteArray0, (byte)1, 2);
      assertEquals(5, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)95, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(2, textStatistics0.count());
      
      boolean boolean0 = textStatistics0.looksLikeUTF8();
      assertFalse(boolean0);
      assertEquals(2, textStatistics0.count());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      assertEquals(0, textStatistics0.count());
      assertNotNull(textStatistics0);
      
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)13;
      textStatistics0.addData(byteArray0, 1, 1);
      assertEquals(6, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)13, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(1, textStatistics0.count());
      
      boolean boolean0 = textStatistics0.isMostlyAscii();
      assertTrue(boolean0);
      assertEquals(1, textStatistics0.count());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      assertEquals(0, textStatistics0.count());
      assertNotNull(textStatistics0);
      
      byte[] byteArray0 = new byte[6];
      textStatistics0.addData(byteArray0, (-413), (byte) (-47));
      assertEquals(6, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0, textStatistics0.count());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      assertEquals(0, textStatistics0.count());
      assertNotNull(textStatistics0);
      
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)12;
      textStatistics0.addData(byteArray0, 1, (byte)1);
      assertEquals(6, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)12, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(1, textStatistics0.count());
      
      int int0 = textStatistics0.countSafeAscii();
      assertEquals(1, int0);
      assertEquals(1, textStatistics0.count());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      assertEquals(0, textStatistics0.count());
      assertNotNull(textStatistics0);
      
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-117);
      textStatistics0.addData(byteArray0, (byte)1, (byte)1);
      assertEquals(6, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-117), (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(1, textStatistics0.count());
      
      int int0 = textStatistics0.countEightBit();
      assertEquals(1, int0);
      assertEquals(1, textStatistics0.count());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      assertEquals(0, textStatistics0.count());
      assertNotNull(textStatistics0);
      
      byte[] byteArray0 = new byte[6];
      textStatistics0.addData(byteArray0, (byte)1, 2);
      assertEquals(6, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(2, textStatistics0.count());
      
      int int0 = textStatistics0.countControl();
      assertEquals(2, int0);
      assertEquals(2, textStatistics0.count());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      assertEquals(0, textStatistics0.count());
      assertNotNull(textStatistics0);
      
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-47);
      textStatistics0.addData(byteArray0, 2, 1);
      assertEquals(6, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-47), (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(1, textStatistics0.count());
      
      int int0 = textStatistics0.count((int) (byte) (-47));
      assertEquals(1, int0);
      assertEquals(1, textStatistics0.count());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      assertEquals(0, textStatistics0.count());
      assertNotNull(textStatistics0);
      
      byte[] byteArray0 = new byte[6];
      textStatistics0.addData(byteArray0, 2, 1);
      assertEquals(6, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(1, textStatistics0.count());
      
      int int0 = textStatistics0.count();
      assertEquals(1, int0);
      assertEquals(1, textStatistics0.count());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      assertEquals(0, textStatistics0.count());
      assertNotNull(textStatistics0);
      
      // Undeclared exception!
      try { 
        textStatistics0.addData((byte[]) null, 1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.detect.TextStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      assertEquals(0, textStatistics0.count());
      assertNotNull(textStatistics0);
      
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        textStatistics0.addData(byteArray0, 1151, 1151);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1151
         //
         verifyException("org.apache.tika.detect.TextStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      assertEquals(0, textStatistics0.count());
      assertNotNull(textStatistics0);
      
      int int0 = textStatistics0.count((-320));
      assertEquals(0, int0);
      assertEquals(0, textStatistics0.count());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      assertEquals(0, textStatistics0.count());
      assertNotNull(textStatistics0);
      
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte) (-47);
      textStatistics0.addData(byteArray0, 2, 1);
      assertEquals(3, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-47)}, byteArray0);
      assertEquals(1, textStatistics0.count());
      
      boolean boolean0 = textStatistics0.looksLikeUTF8();
      assertTrue(boolean0);
      assertEquals(1, textStatistics0.count());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      assertEquals(0, textStatistics0.count());
      assertNotNull(textStatistics0);
      
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-11);
      byteArray0[2] = (byte) (-20);
      textStatistics0.addData(byteArray0, (byte)1, 2);
      assertEquals(5, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-11), (byte) (-20), (byte)0, (byte)0}, byteArray0);
      assertEquals(2, textStatistics0.count());
      
      boolean boolean0 = textStatistics0.looksLikeUTF8();
      assertFalse(boolean0);
      assertEquals(2, textStatistics0.count());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      assertEquals(0, textStatistics0.count());
      assertNotNull(textStatistics0);
      
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-113);
      byteArray0[2] = (byte)122;
      textStatistics0.addData(byteArray0, (byte)1, 2);
      assertEquals(6, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-113), (byte)122, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(2, textStatistics0.count());
      
      boolean boolean0 = textStatistics0.looksLikeUTF8();
      assertFalse(boolean0);
      assertEquals(2, textStatistics0.count());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      assertEquals(0, textStatistics0.count());
      assertNotNull(textStatistics0);
      
      boolean boolean0 = textStatistics0.looksLikeUTF8();
      assertFalse(boolean0);
      assertEquals(0, textStatistics0.count());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      assertEquals(0, textStatistics0.count());
      assertNotNull(textStatistics0);
      
      byte[] byteArray0 = new byte[15];
      byteArray0[2] = (byte)113;
      textStatistics0.addData(byteArray0, 2, (byte)1);
      assertEquals(15, byteArray0.length);
      assertEquals(1, textStatistics0.count());
      
      boolean boolean0 = textStatistics0.isMostlyAscii();
      assertTrue(boolean0);
      assertEquals(1, textStatistics0.count());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-47);
      textStatistics0.addData(byteArray0, 2, 1);
      boolean boolean0 = textStatistics0.isMostlyAscii();
      assertEquals(1, textStatistics0.count());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      boolean boolean0 = textStatistics0.isMostlyAscii();
      assertFalse(boolean0);
      assertEquals(0, textStatistics0.count());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      byte[] byteArray0 = new byte[15];
      textStatistics0.addData(byteArray0, (byte)1, (byte)1);
      boolean boolean0 = textStatistics0.isMostlyAscii();
      assertEquals(1, textStatistics0.count());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      int int0 = textStatistics0.countControl();
      assertEquals(0, textStatistics0.count());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      int int0 = textStatistics0.count();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      int int0 = textStatistics0.countSafeAscii();
      assertEquals(0, int0);
      assertEquals(0, textStatistics0.count());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TextStatistics textStatistics0 = new TextStatistics();
      int int0 = textStatistics0.countEightBit();
      assertEquals(0, textStatistics0.count());
      assertEquals(0, int0);
  }
}