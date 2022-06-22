/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:05:03 GMT 2022
 */

package org.apache.activemq.artemis.utils.uri;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.activemq.artemis.utils.uri.FluentPropertyBeanIntrospectorWithIgnores;
import org.apache.commons.beanutils.IntrospectionContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FluentPropertyBeanIntrospectorWithIgnores_ESTest extends FluentPropertyBeanIntrospectorWithIgnores_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = FluentPropertyBeanIntrospectorWithIgnores.isIgnored("#|$N}B7n&n`Eq", "{ccN^P)");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FluentPropertyBeanIntrospectorWithIgnores fluentPropertyBeanIntrospectorWithIgnores0 = new FluentPropertyBeanIntrospectorWithIgnores();
      boolean boolean0 = FluentPropertyBeanIntrospectorWithIgnores.isIgnored("set", "set");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FluentPropertyBeanIntrospectorWithIgnores fluentPropertyBeanIntrospectorWithIgnores0 = new FluentPropertyBeanIntrospectorWithIgnores();
      // Undeclared exception!
      try { 
        fluentPropertyBeanIntrospectorWithIgnores0.introspect((IntrospectionContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.utils.uri.FluentPropertyBeanIntrospectorWithIgnores", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FluentPropertyBeanIntrospectorWithIgnores fluentPropertyBeanIntrospectorWithIgnores0 = new FluentPropertyBeanIntrospectorWithIgnores();
      Class<Object> class0 = Object.class;
      IntrospectionContext introspectionContext0 = mock(IntrospectionContext.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(introspectionContext0).getTargetClass();
      fluentPropertyBeanIntrospectorWithIgnores0.introspect(introspectionContext0);
      assertEquals("set", fluentPropertyBeanIntrospectorWithIgnores0.getWriteMethodPrefix());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FluentPropertyBeanIntrospectorWithIgnores.addIgnore("", "");
  }
}