/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:58:32 GMT 2022
 */

package org.apache.spark.deploy.history;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.deploy.history.LoadedAppUI;
import org.apache.spark.ui.SparkUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import scala.Function1;
import scala.Option;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LoadedAppUI_ESTest extends LoadedAppUI_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SparkUI sparkUI0 = mock(SparkUI.class, new ViolatedAssumptionAnswer());
      LoadedAppUI loadedAppUI0 = new LoadedAppUI(sparkUI0);
      assertTrue(loadedAppUI0.valid());
      
      loadedAppUI0.invalidate();
      boolean boolean0 = loadedAppUI0.valid();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SparkUI sparkUI0 = mock(SparkUI.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(sparkUI0).toString();
      LoadedAppUI loadedAppUI0 = new LoadedAppUI(sparkUI0);
      loadedAppUI0.productElement(0);
      assertTrue(loadedAppUI0.valid());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SparkUI sparkUI0 = mock(SparkUI.class, new ViolatedAssumptionAnswer());
      LoadedAppUI loadedAppUI0 = new LoadedAppUI(sparkUI0);
      loadedAppUI0.canEqual((Object) null);
      assertTrue(loadedAppUI0.valid());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LoadedAppUI loadedAppUI0 = new LoadedAppUI((SparkUI) null);
      loadedAppUI0.productElement(0);
      assertTrue(loadedAppUI0.valid());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LoadedAppUI loadedAppUI0 = LoadedAppUI.apply((SparkUI) null);
      loadedAppUI0.productIterator();
      assertEquals(1, loadedAppUI0.productArity());
      assertTrue(loadedAppUI0.valid());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LoadedAppUI loadedAppUI0 = new LoadedAppUI((SparkUI) null);
      loadedAppUI0.ui();
      assertTrue(loadedAppUI0.valid());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SparkUI sparkUI0 = mock(SparkUI.class, new ViolatedAssumptionAnswer());
      LoadedAppUI loadedAppUI0 = new LoadedAppUI(sparkUI0);
      int int0 = loadedAppUI0.productArity();
      assertEquals(1, int0);
      assertTrue(loadedAppUI0.valid());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Option<SparkUI> option0 = LoadedAppUI.unapply((LoadedAppUI) null);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LoadedAppUI loadedAppUI0 = LoadedAppUI.apply((SparkUI) null);
      boolean boolean0 = loadedAppUI0.equals((Object) null);
      assertFalse(boolean0);
      assertTrue(loadedAppUI0.valid());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LoadedAppUI loadedAppUI0 = LoadedAppUI.apply((SparkUI) null);
      boolean boolean0 = loadedAppUI0.equals(loadedAppUI0);
      assertTrue(loadedAppUI0.valid());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LoadedAppUI loadedAppUI0 = LoadedAppUI.apply((SparkUI) null);
      // Undeclared exception!
      try { 
        loadedAppUI0.productElement(2340);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000012
         //
         verifyException("org.apache.spark.deploy.history.LoadedAppUI", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LoadedAppUI loadedAppUI0 = LoadedAppUI.apply((SparkUI) null);
      loadedAppUI0.hashCode();
      assertTrue(loadedAppUI0.valid());
      assertEquals(1, loadedAppUI0.productArity());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LoadedAppUI loadedAppUI0 = LoadedAppUI.apply((SparkUI) null);
      String string0 = loadedAppUI0.toString();
      assertEquals("LoadedAppUI(null)", string0);
      assertTrue(loadedAppUI0.valid());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Function1<SparkUI, LoadedAppUI> function1_0 = LoadedAppUI.compose((Function1<SparkUI, SparkUI>) null);
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LoadedAppUI loadedAppUI0 = LoadedAppUI.apply((SparkUI) null);
      String string0 = loadedAppUI0.productPrefix();
      assertTrue(loadedAppUI0.valid());
      assertEquals("LoadedAppUI", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LoadedAppUI loadedAppUI0 = new LoadedAppUI((SparkUI) null);
      loadedAppUI0.copy$default$1();
      assertTrue(loadedAppUI0.valid());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LoadedAppUI loadedAppUI0 = LoadedAppUI.apply((SparkUI) null);
      boolean boolean0 = loadedAppUI0.valid();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Function1<SparkUI, SparkUI> function1_0 = LoadedAppUI.andThen((Function1<LoadedAppUI, SparkUI>) null);
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LoadedAppUI loadedAppUI0 = LoadedAppUI.apply((SparkUI) null);
      loadedAppUI0.lock();
      assertTrue(loadedAppUI0.valid());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LoadedAppUI loadedAppUI0 = new LoadedAppUI((SparkUI) null);
      LoadedAppUI loadedAppUI1 = loadedAppUI0.copy((SparkUI) null);
      assertTrue(loadedAppUI1.valid());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LoadedAppUI loadedAppUI0 = LoadedAppUI.apply((SparkUI) null);
      LoadedAppUI.unapply(loadedAppUI0);
      assertTrue(loadedAppUI0.valid());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LoadedAppUI loadedAppUI0 = LoadedAppUI.apply((SparkUI) null);
      loadedAppUI0.canEqual(loadedAppUI0);
      assertTrue(loadedAppUI0.valid());
  }
}