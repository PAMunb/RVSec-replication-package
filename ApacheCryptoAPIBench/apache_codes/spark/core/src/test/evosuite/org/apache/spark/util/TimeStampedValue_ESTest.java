/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 23:03:20 GMT 2022
 */

package org.apache.spark.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.util.TimeStampedValue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import scala.Option;
import scala.Tuple2;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TimeStampedValue_ESTest extends TimeStampedValue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Tuple2<Object, Object> tuple2_0 = (Tuple2<Object, Object>) mock(Tuple2.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(tuple2_0).toString();
      TimeStampedValue<Tuple2<Object, Object>> timeStampedValue0 = new TimeStampedValue<Tuple2<Object, Object>>(tuple2_0, (-1L));
      TimeStampedValue<Object> timeStampedValue1 = new TimeStampedValue<Object>(timeStampedValue0, 0L);
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue2 = TimeStampedValue.apply(timeStampedValue1, (-1294L));
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue3 = TimeStampedValue.apply(timeStampedValue1, (-2353L));
      TimeStampedValue<Object> timeStampedValue4 = TimeStampedValue.apply((Object) timeStampedValue2, 0L);
      TimeStampedValue timeStampedValue5 = (TimeStampedValue)timeStampedValue4.value();
      boolean boolean0 = timeStampedValue3.equals(timeStampedValue5);
      assertEquals((-1294L), timeStampedValue5.copy$default$2());
      assertFalse(boolean0);
      assertFalse(timeStampedValue4.equals((Object)timeStampedValue1));
      assertFalse(timeStampedValue2.equals((Object)timeStampedValue3));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeStampedValue<Object> timeStampedValue0 = new TimeStampedValue<Object>((Object) null, 0L);
      Object object0 = timeStampedValue0.value();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeStampedValue<Object> timeStampedValue0 = new TimeStampedValue<Object>((Object) null, 2002L);
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue1 = TimeStampedValue.apply(timeStampedValue0, 0L);
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue2 = timeStampedValue1.copy(timeStampedValue0, 2002L);
      long long0 = timeStampedValue2.timestamp();
      assertEquals(2002L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeStampedValue<Object> timeStampedValue0 = new TimeStampedValue<Object>((Object) null, 0L);
      Object object0 = timeStampedValue0.productElement(0);
      TimeStampedValue<Object> timeStampedValue1 = new TimeStampedValue<Object>(object0, (-2827L));
      long long0 = timeStampedValue1.timestamp();
      assertEquals((-2827L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeStampedValue<Object> timeStampedValue0 = new TimeStampedValue<Object>((Object) null, 0L);
      TimeStampedValue<Object> timeStampedValue1 = timeStampedValue0.copy((Object) null, 0L);
      assertEquals(0L, timeStampedValue1.copy$default$2());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeStampedValue<Tuple2<Object, Object>> timeStampedValue0 = TimeStampedValue.apply((Tuple2<Object, Object>) null, 0L);
      TimeStampedValue<Tuple2<Object, Object>> timeStampedValue1 = timeStampedValue0.copy((Tuple2<Object, Object>) null, 1560L);
      long long0 = timeStampedValue1.copy$default$2();
      assertEquals(1560L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeStampedValue<Object> timeStampedValue0 = new TimeStampedValue<Object>((Object) null, (-842L));
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue1 = TimeStampedValue.apply(timeStampedValue0, (-2050L));
      long long0 = timeStampedValue1.copy$default$2();
      assertEquals((-2050L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Tuple2<Object, Object> tuple2_0 = (Tuple2<Object, Object>) mock(Tuple2.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(tuple2_0).toString();
      TimeStampedValue<Tuple2<Object, Object>> timeStampedValue0 = TimeStampedValue.apply(tuple2_0, (-1L));
      Object object0 = timeStampedValue0.productElement(0);
      TimeStampedValue<Object> timeStampedValue1 = new TimeStampedValue<Object>(object0, (-1L));
      Object object1 = timeStampedValue0.value();
      timeStampedValue1.canEqual(object1);
      assertEquals((-1L), timeStampedValue0.timestamp());
      assertEquals((-1L), timeStampedValue0.copy$default$2());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Tuple2<Object, Object> tuple2_0 = (Tuple2<Object, Object>) mock(Tuple2.class, new ViolatedAssumptionAnswer());
      doReturn("E PV((lbop$V?2mI)n", "E PV((lbop$V?2mI)n", "1ye\":y}", "!Cht@tRuN+>", "E PV((lbop$V?2mI)n").when(tuple2_0).toString();
      TimeStampedValue<Tuple2<Object, Object>> timeStampedValue0 = new TimeStampedValue<Tuple2<Object, Object>>(tuple2_0, 0L);
      Option<Tuple2<Tuple2<Object, Object>, Object>> option0 = TimeStampedValue.unapply(timeStampedValue0);
      TimeStampedValue<Object> timeStampedValue1 = new TimeStampedValue<Object>(option0, 0L);
      TimeStampedValue<Object> timeStampedValue2 = timeStampedValue1.copy$default$1();
      // Undeclared exception!
      try { 
        timeStampedValue2.value();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Tuple2<Object, Object> tuple2_0 = (Tuple2<Object, Object>) mock(Tuple2.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(tuple2_0).toString();
      TimeStampedValue<Tuple2<Object, Object>> timeStampedValue0 = new TimeStampedValue<Tuple2<Object, Object>>(tuple2_0, 0L);
      Option<Tuple2<Tuple2<Object, Object>, Object>> option0 = TimeStampedValue.unapply(timeStampedValue0);
      TimeStampedValue<Object> timeStampedValue1 = new TimeStampedValue<Object>(option0, 0L);
      TimeStampedValue<Object> timeStampedValue2 = timeStampedValue1.copy$default$1();
      // Undeclared exception!
      try { 
        timeStampedValue2.toString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Tuple2<Object, Object> tuple2_0 = (Tuple2<Object, Object>) mock(Tuple2.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "OH6 7xci[L&UY(f", (String) null, "OH6 7xci[L&UY(f", "empty.reduceRight").when(tuple2_0).toString();
      TimeStampedValue<Tuple2<Object, Object>> timeStampedValue0 = new TimeStampedValue<Tuple2<Object, Object>>(tuple2_0, 0L);
      Option<Tuple2<Tuple2<Object, Object>, Object>> option0 = TimeStampedValue.unapply(timeStampedValue0);
      TimeStampedValue<Object> timeStampedValue1 = new TimeStampedValue<Object>(option0, 0L);
      TimeStampedValue<Object> timeStampedValue2 = timeStampedValue1.copy$default$1();
      // Undeclared exception!
      try { 
        timeStampedValue2.productPrefix();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Tuple2<Object, Object> tuple2_0 = (Tuple2<Object, Object>) mock(Tuple2.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, "OH6 7xci[L&UY(f", (String) null, "OH6 7xci[L&UY(f", "empty.reduceRight").when(tuple2_0).toString();
      TimeStampedValue<Tuple2<Object, Object>> timeStampedValue0 = new TimeStampedValue<Tuple2<Object, Object>>(tuple2_0, 0L);
      Option<Tuple2<Tuple2<Object, Object>, Object>> option0 = TimeStampedValue.unapply(timeStampedValue0);
      TimeStampedValue<Object> timeStampedValue1 = new TimeStampedValue<Object>(option0, 0L);
      TimeStampedValue<Object> timeStampedValue2 = timeStampedValue1.copy$default$1();
      // Undeclared exception!
      try { 
        timeStampedValue2.productIterator();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Tuple2<Object, Object> tuple2_0 = (Tuple2<Object, Object>) mock(Tuple2.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(tuple2_0).toString();
      TimeStampedValue<Tuple2<Object, Object>> timeStampedValue0 = new TimeStampedValue<Tuple2<Object, Object>>(tuple2_0, 1866L);
      TimeStampedValue<Object> timeStampedValue1 = timeStampedValue0.copy$default$1();
      // Undeclared exception!
      try { 
        timeStampedValue1.productElement(2135748764);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Tuple2<Object, Object> tuple2_0 = (Tuple2<Object, Object>) mock(Tuple2.class, new ViolatedAssumptionAnswer());
      doReturn("scala.collection.Parallelizable$class", "", "%", "vg\",_23X!7ITsAi-", "vg\",_23X!7ITsAi-").when(tuple2_0).toString();
      TimeStampedValue<Tuple2<Object, Object>> timeStampedValue0 = new TimeStampedValue<Tuple2<Object, Object>>(tuple2_0, 0L);
      Option<Tuple2<Tuple2<Object, Object>, Object>> option0 = TimeStampedValue.unapply(timeStampedValue0);
      TimeStampedValue<Object> timeStampedValue1 = new TimeStampedValue<Object>(option0, 0L);
      TimeStampedValue<Object> timeStampedValue2 = timeStampedValue1.copy$default$1();
      // Undeclared exception!
      try { 
        timeStampedValue2.productArity();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Tuple2<Object, Object> tuple2_0 = (Tuple2<Object, Object>) mock(Tuple2.class, new ViolatedAssumptionAnswer());
      doReturn("scala.collection.Parallelizable$class", "", "%", "vg\",_23X!7ITsAi-", "vg\",_23X!7ITsAi-").when(tuple2_0).toString();
      TimeStampedValue<Tuple2<Object, Object>> timeStampedValue0 = new TimeStampedValue<Tuple2<Object, Object>>(tuple2_0, 0L);
      Option<Tuple2<Tuple2<Object, Object>, Object>> option0 = TimeStampedValue.unapply(timeStampedValue0);
      TimeStampedValue<Object> timeStampedValue1 = new TimeStampedValue<Object>(option0, 0L);
      TimeStampedValue<Object> timeStampedValue2 = timeStampedValue1.copy$default$1();
      // Undeclared exception!
      try { 
        timeStampedValue2.hashCode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Tuple2<Object, Object> tuple2_0 = (Tuple2<Object, Object>) mock(Tuple2.class, new ViolatedAssumptionAnswer());
      doReturn("Kv}MC`l>0(", "Kv}MC`l>0(", "Kv}MC`l>0(", "Kv}MC`l>0(", "Kv}MC`l>0(").when(tuple2_0).toString();
      TimeStampedValue<Tuple2<Object, Object>> timeStampedValue0 = new TimeStampedValue<Tuple2<Object, Object>>(tuple2_0, 4L);
      Option<Tuple2<Tuple2<Object, Object>, Object>> option0 = TimeStampedValue.unapply(timeStampedValue0);
      TimeStampedValue<Object> timeStampedValue1 = new TimeStampedValue<Object>(option0, 4L);
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue2 = TimeStampedValue.apply(timeStampedValue1, 4L);
      TimeStampedValue<Object> timeStampedValue3 = timeStampedValue1.copy$default$1();
      // Undeclared exception!
      try { 
        timeStampedValue3.equals(timeStampedValue2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Tuple2<Object, Object> tuple2_0 = (Tuple2<Object, Object>) mock(Tuple2.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(tuple2_0).toString();
      TimeStampedValue<Tuple2<Object, Object>> timeStampedValue0 = new TimeStampedValue<Tuple2<Object, Object>>(tuple2_0, 0L);
      Option<Tuple2<Tuple2<Object, Object>, Object>> option0 = TimeStampedValue.unapply(timeStampedValue0);
      TimeStampedValue<Object> timeStampedValue1 = new TimeStampedValue<Object>(option0, 0L);
      TimeStampedValue<Object> timeStampedValue2 = timeStampedValue1.copy$default$1();
      Tuple2<Object, Object> tuple2_1 = (Tuple2<Object, Object>) mock(Tuple2.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        timeStampedValue2.copy(tuple2_1, 0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeStampedValue<Tuple2<Object, Object>> timeStampedValue0 = new TimeStampedValue<Tuple2<Object, Object>>((Tuple2<Object, Object>) null, 0L);
      Option<Tuple2<Tuple2<Object, Object>, Object>> option0 = TimeStampedValue.unapply(timeStampedValue0);
      TimeStampedValue<Object> timeStampedValue1 = new TimeStampedValue<Object>(option0, 1796L);
      TimeStampedValue<Object> timeStampedValue2 = timeStampedValue1.copy$default$1();
      // Undeclared exception!
      try { 
        timeStampedValue2.copy$default$1();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Tuple2<Object, Object> tuple2_0 = (Tuple2<Object, Object>) mock(Tuple2.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(tuple2_0).toString();
      TimeStampedValue<Tuple2<Object, Object>> timeStampedValue0 = new TimeStampedValue<Tuple2<Object, Object>>(tuple2_0, 0L);
      Option<Tuple2<Tuple2<Object, Object>, Object>> option0 = TimeStampedValue.unapply(timeStampedValue0);
      TimeStampedValue<Object> timeStampedValue1 = new TimeStampedValue<Object>(option0, 0L);
      TimeStampedValue<Object> timeStampedValue2 = timeStampedValue1.copy$default$1();
      // Undeclared exception!
      try { 
        timeStampedValue2.canEqual((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeStampedValue<Object> timeStampedValue0 = new TimeStampedValue<Object>((Object) null, 0L);
      Object object0 = timeStampedValue0.productElement(1);
      assertEquals(0L, object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Tuple2<Object, Object> tuple2_0 = (Tuple2<Object, Object>) mock(Tuple2.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(tuple2_0).toString();
      TimeStampedValue<Tuple2<Object, Object>> timeStampedValue0 = new TimeStampedValue<Tuple2<Object, Object>>(tuple2_0, (-1L));
      TimeStampedValue<Object> timeStampedValue1 = new TimeStampedValue<Object>(timeStampedValue0, 0L);
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue2 = TimeStampedValue.apply(timeStampedValue1, (-1294L));
      String string0 = timeStampedValue2.productPrefix();
      assertEquals((-1294L), timeStampedValue2.copy$default$2());
      assertEquals("TimeStampedValue", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeStampedValue<Object> timeStampedValue0 = new TimeStampedValue<Object>((Object) null, 0L);
      long long0 = timeStampedValue0.timestamp();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Tuple2<Object, Object> tuple2_0 = (Tuple2<Object, Object>) mock(Tuple2.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(tuple2_0).toString();
      TimeStampedValue<Tuple2<Object, Object>> timeStampedValue0 = TimeStampedValue.apply(tuple2_0, (-1L));
      Object object0 = timeStampedValue0.productElement(0);
      TimeStampedValue<Object> timeStampedValue1 = new TimeStampedValue<Object>(object0, (-1L));
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue2 = new TimeStampedValue<TimeStampedValue<Object>>(timeStampedValue1, (-1L));
      int int0 = timeStampedValue2.productArity();
      assertEquals((-1L), timeStampedValue0.copy$default$2());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeStampedValue<Object> timeStampedValue0 = new TimeStampedValue<Object>((Object) null, 0L);
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue1 = TimeStampedValue.apply(timeStampedValue0, (-4377L));
      timeStampedValue1.canEqual(timeStampedValue0);
      assertEquals((-4377L), timeStampedValue1.timestamp());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TimeStampedValue<Object> timeStampedValue0 = new TimeStampedValue<Object>((Object) null, 2002L);
      timeStampedValue0.productIterator();
      assertEquals(2, timeStampedValue0.productArity());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue0 = new TimeStampedValue<TimeStampedValue<Object>>((TimeStampedValue<Object>) null, (-1L));
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue1 = new TimeStampedValue<TimeStampedValue<Object>>((TimeStampedValue<Object>) null, 1L);
      boolean boolean0 = timeStampedValue1.equals(timeStampedValue0);
      assertFalse(boolean0);
      assertEquals(1L, timeStampedValue1.timestamp());
      assertFalse(timeStampedValue0.equals((Object)timeStampedValue1));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeStampedValue<Object> timeStampedValue0 = TimeStampedValue.apply((Object) null, 1L);
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue1 = new TimeStampedValue<TimeStampedValue<Object>>(timeStampedValue0, 1L);
      boolean boolean0 = timeStampedValue1.equals(timeStampedValue0);
      assertEquals(1L, timeStampedValue0.copy$default$2());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue0 = new TimeStampedValue<TimeStampedValue<Object>>((TimeStampedValue<Object>) null, 25L);
      boolean boolean0 = timeStampedValue0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue0 = new TimeStampedValue<TimeStampedValue<Object>>((TimeStampedValue<Object>) null, 1L);
      boolean boolean0 = timeStampedValue0.equals(timeStampedValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue0 = new TimeStampedValue<TimeStampedValue<Object>>((TimeStampedValue<Object>) null, 1L);
      // Undeclared exception!
      try { 
        timeStampedValue0.productElement(2);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000002
         //
         verifyException("org.apache.spark.util.TimeStampedValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue0 = new TimeStampedValue<TimeStampedValue<Object>>((TimeStampedValue<Object>) null, 1L);
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue1 = new TimeStampedValue<TimeStampedValue<Object>>((TimeStampedValue<Object>) null, 1L);
      boolean boolean0 = timeStampedValue1.equals(timeStampedValue0);
      assertEquals(1L, timeStampedValue1.timestamp());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue0 = new TimeStampedValue<TimeStampedValue<Object>>((TimeStampedValue<Object>) null, (-1935L));
      Object object0 = timeStampedValue0.copy$default$1();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TimeStampedValue<Tuple2<Object, Object>> timeStampedValue0 = TimeStampedValue.apply((Tuple2<Object, Object>) null, 0L);
      long long0 = timeStampedValue0.copy$default$2();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Option<Tuple2<Object, Object>> option0 = TimeStampedValue.unapply((TimeStampedValue<Object>) null);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TimeStampedValue<Object> timeStampedValue0 = new TimeStampedValue<Object>((Object) null, 5948L);
      timeStampedValue0.hashCode();
      assertEquals(5948L, timeStampedValue0.timestamp());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TimeStampedValue<Object> timeStampedValue0 = TimeStampedValue.apply((Object) null, (-5134L));
      TimeStampedValue<Object> timeStampedValue1 = timeStampedValue0.copy((Object) null, (-5134L));
      assertTrue(timeStampedValue1.equals((Object)timeStampedValue0));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TimeStampedValue<TimeStampedValue<Object>> timeStampedValue0 = new TimeStampedValue<TimeStampedValue<Object>>((TimeStampedValue<Object>) null, (-634L));
      String string0 = timeStampedValue0.toString();
      assertEquals(2, timeStampedValue0.productArity());
      assertEquals("TimeStampedValue(null,-634)", string0);
  }
}
