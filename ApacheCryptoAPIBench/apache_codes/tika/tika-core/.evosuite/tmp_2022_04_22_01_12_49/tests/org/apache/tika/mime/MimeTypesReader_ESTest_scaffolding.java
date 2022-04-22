/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Apr 22 01:23:58 GMT 2022
 */

package org.apache.tika.mime;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class MimeTypesReader_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.tika.mime.MimeTypesReader"; 
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
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/tika/tika-core"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MimeTypesReader_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.tika.mime.MagicMatch",
      "org.apache.tika.mime.OrClause",
      "org.apache.tika.mime.MediaTypeRegistry",
      "org.apache.tika.metadata.CreativeCommons",
      "org.apache.tika.metadata.TikaMetadataKeys",
      "org.apache.tika.mime.MediaType",
      "org.apache.tika.mime.Patterns$LengthComparator",
      "org.apache.tika.metadata.Metadata",
      "org.apache.tika.mime.Clause",
      "org.apache.tika.mime.Patterns",
      "org.apache.tika.exception.TikaException",
      "org.apache.tika.metadata.ClimateForcast",
      "org.apache.tika.mime.Magic",
      "org.apache.tika.mime.MimeType$RootXML",
      "org.apache.tika.mime.MimeTypesReaderMetKeys",
      "org.apache.tika.metadata.Message",
      "org.apache.tika.mime.AndClause",
      "org.apache.tika.metadata.TIFF",
      "org.apache.tika.detect.MagicDetector",
      "org.apache.tika.mime.MimeTypesReader$ClauseRecord",
      "org.apache.tika.mime.MimeTypesFactory",
      "org.apache.tika.detect.Detector",
      "org.apache.tika.metadata.TikaMimeKeys",
      "org.apache.tika.metadata.MSOffice",
      "org.apache.tika.metadata.Geographic",
      "org.apache.tika.mime.MimeTypes",
      "org.apache.tika.mime.MimeTypesReader",
      "org.apache.tika.mime.MimeTypeException",
      "org.apache.tika.metadata.HttpHeaders",
      "org.apache.tika.mime.MimeType"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.w3c.dom.Document", false, MimeTypesReader_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MimeTypesReader_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.tika.mime.MimeTypesReader",
      "org.apache.tika.mime.MimeTypesReader$ClauseRecord",
      "org.apache.tika.mime.MediaType",
      "org.apache.tika.mime.MimeTypes",
      "org.apache.tika.mime.MimeTypesFactory",
      "org.apache.tika.mime.MediaTypeRegistry",
      "org.apache.tika.mime.Patterns",
      "org.apache.tika.mime.Patterns$LengthComparator",
      "org.apache.tika.mime.MimeType",
      "org.apache.tika.mime.MagicMatch",
      "org.apache.tika.mime.Magic",
      "org.apache.tika.mime.MimeType$RootXML",
      "org.apache.tika.mime.AndClause",
      "org.apache.tika.mime.OrClause",
      "org.apache.tika.exception.TikaException",
      "org.apache.tika.mime.MimeTypeException",
      "org.apache.tika.detect.MagicDetector",
      "org.apache.tika.Tika",
      "org.apache.tika.parser.AbstractParser",
      "org.apache.tika.parser.CompositeParser",
      "org.apache.tika.parser.AutoDetectParser",
      "org.apache.tika.config.TikaConfig",
      "org.apache.tika.config.ServiceLoader",
      "org.apache.tika.config.LoadErrorHandler$1",
      "org.apache.tika.config.LoadErrorHandler$2",
      "org.apache.tika.config.LoadErrorHandler$3",
      "org.apache.tika.config.LoadErrorHandler",
      "org.apache.tika.config.InitializableProblemHandler$1",
      "org.apache.tika.config.InitializableProblemHandler$2",
      "org.apache.tika.config.InitializableProblemHandler$3",
      "org.apache.tika.config.InitializableProblemHandler$4",
      "org.apache.tika.config.InitializableProblemHandler",
      "org.apache.tika.metadata.Property",
      "org.apache.tika.metadata.Property$ValueType",
      "org.apache.tika.metadata.Property$PropertyType",
      "org.apache.tika.utils.DateUtils",
      "org.apache.tika.metadata.Metadata"
    );
  }
}
