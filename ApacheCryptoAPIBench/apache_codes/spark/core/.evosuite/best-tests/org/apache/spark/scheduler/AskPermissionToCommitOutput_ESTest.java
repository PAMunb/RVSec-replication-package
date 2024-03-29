/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:45:28 GMT 2022
 */

package org.apache.spark.scheduler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.scheduler.AskPermissionToCommitOutput;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import scala.Function1;
import scala.Option;
import scala.Tuple3;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AskPermissionToCommitOutput_ESTest extends AskPermissionToCommitOutput_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(3, 1635, 3);
      AskPermissionToCommitOutput askPermissionToCommitOutput1 = AskPermissionToCommitOutput.apply(3, 1635, 1635);
      boolean boolean0 = askPermissionToCommitOutput0.equals(askPermissionToCommitOutput1);
      assertFalse(boolean0);
      assertFalse(askPermissionToCommitOutput1.equals((Object)askPermissionToCommitOutput0));
      assertEquals(1635, askPermissionToCommitOutput0.partition());
      assertEquals(1635, askPermissionToCommitOutput1.copy$default$3());
      assertEquals(3, askPermissionToCommitOutput1.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = new AskPermissionToCommitOutput(0, (-2093), 0);
      AskPermissionToCommitOutput askPermissionToCommitOutput1 = askPermissionToCommitOutput0.copy(0, 1784, 1);
      boolean boolean0 = askPermissionToCommitOutput0.equals(askPermissionToCommitOutput1);
      assertEquals(1, askPermissionToCommitOutput1.attemptNumber());
      assertFalse(boolean0);
      assertEquals(1784, askPermissionToCommitOutput1.copy$default$2());
      assertEquals(0, askPermissionToCommitOutput1.stage());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(888, 0, 0);
      AskPermissionToCommitOutput askPermissionToCommitOutput1 = askPermissionToCommitOutput0.copy(0, 888, (-1393));
      boolean boolean0 = askPermissionToCommitOutput0.equals(askPermissionToCommitOutput1);
      assertEquals(888, askPermissionToCommitOutput1.partition());
      assertFalse(boolean0);
      assertEquals(888, askPermissionToCommitOutput0.stage());
      assertEquals(0, askPermissionToCommitOutput0.partition());
      assertEquals(0, askPermissionToCommitOutput0.attemptNumber());
      assertEquals(0, askPermissionToCommitOutput1.copy$default$1());
      assertEquals((-1393), askPermissionToCommitOutput1.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = new AskPermissionToCommitOutput(0, (-2093), 0);
      int int0 = askPermissionToCommitOutput0.stage();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(2655, 2655, 0);
      int int0 = askPermissionToCommitOutput0.stage();
      assertEquals(2655, askPermissionToCommitOutput0.partition());
      assertEquals(2655, int0);
      assertEquals(0, askPermissionToCommitOutput0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(888, 0, 0);
      int int0 = askPermissionToCommitOutput0.partition();
      assertEquals(0, int0);
      assertEquals(888, askPermissionToCommitOutput0.stage());
      assertEquals(0, askPermissionToCommitOutput0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(2655, 2655, 0);
      int int0 = askPermissionToCommitOutput0.partition();
      assertEquals(2655, int0);
      assertEquals(0, askPermissionToCommitOutput0.attemptNumber());
      assertEquals(2655, askPermissionToCommitOutput0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(2655, 2655, 0);
      AskPermissionToCommitOutput askPermissionToCommitOutput1 = askPermissionToCommitOutput0.copy(2655, 0, 3247);
      assertEquals(2655, askPermissionToCommitOutput0.stage());
      assertEquals(2655, askPermissionToCommitOutput0.partition());
      assertEquals(0, askPermissionToCommitOutput1.copy$default$2());
      assertEquals(2655, askPermissionToCommitOutput1.stage());
      assertEquals(3247, askPermissionToCommitOutput1.copy$default$3());
      assertEquals(0, askPermissionToCommitOutput0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(0, 0, 0);
      AskPermissionToCommitOutput askPermissionToCommitOutput1 = askPermissionToCommitOutput0.copy(0, (-1586), 0);
      assertEquals((-1586), askPermissionToCommitOutput1.copy$default$2());
      assertEquals(0, askPermissionToCommitOutput0.copy$default$1());
      assertEquals(0, askPermissionToCommitOutput1.copy$default$3());
      assertEquals(0, askPermissionToCommitOutput1.copy$default$1());
      assertEquals(0, askPermissionToCommitOutput0.attemptNumber());
      assertEquals(0, askPermissionToCommitOutput0.partition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = new AskPermissionToCommitOutput(15, 15, 15);
      int int0 = askPermissionToCommitOutput0.copy$default$3();
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply((-889275714), (-691), (-691));
      int int0 = askPermissionToCommitOutput0.copy$default$3();
      assertEquals((-691), int0);
      assertEquals((-889275714), askPermissionToCommitOutput0.copy$default$1());
      assertEquals((-691), askPermissionToCommitOutput0.copy$default$2());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = new AskPermissionToCommitOutput(0, 0, 0);
      int int0 = askPermissionToCommitOutput0.copy$default$2();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply((-3727), (-2134), (-3727));
      int int0 = askPermissionToCommitOutput0.copy$default$2();
      assertEquals((-3727), askPermissionToCommitOutput0.attemptNumber());
      assertEquals((-2134), int0);
      assertEquals((-3727), askPermissionToCommitOutput0.stage());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = new AskPermissionToCommitOutput(2433880, 70, 2433880);
      int int0 = askPermissionToCommitOutput0.copy$default$1();
      assertEquals(2433880, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(1640, 1640, 15);
      AskPermissionToCommitOutput askPermissionToCommitOutput1 = askPermissionToCommitOutput0.copy((-2365), (-965), 1640);
      int int0 = askPermissionToCommitOutput1.copy$default$1();
      assertEquals(1640, askPermissionToCommitOutput1.copy$default$3());
      assertEquals((-965), askPermissionToCommitOutput1.copy$default$2());
      assertEquals((-2365), int0);
      assertEquals(15, askPermissionToCommitOutput0.attemptNumber());
      assertEquals(1640, askPermissionToCommitOutput0.partition());
      assertEquals(1640, askPermissionToCommitOutput0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(2655, 2655, 0);
      Object object0 = askPermissionToCommitOutput0.productElement(0);
      assertEquals(2655, object0);
      
      askPermissionToCommitOutput0.canEqual(object0);
      assertEquals(2655, askPermissionToCommitOutput0.partition());
      assertEquals(0, askPermissionToCommitOutput0.attemptNumber());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(0, 0, 0);
      int int0 = askPermissionToCommitOutput0.attemptNumber();
      assertEquals(0, askPermissionToCommitOutput0.copy$default$1());
      assertEquals(0, int0);
      assertEquals(0, askPermissionToCommitOutput0.partition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = new AskPermissionToCommitOutput(2108, 1073741824, Integer.MAX_VALUE);
      int int0 = askPermissionToCommitOutput0.attemptNumber();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply((-1860), (-889275714), (-2010));
      Object object0 = askPermissionToCommitOutput0.productElement(2);
      assertEquals((-889275714), askPermissionToCommitOutput0.copy$default$2());
      assertEquals((-1860), askPermissionToCommitOutput0.copy$default$1());
      assertEquals((-2010), object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = new AskPermissionToCommitOutput((-1), (-1), (-1));
      Object object0 = askPermissionToCommitOutput0.productElement(1);
      assertEquals((-1), object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply((-3258), (-1), 0);
      askPermissionToCommitOutput0.canEqual(askPermissionToCommitOutput0);
      assertEquals((-1), askPermissionToCommitOutput0.copy$default$2());
      assertEquals(0, askPermissionToCommitOutput0.attemptNumber());
      assertEquals((-3258), askPermissionToCommitOutput0.stage());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(0, 0, 0);
      askPermissionToCommitOutput0.productIterator();
      assertEquals(3, askPermissionToCommitOutput0.productArity());
      assertEquals(0, askPermissionToCommitOutput0.copy$default$3());
      assertEquals(0, askPermissionToCommitOutput0.partition());
      assertEquals(0, askPermissionToCommitOutput0.stage());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(2, 2, (-2267));
      int int0 = askPermissionToCommitOutput0.attemptNumber();
      assertEquals((-2267), int0);
      assertEquals(2, askPermissionToCommitOutput0.partition());
      assertEquals(2, askPermissionToCommitOutput0.stage());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply((-1840), (-1840), (-1840));
      int int0 = askPermissionToCommitOutput0.productArity();
      assertEquals(3, int0);
      assertEquals((-1840), askPermissionToCommitOutput0.stage());
      assertEquals((-1840), askPermissionToCommitOutput0.partition());
      assertEquals((-1840), askPermissionToCommitOutput0.attemptNumber());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply((-3258), (-1), 0);
      int int0 = askPermissionToCommitOutput0.stage();
      assertEquals((-3258), int0);
      assertEquals(0, askPermissionToCommitOutput0.copy$default$3());
      assertEquals((-1), askPermissionToCommitOutput0.partition());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = new AskPermissionToCommitOutput(0, (-2093), 0);
      String string0 = askPermissionToCommitOutput0.productPrefix();
      assertEquals("AskPermissionToCommitOutput", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = new AskPermissionToCommitOutput((-1), (-1), (-1));
      int int0 = askPermissionToCommitOutput0.partition();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = new AskPermissionToCommitOutput((-1), (-1), (-1));
      AskPermissionToCommitOutput.unapply(askPermissionToCommitOutput0);
      assertEquals((-1), askPermissionToCommitOutput0.copy$default$3());
      assertEquals((-1), askPermissionToCommitOutput0.partition());
      assertEquals((-1), askPermissionToCommitOutput0.stage());
      assertEquals((-1), askPermissionToCommitOutput0.copy$default$2());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply((-3895), (-3895), (-3895));
      AskPermissionToCommitOutput askPermissionToCommitOutput1 = askPermissionToCommitOutput0.copy((-3895), (-3895), 1228);
      boolean boolean0 = askPermissionToCommitOutput1.equals(askPermissionToCommitOutput0);
      assertFalse(askPermissionToCommitOutput0.equals((Object)askPermissionToCommitOutput1));
      assertEquals((-3895), askPermissionToCommitOutput0.copy$default$2());
      assertEquals((-3895), askPermissionToCommitOutput1.partition());
      assertEquals((-3895), askPermissionToCommitOutput0.attemptNumber());
      assertEquals(1228, askPermissionToCommitOutput1.attemptNumber());
      assertEquals((-3895), askPermissionToCommitOutput1.stage());
      assertEquals((-3895), askPermissionToCommitOutput0.stage());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply((-3523), (-3523), (-3523));
      AskPermissionToCommitOutput askPermissionToCommitOutput1 = askPermissionToCommitOutput0.copy((-3523), 1936, (-3523));
      boolean boolean0 = askPermissionToCommitOutput1.equals(askPermissionToCommitOutput0);
      assertFalse(boolean0);
      assertFalse(askPermissionToCommitOutput0.equals((Object)askPermissionToCommitOutput1));
      assertEquals((-3523), askPermissionToCommitOutput1.copy$default$3());
      assertEquals(1936, askPermissionToCommitOutput1.partition());
      assertEquals((-3523), askPermissionToCommitOutput1.copy$default$1());
      assertEquals((-3523), askPermissionToCommitOutput0.copy$default$2());
      assertEquals((-3523), askPermissionToCommitOutput0.stage());
      assertEquals((-3523), askPermissionToCommitOutput0.copy$default$3());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply((-758), (-758), (-758));
      AskPermissionToCommitOutput askPermissionToCommitOutput1 = askPermissionToCommitOutput0.copy(2116, 2116, (-758));
      boolean boolean0 = askPermissionToCommitOutput0.equals(askPermissionToCommitOutput1);
      assertEquals((-758), askPermissionToCommitOutput1.attemptNumber());
      assertEquals((-758), askPermissionToCommitOutput0.copy$default$3());
      assertEquals(2116, askPermissionToCommitOutput1.partition());
      assertEquals((-758), askPermissionToCommitOutput0.stage());
      assertEquals((-758), askPermissionToCommitOutput0.copy$default$2());
      assertFalse(boolean0);
      assertEquals(2116, askPermissionToCommitOutput1.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(0, 0, 756);
      boolean boolean0 = askPermissionToCommitOutput0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(0, askPermissionToCommitOutput0.copy$default$2());
      assertEquals(756, askPermissionToCommitOutput0.attemptNumber());
      assertEquals(0, askPermissionToCommitOutput0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(13, 13, 13);
      boolean boolean0 = askPermissionToCommitOutput0.equals(askPermissionToCommitOutput0);
      assertEquals(13, askPermissionToCommitOutput0.partition());
      assertEquals(13, askPermissionToCommitOutput0.attemptNumber());
      assertTrue(boolean0);
      assertEquals(13, askPermissionToCommitOutput0.stage());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(2131, 2131, 2131);
      // Undeclared exception!
      try { 
        askPermissionToCommitOutput0.productElement(2131);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000012
         //
         verifyException("org.apache.spark.scheduler.AskPermissionToCommitOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Function1<Tuple3<Object, Object, Object>, AskPermissionToCommitOutput> function1_0 = AskPermissionToCommitOutput.tupled();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(0, 0, 0);
      int int0 = askPermissionToCommitOutput0.copy$default$3();
      assertEquals(0, askPermissionToCommitOutput0.copy$default$1());
      assertEquals(0, int0);
      assertEquals(0, askPermissionToCommitOutput0.partition());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(0, 0, 0);
      int int0 = askPermissionToCommitOutput0.copy$default$1();
      assertEquals(0, int0);
      assertEquals(0, askPermissionToCommitOutput0.copy$default$3());
      assertEquals(0, askPermissionToCommitOutput0.partition());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = new AskPermissionToCommitOutput((-1), (-1), (-1));
      askPermissionToCommitOutput0.hashCode();
      assertEquals((-1), askPermissionToCommitOutput0.copy$default$3());
      assertEquals((-1), askPermissionToCommitOutput0.copy$default$2());
      assertEquals((-1), askPermissionToCommitOutput0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Function1<Object, Function1<Object, Function1<Object, AskPermissionToCommitOutput>>> function1_0 = AskPermissionToCommitOutput.curried();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(11, 11, 11);
      AskPermissionToCommitOutput askPermissionToCommitOutput1 = AskPermissionToCommitOutput.apply(11, 11, 11);
      boolean boolean0 = askPermissionToCommitOutput1.equals(askPermissionToCommitOutput0);
      assertEquals(11, askPermissionToCommitOutput1.stage());
      assertTrue(boolean0);
      assertEquals(11, askPermissionToCommitOutput1.copy$default$2());
      assertEquals(11, askPermissionToCommitOutput1.attemptNumber());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
      String string0 = askPermissionToCommitOutput0.toString();
      assertEquals(3, askPermissionToCommitOutput0.productArity());
      assertEquals("AskPermissionToCommitOutput(2147483647,2147483647,2147483647)", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Option<Tuple3<Object, Object, Object>> option0 = AskPermissionToCommitOutput.unapply((AskPermissionToCommitOutput) null);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      AskPermissionToCommitOutput askPermissionToCommitOutput0 = AskPermissionToCommitOutput.apply(4337, 4337, 4337);
      int int0 = askPermissionToCommitOutput0.copy$default$2();
      assertEquals(4337, askPermissionToCommitOutput0.copy$default$3());
      assertEquals(4337, askPermissionToCommitOutput0.copy$default$1());
      assertEquals(4337, int0);
  }
}
