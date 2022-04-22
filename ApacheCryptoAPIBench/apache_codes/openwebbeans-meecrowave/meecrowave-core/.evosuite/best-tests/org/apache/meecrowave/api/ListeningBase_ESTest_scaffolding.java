/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 21:14:10 GMT 2022
 */

package org.apache.meecrowave.api;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ListeningBase_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.meecrowave.api.ListeningBase"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ListeningBase_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.catalina.WebResourceRoot",
      "org.apache.meecrowave.api.ListeningBase",
      "org.apache.tomcat.util.res.StringManager$1",
      "org.apache.catalina.Lifecycle",
      "org.apache.catalina.Contained",
      "org.apache.tomcat.util.descriptor.web.FilterMap",
      "org.apache.catalina.LifecycleListener",
      "org.apache.juli.logging.LogFactory",
      "org.apache.tomcat.ContextBind",
      "org.apache.catalina.Host",
      "org.apache.meecrowave.api.StopListening",
      "org.apache.catalina.LifecycleState",
      "org.apache.catalina.ContainerListener",
      "org.apache.catalina.AccessLog",
      "org.apache.tomcat.util.descriptor.web.NamingResources",
      "org.apache.meecrowave.api.StartListening",
      "org.apache.catalina.connector.Request",
      "org.apache.catalina.Loader",
      "org.apache.catalina.LifecycleException",
      "org.apache.coyote.Adapter",
      "org.apache.meecrowave.logging.tomcat.JULLog",
      "org.apache.catalina.util.LifecycleBase",
      "org.apache.catalina.Wrapper",
      "org.apache.catalina.deploy.NamingResourcesImpl",
      "org.apache.catalina.Realm",
      "org.apache.tomcat.util.descriptor.web.XmlEncodingBase",
      "org.apache.catalina.JmxEnabled",
      "org.apache.tomcat.util.descriptor.web.LoginConfig",
      "org.apache.tomcat.util.descriptor.web.ErrorPage",
      "org.apache.coyote.UpgradeProtocol",
      "org.apache.catalina.connector.Connector",
      "org.apache.juli.logging.Log",
      "org.apache.tomcat.JarScanner",
      "org.apache.tomcat.util.descriptor.web.ApplicationParameter",
      "org.apache.tomcat.util.descriptor.web.SecurityConstraint",
      "org.apache.catalina.util.LifecycleMBeanBase",
      "org.apache.tomcat.util.net.SSLHostConfig",
      "org.apache.tomcat.util.res.StringManager",
      "org.apache.catalina.Manager",
      "org.apache.catalina.Service",
      "org.apache.catalina.Cluster",
      "org.apache.catalina.ThreadBindingListener",
      "org.apache.tomcat.util.descriptor.web.FilterDef",
      "org.apache.meecrowave.logging.tomcat.LogFacade",
      "org.apache.tomcat.InstanceManager",
      "org.apache.catalina.Context",
      "org.apache.catalina.Authenticator",
      "org.apache.catalina.connector.Response",
      "org.apache.catalina.Container",
      "org.apache.coyote.ProtocolHandler",
      "org.apache.tomcat.util.http.CookieProcessor",
      "org.apache.catalina.Pipeline",
      "org.apache.juli.logging.LogConfigurationException"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.catalina.Context", false, ListeningBase_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.catalina.Host", false, ListeningBase_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.catalina.connector.Connector", false, ListeningBase_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ListeningBase_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.meecrowave.api.ListeningBase",
      "org.apache.meecrowave.logging.tomcat.LogFacade",
      "org.apache.juli.logging.LogFactory",
      "org.apache.meecrowave.logging.tomcat.JULLog",
      "org.apache.tomcat.util.res.StringManager",
      "org.apache.tomcat.util.res.StringManager$1",
      "org.apache.catalina.util.LifecycleBase",
      "org.apache.catalina.util.LifecycleMBeanBase",
      "org.apache.catalina.connector.Connector",
      "org.apache.meecrowave.api.StopListening",
      "org.apache.meecrowave.api.StartListening"
    );
  }
}
