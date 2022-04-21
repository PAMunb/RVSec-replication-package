/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:45:20 GMT 2022
 */

package org.apache.manifoldcf.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.manifoldcf.core.util.Converter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Converter_ESTest extends Converter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      try { 
        Converter.asDouble((Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Can't convert to double
         //
         verifyException("org.apache.manifoldcf.core.util.Converter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Converter converter0 = new Converter();
      try { 
        Converter.asLong(converter0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Can't convert to long
         //
         verifyException("org.apache.manifoldcf.core.util.Converter", e);
      }
  }
}
