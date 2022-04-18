/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Apr 18 12:27:48 GMT 2022
 */

package org.apache.manifoldcf.core.interfaces;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class IDFactory_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.manifoldcf.core.interfaces.IDFactory"; 
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
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "/pedro/desenvolvimento/workspaces/workspaces-doutorado/workspace-rv/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/manifoldcf/framework/core"); 
    java.lang.System.setProperty("user.home", "/home/pedro"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "pedro"); 
    java.lang.System.setProperty("user.timezone", ""); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(IDFactory_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.manifoldcf.core.interfaces.ResultSpecification",
      "org.apache.manifoldcf.core.interfaces.LockException",
      "org.apache.manifoldcf.core.interfaces.IResultRow",
      "org.apache.manifoldcf.core.interfaces.Configuration$JSONWriter",
      "org.apache.manifoldcf.core.interfaces.IDFactory",
      "org.apache.manifoldcf.core.interfaces.ClauseDescription",
      "org.apache.manifoldcf.core.system.ManifoldCF",
      "org.apache.manifoldcf.core.interfaces.ConfigurationNode",
      "org.apache.manifoldcf.core.interfaces.IPollingHook",
      "org.apache.manifoldcf.core.interfaces.IHierarchyParent",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFConfiguration",
      "org.apache.manifoldcf.core.interfaces.IThreadContext",
      "org.apache.manifoldcf.core.interfaces.IServiceCleanup",
      "org.apache.manifoldcf.core.threadcontext.ThreadContext",
      "org.apache.manifoldcf.core.interfaces.IShutdownHook",
      "org.apache.manifoldcf.core.interfaces.IndexDescription",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFException",
      "org.apache.manifoldcf.core.interfaces.LockManagerFactory",
      "org.apache.manifoldcf.core.system.ManifoldCF$DatabaseConnectionReleaseThread",
      "org.apache.manifoldcf.core.interfaces.Configuration",
      "org.apache.manifoldcf.core.system.ManifoldCF$ShutdownThread",
      "org.apache.manifoldcf.core.common.XMLDoc",
      "org.apache.manifoldcf.core.interfaces.StringSet",
      "org.apache.manifoldcf.core.interfaces.IServiceDataAcceptor",
      "org.apache.manifoldcf.core.interfaces.Configuration$JSONReader",
      "org.apache.manifoldcf.core.interfaces.IResultSet",
      "org.apache.manifoldcf.core.system.ManifoldCF$OverrideableManifoldCFConfiguration",
      "org.apache.manifoldcf.core.interfaces.ThreadContextFactory",
      "org.apache.manifoldcf.core.system.ManifoldCFResourceLoader",
      "org.apache.manifoldcf.core.interfaces.ILockManager",
      "org.apache.manifoldcf.core.interfaces.IDBInterface",
      "org.apache.manifoldcf.core.interfaces.ILimitChecker"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(IDFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.manifoldcf.core.interfaces.IDFactory",
      "org.apache.manifoldcf.core.system.ManifoldCF$ShutdownThread",
      "org.apache.manifoldcf.core.system.ManifoldCF",
      "org.apache.manifoldcf.core.threadcontext.ThreadContext",
      "org.apache.manifoldcf.core.interfaces.LockManagerFactory",
      "org.apache.manifoldcf.core.interfaces.ThreadContextFactory"
    );
  }
}
