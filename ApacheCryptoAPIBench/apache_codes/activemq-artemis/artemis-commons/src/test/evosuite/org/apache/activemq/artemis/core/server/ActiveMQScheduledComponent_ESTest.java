/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 13:21:30 GMT 2022
 */

package org.apache.activemq.artemis.core.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.activemq.artemis.core.server.ActiveMQScheduledComponent;
import org.apache.activemq.artemis.core.server.NetworkHealthCheck;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ActiveMQScheduledComponent_ESTest extends ActiveMQScheduledComponent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.start();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      networkHealthCheck0.setTimeUnit(timeUnit0);
      assertTrue(networkHealthCheck0.isStarted());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      ActiveMQScheduledComponent activeMQScheduledComponent0 = networkHealthCheck0.setTimeUnit(timeUnit0);
      assertEquals((-1L), activeMQScheduledComponent0.getInitialDelay());
      assertEquals(1000L, activeMQScheduledComponent0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      ActiveMQScheduledComponent activeMQScheduledComponent0 = networkHealthCheck0.setInitialDelayAndPeriod(0L, (-1500L));
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      activeMQScheduledComponent0.setTimeUnit(timeUnit0);
      assertEquals((-1500L), networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("G", 1359L, 1);
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
      
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      networkHealthCheck0.setInitialDelayAndPeriod(1359L, 0L, timeUnit0);
      networkHealthCheck0.setTimeUnit(timeUnit0);
      assertEquals(1359L, networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      NetworkHealthCheck networkHealthCheck1 = networkHealthCheck0.addComponent(networkHealthCheck0);
      networkHealthCheck1.parseAddressList("ping -c 1 -t %d %s");
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      networkHealthCheck0.setPeriod(2130L, timeUnit0);
      assertTrue(networkHealthCheck0.isStarted());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.setInitialDelay(0L);
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      NetworkHealthCheck networkHealthCheck1 = (NetworkHealthCheck)networkHealthCheck0.setPeriod(0L, timeUnit0);
      assertTrue(networkHealthCheck1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.setInitialDelay(2105L);
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      networkHealthCheck0.setPeriod(2105L, timeUnit0);
      assertEquals(2105L, networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("", 0L, 2701);
      NetworkHealthCheck networkHealthCheck1 = networkHealthCheck0.setPeriod(1400L);
      networkHealthCheck1.parseAddressList("\"y>x");
      NetworkHealthCheck networkHealthCheck2 = networkHealthCheck0.addComponent(networkHealthCheck1);
      networkHealthCheck2.setPeriod(1L);
      assertEquals(1L, networkHealthCheck1.getPeriod());
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("", 0L, 30);
      assertEquals(0L, networkHealthCheck0.getPeriod());
      
      ActiveMQScheduledComponent activeMQScheduledComponent0 = networkHealthCheck0.setPeriod(0L);
      assertEquals((-1L), activeMQScheduledComponent0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      networkHealthCheck0.setInitialDelayAndPeriod(0L, 0L, timeUnit0);
      networkHealthCheck0.setPeriod((-481L));
      assertEquals((-481L), networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.setInitialDelay(522L);
      networkHealthCheck0.setPeriod((-5103L));
      assertEquals(522L, networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      URL uRL0 = MockURL.getHttpExample();
      networkHealthCheck0.addComponent(networkHealthCheck0);
      networkHealthCheck0.addURL(uRL0);
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      networkHealthCheck0.setInitialDelayAndPeriod(0L, 1990L, timeUnit0);
      assertEquals(1990L, networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      ActiveMQScheduledComponent activeMQScheduledComponent0 = networkHealthCheck0.setInitialDelayAndPeriod(0L, 0L);
      assertSame(activeMQScheduledComponent0, networkHealthCheck0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.setInitialDelayAndPeriod(1L, 1076L);
      assertEquals(1076L, networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      NetworkHealthCheck networkHealthCheck1 = networkHealthCheck0.parseAddressList("system property");
      NetworkHealthCheck networkHealthCheck2 = networkHealthCheck0.addComponent(networkHealthCheck1);
      networkHealthCheck2.setInitialDelay((-1363L));
      assertEquals((-1363L), networkHealthCheck2.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.setInitialDelayAndPeriod((-3040L), (-3040L));
      networkHealthCheck0.setInitialDelay((-3040L));
      assertEquals((-3040L), networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.setTimeUnit((TimeUnit) null);
      networkHealthCheck0.getTimeUnit();
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
      assertEquals(1000L, networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.getThreadFactory();
      assertEquals(1000L, networkHealthCheck0.getPeriod());
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      assertEquals(1000L, networkHealthCheck0.getPeriod());
      
      NetworkHealthCheck networkHealthCheck1 = networkHealthCheck0.setPeriod(0L);
      networkHealthCheck1.getPeriod();
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      networkHealthCheck0.setInitialDelayAndPeriod((-1376L), (-1376L), timeUnit0);
      long long0 = networkHealthCheck0.getPeriod();
      assertEquals((-1376L), networkHealthCheck0.getInitialDelay());
      assertEquals((-1376L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck(" (", 0L, 829);
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
      
      networkHealthCheck0.setInitialDelay(0L);
      networkHealthCheck0.getInitialDelay();
      assertEquals(0L, networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.setInitialDelay(522L);
      long long0 = networkHealthCheck0.getInitialDelay();
      assertEquals(522L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      NetworkHealthCheck networkHealthCheck1 = networkHealthCheck0.setTimeUnit((TimeUnit) null);
      // Undeclared exception!
      try { 
        networkHealthCheck1.start();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.core.server.ActiveMQScheduledComponent", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.start();
      // Undeclared exception!
      try { 
        networkHealthCheck0.setPeriod(23L, (TimeUnit) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.core.server.ActiveMQScheduledComponent", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("h+%D9{|8P{XQ8", (-1L), (-4043));
      networkHealthCheck0.parseAddressList("ping -c 1 -t %d %s");
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      ActiveMQScheduledComponent activeMQScheduledComponent0 = networkHealthCheck0.setInitialDelayAndPeriod(0L, 1L, timeUnit0);
      networkHealthCheck0.addComponent(networkHealthCheck0);
      // Undeclared exception!
      try { 
        activeMQScheduledComponent0.setPeriod(0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ScheduledThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.start();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      // Undeclared exception!
      try { 
        networkHealthCheck0.setInitialDelayAndPeriod(0L, 0L, timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ScheduledThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("h+%D9{|8P{XQ8", (-1L), (-4041));
      networkHealthCheck0.parseAddressList("ping -c 1 -t %d %s");
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      networkHealthCheck0.setInitialDelayAndPeriod(0L, 4L, timeUnit0);
      networkHealthCheck0.addComponent(networkHealthCheck0);
      // Undeclared exception!
      try { 
        networkHealthCheck0.setInitialDelayAndPeriod((long) (-4041), 0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ScheduledThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.isStarted();
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
      assertEquals(1000L, networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.addComponent(networkHealthCheck0);
      InetAddress inetAddress0 = MockInetAddress.getByName("'mB(uEYqF*Kl8D2");
      NetworkHealthCheck networkHealthCheck1 = networkHealthCheck0.addAddress(inetAddress0);
      boolean boolean0 = networkHealthCheck1.isStarted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.parseAddressList("ping -c 1 -t %d %s");
      NetworkHealthCheck networkHealthCheck1 = networkHealthCheck0.addComponent(networkHealthCheck0);
      assertTrue(networkHealthCheck1.isStarted());
      
      networkHealthCheck1.stop();
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("G", 1359L, 1);
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      networkHealthCheck0.setInitialDelayAndPeriod(1359L, 0L, timeUnit0);
      // Undeclared exception!
      try { 
        networkHealthCheck0.start();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ScheduledThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("h+%D9{|8P{XQ8", 732L, (-4041));
      networkHealthCheck0.stop();
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
      assertEquals(732L, networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("h+%D9{|8P{XQ8", 732L, (-4041));
      NetworkHealthCheck networkHealthCheck1 = networkHealthCheck0.parseAddressList("ping -c 1 -t %d %s");
      assertFalse(networkHealthCheck1.isStarted());
      
      NetworkHealthCheck networkHealthCheck2 = networkHealthCheck0.addComponent(networkHealthCheck0);
      networkHealthCheck2.delay();
      networkHealthCheck0.delay();
      networkHealthCheck2.delay();
      networkHealthCheck2.delay();
      networkHealthCheck0.delay();
      networkHealthCheck0.delay();
      networkHealthCheck1.delay();
      networkHealthCheck2.delay();
      networkHealthCheck1.delay();
      networkHealthCheck1.delay();
      networkHealthCheck1.delay();
      assertTrue(networkHealthCheck1.isStarted());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("h+%D9{|8P{XQ8", (-1L), (-4043));
      // Undeclared exception!
      try { 
        networkHealthCheck0.delay();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.core.server.ActiveMQScheduledComponent", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("h+%D9{|8P{XQ8", (-1L), (-4043));
      networkHealthCheck0.parseAddressList("ping -c 1 -t %d %s");
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      networkHealthCheck0.setInitialDelayAndPeriod(0L, 1L, timeUnit0);
      networkHealthCheck0.addComponent(networkHealthCheck0);
      networkHealthCheck0.setInitialDelayAndPeriod((long) (-4043), 3646L);
      assertEquals((-4043L), networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("h+%D9{|8P{XQ8", (-1L), (-4043));
      NetworkHealthCheck networkHealthCheck1 = networkHealthCheck0.parseAddressList("ping -c 1 -t %d %s");
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
      
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      networkHealthCheck0.setInitialDelayAndPeriod(0L, 1L, timeUnit0);
      networkHealthCheck0.addComponent(networkHealthCheck1);
      networkHealthCheck1.start();
      assertTrue(networkHealthCheck0.isStarted());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("h+%D9{|8P{XQ8", (-1L), (-4043));
      networkHealthCheck0.parseAddressList("ping -c 1 -t %d %s");
      networkHealthCheck0.addComponent(networkHealthCheck0);
      networkHealthCheck0.start();
      assertFalse(networkHealthCheck0.isStarted());
      assertEquals((-1L), networkHealthCheck0.getPeriod());
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      long long0 = networkHealthCheck0.getInitialDelay();
      assertEquals((-1L), long0);
      assertEquals(1000L, networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      long long0 = networkHealthCheck0.getPeriod();
      assertEquals(1000L, long0);
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      TimeUnit timeUnit0 = networkHealthCheck0.getTimeUnit();
      networkHealthCheck0.setPeriod((long) (-4435), timeUnit0);
      assertEquals((-4435L), networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("2_k\f>\"-7xC#6J'5%5", 23L, (-11));
      networkHealthCheck0.start();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      // Undeclared exception!
      try { 
        networkHealthCheck0.setPeriod(0L, timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ScheduledThreadPoolExecutor", e);
      }
  }
}
