/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 21:06:50 GMT 2022
 */

package org.apache.manifoldcf.core;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DBInitializationCommand_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.manifoldcf.core.DBInitializationCommand"; 
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
    java.lang.System.setProperty("user.dir", "/home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/manifoldcf/framework/core"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DBInitializationCommand_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.manifoldcf.core.interfaces.ManifoldCFException",
      "org.apache.manifoldcf.core.system.ManifoldCF",
      "org.apache.manifoldcf.core.InitializationCommand",
      "org.apache.manifoldcf.core.interfaces.IPollingHook",
      "org.apache.manifoldcf.core.DBDrop",
      "org.apache.manifoldcf.core.DBCreate",
      "org.apache.manifoldcf.core.interfaces.Configuration",
      "org.apache.manifoldcf.core.system.ManifoldCF$ShutdownThread",
      "org.apache.manifoldcf.core.interfaces.IHierarchyParent",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFConfiguration",
      "org.apache.manifoldcf.core.DBInitializationCommand",
      "org.apache.manifoldcf.core.interfaces.IThreadContext",
      "org.apache.manifoldcf.core.threadcontext.ThreadContext",
      "org.apache.manifoldcf.core.interfaces.ThreadContextFactory",
      "org.apache.manifoldcf.core.system.ManifoldCF$OverrideableManifoldCFConfiguration",
      "org.apache.manifoldcf.core.system.ManifoldCFResourceLoader",
      "org.apache.manifoldcf.core.interfaces.IShutdownHook",
      "org.apache.manifoldcf.core.interfaces.IDBInterface"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DBInitializationCommand_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.manifoldcf.core.DBInitializationCommand",
      "org.apache.manifoldcf.core.DBDrop",
      "org.apache.manifoldcf.core.DBCreate",
      "org.apache.manifoldcf.core.system.ManifoldCF$ShutdownThread",
      "org.apache.manifoldcf.core.system.ManifoldCF",
      "org.apache.manifoldcf.core.system.Logging",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.logging.log4j.MarkerManager",
      "org.apache.logging.log4j.MarkerManager$Log4jMarker",
      "org.apache.logging.log4j.spi.AbstractLogger",
      "org.apache.logging.log4j.util.LoaderUtil$ThreadContextClassLoaderGetter",
      "org.apache.logging.log4j.util.LoaderUtil",
      "org.apache.logging.log4j.util.PropertiesUtil",
      "org.apache.logging.log4j.message.AbstractMessageFactory",
      "org.apache.logging.log4j.message.ParameterizedMessageFactory",
      "org.apache.logging.log4j.status.StatusLogger$BoundedQueue",
      "org.apache.logging.log4j.simple.SimpleLogger",
      "org.apache.logging.log4j.spi.StandardLevel",
      "org.apache.logging.log4j.Level",
      "org.apache.logging.log4j.status.StatusLogger",
      "org.apache.logging.log4j.util.ProviderUtil",
      "org.apache.logging.log4j.util.LoaderUtil$UrlResource",
      "org.apache.logging.log4j.spi.Provider",
      "org.apache.logging.log4j.core.impl.Log4jContextFactory",
      "org.apache.logging.log4j.core.selector.ClassLoaderContextSelector",
      "org.apache.logging.log4j.core.util.DefaultShutdownCallbackRegistry",
      "org.apache.logging.log4j.core.LifeCycle$State",
      "org.apache.logging.log4j.LogManager",
      "org.apache.log4j.Logger$PrivateManager",
      "org.apache.log4j.Category$PrivateFactory",
      "org.apache.log4j.Category",
      "org.apache.manifoldcf.core.interfaces.DBInterfaceFactory",
      "org.apache.manifoldcf.core.interfaces.LockManagerFactory",
      "org.apache.manifoldcf.core.interfaces.ThreadContextFactory",
      "org.apache.manifoldcf.core.threadcontext.ThreadContext",
      "org.apache.manifoldcf.core.system.ManifoldCFResourceLoader",
      "org.apache.manifoldcf.core.interfaces.Configuration",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFConfiguration",
      "org.apache.manifoldcf.core.system.ManifoldCF$OverrideableManifoldCFConfiguration",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFException",
      "org.apache.manifoldcf.core.common.XMLDoc",
      "org.apache.xerces.jaxp.DocumentBuilderFactoryImpl",
      "org.apache.xerces.jaxp.DocumentBuilderImpl",
      "org.apache.xerces.parsers.XMLParser",
      "org.apache.xerces.parsers.AbstractXMLDocumentParser",
      "org.apache.xerces.parsers.AbstractDOMParser",
      "org.apache.xerces.parsers.DOMParser",
      "org.apache.xerces.parsers.SecuritySupport",
      "org.apache.xerces.parsers.SecuritySupport$4",
      "org.apache.xerces.parsers.ObjectFactory",
      "org.apache.xerces.parsers.SecuritySupport$1",
      "org.apache.xerces.parsers.SecuritySupport$2",
      "org.apache.xerces.parsers.SecuritySupport$3",
      "org.apache.xerces.parsers.SecuritySupport$7",
      "org.apache.xerces.parsers.SecuritySupport$6",
      "org.apache.xerces.util.ParserConfigurationSettings",
      "org.apache.xerces.parsers.XML11Configuration",
      "org.apache.xerces.parsers.XIncludeAwareParserConfiguration",
      "org.apache.xerces.util.SymbolTable",
      "org.apache.xerces.impl.XMLEntityManager$1",
      "org.apache.xerces.impl.XMLEntityManager",
      "org.apache.xerces.util.XMLResourceIdentifierImpl",
      "org.apache.xerces.util.AugmentationsImpl",
      "org.apache.xerces.util.AugmentationsImpl$AugmentationsItemsContainer",
      "org.apache.xerces.util.AugmentationsImpl$SmallContainer",
      "org.apache.xerces.impl.XMLEntityManager$ByteBufferPool",
      "org.apache.xerces.impl.XMLEntityManager$CharacterBufferPool",
      "org.apache.xerces.impl.XMLEntityScanner$1",
      "org.apache.xerces.impl.XMLEntityScanner",
      "org.apache.xerces.impl.XMLErrorReporter",
      "org.apache.xerces.impl.XMLScanner",
      "org.apache.xerces.impl.XMLDocumentFragmentScannerImpl",
      "org.apache.xerces.impl.XMLDocumentScannerImpl",
      "org.apache.xerces.impl.XMLNSDocumentScannerImpl",
      "org.apache.xerces.xni.XMLString",
      "org.apache.xerces.util.XMLStringBuffer",
      "org.apache.xerces.impl.XMLDocumentFragmentScannerImpl$ElementStack",
      "org.apache.xerces.xni.QName",
      "org.apache.xerces.impl.XMLDocumentFragmentScannerImpl$FragmentContentDispatcher",
      "org.apache.xerces.impl.XMLDocumentScannerImpl$ContentDispatcher",
      "org.apache.xerces.impl.XMLNSDocumentScannerImpl$NSContentDispatcher",
      "org.apache.xerces.util.XMLAttributesImpl",
      "org.apache.xerces.util.XMLAttributesImpl$Attribute",
      "org.apache.xerces.util.NamespaceSupport",
      "org.apache.xerces.impl.XMLDocumentScannerImpl$XMLDeclDispatcher",
      "org.apache.xerces.impl.XMLDocumentScannerImpl$PrologDispatcher",
      "org.apache.xerces.impl.XMLDocumentScannerImpl$DTDDispatcher",
      "org.apache.xerces.impl.XMLDocumentScannerImpl$TrailingMiscDispatcher",
      "org.apache.xerces.impl.dtd.XMLDTDDescription",
      "org.apache.xerces.impl.XMLDTDScannerImpl",
      "org.apache.xerces.impl.dtd.XMLDTDProcessor",
      "org.apache.xerces.impl.dtd.XMLEntityDecl",
      "org.apache.xerces.impl.dtd.XMLDTDValidator",
      "org.apache.xerces.impl.dtd.XMLNSDTDValidator",
      "org.apache.xerces.impl.validation.ValidationState",
      "org.apache.xerces.impl.dtd.XMLElementDecl",
      "org.apache.xerces.impl.dtd.XMLSimpleType",
      "org.apache.xerces.impl.dtd.XMLAttributeDecl",
      "org.apache.xerces.impl.dtd.DTDGrammarBucket",
      "org.apache.xerces.impl.dv.DTDDVFactory",
      "org.apache.xerces.impl.dv.SecuritySupport",
      "org.apache.xerces.impl.dv.SecuritySupport$4",
      "org.apache.xerces.impl.dv.ObjectFactory",
      "org.apache.xerces.impl.dv.SecuritySupport$1",
      "org.apache.xerces.impl.dv.SecuritySupport$2",
      "org.apache.xerces.impl.dv.SecuritySupport$3",
      "org.apache.xerces.impl.dv.dtd.StringDatatypeValidator",
      "org.apache.xerces.impl.dv.dtd.IDDatatypeValidator",
      "org.apache.xerces.impl.dv.dtd.IDREFDatatypeValidator",
      "org.apache.xerces.impl.dv.dtd.ListDatatypeValidator",
      "org.apache.xerces.impl.dv.dtd.ENTITYDatatypeValidator",
      "org.apache.xerces.impl.dv.dtd.NOTATIONDatatypeValidator",
      "org.apache.xerces.impl.dv.dtd.NMTOKENDatatypeValidator",
      "org.apache.xerces.impl.dv.dtd.DTDDVFactoryImpl",
      "org.apache.xerces.impl.validation.ValidationManager",
      "org.apache.xerces.impl.XMLVersionDetector",
      "org.apache.xerces.impl.msg.XMLMessageFormatter",
      "org.apache.manifoldcf.core.common.XMLDoc$MyEntityResolver",
      "org.apache.xerces.util.EntityResolverWrapper",
      "org.apache.xerces.xni.parser.XMLInputSource",
      "org.apache.xerces.impl.XMLEntityManager$RewindableInputStream",
      "org.apache.xerces.impl.XMLEntityManager$EncodingInfo",
      "org.apache.xerces.impl.io.UTF8Reader",
      "org.apache.xerces.impl.XMLEntityManager$Entity",
      "org.apache.xerces.impl.XMLEntityManager$ScannedEntity",
      "org.apache.xerces.impl.XMLEntityManager$CharacterBuffer",
      "org.apache.xerces.util.XMLSymbols",
      "org.apache.xerces.xni.NamespaceContext",
      "org.apache.xerces.dom.NodeImpl",
      "org.apache.xerces.dom.ChildNode",
      "org.apache.xerces.dom.ParentNode",
      "org.apache.xerces.dom.CoreDocumentImpl",
      "org.apache.xerces.dom.DocumentImpl",
      "org.apache.xerces.dom.DeferredDocumentImpl",
      "org.apache.xerces.dom.DeferredDocumentImpl$RefCount",
      "org.apache.xerces.util.XMLChar",
      "org.apache.xerces.xni.XNIException",
      "org.apache.xerces.xni.parser.XMLParseException",
      "org.apache.xerces.util.DefaultErrorHandler",
      "org.apache.xerces.impl.io.MalformedByteSequenceException"
    );
  }
}
