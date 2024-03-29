/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:07:04 GMT 2022
 */

package org.apache.wicket.util.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.wicket.util.lang.Classes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Classes_ESTest extends Classes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<?> class1 = Classes.relativeClass(class0, "Object");
      assertFalse(class1.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        Classes.relativeClass(class0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.lang.Packages", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String string0 = Classes.simpleName(class0);
      assertEquals("Object", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = Classes.simpleName((Class<?>) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String string0 = Classes.name(class0);
      assertEquals("java.lang.Object", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = Classes.name((Class<?>) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<Object> class0 = Object.class;
      try { 
        Classes.relativeClass(class0, "null");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }
}
