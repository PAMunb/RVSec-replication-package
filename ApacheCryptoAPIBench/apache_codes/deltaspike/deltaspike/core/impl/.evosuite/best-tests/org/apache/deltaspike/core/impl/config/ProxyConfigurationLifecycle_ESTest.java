/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:17:31 GMT 2022
 */

package org.apache.deltaspike.core.impl.config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import org.apache.deltaspike.core.impl.config.ProxyConfigurationLifecycle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ProxyConfigurationLifecycle_ESTest extends ProxyConfigurationLifecycle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ProxyConfigurationLifecycle proxyConfigurationLifecycle0 = new ProxyConfigurationLifecycle(class0);
      // Undeclared exception!
      try { 
        proxyConfigurationLifecycle0.create((Bean) null, (CreationalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.deltaspike.core.impl.config.ProxyConfigurationLifecycle", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ProxyConfigurationLifecycle proxyConfigurationLifecycle0 = new ProxyConfigurationLifecycle(class0);
      Bean<Integer> bean0 = (Bean<Integer>) mock(Bean.class, new ViolatedAssumptionAnswer());
      CreationalContext<Integer> creationalContext0 = (CreationalContext<Integer>) mock(CreationalContext.class, new ViolatedAssumptionAnswer());
      proxyConfigurationLifecycle0.destroy(bean0, (Object) null, creationalContext0);
  }
}