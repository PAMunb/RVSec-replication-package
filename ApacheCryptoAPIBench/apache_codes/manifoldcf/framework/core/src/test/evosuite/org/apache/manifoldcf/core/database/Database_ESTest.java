/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:37:45 GMT 2022
 */

package org.apache.manifoldcf.core.database;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.PreparedStatement;
import java.util.ArrayDeque;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.manifoldcf.core.database.DBInterfaceMariaDB;
import org.apache.manifoldcf.core.database.Database;
import org.apache.manifoldcf.core.database.QueryDescription;
import org.apache.manifoldcf.core.interfaces.ILimitChecker;
import org.apache.manifoldcf.core.interfaces.IResultSet;
import org.apache.manifoldcf.core.interfaces.IThreadContext;
import org.apache.manifoldcf.core.interfaces.ResultSpecification;
import org.apache.manifoldcf.core.interfaces.StringSet;
import org.apache.manifoldcf.core.threadcontext.ThreadContext;
import org.apache.xerces.impl.xs.util.ShortListImpl;
import org.apache.xerces.impl.xs.util.XSObjectListImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Database_ESTest extends Database_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Database.Modifications database_Modifications0 = new Database.Modifications();
      database_Modifications0.update(2580, (-662), 0);
      String string0 = "";
      boolean boolean0 = false;
      String string1 = null;
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XSObjectListImpl xSObjectListImpl0 = new XSObjectListImpl();
      Database.QueryCacheExecutor database_QueryCacheExecutor0 = new Database.QueryCacheExecutor((Database) null, true);
      StringSet stringSet0 = new StringSet("@(#)$Id: ExecutorBase.java 988245 2010-08-23 18:39:35Z kwright $");
      ResultSpecification resultSpecification0 = new ResultSpecification();
      ILimitChecker iLimitChecker0 = mock(ILimitChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iLimitChecker0).doesCompareWork();
      QueryDescription queryDescription0 = new QueryDescription("Interrupted", "@(#)$Id: StringSet.java 988245 2010-08-23 18:39:35Z kwright $", xSObjectListImpl0, "SemicolonRequiredInPEReference", stringSet0, 0, resultSpecification0, iLimitChecker0);
      database_QueryCacheExecutor0.exists(queryDescription0, (Object) null);
      assertEquals(0, queryDescription0.getMaxReturn());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Database.QueryCacheExecutor database_QueryCacheExecutor0 = new Database.QueryCacheExecutor((Database) null, true);
      database_QueryCacheExecutor0.execute();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Database.Modifications database_Modifications0 = new Database.Modifications();
      int int0 = database_Modifications0.getModifyCount();
      assertEquals(0, int0);
      assertEquals(0, database_Modifications0.getDeleteCount());
      assertEquals(0, database_Modifications0.getInsertCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Database.Modifications database_Modifications0 = new Database.Modifications();
      int int0 = database_Modifications0.getInsertCount();
      assertEquals(0, database_Modifications0.getModifyCount());
      assertEquals(0, database_Modifications0.getDeleteCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      short[] shortArray0 = new short[6];
      ShortListImpl shortListImpl0 = new ShortListImpl(shortArray0, (-2888));
      // Undeclared exception!
      try { 
        Database.cleanupParameters(shortListImpl0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ShortListImpl shortListImpl0 = new ShortListImpl((short[]) null, (short)1);
      // Undeclared exception!
      try { 
        Database.cleanupParameters(shortListImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xerces.impl.xs.util.ShortListImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ThreadContext threadContext0 = new ThreadContext();
      Database.cleanupParameters((List) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "lz]~J $H|!yIp0lNlY");
      Database.QueryCacheExecutor database_QueryCacheExecutor0 = new Database.QueryCacheExecutor((Database) null, true);
      IResultSet iResultSet0 = database_QueryCacheExecutor0.getResult();
      assertNull(iResultSet0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Database.Modifications database_Modifications0 = new Database.Modifications();
      database_Modifications0.update(0, (-594), 1733);
      DBInterfaceMariaDB dBInterfaceMariaDB0 = null;
      try {
        dBInterfaceMariaDB0 = new DBInterfaceMariaDB((IThreadContext) null, (String) null, (String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.LockManagerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XSObjectListImpl xSObjectListImpl0 = XSObjectListImpl.EMPTY_LIST;
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "lz]~J $H|!yIp0lNlY");
      Database.cleanupParameters(xSObjectListImpl0);
      assertEquals(0, xSObjectListImpl0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XSObjectListImpl xSObjectListImpl0 = XSObjectListImpl.EMPTY_LIST;
      ArrayDeque<Object> arrayDeque0 = new ArrayDeque<Object>();
      Database.loadPS((PreparedStatement) null, xSObjectListImpl0);
      assertEquals(0, xSObjectListImpl0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Database.Modifications database_Modifications0 = new Database.Modifications();
      int int0 = database_Modifications0.getDeleteCount();
      assertEquals(0, int0);
      assertEquals(0, database_Modifications0.getModifyCount());
      assertEquals(0, database_Modifications0.getInsertCount());
  }
}