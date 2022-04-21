/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 20 11:28:31 GMT 2022
 */

package org.apache.activemq.artemis.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.util.Properties;
import org.apache.activemq.artemis.utils.FactoryFinder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FactoryFinder_ESTest extends FactoryFinder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FactoryFinder.StandaloneObjectFactory factoryFinder_StandaloneObjectFactory0 = (FactoryFinder.StandaloneObjectFactory)FactoryFinder.getObjectFactory();
      try { 
        factoryFinder_StandaloneObjectFactory0.loadProperties("org.apache.activemq.artemis.utils.FactoryFinder");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find factory class for resource: org.apache.activemq.artemis.utils.FactoryFinder
         //
         verifyException("org.apache.activemq.artemis.utils.FactoryFinder$StandaloneObjectFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Properties properties0 = new Properties();
      try { 
        FactoryFinder.StandaloneObjectFactory.loadClass(properties0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Expected property is missing: class
         //
         verifyException("org.apache.activemq.artemis.utils.FactoryFinder$StandaloneObjectFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FactoryFinder.ObjectFactory factoryFinder_ObjectFactory0 = FactoryFinder.getObjectFactory();
      try { 
        factoryFinder_ObjectFactory0.create("");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Expected property is missing: class
         //
         verifyException("org.apache.activemq.artemis.utils.FactoryFinder$StandaloneObjectFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FactoryFinder.setObjectFactory((FactoryFinder.ObjectFactory) null);
      FactoryFinder.ObjectFactory factoryFinder_ObjectFactory0 = FactoryFinder.getObjectFactory();
      assertNull(factoryFinder_ObjectFactory0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FactoryFinder factoryFinder0 = new FactoryFinder("~");
      FactoryFinder.setObjectFactory((FactoryFinder.ObjectFactory) null);
      // Undeclared exception!
      try { 
        factoryFinder0.newInstance("~");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.utils.FactoryFinder", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FactoryFinder factoryFinder0 = new FactoryFinder("Yxt:h2\"zjN76^EGeE.:");
      try { 
        factoryFinder0.newInstance("Yxt:h2\"zjN76^EGeE.:");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find factory class for resource: Yxt:h2\"zjN76^EGeE.:Yxt:h2\"zjN76^EGeE.:
         //
         verifyException("org.apache.activemq.artemis.utils.FactoryFinder$StandaloneObjectFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FactoryFinder.StandaloneObjectFactory factoryFinder_StandaloneObjectFactory0 = new FactoryFinder.StandaloneObjectFactory();
      Properties properties0 = factoryFinder_StandaloneObjectFactory0.loadProperties("");
      assertEquals(2, properties0.size());
  }
}