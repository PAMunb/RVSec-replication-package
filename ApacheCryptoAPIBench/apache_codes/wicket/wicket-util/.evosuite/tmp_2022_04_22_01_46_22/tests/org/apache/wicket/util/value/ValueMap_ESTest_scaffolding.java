/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Apr 22 01:50:55 GMT 2022
 */

package org.apache.wicket.util.value;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ValueMap_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.wicket.util.value.ValueMap"; 
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
    java.lang.System.setProperty("user.dir", "/home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/wicket/wicket-util"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ValueMap_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.wicket.util.parse.metapattern.OptionalMetaPattern",
      "org.apache.commons.io.IOCase",
      "org.apache.wicket.util.string.IStringIterator",
      "org.apache.wicket.util.parse.metapattern.Group",
      "org.apache.wicket.util.time.AbstractTimeValue",
      "org.apache.wicket.util.value.IValueMap",
      "org.apache.wicket.util.parse.metapattern.parsers.MetaPatternParser",
      "org.apache.wicket.util.string.Strings",
      "org.apache.wicket.util.value.ValueMap",
      "org.apache.wicket.util.time.AbstractTime",
      "org.apache.wicket.util.string.StringValue",
      "org.apache.wicket.util.string.Strings$1",
      "org.apache.wicket.util.time.Duration",
      "org.apache.wicket.util.parse.metapattern.parsers.VariableAssignmentParser",
      "org.apache.wicket.util.string.IStringSequence",
      "org.apache.wicket.util.string.AppendingStringBuffer",
      "org.apache.wicket.util.io.IClusterable",
      "org.apache.wicket.util.string.StringList",
      "org.apache.wicket.util.string.StringValueConversionException",
      "org.apache.wicket.util.parse.metapattern.GroupNotBoundException",
      "org.apache.wicket.util.time.TimeOfDay",
      "org.apache.wicket.util.thread.ICode",
      "org.apache.wicket.util.string.StringList$1",
      "org.apache.wicket.util.parse.metapattern.MetaPattern",
      "org.apache.wicket.util.value.LongValue",
      "org.apache.wicket.util.parse.metapattern.GroupAlreadyBoundException",
      "org.apache.wicket.util.string.AbstractStringList",
      "org.apache.wicket.util.time.Time",
      "org.apache.wicket.util.value.AttributeMap",
      "org.apache.wicket.util.convert.ConversionException",
      "org.apache.commons.io.FilenameUtils",
      "org.apache.wicket.util.string.Strings$2"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ValueMap_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.wicket.util.value.ValueMap",
      "org.apache.wicket.util.string.StringValue",
      "org.apache.wicket.util.string.AbstractStringList",
      "org.apache.wicket.util.string.StringList",
      "org.apache.wicket.util.string.StringList$1",
      "org.apache.wicket.util.parse.metapattern.parsers.MetaPatternParser",
      "org.apache.wicket.util.parse.metapattern.MetaPattern",
      "org.apache.wicket.util.parse.metapattern.OptionalMetaPattern",
      "org.apache.wicket.util.parse.metapattern.parsers.VariableAssignmentParser",
      "org.apache.wicket.util.parse.metapattern.Group",
      "org.apache.wicket.util.value.LongValue",
      "org.apache.wicket.util.time.AbstractTimeValue",
      "org.apache.wicket.util.time.Duration",
      "org.apache.wicket.util.time.AbstractTime",
      "org.apache.wicket.util.time.Time",
      "org.apache.wicket.util.convert.ConversionException",
      "org.apache.wicket.util.string.StringValueConversionException",
      "org.apache.wicket.util.lang.Generics",
      "org.apache.wicket.util.lang.EnumeratedType",
      "org.apache.wicket.util.time.TimeOfDay$Meridian",
      "org.apache.wicket.util.time.TimeOfDay",
      "org.apache.wicket.util.string.Strings$1",
      "org.apache.wicket.util.string.Strings$2",
      "org.apache.wicket.util.string.Strings",
      "org.apache.wicket.util.string.AppendingStringBuffer",
      "org.apache.wicket.util.lang.Args",
      "org.apache.wicket.util.lang.Objects",
      "org.apache.commons.io.FilenameUtils",
      "org.apache.commons.io.IOCase"
    );
  }
}
