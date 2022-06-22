/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:12:40 GMT 2022
 */

package org.apache.spark;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.spark.Aggregator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import scala.Function1;
import scala.Function2;
import scala.Option;
import scala.Product2;
import scala.Tuple2;
import scala.Tuple3;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Aggregator_ESTest extends Aggregator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Function2<Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>> function2_0 = (Function2<Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) mock(Function2.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(function2_0).toString();
      Aggregator<Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>> aggregator0 = new Aggregator<Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>>((Function1<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null, function2_0, (Function2<Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null);
      Function2<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>> function2_1 = aggregator0.copy$default$2();
      Aggregator<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>> aggregator1 = Aggregator.apply((Function1<Tuple2.mcJD.sp, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null, function2_1, (Function2<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null);
      Aggregator<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>> aggregator2 = aggregator1.copy((Function1<Tuple2.mcJD.sp, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null, function2_1, (Function2<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null);
      assertTrue(aggregator2.equals((Object)aggregator1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Aggregator<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>> aggregator0 = new Aggregator<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>((Function1<Tuple2.mcJD.sp, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null, (Function2<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null, (Function2<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null);
      Object object0 = aggregator0.productElement(0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Aggregator<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp, Tuple2.mcJD.sp> aggregator0 = Aggregator.apply((Function1<Tuple2.mcJD.sp, Tuple2.mcJD.sp>) null, (Function2<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>) null, (Function2<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>) null);
      Function2<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp> function2_0 = aggregator0.mergeValue();
      assertNull(function2_0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Function1<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp> function1_0 = (Function1<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(function1_0).toString();
      Aggregator<Tuple2.mcJD.sp, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp> aggregator0 = new Aggregator<Tuple2.mcJD.sp, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp>(function1_0, (Function2<Tuple2.mcJD.sp, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp>) null, (Function2<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>) null);
      Function1<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp> function1_1 = aggregator0.createCombiner();
      assertSame(function1_1, function1_0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Function2<Tuple2.mcJD.sp, Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp> function2_0 = (Function2<Tuple2.mcJD.sp, Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp>) mock(Function2.class, new ViolatedAssumptionAnswer());
      doReturn("^,mXf2bjlMDx<;6N", "spark.storage.unrollFraction", "spark.storage.unrollFraction", "2^Axyx_*2VD3GV", "^,mXf2bjlMDx<;6N").when(function2_0).toString();
      Aggregator<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp> aggregator0 = new Aggregator<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp>((Function1<Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp>) null, function2_0, (Function2<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>) null);
      Function2<Tuple2.mcJD.sp, Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp> function2_1 = aggregator0.mergeValue();
      Aggregator<Tuple2.mcJD.sp, Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp> aggregator1 = Aggregator.apply((Function1<Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp>) null, function2_1, (Function2<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>) null);
      Function2<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp> function2_2 = aggregator1.copy$default$2();
      Function1<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>> function1_0 = (Function1<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(function1_0).toString();
      Aggregator<Tuple2.mcJD.sp, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>> aggregator2 = new Aggregator<Tuple2.mcJD.sp, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>(function1_0, (Function2<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null, (Function2<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null);
      Function1<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp> function1_1 = aggregator2.copy$default$1();
      Aggregator<Tuple2.mcJD.sp, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp> aggregator3 = Aggregator.apply(function1_1, (Function2<Tuple2.mcJD.sp, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp>) null, function2_2);
      Function2<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp> function2_3 = aggregator3.copy$default$3();
      assertSame(function2_2, function2_3);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Aggregator<Tuple2.mcJD.sp, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>> aggregator0 = new Aggregator<Tuple2.mcJD.sp, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>((Function1<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null, (Function2<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null, (Function2<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null);
      boolean boolean0 = aggregator0.canEqual((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Function1<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>> function1_0 = (Function1<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(function1_0).toString();
      Aggregator<Tuple2.mcJD.sp, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>> aggregator0 = Aggregator.apply(function1_0, (Function2<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null, (Function2<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null);
      Object object0 = aggregator0.productElement(0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>> aggregator0 = new Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>((Function1<Tuple2.mcJD.sp, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null, (Function2<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null, (Function2<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null);
      Aggregator<Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>> aggregator1 = new Aggregator<Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>((Function1<Tuple2.mcJD.sp, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null, (Function2<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null, (Function2<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null);
      boolean boolean0 = aggregator1.canEqual(aggregator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Aggregator<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp, Tuple2.mcJD.sp> aggregator0 = Aggregator.apply((Function1<Tuple2.mcJD.sp, Tuple2.mcJD.sp>) null, (Function2<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>) null, (Function2<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>) null);
      int int0 = aggregator0.productArity();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Aggregator<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>> aggregator0 = Aggregator.apply((Function1<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null, (Function2<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null, (Function2<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null);
      Function1<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>> function1_0 = aggregator0.createCombiner();
      assertNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Function1<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>> function1_0 = (Function1<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(function1_0).toString();
      Aggregator<Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>> aggregator0 = new Aggregator<Aggregator<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>(function1_0, (Function2<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null, (Function2<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null);
      Function1<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>> function1_1 = aggregator0.copy$default$1();
      Aggregator<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>> aggregator1 = new Aggregator<Product2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>(function1_1, (Function2<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null, (Function2<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) null);
      Function2<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>> function2_0 = aggregator1.mergeCombiners();
      assertNull(function2_0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Aggregator<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp> aggregator0 = Aggregator.apply((Function1<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp>) null, (Function2<Tuple2.mcJD.sp, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp>) null, (Function2<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>) null);
      String string0 = aggregator0.productPrefix();
      assertEquals("Aggregator", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Aggregator<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp, Tuple2.mcJD.sp> aggregator0 = new Aggregator<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2.mcJD.sp, Tuple2.mcJD.sp>((Function1<Tuple2.mcJD.sp, Tuple2.mcJD.sp>) null, (Function2<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>) null, (Function2<Tuple2.mcJD.sp, Tuple2.mcJD.sp, Tuple2.mcJD.sp>) null);
      Option<Tuple3<Function1<Tuple2<Tuple2.mcJD.sp, Product2>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>, Function2<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Product2>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>, Function2<Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>>> option0 = Aggregator.unapply((Aggregator<Tuple2.mcJD.sp, Tuple2<Tuple2.mcJD.sp, Product2>, Tuple2<Tuple2.mcJD.sp, Tuple2.mcJD.sp>>) aggregator0);
      assertNotNull(option0);
  }
}