/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 13:21:27 GMT 2022
 */

package org.apache.activemq.artemis.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.apache.activemq.artemis.utils.UUIDTimer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UUIDTimer_ESTest extends UUIDTimer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      UUIDTimer uUIDTimer0 = new UUIDTimer(mockRandom0);
      byte[] byteArray0 = new byte[10];
      System.setCurrentTimeMillis((byte)0);
      uUIDTimer0.getTimestamp(byteArray0);
      assertArrayEquals(new byte[] {(byte)19, (byte) (-127), (byte)64, (byte)0, (byte)29, (byte) (-46), (byte)1, (byte) (-78), (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      UUIDTimer uUIDTimer0 = new UUIDTimer(mockRandom0);
      // Undeclared exception!
      try { 
        uUIDTimer0.getTimestamp((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.utils.UUIDTimer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      MockRandom mockRandom0 = new MockRandom();
      UUIDTimer uUIDTimer0 = new UUIDTimer(mockRandom0);
      // Undeclared exception!
      try { 
        uUIDTimer0.getTimestamp(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.activemq.artemis.utils.UUIDTimer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UUIDTimer uUIDTimer0 = null;
      try {
        uUIDTimer0 = new UUIDTimer((Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.utils.UUIDTimer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      UUIDTimer uUIDTimer0 = new UUIDTimer(mockRandom0);
      byte[] byteArray0 = new byte[17];
      System.setCurrentTimeMillis((byte) (-111));
      uUIDTimer0.getTimestamp(byteArray0);
      assertEquals(17, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      UUIDTimer uUIDTimer0 = new UUIDTimer(mockRandom0);
      byte[] byteArray0 = new byte[10];
      uUIDTimer0.getTimestamp(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-111), (byte)116, (byte) (-118), (byte) (-128), (byte) (-107), (byte) (-75), (byte)1, (byte) (-29), (byte)0, (byte)0}, byteArray0);
  }
}
