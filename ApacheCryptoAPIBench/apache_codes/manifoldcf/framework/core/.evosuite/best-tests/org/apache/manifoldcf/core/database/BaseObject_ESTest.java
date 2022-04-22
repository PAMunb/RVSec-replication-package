/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 21:03:26 GMT 2022
 */

package org.apache.manifoldcf.core.database;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import org.apache.manifoldcf.core.database.BaseObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BaseObject_ESTest extends BaseObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseObject baseObject0 = new BaseObject();
      baseObject0.fields = null;
      // Undeclared exception!
      try { 
        baseObject0.setValue("@(#)$Id: BaseObject.java 988245 2010-08-23 18:39:35Z kwright $", "@(#)$Id: BaseObject.java 988245 2010-08-23 18:39:35Z kwright $");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.database.BaseObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BaseObject baseObject0 = new BaseObject();
      baseObject0.fields = null;
      // Undeclared exception!
      try { 
        baseObject0.listFields();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.database.BaseObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BaseObject baseObject0 = new BaseObject();
      baseObject0.fields = null;
      // Undeclared exception!
      try { 
        baseObject0.getValue("#~w]JT]0");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.database.BaseObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BaseObject baseObject0 = new BaseObject();
      baseObject0.fields = null;
      // Undeclared exception!
      try { 
        baseObject0.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.database.BaseObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BaseObject baseObject0 = new BaseObject();
      baseObject0.setValue("p36xAg0,*t!^NMS+zg", (Object) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BaseObject baseObject0 = new BaseObject();
      baseObject0.setValue("p36xAg0,*t!^NMS+zg", "p36xAg0,*t!^NMS+zg");
      Object object0 = baseObject0.getValue("p36xAg0,*t!^NMS+zg");
      assertEquals("p36xAg0,*t!^NMS+zg", object0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BaseObject baseObject0 = new BaseObject();
      Object object0 = baseObject0.getValue("p36xAg0,*t!^NMS+zg");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BaseObject baseObject0 = new BaseObject();
      baseObject0.clear();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      BaseObject baseObject0 = new BaseObject();
      Iterator iterator0 = baseObject0.listFields();
      assertNotNull(iterator0);
  }
}
