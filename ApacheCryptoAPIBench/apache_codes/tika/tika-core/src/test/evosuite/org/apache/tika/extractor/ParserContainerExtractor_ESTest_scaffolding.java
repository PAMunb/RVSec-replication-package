/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Apr 16 13:52:20 GMT 2022
 */

package org.apache.tika.extractor;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ParserContainerExtractor_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.tika.extractor.ParserContainerExtractor"; 
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
    java.lang.System.setProperty("user.dir", "/pedro/desenvolvimento/workspaces/workspaces-doutorado/workspace-rv/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/tika/tika-core"); 
    java.lang.System.setProperty("user.home", "/home/pedro"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "pedro"); 
    java.lang.System.setProperty("user.timezone", "America/Sao_Paulo"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ParserContainerExtractor_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.tika.detect.DefaultProbDetector",
      "org.apache.tika.detect.TrainedModel",
      "org.apache.tika.metadata.TikaCoreProperties$EmbeddedResourceType",
      "org.apache.tika.parser.digest.InputStreamDigester",
      "org.apache.tika.mime.MediaTypeRegistry",
      "org.apache.tika.metadata.TikaMetadataKeys",
      "org.apache.tika.io.TikaInputStream$1",
      "org.apache.tika.metadata.Metadata",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.apache.tika.metadata.Property",
      "org.apache.tika.extractor.ParserContainerExtractor$RecursiveParser",
      "org.apache.tika.sax.ContentHandlerFactory",
      "org.apache.tika.sax.xpath.SubtreeMatcher",
      "org.apache.tika.detect.NameDetector",
      "org.hsqldb.jdbc.JDBCDriver$1",
      "org.apache.tika.config.InitializableProblemHandler",
      "org.apache.tika.sax.ToHTMLContentHandler",
      "org.apache.tika.sax.xpath.NamedElementMatcher",
      "org.apache.tika.detect.MagicDetector",
      "org.apache.tika.detect.NNTrainedModelBuilder",
      "org.apache.tika.io.TaggedInputStream",
      "org.apache.tika.parser.CompositeParser",
      "org.apache.tika.config.TikaConfig$TranslatorXmlLoader",
      "org.apache.tika.mime.ProbabilisticMimeDetectionSelector$Builder",
      "org.apache.tika.sax.WriteOutContentHandler$WriteLimitReachedException",
      "aQute.libg.generics.Create",
      "org.apache.tika.metadata.OfficeOpenXMLExtended",
      "org.apache.tika.metadata.Geographic",
      "org.apache.tika.io.CloseShieldInputStream",
      "org.apache.tika.detect.CompositeEncodingDetector",
      "org.apache.tika.utils.XMLReaderUtils$1",
      "org.apache.tika.parser.DefaultParser",
      "org.apache.tika.utils.XMLReaderUtils$2",
      "org.apache.tika.sax.xpath.Matcher",
      "org.apache.tika.detect.OverrideDetector",
      "org.apache.tika.config.Initializable",
      "org.apache.tika.config.TikaConfig$XmlLoader",
      "org.apache.tika.parser.mock.MockParser",
      "org.apache.tika.io.ProxyInputStream",
      "org.apache.tika.config.ServiceLoader",
      "org.apache.tika.detect.CompositeDetector",
      "org.apache.tika.mime.MagicMatch",
      "org.apache.tika.mime.OrClause",
      "org.apache.tika.sax.BodyContentHandler",
      "aQute.lib.osgi.Instruction",
      "org.apache.tika.metadata.CreativeCommons",
      "org.apache.tika.config.TikaConfig",
      "org.apache.tika.sax.SafeContentHandler$1",
      "org.apache.tika.sax.SafeContentHandler$2",
      "org.apache.tika.mime.MediaType",
      "org.apache.tika.mime.Clause",
      "org.apache.tika.parser.AbstractParser",
      "org.apache.tika.exception.TikaException",
      "org.apache.tika.parser.DelegatingParser",
      "org.apache.tika.mime.Magic",
      "org.apache.tika.parser.RecursiveParserWrapper$EmbeddedParserDecorator",
      "org.apache.tika.utils.ServiceLoaderUtils",
      "org.apache.tika.sax.xpath.XPathParser",
      "org.apache.tika.parser.EmptyParser",
      "org.apache.tika.config.LoadErrorHandler",
      "org.apache.tika.parser.DigestingParser",
      "org.apache.tika.utils.DateUtils",
      "org.apache.tika.metadata.TIFF",
      "org.apache.tika.sax.XHTMLContentHandler",
      "org.apache.tika.TikaTest$TrackingHandler",
      "org.apache.tika.metadata.OfficeOpenXMLCore",
      "org.apache.tika.config.InitializableProblemHandler$4",
      "org.apache.tika.config.InitializableProblemHandler$3",
      "org.apache.tika.config.InitializableProblemHandler$2",
      "org.apache.tika.utils.XMLReaderUtils",
      "org.apache.tika.sax.WriteOutContentHandler",
      "org.apache.tika.config.InitializableProblemHandler$1",
      "org.apache.tika.detect.Detector",
      "org.apache.tika.config.TikaConfig$EncodingDetectorXmlLoader",
      "org.apache.tika.metadata.TikaCoreProperties",
      "org.apache.tika.config.TikaConfig$DetectorXmlLoader",
      "org.apache.tika.detect.TypeDetector",
      "org.apache.tika.config.LoadErrorHandler$2",
      "org.apache.tika.concurrent.ConfigurableThreadPoolExecutor",
      "org.apache.tika.config.LoadErrorHandler$1",
      "org.apache.tika.mime.MimeTypesReader",
      "org.apache.tika.config.LoadErrorHandler$3",
      "org.apache.tika.mime.MimeTypeException",
      "org.apache.tika.detect.DefaultDetector",
      "org.apache.tika.config.TikaConfig$ParserXmlLoader",
      "org.apache.tika.mime.MimeType",
      "org.apache.tika.sax.xpath.NodeMatcher",
      "org.apache.tika.sax.SafeContentHandler",
      "org.apache.tika.parser.Parser",
      "org.apache.tika.sax.xpath.ChildMatcher",
      "org.apache.tika.metadata.XMP",
      "org.apache.tika.detect.TrainedModelDetector",
      "org.apache.tika.parser.DummyParameterizedParser",
      "org.apache.tika.sax.SafeContentHandler$Output",
      "org.apache.tika.utils.ServiceLoaderUtils$1",
      "org.apache.tika.metadata.ClimateForcast",
      "org.apache.tika.parser.ParserDecorator$2",
      "org.apache.tika.parser.DigestingParser$Digester",
      "org.apache.tika.mime.MimeType$RootXML",
      "org.apache.tika.parser.ParserDecorator$1",
      "org.apache.tika.metadata.Property$ValueType",
      "org.apache.tika.mime.MimeTypesReaderMetKeys",
      "org.apache.tika.exception.TikaConfigException",
      "org.apache.tika.parser.ErrorParser",
      "org.apache.tika.sax.ToXMLContentHandler",
      "org.apache.tika.io.TaggedIOException",
      "org.apache.tika.io.TemporaryResources",
      "org.apache.tika.mime.AndClause",
      "org.apache.tika.exception.ZeroByteFileException",
      "org.apache.tika.extractor.ContainerExtractor",
      "org.apache.tika.metadata.DublinCore",
      "org.apache.tika.parser.AutoDetectParser",
      "org.apache.tika.parser.RecursiveParserWrapper",
      "org.apache.tika.TikaTest$ByteCopyingHandler",
      "org.apache.tika.extractor.EmbeddedResourceHandler",
      "org.apache.tika.parser.ParseContext",
      "org.apache.tika.sax.ToTextContentHandler",
      "org.apache.tika.parser.digest.InputStreamDigester$SimpleBoundedInputStream",
      "org.apache.tika.sax.ContentHandlerDecorator",
      "org.apache.tika.detect.DefaultEncodingDetector",
      "org.apache.tika.sax.BasicContentHandlerFactory$HANDLER_TYPE",
      "org.apache.tika.detect.TextDetector",
      "org.apache.tika.detect.EmptyDetector",
      "org.apache.tika.metadata.Property$PropertyType",
      "org.apache.tika.mime.Patterns$LengthComparator",
      "org.apache.tika.extractor.EmbeddedDocumentExtractor",
      "org.apache.tika.parser.DummyInitializableParser",
      "org.apache.tika.detect.ZeroSizeFileDetector",
      "org.apache.tika.io.FilenameUtils",
      "org.apache.tika.mime.Patterns",
      "org.apache.tika.parser.ParserDecorator",
      "org.apache.tika.metadata.Office",
      "org.apache.tika.io.TikaInputStream",
      "org.apache.tika.TikaTest$XMLResult",
      "org.apache.tika.parser.AbstractEncodingDetectorParser",
      "org.apache.tika.sax.xpath.CompositeMatcher",
      "org.apache.tika.io.IOExceptionWithCause",
      "org.apache.tika.metadata.Message",
      "org.apache.tika.parser.DummyParser",
      "org.apache.tika.parser.NetworkParser",
      "org.apache.tika.parser.NetworkParser$1",
      "org.apache.tika.detect.TextStatistics",
      "org.apache.tika.config.TikaConfig$ExecutorServiceXmlLoader",
      "org.apache.tika.parser.ParserPostProcessor",
      "org.apache.tika.mime.MimeTypesReader$ClauseRecord",
      "org.apache.tika.detect.NNExampleModelDetector",
      "org.apache.tika.extractor.ParserContainerExtractor",
      "org.apache.tika.mime.MimeTypesFactory",
      "org.apache.tika.TikaTest",
      "org.apache.tika.sax.BasicContentHandlerFactory",
      "org.apache.tika.detect.NNTrainedModel",
      "org.apache.tika.metadata.TikaMimeKeys",
      "org.apache.tika.language.translate.Translator",
      "org.apache.tika.metadata.MSOffice",
      "org.apache.tika.mime.MimeTypes",
      "org.apache.tika.detect.EncodingDetector",
      "org.apache.tika.sax.xpath.TextMatcher",
      "org.apache.tika.metadata.PropertyTypeException",
      "org.apache.tika.metadata.HttpHeaders",
      "org.apache.tika.sax.xpath.NamedAttributeMatcher",
      "org.apache.tika.mime.ProbabilisticMimeDetectionSelector"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ParserContainerExtractor_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.tika.extractor.ParserContainerExtractor",
      "org.apache.tika.parser.AbstractParser",
      "org.apache.tika.extractor.ParserContainerExtractor$RecursiveParser",
      "org.apache.tika.config.ServiceLoader",
      "org.apache.tika.config.InitializableProblemHandler$1",
      "org.apache.tika.config.InitializableProblemHandler$2",
      "org.apache.tika.config.InitializableProblemHandler$3",
      "org.apache.tika.config.InitializableProblemHandler$4",
      "org.apache.tika.config.InitializableProblemHandler",
      "org.apache.tika.config.TikaConfig",
      "org.apache.tika.parser.CompositeParser",
      "org.apache.tika.parser.AutoDetectParser",
      "org.apache.tika.detect.CompositeDetector",
      "org.apache.tika.detect.DefaultDetector",
      "org.apache.tika.mime.MimeTypes",
      "org.apache.tika.mime.MimeTypesFactory",
      "org.apache.tika.mime.MediaTypeRegistry",
      "org.apache.tika.mime.Patterns",
      "org.apache.tika.mime.Patterns$LengthComparator",
      "org.apache.tika.mime.MimeType",
      "org.apache.tika.mime.MediaType",
      "org.apache.tika.mime.MimeTypesReader",
      "org.apache.tika.mime.MimeTypesReader$ClauseRecord",
      "org.apache.tika.mime.MagicMatch",
      "org.apache.tika.mime.Magic",
      "org.apache.tika.mime.MimeType$RootXML",
      "org.apache.tika.mime.AndClause",
      "org.apache.tika.mime.OrClause",
      "org.apache.tika.config.LoadErrorHandler$1",
      "org.apache.tika.config.LoadErrorHandler$2",
      "org.apache.tika.config.LoadErrorHandler$3",
      "org.apache.tika.config.LoadErrorHandler",
      "org.apache.tika.parser.DefaultParser",
      "org.apache.tika.io.TemporaryResources",
      "org.apache.tika.detect.CompositeEncodingDetector",
      "org.apache.tika.detect.DefaultEncodingDetector",
      "org.apache.tika.utils.ServiceLoaderUtils",
      "org.apache.tika.utils.ServiceLoaderUtils$1",
      "org.apache.tika.parser.EmptyParser",
      "org.apache.tika.sax.BasicContentHandlerFactory",
      "org.apache.tika.metadata.Property",
      "org.apache.tika.metadata.Property$ValueType",
      "org.apache.tika.metadata.Property$PropertyType",
      "org.apache.tika.parser.RecursiveParserWrapper",
      "org.apache.tika.detect.TrainedModelDetector",
      "org.apache.tika.detect.NNExampleModelDetector",
      "org.apache.tika.detect.NNTrainedModelBuilder",
      "org.apache.tika.detect.TrainedModel",
      "org.apache.tika.detect.NNTrainedModel",
      "org.apache.tika.utils.DateUtils",
      "org.apache.tika.metadata.Metadata",
      "org.apache.tika.io.ProxyInputStream",
      "org.apache.tika.io.TaggedInputStream",
      "org.apache.tika.io.TikaInputStream",
      "org.apache.tika.detect.MagicDetector",
      "org.apache.tika.utils.XMLReaderUtils$1",
      "org.apache.tika.utils.XMLReaderUtils$2",
      "org.apache.tika.utils.XMLReaderUtils",
      "org.apache.tika.parser.ParserDecorator",
      "org.apache.tika.parser.ParserDecorator$1",
      "org.apache.tika.parser.ParserDecorator$2",
      "org.apache.tika.parser.DigestingParser",
      "org.apache.tika.parser.DummyInitializableParser",
      "org.apache.tika.detect.TextDetector",
      "org.apache.tika.config.TikaConfig$XmlLoader",
      "org.apache.tika.config.TikaConfig$DetectorXmlLoader",
      "org.apache.tika.config.TikaConfig$TranslatorXmlLoader",
      "org.apache.tika.config.TikaConfig$ExecutorServiceXmlLoader",
      "org.apache.tika.config.TikaConfig$EncodingDetectorXmlLoader",
      "org.apache.tika.parser.NetworkParser",
      "org.apache.tika.parser.ParseContext",
      "org.apache.tika.parser.DummyParser",
      "org.apache.tika.detect.TypeDetector",
      "org.apache.tika.parser.ParserPostProcessor",
      "org.apache.tika.parser.DelegatingParser",
      "org.apache.tika.parser.ErrorParser",
      "org.apache.tika.parser.digest.InputStreamDigester",
      "org.apache.tika.detect.ZeroSizeFileDetector",
      "org.apache.tika.detect.OverrideDetector",
      "org.apache.tika.metadata.DublinCore",
      "org.apache.tika.metadata.Office",
      "org.apache.tika.metadata.XMP",
      "org.apache.tika.metadata.MSOffice",
      "org.apache.tika.metadata.Geographic",
      "org.apache.tika.metadata.OfficeOpenXMLExtended",
      "org.apache.tika.metadata.OfficeOpenXMLCore",
      "org.apache.tika.metadata.TikaCoreProperties$EmbeddedResourceType",
      "org.apache.tika.metadata.TikaCoreProperties",
      "org.apache.tika.TikaTest$TrackingHandler",
      "org.apache.tika.sax.ContentHandlerDecorator",
      "org.apache.tika.sax.SafeContentHandler",
      "org.apache.tika.sax.XHTMLContentHandler",
      "org.apache.tika.sax.SafeContentHandler$1",
      "org.apache.tika.sax.SafeContentHandler$2",
      "org.apache.tika.detect.DefaultProbDetector",
      "org.apache.tika.detect.TextStatistics",
      "org.apache.tika.detect.NameDetector",
      "org.apache.tika.parser.DummyParameterizedParser",
      "org.apache.tika.sax.WriteOutContentHandler",
      "org.apache.tika.sax.ToTextContentHandler",
      "org.apache.tika.sax.ToXMLContentHandler",
      "org.apache.tika.mime.ProbabilisticMimeDetectionSelector$Builder",
      "org.apache.tika.mime.ProbabilisticMimeDetectionSelector",
      "aQute.lib.osgi.Instruction",
      "aQute.libg.generics.Create",
      "org.apache.tika.parser.AbstractEncodingDetectorParser",
      "org.apache.tika.sax.xpath.XPathParser",
      "org.apache.tika.sax.xpath.Matcher",
      "org.apache.tika.sax.xpath.ChildMatcher",
      "org.apache.tika.sax.xpath.NamedElementMatcher",
      "org.apache.tika.sax.xpath.CompositeMatcher",
      "org.apache.tika.sax.xpath.TextMatcher",
      "org.apache.tika.sax.xpath.SubtreeMatcher",
      "org.apache.tika.sax.xpath.NodeMatcher",
      "org.apache.tika.sax.BodyContentHandler",
      "org.apache.tika.parser.RecursiveParserWrapper$EmbeddedParserDecorator",
      "org.apache.tika.io.FilenameUtils",
      "org.apache.tika.metadata.PropertyTypeException",
      "org.apache.tika.parser.mock.MockParser",
      "org.apache.tika.TikaTest$ByteCopyingHandler",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.apache.tika.metadata.Message",
      "org.apache.tika.detect.EmptyDetector",
      "org.apache.tika.sax.ToHTMLContentHandler"
    );
  }
}
