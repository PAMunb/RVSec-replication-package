/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 21:13:23 GMT 2022
 */

package org.apache.meecrowave.openwebbeans;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class OWBTomcatWebScannerService_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.meecrowave.openwebbeans.OWBTomcatWebScannerService"; 
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
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.home", "/home/pedro"); 
    java.lang.System.setProperty("user.language", "en"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(OWBTomcatWebScannerService_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.webbeans.portable.events.generics.GProcessObserverMethod",
      "org.apache.webbeans.portable.events.ProcessInjectionPointImpl",
      "org.apache.webbeans.xml.DefaultBeanArchiveService",
      "org.apache.webbeans.exception.helper.DescriptiveException",
      "org.apache.webbeans.portable.events.generics.GProcessInjectionTarget",
      "org.apache.xbean.finder.AnnotationFinder",
      "org.apache.webbeans.inject.AlternativesManager",
      "org.apache.webbeans.conversation.ConversationManager",
      "org.apache.xbean.finder.archive.FilteredArchive",
      "org.apache.openwebbeans.se.CDISeScannerService$1",
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
      "org.apache.webbeans.xml.DefaultBeanArchiveInformation",
      "org.apache.webbeans.event.NotificationManager",
      "org.apache.xbean.finder.archive.CompositeArchive$CompositeIterator",
      "org.apache.webbeans.spi.BeanArchiveService",
      "org.apache.meecrowave.logging.tomcat.JULLog",
      "org.apache.webbeans.container.SerializableBeanVault",
      "org.apache.webbeans.container.BeanManagerImpl",
      "org.apache.webbeans.container.InjectionResolver",
      "org.apache.webbeans.config.WebBeansContext",
      "org.apache.webbeans.portable.events.ProcessProducerMethodImpl",
      "org.apache.webbeans.spi.SingletonService",
      "org.apache.tomcat.JarScanFilter",
      "org.apache.meecrowave.openwebbeans.KnowClassesFilter",
      "org.apache.webbeans.config.OpenWebBeansConfiguration",
      "org.apache.webbeans.portable.events.ProcessInjectionTargetImpl",
      "org.apache.webbeans.util.Asserts",
      "org.apache.meecrowave.openwebbeans.OWBTomcatWebScannerService",
      "org.apache.xbean.finder.archive.Archive$Entry",
      "org.apache.webbeans.portable.events.ExtensionLoader",
      "org.apache.webbeans.portable.events.generics.GenericProducerObserverEvent",
      "org.apache.webbeans.intercept.InterceptorsManager",
      "org.apache.webbeans.annotation.EmptyAnnotationLiteral",
      "org.apache.webbeans.util.ArrayUtil",
      "org.apache.webbeans.spi.ApplicationBoundaryService",
      "org.apache.webbeans.portable.events.ProcessProducerFieldImpl",
      "org.apache.xbean.finder.AnnotationFinder$ClassInfo",
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
      "org.apache.xbean.finder.AnnotationFinder$AnnotationInfo",
      "org.apache.webbeans.util.AnnotationUtil",
      "org.apache.tomcat.JarScanType",
      "org.apache.catalina.webresources.ClasspathURLStreamHandler",
      "org.apache.webbeans.config.PropertyLoader",
      "org.apache.xbean.finder.filter.Filter",
      "org.apache.webbeans.component.BuiltInOwbBean",
      "org.apache.webbeans.config.WebBeansFinder",
      "org.apache.webbeans.portable.events.generics.GProcessInjectionPoint",
      "org.apache.webbeans.portable.events.ProcessProducerImpl",
      "org.apache.webbeans.portable.events.ProcessBeanAttributesImpl",
      "org.apache.webbeans.portable.events.generics.GProcessSyntheticObserverMethod",
      "org.apache.webbeans.component.third.PassivationCapableThirdpartyBeanImpl",
      "org.apache.webbeans.corespi.scanner.xbean.CdiArchive$FoundClasses",
      "org.apache.webbeans.config.OpenWebBeansConfiguration$1",
      "org.apache.webbeans.portable.InstanceProducer",
      "org.apache.webbeans.component.InstanceBean",
      "org.apache.webbeans.deployment.StereoTypeManager",
      "org.apache.xbean.finder.AnnotationFinder$Info",
      "org.apache.webbeans.portable.events.generics.GProcessSyntheticBean",
      "org.apache.webbeans.spi.BdaScannerService",
      "org.apache.webbeans.portable.events.ProcessAnnotatedTypeImpl",
      "org.apache.xbean.finder.archive.ClasspathArchive",
      "org.apache.webbeans.exception.helper.ExceptionMessageBuilder",
      "org.apache.tomcat.util.res.StringManager$1",
      "org.apache.webbeans.portable.events.generics.GProcessProducerField",
      "org.apache.webbeans.component.third.ThirdpartyBeanAttributesImpl",
      "org.apache.webbeans.portable.InjectionTargetImpl",
      "org.apache.meecrowave.openwebbeans.KnowClassesFilter$OptimizedExclusionFilter",
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
      "org.apache.webbeans.spi.BDABeansXmlScanner",
      "org.apache.webbeans.corespi.security.SimpleSecurityService",
      "org.apache.webbeans.event.ContainerEventObserverMethodImpl",
      "org.apache.webbeans.context.creational.WrappedCreationalContext",
      "org.apache.webbeans.config.DeploymentValidationService",
      "org.apache.webbeans.portable.events.generics.GProcessProducer",
      "org.apache.webbeans.plugins.PluginLoader",
      "org.apache.webbeans.proxy.SubclassProxyFactory",
      "org.apache.webbeans.corespi.scanner.xbean.BeanArchiveFilter",
      "org.apache.webbeans.xml.WebBeansErrorHandler",
      "org.apache.webbeans.proxy.AbstractProxyFactory",
      "org.apache.meecrowave.openwebbeans.MeecrowaveSecurityService",
      "org.apache.xbean.asm6.shade.commons.EmptyVisitor",
      "org.apache.webbeans.spi.SecurityService",
      "org.apache.webbeans.portable.events.EventBase",
      "org.apache.webbeans.intercept.InterceptorResolutionService",
      "org.apache.webbeans.xml.ElementIterator",
      "org.apache.webbeans.corespi.scanner.xbean.CdiArchive",
      "org.apache.xbean.finder.ClassLoaders",
      "org.apache.xbean.asm6.ClassVisitor",
      "org.apache.webbeans.portable.EventProducer",
      "org.apache.webbeans.spi.ScannerService",
      "org.apache.webbeans.proxy.InterceptorHandler",
      "org.apache.webbeans.spi.LoaderService",
      "org.apache.webbeans.corespi.scanner.xbean.OwbAnnotationFinder",
      "org.apache.webbeans.util.PriorityClasses",
      "org.apache.webbeans.portable.events.generics.GProcessBeanAttributes",
      "org.apache.webbeans.exception.WebBeansException",
      "org.apache.webbeans.corespi.se.DefaultApplicationBoundaryService",
      "org.apache.xbean.finder.AnnotationFinder$Annotatable",
      "org.apache.webbeans.portable.events.generics.GProcessManagedBean",
      "org.apache.meecrowave.Meecrowave$Builder",
      "org.apache.webbeans.annotation.AnyLiteral",
      "org.apache.juli.logging.Log",
      "org.apache.xbean.finder.archive.MJarSupport",
      "org.apache.xbean.finder.archive.FileArchive",
      "org.apache.webbeans.portable.events.discovery.ErrorStack",
      "org.apache.webbeans.logger.WebBeansLoggerFactory",
      "org.apache.webbeans.context.creational.CreationalContextImpl",
      "org.apache.webbeans.exception.WebBeansDeploymentException",
      "org.apache.tomcat.util.scan.StandardJarScanFilter",
      "org.apache.webbeans.component.WebBeansType",
      "org.apache.tomcat.util.res.StringManager",
      "org.apache.webbeans.component.ExtensionBean",
      "org.apache.webbeans.corespi.DefaultSingletonService",
      "org.apache.webbeans.portable.events.generics.GenericBeanEvent",
      "org.apache.openwebbeans.se.CDISeScannerService",
      "org.apache.webbeans.annotation.DefaultLiteral",
      "org.apache.webbeans.portable.events.ProcessObserverMethodImpl",
      "org.apache.webbeans.intercept.InterceptorUtil",
      "org.apache.xbean.finder.archive.JarArchive",
      "org.apache.xbean.finder.archive.CompositeArchive",
      "org.apache.webbeans.portable.AnnotatedElementFactory",
      "org.apache.webbeans.component.AbstractOwbBean",
      "org.apache.webbeans.logger.WebBeansLoggerFacade",
      "org.apache.webbeans.portable.events.generics.GProcessProducerMethod",
      "org.apache.webbeans.event.NotificationManager$CDICompletionFuture",
      "org.apache.xbean.finder.AnnotationFinder$InfoBuildingVisitor",
      "org.apache.webbeans.spi.BeanArchiveService$BeanArchiveInformation",
      "org.apache.webbeans.component.InstanceBean$1",
      "org.apache.xbean.finder.archive.Archive",
      "org.apache.webbeans.spi.BeanArchiveService$BeanDiscoveryMode"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.webbeans.spi.SingletonService", false, OWBTomcatWebScannerService_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(OWBTomcatWebScannerService_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.webbeans.logger.JULLoggerFactory",
      "org.apache.webbeans.logger.WebBeansLoggerFacade",
      "org.apache.webbeans.corespi.scanner.AbstractMetaDataDiscovery",
      "org.apache.webbeans.web.scanner.WebScannerService",
      "org.apache.meecrowave.openwebbeans.OWBTomcatWebScannerService",
      "org.apache.tomcat.JarScanType",
      "org.apache.webbeans.corespi.DefaultSingletonService",
      "org.apache.webbeans.config.WebBeansFinder",
      "org.apache.openwebbeans.se.CDISeScannerService",
      "org.apache.webbeans.util.UrlSet",
      "org.apache.meecrowave.logging.tomcat.LogFacade",
      "org.apache.meecrowave.logging.tomcat.JULLog",
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
      "org.apache.webbeans.conversation.ConversationManager",
      "org.apache.webbeans.conversation.ConversationStorageBean",
      "org.apache.webbeans.component.third.ThirdpartyBeanImpl",
      "org.apache.webbeans.component.third.PassivationCapableThirdpartyBeanImpl",
      "org.apache.webbeans.component.third.ThirdpartyBeanAttributesImpl",
      "org.apache.webbeans.event.NotificationManager",
      "org.apache.webbeans.event.NotificationManager$CloseableExecutor",
      "org.apache.meecrowave.openwebbeans.KnowClassesFilter",
      "org.apache.meecrowave.openwebbeans.KnowClassesFilter$OptimizedExclusionFilter",
      "org.apache.webbeans.corespi.scanner.xbean.CdiArchive",
      "org.apache.xbean.finder.archive.CompositeArchive",
      "org.apache.xbean.finder.AnnotationFinder",
      "org.apache.webbeans.corespi.scanner.xbean.OwbAnnotationFinder",
      "org.apache.xbean.finder.archive.CompositeArchive$CompositeIterator",
      "org.apache.tomcat.util.scan.StandardJarScanFilter",
      "org.apache.juli.logging.LogFactory",
      "org.apache.tomcat.util.res.StringManager",
      "org.apache.tomcat.util.res.StringManager$1",
      "org.apache.catalina.filters.CorsFilter",
      "org.apache.catalina.Globals",
      "org.apache.catalina.core.ApplicationContext",
      "org.apache.catalina.core.ApplicationContextFacade",
      "org.apache.catalina.util.LifecycleBase",
      "org.apache.catalina.util.LifecycleMBeanBase",
      "org.apache.catalina.core.ContainerBase",
      "org.apache.catalina.core.StandardContext$1",
      "org.apache.catalina.core.StandardContext",
      "org.apache.catalina.LifecycleState",
      "org.apache.catalina.core.StandardPipeline",
      "org.apache.catalina.core.StandardContext$ContextFilterMaps",
      "org.apache.catalina.valves.ValveBase",
      "org.apache.catalina.core.StandardContextValve",
      "org.apache.xbean.finder.ClassLoaders",
      "org.apache.webbeans.exception.WebBeansDeploymentException",
      "org.apache.webbeans.exception.helper.ExceptionMessageBuilder",
      "org.apache.catalina.startup.FailedContext",
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
      "org.apache.tomcat.util.scan.StandardJarScanFilter$1",
      "org.apache.tomcat.util.file.Matcher",
      "org.apache.xbean.finder.archive.FileArchive",
      "org.apache.webbeans.xml.DefaultBeanArchiveInformation",
      "org.apache.webbeans.spi.BeanArchiveService$BeanDiscoveryMode",
      "org.apache.webbeans.xml.WebBeansErrorHandler",
      "org.apache.webbeans.xml.ElementIterator",
      "org.apache.xbean.finder.archive.FilteredArchive",
      "org.apache.xbean.finder.archive.ClasspathArchive",
      "org.apache.xbean.finder.archive.JarArchive",
      "org.apache.xbean.finder.archive.MJarSupport",
      "org.apache.webbeans.corespi.scanner.xbean.BeanArchiveFilter",
      "org.apache.webbeans.corespi.scanner.xbean.CdiArchive$FoundClasses",
      "org.apache.webbeans.exception.WebBeansConfigurationException",
      "org.apache.catalina.connector.Connector",
      "org.apache.catalina.connector.Request$1",
      "org.apache.catalina.connector.Request$2",
      "org.apache.catalina.connector.Request$3",
      "org.apache.catalina.connector.Request$4",
      "org.apache.catalina.connector.Request$5",
      "org.apache.catalina.connector.Request$6",
      "org.apache.catalina.connector.Request$7",
      "org.apache.catalina.connector.Request",
      "org.apache.catalina.connector.InputBuffer",
      "org.apache.catalina.connector.CoyoteInputStream",
      "org.apache.catalina.connector.CoyoteReader",
      "org.apache.catalina.util.ParameterMap",
      "org.apache.catalina.mapper.MappingData",
      "org.apache.tomcat.util.buf.MessageBytes$MessageBytesFactory",
      "org.apache.tomcat.util.buf.MessageBytes",
      "org.apache.tomcat.util.buf.ByteChunk",
      "org.apache.tomcat.util.buf.CharChunk",
      "org.apache.catalina.core.ApplicationMapping",
      "org.apache.catalina.servlets.CGIServlet",
      "org.apache.catalina.core.StandardWrapper",
      "org.apache.catalina.startup.Tomcat$ExistingStandardWrapper",
      "org.apache.catalina.core.StandardWrapperFacade",
      "org.apache.catalina.core.StandardWrapperValve",
      "org.apache.catalina.manager.ManagerServlet",
      "org.apache.catalina.manager.HTMLManagerServlet",
      "org.apache.catalina.manager.JMXProxyServlet",
      "org.apache.catalina.ssi.SSIServlet",
      "org.apache.catalina.security.SecurityUtil",
      "org.apache.catalina.manager.StatusManagerServlet",
      "org.apache.catalina.webresources.TomcatURLStreamHandlerFactory",
      "org.apache.catalina.servlets.DefaultServlet$SecureEntityResolver",
      "org.apache.catalina.servlets.DefaultServlet",
      "org.apache.catalina.util.URLEncoder",
      "org.apache.catalina.util.ConcurrentDateFormat",
      "org.apache.catalina.servlets.WebdavServlet",
      "org.apache.tomcat.util.ExceptionUtils",
      "org.apache.catalina.core.ApplicationDispatcher",
      "org.apache.catalina.core.ApplicationFilterChain",
      "org.apache.catalina.LifecycleEvent",
      "org.apache.tomcat.util.modeler.Registry",
      "org.apache.catalina.LifecycleException",
      "org.apache.catalina.webresources.ClasspathURLStreamHandler",
      "org.apache.tomcat.util.descriptor.web.XmlEncodingBase",
      "org.apache.tomcat.util.descriptor.web.FilterMap",
      "org.apache.catalina.util.ContextName",
      "org.apache.catalina.util.SystemPropertyReplacerListener",
      "org.apache.catalina.connector.RequestFacade",
      "org.apache.catalina.core.StandardEngine",
      "org.apache.catalina.core.StandardEngineValve",
      "org.apache.xbean.finder.util.Files",
      "org.apache.catalina.core.NamingContextListener",
      "org.apache.catalina.startup.UserConfig",
      "org.apache.catalina.util.CharsetMapper",
      "org.apache.coyote.ActionCode",
      "org.apache.meecrowave.Meecrowave$Builder",
      "org.apache.johnzon.core.BufferStrategy",
      "org.apache.meecrowave.Meecrowave$ValueTransformers",
      "org.apache.catalina.connector.RequestFacade$GetRequestDispatcherPrivilegedAction",
      "org.apache.tomcat.util.http.parser.MediaTypeCache",
      "org.apache.tomcat.util.collections.ConcurrentCache",
      "org.apache.catalina.connector.Response",
      "org.apache.tomcat.util.buf.UEncoder",
      "org.apache.tomcat.util.buf.UEncoder$SafeCharsSet",
      "org.apache.catalina.connector.OutputBuffer",
      "org.apache.tomcat.util.descriptor.web.Constants",
      "org.apache.tomcat.util.descriptor.web.WebXml",
      "org.apache.tomcat.util.descriptor.web.SessionConfig",
      "org.apache.tomcat.util.scan.StandardJarScanner",
      "org.apache.catalina.webresources.StandardRoot",
      "org.apache.catalina.webresources.ExtractingRoot",
      "org.apache.catalina.webresources.Cache",
      "org.apache.catalina.webresources.EmptyResourceSet",
      "org.apache.catalina.core.AprLifecycleListener",
      "org.apache.catalina.webresources.AbstractResourceSet",
      "org.apache.catalina.webresources.AbstractFileResourceSet",
      "org.apache.catalina.webresources.DirResourceSet",
      "org.apache.catalina.loader.WebappClassLoaderBase",
      "org.apache.catalina.loader.ParallelWebappClassLoader",
      "org.apache.tomcat.util.descriptor.web.LoginConfig",
      "org.apache.tomcat.util.buf.UDecoder$DecodeException",
      "org.apache.tomcat.util.buf.UDecoder",
      "org.apache.catalina.startup.ContextConfig",
      "org.apache.coyote.AbstractProtocol",
      "org.apache.coyote.http11.AbstractHttp11Protocol",
      "org.apache.coyote.http11.AbstractHttp11JsseProtocol",
      "org.apache.coyote.http11.Http11NioProtocol",
      "org.apache.tomcat.util.net.AbstractEndpoint",
      "org.apache.tomcat.util.net.AbstractJsseEndpoint",
      "org.apache.tomcat.util.net.NioEndpoint",
      "org.apache.tomcat.util.net.SocketProperties",
      "org.apache.tomcat.util.net.AbstractEndpoint$BindState",
      "org.apache.tomcat.util.net.NioSelectorPool",
      "org.apache.coyote.AbstractProtocol$ConnectionHandler",
      "org.apache.tomcat.util.modeler.BaseModelMBean",
      "org.apache.coyote.RequestGroupInfo",
      "org.apache.tomcat.util.collections.SynchronizedStack",
      "org.apache.coyote.AbstractProtocol$RecycledProcessors",
      "org.apache.catalina.loader.WebappClassLoader",
      "org.apache.catalina.session.StandardSession",
      "org.apache.tomcat.util.scan.AbstractInputStreamJar",
      "org.apache.tomcat.util.scan.UrlJar",
      "org.apache.cxf.transport.http.HTTPSession",
      "org.apache.tomcat.util.modeler.modules.ModelerSource",
      "org.apache.tomcat.util.modeler.modules.MbeansDescriptorsDigesterSource",
      "org.apache.tomcat.util.digester.Digester",
      "org.apache.tomcat.util.digester.Digester$SystemPropertySource",
      "org.apache.tomcat.util.digester.ArrayStack",
      "org.apache.tomcat.util.digester.Rule",
      "org.apache.tomcat.util.digester.ObjectCreateRule",
      "org.apache.tomcat.util.digester.RulesBase",
      "org.apache.tomcat.util.digester.SetPropertiesRule",
      "org.apache.tomcat.util.digester.SetNextRule",
      "org.apache.tomcat.util.digester.CallMethodRule",
      "org.apache.tomcat.util.IntrospectionUtils",
      "org.apache.tomcat.util.modeler.ManagedBean",
      "org.apache.tomcat.util.modeler.FeatureInfo",
      "org.apache.tomcat.util.modeler.AttributeInfo",
      "org.apache.tomcat.util.modeler.OperationInfo",
      "org.apache.tomcat.util.buf.StringUtils",
      "org.apache.tomcat.util.modeler.ParameterInfo",
      "org.apache.catalina.mbeans.BaseCatalinaMBean",
      "org.apache.catalina.mbeans.ClassNameMBean",
      "org.apache.catalina.mbeans.ConnectorMBean",
      "org.apache.catalina.session.StandardSessionFacade",
      "org.apache.catalina.webresources.AbstractArchiveResourceSet",
      "org.apache.catalina.webresources.AbstractSingleArchiveResourceSet",
      "org.apache.catalina.webresources.WarResourceSet",
      "org.apache.catalina.session.ManagerBase",
      "org.apache.catalina.session.PersistentManagerBase",
      "org.apache.catalina.session.PersistentManager",
      "org.apache.catalina.session.StandardManager",
      "org.apache.tomcat.util.scan.JarFileUrlJar",
      "org.apache.catalina.deploy.NamingResourcesImpl",
      "org.apache.catalina.core.StandardServer",
      "org.apache.tomcat.util.net.Nio2Endpoint",
      "org.apache.catalina.core.StandardService",
      "org.apache.catalina.mapper.Mapper",
      "org.apache.catalina.mapper.MapperListener",
      "org.apache.catalina.core.AsyncContextImpl",
      "org.apache.catalina.session.StoreBase",
      "org.apache.catalina.session.JDBCStore",
      "org.apache.tomcat.util.descriptor.web.WebXmlParser",
      "org.apache.tomcat.util.descriptor.web.WebRuleSet",
      "org.apache.tomcat.util.descriptor.web.SetSessionConfig",
      "org.apache.tomcat.util.descriptor.web.SetLoginConfig",
      "org.apache.tomcat.util.descriptor.web.SetJspConfig",
      "org.apache.tomcat.util.descriptor.web.NameRule",
      "org.apache.tomcat.util.descriptor.web.AbsoluteOrderingRule",
      "org.apache.tomcat.util.descriptor.web.RelativeOrderingRule",
      "org.apache.tomcat.util.descriptor.Constants",
      "org.apache.tomcat.util.descriptor.DigesterFactory",
      "org.apache.tomcat.util.descriptor.LocalResolver",
      "org.apache.tomcat.util.descriptor.web.SetPublicIdRule",
      "org.apache.tomcat.util.descriptor.web.IgnoreAnnotationsRule",
      "org.apache.tomcat.util.descriptor.web.VersionRule",
      "org.apache.tomcat.util.descriptor.web.SetDenyUncoveredHttpMethodsRule",
      "org.apache.tomcat.util.digester.CallParamRule",
      "org.apache.tomcat.util.descriptor.web.SetDistributableRule",
      "org.apache.tomcat.util.descriptor.web.MappedNameRule",
      "org.apache.tomcat.util.descriptor.web.SetOverrideRule",
      "org.apache.tomcat.util.descriptor.web.ServiceQnameRule",
      "org.apache.tomcat.util.descriptor.web.CallMethodMultiRule",
      "org.apache.tomcat.util.descriptor.web.CallParamMultiRule",
      "org.apache.tomcat.util.descriptor.web.SoapHeaderRule",
      "org.apache.tomcat.util.descriptor.web.SetAuthConstraintRule",
      "org.apache.tomcat.util.descriptor.web.ServletDefCreateRule",
      "org.apache.tomcat.util.descriptor.web.TaglibLocationRule",
      "org.apache.tomcat.util.descriptor.web.LifecycleCallbackRule",
      "org.apache.tomcat.util.descriptor.web.FragmentJarScannerCallback",
      "org.apache.catalina.core.StandardHost",
      "org.apache.catalina.core.StandardHostValve",
      "org.apache.meecrowave.Meecrowave$SecurityConstaintBuilder",
      "org.apache.tomcat.util.descriptor.web.SecurityConstraint",
      "org.apache.tomcat.util.net.openssl.ciphers.Authentication",
      "org.apache.tomcat.util.net.SSLHostConfigCertificate$Type",
      "org.apache.tomcat.util.net.SSLHostConfigCertificate",
      "org.apache.catalina.manager.DummyProxySession",
      "org.apache.catalina.realm.RealmBase",
      "org.apache.catalina.realm.CombinedRealm",
      "org.apache.catalina.realm.LockOutRealm",
      "org.apache.catalina.realm.RealmBase$AllRolesMode",
      "org.apache.catalina.filters.RequestDumperFilter$1",
      "org.apache.catalina.filters.RequestDumperFilter",
      "org.apache.tomcat.util.net.SSLHostConfig",
      "org.apache.tomcat.util.net.SSLHostConfig$Type",
      "org.apache.tomcat.util.net.SSLHostConfig$CertificateVerification"
    );
  }
}