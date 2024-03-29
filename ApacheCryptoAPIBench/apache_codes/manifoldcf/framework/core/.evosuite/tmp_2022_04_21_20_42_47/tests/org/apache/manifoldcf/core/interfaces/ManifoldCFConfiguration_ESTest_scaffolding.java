/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 20:56:24 GMT 2022
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
public class ManifoldCFConfiguration_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.manifoldcf.core.interfaces.ManifoldCFConfiguration"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ManifoldCFConfiguration_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.xerces.xni.parser.XMLDTDContentModelFilter",
      "org.apache.xerces.impl.XMLDocumentScannerImpl$TrailingMiscDispatcher",
      "org.apache.xerces.impl.dv.SecuritySupport$1",
      "org.apache.xerces.impl.XMLEntityManager$ByteBufferPool",
      "org.apache.xerces.impl.dv.SecuritySupport$2",
      "org.apache.xerces.xs.XSObject",
      "org.apache.manifoldcf.core.interfaces.IPollingHook",
      "org.apache.xerces.impl.dtd.XMLEntityDecl",
      "org.apache.xerces.impl.dv.SecuritySupport$3",
      "org.apache.xerces.impl.dv.SecuritySupport$4",
      "org.apache.xerces.parsers.SecuritySupport$7",
      "org.apache.xerces.util.SymbolTable$Entry",
      "org.apache.xerces.impl.dv.dtd.ENTITYDatatypeValidator",
      "org.apache.xerces.xni.parser.XMLEntityResolver",
      "org.apache.xerces.parsers.SecuritySupport$3",
      "org.apache.xerces.impl.dtd.XMLNSDTDValidator",
      "org.apache.xerces.impl.XMLDTDScannerImpl",
      "org.apache.xerces.impl.dv.dtd.NMTOKENDatatypeValidator",
      "org.apache.xerces.parsers.SecuritySupport$4",
      "org.apache.xerces.parsers.ObjectFactory",
      "org.apache.xerces.parsers.SecuritySupport$6",
      "org.apache.xerces.xni.parser.XMLConfigurationException",
      "org.apache.xerces.parsers.SecuritySupport$1",
      "org.apache.xerces.parsers.SecuritySupport$2",
      "org.apache.xerces.parsers.AbstractDOMParser",
      "org.apache.xerces.impl.XMLEntityManager$CharacterBufferPool",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFException",
      "org.apache.xerces.impl.XMLEntityManager$RewindableInputStream",
      "org.apache.xerces.xni.XMLResourceIdentifier",
      "org.apache.xerces.impl.XMLNSDocumentScannerImpl$NSContentDispatcher",
      "org.apache.xerces.impl.XMLEntityManager",
      "org.apache.xerces.impl.dtd.XMLDTDDescription",
      "org.apache.xerces.xni.parser.XMLInputSource",
      "org.apache.xerces.xni.parser.XMLComponentManager",
      "org.apache.xerces.impl.io.UTF8Reader",
      "org.apache.xerces.impl.dv.InvalidDatatypeValueException",
      "org.apache.xerces.util.EntityResolverWrapper",
      "org.apache.xerces.parsers.AbstractXMLDocumentParser",
      "org.apache.xerces.impl.XMLScanner",
      "org.apache.xerces.impl.dv.dtd.NOTATIONDatatypeValidator",
      "org.apache.xerces.impl.dtd.XMLSimpleType",
      "org.apache.xerces.xni.parser.XMLParseException",
      "org.apache.manifoldcf.core.system.ManifoldCFResourceLoader",
      "org.apache.xerces.util.AugmentationsImpl$AugmentationsItemsContainer",
      "org.apache.xerces.util.URI$MalformedURIException",
      "org.apache.xerces.impl.XMLEntityScanner",
      "org.apache.xerces.impl.XMLNSDocumentScannerImpl",
      "org.apache.xerces.xni.parser.XMLDocumentFilter",
      "org.apache.xerces.xni.parser.XMLDTDSource",
      "org.apache.xerces.impl.dtd.XMLElementDecl",
      "org.apache.xerces.impl.dv.SecuritySupport",
      "org.apache.manifoldcf.core.common.XMLDoc$MyEntityResolver",
      "org.apache.xerces.impl.dtd.XMLAttributeDecl",
      "org.apache.xerces.xni.grammars.Grammar",
      "org.apache.xerces.parsers.XMLParser",
      "org.apache.manifoldcf.core.interfaces.ConfigurationNode",
      "org.apache.xerces.xni.XMLDocumentHandler",
      "org.apache.xerces.util.SymbolTable",
      "org.apache.xerces.impl.io.UCSReader",
      "org.apache.xerces.impl.io.UTF16Reader",
      "org.apache.xerces.impl.XMLEntityManager$CharacterBuffer",
      "org.apache.xerces.impl.io.Latin1Reader",
      "org.apache.xerces.impl.dv.ValidationContext",
      "org.apache.xerces.impl.dtd.XMLDTDValidator",
      "org.apache.xerces.impl.validation.ValidationState",
      "org.apache.xerces.jaxp.DocumentBuilderFactoryImpl",
      "org.apache.xerces.impl.XMLEntityManager$Entity",
      "org.apache.xerces.util.XMLResourceIdentifierImpl",
      "org.apache.xerces.util.AugmentationsImpl",
      "org.apache.xerces.impl.dv.ObjectFactory",
      "org.apache.xerces.impl.dv.DatatypeValidator",
      "org.apache.xerces.xni.NamespaceContext",
      "org.apache.xerces.xs.XSTypeDefinition",
      "org.apache.xerces.parsers.ObjectFactory$ConfigurationError",
      "org.apache.xerces.xni.grammars.XMLGrammarDescription",
      "org.apache.manifoldcf.core.system.ManifoldCF$OverrideableManifoldCFConfiguration",
      "org.apache.manifoldcf.core.interfaces.ThreadContextFactory",
      "org.apache.xerces.impl.XMLDocumentFragmentScannerImpl$FragmentContentDispatcher",
      "org.apache.manifoldcf.core.interfaces.IDBInterface",
      "org.apache.xerces.xni.parser.XMLErrorHandler",
      "org.apache.xerces.impl.io.ASCIIReader",
      "org.apache.xerces.util.MessageFormatter",
      "org.apache.xerces.impl.ExternalSubsetResolver",
      "org.apache.xerces.impl.XMLEntityManager$1",
      "org.apache.xerces.impl.XMLDocumentScannerImpl$PrologDispatcher",
      "org.apache.xerces.impl.dtd.XMLDTDProcessor",
      "org.apache.xerces.impl.XMLDocumentFragmentScannerImpl",
      "org.apache.manifoldcf.core.system.ManifoldCF",
      "org.apache.xerces.parsers.SecuritySupport",
      "org.apache.xerces.xni.parser.XMLDTDScanner",
      "org.apache.xerces.xni.XMLAttributes",
      "org.apache.xerces.impl.dv.dtd.StringDatatypeValidator",
      "org.apache.xerces.impl.io.MalformedByteSequenceException",
      "org.apache.xerces.impl.XML11EntityScanner",
      "org.apache.log4j.Logger",
      "org.apache.manifoldcf.core.interfaces.IHierarchyParent",
      "org.apache.xerces.util.XMLAttributesImpl$Attribute",
      "org.apache.xerces.impl.dtd.DTDGrammar",
      "org.apache.xerces.impl.dv.DTDDVFactory",
      "org.apache.xerces.impl.dv.dtd.IDDatatypeValidator",
      "org.apache.xerces.impl.dv.dtd.IDREFDatatypeValidator",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFConfiguration",
      "org.apache.manifoldcf.core.interfaces.IThreadContext",
      "org.apache.xerces.impl.dv.dtd.DTDDVFactoryImpl",
      "org.apache.xerces.impl.validation.ValidationManager",
      "org.apache.manifoldcf.core.interfaces.IShutdownHook",
      "org.apache.xerces.xni.XNIException",
      "org.apache.xerces.impl.XMLDocumentScannerImpl$DTDDispatcher",
      "org.apache.log4j.Category",
      "org.apache.xerces.impl.dtd.DTDGrammarBucket",
      "org.apache.xerces.impl.msg.XMLMessageFormatter",
      "org.apache.xerces.xni.parser.XMLDocumentScanner",
      "org.apache.xerces.impl.XMLVersionDetector",
      "org.apache.xerces.xni.grammars.XMLGrammarPool",
      "org.apache.xerces.impl.XMLDocumentScannerImpl",
      "org.apache.xerces.xni.parser.XMLPullParserConfiguration",
      "org.apache.xerces.xni.parser.XMLDocumentSource",
      "org.apache.xerces.xs.XSSimpleTypeDefinition",
      "org.apache.xerces.impl.XMLDocumentFragmentScannerImpl$Dispatcher",
      "org.apache.xerces.xni.XMLDTDContentModelHandler",
      "org.apache.xerces.impl.xs.XMLSchemaValidator",
      "org.apache.manifoldcf.core.system.ManifoldCF$ShutdownThread",
      "org.apache.xerces.xni.grammars.XMLDTDDescription",
      "org.apache.xerces.util.AugmentationsImpl$SmallContainer",
      "org.apache.xerces.impl.XMLErrorReporter",
      "org.apache.xerces.impl.XMLDocumentScannerImpl$ContentDispatcher",
      "org.apache.xerces.impl.XMLDocumentScannerImpl$XMLDeclDispatcher",
      "org.apache.xerces.xni.QName",
      "org.apache.xerces.jaxp.TeeXMLDocumentFilterImpl",
      "org.apache.xerces.util.XMLAttributesImpl",
      "org.apache.manifoldcf.core.system.Logging",
      "org.apache.xerces.util.XMLStringBuffer",
      "org.apache.xerces.impl.XMLDocumentFragmentScannerImpl$ElementStack",
      "org.apache.xerces.impl.XMLEntityManager$InternalEntity",
      "org.apache.xerces.util.NamespaceSupport",
      "org.apache.manifoldcf.core.interfaces.Configuration$JSONWriter",
      "org.apache.xerces.jaxp.JAXPConstants",
      "org.apache.xerces.impl.RevalidationHandler",
      "org.apache.xerces.xni.parser.XMLParserConfiguration",
      "org.apache.xerces.xni.XMLString",
      "org.apache.xerces.impl.dv.DVFactoryException",
      "org.apache.xerces.impl.dv.DatatypeException",
      "org.apache.xerces.parsers.XML11Configurable",
      "org.apache.xerces.util.AugmentationsImpl$LargeContainer",
      "org.apache.xerces.impl.dtd.BalancedDTDGrammar",
      "org.apache.xerces.parsers.XIncludeAwareParserConfiguration",
      "org.apache.xerces.xni.XMLDTDHandler",
      "org.apache.xerces.parsers.DOMParser",
      "org.apache.xerces.parsers.XML11Configuration",
      "org.apache.xerces.impl.dtd.XMLDTDValidatorFilter",
      "org.apache.xerces.impl.xs.identity.FieldActivator",
      "org.apache.xerces.impl.XMLEntityScanner$1",
      "org.apache.manifoldcf.core.threadcontext.ThreadContext",
      "org.apache.xerces.xni.parser.XMLDTDContentModelSource",
      "org.apache.xerces.xni.parser.XMLDTDFilter",
      "org.apache.xerces.jaxp.DocumentBuilderImpl",
      "org.apache.xerces.xni.XMLLocator",
      "org.apache.xerces.parsers.AbstractDOMParser$Abort",
      "org.apache.xerces.impl.XMLEntityManager$ExternalEntity",
      "org.apache.xerces.impl.validation.EntityState",
      "org.apache.manifoldcf.core.interfaces.Configuration",
      "org.apache.xerces.util.ParserConfigurationSettings",
      "org.apache.manifoldcf.core.common.XMLDoc",
      "org.apache.xerces.xni.Augmentations",
      "org.apache.xerces.impl.XMLEntityHandler",
      "org.apache.xerces.impl.dv.ObjectFactory$ConfigurationError",
      "org.apache.xerces.xni.parser.XMLComponent",
      "org.apache.manifoldcf.core.interfaces.Configuration$JSONReader",
      "org.apache.xerces.impl.dv.dtd.ListDatatypeValidator",
      "org.apache.xerces.impl.XMLEntityManager$ScannedEntity",
      "org.apache.xerces.jaxp.JAXPValidatorComponent"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ManifoldCFConfiguration_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.manifoldcf.core.interfaces.Configuration",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFConfiguration",
      "org.apache.manifoldcf.core.system.ManifoldCF$ShutdownThread",
      "org.apache.manifoldcf.core.system.ManifoldCF",
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
      "org.apache.xerces.dom.NodeImpl",
      "org.apache.xerces.dom.ChildNode",
      "org.apache.xerces.dom.ParentNode",
      "org.apache.xerces.dom.CoreDocumentImpl",
      "org.apache.xerces.dom.DocumentImpl",
      "org.apache.xerces.util.XMLChar",
      "org.apache.xerces.dom.ElementImpl",
      "org.apache.xalan.processor.TransformerFactoryImpl",
      "org.apache.xml.utils.DefaultErrorHandler",
      "org.apache.xalan.transformer.TransformerIdentityImpl",
      "org.apache.xml.utils.UnImplNode",
      "org.apache.xalan.templates.ElemTemplateElement",
      "org.apache.xalan.templates.OutputProperties",
      "org.apache.xml.serializer.SerializerBase",
      "org.apache.xml.serializer.OutputPropertiesFactory",
      "org.apache.xml.serializer.OutputPropertiesFactory$1",
      "org.apache.xml.serializer.SerializerFactory",
      "org.apache.xml.serializer.ObjectFactory",
      "org.apache.xml.serializer.SecuritySupport12",
      "org.apache.xml.serializer.SecuritySupport",
      "org.apache.xml.serializer.SecuritySupport12$1",
      "org.apache.xml.serializer.SecuritySupport12$2",
      "org.apache.xml.serializer.SecuritySupport12$3",
      "org.apache.xml.serializer.SecuritySupport12$4",
      "org.apache.xml.serializer.ToStream",
      "org.apache.xml.serializer.ToXMLStream",
      "org.apache.xml.serializer.AttributesImplSerializer",
      "org.apache.xml.serializer.ElemContext",
      "org.apache.xml.serializer.ToStream$BoolStack",
      "org.apache.xml.serializer.EncodingInfo",
      "org.apache.xml.serializer.CharInfo",
      "org.apache.xml.serializer.CharInfo$1",
      "org.apache.xml.serializer.CharInfo$CharKey",
      "org.apache.xml.serializer.NamespaceMappings",
      "org.apache.xml.serializer.NamespaceMappings$Stack",
      "org.apache.xml.serializer.NamespaceMappings$MappingRecord",
      "org.apache.xml.serializer.SecuritySupport12$6",
      "org.apache.xml.serializer.Encodings",
      "org.apache.xml.serializer.WriterToUTF8Buffered",
      "org.apache.xml.serializer.TreeWalker",
      "org.apache.xml.serializer.utils.DOM2Helper",
      "org.apache.xerces.dom.NamedNodeMapImpl",
      "org.apache.xerces.dom.AttributeMap",
      "org.apache.xml.serializer.utils.AttList",
      "org.apache.xalan.transformer.SerializerSwitcher",
      "org.apache.xerces.xni.parser.XMLInputSource",
      "org.apache.xerces.impl.XMLEntityManager$RewindableInputStream",
      "org.apache.xerces.impl.XMLEntityManager$EncodingInfo",
      "org.apache.xerces.impl.io.UTF8Reader",
      "org.apache.xerces.impl.XMLEntityManager$Entity",
      "org.apache.xerces.impl.XMLEntityManager$ScannedEntity",
      "org.apache.xerces.impl.XMLEntityManager$CharacterBuffer",
      "org.apache.xerces.util.XMLSymbols",
      "org.apache.xerces.xni.NamespaceContext",
      "org.apache.xerces.dom.DeferredDocumentImpl",
      "org.apache.xerces.dom.DeferredDocumentImpl$RefCount",
      "org.apache.xerces.xni.XNIException",
      "org.apache.xerces.xni.parser.XMLParseException",
      "org.apache.xerces.util.DefaultErrorHandler",
      "org.apache.manifoldcf.core.system.Logging",
      "org.apache.manifoldcf.core.interfaces.Configuration$JSONWriter",
      "org.json.simple.JSONObject",
      "org.apache.manifoldcf.core.interfaces.ConfigurationNode",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFException",
      "org.apache.manifoldcf.core.interfaces.Configuration$JSONReader",
      "org.json.simple.parser.JSONParser",
      "org.json.simple.parser.Yylex",
      "org.json.simple.parser.ParseException",
      "org.json.simple.parser.Yytoken",
      "org.apache.xerces.dom.DOMMessageFormatter",
      "org.apache.xerces.parsers.SecuritySupport$8",
      "org.apache.xerces.parsers.SecuritySupport$5",
      "org.apache.xerces.impl.io.MalformedByteSequenceException",
      "org.apache.manifoldcf.core.interfaces.ThreadContextFactory",
      "org.apache.manifoldcf.core.threadcontext.ThreadContext"
    );
  }
}
