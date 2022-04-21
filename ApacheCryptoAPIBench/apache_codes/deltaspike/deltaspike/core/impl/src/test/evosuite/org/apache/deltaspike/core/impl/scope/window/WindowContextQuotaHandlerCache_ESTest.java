/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 17:15:22 GMT 2022
 */

package org.apache.deltaspike.core.impl.scope.window;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.deltaspike.core.impl.scope.window.WindowContextQuotaHandlerCache;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WindowContextQuotaHandlerCache_ESTest extends WindowContextQuotaHandlerCache_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WindowContextQuotaHandlerCache windowContextQuotaHandlerCache0 = new WindowContextQuotaHandlerCache();
      windowContextQuotaHandlerCache0.cacheWindowId("");
      boolean boolean0 = windowContextQuotaHandlerCache0.cacheWindowId("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WindowContextQuotaHandlerCache windowContextQuotaHandlerCache0 = new WindowContextQuotaHandlerCache();
      // Undeclared exception!
      try { 
        windowContextQuotaHandlerCache0.cacheWindowId((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WindowContextQuotaHandlerCache windowContextQuotaHandlerCache0 = new WindowContextQuotaHandlerCache();
      windowContextQuotaHandlerCache0.setWindowIdToDestroy("");
      // Undeclared exception!
      try { 
        windowContextQuotaHandlerCache0.cleanup();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.deltaspike.core.impl.scope.window.WindowContextQuotaHandlerCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WindowContextQuotaHandlerCache windowContextQuotaHandlerCache0 = new WindowContextQuotaHandlerCache();
      windowContextQuotaHandlerCache0.cleanup();
  }
}
