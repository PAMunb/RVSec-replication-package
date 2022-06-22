/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:59:16 GMT 2022
 */

package org.apache.wicket.util.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.wicket.util.lang.Bytes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Bytes_ESTest extends Bytes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Bytes bytes0 = Bytes.kilobytes(1024L);
      String string0 = bytes0.toString();
      assertEquals("1M", string0);
      assertEquals(9.5367431640625E-7, bytes0.terabytes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("r");
      Bytes bytes0 = Bytes.gigabytes((double) 1024L);
      String string0 = bytes0.toString(locale0);
      assertEquals(1.0, bytes0.terabytes(), 0.01);
      assertEquals("1T", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Bytes bytes0 = Bytes.terabytes(997L);
      assertEquals(997.0, bytes0.terabytes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Bytes bytes0 = Bytes.terabytes((double) 0L);
      assertEquals(0L, bytes0.bytes());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Bytes bytes0 = Bytes.megabytes(1679332212736L);
      Bytes bytes1 = Bytes.bytes(1679332212736L);
      boolean boolean0 = bytes1.greaterThan(bytes0);
      assertEquals(1760907454301863936L, bytes0.bytes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Bytes bytes0 = Bytes.megabytes(0.0);
      double double0 = bytes0.megabytes();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Bytes bytes0 = Bytes.kilobytes(0.0);
      assertEquals(0.0, bytes0.kilobytes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Bytes bytes0 = Bytes.kilobytes(1.0);
      assertEquals(9.5367431640625E-7, bytes0.gigabytes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Bytes bytes0 = Bytes.terabytes(0L);
      double double0 = bytes0.kilobytes();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Bytes bytes0 = Bytes.gigabytes(1099511627776L);
      assertEquals(0.0, bytes0.kilobytes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Bytes bytes0 = Bytes.gigabytes(203L);
      assertEquals(2.12860928E8, bytes0.kilobytes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Bytes bytes0 = Bytes.gigabytes(0.0);
      double double0 = bytes0.terabytes();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Bytes bytes0 = Bytes.MAX;
      double double0 = bytes0.gigabytes();
      assertEquals(8.589934592E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Bytes bytes0 = Bytes.bytes(0L);
      assertEquals(0.0, bytes0.gigabytes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Bytes bytes0 = Bytes.bytes(435.7133448283969);
      assertEquals(3.965396899729967E-10, bytes0.terabytes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Bytes bytes0 = Bytes.megabytes(0.0);
      long long0 = bytes0.bytes();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      // Undeclared exception!
      try { 
        Bytes.valueOf((String) null, locale0);
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
      try { 
        Bytes.valueOf((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Bytes.terabytes((-2912.6));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'bytes' cannot be negative: -3202437567060377
         //
         verifyException("org.apache.wicket.util.lang.Bytes", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Bytes.megabytes((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'bytes' cannot be negative: -1048576
         //
         verifyException("org.apache.wicket.util.lang.Bytes", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Bytes.megabytes((-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'bytes' cannot be negative: -1048576
         //
         verifyException("org.apache.wicket.util.lang.Bytes", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Bytes.kilobytes((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'bytes' cannot be negative: -1024
         //
         verifyException("org.apache.wicket.util.lang.Bytes", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Bytes.bytes((-14.682302867195176));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'bytes' cannot be negative: -15
         //
         verifyException("org.apache.wicket.util.lang.Bytes", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Bytes bytes0 = Bytes.bytes(1024L);
      Locale locale0 = Locale.FRANCE;
      String string0 = bytes0.toString(locale0);
      assertEquals(9.313225746154785E-10, bytes0.terabytes(), 0.01);
      assertEquals("1K", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Bytes bytes0 = Bytes.gigabytes(1.0);
      // Undeclared exception!
      try { 
        bytes0.toString((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        Bytes.valueOf("0G", locale0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      try { 
        Bytes.valueOf("", locale0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse bytes: 
         //
         verifyException("org.apache.wicket.util.lang.Bytes", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Bytes bytes0 = Bytes.gigabytes(368.0);
      double double0 = bytes0.terabytes();
      assertEquals(0.359375, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        Bytes.kilobytes((-4.710127101210764));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'bytes' cannot be negative: -4823
         //
         verifyException("org.apache.wicket.util.lang.Bytes", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        Bytes.gigabytes((-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'bytes' cannot be negative: -1073741824
         //
         verifyException("org.apache.wicket.util.lang.Bytes", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        Bytes.bytes((-29L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'bytes' cannot be negative: -29
         //
         verifyException("org.apache.wicket.util.lang.Bytes", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        Bytes.gigabytes((-162L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'bytes' cannot be negative: -173946175488
         //
         verifyException("org.apache.wicket.util.lang.Bytes", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Bytes bytes0 = Bytes.MAX;
      long long0 = bytes0.bytes();
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Bytes bytes0 = Bytes.MAX;
      double double0 = bytes0.kilobytes();
      assertEquals(9.007199254740992E15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Bytes bytes0 = Bytes.MAX;
      double double0 = bytes0.megabytes();
      assertEquals(8.796093022208E12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Bytes bytes0 = Bytes.kilobytes(0L);
      double double0 = bytes0.gigabytes();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Bytes bytes0 = Bytes.megabytes(0L);
      Bytes bytes1 = Bytes.bytes((double) 0L);
      boolean boolean0 = bytes0.greaterThan(bytes1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Bytes bytes0 = Bytes.kilobytes(0L);
      boolean boolean0 = bytes0.greaterThan((Bytes) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Bytes bytes0 = Bytes.kilobytes(1024L);
      boolean boolean0 = bytes0.greaterThan(bytes0);
      assertFalse(boolean0);
      assertEquals(1024.0, bytes0.kilobytes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Bytes bytes0 = Bytes.kilobytes(510L);
      String string0 = bytes0.toString();
      assertEquals("510K", string0);
      assertEquals(4.7497451305389404E-7, bytes0.terabytes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Bytes bytes0 = Bytes.megabytes(435.7133448283969);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      String string0 = bytes0.toString(locale0);
      assertEquals("435.7M", string0);
      assertEquals(4.155286260356661E-4, bytes0.terabytes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Bytes bytes0 = Bytes.megabytes(2246.307565806958);
      String string0 = bytes0.toString();
      assertEquals(0.0021422458321467275, bytes0.terabytes(), 0.01);
      assertEquals("2.2G", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Bytes bytes0 = Bytes.kilobytes(0L);
      String string0 = bytes0.toString((Locale) null);
      assertEquals("0 bytes", string0);
      assertEquals(0.0, bytes0.terabytes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      try { 
        Bytes.valueOf("0 bytes");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse bytes: 0 bytes
         //
         verifyException("org.apache.wicket.util.lang.Bytes", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Bytes bytes0 = Bytes.MAX;
      String string0 = bytes0.toString();
      assertEquals("8388608T", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        Bytes.valueOf("0G");
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Bytes bytes0 = Bytes.kilobytes(0L);
      Bytes bytes1 = Bytes.kilobytes(1335L);
      boolean boolean0 = bytes1.greaterThan(bytes0);
      assertTrue(boolean0);
      assertEquals(1335.0, bytes1.kilobytes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Bytes bytes0 = Bytes.terabytes(368.0);
      assertEquals(368.0, bytes0.terabytes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        Bytes.terabytes((-3709L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'bytes' cannot be negative: -4078088627421184
         //
         verifyException("org.apache.wicket.util.lang.Bytes", e);
      }
  }
}