/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:58:41 GMT 2022
 */

package org.apache.wicket.util.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.wicket.util.lang.Objects;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Objects_ESTest extends Objects_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Byte byte0 = new Byte((byte)121);
      Byte byte1 = new Byte((byte) (-76));
      boolean boolean0 = Objects.isEqual(byte0, byte1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      Number number0 = Objects.newInteger(0, 0L);
      assertEquals(0, number0);
      
      int int0 = Objects.getNumericType(object0, (Object) number0);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Objects.getNumericType(921, 7, false);
      assertEquals(921, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-62));
      boolean boolean0 = Objects.booleanValue(byte0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Number number0 = Objects.newInteger(1215, 0L);
      assertEquals((short)0, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-25));
      long long0 = Objects.longValue(byte0);
      assertEquals((-25L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = Objects.getNumericType((int) (byte)0, (int) (byte)0, true);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = Objects.getNumericType((-825), (-2182), true);
      assertEquals((-825), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Byte byte0 = new Byte((byte)101);
      double double0 = Objects.doubleValue(byte0);
      assertEquals(101.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-81));
      double double0 = Objects.doubleValue(byte0);
      assertEquals((-81.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = Objects.defaultIfNull((Object) null, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-101));
      BigInteger bigInteger0 = Objects.bigIntValue(byte0);
      assertEquals((short) (-101), bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-1));
      BigDecimal bigDecimal0 = Objects.bigDecValue(byte0);
      assertEquals((byte) (-1), bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        Objects.isEqual(bigDecimal0, object0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Objects.convertValue((Object) null, (Class<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.lang.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      String string0 = Objects.stringValue((Object) class0, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = Objects.stringValue((Object) null, false);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Byte byte0 = new Byte((byte)0);
      String string0 = Objects.stringValue((Object) byte0, true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = new Object();
      try { 
        Objects.longValue(object0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"java.lang.Object@0000000001\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      long long0 = Objects.longValue(bigDecimal0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object object0 = new Object();
      int int0 = Objects.getNumericType(object0);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      int int0 = Objects.getNumericType((Object) bigInteger0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Number number0 = Objects.newInteger(7, 7);
      assertEquals(7.0F, number0);
      
      int int0 = Objects.getNumericType((Object) number0);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Long long0 = new Long((byte)1);
      int int0 = Objects.getNumericType((Object) long0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Number number0 = Objects.newInteger(3, 3);
      assertEquals((short)3, number0);
      
      int int0 = Objects.getNumericType((Object) number0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-33));
      int int0 = Objects.getNumericType((Object) byte0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Number number0 = Objects.newInteger(8, 8);
      assertEquals(8.0, number0);
      
      int int0 = Objects.getNumericType((Object) number0);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      int int0 = Objects.getNumericType((Object) bigDecimal0);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = Objects.getNumericType((Object) null);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = Objects.getNumericType(6, 8, false);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = Objects.getNumericType((int) (byte) (-125), 9, true);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = Objects.getNumericType(7, (int) (byte)6, false);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = Objects.getNumericType(5023, 10, true);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = Objects.getNumericType(10, (-467), true);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = new Object();
      try { 
        Objects.doubleValue(object0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      double double0 = Objects.doubleValue(bigDecimal0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double double0 = Objects.doubleValue((Object) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-96));
      Byte byte1 = new Byte((byte) (-27));
      int int0 = Objects.compareWithConversion(byte0, byte1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        Objects.compareWithConversion("java.lang.Class@0000000001", class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid comparison: java.lang.String and java.lang.Class
         //
         verifyException("org.apache.wicket.util.lang.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-125));
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      BigInteger bigInteger0 = Objects.bigIntValue(bigDecimal0);
      int int0 = Objects.compareWithConversion(byte0, bigInteger0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      BigInteger bigInteger0 = BigInteger.ONE;
      int int0 = Objects.compareWithConversion(bigInteger0, bigDecimal0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Number number0 = Objects.newInteger(8, 8);
      Class<Byte> class0 = Byte.class;
      Byte byte0 = Objects.convertValue((Object) number0, class0);
      assertNotNull(byte0);
      assertEquals((byte)8, (byte)byte0);
      
      Object object0 = Objects.defaultIfNull((Object) number0, (Object) byte0);
      assertEquals(8.0, object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = Objects.defaultIfNull((Object) null, object0);
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object object0 = new Object();
      String string0 = Objects.stringValue(object0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) class0;
      Objects.hashCode(objectArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Objects.hashCode(objectArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Objects.hashCode((Object[]) null);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Number number0 = Objects.newInteger(26, (-550L));
      assertEquals((byte) (-38), number0.byteValue());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Number number0 = Objects.newInteger(6, 1);
      assertEquals((byte)1, number0.byteValue());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Number number0 = Objects.newInteger(4, 0L);
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Number number0 = Objects.newInteger(2, 2);
      assertEquals(2, number0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Number number0 = Objects.newInteger(1, 1);
      assertEquals((byte)1, number0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      long long0 = Objects.longValue((Object) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      boolean boolean0 = Objects.isEqual(bigDecimal0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Byte byte0 = new Byte((byte)0);
      boolean boolean0 = Objects.isEqual((Object) null, byte0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-84));
      boolean boolean0 = Objects.isEqual(byte0, byte0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Number number0 = Objects.newInteger(5, 5);
      // Undeclared exception!
      try { 
        Objects.compareWithConversion(number0, class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Number number0 = Objects.newInteger(3, (-1L));
      assertEquals((short) (-1), number0);
      
      int int0 = Objects.getNumericType((Object) number0, (Object) number0, true);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Number number0 = Objects.newInteger(0, 0);
      int int0 = Objects.getNumericType((Object) number0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      int int0 = Objects.getNumericType(4, 1215, true);
      assertEquals(1215, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      BigInteger bigInteger0 = BigInteger.TEN;
      boolean boolean0 = Objects.isEqual(bigDecimal0, bigInteger0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      int int0 = Objects.getNumericType(1081, 5, false);
      assertEquals(1081, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      int int0 = Objects.getNumericType(8, 10, false);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      int int0 = Objects.getNumericType(10, (-487), false);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      int int0 = Objects.getNumericType(1717986918, 2, true);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      int int0 = Objects.getNumericType(2, (-1636), true);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Byte byte0 = new Byte((byte)95);
      Byte byte1 = new Byte((byte)95);
      boolean boolean0 = Objects.equal(byte1, byte0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = new Object();
      boolean boolean0 = Objects.equal(object1, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = Objects.equal((Object) null, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = Objects.equal(object0, object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      boolean boolean0 = Objects.equal(bigInteger0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Byte byte0 = Objects.convertValue((Object) null, class0);
      assertEquals((byte)0, (byte)byte0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        Objects.convertValue((Object) class0, class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"java.lang.Class@0000000001\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Class<Object> class1 = Object.class;
      Object object0 = Objects.convertValue((Object) class0, class1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      Byte byte0 = Objects.convertValue((Object) null, class0);
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      int int0 = Objects.compareWithConversion("java.lang.Byte@0000000001", "java.lang.String@0000000002");
      assertEquals((-17), int0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        Objects.isEqual("java.lang.Object@0000000001", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid comparison: java.lang.String and java.lang.Object
         //
         verifyException("org.apache.wicket.util.lang.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        Objects.compareWithConversion(class0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.lang.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      int int0 = Objects.compareWithConversion(bigInteger0, (Object) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Byte byte0 = new Byte((byte)110);
      Byte byte1 = new Byte((byte)1);
      int int0 = Objects.compareWithConversion(byte0, byte1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Number number0 = Objects.newInteger(8, 8);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        Objects.compareWithConversion(object0, number0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      BigInteger bigInteger0 = BigInteger.ONE;
      boolean boolean0 = Objects.isEqual(bigInteger0, bigDecimal0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Number number0 = Objects.newInteger(7, 7);
      assertEquals(7.0F, number0);
      
      Byte byte0 = new Byte((byte) (-84));
      int int0 = Objects.compareWithConversion(byte0, number0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Object object0 = new Object();
      int int0 = Objects.compareWithConversion(object0, object0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Number number0 = Objects.newInteger(8, 8);
      Class<Byte> class0 = Byte.class;
      Byte byte0 = Objects.convertValue((Object) number0, class0);
      assertEquals((byte)8, (byte)byte0);
      
      int int0 = Objects.compareWithConversion(number0, byte0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      boolean boolean0 = Objects.booleanValue(bigInteger0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      boolean boolean0 = Objects.booleanValue(bigInteger0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      boolean boolean0 = Objects.booleanValue((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = Objects.booleanValue(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Byte byte0 = new Byte((byte)110);
      BigInteger bigInteger0 = Objects.bigIntValue(byte0);
      assertEquals((byte)110, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      BigInteger bigInteger1 = Objects.bigIntValue(bigInteger0);
      assertSame(bigInteger1, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      BigInteger bigInteger0 = Objects.bigIntValue((Object) null);
      assertEquals((short)0, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      Object object0 = new Object();
      try { 
        Objects.bigIntValue(object0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"java.lang\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Class<Object> class0 = Object.class;
      try { 
        Objects.bigDecValue(class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      BigDecimal bigDecimal0 = Objects.bigDecValue(bigInteger0);
      assertEquals((short)10, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      Byte byte0 = new Byte((byte)110);
      BigDecimal bigDecimal0 = Objects.bigDecValue(byte0);
      Class<Byte> class0 = Byte.class;
      Byte byte1 = Objects.convertValue((Object) bigDecimal0, class0);
      assertEquals((byte)110, (byte)byte1);
      
      int int0 = Objects.compareWithConversion(byte1, byte0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      BigDecimal bigDecimal0 = Objects.bigDecValue((Object) null);
      assertEquals((short)0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      BigDecimal bigDecimal1 = Objects.bigDecValue(bigDecimal0);
      assertSame(bigDecimal1, bigDecimal0);
  }
}