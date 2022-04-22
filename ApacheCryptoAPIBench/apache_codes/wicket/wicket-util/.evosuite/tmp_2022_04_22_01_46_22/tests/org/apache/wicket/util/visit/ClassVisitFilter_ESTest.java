/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:15:22 GMT 2022
 */

package org.apache.wicket.util.visit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.wicket.util.visit.ClassVisitFilter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ClassVisitFilter_ESTest extends ClassVisitFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ClassVisitFilter classVisitFilter0 = new ClassVisitFilter(class0);
      boolean boolean0 = classVisitFilter0.visitObject(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ClassVisitFilter classVisitFilter0 = new ClassVisitFilter(class0);
      boolean boolean0 = classVisitFilter0.visitObject(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassVisitFilter classVisitFilter0 = null;
      try {
        classVisitFilter0 = new ClassVisitFilter((Class<?>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument 'clazz' may not be null.
         //
         verifyException("org.apache.wicket.util.lang.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ClassVisitFilter classVisitFilter0 = new ClassVisitFilter(class0);
      // Undeclared exception!
      try { 
        classVisitFilter0.visitObject((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.visit.ClassVisitFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ClassVisitFilter classVisitFilter0 = new ClassVisitFilter(class0);
      boolean boolean0 = classVisitFilter0.visitChildren(class0);
      assertTrue(boolean0);
  }
}
