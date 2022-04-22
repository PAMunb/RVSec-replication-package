/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:53:06 GMT 2022
 */

package org.apache.wicket.util.crypt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import org.apache.wicket.util.crypt.Base64;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Base64_ESTest extends Base64_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, true, true, (int) (byte)6);
      assertEquals(4, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)47;
      byteArray0[1] = (byte)123;
      boolean boolean0 = Base64.isArrayByteBase64(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      String string0 = Base64.encodeBase64String(byteArray0);
      //  // Unstable assertion: assertEquals("AAAAAAAA\uFFFD\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-49);
      Base64 base64_0 = new Base64(46, byteArray0);
      byte[] byteArray1 = base64_0.encode(byteArray0);
      assertFalse(base64_0.isUrlSafe());
      assertArrayEquals(new byte[] {(byte)65, (byte)77, (byte)56, (byte)65, (byte)0, (byte) (-49), (byte)0}, byteArray1);
      assertEquals(7, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Base64 base64_0 = new Base64(2480);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-49);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      byte[] byteArray1 = Base64.toIntegerBytes(bigInteger0);
      assertArrayEquals(new byte[] {(byte) (-49), (byte)0}, byteArray1);
      assertEquals(2, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Base64.encodeBase64URLSafe(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Base64.encodeBase64Chunked(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64((byte[]) null, true, true);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, false, false);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.toIntegerBytes((BigInteger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.crypt.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.isArrayByteBase64((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.crypt.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = Base64.CHUNK_SEPARATOR;
      byte[] byteArray1 = Base64.encodeBase64URLSafe(byteArray0);
      assertArrayEquals(new byte[] {(byte)68, (byte)81, (byte)111}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = Base64.CHUNK_SEPARATOR;
      Base64 base64_0 = new Base64((-3677), byteArray0, false);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)9;
      boolean boolean0 = Base64.isArrayByteBase64(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, false, false, (int) (byte)89);
      assertEquals(12, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, false, false, 1520);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte)110);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte)94);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Base64 base64_0 = new Base64(105, byteArray0);
      base64_0.setInitialBuffer(byteArray0, 18, 7);
      // Undeclared exception!
      try { 
        base64_0.decode(byteArray0, (int) (byte) (-125), 661);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -125
         //
         verifyException("org.apache.wicket.util.crypt.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Base64 base64_0 = new Base64(105, byteArray0);
      base64_0.setInitialBuffer(byteArray0, 18, 7);
      // Undeclared exception!
      try { 
        base64_0.encode(byteArray0, (-1891), 1431655765);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1891
         //
         verifyException("org.apache.wicket.util.crypt.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Base64 base64_0 = new Base64(105, byteArray0);
      base64_0.setInitialBuffer(byteArray0, 18, 7);
      // Undeclared exception!
      try { 
        base64_0.encode(byteArray0, 63, (-2228));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Base64 base64_0 = new Base64(105, byteArray0);
      // Undeclared exception!
      try { 
        base64_0.encode(byteArray0, (-1891), 1431655765);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1891
         //
         verifyException("org.apache.wicket.util.crypt.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      Base64 base64_0 = new Base64(13, byteArray0);
      byte[] byteArray1 = base64_0.encode(byteArray0);
      assertFalse(base64_0.isUrlSafe());
      assertEquals(40, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      Base64 base64_0 = new Base64(8, byteArray0, true);
      byte[] byteArray1 = base64_0.encode(byteArray0);
      assertEquals(40, byteArray1.length);
      assertTrue(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = Base64.CHUNK_SEPARATOR;
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, false, true);
      assertArrayEquals(new byte[] {(byte)68, (byte)81, (byte)111}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, false);
      assertArrayEquals(new byte[] {(byte)65, (byte)65, (byte)65, (byte)65}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.encodeInteger((BigInteger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // encodeInteger called with null parameter
         //
         verifyException("org.apache.wicket.util.crypt.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)32;
      boolean boolean0 = Base64.isArrayByteBase64(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        Base64.encodeBase64(byteArray0, false, false, (int) (byte)0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input array too big, the output array would be bigger (14) than the specified maximum size of 0
         //
         verifyException("org.apache.wicket.util.crypt.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = Base64.CHUNK_SEPARATOR;
      boolean boolean0 = Base64.isArrayByteBase64(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte)126);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte) (-99));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte)61);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Base64 base64_0 = new Base64((-296), byteArray0);
      base64_0.encode(byteArray0, (-296), (-296));
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
      assertEquals(0, byteArray0.length);
      
      Base64 base64_0 = new Base64(1520, byteArray0);
      boolean boolean0 = base64_0.hasData();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Base64 base64_0 = new Base64(577, (byte[]) null);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = Base64.CHUNK_SEPARATOR;
      byte[] byteArray1 = Base64.encodeBase64Chunked(byteArray0);
      assertArrayEquals(new byte[] {(byte)68, (byte)81, (byte)111, (byte)61, (byte)13, (byte)10}, byteArray1);
      assertEquals(6, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Base64 base64_0 = new Base64(false);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.decodeInteger((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = Base64.CHUNK_SEPARATOR;
      String string0 = Base64.encodeBase64URLSafeString(byteArray0);
      assertEquals("DQo", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = Base64.decodeBase64("org.apache.wicket.util.crypt.Base64");
      assertEquals(22, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Base64 base64_0 = new Base64();
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0);
      assertArrayEquals(new byte[] {(byte)65, (byte)65, (byte)65, (byte)65, (byte)65, (byte)65, (byte)61, (byte)61}, byteArray1);
      assertEquals(8, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
      byte[] byteArray1 = Base64.decodeBase64(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64URLSafe((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)67, (byte)103, (byte)61, (byte)61}, byteArray0);
  }
}
