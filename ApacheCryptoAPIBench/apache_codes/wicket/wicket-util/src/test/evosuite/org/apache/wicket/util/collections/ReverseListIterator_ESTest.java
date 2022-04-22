/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:19:14 GMT 2022
 */

package org.apache.wicket.util.collections;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.wicket.util.collections.ReverseListIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ReverseListIterator_ESTest extends ReverseListIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReverseListIterator<Object> reverseListIterator0 = null;
      try {
        reverseListIterator0 = new ReverseListIterator<Object>((List<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.collections.ReverseListIterator", e);
      }
  }
}
