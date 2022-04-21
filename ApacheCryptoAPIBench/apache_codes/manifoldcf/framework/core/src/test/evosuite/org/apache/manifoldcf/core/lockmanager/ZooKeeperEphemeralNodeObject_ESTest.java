/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:45:40 GMT 2022
 */

package org.apache.manifoldcf.core.lockmanager;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.manifoldcf.core.lockmanager.ZooKeeperConnection;
import org.apache.manifoldcf.core.lockmanager.ZooKeeperConnectionPool;
import org.apache.manifoldcf.core.lockmanager.ZooKeeperEphemeralNodeObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ZooKeeperEphemeralNodeObject_ESTest extends ZooKeeperEphemeralNodeObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ZooKeeperEphemeralNodeObject zooKeeperEphemeralNodeObject0 = new ZooKeeperEphemeralNodeObject("", (ZooKeeperConnectionPool) null);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        zooKeeperEphemeralNodeObject0.createNode(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.ZooKeeperEphemeralNodeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ZooKeeperConnectionPool zooKeeperConnectionPool0 = mock(ZooKeeperConnectionPool.class, new ViolatedAssumptionAnswer());
      ZooKeeperEphemeralNodeObject zooKeeperEphemeralNodeObject0 = new ZooKeeperEphemeralNodeObject("/", zooKeeperConnectionPool0);
      // Undeclared exception!
      try { 
        zooKeeperEphemeralNodeObject0.deleteNode();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can't delete node '/' that we don't own
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.ZooKeeperEphemeralNodeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = mock(ZooKeeperConnection.class, new ViolatedAssumptionAnswer());
      ZooKeeperConnectionPool zooKeeperConnectionPool0 = mock(ZooKeeperConnectionPool.class, new ViolatedAssumptionAnswer());
      doReturn(zooKeeperConnection0).when(zooKeeperConnectionPool0).grab();
      ZooKeeperEphemeralNodeObject zooKeeperEphemeralNodeObject0 = new ZooKeeperEphemeralNodeObject("/", zooKeeperConnectionPool0);
      byte[] byteArray0 = new byte[1];
      zooKeeperEphemeralNodeObject0.createNode(byteArray0);
      zooKeeperEphemeralNodeObject0.deleteNode();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ZooKeeperEphemeralNodeObject zooKeeperEphemeralNodeObject0 = new ZooKeeperEphemeralNodeObject((String) null, (ZooKeeperConnectionPool) null);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        zooKeeperEphemeralNodeObject0.setNodeData(byteArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Node not yet created for node path 'null'
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.ZooKeeperEphemeralNodeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ZooKeeperConnection zooKeeperConnection0 = mock(ZooKeeperConnection.class, new ViolatedAssumptionAnswer());
      ZooKeeperConnectionPool zooKeeperConnectionPool0 = mock(ZooKeeperConnectionPool.class, new ViolatedAssumptionAnswer());
      doReturn((ZooKeeperConnection) null).when(zooKeeperConnectionPool0).grab();
      ZooKeeperEphemeralNodeObject zooKeeperEphemeralNodeObject0 = new ZooKeeperEphemeralNodeObject("@(#)$Id$", zooKeeperConnectionPool0);
      // Undeclared exception!
      try { 
        zooKeeperEphemeralNodeObject0.createNode(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.ZooKeeperEphemeralNodeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = mock(ZooKeeperConnection.class, new ViolatedAssumptionAnswer());
      ZooKeeperConnectionPool zooKeeperConnectionPool0 = mock(ZooKeeperConnectionPool.class, new ViolatedAssumptionAnswer());
      doReturn(zooKeeperConnection0).when(zooKeeperConnectionPool0).grab();
      ZooKeeperEphemeralNodeObject zooKeeperEphemeralNodeObject0 = new ZooKeeperEphemeralNodeObject("@(#)$Id$", zooKeeperConnectionPool0);
      zooKeeperEphemeralNodeObject0.createNode((byte[]) null);
      // Undeclared exception!
      try { 
        zooKeeperEphemeralNodeObject0.createNode((byte[]) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Already have a created node for '@(#)$Id$'
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.ZooKeeperEphemeralNodeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ZooKeeperConnectionPool zooKeeperConnectionPool0 = mock(ZooKeeperConnectionPool.class, new ViolatedAssumptionAnswer());
      doReturn((ZooKeeperConnection) null).when(zooKeeperConnectionPool0).grab();
      ZooKeeperEphemeralNodeObject zooKeeperEphemeralNodeObject0 = new ZooKeeperEphemeralNodeObject("@(#)$Id$", zooKeeperConnectionPool0);
      // Undeclared exception!
      try { 
        zooKeeperEphemeralNodeObject0.createNode((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.ZooKeeperEphemeralNodeObject", e);
      }
  }
}