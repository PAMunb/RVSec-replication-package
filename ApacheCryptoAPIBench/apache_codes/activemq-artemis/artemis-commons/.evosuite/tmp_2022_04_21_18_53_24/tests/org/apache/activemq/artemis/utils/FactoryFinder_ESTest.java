/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:07:51 GMT 2022
 */

package org.apache.activemq.artemis.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.apache.activemq.artemis.utils.FactoryFinder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FactoryFinder_ESTest extends FactoryFinder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FactoryFinder.setObjectFactory((FactoryFinder.ObjectFactory) null);
      FactoryFinder.ObjectFactory factoryFinder_ObjectFactory0 = FactoryFinder.getObjectFactory();
      assertNull(factoryFinder_ObjectFactory0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FactoryFinder factoryFinder0 = new FactoryFinder("");
      FactoryFinder.setObjectFactory((FactoryFinder.ObjectFactory) null);
      // Undeclared exception!
      try { 
        factoryFinder0.newInstance("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.utils.FactoryFinder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FactoryFinder.StandaloneObjectFactory factoryFinder_StandaloneObjectFactory0 = (FactoryFinder.StandaloneObjectFactory)FactoryFinder.getObjectFactory();
      try { 
        factoryFinder_StandaloneObjectFactory0.loadProperties("bwIC0");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find factory class for resource: bwIC0
         //
         verifyException("org.apache.activemq.artemis.utils.FactoryFinder$StandaloneObjectFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FactoryFinder factoryFinder0 = new FactoryFinder("");
      try { 
        factoryFinder0.newInstance("");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Expected property is missing: class
         //
         verifyException("org.apache.activemq.artemis.utils.FactoryFinder$StandaloneObjectFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FactoryFinder.StandaloneObjectFactory factoryFinder_StandaloneObjectFactory0 = new FactoryFinder.StandaloneObjectFactory();
      try { 
        factoryFinder_StandaloneObjectFactory0.create("");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Expected property is missing: class
         //
         verifyException("org.apache.activemq.artemis.utils.FactoryFinder$StandaloneObjectFactory", e);
      }
  }
}