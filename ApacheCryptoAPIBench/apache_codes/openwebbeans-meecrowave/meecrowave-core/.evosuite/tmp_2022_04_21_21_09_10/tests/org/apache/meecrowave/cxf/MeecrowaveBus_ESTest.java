/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 21:11:36 GMT 2022
 */

package org.apache.meecrowave.cxf;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletContext;
import org.apache.cxf.Bus;
import org.apache.cxf.feature.Feature;
import org.apache.cxf.feature.StaxTransformFeature;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.message.Message;
import org.apache.meecrowave.cxf.MeecrowaveBus;
import org.apache.webbeans.config.WebBeansContext;
import org.apache.webbeans.config.WebBeansFinder;
import org.apache.webbeans.exception.WebBeansConfigurationException;
import org.apache.webbeans.spi.SingletonService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MeecrowaveBus_ESTest extends MeecrowaveBus_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      assertEquals("cxf5", meecrowaveBus0.getId());
      
      Collection<Feature> collection0 = meecrowaveBus0.getFeatures();
      assertNotNull(collection0);
      
      meecrowaveBus0.getId();
      meecrowaveBus0.setFeatures(collection0);
      assertEquals(Bus.BusState.INITIAL, meecrowaveBus0.getState());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ServletContext servletContext0 = mock(ServletContext.class, new ViolatedAssumptionAnswer());
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      SingletonService<WebBeansContext> singletonService0 = (SingletonService<WebBeansContext>) mock(SingletonService.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(singletonService0).get(any());
      WebBeansFinder.setSingletonService(singletonService0);
      MeecrowaveBus meecrowaveBus1 = null;
      try {
        meecrowaveBus1 = new MeecrowaveBus(servletContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.meecrowave.cxf.MeecrowaveBus", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StaxTransformFeature staxTransformFeature0 = mock(StaxTransformFeature.class, new ViolatedAssumptionAnswer());
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      Class<?> class0 = meecrowaveBus0.getRealClass(staxTransformFeature0);
      assertEquals("class org.apache.cxf.feature.StaxTransformFeature$MockitoMock$965911827", class0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      List<Interceptor<? extends Message>> list0 = meecrowaveBus0.getInFaultInterceptors();
      assertEquals(0, list0.size());
      
      StaxTransformFeature staxTransformFeature0 = mock(StaxTransformFeature.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(staxTransformFeature0).toString();
      Class<StaxTransformFeature> class0 = StaxTransformFeature.class;
      meecrowaveBus0.setExtension(staxTransformFeature0, class0);
      meecrowaveBus0.getOutFaultInterceptors();
      meecrowaveBus0.getInFaultInterceptors();
      StaxTransformFeature staxTransformFeature1 = meecrowaveBus0.getExtension(class0);
      meecrowaveBus0.getRealClass(staxTransformFeature1);
      // Undeclared exception!
      try { 
        meecrowaveBus0.getRealClass((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.meecrowave.cxf.MeecrowaveBus", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      meecrowaveBus0.getProperty("org.apache.meecrowave.cxf.MeecrowaveBus$ConfiguredJsrProvider$1");
      // Undeclared exception!
      try { 
        meecrowaveBus0.setProperties((Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      meecrowaveBus0.getInFaultInterceptors();
      StaxTransformFeature staxTransformFeature0 = mock(StaxTransformFeature.class, new ViolatedAssumptionAnswer());
      meecrowaveBus0.getInInterceptors();
      meecrowaveBus0.getProperties();
      meecrowaveBus0.getState();
      SingletonService<WebBeansContext> singletonService0 = (SingletonService<WebBeansContext>) mock(SingletonService.class, new ViolatedAssumptionAnswer());
      WebBeansFinder.setSingletonService(singletonService0);
      Collection<StaxTransformFeature> collection0 = null;
      MeecrowaveBus meecrowaveBus1 = new MeecrowaveBus();
      meecrowaveBus1.getOutInterceptors();
      // Undeclared exception!
      try { 
        meecrowaveBus1.setFeatures((Collection<? extends Feature>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.CopyOnWriteArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      // Undeclared exception!
      try { 
        meecrowaveBus0.setFeatures((Collection<? extends Feature>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.CopyOnWriteArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      Map<String, Object> map0 = meecrowaveBus0.getProperties();
      assertFalse(map0.isEmpty());
      
      meecrowaveBus0.shutdown(true);
      StaxTransformFeature staxTransformFeature0 = mock(StaxTransformFeature.class, new ViolatedAssumptionAnswer());
      Class<StaxTransformFeature> class0 = StaxTransformFeature.class;
      meecrowaveBus0.setExtension(staxTransformFeature0, class0);
      meecrowaveBus0.setProperties(map0);
      meecrowaveBus0.getProperty("=V wDF0YLTP<");
      meecrowaveBus0.setId("t5Uq4)UmCz5\"i~X3v");
      meecrowaveBus0.getInFaultInterceptors();
      meecrowaveBus0.getId();
      assertEquals("t5Uq4)UmCz5\"i~X3v", meecrowaveBus0.getId());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      List<Interceptor<? extends Message>> list0 = meecrowaveBus0.getInInterceptors();
      assertTrue(list0.isEmpty());
      
      meecrowaveBus0.getInInterceptors();
      meecrowaveBus0.getInInterceptors();
      meecrowaveBus0.getOutInterceptors();
      meecrowaveBus0.getOutInterceptors();
      meecrowaveBus0.getInFaultInterceptors();
      meecrowaveBus0.getProperty("");
      meecrowaveBus0.getOutInterceptors();
      meecrowaveBus0.getOutFaultInterceptors();
      meecrowaveBus0.getOutInterceptors();
      meecrowaveBus0.getInInterceptors();
      meecrowaveBus0.getInFaultInterceptors();
      meecrowaveBus0.getOutFaultInterceptors();
      meecrowaveBus0.getId();
      Map<String, Object> map0 = meecrowaveBus0.getProperties();
      meecrowaveBus0.setProperty("", (Object) null);
      meecrowaveBus0.getOutFaultInterceptors();
      meecrowaveBus0.getInInterceptors();
      meecrowaveBus0.hasExtensionByName(";2T_EF2h?P3x");
      meecrowaveBus0.getInFaultInterceptors();
      StaxTransformFeature staxTransformFeature0 = mock(StaxTransformFeature.class, new ViolatedAssumptionAnswer());
      Class<StaxTransformFeature> class0 = StaxTransformFeature.class;
      meecrowaveBus0.setExtension(staxTransformFeature0, class0);
      meecrowaveBus0.setProperties(map0);
      meecrowaveBus0.getFeatures();
      meecrowaveBus0.shutdown(false);
      // Undeclared exception!
      try { 
        meecrowaveBus0.getRealClass((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.meecrowave.cxf.MeecrowaveBus", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      Bus.BusState bus_BusState0 = meecrowaveBus0.getState();
      assertEquals(Bus.BusState.INITIAL, bus_BusState0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      List<Interceptor<? extends Message>> list0 = meecrowaveBus0.getOutInterceptors();
      assertEquals(0, list0.size());
      
      SingletonService<WebBeansContext> singletonService0 = (SingletonService<WebBeansContext>) mock(SingletonService.class, new ViolatedAssumptionAnswer());
      WebBeansFinder.setSingletonService(singletonService0);
      meecrowaveBus0.getInInterceptors();
      meecrowaveBus0.getOutInterceptors();
      meecrowaveBus0.getState();
      Class<StaxTransformFeature> class0 = StaxTransformFeature.class;
      meecrowaveBus0.getExtension(class0);
      // Undeclared exception!
      try { 
        meecrowaveBus0.getRealClass((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.meecrowave.cxf.MeecrowaveBus", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      StaxTransformFeature staxTransformFeature0 = mock(StaxTransformFeature.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(staxTransformFeature0).toString();
      SingletonService<WebBeansContext> singletonService0 = (SingletonService<WebBeansContext>) mock(SingletonService.class, new ViolatedAssumptionAnswer());
      WebBeansFinder.setSingletonService(singletonService0);
      meecrowaveBus0.getOutFaultInterceptors();
      meecrowaveBus0.getInFaultInterceptors();
      meecrowaveBus0.getInInterceptors();
      meecrowaveBus0.getInInterceptors();
      Class<StaxTransformFeature> class0 = StaxTransformFeature.class;
      meecrowaveBus0.setExtension(staxTransformFeature0, class0);
      meecrowaveBus0.getId();
      meecrowaveBus0.getOutInterceptors();
      meecrowaveBus0.getOutFaultInterceptors();
      meecrowaveBus0.getOutInterceptors();
      meecrowaveBus0.getId();
      meecrowaveBus0.getOutInterceptors();
      meecrowaveBus0.getOutFaultInterceptors();
      Class<StaxTransformFeature> class1 = StaxTransformFeature.class;
      meecrowaveBus0.getOutFaultInterceptors();
      meecrowaveBus0.getInFaultInterceptors();
      meecrowaveBus0.getExtension((Class<LinkedList<LinkedList>>) class1);
      meecrowaveBus0.getProperty("");
      meecrowaveBus0.getProperty("cxf5");
      SingletonService<WebBeansContext> singletonService1 = (SingletonService<WebBeansContext>) mock(SingletonService.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        WebBeansFinder.setSingletonService(singletonService1);
        fail("Expecting exception: WebBeansConfigurationException");
      
      } catch(WebBeansConfigurationException e) {
         //
         // Already using another custom SingletonService!
         //
         verifyException("org.apache.webbeans.config.WebBeansFinder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      Class<StaxTransformFeature> class0 = StaxTransformFeature.class;
      meecrowaveBus0.getExtension(class0);
      meecrowaveBus0.getInInterceptors();
      meecrowaveBus0.setProperty(" \"_x)oLfJ\"", (Object) null);
      meecrowaveBus0.hasExtensionByName("");
      Object object0 = meecrowaveBus0.getProperty("");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      meecrowaveBus0.getInFaultInterceptors();
      meecrowaveBus0.getOutInterceptors();
      meecrowaveBus0.getOutInterceptors();
      meecrowaveBus0.getInFaultInterceptors();
      meecrowaveBus0.getOutInterceptors();
      Map<String, Object> map0 = meecrowaveBus0.getProperties();
      meecrowaveBus0.setProperties(map0);
      meecrowaveBus0.setId("");
      meecrowaveBus0.getOutFaultInterceptors();
      meecrowaveBus0.getInFaultInterceptors();
      meecrowaveBus0.getOutInterceptors();
      String string0 = null;
      Object object0 = null;
      meecrowaveBus0.getOutInterceptors();
      // Undeclared exception!
      try { 
        meecrowaveBus0.setProperty((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      meecrowaveBus0.getInFaultInterceptors();
      meecrowaveBus0.getOutInterceptors();
      meecrowaveBus0.getInFaultInterceptors();
      meecrowaveBus0.getOutInterceptors();
      meecrowaveBus0.getOutInterceptors();
      meecrowaveBus0.getProperties();
      meecrowaveBus0.getProperties();
      meecrowaveBus0.getOutInterceptors();
      SingletonService<WebBeansContext> singletonService0 = (SingletonService<WebBeansContext>) mock(SingletonService.class, new ViolatedAssumptionAnswer());
      WebBeansFinder.setSingletonService(singletonService0);
      String string0 = "mYJ\"hVUwKr M";
      meecrowaveBus0.setId("mYJ\"hVUwKr M");
      meecrowaveBus0.getOutFaultInterceptors();
      meecrowaveBus0.getInFaultInterceptors();
      meecrowaveBus0.getProperty("mYJ\"hVUwKr M");
      Class<StaxTransformFeature> class0 = StaxTransformFeature.class;
      meecrowaveBus0.getExtension(class0);
      // Undeclared exception!
      try { 
        meecrowaveBus0.getRealClass((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.meecrowave.cxf.MeecrowaveBus", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      Class<Message> class0 = Message.class;
      meecrowaveBus0.getExtension(class0);
      // Undeclared exception!
      try { 
        meecrowaveBus0.getRealClass((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.meecrowave.cxf.MeecrowaveBus", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      SingletonService<WebBeansContext> singletonService0 = (SingletonService<WebBeansContext>) mock(SingletonService.class, new ViolatedAssumptionAnswer());
      WebBeansFinder.setSingletonService(singletonService0);
      StaxTransformFeature staxTransformFeature0 = mock(StaxTransformFeature.class, new ViolatedAssumptionAnswer());
      Class<StaxTransformFeature> class0 = StaxTransformFeature.class;
      meecrowaveBus0.setExtension(staxTransformFeature0, class0);
      MeecrowaveBus meecrowaveBus1 = new MeecrowaveBus();
      meecrowaveBus0.getInFaultInterceptors();
      meecrowaveBus1.getExtension(class0);
      // Undeclared exception!
      try { 
        meecrowaveBus0.getRealClass((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.meecrowave.cxf.MeecrowaveBus", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      Collection<Feature> collection0 = meecrowaveBus0.getFeatures();
      Collection<Feature> collection1 = meecrowaveBus0.getFeatures();
      assertSame(collection1, collection0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      List<Interceptor<? extends Message>> list0 = meecrowaveBus0.getOutFaultInterceptors();
      assertTrue(list0.isEmpty());
      
      meecrowaveBus0.getOutInterceptors();
      meecrowaveBus0.getInFaultInterceptors();
      Map<String, Object> map0 = meecrowaveBus0.getProperties();
      meecrowaveBus0.setProperties(map0);
      assertEquals("cxf5", meecrowaveBus0.getId());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      meecrowaveBus0.getOutInterceptors();
      meecrowaveBus0.getInFaultInterceptors();
      Map<String, Object> map0 = meecrowaveBus0.getProperties();
      meecrowaveBus0.setProperties(map0);
      assertEquals("cxf5", meecrowaveBus0.getId());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      // Undeclared exception!
      try { 
        meecrowaveBus0.hasExtensionByName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.cxf.bus.extension.ExtensionManagerBus", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      boolean boolean0 = meecrowaveBus0.hasExtensionByName("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      meecrowaveBus0.getInFaultInterceptors();
      meecrowaveBus0.getInFaultInterceptors();
      meecrowaveBus0.getInInterceptors();
      String string0 = null;
      SingletonService<WebBeansContext> singletonService0 = (SingletonService<WebBeansContext>) mock(SingletonService.class, new ViolatedAssumptionAnswer());
      WebBeansFinder.setSingletonService(singletonService0);
      meecrowaveBus0.getInFaultInterceptors();
      // Undeclared exception!
      try { 
        meecrowaveBus0.hasExtensionByName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.cxf.bus.extension.ExtensionManagerBus", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      meecrowaveBus0.getInInterceptors();
      meecrowaveBus0.getOutFaultInterceptors();
      StaxTransformFeature staxTransformFeature0 = mock(StaxTransformFeature.class, new ViolatedAssumptionAnswer());
      Class<StaxTransformFeature> class0 = StaxTransformFeature.class;
      meecrowaveBus0.setExtension(staxTransformFeature0, class0);
      assertEquals("cxf5", meecrowaveBus0.getId());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ServletContext servletContext0 = mock(ServletContext.class, new ViolatedAssumptionAnswer());
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      StaxTransformFeature staxTransformFeature0 = mock(StaxTransformFeature.class, new ViolatedAssumptionAnswer());
      Class<StaxTransformFeature> class0 = StaxTransformFeature.class;
      meecrowaveBus0.setExtension(staxTransformFeature0, class0);
      assertEquals(Bus.BusState.INITIAL, meecrowaveBus0.getState());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      String string0 = meecrowaveBus0.getId();
      assertEquals("cxf5", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      meecrowaveBus0.getInInterceptors();
      meecrowaveBus0.getId();
      StaxTransformFeature staxTransformFeature0 = mock(StaxTransformFeature.class, new ViolatedAssumptionAnswer());
      meecrowaveBus0.getInFaultInterceptors();
      String string0 = "schema-validation-type";
      meecrowaveBus0.getProperty("schema-validation-type");
      // Undeclared exception!
      try { 
        meecrowaveBus0.getRealClass((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.meecrowave.cxf.MeecrowaveBus", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = null;
      try {
        meecrowaveBus0 = new MeecrowaveBus((ServletContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.meecrowave.cxf.MeecrowaveBus", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ServletContext servletContext0 = mock(ServletContext.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(servletContext0).getAttribute(anyString());
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus(servletContext0);
      String string0 = "SK7*8!%n9";
      Object object0 = meecrowaveBus0.getProperty(string0);
      meecrowaveBus0.getInFaultInterceptors();
      // Undeclared exception!
      try { 
        meecrowaveBus0.getRealClass(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.meecrowave.cxf.MeecrowaveBus", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      // Undeclared exception!
      try { 
        meecrowaveBus0.getProperty((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      meecrowaveBus0.getProperty("detailMessage");
      // Undeclared exception!
      try { 
        meecrowaveBus0.getRealClass((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.meecrowave.cxf.MeecrowaveBus", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      Object object0 = meecrowaveBus0.getProperty("");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MeecrowaveBus meecrowaveBus0 = new MeecrowaveBus();
      meecrowaveBus0.getInFaultInterceptors();
      StaxTransformFeature staxTransformFeature0 = mock(StaxTransformFeature.class, new ViolatedAssumptionAnswer());
      Class<StaxTransformFeature> class0 = StaxTransformFeature.class;
      meecrowaveBus0.getProperty(" cannot be found");
      // Undeclared exception!
      try { 
        meecrowaveBus0.getRealClass((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.meecrowave.cxf.MeecrowaveBus", e);
      }
  }
}