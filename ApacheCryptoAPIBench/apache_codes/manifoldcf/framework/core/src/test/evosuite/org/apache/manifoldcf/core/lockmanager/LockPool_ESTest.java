/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 18 12:30:04 GMT 2022
 */

package org.apache.manifoldcf.core.lockmanager;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.manifoldcf.core.lockmanager.LockGate;
import org.apache.manifoldcf.core.lockmanager.LockObject;
import org.apache.manifoldcf.core.lockmanager.LockObjectFactory;
import org.apache.manifoldcf.core.lockmanager.LockPool;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LockPool_ESTest extends LockPool_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LockPool lockPool0 = new LockPool((LockObjectFactory) null);
      // Undeclared exception!
      try { 
        lockPool0.releaseObject((Object) null, (LockGate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.LockPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LockObjectFactory lockObjectFactory0 = new LockObjectFactory();
      LockPool lockPool0 = new LockPool(lockObjectFactory0);
      LockGate lockGate0 = new LockGate(lockPool0, (LockObject) null, lockPool0);
      // Undeclared exception!
      try { 
        lockPool0.releaseObject(lockObjectFactory0, lockGate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.LockGate", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LockPool lockPool0 = new LockPool((LockObjectFactory) null);
      // Undeclared exception!
      try { 
        lockPool0.getObject((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.lockmanager.LockPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LockObjectFactory lockObjectFactory0 = new LockObjectFactory();
      LockPool lockPool0 = new LockPool(lockObjectFactory0);
      LockGate lockGate0 = lockPool0.getObject("Y|x_3KYj^yNR[");
      LockGate lockGate1 = lockPool0.getObject("Y|x_3KYj^yNR[");
      assertSame(lockGate1, lockGate0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LockObjectFactory lockObjectFactory0 = new LockObjectFactory();
      LockPool lockPool0 = new LockPool(lockObjectFactory0);
      LockGate lockGate0 = lockPool0.getObject(lockObjectFactory0);
      Object object0 = new Object();
      lockPool0.releaseObject(object0, lockGate0);
  }
}
