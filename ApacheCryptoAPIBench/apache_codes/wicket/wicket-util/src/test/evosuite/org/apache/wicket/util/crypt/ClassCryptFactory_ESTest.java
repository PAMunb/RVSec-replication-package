/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:10:47 GMT 2022
 */

package org.apache.wicket.util.crypt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.wicket.util.crypt.ClassCryptFactory;
import org.apache.wicket.util.crypt.TrivialCrypt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ClassCryptFactory_ESTest extends ClassCryptFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ClassCryptFactory classCryptFactory0 = null;
      try {
        classCryptFactory0 = new ClassCryptFactory(class0, "]2@HL)oP6Bv~{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cryptClass must implement ICrypt interface
         //
         verifyException("org.apache.wicket.util.crypt.ClassCryptFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<TrivialCrypt> class0 = TrivialCrypt.class;
      ClassCryptFactory classCryptFactory0 = new ClassCryptFactory(class0, "IAk#r3-ocOaD;y(U");
      TrivialCrypt trivialCrypt0 = (TrivialCrypt)classCryptFactory0.newCrypt();
      assertEquals("IAk#r3-ocOaD;y(U", trivialCrypt0.getKey());
  }
}