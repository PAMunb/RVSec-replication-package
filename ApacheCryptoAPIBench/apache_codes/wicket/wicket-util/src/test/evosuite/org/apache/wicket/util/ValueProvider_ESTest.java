/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:18:22 GMT 2022
 */

package org.apache.wicket.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.wicket.util.ValueProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ValueProvider_ESTest extends ValueProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(0);
      ValueProvider<Integer> valueProvider0 = new ValueProvider<Integer>(integer0);
      ValueProvider<Object> valueProvider1 = ValueProvider.of((Object) valueProvider0);
      Object object0 = valueProvider1.get();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(0);
      ValueProvider<Object> valueProvider0 = new ValueProvider<Object>(integer0);
      ValueProvider valueProvider1 = (ValueProvider)valueProvider0.get();
      // Undeclared exception!
      try { 
        valueProvider1.get();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ValueProvider<Integer> valueProvider0 = new ValueProvider<Integer>((Integer) null);
      Integer integer0 = valueProvider0.get();
      assertNull(integer0);
  }
}
