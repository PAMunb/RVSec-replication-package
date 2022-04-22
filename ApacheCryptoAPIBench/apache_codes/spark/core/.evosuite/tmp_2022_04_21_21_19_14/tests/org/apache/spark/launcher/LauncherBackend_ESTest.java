/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:34:22 GMT 2022
 */

package org.apache.spark.launcher;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.SocketException;
import java.util.concurrent.ThreadFactory;
import org.apache.spark.launcher.LauncherBackend;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LauncherBackend_ESTest extends LauncherBackend_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LauncherBackend launcherBackend0 = mock(LauncherBackend.class, CALLS_REAL_METHODS);
      MockSocket mockSocket0 = new MockSocket();
      LauncherBackend.BackendConnection launcherBackend_BackendConnection0 = null;
      try {
        launcherBackend_BackendConnection0 = launcherBackend0.new BackendConnection(mockSocket0);
        fail("Expecting exception: SocketException");
      
      } catch(Throwable e) {
         //
         // Socket is not connected
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ThreadFactory threadFactory0 = LauncherBackend.threadFactory();
      assertNotNull(threadFactory0);
  }
}
