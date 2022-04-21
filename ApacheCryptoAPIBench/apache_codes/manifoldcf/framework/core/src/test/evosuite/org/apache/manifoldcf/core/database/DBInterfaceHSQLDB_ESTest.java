/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:37:06 GMT 2022
 */

package org.apache.manifoldcf.core.database;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.manifoldcf.core.database.DBInterfaceHSQLDB;
import org.apache.manifoldcf.core.interfaces.ColumnDescription;
import org.apache.manifoldcf.core.threadcontext.ThreadContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DBInterfaceHSQLDB_ESTest extends DBInterfaceHSQLDB_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = DBInterfaceHSQLDB.mapType("dB0NeF@");
      assertEquals("dB0NeF@", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = DBInterfaceHSQLDB.mapType("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBInterfaceHSQLDB.singleDelete((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.database.DBInterfaceHSQLDB", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBInterfaceHSQLDB.mapType((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ThreadContext threadContext0 = new ThreadContext();
      // Undeclared exception!
      try { 
        DBInterfaceHSQLDB.getJDBCString(threadContext0, "u9^2?ix~anb+aci;\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.system.ManifoldCF", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBInterfaceHSQLDB.getFullDatabasePath("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.system.ManifoldCF", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ThreadContext threadContext0 = new ThreadContext();
      // Undeclared exception!
      try { 
        DBInterfaceHSQLDB.getDatabaseString(threadContext0, "@(#)$Id: ThreadContext.java 988245 2010-08-23 18:39:35Z kwright $");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.system.ManifoldCF", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      // Undeclared exception!
      try { 
        DBInterfaceHSQLDB.appendDescription(stringBuilder0, "JB0NUF@", (ColumnDescription) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.database.DBInterfaceHSQLDB", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ThreadContext threadContext0 = new ThreadContext();
      DBInterfaceHSQLDB dBInterfaceHSQLDB0 = null;
      try {
        dBInterfaceHSQLDB0 = new DBInterfaceHSQLDB(threadContext0, "@(#)$Id: ThreadContext.java 988245 2010-08-23 18:39:35Z kwright $", "@(#)$Id: ThreadContext.java 988245 2010-08-23 18:39:35Z kwright $", "@(#)$Id: ThreadContext.java 988245 2010-08-23 18:39:35Z kwright $");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.system.ManifoldCF", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      File file0 = MockFile.createTempFile("@(#)$Id: ThreadContext.java 988245 2010-08-23 18:39:35Z kwright $", "@(#)$Id: ThreadContext.java 988245 2010-08-23 18:39:35Z kwright $");
      file0.setWritable(false, false);
      DBInterfaceHSQLDB.singleDelete(file0);
      assertEquals(0L, file0.getTotalSpace());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      File file0 = MockFile.createTempFile("@(#)$Id: ThreadContext.java 988245 2010-08-23 18:39:35Z kwright $", "@(#)$Id: ThreadContext.java 988245 2010-08-23 18:39:35Z kwright $");
      DBInterfaceHSQLDB.singleDelete(file0);
      assertFalse(file0.canExecute());
      assertFalse(file0.canRead());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/pedro/projects");
      FileSystemHandling.createFolder(evoSuiteFile0);
      MockFile mockFile0 = new MockFile("", "");
      DBInterfaceHSQLDB.recursiveDelete(mockFile0);
      assertEquals(0L, mockFile0.getFreeSpace());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      File file0 = MockFile.createTempFile("Fourteen", "Fourteen");
      DBInterfaceHSQLDB.recursiveDelete(file0);
      assertEquals(0L, file0.lastModified());
      assertFalse(file0.canWrite());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      // Undeclared exception!
      try { 
        DBInterfaceHSQLDB.recursiveDelete(mockFile0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("g)", "public");
      DBInterfaceHSQLDB.recursiveDelete(mockFile0);
      assertFalse(mockFile0.canRead());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("");
      ColumnDescription columnDescription0 = new ColumnDescription("<.", true, false, (String) null, "<.", true);
      DBInterfaceHSQLDB.appendDescription(stringBuilder0, "E&@B", columnDescription0, true);
      assertEquals("E&@B <. NULL PRIMARY KEY", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ColumnDescription columnDescription0 = new ColumnDescription("2?F#b0=.", true, true, "(2NjqOOI#", "(2NjqOOI#", true);
      StringBuilder stringBuilder0 = new StringBuilder("@(#)$Id: ColumnDescription.java 988245 2010-08-23 18:39:35Z kwright $");
      DBInterfaceHSQLDB.appendDescription(stringBuilder0, "(2NjqOOI#", columnDescription0, false);
      assertEquals("@(#)$Id: ColumnDescription.java 988245 2010-08-23 18:39:35Z kwright $(2NjqOOI# 2?F#b0=. NULL PRIMARY KEY REFERENCES (2NjqOOI#((2NjqOOI#) ON DELETE CASCADE", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ColumnDescription columnDescription0 = new ColumnDescription("longtext", false, false, "longtext", "longtext", false);
      StringBuilder stringBuilder0 = new StringBuilder("F(D/J$vx%4Ea&|)* M");
      DBInterfaceHSQLDB.appendDescription(stringBuilder0, "@(#)$Id: ColumnDescription.java 988245 2010-08-23 18:39:35Z kwright $", columnDescription0, false);
      assertEquals("F(D/J$vx%4Ea&|)* M@(#)$Id: ColumnDescription.java 988245 2010-08-23 18:39:35Z kwright $ longvarchar NOT NULL REFERENCES longtext(longtext) ON DELETE RESTRICT", stringBuilder0.toString());
  }
}