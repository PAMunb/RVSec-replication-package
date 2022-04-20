/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 20 11:24:39 GMT 2022
 */

package org.apache.activemq.artemis.logs;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AssertionLoggerHandler_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.activemq.artemis.logs.AssertionLoggerHandler"; 
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
    java.lang.System.setProperty("user.dir", "/pedro/desenvolvimento/workspaces/workspaces-doutorado/workspace-rv/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/activemq-artemis/artemis-commons"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AssertionLoggerHandler_ESTest_scaffolding.class.getClassLoader() ,
      "org.jboss.logmanager.NDC",
      "org.jboss.logmanager.WrappedExtLogRecord",
      "org.jboss.logmanager.errormanager.OnlyOnceErrorManager",
      "org.jboss.logmanager.ExtLogRecord",
      "org.jboss.logmanager.ExtLogRecord$FormatStyle",
      "org.jboss.logmanager.NDC$Holder",
      "org.jboss.logmanager.handlers.FlushableCloseable",
      "org.jboss.logmanager.ExtHandler",
      "org.jboss.logmanager.AtomicArray",
      "org.jboss.logmanager.NDC$Stack",
      "org.jboss.logmanager.ExtLogRecord$1",
      "org.apache.activemq.artemis.logs.AssertionLoggerHandler",
      "org.jboss.logmanager.Protectable"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AssertionLoggerHandler_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jboss.logmanager.errormanager.OnlyOnceErrorManager",
      "org.jboss.logmanager.AtomicArray",
      "org.jboss.logmanager.ExtHandler",
      "org.apache.activemq.artemis.logs.AssertionLoggerHandler",
      "org.jboss.logmanager.ExtLogRecord",
      "org.jboss.logmanager.NDC$Holder",
      "org.jboss.logmanager.NDC",
      "org.jboss.logmanager.NDC$Stack",
      "org.jboss.logmanager.MDC$Holder",
      "org.jboss.logmanager.MDC",
      "org.jboss.logmanager.FastCopyHashMap",
      "org.jboss.logmanager.FastCopyHashMap$Entry",
      "org.jboss.logmanager.ExtLogRecord$1",
      "org.jboss.logmanager.filters.AnyFilter",
      "org.jboss.logmanager.filters.RegexFilter",
      "org.jboss.logmanager.filters.DenyAllFilter",
      "org.jboss.logmanager.WrappedExtLogRecord",
      "org.jboss.logmanager.filters.AcceptAllFilter",
      "org.jboss.logmanager.FastCopyHashMap$EntrySet",
      "org.jboss.logmanager.FastCopyHashMap$FastCopyHashMapIterator",
      "org.jboss.logmanager.FastCopyHashMap$EntryIterator",
      "org.jboss.logmanager.filters.AllFilter",
      "org.jboss.logmanager.filters.SubstituteFilter",
      "org.jboss.logmanager.filters.LevelRangeFilter",
      "org.jboss.logmanager.filters.InvertFilter",
      "org.jboss.logmanager.filters.LevelChangingFilter",
      "org.jboss.logmanager.ExtLogRecord$FormatStyle"
    );
  }
}
