/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:48:38 GMT 2022
 */

package org.apache.manifoldcf.core.lockmanager;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.manifoldcf.core.lockmanager.ZooKeeperConnection;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ZooKeeperConnection_ESTest extends ZooKeeperConnection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = ZooKeeperConnection.zooKeeperSafeName("'; can't also read lock '");
      assertEquals("'; can't also read lock '", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("EeN*ZyX2,Mco(/=m", (-1));
      assertNotNull(zooKeeperConnection0);
      
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        zooKeeperConnection0.writeData("EeN*ZyX2,Mco(/=m", byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("_5x", 2786);
      assertNotNull(zooKeeperConnection0);
      
      // Undeclared exception!
      try { 
        zooKeeperConnection0.createChild("%io1ws>NJPjwgAw", "_5x");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("@(#)$Id$", 784);
      assertNotNull(zooKeeperConnection0);
      
      zooKeeperConnection0.lockNode = "@(#)$Id$";
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        zooKeeperConnection0.setNodeData(byteArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can't set data for a node path we did not create: 'null'
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.ZooKeeperConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("", (-753));
      assertNotNull(zooKeeperConnection0);
      
      zooKeeperConnection0.createSession();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = ZooKeeperConnection.zooKeeperSafeName("");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZooKeeperConnection.zooKeeperSafeName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.ZooKeeperConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection(", initiating session", 45);
      assertNotNull(zooKeeperConnection0);
      
      KeeperException.OperationTimeoutException keeperException_OperationTimeoutException0 = new KeeperException.OperationTimeoutException();
      assertNotNull(keeperException_OperationTimeoutException0);
      
      try { 
        zooKeeperConnection0.handleEphemeralNodeKeeperException(keeperException_OperationTimeoutException0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // KeeperErrorCode = OperationTimeout
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.ZooKeeperConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("org.apache.manifoldcf.core.lockmanager.ZooKeeperConnection$ExistsWatcher", 128);
      assertNotNull(zooKeeperConnection0);
      
      // Undeclared exception!
      try { 
        zooKeeperConnection0.getChildren("org.apache.manifoldcf.core.lockmanager.ZooKeeperConnection$ExistsWatcher");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("<U?}", (-1));
      assertNotNull(zooKeeperConnection0);
      
      // Undeclared exception!
      try { 
        zooKeeperConnection0.deleteNodeChildren(")5|lCsvUTqv*");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("U?T", (-1));
      assertNotNull(zooKeeperConnection0);
      
      // Undeclared exception!
      try { 
        zooKeeperConnection0.createSequentialChild("U?T", "r7?n_zwOWl'R*poh");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("<U?}", (-1));
      assertNotNull(zooKeeperConnection0);
      
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        zooKeeperConnection0.createPersistentPath("pattern", byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("u<", (-2358));
      assertNotNull(zooKeeperConnection0);
      
      // Undeclared exception!
      try { 
        zooKeeperConnection0.checkNodeExists("u<");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection(", initiating session", (-2358));
      assertNotNull(zooKeeperConnection0);
      
      // Undeclared exception!
      try { 
        zooKeeperConnection0.checkGlobalFlag("nonexwrite-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = null;
      try {
        zooKeeperConnection0 = new ZooKeeperConnection("G:J0", 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"J0\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = null;
      try {
        zooKeeperConnection0 = new ZooKeeperConnection((String) null, (-1599));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.zookeeper.client.ConnectStringParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZooKeeperConnection.ZooKeeperWatcher zooKeeperConnection_ZooKeeperWatcher0 = new ZooKeeperConnection.ZooKeeperWatcher();
      assertNotNull(zooKeeperConnection_ZooKeeperWatcher0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("9Hu_]!]R]~", (-6));
      assertNotNull(zooKeeperConnection0);
      
      // Undeclared exception!
      try { 
        zooKeeperConnection0.readData((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path cannot be null
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = ZooKeeperConnection.zooKeeperDecodeSafeName("8G4_({jKW~%Gh");
      assertEquals("8G4_({jKW~%Gh", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = ZooKeeperConnection.zooKeeperSafeName("$Li]K,#)<k");
      assertEquals("$Li\\1]K,#)<k", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("@A(j,~e)Z*fMP4Q3", 128);
      assertNotNull(zooKeeperConnection0);
      
      KeeperException.ConnectionLossException keeperException_ConnectionLossException0 = new KeeperException.ConnectionLossException();
      assertNotNull(keeperException_ConnectionLossException0);
      
      zooKeeperConnection0.handleKeeperException(keeperException_ConnectionLossException0, false);
      assertEquals(KeeperException.Code.CONNECTIONLOSS, keeperException_ConnectionLossException0.code());
      assertNull(keeperException_ConnectionLossException0.getPath());
      assertEquals((-4), keeperException_ConnectionLossException0.getCode());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("H(YzbJ>8#NeHqh!", 784);
      assertNotNull(zooKeeperConnection0);
      
      KeeperException.MarshallingErrorException keeperException_MarshallingErrorException0 = new KeeperException.MarshallingErrorException();
      assertNotNull(keeperException_MarshallingErrorException0);
      
      try { 
        zooKeeperConnection0.handleKeeperException(keeperException_MarshallingErrorException0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // KeeperErrorCode = MarshallingError
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.ZooKeeperConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("", 115);
      // Undeclared exception!
      try { 
        zooKeeperConnection0.handleEphemeralNodeKeeperException((KeeperException) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.ZooKeeperConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("H(YzbJ>8#NeHqh!", 784);
      // Undeclared exception!
      try { 
        zooKeeperConnection0.releaseLock();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can't release lock we don't hold
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.ZooKeeperConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("(T;XO?Ig(W", 784);
      zooKeeperConnection0.lockNode = "(T;XO?Ig(W";
      // Undeclared exception!
      try { 
        zooKeeperConnection0.obtainReadLock("(T;XO?Ig(W");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Already have a lock in place: '(T;XO?Ig(W'; can't also read lock '(T;XO?Ig(W'
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.ZooKeeperConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("auu*[`ftD4", (-3790));
      zooKeeperConnection0.lockNode = "@(#)$Id$";
      // Undeclared exception!
      try { 
        zooKeeperConnection0.obtainReadLockNoWait("auu*[`ftD4");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Already have a lock in place: '@(#)$Id$'; can't also read lock 'auu*[`ftD4'
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.ZooKeeperConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("<U?}", (-1));
      // Undeclared exception!
      try { 
        zooKeeperConnection0.obtainReadLockNoWait("Vd0t)6rCWc$h#");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("", 784);
      zooKeeperConnection0.lockNode = "";
      // Undeclared exception!
      try { 
        zooKeeperConnection0.obtainNonExWriteLock("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Already have a lock in place: ''; can't also non-ex write lock ''
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.ZooKeeperConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("@A(j,~e)Z*fMP4Q3", 128);
      // Undeclared exception!
      try { 
        zooKeeperConnection0.obtainNonExWriteLock("@A(j,~e)Z*fMP4Q3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("@o/cAd(?Bt$^?", (-3038));
      // Undeclared exception!
      try { 
        zooKeeperConnection0.obtainNonExWriteLockNoWait("=y>\"~xUgnoYFP2d 0,^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("@(#)$Id$", 784);
      zooKeeperConnection0.lockNode = "@(#)$Id$";
      // Undeclared exception!
      try { 
        zooKeeperConnection0.obtainWriteLock("|nPZaYG&XU=bys");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Already have a lock in place: '@(#)$Id$'; can't also write lock '|nPZaYG&XU=bys'
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.ZooKeeperConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("@o/cAd(?Bt$^?", (-3038));
      // Undeclared exception!
      try { 
        zooKeeperConnection0.obtainWriteLock("=y>\"~xUgnoYFP2d 0,^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("u<", (-2358));
      // Undeclared exception!
      try { 
        zooKeeperConnection0.obtainWriteLockNoWait("nonexwrite-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("Ici9%&(ZE4Lqu", 4660);
      // Undeclared exception!
      try { 
        zooKeeperConnection0.deleteNode();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can't delete ephemeral node that isn't registered: 'null'
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.ZooKeeperConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("fh6HS", 0);
      zooKeeperConnection0.nodePath = "";
      // Undeclared exception!
      try { 
        zooKeeperConnection0.deleteNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path length must be > 0
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("@A(j,~e)Z*fMP4Q3", 128);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        zooKeeperConnection0.createNode("U_e", byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("Yp\"hoQh", 89);
      // Undeclared exception!
      try { 
        zooKeeperConnection0.obtainReadLock("ha*@D(naL9");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("S>Q", (-5056));
      // Undeclared exception!
      try { 
        zooKeeperConnection0.setGlobalFlag("S>Q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("<U?}", (-1));
      // Undeclared exception!
      try { 
        zooKeeperConnection0.clearGlobalFlag("<U?}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("/D", 92);
      // Undeclared exception!
      try { 
        zooKeeperConnection0.deleteChild(" request:: ", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ZooKeeperConnection zooKeeperConnection0 = new ZooKeeperConnection("", 96);
      // Undeclared exception!
      try { 
        zooKeeperConnection0.getNodeData("Uv7J");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Path must start with / character
         //
         verifyException("org.apache.zookeeper.common.PathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ZooKeeperConnection.ExistsWatcher zooKeeperConnection_ExistsWatcher0 = new ZooKeeperConnection.ExistsWatcher();
      Watcher.Event.EventType watcher_Event_EventType0 = Watcher.Event.EventType.None;
      Watcher.Event.KeeperState watcher_Event_KeeperState0 = Watcher.Event.KeeperState.NoSyncConnected;
      WatchedEvent watchedEvent0 = new WatchedEvent(watcher_Event_EventType0, watcher_Event_KeeperState0, (String) null);
      zooKeeperConnection_ExistsWatcher0.process(watchedEvent0);
      assertEquals(Watcher.Event.EventType.None, watchedEvent0.getType());
  }
}