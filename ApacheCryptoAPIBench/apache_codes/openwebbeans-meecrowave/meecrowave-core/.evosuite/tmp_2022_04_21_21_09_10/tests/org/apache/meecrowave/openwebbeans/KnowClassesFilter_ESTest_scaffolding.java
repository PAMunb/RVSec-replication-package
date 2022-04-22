/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 21:11:05 GMT 2022
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
public class KnowClassesFilter_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.meecrowave.openwebbeans.KnowClassesFilter"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(KnowClassesFilter_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.meecrowave.Meecrowave$QuickServerXmlParser",
      "org.apache.meecrowave.Meecrowave$SecurityConstaintBuilder",
      "org.apache.catalina.Lifecycle",
      "org.apache.meecrowave.Meecrowave$TomcatWithFastSessionIDs",
      "org.apache.catalina.Contained",
      "org.apache.meecrowave.Meecrowave$Builder$2",
      "org.apache.meecrowave.Meecrowave$Builder",
      "org.apache.meecrowave.Meecrowave$Builder$1",
      "org.apache.catalina.connector.Connector",
      "org.apache.meecrowave.Meecrowave$InstanceCustomizer",
      "org.apache.meecrowave.openwebbeans.KnowClassesFilter$OptimizedExclusionFilter",
      "org.apache.meecrowave.Meecrowave$ConfigurationCustomizer",
      "org.apache.catalina.util.LifecycleMBeanBase",
      "org.apache.commons.lang3.text.StrLookup",
      "org.apache.meecrowave.Meecrowave$InternalTomcat",
      "org.apache.meecrowave.Meecrowave$DeploymentMeta",
      "org.apache.meecrowave.Meecrowave$ValueTransformers",
      "org.apache.catalina.util.LifecycleBase",
      "org.apache.xbean.finder.filter.Filter",
      "org.apache.catalina.startup.Tomcat",
      "org.apache.meecrowave.Meecrowave$LoginConfigBuilder",
      "org.apache.catalina.Realm",
      "org.apache.meecrowave.openwebbeans.KnowClassesFilter",
      "org.apache.meecrowave.Meecrowave$MeecrowaveContainerLoader",
      "org.apache.meecrowave.Meecrowave",
      "org.apache.catalina.JmxEnabled"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.meecrowave.Meecrowave$Builder", false, KnowClassesFilter_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(KnowClassesFilter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.meecrowave.openwebbeans.KnowClassesFilter",
      "org.apache.meecrowave.openwebbeans.KnowClassesFilter$OptimizedExclusionFilter",
      "org.apache.meecrowave.Meecrowave$Builder"
    );
  }
}
