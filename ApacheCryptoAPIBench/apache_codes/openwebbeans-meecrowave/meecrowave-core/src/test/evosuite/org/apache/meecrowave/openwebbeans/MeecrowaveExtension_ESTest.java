/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 21:14:04 GMT 2022
 */

package org.apache.meecrowave.openwebbeans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.enterprise.inject.spi.AnnotatedType;
import org.apache.meecrowave.openwebbeans.MeecrowaveExtension;
import org.apache.webbeans.config.WebBeansContext;
import org.apache.webbeans.container.BeanManagerImpl;
import org.apache.webbeans.container.InjectableBeanManager;
import org.apache.webbeans.portable.events.ProcessAnnotatedTypeImpl;
import org.apache.webbeans.portable.events.discovery.BeforeBeanDiscoveryImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MeecrowaveExtension_ESTest extends MeecrowaveExtension_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MeecrowaveExtension meecrowaveExtension0 = new MeecrowaveExtension();
      WebBeansContext webBeansContext0 = new WebBeansContext();
      BeforeBeanDiscoveryImpl beforeBeanDiscoveryImpl0 = new BeforeBeanDiscoveryImpl(webBeansContext0);
      beforeBeanDiscoveryImpl0.setExtension(meecrowaveExtension0);
      InjectableBeanManager injectableBeanManager0 = new InjectableBeanManager();
      meecrowaveExtension0.addBeansFromJava(beforeBeanDiscoveryImpl0, injectableBeanManager0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MeecrowaveExtension meecrowaveExtension0 = new MeecrowaveExtension();
      WebBeansContext webBeansContext0 = WebBeansContext.currentInstance();
      ProcessAnnotatedTypeImpl<Object> processAnnotatedTypeImpl0 = new ProcessAnnotatedTypeImpl<Object>(webBeansContext0, (AnnotatedType<Object>) null);
      InjectableBeanManager injectableBeanManager0 = new InjectableBeanManager();
      // Undeclared exception!
      try { 
        meecrowaveExtension0.enableContextFieldInjectionWorks(processAnnotatedTypeImpl0, injectableBeanManager0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.meecrowave.openwebbeans.MeecrowaveExtension", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MeecrowaveExtension meecrowaveExtension0 = new MeecrowaveExtension();
      WebBeansContext webBeansContext0 = WebBeansContext.getInstance();
      BeforeBeanDiscoveryImpl beforeBeanDiscoveryImpl0 = new BeforeBeanDiscoveryImpl(webBeansContext0);
      beforeBeanDiscoveryImpl0.setStarted();
      BeanManagerImpl beanManagerImpl0 = webBeansContext0.getBeanManagerImpl();
      // Undeclared exception!
      try { 
        meecrowaveExtension0.addBeansFromJava(beforeBeanDiscoveryImpl0, beanManagerImpl0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // only call container event methods in their correct lifecycle
         //
         verifyException("org.apache.webbeans.portable.events.EventBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MeecrowaveExtension meecrowaveExtension0 = new MeecrowaveExtension();
      WebBeansContext webBeansContext0 = new WebBeansContext();
      BeforeBeanDiscoveryImpl beforeBeanDiscoveryImpl0 = new BeforeBeanDiscoveryImpl(webBeansContext0);
      InjectableBeanManager injectableBeanManager0 = new InjectableBeanManager();
      // Undeclared exception!
      try { 
        meecrowaveExtension0.addBeansFromJava(beforeBeanDiscoveryImpl0, injectableBeanManager0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.webbeans.container.BeanManagerImpl", e);
      }
  }
}