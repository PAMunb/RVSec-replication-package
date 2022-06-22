/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:59:54 GMT 2022
 */

package org.apache.wicket.util.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.wicket.util.thread.ICode;
import org.apache.wicket.util.time.Duration;
import org.apache.wicket.util.time.Time;
import org.apache.wicket.util.time.TimeOfDay;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.helpers.NOPLogger;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Duration_ESTest extends Duration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Duration duration0 = Duration.ONE_SECOND;
      String string0 = duration0.toString();
      assertEquals("1 second", string0);
      assertEquals(1.1574074074074073E-5, duration0.days(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Duration duration0 = Duration.days(0.006666666666666667);
      Locale locale0 = new Locale("Thu");
      String string0 = duration0.toString(locale0);
      assertEquals(0.006666666666666667, duration0.days(), 0.01);
      assertEquals("9.6 minutes", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Duration duration0 = Duration.seconds(3879);
      String string0 = duration0.toString();
      assertEquals(0.044895833333333336, duration0.days(), 0.01);
      assertEquals("1.1 hours", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Duration duration0 = Duration.ONE_DAY;
      String string0 = duration0.toString();
      assertEquals("1 day", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Duration duration0 = Duration.valueOf((-469L));
      Duration duration1 = duration0.subtract(duration0);
      assertEquals(0.0, duration1.days(), 0.01);
      assertEquals((-0.469), duration0.seconds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Duration duration0 = Duration.days((-2378));
      duration0.sleep();
      assertEquals((-2.054592E8), duration0.seconds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Duration duration0 = Duration.valueOf(0L);
      assertEquals(0.0, duration0.minutes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Duration duration0 = Duration.valueOf((long) 3147);
      assertEquals(3.642361111111111E-5, duration0.days(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Duration duration0 = Duration.NONE;
      Duration duration1 = duration0.NONE.subtract(duration0);
      assertEquals(0L, duration1.getMilliseconds());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Duration duration0 = new Duration(0L);
      Duration duration1 = duration0.MAXIMUM.subtract(duration0);
      assertEquals(9223372036854775807L, duration1.getMilliseconds());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Duration duration0 = new Duration(0L);
      Duration duration1 = Duration.valueOf((-469L));
      Duration duration2 = duration1.subtract(duration0);
      assertTrue(duration2.equals((Object)duration1));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Duration duration0 = Duration.seconds(1.1574074074074073E-5);
      assertEquals(0L, duration0.getMilliseconds());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Duration duration0 = Duration.seconds(1.0);
      assertEquals(0.016666666666666666, duration0.minutes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Duration duration0 = Duration.NONE;
      double double0 = duration0.seconds();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Duration duration0 = Duration.days((-540.0));
      double double0 = duration0.seconds();
      assertEquals((-4.6656E7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Duration duration0 = Duration.minutes(0);
      assertEquals(0L, duration0.getMilliseconds());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Duration duration0 = Duration.minutes(1359);
      assertEquals(1359.0, duration0.minutes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Duration duration0 = Duration.minutes(0.041666666666666664);
      assertEquals(2.8935185185185183E-5, duration0.days(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Duration duration0 = Duration.minutes((-1679.0));
      assertEquals((-1679.0), duration0.minutes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Duration duration0 = new Duration(0L);
      double double0 = duration0.minutes();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Duration duration0 = Duration.ONE_SECOND;
      double double0 = duration0.minutes();
      assertEquals(0.016666666666666666, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Duration duration0 = Duration.milliseconds(0L);
      assertEquals(0.0, duration0.days(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Duration duration0 = Duration.milliseconds((-1621L));
      assertEquals((-1.8761574074074074E-5), duration0.days(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Duration duration0 = Duration.milliseconds(0.04097222222222222);
      assertEquals(0.0, duration0.days(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Duration duration0 = Duration.milliseconds(1.0675199116730066E11);
      assertEquals(29653.33087972222, duration0.hours(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Duration duration0 = Duration.hours(0);
      assertEquals(0L, duration0.getMilliseconds());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Duration duration0 = Duration.hours((-1779));
      assertEquals((-106740.0), duration0.minutes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Duration duration0 = Duration.hours(0.0);
      assertEquals(0.0, duration0.hours(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Duration duration0 = Duration.seconds((-1055));
      double double0 = duration0.hours();
      assertEquals((-0.2930555555555555), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Time time0 = Time.now();
      Duration duration0 = Duration.elapsed(time0);
      assertEquals(0.0, duration0.days(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Duration duration0 = Duration.days(0);
      assertEquals(0.0, duration0.days(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Duration duration0 = Duration.days(247);
      assertEquals(247.0, duration0.days(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Duration duration0 = Duration.seconds(0);
      double double0 = duration0.days();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Duration duration0 = Duration.days(450.5721306735464);
      double double0 = duration0.days();
      assertEquals(450.5721306712963, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ICode iCode0 = mock(ICode.class, new ViolatedAssumptionAnswer());
      NOPLogger nOPLogger0 = NOPLogger.NOP_LOGGER;
      Duration duration0 = Duration.benchmark(iCode0, (Logger) nOPLogger0);
      assertEquals(0.0, duration0.minutes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Duration duration0 = Duration.NONE;
      Duration duration1 = Duration.MAXIMUM;
      Duration duration2 = duration0.add(duration1);
      assertEquals(2.562047788015216E12, duration2.hours(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Duration duration0 = Duration.hours(3314.2447387276);
      Duration duration1 = Duration.days((-540.0));
      Duration duration2 = duration1.add(duration0);
      assertEquals((-3.4724718941E7), duration2.seconds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Duration duration0 = Duration.ONE_HOUR;
      // Undeclared exception!
      try { 
        duration0.wait((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.time.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Duration duration0 = Duration.days((-2383));
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        duration0.wait(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout value is negative
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      // Undeclared exception!
      try { 
        Duration.valueOf((String) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      try { 
        Duration.valueOf("CUr8j,zd]W,1M'");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse duration: CUr8j,zd]W,1M'
         //
         verifyException("org.apache.wicket.util.time.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        Duration.valueOf((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Duration duration0 = Duration.ONE_HOUR;
      // Undeclared exception!
      try { 
        duration0.toString((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        Duration.elapsed((Time) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.time.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Time time0 = Time.millis((-2142L));
      TimeOfDay timeOfDay0 = TimeOfDay.valueOf(time0);
      Time time1 = timeOfDay0.next();
      // Undeclared exception!
      try { 
        Duration.elapsed(time1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // This time is in the future
         //
         verifyException("org.apache.wicket.util.time.Time", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        Duration.benchmark((Runnable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.time.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Duration duration0 = Duration.hours((-1.0));
      // Undeclared exception!
      try { 
        duration0.add((Duration) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.time.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Duration duration0 = Duration.days(2.777777777777778E-4);
      Locale locale0 = Locale.JAPAN;
      String string0 = duration0.toString(locale0);
      assertEquals(2.777777777777778E-4, duration0.days(), 0.01);
      assertEquals("24 seconds", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Duration duration0 = Duration.ONE_MINUTE;
      Locale locale0 = Locale.CANADA;
      String string0 = duration0.toString(locale0);
      assertEquals(6.944444444444445E-4, duration0.days(), 0.01);
      assertEquals("1 minute", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Duration duration0 = Duration.hours(3314.2447387276);
      Locale locale0 = Locale.ITALIAN;
      String string0 = duration0.toString(locale0);
      assertEquals("138,1 days", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Duration duration0 = Duration.days((-2383));
      String string0 = duration0.toString((Locale) null);
      assertEquals("N/A", string0);
      assertEquals((-2383.0), duration0.days(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      // Undeclared exception!
      try { 
        Duration.valueOf("0 day", locale0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Duration duration0 = Duration.minutes(0.0);
      assertEquals(0L, duration0.getMilliseconds());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Duration duration0 = Duration.valueOf((-215L));
      double double0 = duration0.minutes();
      assertEquals((-0.0035833333333333333), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Duration duration0 = Duration.milliseconds((-1.0));
      assertEquals((-1.1574074074074076E-8), duration0.days(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Duration duration0 = Duration.days((-2383));
      double double0 = duration0.days();
      assertEquals((-2383.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Duration duration0 = Duration.seconds((-1.0));
      assertEquals((-1000L), duration0.getMilliseconds());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Duration duration0 = Duration.minutes((-1868));
      assertEquals((-1868.0), duration0.minutes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Duration duration0 = Duration.hours(3147);
      double double0 = duration0.seconds();
      assertEquals(1.13292E7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Duration duration0 = Duration.milliseconds(1000L);
      double double0 = duration0.hours();
      assertEquals(2.777777777777778E-4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      MockThread mockThread0 = new MockThread();
      Duration duration0 = Duration.benchmark((Runnable) mockThread0);
      String string0 = duration0.toString(locale0);
      assertEquals(0.0, duration0.days(), 0.01);
      assertEquals("0 millisecond", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Duration duration0 = Duration.ONE_HOUR;
      duration0.sleep();
      assertEquals(1.0, duration0.hours(), 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Duration duration0 = Duration.ONE_MINUTE;
      duration0.NONE.sleep();
      assertEquals(1.0, duration0.minutes(), 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      try { 
        Duration.valueOf("", locale0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse duration: 
         //
         verifyException("org.apache.wicket.util.time.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      // Undeclared exception!
      try { 
        Duration.valueOf("0 day");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Duration duration0 = Duration.ONE_HOUR;
      // Undeclared exception!
      try { 
        duration0.wait((Object) duration0);
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      NOPLogger nOPLogger0 = NOPLogger.NOP_LOGGER;
      // Undeclared exception!
      try { 
        Duration.benchmark((ICode) null, (Logger) nOPLogger0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.time.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Duration duration0 = Duration.days((double) 0);
      assertEquals(0.0, duration0.days(), 0.01);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Duration duration0 = Duration.ONE_HOUR;
      // Undeclared exception!
      try { 
        duration0.ONE_HOUR.subtract((Duration) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.time.Duration", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Duration duration0 = Duration.NONE;
      Duration duration1 = duration0.add(duration0);
      assertEquals(0.0, duration1.hours(), 0.01);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Time time0 = Time.millis((-2142L));
      Duration duration0 = Duration.elapsed(time0);
      assertEquals(386780.3565172222, duration0.hours(), 0.01);
  }
}