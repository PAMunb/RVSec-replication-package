/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 20 11:26:04 GMT 2022
 */

package org.apache.activemq.artemis.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URL;
import org.apache.activemq.artemis.utils.ClassloadingUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ClassloadingUtil_ESTest extends ClassloadingUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassloadingUtil.newInstanceFromClassLoader("com.google.common.base.Preconditions", (Object[]) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.IllegalAccessException: Class org.apache.activemq.artemis.utils.ClassloadingUtil can not access a member of class com.google.common.base.Preconditions with modifiers \"private\"
         //
         verifyException("org.apache.activemq.artemis.utils.ClassloadingUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Object object0 = ClassloadingUtil.newInstanceFromClassLoader("org.apache.activemq.artemis.utils.ClassloadingUtil", objectArray0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      // Undeclared exception!
      try { 
        ClassloadingUtil.newInstanceFromClassLoader("", objectArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // java.lang.ClassNotFoundException: Class '.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.activemq.artemis.utils.ClassloadingUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassloadingUtil.newInstanceFromClassLoader((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassloadingUtil.newInstanceFromClassLoader("Ea");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // java.lang.ClassNotFoundException: Class 'Ea.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.activemq.artemis.utils.ClassloadingUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassloadingUtil.findResource((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassloadingUtil classloadingUtil0 = new ClassloadingUtil();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      URL uRL0 = ClassloadingUtil.findResource("");
      assertNull(uRL0.getUserInfo());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      URL uRL0 = ClassloadingUtil.findResource("org.apache.activemq.artemis.utils.ClassloadingUtil");
      assertNull(uRL0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        ClassloadingUtil.newInstanceFromClassLoader("com.google.common.io.PatternFilenameFilter", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Your class must have a constructor without arguments. If it is an inner class, it must be static! com.google.common.io.PatternFilenameFilter
         //
         verifyException("org.apache.activemq.artemis.utils.ClassloadingUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      // Undeclared exception!
      try { 
        ClassloadingUtil.newInstanceFromClassLoader((String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassloadingUtil.newInstanceFromClassLoader("com.google.common.io.PatternFilenameFilter");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Your class must have a constructor without arguments. If it is an inner class, it must be static! com.google.common.io.PatternFilenameFilter
         //
         verifyException("org.apache.activemq.artemis.utils.ClassloadingUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassloadingUtil.newInstanceFromClassLoader("com.google.common.base.Preconditions");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.IllegalAccessException: Class org.apache.activemq.artemis.utils.ClassloadingUtil can not access a member of class com.google.common.base.Preconditions with modifiers \"private\"
         //
         verifyException("org.apache.activemq.artemis.utils.ClassloadingUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = ClassloadingUtil.newInstanceFromClassLoader("org.apache.activemq.artemis.utils.ClassloadingUtil");
      assertNotNull(object0);
  }
}