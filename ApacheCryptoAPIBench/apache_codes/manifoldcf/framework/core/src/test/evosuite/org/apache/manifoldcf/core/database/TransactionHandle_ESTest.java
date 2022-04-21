/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:52:12 GMT 2022
 */

package org.apache.manifoldcf.core.database;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.manifoldcf.core.database.TransactionHandle;
import org.apache.manifoldcf.core.interfaces.IThreadContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TransactionHandle_ESTest extends TransactionHandle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TransactionHandle transactionHandle0 = null;
      try {
        transactionHandle0 = new TransactionHandle((IThreadContext) null, (TransactionHandle) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.LockManagerFactory", e);
      }
  }
}
