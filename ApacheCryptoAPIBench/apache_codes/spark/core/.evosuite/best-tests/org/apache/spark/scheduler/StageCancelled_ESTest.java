/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:41:40 GMT 2022
 */

package org.apache.spark.scheduler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.scheduler.StageCancelled;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import scala.Function1;
import scala.Option;
import scala.Tuple2;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StageCancelled_ESTest extends StageCancelled_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StageCancelled stageCancelled0 = StageCancelled.apply(0, (Option<String>) null);
      StageCancelled stageCancelled1 = stageCancelled0.copy((-1501), (Option<String>) null);
      boolean boolean0 = stageCancelled1.equals(stageCancelled0);
      assertFalse(boolean0);
      assertFalse(stageCancelled0.equals((Object)stageCancelled1));
      assertEquals((-1501), stageCancelled1.copy$default$1());
      assertEquals(0, stageCancelled0.stageId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StageCancelled stageCancelled0 = new StageCancelled((-3072), (Option<String>) null);
      StageCancelled stageCancelled1 = stageCancelled0.copy(0, (Option<String>) null);
      int int0 = stageCancelled1.stageId();
      assertEquals(0, int0);
      assertEquals((-3072), stageCancelled0.stageId());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Option<String> option0 = (Option<String>) mock(Option.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(option0).toString();
      StageCancelled stageCancelled0 = StageCancelled.apply(3732, option0);
      int int0 = stageCancelled0.stageId();
      assertEquals(3732, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StageCancelled stageCancelled0 = StageCancelled.apply(0, (Option<String>) null);
      stageCancelled0.reason();
      assertEquals(0, stageCancelled0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StageCancelled stageCancelled0 = StageCancelled.apply(0, (Option<String>) null);
      stageCancelled0.productElement(1);
      assertEquals(0, stageCancelled0.stageId());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Option<String> option0 = (Option<String>) mock(Option.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(option0).toString();
      StageCancelled stageCancelled0 = StageCancelled.apply((-889275714), option0);
      stageCancelled0.copy$default$2();
      assertEquals((-889275714), stageCancelled0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Option<String> option0 = (Option<String>) mock(Option.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(option0).toString();
      StageCancelled stageCancelled0 = StageCancelled.apply(2773, option0);
      int int0 = stageCancelled0.copy$default$1();
      assertEquals(2773, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StageCancelled stageCancelled0 = StageCancelled.apply((-659), (Option<String>) null);
      int int0 = stageCancelled0.copy$default$1();
      assertEquals((-659), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Option<String> option0 = (Option<String>) mock(Option.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(option0).toString();
      StageCancelled stageCancelled0 = StageCancelled.apply(3732, option0);
      stageCancelled0.canEqual(stageCancelled0);
      assertEquals(3732, stageCancelled0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Option<String> option0 = (Option<String>) mock(Option.class, new ViolatedAssumptionAnswer());
      doReturn("scala.runtime.ScalaRunTime$", "scala.runtime.ScalaRunTime$", "org.apache.spark.scheduler.StageCancelled", ")tu\u0000_").when(option0).toString();
      StageCancelled stageCancelled0 = StageCancelled.apply(0, option0);
      stageCancelled0.productElement(1);
      assertEquals(0, stageCancelled0.stageId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StageCancelled stageCancelled0 = StageCancelled.apply(0, (Option<String>) null);
      Object object0 = stageCancelled0.productElement(0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StageCancelled stageCancelled0 = new StageCancelled((-3072), (Option<String>) null);
      int int0 = stageCancelled0.stageId();
      assertEquals((-3072), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Option<String> option0 = (Option<String>) mock(Option.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(option0).toString();
      StageCancelled stageCancelled0 = StageCancelled.apply(3732, option0);
      String string0 = stageCancelled0.productPrefix();
      assertEquals("StageCancelled", string0);
      assertEquals(3732, stageCancelled0.stageId());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StageCancelled stageCancelled0 = StageCancelled.apply((-843), (Option<String>) null);
      stageCancelled0.productIterator();
      assertEquals(2, stageCancelled0.productArity());
      assertEquals((-843), stageCancelled0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StageCancelled stageCancelled0 = StageCancelled.apply(5, (Option<String>) null);
      int int0 = stageCancelled0.productArity();
      assertEquals(5, stageCancelled0.copy$default$1());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StageCancelled stageCancelled0 = new StageCancelled((-3072), (Option<String>) null);
      boolean boolean0 = stageCancelled0.canEqual((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Option<String> option0 = (Option<String>) mock(Option.class, new ViolatedAssumptionAnswer());
      doReturn("amS' u7", "amS' u7", "amS' u7", "amS' u7", "amS' u7").when(option0).toString();
      StageCancelled stageCancelled0 = StageCancelled.apply((-889275714), option0);
      Option<String> option1 = stageCancelled0.reason();
      StageCancelled stageCancelled1 = stageCancelled0.copy((-2123), option1);
      StageCancelled stageCancelled2 = new StageCancelled((-2123), (Option<String>) null);
      boolean boolean0 = stageCancelled1.equals(stageCancelled2);
      assertEquals((-2123), stageCancelled1.stageId());
      assertFalse(stageCancelled0.equals((Object)stageCancelled1));
      assertFalse(boolean0);
      assertFalse(stageCancelled1.equals((Object)stageCancelled0));
      assertEquals((-889275714), stageCancelled0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Option<String> option0 = (Option<String>) mock(Option.class, new ViolatedAssumptionAnswer());
      doReturn("amS' u7", "amS' u7", "amS' u7").when(option0).toString();
      StageCancelled stageCancelled0 = StageCancelled.apply((-889275714), option0);
      StageCancelled stageCancelled1 = new StageCancelled((-889275714), (Option<String>) null);
      boolean boolean0 = stageCancelled1.equals(stageCancelled0);
      assertEquals((-889275714), stageCancelled0.copy$default$1());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Option<String> option0 = (Option<String>) mock(Option.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(option0).toString();
      StageCancelled stageCancelled0 = StageCancelled.apply((-889275714), option0);
      Option<String> option1 = stageCancelled0.reason();
      StageCancelled stageCancelled1 = new StageCancelled((-889275714), option1);
      boolean boolean0 = stageCancelled0.equals(stageCancelled1);
      assertTrue(boolean0);
      assertEquals((-889275714), stageCancelled1.stageId());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StageCancelled stageCancelled0 = new StageCancelled((-2113), (Option<String>) null);
      StageCancelled stageCancelled1 = new StageCancelled(32, (Option<String>) null);
      boolean boolean0 = stageCancelled1.equals(stageCancelled0);
      assertFalse(stageCancelled0.equals((Object)stageCancelled1));
      assertFalse(boolean0);
      assertEquals(32, stageCancelled1.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StageCancelled stageCancelled0 = new StageCancelled(9, (Option<String>) null);
      boolean boolean0 = stageCancelled0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StageCancelled stageCancelled0 = new StageCancelled(9, (Option<String>) null);
      boolean boolean0 = stageCancelled0.equals(stageCancelled0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StageCancelled stageCancelled0 = new StageCancelled(5, (Option<String>) null);
      // Undeclared exception!
      try { 
        stageCancelled0.productElement(5);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000002
         //
         verifyException("org.apache.spark.scheduler.StageCancelled", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StageCancelled stageCancelled0 = new StageCancelled((-312), (Option<String>) null);
      StageCancelled.unapply(stageCancelled0);
      assertEquals((-312), stageCancelled0.stageId());
      assertEquals((-312), stageCancelled0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Function1<Tuple2<Object, Option<String>>, StageCancelled> function1_0 = StageCancelled.tupled();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StageCancelled stageCancelled0 = StageCancelled.apply(0, (Option<String>) null);
      String string0 = stageCancelled0.toString();
      assertEquals("StageCancelled(0,null)", string0);
      assertEquals(2, stageCancelled0.productArity());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StageCancelled stageCancelled0 = StageCancelled.apply(0, (Option<String>) null);
      int int0 = stageCancelled0.copy$default$1();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StageCancelled stageCancelled0 = new StageCancelled(2333, (Option<String>) null);
      StageCancelled stageCancelled1 = stageCancelled0.copy(2333, (Option<String>) null);
      assertEquals(2333, stageCancelled1.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Option<Tuple2<Object, Option<String>>> option0 = StageCancelled.unapply((StageCancelled) null);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StageCancelled stageCancelled0 = new StageCancelled(2333, (Option<String>) null);
      stageCancelled0.hashCode();
      assertEquals(2333, stageCancelled0.stageId());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Function1<Object, Function1<Option<String>, StageCancelled>> function1_0 = StageCancelled.curried();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StageCancelled stageCancelled0 = new StageCancelled(9, (Option<String>) null);
      StageCancelled stageCancelled1 = new StageCancelled(9, (Option<String>) null);
      boolean boolean0 = stageCancelled0.equals(stageCancelled1);
      assertEquals(9, stageCancelled1.stageId());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StageCancelled stageCancelled0 = StageCancelled.apply((-1948), (Option<String>) null);
      stageCancelled0.copy$default$2();
      assertEquals((-1948), stageCancelled0.stageId());
  }
}
