/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:46:11 GMT 2022
 */

package org.apache.manifoldcf.core.database;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import org.apache.manifoldcf.core.database.ConnectionFactory;
import org.apache.manifoldcf.core.jdbcpool.WrappedConnection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConnectionFactory_ESTest extends ConnectionFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      try { 
        ConnectionFactory.getConnection("", "", "", "", "", 100, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to load database driver: 
         //
         verifyException("org.apache.manifoldcf.core.database.ConnectionFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConnectionFactory.ConnectionTracker connectionFactory_ConnectionTracker0 = new ConnectionFactory.ConnectionTracker((Connection) null);
      boolean boolean0 = connectionFactory_ConnectionTracker0.hasExpired(0L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      try { 
        ConnectionFactory.getConnection("org.apache.manifoldcf.core.database.ConnectionFactory$PoolManager", "org.apache.manifoldcf.core.database.ConnectionFactory$PoolManager", "org.apache.manifoldcf.core.database.ConnectionFactory$PoolManager", "G)K17S?Xx05uw6gBy", "G)K17S?Xx05uw6gBy", 100, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Fatal error getting connection: Class org.apache.manifoldcf.core.jdbcpool.ConnectionPoolManager can not access a member of class org.apache.manifoldcf.core.database.ConnectionFactory$PoolManager with modifiers \"private\"
         //
         verifyException("org.apache.manifoldcf.core.database.ConnectionFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ConnectionFactory.checkConnections(0L);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConnectionFactory.releaseAll();
      try { 
        ConnectionFactory.getConnection("G)K17S?Xx05uw6gBy", "org.apache.manifoldcf.core.database.ConnectionFactory", "A'K84s1f84:00}W][", "org.apache.manifoldcf.core.database.ConnectionFactory$PoolManager", "org.apache.manifoldcf.core.database.ConnectionFactory", 0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Fatal error getting connection: Class org.apache.manifoldcf.core.jdbcpool.ConnectionPoolManager can not access a member of class org.apache.manifoldcf.core.database.ConnectionFactory with modifiers \"private\"
         //
         verifyException("org.apache.manifoldcf.core.database.ConnectionFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ConnectionFactory.flush();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ConnectionFactory.ConnectionTracker connectionFactory_ConnectionTracker0 = new ConnectionFactory.ConnectionTracker((Connection) null);
      // Undeclared exception!
      try { 
        connectionFactory_ConnectionTracker0.printDetails();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        ConnectionFactory.releaseConnection((WrappedConnection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.database.ConnectionFactory", e);
      }
  }
}
