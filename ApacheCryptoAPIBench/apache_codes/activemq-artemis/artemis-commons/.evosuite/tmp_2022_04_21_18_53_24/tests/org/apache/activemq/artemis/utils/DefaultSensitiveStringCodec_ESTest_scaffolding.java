/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 19:05:30 GMT 2022
 */

package org.apache.activemq.artemis.utils;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DefaultSensitiveStringCodec_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.activemq.artemis.utils.DefaultSensitiveStringCodec"; 
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
    java.lang.System.setProperty("user.dir", "/home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/activemq-artemis/artemis-commons"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DefaultSensitiveStringCodec_ESTest_scaffolding.class.getClassLoader() ,
      "org.jboss.logging.AbstractLoggerProvider",
      "org.jboss.logging.Slf4jLocationAwareLogger",
      "org.jboss.logging.Slf4jLocationAwareLogger$1",
      "org.jboss.logging.LoggerProviders$1",
      "org.jboss.logging.LoggerProvider",
      "org.jboss.logging.Logger",
      "org.apache.activemq.artemis.utils.SensitiveDataCodec",
      "org.jboss.logging.Slf4jLogger",
      "org.apache.activemq.artemis.utils.DefaultSensitiveStringCodec$PBKDF2Algorithm",
      "org.jboss.logging.BasicLogger",
      "org.jboss.logmanager.LogManager",
      "org.jboss.logging.Logger$Level",
      "org.apache.activemq.artemis.utils.DefaultSensitiveStringCodec",
      "org.apache.activemq.artemis.utils.DefaultSensitiveStringCodec$BlowfishAlgorithm",
      "org.apache.activemq.artemis.utils.DefaultSensitiveStringCodec$CodecAlgorithm",
      "org.jboss.logging.Slf4jLoggerProvider",
      "org.jboss.logging.LoggerProviders"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DefaultSensitiveStringCodec_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jboss.logging.Logger",
      "org.jboss.logging.LoggerProviders$1",
      "org.jboss.logging.AbstractLoggerProvider",
      "org.jboss.logging.Slf4jLoggerProvider",
      "org.jboss.logging.Slf4jLocationAwareLogger",
      "org.jboss.logging.Logger$Level",
      "org.jboss.logging.Slf4jLocationAwareLogger$1",
      "org.jboss.logging.LoggerProviders",
      "org.apache.activemq.artemis.utils.DefaultSensitiveStringCodec",
      "org.apache.activemq.artemis.utils.DefaultSensitiveStringCodec$CodecAlgorithm",
      "org.apache.activemq.artemis.utils.DefaultSensitiveStringCodec$BlowfishAlgorithm",
      "org.apache.activemq.artemis.utils.DefaultSensitiveStringCodec$PBKDF2Algorithm"
    );
  }
}