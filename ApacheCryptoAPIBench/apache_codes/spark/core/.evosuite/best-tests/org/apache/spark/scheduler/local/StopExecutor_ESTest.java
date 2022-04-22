/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 23:37:06 GMT 2022
 */

package org.apache.spark.scheduler.local;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.scheduler.local.StopExecutor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StopExecutor_ESTest extends StopExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StopExecutor stopExecutor0 = new StopExecutor();
      stopExecutor0.toString();
      StopExecutor stopExecutor1 = StopExecutor.apply();
      StopExecutor stopExecutor2 = new StopExecutor();
      stopExecutor0.productIterator();
      StopExecutor stopExecutor3 = stopExecutor0.copy();
      stopExecutor0.canEqual(stopExecutor2);
      stopExecutor3.hashCode();
      stopExecutor1.productArity();
      stopExecutor3.copy();
      StopExecutor stopExecutor4 = stopExecutor0.copy();
      StopExecutor stopExecutor5 = stopExecutor2.copy();
      StopExecutor stopExecutor6 = stopExecutor5.copy();
      stopExecutor1.productIterator();
      StopExecutor stopExecutor7 = StopExecutor.apply();
      stopExecutor3.toString();
      stopExecutor0.toString();
      stopExecutor1.toString();
      stopExecutor4.toString();
      stopExecutor5.toString();
      stopExecutor2.productPrefix();
      stopExecutor7.hashCode();
      stopExecutor0.productArity();
      stopExecutor1.equals(stopExecutor4);
      StopExecutor.unapply((StopExecutor) null);
      // Undeclared exception!
      try { 
        stopExecutor6.productElement(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000095
         //
         verifyException("org.apache.spark.scheduler.local.StopExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StopExecutor.unapply((StopExecutor) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StopExecutor stopExecutor0 = StopExecutor.apply();
      stopExecutor0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StopExecutor stopExecutor0 = StopExecutor.apply();
      stopExecutor0.canEqual((Object) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StopExecutor stopExecutor0 = StopExecutor.apply();
      stopExecutor0.toString();
      StopExecutor stopExecutor1 = StopExecutor.apply();
      stopExecutor0.toString();
      stopExecutor0.equals((Object) null);
      stopExecutor0.productPrefix();
      stopExecutor1.productArity();
      StopExecutor.apply();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StopExecutor stopExecutor0 = new StopExecutor();
      stopExecutor0.toString();
      StopExecutor stopExecutor1 = StopExecutor.apply();
      StopExecutor stopExecutor2 = new StopExecutor();
      stopExecutor0.productIterator();
      StopExecutor stopExecutor3 = stopExecutor0.copy();
      stopExecutor0.canEqual(stopExecutor2);
      stopExecutor0.hashCode();
      stopExecutor2.productArity();
      StopExecutor stopExecutor4 = stopExecutor2.copy();
      StopExecutor stopExecutor5 = stopExecutor4.copy();
      stopExecutor2.copy();
      stopExecutor5.productIterator();
      StopExecutor.apply();
      stopExecutor5.toString();
      stopExecutor5.toString();
      stopExecutor0.toString();
      stopExecutor4.toString();
      stopExecutor4.productPrefix();
      stopExecutor0.hashCode();
      stopExecutor2.productArity();
      stopExecutor5.equals(stopExecutor1);
      StopExecutor.unapply(stopExecutor2);
      stopExecutor3.equals(stopExecutor5);
      stopExecutor2.toString();
      StopExecutor stopExecutor6 = new StopExecutor();
      stopExecutor5.equals(stopExecutor6);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StopExecutor stopExecutor0 = new StopExecutor();
      StopExecutor stopExecutor1 = stopExecutor0.copy();
      stopExecutor0.productArity();
      stopExecutor0.productArity();
      StopExecutor stopExecutor2 = stopExecutor1.copy();
      StopExecutor stopExecutor3 = stopExecutor1.copy();
      stopExecutor0.hashCode();
      stopExecutor3.copy();
      StopExecutor.unapply(stopExecutor1);
      stopExecutor1.toString();
      StopExecutor.unapply(stopExecutor2);
      stopExecutor3.productIterator();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StopExecutor stopExecutor0 = StopExecutor.apply();
      StopExecutor.unapply(stopExecutor0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StopExecutor stopExecutor0 = new StopExecutor();
      StopExecutor stopExecutor1 = stopExecutor0.copy();
      stopExecutor1.productArity();
      stopExecutor0.hashCode();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StopExecutor stopExecutor0 = StopExecutor.apply();
      stopExecutor0.equals(stopExecutor0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StopExecutor stopExecutor0 = new StopExecutor();
      StopExecutor stopExecutor1 = StopExecutor.apply();
      StopExecutor stopExecutor2 = StopExecutor.apply();
      stopExecutor2.hashCode();
      stopExecutor0.canEqual(stopExecutor1);
      stopExecutor0.canEqual(stopExecutor1);
      StopExecutor stopExecutor3 = stopExecutor0.copy();
      stopExecutor0.copy();
      stopExecutor3.hashCode();
      // Undeclared exception!
      try { 
        stopExecutor2.productElement(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000036
         //
         verifyException("org.apache.spark.scheduler.local.StopExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StopExecutor stopExecutor0 = new StopExecutor();
      StopExecutor.apply();
      StopExecutor.apply();
      stopExecutor0.hashCode();
      stopExecutor0.productIterator();
      stopExecutor0.toString();
      stopExecutor0.toString();
      int int0 = 0;
      // Undeclared exception!
      try { 
        stopExecutor0.productElement(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000038
         //
         verifyException("org.apache.spark.scheduler.local.StopExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StopExecutor stopExecutor0 = StopExecutor.apply();
      stopExecutor0.hashCode();
      StopExecutor stopExecutor1 = stopExecutor0.copy();
      stopExecutor0.copy();
      stopExecutor0.hashCode();
      StopExecutor stopExecutor2 = stopExecutor0.copy();
      stopExecutor2.toString();
      stopExecutor1.toString();
      stopExecutor0.copy();
      // Undeclared exception!
      try { 
        stopExecutor1.productElement(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000048
         //
         verifyException("org.apache.spark.scheduler.local.StopExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StopExecutor stopExecutor0 = StopExecutor.apply();
      // Undeclared exception!
      try { 
        stopExecutor0.productElement(821);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000012
         //
         verifyException("org.apache.spark.scheduler.local.StopExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StopExecutor stopExecutor0 = StopExecutor.apply();
      stopExecutor0.productArity();
  }
}
