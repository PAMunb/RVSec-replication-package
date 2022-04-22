/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:19:42 GMT 2022
 */

package org.apache.deltaspike.core.impl.scope.viewaccess;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.deltaspike.core.impl.scope.viewaccess.ViewAccessContextArtifactProducer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ViewAccessContextArtifactProducer_ESTest extends ViewAccessContextArtifactProducer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ViewAccessContextArtifactProducer viewAccessContextArtifactProducer0 = new ViewAccessContextArtifactProducer();
      // Undeclared exception!
      try { 
        viewAccessContextArtifactProducer0.getViewAccessContextManager();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.deltaspike.core.impl.scope.viewaccess.ViewAccessContextArtifactProducer", e);
      }
  }
}
