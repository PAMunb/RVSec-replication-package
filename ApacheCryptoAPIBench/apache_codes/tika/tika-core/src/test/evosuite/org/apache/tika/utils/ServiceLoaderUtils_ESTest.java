/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:01:42 GMT 2022
 */

package org.apache.tika.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.utils.ServiceLoaderUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ServiceLoaderUtils_ESTest extends ServiceLoaderUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        ServiceLoaderUtils.newInstance((String) null, (ClassLoader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        ServiceLoaderUtils.newInstance(">Kh^nl20r^Xm<B");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class '>Kh^nl20r^Xm<B.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.tika.utils.ServiceLoaderUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        ServiceLoaderUtils.newInstance((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        ServiceLoaderUtils.newInstance("6QMr[lhyqd`R&MQ.*", (ClassLoader) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: 6QMr[lhyqd`R&MQ/*
         //
         verifyException("org.apache.tika.utils.ServiceLoaderUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ServiceLoader serviceLoader0 = (ServiceLoader)ServiceLoaderUtils.newInstance("org.apache.tika.config.ServiceLoader");
      assertTrue(serviceLoader0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ServiceLoaderUtils serviceLoaderUtils0 = new ServiceLoaderUtils();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        ServiceLoaderUtils.sortLoadedClasses((List<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections", e);
      }
  }
}
