/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:08:28 GMT 2022
 */

package org.apache.wicket.util.visit;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.wicket.util.visit.Visit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Visit_ESTest extends Visit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Visit<Object> visit0 = new Visit<Object>();
      visit0.stop((Object) visit0);
      Visit visit1 = (Visit)visit0.getResult();
      assertFalse(visit1.isDontGoDeeper());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Visit<Integer> visit0 = new Visit<Integer>();
      visit0.dontGoDeeper();
      boolean boolean0 = visit0.isDontGoDeeper();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Visit<Object> visit0 = new Visit<Object>();
      boolean boolean0 = visit0.isDontGoDeeper();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Visit<Object> visit0 = new Visit<Object>();
      boolean boolean0 = visit0.isContinue();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Visit<Integer> visit0 = new Visit<Integer>();
      Integer integer0 = new Integer((-2915));
      visit0.stop(integer0);
      boolean boolean0 = visit0.isStopped();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Visit<Integer> visit0 = new Visit<Integer>();
      boolean boolean0 = visit0.isStopped();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Visit<Integer> visit0 = new Visit<Integer>();
      visit0.stop();
      assertTrue(visit0.isStopped());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Visit<Object> visit0 = new Visit<Object>();
      visit0.dontGoDeeper();
      boolean boolean0 = visit0.isContinue();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Visit<Object> visit0 = new Visit<Object>();
      Object object0 = visit0.getResult();
      assertNull(object0);
  }
}