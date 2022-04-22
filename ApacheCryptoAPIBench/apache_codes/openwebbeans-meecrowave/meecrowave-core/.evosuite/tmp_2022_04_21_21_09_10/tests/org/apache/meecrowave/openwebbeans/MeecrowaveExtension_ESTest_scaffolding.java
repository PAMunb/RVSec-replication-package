/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 21:14:04 GMT 2022
 */

package org.apache.meecrowave.openwebbeans;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MeecrowaveExtension_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.meecrowave.openwebbeans.MeecrowaveExtension"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MeecrowaveExtension_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.webbeans.portable.events.generics.GProcessObserverMethod",
      "org.apache.webbeans.portable.events.ProcessInjectionPointImpl",
      "org.apache.webbeans.xml.DefaultBeanArchiveService",
      "org.apache.webbeans.exception.helper.DescriptiveException",
      "org.apache.webbeans.portable.events.generics.GProcessInjectionTarget",
      "org.apache.webbeans.conversation.ConversationManager",
      "org.apache.webbeans.inject.AlternativesManager",
      "org.apache.webbeans.decorator.DecoratorsManager",
      "org.apache.webbeans.portable.events.ProcessManagedBeanImpl",
      "org.apache.webbeans.portable.events.generics.GProcessBean",
      "org.apache.webbeans.proxy.NormalScopeProxyFactory",
      "org.apache.webbeans.event.ObserverMethodImpl",
      "org.apache.webbeans.event.NotificationManager$CloseableExecutor",
      "org.apache.webbeans.inject.impl.InjectionPointFactory",
      "org.apache.webbeans.portable.events.ProcessSessionBeanImpl",
      "org.apache.webbeans.util.CollectionUtil",
      "org.apache.webbeans.component.EventBean$2",
      "org.apache.webbeans.portable.LazyInterceptorDefinedInjectionTarget",
      "org.apache.webbeans.component.EventBean$1",
      "org.apache.webbeans.portable.events.generics.GProcessSyntheticAnnotatedType",
      "org.apache.webbeans.service.DefaultLoaderService",
      "org.apache.webbeans.proxy.InterceptorDecoratorProxyFactory",
      "org.apache.webbeans.logger.JULLoggerFactory",
      "org.apache.webbeans.exception.DuplicateDefinitionException",
      "org.apache.webbeans.portable.AbstractAnnotated",
      "org.apache.webbeans.event.NotificationManager",
      "org.apache.webbeans.spi.BeanArchiveService",
      "org.apache.webbeans.container.SerializableBeanVault",
      "org.apache.webbeans.container.BeanManagerImpl",
      "org.apache.webbeans.container.InjectionResolver",
      "org.apache.webbeans.config.WebBeansContext",
      "org.apache.webbeans.portable.events.ProcessProducerMethodImpl",
      "org.apache.webbeans.spi.SingletonService",
      "org.apache.webbeans.config.OpenWebBeansConfiguration",
      "org.apache.webbeans.portable.events.ProcessInjectionTargetImpl",
      "org.apache.webbeans.deployment.stereotype.IStereoTypeModel",
      "org.apache.webbeans.util.Asserts",
      "org.apache.webbeans.portable.events.ExtensionLoader",
      "org.apache.webbeans.container.AnnotatedTypeWrapper",
      "org.apache.webbeans.intercept.InterceptorsManager",
      "org.apache.webbeans.portable.events.generics.GenericProducerObserverEvent",
      "org.apache.webbeans.annotation.EmptyAnnotationLiteral",
      "org.apache.webbeans.spi.ApplicationBoundaryService",
      "org.apache.webbeans.util.ArrayUtil",
      "org.apache.meecrowave.openwebbeans.MeecrowaveExtension",
      "org.apache.webbeans.portable.events.ProcessProducerFieldImpl",
      "org.apache.webbeans.component.OwbBean",
      "org.apache.webbeans.portable.events.generics.GProcessAnnotatedType",
      "org.apache.webbeans.component.BeanAttributesImpl",
      "org.apache.webbeans.proxy.AbstractProxyFactory$2",
      "org.apache.meecrowave.cxf.MeecrowaveBus",
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
      "org.apache.webbeans.component.InterceptedMarker",
      "org.apache.webbeans.component.third.ThirdpartyBeanImpl",
      "org.apache.webbeans.exception.ProxyGenerationException",
      "org.apache.webbeans.spi.ConversationService",
      "org.apache.webbeans.util.AnnotationUtil",
      "org.apache.webbeans.config.PropertyLoader",
      "org.apache.webbeans.component.BuiltInOwbBean",
      "org.apache.webbeans.config.WebBeansFinder",
      "org.apache.webbeans.portable.events.generics.GProcessInjectionPoint",
      "org.apache.cxf.interceptor.InterceptorProvider",
      "org.apache.webbeans.portable.events.ProcessProducerImpl",
      "org.apache.webbeans.portable.events.ProcessBeanAttributesImpl",
      "org.apache.webbeans.portable.events.generics.GProcessSyntheticObserverMethod",
      "org.apache.webbeans.component.third.PassivationCapableThirdpartyBeanImpl",
      "org.apache.webbeans.config.OpenWebBeansConfiguration$1",
      "org.apache.webbeans.portable.InstanceProducer",
      "org.apache.webbeans.component.InstanceBean",
      "org.apache.webbeans.deployment.StereoTypeManager",
      "org.apache.webbeans.portable.events.generics.GProcessSyntheticBean",
      "org.apache.webbeans.portable.events.ProcessAnnotatedTypeImpl",
      "org.apache.webbeans.portable.events.generics.GProcessProducerField",
      "org.apache.webbeans.component.third.ThirdpartyBeanAttributesImpl",
      "org.apache.webbeans.portable.InjectionTargetImpl",
      "org.apache.webbeans.container.InjectableBeanManager",
      "org.apache.webbeans.component.SimpleProducerFactory",
      "org.apache.webbeans.container.BeanManagerImpl$LifecycleState",
      "org.apache.webbeans.portable.events.discovery.ExtensionAware",
      "org.apache.webbeans.portable.events.ProcessBeanImpl",
      "org.apache.webbeans.conversation.ConversationStorageBean",
      "org.apache.webbeans.portable.events.generics.TwoParametersGenericBeanEvent",
      "org.apache.webbeans.portable.events.generics.GProcessSessionBean",
      "org.apache.webbeans.configurator.AnnotatedTypeConfiguratorImpl",
      "org.apache.webbeans.portable.AbstractProducer",
      "org.apache.webbeans.util.ClassUtil",
      "org.apache.webbeans.portable.events.ProcessSyntheticAnnotatedTypeImpl",
      "org.apache.webbeans.proxy.AbstractProxyFactory$VersionVisitor",
      "org.apache.webbeans.util.WebBeansUtil",
      "org.apache.webbeans.component.ManagedBean",
      "org.apache.webbeans.corespi.security.SimpleSecurityService",
      "org.apache.webbeans.event.ContainerEventObserverMethodImpl",
      "org.apache.webbeans.context.creational.WrappedCreationalContext",
      "org.apache.webbeans.config.DeploymentValidationService",
      "org.apache.webbeans.portable.events.generics.GProcessProducer",
      "org.apache.webbeans.plugins.PluginLoader",
      "org.apache.webbeans.portable.AnnotatedTypeImpl",
      "org.apache.webbeans.proxy.SubclassProxyFactory",
      "org.apache.webbeans.proxy.AbstractProxyFactory",
      "org.apache.meecrowave.openwebbeans.MeecrowaveSecurityService",
      "org.apache.xbean.asm6.shade.commons.EmptyVisitor",
      "org.apache.webbeans.spi.SecurityService",
      "org.apache.webbeans.portable.events.EventBase",
      "org.apache.webbeans.intercept.InterceptorResolutionService",
      "org.apache.xbean.asm6.ClassVisitor",
      "org.apache.cxf.Bus",
      "org.apache.webbeans.portable.EventProducer",
      "org.apache.webbeans.spi.ScannerService",
      "org.apache.webbeans.spi.LoaderService",
      "org.apache.webbeans.proxy.InterceptorHandler",
      "org.apache.webbeans.util.PriorityClasses",
      "org.apache.webbeans.portable.events.generics.GProcessBeanAttributes",
      "org.apache.webbeans.exception.WebBeansException",
      "org.apache.webbeans.corespi.se.DefaultApplicationBoundaryService",
      "org.apache.webbeans.portable.events.generics.GProcessManagedBean",
      "org.apache.webbeans.annotation.AnyLiteral",
      "org.apache.webbeans.portable.events.discovery.ErrorStack",
      "org.apache.webbeans.logger.WebBeansLoggerFactory",
      "org.apache.webbeans.context.creational.CreationalContextImpl",
      "org.apache.webbeans.exception.WebBeansDeploymentException",
      "org.apache.webbeans.spi.ContextsService",
      "org.apache.webbeans.component.WebBeansType",
      "org.apache.webbeans.portable.events.discovery.BeforeBeanDiscoveryImpl",
      "org.apache.webbeans.component.ExtensionBean",
      "org.apache.webbeans.corespi.DefaultSingletonService",
      "org.apache.webbeans.portable.events.generics.GenericBeanEvent",
      "org.apache.webbeans.annotation.DefaultLiteral",
      "org.apache.webbeans.intercept.InterceptorUtil",
      "org.apache.webbeans.portable.events.ProcessObserverMethodImpl",
      "org.apache.webbeans.portable.AnnotatedElementFactory",
      "org.apache.webbeans.component.AbstractOwbBean",
      "org.apache.webbeans.logger.WebBeansLoggerFacade",
      "org.apache.webbeans.portable.events.generics.GProcessProducerMethod",
      "org.apache.webbeans.event.NotificationManager$CDICompletionFuture",
      "org.apache.webbeans.spi.BeanArchiveService$BeanArchiveInformation",
      "org.apache.webbeans.component.InstanceBean$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MeecrowaveExtension_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.meecrowave.openwebbeans.MeecrowaveExtension",
      "org.apache.webbeans.container.AnnotatedTypeWrapper",
      "org.apache.meecrowave.openwebbeans.MeecrowaveExtension$JAXRSFIeldInjectionAT",
      "org.apache.webbeans.annotation.EmptyAnnotationLiteral",
      "org.apache.meecrowave.cxf.JAXRSFieldInjectionInterceptor$Binding$1",
      "org.apache.meecrowave.cxf.JAXRSFieldInjectionInterceptor$Binding",
      "org.apache.webbeans.logger.JULLoggerFactory",
      "org.apache.webbeans.logger.WebBeansLoggerFacade",
      "org.apache.webbeans.config.WebBeansContext",
      "org.apache.webbeans.corespi.DefaultSingletonService",
      "org.apache.webbeans.config.WebBeansFinder",
      "org.apache.webbeans.util.WebBeansUtil",
      "org.apache.webbeans.config.OpenWebBeansConfiguration",
      "org.apache.webbeans.config.PropertyLoader",
      "org.apache.webbeans.config.OpenWebBeansConfiguration$1",
      "org.apache.webbeans.component.BeanAttributesImpl",
      "org.apache.webbeans.component.AbstractOwbBean",
      "org.apache.webbeans.component.BuiltInOwbBean",
      "org.apache.webbeans.component.InstanceBean",
      "org.apache.webbeans.util.CollectionUtil",
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
      "org.apache.webbeans.portable.events.EventBase",
      "org.apache.webbeans.portable.events.discovery.BeforeBeanDiscoveryImpl",
      "org.apache.webbeans.container.InjectableBeanManager",
      "org.apache.webbeans.portable.AbstractAnnotated",
      "org.apache.webbeans.portable.AnnotatedTypeImpl",
      "org.apache.webbeans.portable.events.discovery.AfterBeanDiscoveryImpl",
      "org.apache.webbeans.portable.events.ProcessAnnotatedTypeImpl",
      "org.apache.webbeans.portable.events.ProcessSyntheticAnnotatedTypeImpl",
      "org.apache.webbeans.configurator.AnnotatedTypeConfiguratorImpl",
      "org.apache.webbeans.configurator.BeanConfiguratorImpl",
      "org.apache.webbeans.configurator.BeanConfiguratorImpl$ConstructedBean",
      "org.apache.webbeans.exception.WebBeansConfigurationException",
      "org.apache.webbeans.corespi.scanner.AbstractMetaDataDiscovery",
      "org.apache.webbeans.web.scanner.WebScannerService",
      "org.apache.meecrowave.openwebbeans.OWBTomcatWebScannerService",
      "org.apache.meecrowave.logging.tomcat.LogFacade",
      "org.apache.meecrowave.logging.tomcat.JULLog",
      "org.apache.webbeans.web.context.WebConversationService",
      "org.apache.webbeans.util.GenericsUtil",
      "org.apache.webbeans.config.OwbParametrizedTypeImpl",
      "org.apache.webbeans.portable.AnnotatedTypeImpl$State",
      "org.apache.webbeans.portable.AbstractAnnotatedMember",
      "org.apache.webbeans.portable.AbstractAnnotatedCallable",
      "org.apache.webbeans.portable.AnnotatedConstructorImpl",
      "org.apache.webbeans.portable.AnnotatedFieldImpl",
      "org.apache.webbeans.portable.AnnotatedMethodImpl",
      "org.apache.webbeans.config.OwbWildcardTypeImpl",
      "org.apache.webbeans.portable.AnnotatedParameterImpl",
      "org.apache.webbeans.configurator.AnnotatedConstructorConfiguratorImpl",
      "org.apache.webbeans.configurator.AnnotatedMethodConfiguratorImpl",
      "org.apache.webbeans.configurator.AnnotatedParameterConfiguratorImpl",
      "org.apache.webbeans.configurator.AnnotatedFieldConfiguratorImpl",
      "org.apache.webbeans.container.InjectionTargetFactoryImpl",
      "org.apache.webbeans.container.InterceptorInjectionTargetFactory",
      "org.apache.webbeans.config.OwbGenericArrayTypeImpl",
      "org.apache.webbeans.portable.events.discovery.AnnotatedTypeConfiguratorHolder",
      "org.apache.webbeans.container.ExternalScope",
      "org.apache.webbeans.config.DefaultAnnotation",
      "org.apache.juli.logging.LogFactory",
      "org.apache.tomcat.util.res.StringManager",
      "org.apache.tomcat.util.res.StringManager$1",
      "org.apache.catalina.util.LifecycleBase",
      "org.apache.catalina.util.LifecycleMBeanBase",
      "org.apache.catalina.core.ContainerBase",
      "org.apache.catalina.core.StandardContext$1",
      "org.apache.catalina.core.StandardContext",
      "org.apache.catalina.LifecycleState",
      "org.apache.catalina.core.StandardPipeline",
      "org.apache.catalina.core.StandardContext$ContextFilterMaps",
      "org.apache.catalina.Globals",
      "org.apache.catalina.valves.ValveBase",
      "org.apache.catalina.core.StandardContextValve",
      "org.apache.catalina.core.ApplicationContext",
      "org.apache.catalina.core.ApplicationContextFacade",
      "org.apache.cxf.common.logging.JDKBugHacks",
      "org.apache.cxf.common.logging.JDKBugHacks$1",
      "org.apache.cxf.common.util.StringUtils",
      "org.apache.cxf.common.classloader.ClassLoaderUtils",
      "org.apache.cxf.common.classloader.ClassLoaderUtils$1",
      "org.apache.cxf.common.classloader.ClassLoaderUtils$ClassLoaderHolder",
      "org.apache.cxf.common.logging.JDKBugHacks$2",
      "org.apache.cxf.common.logging.LogUtils$1",
      "org.apache.cxf.common.logging.AbstractDelegatingLogger",
      "org.apache.cxf.common.logging.Slf4jLogger",
      "org.apache.cxf.common.logging.LogUtils$3",
      "org.apache.cxf.common.logging.LogUtils$4",
      "org.apache.cxf.common.logging.LogUtils$2",
      "org.apache.cxf.common.i18n.BundleUtils",
      "org.apache.cxf.common.util.PackageUtils",
      "org.apache.cxf.common.i18n.BundleUtils$2",
      "org.apache.cxf.common.i18n.BundleUtils$1",
      "org.apache.cxf.common.logging.LogUtils",
      "org.apache.cxf.transport.servlet.AbstractHTTPServlet",
      "org.apache.cxf.transport.servlet.CXFNonSpringServlet",
      "org.apache.cxf.cdi.CXFCdiServlet",
      "org.apache.catalina.core.StandardWrapper",
      "org.apache.catalina.startup.Tomcat$ExistingStandardWrapper",
      "org.apache.catalina.core.StandardWrapperFacade",
      "org.apache.catalina.core.StandardWrapperValve",
      "org.apache.meecrowave.cxf.MeecrowaveBus",
      "org.apache.cxf.interceptor.AbstractBasicInterceptorProvider",
      "org.apache.cxf.bus.extension.ExtensionManagerBus",
      "org.apache.cxf.common.util.ModCountCopyOnWriteArrayList",
      "org.apache.cxf.Bus$BusState",
      "org.apache.cxf.BusFactory",
      "org.apache.cxf.BusFactory$BusHolder",
      "org.apache.cxf.configuration.NullConfigurer",
      "org.apache.cxf.common.util.SystemPropertyAction",
      "org.apache.cxf.resource.DefaultResourceManager",
      "org.apache.cxf.resource.ClasspathResolver",
      "org.apache.cxf.resource.ClassLoaderResolver",
      "org.apache.cxf.resource.PropertiesResolver",
      "org.apache.cxf.resource.SinglePropertyResolver",
      "org.apache.cxf.resource.ObjectTypeResolver",
      "org.apache.cxf.bus.extension.ExtensionManagerBus$1",
      "org.apache.cxf.bus.extension.ExtensionManagerImpl",
      "org.apache.cxf.bus.extension.ExtensionRegistry",
      "org.apache.cxf.bus.managers.DestinationFactoryManagerImpl",
      "org.apache.cxf.bus.managers.ConduitInitiatorManagerImpl",
      "org.apache.cxf.bus.managers.BindingFactoryManagerImpl",
      "org.apache.cxf.bus.extension.ExtensionManagerImpl$1",
      "org.apache.cxf.bus.extension.TextExtensionFragmentParser",
      "org.apache.cxf.bus.extension.Extension",
      "org.apache.webbeans.context.AbstractContextsService",
      "org.apache.webbeans.web.context.WebContextsService",
      "org.apache.webbeans.context.AbstractContext",
      "org.apache.webbeans.context.ApplicationContext",
      "org.apache.webbeans.context.DependentContext",
      "org.apache.webbeans.component.WebBeansType"
    );
  }
}
