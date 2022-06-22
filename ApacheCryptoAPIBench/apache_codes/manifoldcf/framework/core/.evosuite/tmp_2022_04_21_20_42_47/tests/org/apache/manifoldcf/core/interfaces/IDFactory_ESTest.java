/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 21:00:23 GMT 2022
 */

package org.apache.manifoldcf.core.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.manifoldcf.core.interfaces.IDFactory;
import org.apache.manifoldcf.core.threadcontext.ThreadContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IDFactory_ESTest extends IDFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ThreadContext threadContext0 = new ThreadContext();
      // Undeclared exception!
      try { 
        IDFactory.make(threadContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.system.ManifoldCF", e);
      }
  }
}