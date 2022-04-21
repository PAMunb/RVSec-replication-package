/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 20 11:24:39 GMT 2022
 */

package org.apache.activemq.artemis.logs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.SQLDataException;
import java.util.logging.Level;
import org.apache.activemq.artemis.logs.AssertionLoggerHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.jboss.logmanager.ExtLogRecord;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AssertionLoggerHandler_ESTest extends AssertionLoggerHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[5];
      boolean boolean0 = AssertionLoggerHandler.findText(0L, stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Level level0 = Level.WARNING;
      AssertionLoggerHandler assertionLoggerHandler0 = new AssertionLoggerHandler();
      AssertionLoggerHandler.startCapture();
      ExtLogRecord extLogRecord0 = new ExtLogRecord(level0, "DE]wI#:", "DE]wI#:");
      assertionLoggerHandler0.doPublish(extLogRecord0);
      // Undeclared exception!
      try { 
        AssertionLoggerHandler.findText(0L, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AssertionLoggerHandler assertionLoggerHandler0 = new AssertionLoggerHandler();
      AssertionLoggerHandler.startCapture();
      // Undeclared exception!
      try { 
        assertionLoggerHandler0.doPublish((ExtLogRecord) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.logs.AssertionLoggerHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AssertionLoggerHandler.clear();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Level level0 = Level.WARNING;
      AssertionLoggerHandler assertionLoggerHandler0 = new AssertionLoggerHandler();
      AssertionLoggerHandler.startCapture();
      ExtLogRecord extLogRecord0 = new ExtLogRecord(level0, "m", "m");
      SQLDataException sQLDataException0 = new SQLDataException();
      MockException mockException0 = new MockException("Z", sQLDataException0);
      extLogRecord0.setThrown(mockException0);
      assertionLoggerHandler0.doPublish(extLogRecord0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Z";
      // Undeclared exception!
      try { 
        AssertionLoggerHandler.findText(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Level level0 = Level.WARNING;
      AssertionLoggerHandler assertionLoggerHandler0 = new AssertionLoggerHandler();
      AssertionLoggerHandler.startCapture();
      ExtLogRecord extLogRecord0 = new ExtLogRecord(level0, "m", "m");
      SQLDataException sQLDataException0 = new SQLDataException();
      MockException mockException0 = new MockException("Z", sQLDataException0);
      extLogRecord0.setThrown(mockException0);
      assertionLoggerHandler0.doPublish(extLogRecord0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "|4bMU3{KS1M;,q<";
      boolean boolean0 = AssertionLoggerHandler.findText(stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Level level0 = Level.WARNING;
      AssertionLoggerHandler assertionLoggerHandler0 = new AssertionLoggerHandler();
      AssertionLoggerHandler.startCapture();
      ExtLogRecord extLogRecord0 = new ExtLogRecord(level0, "", "");
      SQLDataException sQLDataException0 = new SQLDataException();
      extLogRecord0.setThrown(sQLDataException0);
      assertionLoggerHandler0.doPublish(extLogRecord0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "|4bMU3{KS1M;,q<";
      boolean boolean0 = AssertionLoggerHandler.findText(stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AssertionLoggerHandler assertionLoggerHandler0 = new AssertionLoggerHandler();
      Level level0 = Level.INFO;
      ExtLogRecord extLogRecord0 = new ExtLogRecord(level0, "", "H)Dgu4eWe=I&");
      AssertionLoggerHandler.startCapture();
      assertionLoggerHandler0.doPublish(extLogRecord0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "H)Dgu4eWe=I&";
      boolean boolean0 = AssertionLoggerHandler.findText(stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Level level0 = Level.SEVERE;
      AssertionLoggerHandler.startCapture();
      AssertionLoggerHandler assertionLoggerHandler0 = new AssertionLoggerHandler();
      ExtLogRecord extLogRecord0 = new ExtLogRecord(level0, "org.jboss.logmakager.filters.LevelFilter", "org.jboss.logmakager.filters.LevelFilter");
      assertionLoggerHandler0.doPublish(extLogRecord0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.jboss.logmakager.filters.LevelFilter";
      boolean boolean0 = AssertionLoggerHandler.findText(stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Level level0 = Level.SEVERE;
      AssertionLoggerHandler.startCapture();
      AssertionLoggerHandler assertionLoggerHandler0 = new AssertionLoggerHandler();
      ExtLogRecord extLogRecord0 = new ExtLogRecord(level0, "org.jboss.logmakager.filters.LevelFilter", "org.jboss.logmakager.filters.LevelFilter");
      assertionLoggerHandler0.doPublish(extLogRecord0);
      String[] stringArray0 = new String[0];
      boolean boolean0 = AssertionLoggerHandler.findText((-1L), stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = AssertionLoggerHandler.findText((-871L), (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      AssertionLoggerHandler.findText(138L, (String[]) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Level level0 = Level.SEVERE;
      AssertionLoggerHandler.startCapture();
      AssertionLoggerHandler assertionLoggerHandler0 = new AssertionLoggerHandler();
      ExtLogRecord extLogRecord0 = new ExtLogRecord(level0, "org.jboss.logmakager.filters.LevelFilter", "org.jboss.logmakager.filters.LevelFilter");
      assertionLoggerHandler0.doPublish(extLogRecord0);
      Level level1 = Level.ALL;
      boolean boolean0 = AssertionLoggerHandler.hasLevel(level1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Level level0 = Level.SEVERE;
      AssertionLoggerHandler.startCapture();
      AssertionLoggerHandler assertionLoggerHandler0 = new AssertionLoggerHandler();
      ExtLogRecord extLogRecord0 = new ExtLogRecord(level0, "org.jboss.logmakager.filters.LevelFilter", "org.jboss.logmakager.filters.LevelFilter");
      assertionLoggerHandler0.doPublish(extLogRecord0);
      boolean boolean0 = AssertionLoggerHandler.hasLevel(level0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AssertionLoggerHandler assertionLoggerHandler0 = new AssertionLoggerHandler();
      Level level0 = Level.INFO;
      ExtLogRecord extLogRecord0 = new ExtLogRecord(level0, "", "H)Dgu4eWe=I&");
      assertionLoggerHandler0.doPublish(extLogRecord0);
      assertEquals(0, extLogRecord0.getThreadID());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AssertionLoggerHandler.stopCapture();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AssertionLoggerHandler assertionLoggerHandler0 = new AssertionLoggerHandler();
      assertionLoggerHandler0.flush();
      assertNull(assertionLoggerHandler0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AssertionLoggerHandler assertionLoggerHandler0 = new AssertionLoggerHandler();
      assertionLoggerHandler0.close();
      assertNull(assertionLoggerHandler0.getEncoding());
  }
}