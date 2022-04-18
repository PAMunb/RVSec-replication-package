/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 18 12:27:47 GMT 2022
 */

package org.apache.manifoldcf.core.jdbcpool;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.manifoldcf.core.jdbcpool.ConnectionPool;
import org.apache.manifoldcf.core.jdbcpool.ConnectionPoolManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConnectionPoolManager_ESTest extends ConnectionPoolManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConnectionPoolManager connectionPoolManager0 = new ConnectionPoolManager(0, true);
      assertNotNull(connectionPoolManager0);
      
      connectionPoolManager0.flush();
      connectionPoolManager0.cleanupExpiredConnections(4342L);
      connectionPoolManager0.shutdown();
      connectionPoolManager0.shutdown();
      connectionPoolManager0.shutdown();
      connectionPoolManager0.flush();
      connectionPoolManager0.flush();
      ConnectionPoolManager.ConnectionCloserThread connectionPoolManager_ConnectionCloserThread0 = connectionPoolManager0.new ConnectionCloserThread();
      assertNotNull(connectionPoolManager_ConnectionCloserThread0);
      
      Thread[] threadArray0 = new Thread[0];
      int int0 = MockThread.enumerate(threadArray0);
      assertEquals(0, int0);
      assertEquals(0, threadArray0.length);
      
      connectionPoolManager0.cleanupExpiredConnections(404L);
      connectionPoolManager_ConnectionCloserThread0.run();
      assertFalse(connectionPoolManager_ConnectionCloserThread0.isInterrupted());
      assertEquals(0, connectionPoolManager_ConnectionCloserThread0.countStackFrames());
      assertTrue(connectionPoolManager_ConnectionCloserThread0.isDaemon());
      
      String string0 = "@(#)$Id$";
      connectionPoolManager0.shutdown();
      try { 
        connectionPoolManager0.addAlias("Em0~", "org.apache.manifoldcf.core.jdbcpool.ConnectionPoolManager$ConnectionCloserThread", "@(#)$Id$", "org.apache.manifoldcf.core.jdbcpool.ConnectionPoolManager$ConnectionCloserThread", "Em0~", 3675, 0);
        fail("Expecting exception: InstantiationException");
      
      } catch(InstantiationException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConnectionPoolManager connectionPoolManager0 = new ConnectionPoolManager(0, true);
      assertNotNull(connectionPoolManager0);
      
      AtomicBoolean atomicBoolean0 = new AtomicBoolean();
      assertFalse(atomicBoolean0.get());
      assertEquals("false", atomicBoolean0.toString());
      assertNotNull(atomicBoolean0);
      
      boolean boolean0 = atomicBoolean0.compareAndSet(true, true);
      assertFalse(atomicBoolean0.get());
      assertEquals("false", atomicBoolean0.toString());
      assertFalse(boolean0);
      
      connectionPoolManager0.shuttingDown = atomicBoolean0;
      assertFalse(atomicBoolean0.get());
      assertEquals("false", atomicBoolean0.toString());
      assertEquals("false", connectionPoolManager0.shuttingDown.toString());
      assertFalse(connectionPoolManager0.shuttingDown.get());
      
      connectionPoolManager0.flush();
      atomicBoolean0.lazySet(true);
      assertTrue(atomicBoolean0.get());
      assertEquals("true", atomicBoolean0.toString());
      
      ConnectionPool connectionPool0 = connectionPoolManager0.getPool((String) null);
      assertNull(connectionPool0);
      
      ConnectionPoolManager.ConnectionCloserThread connectionPoolManager_ConnectionCloserThread0 = connectionPoolManager0.connectionCloserThread;
      assertFalse(connectionPoolManager_ConnectionCloserThread0.isInterrupted());
      assertTrue(connectionPoolManager_ConnectionCloserThread0.isDaemon());
      assertNotNull(connectionPoolManager_ConnectionCloserThread0);
      
      StackTraceElement[] stackTraceElementArray0 = connectionPoolManager_ConnectionCloserThread0.getStackTrace();
      assertFalse(connectionPoolManager_ConnectionCloserThread0.isInterrupted());
      assertTrue(connectionPoolManager_ConnectionCloserThread0.isDaemon());
      assertEquals(3, stackTraceElementArray0.length);
      assertNotNull(stackTraceElementArray0);
      
      ClassLoader classLoader0 = connectionPoolManager_ConnectionCloserThread0.getContextClassLoader();
      assertFalse(connectionPoolManager_ConnectionCloserThread0.isInterrupted());
      assertTrue(connectionPoolManager_ConnectionCloserThread0.isDaemon());
      assertNotNull(classLoader0);
      
      MockThread.dumpStack();
      connectionPoolManager_ConnectionCloserThread0.run();
      assertFalse(connectionPoolManager_ConnectionCloserThread0.isInterrupted());
      assertTrue(connectionPoolManager_ConnectionCloserThread0.isDaemon());
      
      // Undeclared exception!
      try { 
        connectionPoolManager0.addAlias("@(#)$Id$", (String) null, "@(#)$Id$", "@(#)$Id$", "Me4&OIDgmSb6-6", 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = 0;
      ConnectionPoolManager connectionPoolManager0 = new ConnectionPoolManager(0, false);
      assertNotNull(connectionPoolManager0);
      
      String string0 = "oZ1`:d";
      String string1 = "1N_\\5CObE\\Pw>";
      String string2 = "0Jf1TyA#U@W5O'j";
      connectionPoolManager0.cleanupExpiredConnections(0L);
      try { 
        connectionPoolManager0.addAlias("0Jf1TyA#U@W5O'j", "{F>mb\"", "oZ1`:d", "1N_\u0005CObEPw>", "yH", 0, 0);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ConnectionPoolManager connectionPoolManager0 = null;
      try {
        connectionPoolManager0 = new ConnectionPoolManager((-2405), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -2405
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = 1;
      ConnectionPoolManager connectionPoolManager0 = new ConnectionPoolManager(1, false);
      assertNotNull(connectionPoolManager0);
      
      connectionPoolManager0.shutdown();
      String string0 = ", positionInTable=";
      try { 
        connectionPoolManager0.addAlias("5tO", "5tO", "5tO", "5tO", ", positionInTable=", 1, 1339L);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int int0 = 806;
      boolean boolean0 = false;
      ConnectionPoolManager connectionPoolManager0 = new ConnectionPoolManager(806, false);
      assertNotNull(connectionPoolManager0);
      
      connectionPoolManager0.shutdown();
      connectionPoolManager0.cleanupExpiredConnections(806);
      String string0 = "It!";
      String string1 = "U./x=.my";
      String string2 = null;
      connectionPoolManager0.cleanupExpiredConnections((-140));
      try { 
        connectionPoolManager0.addAlias("U./x=.my", "", (String) null, " 3", " 3", (-140), (-140));
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ConnectionPoolManager connectionPoolManager0 = new ConnectionPoolManager(594, false);
      assertNotNull(connectionPoolManager0);
      
      connectionPoolManager0.flush();
      AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
      assertEquals("false", atomicBoolean0.toString());
      assertFalse(atomicBoolean0.get());
      assertNotNull(atomicBoolean0);
      
      connectionPoolManager0.shuttingDown = atomicBoolean0;
      assertEquals("false", atomicBoolean0.toString());
      assertFalse(atomicBoolean0.get());
      assertEquals("false", connectionPoolManager0.shuttingDown.toString());
      assertFalse(connectionPoolManager0.shuttingDown.get());
      
      AtomicBoolean atomicBoolean1 = connectionPoolManager0.shuttingDown;
      assertEquals("false", atomicBoolean1.toString());
      assertFalse(atomicBoolean1.get());
      assertSame(atomicBoolean1, atomicBoolean0);
      assertNotNull(atomicBoolean1);
      
      connectionPoolManager0.shuttingDown = atomicBoolean1;
      assertEquals("false", atomicBoolean0.toString());
      assertFalse(atomicBoolean0.get());
      assertEquals("false", connectionPoolManager0.shuttingDown.toString());
      assertFalse(connectionPoolManager0.shuttingDown.get());
      
      connectionPoolManager0.shutdown();
      ConnectionPoolManager.ConnectionCloserThread connectionPoolManager_ConnectionCloserThread0 = connectionPoolManager0.new ConnectionCloserThread();
      assertNotNull(connectionPoolManager_ConnectionCloserThread0);
      
      Thread[] threadArray0 = new Thread[3];
      MockThread.reset();
      threadArray0[0] = (Thread) connectionPoolManager_ConnectionCloserThread0;
      threadArray0[1] = (Thread) connectionPoolManager_ConnectionCloserThread0;
      threadArray0[2] = (Thread) connectionPoolManager_ConnectionCloserThread0;
      int int0 = MockThread.enumerate(threadArray0);
      assertEquals(2, int0);
      assertEquals(3, threadArray0.length);
      
      connectionPoolManager_ConnectionCloserThread0.run();
      assertTrue(connectionPoolManager_ConnectionCloserThread0.isDaemon());
      assertFalse(connectionPoolManager_ConnectionCloserThread0.isInterrupted());
      assertEquals(0, connectionPoolManager_ConnectionCloserThread0.countStackFrames());
      
      connectionPoolManager0.flush();
      ClassLoader classLoader0 = connectionPoolManager_ConnectionCloserThread0.getContextClassLoader();
      assertTrue(connectionPoolManager_ConnectionCloserThread0.isDaemon());
      assertFalse(connectionPoolManager_ConnectionCloserThread0.isInterrupted());
      assertEquals(0, connectionPoolManager_ConnectionCloserThread0.countStackFrames());
      assertNotNull(classLoader0);
      
      connectionPoolManager0.shutdown();
      connectionPoolManager0.flush();
      connectionPoolManager0.flush();
      ConnectionPool connectionPool0 = connectionPoolManager0.getPool("IklrAxX)");
      assertNull(connectionPool0);
      
      connectionPoolManager_ConnectionCloserThread0.run();
      assertTrue(connectionPoolManager_ConnectionCloserThread0.isDaemon());
      assertFalse(connectionPoolManager_ConnectionCloserThread0.isInterrupted());
      assertEquals(0, connectionPoolManager_ConnectionCloserThread0.countStackFrames());
      
      connectionPoolManager0.flush();
      boolean boolean0 = atomicBoolean1.weakCompareAndSet(false, true);
      assertEquals("true", atomicBoolean1.toString());
      assertTrue(atomicBoolean1.get());
      assertSame(atomicBoolean1, atomicBoolean0);
      assertFalse(boolean0);
      
      connectionPoolManager0.cleanupExpiredConnections(5000L);
      connectionPoolManager_ConnectionCloserThread0.run();
      assertTrue(connectionPoolManager_ConnectionCloserThread0.isDaemon());
      assertFalse(connectionPoolManager_ConnectionCloserThread0.isInterrupted());
      assertEquals(0, connectionPoolManager_ConnectionCloserThread0.countStackFrames());
      
      connectionPoolManager0.flush();
      connectionPoolManager0.shutdown();
      connectionPoolManager0.shutdown();
      try { 
        connectionPoolManager0.addAlias("IklrAxX)", "IklrAxX)", "@(#)$Id$", "", "@(#)$Id$", (-2), 969L);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ConnectionPoolManager connectionPoolManager0 = new ConnectionPoolManager(0, false);
      connectionPoolManager0.shutdown();
      connectionPoolManager0.flush();
      ConnectionPoolManager.ConnectionCloserThread connectionPoolManager_ConnectionCloserThread0 = connectionPoolManager0.connectionCloserThread;
      connectionPoolManager_ConnectionCloserThread0.run();
      connectionPoolManager_ConnectionCloserThread0.run();
      assertEquals(0, connectionPoolManager_ConnectionCloserThread0.countStackFrames());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ConnectionPoolManager connectionPoolManager0 = new ConnectionPoolManager(2573, false);
      // Undeclared exception!
      try { 
        connectionPoolManager0.addAlias((String) null, (String) null, "Connection pool reaper", "Connection pool reaper", "qk6M;OZh\u0004^e\"", 0, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
