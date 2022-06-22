/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:20:34 GMT 2022
 */

package org.apache.spark.rpc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.apache.spark.rpc.RpcAddress;
import org.apache.spark.rpc.RpcEndpointAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import scala.Option;
import scala.Tuple2;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RpcEndpointAddress_ESTest extends RpcEndpointAddress_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = RpcEndpointAddress.apply("MI", 787, "xUolkg4?@@HyU!=J");
      assertEquals("spark://xUolkg4?@@HyU!=J@MI:787", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = RpcEndpointAddress.apply((RpcAddress) null, "'JU7`G)");
      rpcEndpointAddress0.rpcAddress();
      assertEquals("spark-client://'JU7`G)", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("UFhe6", 0, "UFhe6");
      rpcEndpointAddress0.rpcAddress();
      assertEquals("spark://UFhe6@UFhe6:0", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("!gUY(Fu(", 41, "!gUY(Fu(");
      rpcEndpointAddress0.rpcAddress();
      assertEquals("spark://!gUY(Fu(@!gUY(Fu(:41", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("UFhe6", 0, "scala.Option$WithFilter");
      RpcEndpointAddress rpcEndpointAddress1 = rpcEndpointAddress0.copy((RpcAddress) null, "4m8UT}I=Y] Pc1S]*+g");
      rpcEndpointAddress1.productElement(0);
      assertEquals("spark://scala.Option$WithFilter@UFhe6:0", rpcEndpointAddress0.toString());
      assertEquals("spark-client://4m8UT}I=Y] Pc1S]*+g", rpcEndpointAddress1.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RpcAddress rpcAddress0 = mock(RpcAddress.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(rpcAddress0).host();
      doReturn(0).when(rpcAddress0).port();
      RpcEndpointAddress rpcEndpointAddress0 = RpcEndpointAddress.apply(rpcAddress0, "");
      rpcEndpointAddress0.name();
      assertEquals("spark://@null:0", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress((RpcAddress) null, "!/UYO(\"u(");
      RpcEndpointAddress rpcEndpointAddress1 = rpcEndpointAddress0.copy((RpcAddress) null, "!/UYO(\"u(");
      assertEquals("spark-client://!/UYO(\"u(", rpcEndpointAddress1.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("scala.collection.GenIterable$", 2657, "");
      rpcEndpointAddress0.copy$default$2();
      assertEquals("spark://@scala.collection.GenIterable$:2657", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress((RpcAddress) null, "");
      rpcEndpointAddress0.copy$default$1();
      assertEquals("spark-client://", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("UFhe6", 0, "UFhe6");
      rpcEndpointAddress0.copy$default$1();
      assertEquals("spark://UFhe6@UFhe6:0", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("!P4mr3p3FqaY", 7, "0");
      rpcEndpointAddress0.copy$default$1();
      assertEquals("spark://0@!P4mr3p3FqaY:7", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("spark-client://", 0, "spark-client://");
      Object object0 = rpcEndpointAddress0.productElement(0);
      rpcEndpointAddress0.canEqual(object0);
      assertEquals("spark://spark-client://@spark-client://:0", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        RpcEndpointAddress.apply((RpcAddress) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // requirement failed: RpcEndpoint name must be provided.
         //
         verifyException("scala.Predef$", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RpcEndpointAddress.apply("spark-client://", 883, "spark-client://");
      // Undeclared exception!
      try { 
        RpcEndpointAddress.apply("spark-client://", 883, "spark-client://");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        RpcEndpointAddress.apply((String) null, 255, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // requirement failed: RpcEndpoint name must be provided.
         //
         verifyException("scala.Predef$", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RpcEndpointAddress.apply("X", 1184, "X");
      // Undeclared exception!
      try { 
        RpcEndpointAddress.apply("spark://X@X:1184");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        RpcEndpointAddress.apply((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = null;
      try {
        rpcEndpointAddress0 = new RpcEndpointAddress((RpcAddress) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // requirement failed: RpcEndpoint name must be provided.
         //
         verifyException("scala.Predef$", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = null;
      try {
        rpcEndpointAddress0 = new RpcEndpointAddress((String) null, 92, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // requirement failed: RpcEndpoint name must be provided.
         //
         verifyException("scala.Predef$", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("UFhe6", 0, "UFhe6");
      rpcEndpointAddress0.productElement(1);
      assertEquals("spark://UFhe6@UFhe6:0", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RpcAddress rpcAddress0 = mock(RpcAddress.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(rpcAddress0).host();
      doReturn(0).when(rpcAddress0).port();
      RpcEndpointAddress rpcEndpointAddress0 = RpcEndpointAddress.apply(rpcAddress0, "ArrayBuilder.ofDouble");
      rpcEndpointAddress0.name();
      assertEquals("spark://ArrayBuilder.ofDouble@null:0", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("Invalid Spark URL: ", (-2116), "scala.collection.immutable.Map$");
      rpcEndpointAddress0.rpcAddress();
      assertEquals("spark://scala.collection.immutable.Map$@Invalid Spark URL: :-2116", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RpcAddress rpcAddress0 = mock(RpcAddress.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(rpcAddress0).host();
      doReturn(0).when(rpcAddress0).port();
      RpcEndpointAddress rpcEndpointAddress0 = RpcEndpointAddress.apply(rpcAddress0, "");
      int int0 = rpcEndpointAddress0.productArity();
      assertEquals(2, int0);
      assertEquals("spark://@null:0", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        RpcEndpointAddress.apply("spark://spark-client://@spark-client://:100");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Invalid Spark URL: spark://spark-client://@spark-client://:100
         //
         verifyException("org.apache.spark.rpc.RpcEndpointAddress$", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        RpcEndpointAddress.apply("spark://Se@t@Se@t:1981");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Invalid Spark URL: spark://Se@t@Se@t:1981
         //
         verifyException("org.apache.spark.rpc.RpcEndpointAddress$", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = RpcEndpointAddress.apply("spark://X@X:1184");
      assertEquals("spark://X@X:1184", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        RpcEndpointAddress.apply("org.apache.spark.rpi.RpcEndpointAddsess");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Invalid Spark URL: org.apache.spark.rpi.RpcEndpointAddsess
         //
         verifyException("org.apache.spark.rpc.RpcEndpointAddress$", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        RpcEndpointAddress.apply("org.apache.spar:.rpc.RpcEndpointFddreYs$");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Invalid Spark URL: org.apache.spar:.rpc.RpcEndpointFddreYs$
         //
         verifyException("org.apache.spark.rpc.RpcEndpointAddress$", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("", 1375, "");
      RpcEndpointAddress.unapply(rpcEndpointAddress0);
      assertEquals("spark://@:1375", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("afT0}*I Yyjm|4", 41, "spark");
      RpcEndpointAddress rpcEndpointAddress1 = new RpcEndpointAddress("afT0}*I Yyjm|4", 41, "afT0}*I Yyjm|4");
      boolean boolean0 = rpcEndpointAddress1.equals(rpcEndpointAddress0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = RpcEndpointAddress.apply("org.apache.spark.rpi.RpcEndpointAddsess", (-128), "org.apache.spark.rpi.RpcEndpointAddsess");
      RpcEndpointAddress rpcEndpointAddress1 = new RpcEndpointAddress("RpcEndpointAddress", (-128), "RpcEndpointAddress");
      boolean boolean0 = rpcEndpointAddress0.equals(rpcEndpointAddress1);
      assertFalse(boolean0);
      assertEquals("spark://org.apache.spark.rpi.RpcEndpointAddsess@org.apache.spark.rpi.RpcEndpointAddsess:-128", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress((RpcAddress) null, "X");
      RpcEndpointAddress rpcEndpointAddress1 = new RpcEndpointAddress((RpcAddress) null, "X");
      boolean boolean0 = rpcEndpointAddress0.equals(rpcEndpointAddress1);
      assertEquals("spark-client://X", rpcEndpointAddress1.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = RpcEndpointAddress.apply((RpcAddress) null, "ira'/Y7Y^C*%gWg`");
      RpcEndpointAddress rpcEndpointAddress1 = RpcEndpointAddress.apply("ira'/Y7Y^C*%gWg`", (-1213), "ira'/Y7Y^C*%gWg`");
      boolean boolean0 = rpcEndpointAddress0.equals(rpcEndpointAddress1);
      assertFalse(boolean0);
      assertEquals("spark-client://ira'/Y7Y^C*%gWg`", rpcEndpointAddress0.toString());
      assertEquals("spark://ira'/Y7Y^C*%gWg`@ira'/Y7Y^C*%gWg`:-1213", rpcEndpointAddress1.toString());
      assertFalse(rpcEndpointAddress1.equals((Object)rpcEndpointAddress0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("org.apache.spark.rpc.RpcEndpointAddress$$anonfun$1", 47, "org.apache.spark.rpc.RpcEndpointAddress$$anonfun$1");
      boolean boolean0 = rpcEndpointAddress0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals("spark://org.apache.spark.rpc.RpcEndpointAddress$$anonfun$1@org.apache.spark.rpc.RpcEndpointAddress$$anonfun$1:47", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("!gUY(*u^", 45, "!gUY(*u^");
      boolean boolean0 = rpcEndpointAddress0.equals(rpcEndpointAddress0);
      assertEquals("spark://!gUY(*u^@!gUY(*u^:45", rpcEndpointAddress0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("!gUY(Fu(", 2471, "!gUY(Fu(");
      // Undeclared exception!
      try { 
        rpcEndpointAddress0.productElement(2471);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000010
         //
         verifyException("org.apache.spark.rpc.RpcEndpointAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        RpcEndpointAddress.apply("f%.Q<c{");
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Invalid Spark URL: f%.Q<c{
         //
         verifyException("org.apache.spark.rpc.RpcEndpointAddress$", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("fjj;2]zz.,$$q,frt,", (-1411), "fjj;2]zz.,$$q,frt,");
      rpcEndpointAddress0.copy$default$2();
      assertEquals("spark://fjj;2]zz.,$$q,frt,@fjj;2]zz.,$$q,frt,:-1411", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("", 5, "scala.LowPriorityImplicits");
      // Undeclared exception!
      try { 
        rpcEndpointAddress0.copy((RpcAddress) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // requirement failed: RpcEndpoint name must be provided.
         //
         verifyException("scala.Predef$", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("[D;lnG'F", 1236, "[D;lnG'F");
      String string0 = rpcEndpointAddress0.toString();
      assertEquals("spark://[D;lnG'F@[D;lnG'F:1236", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("!P4mr3p3FqaY", 7, "0");
      rpcEndpointAddress0.productIterator();
      assertEquals("spark://0@!P4mr3p3FqaY:7", rpcEndpointAddress0.toString());
      assertEquals(2, rpcEndpointAddress0.productArity());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("CLe*:b3.1b1:<=}?k5", (-227), "CLe*:b3.1b1:<=}?k5");
      String string0 = rpcEndpointAddress0.productPrefix();
      assertEquals("RpcEndpointAddress", string0);
      assertEquals("spark://CLe*:b3.1b1:<=}?k5@CLe*:b3.1b1:<=}?k5:-227", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = RpcEndpointAddress.apply((RpcAddress) null, "");
      rpcEndpointAddress0.canEqual(rpcEndpointAddress0);
      assertEquals("spark-client://", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = RpcEndpointAddress.apply("scala.reflect.ManifestFactory$", (-1136), "scala.reflect.ManifestFactory$");
      rpcEndpointAddress0.copy$default$1();
      assertEquals("spark://scala.reflect.ManifestFactory$@scala.reflect.ManifestFactory$:-1136", rpcEndpointAddress0.toString());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Option<Tuple2<RpcAddress, String>> option0 = RpcEndpointAddress.unapply((RpcEndpointAddress) null);
      assertEquals("None", option0.productPrefix());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RpcEndpointAddress rpcEndpointAddress0 = new RpcEndpointAddress("!gUY(Fu(", 45, "!gUY(Fu(");
      rpcEndpointAddress0.hashCode();
      assertEquals("spark://!gUY(Fu(@!gUY(Fu(:45", rpcEndpointAddress0.toString());
      assertEquals(2, rpcEndpointAddress0.productArity());
  }
}