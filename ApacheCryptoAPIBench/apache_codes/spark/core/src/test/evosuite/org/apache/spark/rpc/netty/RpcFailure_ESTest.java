/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 23:02:20 GMT 2022
 */

package org.apache.spark.rpc.netty;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.rpc.netty.RpcFailure;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import scala.Function1;
import scala.Option;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RpcFailure_ESTest extends RpcFailure_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RpcFailure rpcFailure0 = RpcFailure.apply((Throwable) null);
      Object object0 = rpcFailure0.productElement(0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RpcFailure rpcFailure0 = new RpcFailure((Throwable) null);
      Throwable throwable0 = rpcFailure0.e();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(throwable0).toString();
      RpcFailure rpcFailure0 = RpcFailure.apply(throwable0);
      Throwable throwable1 = rpcFailure0.copy$default$1();
      assertSame(throwable1, throwable0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      doReturn("org.apache.spark.rpc.netty.RpcFailure", (String) null).when(throwable0).toString();
      RpcFailure rpcFailure0 = RpcFailure.apply(throwable0);
      boolean boolean0 = rpcFailure0.canEqual(rpcFailure0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(throwable0).toString();
      RpcFailure rpcFailure0 = RpcFailure.apply(throwable0);
      Throwable throwable1 = rpcFailure0.e();
      assertNull(throwable1.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(throwable0).toString();
      RpcFailure rpcFailure0 = RpcFailure.apply(throwable0);
      Object object0 = rpcFailure0.productElement(0);
      boolean boolean0 = rpcFailure0.canEqual(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RpcFailure rpcFailure0 = new RpcFailure((Throwable) null);
      rpcFailure0.productIterator();
      assertEquals(1, rpcFailure0.productArity());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(throwable0).toString();
      RpcFailure rpcFailure0 = RpcFailure.apply(throwable0);
      int int0 = rpcFailure0.productArity();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(throwable0).toString();
      RpcFailure rpcFailure0 = RpcFailure.apply(throwable0);
      String string0 = rpcFailure0.productPrefix();
      assertEquals("RpcFailure", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RpcFailure rpcFailure0 = RpcFailure.apply((Throwable) null);
      Option<Throwable> option0 = RpcFailure.unapply(rpcFailure0);
      assertEquals(1, option0.productArity());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      doReturn("org.apache.spark.rpc.netty.RpcFailure", "org.apache.spark.rpc.netty.RpcFailure", "scala.PartialFunction$OrElse", "org.apache.spark.rpc.netty.RpcFailure", "scala.PartialFunction$OrElse").when(throwable0).toString();
      RpcFailure rpcFailure0 = RpcFailure.apply(throwable0);
      RpcFailure rpcFailure1 = rpcFailure0.copy(throwable0);
      boolean boolean0 = rpcFailure1.equals(rpcFailure0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      doReturn("org.apache.spark.rpc.netty.RpcFailure", "org.apache.spark.rpc.netty.RpcFailure", (String) null).when(throwable0).toString();
      RpcFailure rpcFailure0 = RpcFailure.apply(throwable0);
      RpcFailure rpcFailure1 = new RpcFailure((Throwable) null);
      boolean boolean0 = rpcFailure1.equals(rpcFailure0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      doReturn("org.apache.spark.rpc.netty.RpcFailure", "org.apache.spark.rpc.netty.RpcFailure").when(throwable0).toString();
      RpcFailure rpcFailure0 = RpcFailure.apply((Throwable) null);
      RpcFailure rpcFailure1 = rpcFailure0.copy(throwable0);
      boolean boolean0 = rpcFailure1.equals(rpcFailure0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RpcFailure rpcFailure0 = RpcFailure.apply((Throwable) null);
      boolean boolean0 = rpcFailure0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RpcFailure rpcFailure0 = new RpcFailure((Throwable) null);
      boolean boolean0 = rpcFailure0.equals(rpcFailure0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RpcFailure rpcFailure0 = RpcFailure.apply((Throwable) null);
      // Undeclared exception!
      try { 
        rpcFailure0.productElement(1024);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000012
         //
         verifyException("org.apache.spark.rpc.netty.RpcFailure", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Function1<Throwable, Throwable> function1_0 = RpcFailure.andThen((Function1<RpcFailure, Throwable>) null);
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RpcFailure rpcFailure0 = RpcFailure.apply((Throwable) null);
      rpcFailure0.hashCode();
      assertEquals(1, rpcFailure0.productArity());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Option<Throwable> option0 = RpcFailure.unapply((RpcFailure) null);
      assertEquals(0, option0.productArity());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RpcFailure rpcFailure0 = RpcFailure.apply((Throwable) null);
      Throwable throwable0 = rpcFailure0.copy$default$1();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Function1<Throwable, RpcFailure> function1_0 = RpcFailure.compose((Function1<Throwable, Throwable>) null);
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RpcFailure rpcFailure0 = new RpcFailure((Throwable) null);
      RpcFailure rpcFailure1 = RpcFailure.apply((Throwable) null);
      boolean boolean0 = rpcFailure1.equals(rpcFailure0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RpcFailure rpcFailure0 = RpcFailure.apply((Throwable) null);
      String string0 = rpcFailure0.toString();
      assertEquals("RpcFailure(null)", string0);
  }
}
