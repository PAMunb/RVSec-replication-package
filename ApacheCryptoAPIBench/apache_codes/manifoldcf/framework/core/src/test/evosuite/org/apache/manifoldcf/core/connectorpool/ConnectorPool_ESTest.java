/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:40:48 GMT 2022
 */

package org.apache.manifoldcf.core.connectorpool;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.manifoldcf.core.connectorpool.ConnectorPool;
import org.apache.manifoldcf.core.interfaces.IConnector;
import org.apache.manifoldcf.core.threadcontext.ThreadContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConnectorPool_ESTest extends ConnectorPool_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConnectorPool.SumClass connectorPool_SumClass0 = new ConnectorPool.SumClass("os.version");
      assertEquals(0, connectorPool_SumClass0.getGlobalTarget());
      
      connectorPool_SumClass0.globalTargetTally = (-1236);
      int int0 = connectorPool_SumClass0.getGlobalInUse();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ConnectorPool.SumClass connectorPool_SumClass0 = new ConnectorPool.SumClass("[Uby4e%R");
      connectorPool_SumClass0.acceptServiceData("", byteArray0);
      int int0 = connectorPool_SumClass0.getGlobalInUse();
      assertEquals(1, connectorPool_SumClass0.getNumServices());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConnectorPool.SumClass connectorPool_SumClass0 = new ConnectorPool.SumClass("os.version");
      connectorPool_SumClass0.globalTargetTally = (-1236);
      int int0 = connectorPool_SumClass0.getGlobalTarget();
      assertEquals((-1236), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConnectorPool.SumClass connectorPool_SumClass0 = new ConnectorPool.SumClass((String) null);
      byte[] byteArray0 = new byte[9];
      connectorPool_SumClass0.acceptServiceData("+s", byteArray0);
      int int0 = connectorPool_SumClass0.getNumServices();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConnectorPool.SumClass connectorPool_SumClass0 = new ConnectorPool.SumClass("Class '");
      byte[] byteArray0 = new byte[5];
      connectorPool_SumClass0.numServices = (-1608);
      boolean boolean0 = connectorPool_SumClass0.acceptServiceData("Class '", byteArray0);
      assertEquals((-1607), connectorPool_SumClass0.getNumServices());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ConnectorPool.SumClass connectorPool_SumClass0 = new ConnectorPool.SumClass("[Uby4e%R");
      connectorPool_SumClass0.globalTargetTally = 43;
      boolean boolean0 = connectorPool_SumClass0.acceptServiceData("", byteArray0);
      assertEquals(1, connectorPool_SumClass0.getNumServices());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-13);
      int int0 = ConnectorPool.unpackTarget(byteArray0);
      assertEquals(243, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = ConnectorPool.pack((-903), (byte) (-79));
      int int0 = ConnectorPool.unpackTarget(byteArray0);
      assertArrayEquals(new byte[] {(byte)121, (byte) (-4), (byte) (-1), (byte) (-1), (byte) (-79), (byte) (-1), (byte) (-1), (byte) (-1)}, byteArray0);
      assertEquals((-903), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      int int0 = ConnectorPool.unpackInUse(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = ConnectorPool.pack(0, 24);
      int int0 = ConnectorPool.unpackInUse(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)24, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = ConnectorPool.pack((-59), (-59));
      int int0 = ConnectorPool.unpackInUse(byteArray0);
      assertEquals((-59), int0);
      assertArrayEquals(new byte[] {(byte) (-59), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-59), (byte) (-1), (byte) (-1), (byte) (-1)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConnectorPool.SumClass connectorPool_SumClass0 = new ConnectorPool.SumClass("org.apache.commons.io.filefilter.MagicNumberFileFilter");
      byte[] byteArray0 = ConnectorPool.pack(1, 1);
      connectorPool_SumClass0.acceptServiceData("jH.sN|HCa{a_", byteArray0);
      assertEquals(1, connectorPool_SumClass0.getNumServices());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int int0 = ConnectorPool.unpackTarget(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConnectorPool.SumClass connectorPool_SumClass0 = new ConnectorPool.SumClass("Unexpected attempt to read name. ");
      boolean boolean0 = connectorPool_SumClass0.acceptServiceData("T", (byte[]) null);
      assertEquals(1, connectorPool_SumClass0.getNumServices());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConnectorPool<IConnector> connectorPool0 = (ConnectorPool<IConnector>) mock(ConnectorPool.class, CALLS_REAL_METHODS);
      ThreadContext threadContext0 = new ThreadContext();
      ConnectorPool.Pool connectorPool_Pool0 = null;
      try {
        connectorPool_Pool0 = connectorPool0.new Pool(threadContext0, 720, "lineNumber");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.system.ManifoldCF", e);
      }
  }
}
