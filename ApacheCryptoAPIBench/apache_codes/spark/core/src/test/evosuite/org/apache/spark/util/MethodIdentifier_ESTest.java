/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:15:15 GMT 2022
 */

package org.apache.spark.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.util.MethodIdentifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import scala.Option;
import scala.Tuple3;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MethodIdentifier_ESTest extends MethodIdentifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, "", (String) null);
      MethodIdentifier<Object> methodIdentifier1 = methodIdentifier0.copy(class0, (String) null, "L^");
      Object object0 = methodIdentifier1.productElement(1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = new MethodIdentifier<Object>(class0, "HM(?&Wu=#", "HM(?&Wu=#");
      Class<Object> class1 = methodIdentifier0.cls();
      MethodIdentifier<Object> methodIdentifier1 = new MethodIdentifier<Object>(class1, (String) null, "HM(?&Wu=#");
      String string0 = methodIdentifier1.name();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = new MethodIdentifier<Object>(class0, "&%JdaAN", "&%JdaAN");
      MethodIdentifier<Object> methodIdentifier1 = methodIdentifier0.copy(class0, "", "&%JdaAN");
      String string0 = methodIdentifier1.name();
      assertEquals("&%JdaAN", methodIdentifier1.desc());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, "hm&LGM%2Tq_", "org.apache.spark.util.MethodIdentifier");
      String string0 = methodIdentifier0.desc();
      assertEquals("org.apache.spark.util.MethodIdentifier", string0);
      assertEquals("hm&LGM%2Tq_", methodIdentifier0.name());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = new MethodIdentifier<Object>(class0, "", "");
      String string0 = methodIdentifier0.desc();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, "", (String) null);
      String string0 = methodIdentifier0.copy$default$3();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = new MethodIdentifier<Object>(class0, "U,TE59v}x7Nn+h@", "");
      String string0 = methodIdentifier0.copy$default$3();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = new MethodIdentifier<Object>(class0, (String) null, (String) null);
      String string0 = methodIdentifier0.copy$default$2();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = new MethodIdentifier<Object>(class0, "scala.collection.immutable.$colon$colon", "");
      String string0 = methodIdentifier0.copy$default$2();
      assertEquals("scala.collection.immutable.$colon$colon", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MethodIdentifier<Object> methodIdentifier0 = new MethodIdentifier<Object>((Class<Object>) null, "", "9lq=U");
      Class<Object> class0 = methodIdentifier0.copy$default$1();
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MethodIdentifier<Object> methodIdentifier0 = new MethodIdentifier<Object>((Class<Object>) null, "]I0!6P>Sz5oYY}bC^", "NYK");
      Class<Object> class0 = methodIdentifier0.cls();
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, "", (String) null);
      boolean boolean0 = methodIdentifier0.canEqual((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, "", (String) null);
      Class class1 = (Class)methodIdentifier0.productElement(0);
      assertFalse(class1.isInterface());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, "no<'AMS8FNhI*t", "no<'AMS8FNhI*t");
      Object object0 = methodIdentifier0.productElement(2);
      assertEquals("no<'AMS8FNhI*t", object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = new MethodIdentifier<Object>(class0, "", "");
      boolean boolean0 = methodIdentifier0.canEqual(methodIdentifier0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, "nlAPw:{emf7=Q/vf37P", "nlAPw:{emf7=Q/vf37P");
      int int0 = methodIdentifier0.productArity();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = new MethodIdentifier<Object>(class0, "?_@g74eHyG]A1o-", "?_@g74eHyG]A1o-");
      String string0 = methodIdentifier0.name();
      assertEquals("?_@g74eHyG]A1o-", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, "nlAPw:{emf7=Q/vf37P", "nlAPw:{emf7=Q/vf37P");
      String string0 = methodIdentifier0.productPrefix();
      assertEquals("MethodIdentifier", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, ",sn;u ", ",sn;u ");
      methodIdentifier0.productIterator();
      assertEquals(3, methodIdentifier0.productArity());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, (String) null, (String) null);
      String string0 = methodIdentifier0.desc();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, "", "");
      MethodIdentifier<Object> methodIdentifier1 = MethodIdentifier.apply(class0, "", (String) null);
      boolean boolean0 = methodIdentifier0.equals(methodIdentifier1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, "", "");
      MethodIdentifier<Object> methodIdentifier1 = MethodIdentifier.apply(class0, "", (String) null);
      boolean boolean0 = methodIdentifier1.equals(methodIdentifier0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = new MethodIdentifier<Object>(class0, "eK", "eK");
      MethodIdentifier<Object> methodIdentifier1 = new MethodIdentifier<Object>(class0, (String) null, (String) null);
      boolean boolean0 = methodIdentifier0.equals(methodIdentifier1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = new MethodIdentifier<Object>(class0, (String) null, (String) null);
      MethodIdentifier<Object> methodIdentifier1 = methodIdentifier0.copy(class0, (String) null, (String) null);
      boolean boolean0 = methodIdentifier1.equals(methodIdentifier0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = new MethodIdentifier<Object>(class0, "HM(?&Wu=#", "HM(?&Wu=#");
      MethodIdentifier<Object> methodIdentifier1 = new MethodIdentifier<Object>(class0, (String) null, (String) null);
      boolean boolean0 = methodIdentifier1.equals(methodIdentifier0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MethodIdentifier<Object> methodIdentifier0 = new MethodIdentifier<Object>((Class<Object>) null, "", "H");
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier1 = new MethodIdentifier<Object>(class0, "Asdk@QA4@iDC_Eh:[", "");
      boolean boolean0 = methodIdentifier1.equals(methodIdentifier0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MethodIdentifier<Object> methodIdentifier0 = new MethodIdentifier<Object>((Class<Object>) null, "H", "H");
      MethodIdentifier<Object> methodIdentifier1 = new MethodIdentifier<Object>((Class<Object>) null, "H", "H");
      boolean boolean0 = methodIdentifier1.equals(methodIdentifier0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = new MethodIdentifier<Object>((Class<Object>) null, "", "l");
      MethodIdentifier<Object> methodIdentifier1 = new MethodIdentifier<Object>(class0, "l", "l");
      boolean boolean0 = methodIdentifier0.equals(methodIdentifier1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, "scala.util.hashing.MurmurHash3$ArrayHashing", "scala.util.hashing.MurmurHash3$ArrayHashing");
      boolean boolean0 = methodIdentifier0.equals("scala.util.hashing.MurmurHash3$ArrayHashing");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = new MethodIdentifier<Object>(class0, "og.apache.spark.util.MthodIde7tifier$", "og.apache.spark.util.MthodIde7tifier$");
      boolean boolean0 = methodIdentifier0.equals(methodIdentifier0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, "", "");
      // Undeclared exception!
      try { 
        methodIdentifier0.productElement(3339);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000012
         //
         verifyException("org.apache.spark.util.MethodIdentifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, "nlAPw:{emf7=Q/vf37P", "nlAPw:{emf7=Q/vf37P");
      Option<Tuple3<Class<Object>, String, String>> option0 = MethodIdentifier.unapply(methodIdentifier0);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, "nlAPw:{emf7=Q/vf37P", "nlAPw:{emf7=Q/vf37P");
      Class<Object> class1 = methodIdentifier0.copy$default$1();
      assertFalse(class1.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, "og.apache.spark.util.MthodIde7tifier$", "og.apache.spark.util.MthodIde7tifier$");
      methodIdentifier0.hashCode();
      assertEquals(3, methodIdentifier0.productArity());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Option<Tuple3<Class<Class<Object>>, String, String>> option0 = MethodIdentifier.unapply((MethodIdentifier<Class<Object>>) null);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = new MethodIdentifier<Object>(class0, "NFC9SlM<x5_c~", "NFC9SlM<x5_c~");
      String string0 = methodIdentifier0.copy$default$3();
      assertEquals("NFC9SlM<x5_c~", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, "scala.util.hashing.MurmurHash3$ArrayHashing", "scala.util.hashing.MurmurHash3$ArrayHashing");
      String string0 = methodIdentifier0.toString();
      assertEquals("MethodIdentifier(class java.lang.Object,scala.util.hashing.MurmurHash3$ArrayHashing,scala.util.hashing.MurmurHash3$ArrayHashing)", string0);
      assertEquals(3, methodIdentifier0.productArity());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodIdentifier<Object> methodIdentifier0 = MethodIdentifier.apply(class0, "", "");
      String string0 = methodIdentifier0.copy$default$2();
      assertEquals("", string0);
  }
}