/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:59:11 GMT 2022
 */

package org.apache.spark.util.collection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.util.collection.PrimitiveKeyOpenHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import scala.Tuple3;
import scala.reflect.ClassTag;
import scala.runtime.BoxedUnit;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PrimitiveKeyOpenHashMap_ESTest extends PrimitiveKeyOpenHashMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassTag<BoxedUnit> classTag0 = (ClassTag<BoxedUnit>) mock(ClassTag.class, new ViolatedAssumptionAnswer());
      PrimitiveKeyOpenHashMap<BoxedUnit, BoxedUnit> primitiveKeyOpenHashMap0 = null;
      try {
        primitiveKeyOpenHashMap0 = new PrimitiveKeyOpenHashMap<BoxedUnit, BoxedUnit>(112, classTag0, classTag0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // requirement failed
         //
         verifyException("scala.Predef$", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PrimitiveKeyOpenHashMap<Tuple3<BoxedUnit, BoxedUnit, BoxedUnit>, Tuple3<BoxedUnit, BoxedUnit, BoxedUnit>> primitiveKeyOpenHashMap0 = null;
      try {
        primitiveKeyOpenHashMap0 = new PrimitiveKeyOpenHashMap<Tuple3<BoxedUnit, BoxedUnit, BoxedUnit>, Tuple3<BoxedUnit, BoxedUnit, BoxedUnit>>((ClassTag<Tuple3<BoxedUnit, BoxedUnit, BoxedUnit>>) null, (ClassTag<Tuple3<BoxedUnit, BoxedUnit, BoxedUnit>>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // requirement failed
         //
         verifyException("scala.Predef$", e);
      }
  }
}
