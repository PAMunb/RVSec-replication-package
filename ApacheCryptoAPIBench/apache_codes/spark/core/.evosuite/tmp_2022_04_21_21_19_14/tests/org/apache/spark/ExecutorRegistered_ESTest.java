/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:59:50 GMT 2022
 */

package org.apache.spark;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.ExecutorRegistered;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import scala.Function1;
import scala.Option;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExecutorRegistered_ESTest extends ExecutorRegistered_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = new ExecutorRegistered((String) null);
      Object object0 = executorRegistered0.productElement(0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = new ExecutorRegistered((String) null);
      String string0 = executorRegistered0.executorId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = ExecutorRegistered.apply("");
      String string0 = executorRegistered0.executorId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = new ExecutorRegistered((String) null);
      String string0 = executorRegistered0.copy$default$1();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = ExecutorRegistered.apply("");
      String string0 = executorRegistered0.copy$default$1();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = ExecutorRegistered.apply("");
      boolean boolean0 = executorRegistered0.canEqual(executorRegistered0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = ExecutorRegistered.apply("Array(");
      Object object0 = executorRegistered0.productElement(0);
      assertEquals("Array(", object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = new ExecutorRegistered("tail of empty list");
      String string0 = executorRegistered0.executorId();
      assertEquals("tail of empty list", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = new ExecutorRegistered("1)<Bh& 3");
      int int0 = executorRegistered0.productArity();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = ExecutorRegistered.apply("");
      executorRegistered0.productIterator();
      assertEquals(1, executorRegistered0.productArity());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = new ExecutorRegistered("j");
      String string0 = executorRegistered0.productPrefix();
      assertEquals("ExecutorRegistered", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = new ExecutorRegistered("");
      Option<String> option0 = ExecutorRegistered.unapply(executorRegistered0);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = new ExecutorRegistered("scala.collection.GenTraversable$class");
      ExecutorRegistered executorRegistered1 = ExecutorRegistered.apply((String) null);
      boolean boolean0 = executorRegistered0.equals(executorRegistered1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = new ExecutorRegistered((String) null);
      ExecutorRegistered executorRegistered1 = executorRegistered0.copy((String) null);
      boolean boolean0 = executorRegistered1.equals(executorRegistered0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = new ExecutorRegistered((String) null);
      ExecutorRegistered executorRegistered1 = executorRegistered0.copy("");
      boolean boolean0 = executorRegistered0.equals(executorRegistered1);
      assertFalse(boolean0);
      assertFalse(executorRegistered1.equals((Object)executorRegistered0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = ExecutorRegistered.apply("");
      boolean boolean0 = executorRegistered0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = new ExecutorRegistered((String) null);
      boolean boolean0 = executorRegistered0.equals(executorRegistered0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = new ExecutorRegistered("ExecutorRegistered");
      // Undeclared exception!
      try { 
        executorRegistered0.productElement((-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000002
         //
         verifyException("org.apache.spark.ExecutorRegistered", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Option<String> option0 = ExecutorRegistered.unapply((ExecutorRegistered) null);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = ExecutorRegistered.apply("ht!D4|");
      String string0 = executorRegistered0.copy$default$1();
      assertEquals("ht!D4|", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Function1<ExecutorRegistered, ExecutorRegistered> function1_0 = ExecutorRegistered.compose((Function1<ExecutorRegistered, String>) null);
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = ExecutorRegistered.apply("org.apache.spark.ExecutorRegistered$");
      ExecutorRegistered executorRegistered1 = executorRegistered0.copy("org.apache.spark.ExecutorRegistered$");
      boolean boolean0 = executorRegistered0.equals(executorRegistered1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = new ExecutorRegistered("org.apache.spark.ExecutorRegistered$");
      executorRegistered0.hashCode();
      assertEquals(1, executorRegistered0.productArity());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = ExecutorRegistered.apply("Array(");
      boolean boolean0 = executorRegistered0.canEqual("Array(");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Function1<String, ExecutorRegistered> function1_0 = ExecutorRegistered.andThen((Function1<ExecutorRegistered, ExecutorRegistered>) null);
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ExecutorRegistered executorRegistered0 = ExecutorRegistered.apply("%7)EnV<f");
      String string0 = executorRegistered0.toString();
      assertEquals("ExecutorRegistered(%7)EnV<f)", string0);
  }
}
