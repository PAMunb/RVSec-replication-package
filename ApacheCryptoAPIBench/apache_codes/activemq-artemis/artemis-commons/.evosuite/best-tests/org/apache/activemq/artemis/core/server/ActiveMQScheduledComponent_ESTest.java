/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:03:45 GMT 2022
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ActiveMQScheduledComponent_ESTest extends ActiveMQScheduledComponent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.start();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      networkHealthCheck0.setTimeUnit(timeUnit0);
      assertTrue(networkHealthCheck0.isStarted());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("ping6 -c 1 %2$s", 0L, (-1));
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      ActiveMQScheduledComponent activeMQScheduledComponent0 = networkHealthCheck0.setTimeUnit(timeUnit0);
      assertEquals((-1L), activeMQScheduledComponent0.getInitialDelay());
      assertEquals(0L, activeMQScheduledComponent0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      ActiveMQScheduledComponent activeMQScheduledComponent0 = networkHealthCheck0.setInitialDelayAndPeriod((-1935L), (-1935L), timeUnit0);
      activeMQScheduledComponent0.setTimeUnit(timeUnit0);
      assertEquals((-1935L), networkHealthCheck0.getPeriod());
      assertEquals((-1935L), networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
      
      networkHealthCheck0.setInitialDelay(0L);
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      networkHealthCheck0.setTimeUnit(timeUnit0);
      assertEquals(1000L, networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.setInitialDelay(3182L);
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      networkHealthCheck0.setTimeUnit(timeUnit0);
      assertEquals(3182L, networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.start();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      networkHealthCheck0.setPeriod(2138L, timeUnit0);
      assertEquals(2138L, networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("", 530L, 0);
      TimeUnit timeUnit0 = networkHealthCheck0.getTimeUnit();
      ActiveMQScheduledComponent activeMQScheduledComponent0 = networkHealthCheck0.setInitialDelayAndPeriod(0L, 0L, timeUnit0);
      activeMQScheduledComponent0.setPeriod((-108L), timeUnit0);
      assertEquals((-108L), activeMQScheduledComponent0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.setInitialDelay(1000L);
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      networkHealthCheck0.setPeriod(2138L, timeUnit0);
      assertEquals(2138L, networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      InetAddress inetAddress0 = MockInetAddress.getByName("ping -c 1 -t %d %s");
      NetworkHealthCheck networkHealthCheck1 = networkHealthCheck0.addAddress(inetAddress0);
      networkHealthCheck1.addComponent(networkHealthCheck0);
      networkHealthCheck0.setPeriod(763L);
      assertEquals(763L, networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      assertEquals(1000L, networkHealthCheck0.getPeriod());
      
      networkHealthCheck0.setPeriod(0L);
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      networkHealthCheck0.setInitialDelayAndPeriod(0L, 721L, timeUnit0);
      networkHealthCheck0.setPeriod(721L);
      assertEquals(721L, networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      networkHealthCheck0.setInitialDelayAndPeriod(2304L, (-2288L), timeUnit0);
      networkHealthCheck0.setPeriod(2304L);
      assertEquals(2304L, networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      assertEquals(1000L, networkHealthCheck0.getPeriod());
      
      networkHealthCheck0.setPeriod((-1L));
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.start();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      networkHealthCheck0.setInitialDelayAndPeriod(175L, 175L, timeUnit0);
      assertEquals(175L, networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.start();
      networkHealthCheck0.setInitialDelayAndPeriod((-2L), 1000L);
      assertEquals((-2L), networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("", 530L, 0);
      networkHealthCheck0.setInitialDelayAndPeriod(0L, (-433L));
      assertEquals((-433L), networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.setInitialDelayAndPeriod(3567L, 3567L);
      assertEquals(3567L, networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.start();
      networkHealthCheck0.setInitialDelay(439L);
      assertTrue(networkHealthCheck0.isStarted());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("", 1947L, 10);
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      ActiveMQScheduledComponent activeMQScheduledComponent0 = networkHealthCheck0.setPeriod(0L, timeUnit0);
      NetworkHealthCheck networkHealthCheck1 = (NetworkHealthCheck)activeMQScheduledComponent0.setInitialDelay(0L);
      assertTrue(networkHealthCheck1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.setPeriod((-779L));
      networkHealthCheck0.setInitialDelay(1248L);
      assertEquals(1248L, networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      ActiveMQScheduledComponent activeMQScheduledComponent0 = networkHealthCheck0.setInitialDelay((-1));
      assertEquals(1000L, activeMQScheduledComponent0.getPeriod());
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.isStarted();
      assertEquals(1000L, networkHealthCheck0.getPeriod());
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.getThreadFactory();
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
      assertEquals(1000L, networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("ping6 -c 1 %2$s", 0L, (-3));
      long long0 = networkHealthCheck0.getPeriod();
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("org.jboss.logging.AbstractLoggerProvider", (-398L), 1572);
      long long0 = networkHealthCheck0.getPeriod();
      assertEquals((-398L), long0);
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("", 1947L, 10);
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
      
      networkHealthCheck0.setInitialDelay(0L);
      networkHealthCheck0.getInitialDelay();
      assertEquals(1947L, networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("", 4470L, 966);
      networkHealthCheck0.setInitialDelay(966);
      long long0 = networkHealthCheck0.getInitialDelay();
      assertEquals(966L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.start();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
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

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.start();
      // Undeclared exception!
      try { 
        networkHealthCheck0.setPeriod(0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ScheduledThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.start();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
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
  public void test30()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.start();
      // Undeclared exception!
      try { 
        networkHealthCheck0.setInitialDelayAndPeriod(0L, 0L);
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
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      InetAddress inetAddress0 = MockInetAddress.getByName("ping -c 1 -t %d %s");
      NetworkHealthCheck networkHealthCheck1 = networkHealthCheck0.addAddress(inetAddress0);
      networkHealthCheck1.addComponent(networkHealthCheck0);
      boolean boolean0 = networkHealthCheck0.isStarted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck(":9Pp}", 0L, 12);
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      networkHealthCheck0.setInitialDelayAndPeriod(1L, 439L, timeUnit0);
      networkHealthCheck0.start();
      networkHealthCheck0.stop();
      assertEquals(439L, networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.stop();
      assertEquals(1000L, networkHealthCheck0.getPeriod());
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      NetworkHealthCheck networkHealthCheck1 = networkHealthCheck0.addComponent(networkHealthCheck0);
      URL uRL0 = MockURL.getHttpExample();
      NetworkHealthCheck networkHealthCheck2 = networkHealthCheck1.addURL(uRL0);
      networkHealthCheck0.delay();
      networkHealthCheck1.delay();
      networkHealthCheck2.delay();
      networkHealthCheck0.delay();
      networkHealthCheck1.delay();
      networkHealthCheck1.delay();
      networkHealthCheck2.delay();
      networkHealthCheck1.delay();
      networkHealthCheck0.delay();
      networkHealthCheck1.delay();
      networkHealthCheck1.delay();
      assertTrue(networkHealthCheck1.isStarted());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
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
  public void test36()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      ActiveMQScheduledComponent activeMQScheduledComponent0 = networkHealthCheck0.setInitialDelayAndPeriod((-4443L), (-4443L), timeUnit0);
      activeMQScheduledComponent0.start();
      networkHealthCheck0.start();
      assertEquals((-4443L), networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      InetAddress inetAddress0 = MockInetAddress.getByName("ping -c 1 -t %d %s");
      NetworkHealthCheck networkHealthCheck1 = networkHealthCheck0.addAddress(inetAddress0);
      NetworkHealthCheck networkHealthCheck2 = networkHealthCheck1.addComponent(networkHealthCheck0);
      networkHealthCheck2.start();
      assertTrue(networkHealthCheck1.isStarted());
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck("", 1947L, 10);
      long long0 = networkHealthCheck0.getInitialDelay();
      assertEquals((-1L), long0);
      assertEquals(1947L, networkHealthCheck0.getPeriod());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      networkHealthCheck0.setPeriod(0L);
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
  public void test40()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      NetworkHealthCheck networkHealthCheck1 = (NetworkHealthCheck)networkHealthCheck0.setInitialDelayAndPeriod(0L, 0L);
      assertEquals("ping -c 1 -t %d %s", networkHealthCheck1.getIpv4Command());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NetworkHealthCheck networkHealthCheck0 = new NetworkHealthCheck();
      long long0 = networkHealthCheck0.getPeriod();
      assertEquals(1000L, long0);
      assertEquals((-1L), networkHealthCheck0.getInitialDelay());
  }
}
