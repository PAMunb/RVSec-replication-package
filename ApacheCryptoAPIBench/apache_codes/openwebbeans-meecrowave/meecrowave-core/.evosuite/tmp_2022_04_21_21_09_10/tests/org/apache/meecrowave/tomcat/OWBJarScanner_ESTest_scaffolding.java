/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 21:11:08 GMT 2022
 */

package org.apache.meecrowave.tomcat;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class OWBJarScanner_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.meecrowave.tomcat.OWBJarScanner"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/openwebbeans-meecrowave/meecrowave-core"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(OWBJarScanner_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.webbeans.portable.events.generics.GProcessObserverMethod",
      "org.apache.webbeans.portable.events.ProcessInjectionPointImpl",
      "org.apache.webbeans.xml.DefaultBeanArchiveService",
      "org.apache.webbeans.exception.helper.DescriptiveException",
      "org.apache.webbeans.portable.events.generics.GProcessInjectionTarget",
      "org.apache.webbeans.inject.AlternativesManager",
      "org.apache.webbeans.conversation.ConversationManager",
      "org.apache.xbean.finder.AnnotationFinder",
      "org.apache.webbeans.decorator.DecoratorsManager",
      "org.apache.webbeans.portable.events.ProcessManagedBeanImpl",
      "org.apache.webbeans.portable.events.generics.GProcessBean",
      "org.apache.webbeans.proxy.NormalScopeProxyFactory",
      "org.apache.webbeans.event.ObserverMethodImpl",
      "org.apache.webbeans.event.NotificationManager$CloseableExecutor",
      "org.apache.webbeans.portable.events.ProcessSessionBeanImpl",
      "org.apache.webbeans.inject.impl.InjectionPointFactory",
      "org.apache.webbeans.util.CollectionUtil",
      "org.apache.webbeans.component.EventBean$2",
      "org.apache.webbeans.portable.LazyInterceptorDefinedInjectionTarget",
      "org.apache.webbeans.component.EventBean$1",
      "org.apache.webbeans.portable.events.generics.GProcessSyntheticAnnotatedType",
      "org.apache.webbeans.service.DefaultLoaderService",
      "org.apache.webbeans.proxy.InterceptorDecoratorProxyFactory",
      "org.apache.webbeans.logger.JULLoggerFactory",
      "org.apache.webbeans.exception.DuplicateDefinitionException",
      "org.apache.webbeans.event.NotificationManager",
      "org.apache.webbeans.spi.BeanArchiveService",
      "org.apache.meecrowave.logging.tomcat.JULLog",
      "org.apache.tomcat.JarScannerCallback",
      "org.apache.webbeans.container.SerializableBeanVault",
      "org.apache.webbeans.container.BeanManagerImpl",
      "org.apache.meecrowave.tomcat.OWBJarScanner$1",
      "org.apache.webbeans.container.InjectionResolver",
      "org.apache.webbeans.config.WebBeansContext",
      "org.apache.webbeans.portable.events.ProcessProducerMethodImpl",
      "org.apache.webbeans.spi.SingletonService",
      "org.apache.tomcat.JarScanFilter",
      "org.apache.webbeans.config.OpenWebBeansConfiguration",
      "org.apache.webbeans.portable.events.ProcessInjectionTargetImpl",
      "org.apache.webbeans.util.Asserts",
      "org.apache.meecrowave.openwebbeans.OWBTomcatWebScannerService",
      "org.apache.webbeans.portable.events.ExtensionLoader",
      "org.apache.webbeans.portable.events.generics.GenericProducerObserverEvent",
      "org.apache.webbeans.intercept.InterceptorsManager",
      "org.apache.webbeans.annotation.EmptyAnnotationLiteral",
      "org.apache.webbeans.util.ArrayUtil",
      "org.apache.webbeans.spi.ApplicationBoundaryService",
      "org.apache.webbeans.portable.events.ProcessProducerFieldImpl",
      "org.apache.webbeans.component.OwbBean",
      "org.apache.webbeans.portable.events.generics.GProcessAnnotatedType",
      "org.apache.webbeans.component.BeanAttributesImpl",
      "org.apache.webbeans.proxy.AbstractProxyFactory$2",
      "org.apache.webbeans.proxy.AbstractProxyFactory$1",
      "org.apache.webbeans.proxy.AbstractProxyFactory$4",
      "org.apache.webbeans.proxy.AbstractProxyFactory$3",
      "org.apache.webbeans.event.OwbObserverMethod",
      "org.apache.webbeans.context.creational.CreationalContextFactory",
      "org.apache.webbeans.component.EventBean",
      "org.apache.webbeans.annotation.AnnotationManager",
      "org.apache.webbeans.exception.WebBeansConfigurationException",
      "org.apache.webbeans.util.UrlSet",
      "org.apache.webbeans.component.InjectionTargetBean",
      "org.apache.meecrowave.logging.tomcat.LogFacade",
      "org.apache.webbeans.component.InterceptedMarker",
      "org.apache.webbeans.component.third.ThirdpartyBeanImpl",
      "org.apache.webbeans.exception.ProxyGenerationException",
      "org.apache.webbeans.util.AnnotationUtil",
      "org.apache.tomcat.JarScanType",
      "org.apache.webbeans.config.PropertyLoader",
      "org.apache.webbeans.component.BuiltInOwbBean",
      "org.apache.webbeans.config.WebBeansFinder",
      "org.apache.webbeans.portable.events.generics.GProcessInjectionPoint",
      "org.apache.webbeans.portable.events.ProcessProducerImpl",
      "org.apache.webbeans.portable.events.ProcessBeanAttributesImpl",
      "org.apache.webbeans.portable.events.generics.GProcessSyntheticObserverMethod",
      "org.apache.webbeans.component.third.PassivationCapableThirdpartyBeanImpl",
      "org.apache.webbeans.config.OpenWebBeansConfiguration$1",
      "org.apache.webbeans.portable.InstanceProducer",
      "org.apache.webbeans.component.InstanceBean",
      "org.apache.webbeans.deployment.StereoTypeManager",
      "org.apache.webbeans.portable.events.generics.GProcessSyntheticBean",
      "org.apache.webbeans.spi.BdaScannerService",
      "org.apache.webbeans.portable.events.ProcessAnnotatedTypeImpl",
      "org.apache.webbeans.portable.events.generics.GProcessProducerField",
      "org.apache.webbeans.component.third.ThirdpartyBeanAttributesImpl",
      "org.apache.webbeans.portable.InjectionTargetImpl",
      "org.apache.meecrowave.tomcat.OWBJarScanner",
      "org.apache.webbeans.component.SimpleProducerFactory",
      "org.apache.webbeans.container.BeanManagerImpl$LifecycleState",
      "org.apache.webbeans.portable.events.ProcessBeanImpl",
      "org.apache.webbeans.portable.events.discovery.ExtensionAware",
      "org.apache.webbeans.conversation.ConversationStorageBean",
      "org.apache.webbeans.portable.events.generics.TwoParametersGenericBeanEvent",
      "org.apache.webbeans.portable.events.generics.GProcessSessionBean",
      "org.apache.xbean.finder.IAnnotationFinder",
      "org.apache.webbeans.portable.AbstractProducer",
      "org.apache.webbeans.util.ClassUtil",
      "org.apache.webbeans.portable.events.ProcessSyntheticAnnotatedTypeImpl",
      "org.apache.webbeans.proxy.AbstractProxyFactory$VersionVisitor",
      "org.apache.webbeans.corespi.scanner.AbstractMetaDataDiscovery",
      "org.apache.webbeans.web.scanner.WebScannerService",
      "org.apache.webbeans.util.WebBeansUtil",
      "org.apache.webbeans.component.ManagedBean",
      "org.apache.webbeans.corespi.security.SimpleSecurityService",
      "org.apache.webbeans.event.ContainerEventObserverMethodImpl",
      "org.apache.webbeans.context.creational.WrappedCreationalContext",
      "org.apache.webbeans.config.DeploymentValidationService",
      "org.apache.webbeans.portable.events.generics.GProcessProducer",
      "org.apache.webbeans.plugins.PluginLoader",
      "org.apache.webbeans.proxy.SubclassProxyFactory",
      "org.apache.webbeans.proxy.AbstractProxyFactory",
      "org.apache.meecrowave.openwebbeans.MeecrowaveSecurityService",
      "org.apache.xbean.asm6.shade.commons.EmptyVisitor",
      "org.apache.webbeans.spi.SecurityService",
      "org.apache.webbeans.portable.events.EventBase",
      "org.apache.webbeans.intercept.InterceptorResolutionService",
      "org.apache.webbeans.corespi.scanner.xbean.CdiArchive",
      "org.apache.xbean.asm6.ClassVisitor",
      "org.apache.webbeans.portable.EventProducer",
      "org.apache.webbeans.spi.ScannerService",
      "org.apache.webbeans.proxy.InterceptorHandler",
      "org.apache.webbeans.spi.LoaderService",
      "org.apache.webbeans.util.PriorityClasses",
      "org.apache.webbeans.corespi.scanner.xbean.OwbAnnotationFinder",
      "org.apache.webbeans.portable.events.generics.GProcessBeanAttributes",
      "org.apache.webbeans.exception.WebBeansException",
      "org.apache.webbeans.corespi.se.DefaultApplicationBoundaryService",
      "org.apache.webbeans.portable.events.generics.GProcessManagedBean",
      "org.apache.webbeans.annotation.AnyLiteral",
      "org.apache.juli.logging.Log",
      "org.apache.tomcat.JarScanner",
      "org.apache.webbeans.portable.events.discovery.ErrorStack",
      "org.apache.webbeans.logger.WebBeansLoggerFactory",
      "org.apache.webbeans.context.creational.CreationalContextImpl",
      "org.apache.webbeans.exception.WebBeansDeploymentException",
      "org.apache.webbeans.component.WebBeansType",
      "org.apache.webbeans.corespi.DefaultSingletonService",
      "org.apache.webbeans.component.ExtensionBean",
      "org.apache.webbeans.portable.events.generics.GenericBeanEvent",
      "org.apache.webbeans.annotation.DefaultLiteral",
      "org.apache.openwebbeans.se.CDISeScannerService",
      "org.apache.webbeans.portable.events.ProcessObserverMethodImpl",
      "org.apache.webbeans.intercept.InterceptorUtil",
      "org.apache.tomcat.Jar",
      "org.apache.webbeans.portable.AnnotatedElementFactory",
      "org.apache.webbeans.component.AbstractOwbBean",
      "org.apache.webbeans.logger.WebBeansLoggerFacade",
      "org.apache.webbeans.portable.events.generics.GProcessProducerMethod",
      "org.apache.webbeans.event.NotificationManager$CDICompletionFuture",
      "org.apache.webbeans.spi.BeanArchiveService$BeanArchiveInformation",
      "org.apache.webbeans.component.InstanceBean$1",
      "org.apache.xbean.finder.archive.Archive"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("javax.servlet.ServletContext", false, OWBJarScanner_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.tomcat.JarScannerCallback", false, OWBJarScanner_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(OWBJarScanner_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.meecrowave.tomcat.OWBJarScanner",
      "org.apache.tomcat.JarScanType",
      "org.apache.meecrowave.tomcat.OWBJarScanner$1",
      "org.apache.webbeans.logger.JULLoggerFactory",
      "org.apache.webbeans.logger.WebBeansLoggerFacade",
      "org.apache.webbeans.corespi.DefaultSingletonService",
      "org.apache.webbeans.config.WebBeansFinder",
      "org.apache.tomcat.util.buf.UriUtil",
      "org.apache.webbeans.config.WebBeansContext",
      "org.apache.webbeans.util.WebBeansUtil",
      "org.apache.webbeans.config.OpenWebBeansConfiguration",
      "org.apache.webbeans.config.PropertyLoader",
      "org.apache.webbeans.config.OpenWebBeansConfiguration$1",
      "org.apache.webbeans.component.BeanAttributesImpl",
      "org.apache.webbeans.component.AbstractOwbBean",
      "org.apache.webbeans.component.BuiltInOwbBean",
      "org.apache.webbeans.component.InstanceBean",
      "org.apache.webbeans.component.WebBeansType",
      "org.apache.webbeans.util.CollectionUtil",
      "org.apache.webbeans.annotation.EmptyAnnotationLiteral",
      "org.apache.webbeans.annotation.DefaultLiteral",
      "org.apache.webbeans.annotation.AnyLiteral",
      "org.apache.webbeans.util.ArrayUtil",
      "org.apache.webbeans.util.AnnotationUtil",
      "org.apache.webbeans.component.InstanceBean$1",
      "org.apache.webbeans.component.SimpleProducerFactory",
      "org.apache.webbeans.portable.AbstractProducer",
      "org.apache.webbeans.portable.InstanceProducer",
      "org.apache.webbeans.util.Asserts",
      "org.apache.webbeans.component.EventBean",
      "org.apache.webbeans.component.EventBean$1",
      "org.apache.webbeans.component.EventBean$2",
      "org.apache.webbeans.portable.EventProducer",
      "org.apache.webbeans.inject.AlternativesManager",
      "org.apache.webbeans.util.PriorityClasses",
      "org.apache.webbeans.portable.AnnotatedElementFactory",
      "org.apache.webbeans.container.BeanManagerImpl",
      "org.apache.webbeans.portable.events.discovery.ErrorStack",
      "org.apache.webbeans.container.BeanManagerImpl$LifecycleState",
      "org.apache.webbeans.container.InjectionResolver",
      "org.apache.webbeans.context.creational.CreationalContextFactory",
      "org.apache.webbeans.decorator.DecoratorsManager",
      "org.apache.webbeans.portable.events.ExtensionLoader",
      "org.apache.webbeans.intercept.InterceptorsManager",
      "org.apache.webbeans.plugins.PluginLoader",
      "org.apache.webbeans.container.SerializableBeanVault",
      "org.apache.webbeans.deployment.StereoTypeManager",
      "org.apache.webbeans.inject.impl.InjectionPointFactory",
      "org.apache.webbeans.intercept.InterceptorUtil",
      "org.apache.webbeans.intercept.InterceptorResolutionService",
      "org.apache.webbeans.config.DeploymentValidationService",
      "org.apache.webbeans.annotation.AnnotationManager",
      "org.apache.webbeans.util.ClassUtil",
      "org.apache.webbeans.service.DefaultLoaderService",
      "org.apache.webbeans.corespi.security.SimpleSecurityService",
      "org.apache.meecrowave.openwebbeans.MeecrowaveSecurityService",
      "org.apache.webbeans.corespi.se.DefaultApplicationBoundaryService",
      "org.apache.webbeans.proxy.AbstractProxyFactory",
      "org.apache.webbeans.proxy.InterceptorDecoratorProxyFactory",
      "org.apache.webbeans.proxy.AbstractProxyFactory$1",
      "org.apache.webbeans.proxy.AbstractProxyFactory$2",
      "org.apache.webbeans.proxy.AbstractProxyFactory$3",
      "org.apache.webbeans.proxy.AbstractProxyFactory$4",
      "org.apache.webbeans.proxy.NormalScopeProxyFactory",
      "org.apache.webbeans.proxy.SubclassProxyFactory",
      "org.apache.webbeans.xml.DefaultBeanArchiveService",
      "org.apache.webbeans.util.UrlSet",
      "org.apache.webbeans.conversation.ConversationManager",
      "org.apache.webbeans.conversation.ConversationStorageBean",
      "org.apache.webbeans.component.third.ThirdpartyBeanImpl",
      "org.apache.webbeans.component.third.PassivationCapableThirdpartyBeanImpl",
      "org.apache.webbeans.component.third.ThirdpartyBeanAttributesImpl",
      "org.apache.webbeans.event.NotificationManager",
      "org.apache.webbeans.event.NotificationManager$CloseableExecutor",
      "org.apache.webbeans.corespi.scanner.AbstractMetaDataDiscovery",
      "org.apache.webbeans.web.scanner.WebScannerService",
      "org.apache.meecrowave.openwebbeans.OWBTomcatWebScannerService",
      "org.apache.meecrowave.logging.tomcat.LogFacade",
      "org.apache.meecrowave.logging.tomcat.JULLog",
      "org.apache.webbeans.exception.WebBeansConfigurationException",
      "org.apache.webbeans.exception.helper.ExceptionMessageBuilder"
    );
  }
}