/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 16:35:52 GMT 2022
 */

package org.apache.manifoldcf.core.database;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DBInterfaceMySQL_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.manifoldcf.core.database.DBInterfaceMySQL"; 
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
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
    java.lang.System.setProperty("user.dir", "/home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/manifoldcf/framework/core"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DBInterfaceMySQL_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.manifoldcf.core.interfaces.ResultSpecification",
      "org.apache.manifoldcf.core.interfaces.IResultRow",
      "org.apache.manifoldcf.core.database.DBInterfaceMySQL$TableStatistics",
      "org.apache.manifoldcf.core.interfaces.ClauseDescription",
      "org.apache.manifoldcf.core.database.Database",
      "org.apache.manifoldcf.core.system.ManifoldCF",
      "org.apache.manifoldcf.core.interfaces.IPollingHook",
      "org.apache.manifoldcf.core.database.DBInterfaceMySQL",
      "org.apache.manifoldcf.core.interfaces.IHierarchyParent",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFConfiguration",
      "org.apache.manifoldcf.core.interfaces.IThreadContext",
      "org.apache.manifoldcf.core.threadcontext.ThreadContext",
      "org.apache.manifoldcf.core.interfaces.IShutdownHook",
      "org.apache.manifoldcf.core.interfaces.IndexDescription",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFException",
      "org.apache.manifoldcf.core.interfaces.ICacheExecutor",
      "org.apache.manifoldcf.core.interfaces.ColumnDescription",
      "org.apache.manifoldcf.core.interfaces.LockManagerFactory",
      "org.apache.manifoldcf.core.interfaces.Configuration",
      "org.apache.manifoldcf.core.system.ManifoldCF$ShutdownThread",
      "org.apache.manifoldcf.core.interfaces.ICacheDescription",
      "org.apache.manifoldcf.core.interfaces.StringSet",
      "org.apache.manifoldcf.core.interfaces.IResultSet",
      "org.apache.manifoldcf.core.system.ManifoldCF$OverrideableManifoldCFConfiguration",
      "org.apache.manifoldcf.core.interfaces.ThreadContextFactory",
      "org.apache.manifoldcf.core.system.ManifoldCFResourceLoader",
      "org.apache.manifoldcf.core.interfaces.IDBInterface",
      "org.apache.manifoldcf.core.interfaces.ILimitChecker"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DBInterfaceMySQL_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.manifoldcf.core.database.Database",
      "org.apache.manifoldcf.core.database.DBInterfaceMySQL",
      "org.apache.manifoldcf.core.database.DBInterfaceMySQL$TableStatistics",
      "org.apache.manifoldcf.core.system.ManifoldCF$ShutdownThread",
      "org.apache.manifoldcf.core.system.ManifoldCF",
      "org.apache.manifoldcf.core.system.Logging",
      "org.apache.manifoldcf.core.interfaces.IDFactory",
      "org.apache.manifoldcf.core.threadcontext.ThreadContext",
      "org.apache.manifoldcf.core.interfaces.LockManagerFactory",
      "org.apache.manifoldcf.core.interfaces.ColumnDescription",
      "org.apache.manifoldcf.core.database.DBInterfacePostgreSQL",
      "org.apache.manifoldcf.core.database.DBInterfaceMariaDB",
      "org.apache.manifoldcf.core.interfaces.StringSet",
      "org.apache.manifoldcf.core.interfaces.IndexDescription",
      "org.hsqldb.ClientConnection",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.hsqldb.rowio.RowOutputBase",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.hsqldb.lib.HsqlByteArrayInputStream",
      "org.hsqldb.rowio.RowInputBase",
      "org.hsqldb.rowio.RowInputBinary",
      "org.hsqldb.HsqlNameManager$SimpleName",
      "org.hsqldb.HsqlNameManager$HsqlName",
      "org.hsqldb.HsqlNameManager",
      "org.hsqldb.SqlInvariants",
      "org.hsqldb.types.Charset",
      "org.hsqldb.map.BaseHashMap",
      "org.hsqldb.lib.HashMap",
      "org.hsqldb.map.HashIndex",
      "org.hsqldb.lib.HashMap$Values",
      "org.hsqldb.map.BaseHashMap$BaseHashIterator",
      "org.hsqldb.types.Collation",
      "org.hsqldb.result.ResultMetaData",
      "org.hsqldb.ColumnBase",
      "org.hsqldb.types.NullType",
      "org.hsqldb.types.CharacterType",
      "org.hsqldb.types.ClobType",
      "org.hsqldb.types.BinaryType",
      "org.hsqldb.types.BitType",
      "org.hsqldb.types.BlobType",
      "org.hsqldb.types.OtherType",
      "org.hsqldb.types.BooleanType",
      "org.hsqldb.types.NumberType",
      "org.hsqldb.lib.IntKeyIntValueHashMap",
      "org.hsqldb.types.DTIType",
      "org.hsqldb.HsqlDateTime",
      "org.hsqldb.types.TimestampData",
      "org.hsqldb.types.DateTimeType",
      "org.hsqldb.types.IntervalType",
      "org.hsqldb.types.ArrayType",
      "org.hsqldb.lib.IntValueHashMap",
      "org.hsqldb.lib.IntKeyHashMap",
      "org.hsqldb.types.Type",
      "org.hsqldb.navigator.RowSetNavigator",
      "org.hsqldb.navigator.RowSetNavigatorClient",
      "org.hsqldb.result.Result",
      "org.hsqldb.server.HsqlSocketFactory",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.ResourceBundleHandler",
      "org.hsqldb.error.Error",
      "org.hsqldb.lib.StringUtil",
      "org.hsqldb.HsqlException",
      "org.hsqldb.jdbc.JDBCArrayBasic",
      "org.hsqldb.jdbc.JDBCClobClient",
      "org.hsqldb.jdbc.JDBCResultSet",
      "org.hsqldb.jdbc.JDBCResultSet$JDBCResultSetBasic",
      "org.apache.xml.dtm.ref.CoroutineManager",
      "org.apache.xml.dtm.ref.IncrementalSAXSource_Filter",
      "org.apache.xml.res.XMLMessages",
      "org.apache.xml.res.XMLErrorResources",
      "org.apache.xml.res.XMLErrorResources_en",
      "org.apache.xerces.impl.xs.XSComplexTypeDecl",
      "org.apache.xerces.impl.xs.SchemaGrammar$XSAnyType",
      "org.apache.xerces.impl.xs.SchemaSymbols",
      "org.apache.xerces.impl.xs.SchemaGrammar$BuiltinSchemaGrammar",
      "org.apache.xerces.impl.dv.SchemaDVFactory",
      "org.apache.xerces.impl.dv.SecuritySupport",
      "org.apache.xerces.impl.dv.SecuritySupport$4",
      "org.apache.xerces.impl.dv.ObjectFactory",
      "org.apache.xerces.impl.dv.SecuritySupport$1",
      "org.apache.xerces.impl.dv.SecuritySupport$2",
      "org.apache.xerces.impl.dv.SecuritySupport$3",
      "org.apache.xerces.impl.dv.xs.BaseSchemaDVFactory",
      "org.apache.xerces.util.SymbolHash",
      "org.apache.xerces.impl.dv.xs.TypeValidator",
      "org.apache.xerces.impl.dv.xs.AnySimpleDV",
      "org.apache.xerces.impl.dv.xs.StringDV",
      "org.apache.xerces.impl.dv.xs.BooleanDV",
      "org.apache.xerces.impl.dv.xs.DecimalDV",
      "org.apache.xerces.impl.dv.xs.FloatDV",
      "org.apache.xerces.impl.dv.xs.DoubleDV",
      "org.apache.xerces.jaxp.datatype.DatatypeFactoryImpl",
      "org.apache.xerces.impl.dv.xs.AbstractDateTimeDV",
      "org.apache.xerces.impl.dv.xs.AbstractDateTimeDV$DateTimeData",
      "org.apache.xerces.impl.dv.xs.DurationDV",
      "org.apache.xerces.impl.dv.xs.DateTimeDV",
      "org.apache.xerces.impl.dv.xs.TimeDV",
      "org.apache.xerces.impl.dv.xs.DateDV",
      "org.apache.xerces.impl.dv.xs.YearMonthDV",
      "org.apache.xerces.impl.dv.xs.YearDV",
      "org.apache.xerces.impl.dv.xs.MonthDayDV",
      "org.apache.xerces.impl.dv.xs.DayDV",
      "org.apache.xerces.impl.dv.xs.MonthDV",
      "org.apache.xerces.impl.dv.xs.HexBinaryDV",
      "org.apache.xerces.impl.dv.xs.Base64BinaryDV",
      "org.apache.xerces.util.URI",
      "org.apache.xerces.impl.dv.xs.AnyURIDV",
      "org.apache.xerces.impl.dv.xs.QNameDV",
      "org.apache.xerces.impl.dv.xs.PrecisionDecimalDV",
      "org.apache.xerces.impl.dv.xs.IDDV",
      "org.apache.xerces.impl.dv.xs.IDREFDV",
      "org.apache.xerces.impl.dv.xs.EntityDV",
      "org.apache.xerces.impl.dv.xs.IntegerDV",
      "org.apache.xerces.impl.dv.xs.ListDV",
      "org.apache.xerces.impl.dv.xs.UnionDV",
      "org.apache.xerces.impl.dv.xs.YearMonthDurationDV",
      "org.apache.xerces.impl.dv.xs.DayTimeDurationDV",
      "org.apache.xerces.impl.dv.xs.AnyAtomicDV",
      "org.apache.xerces.impl.dv.xs.XSSimpleTypeDecl$1",
      "org.apache.xerces.impl.dv.xs.XSSimpleTypeDecl$2",
      "org.apache.xerces.impl.dv.xs.XSSimpleTypeDecl",
      "org.apache.xerces.impl.dv.XSFacets",
      "org.apache.xerces.util.SymbolHash$Entry",
      "org.apache.xerces.impl.dv.ValidatedInfo",
      "org.apache.xerces.util.XMLChar",
      "org.apache.xerces.impl.dv.xs.DecimalDV$XDecimal",
      "org.apache.xerces.impl.dv.DatatypeException",
      "org.apache.xerces.impl.dv.InvalidDatatypeValueException",
      "org.apache.xerces.impl.dv.InvalidDatatypeFacetException",
      "org.apache.xerces.impl.dv.xs.SchemaDVFactoryImpl",
      "org.apache.xerces.impl.xs.SchemaGrammar",
      "org.hsqldb.ClientConnectionHTTP",
      "org.hsqldb.lib.DataOutputStream",
      "org.hsqldb.lib.StringConverter",
      "org.apache.xerces.impl.xs.XSWildcardDecl",
      "org.apache.xerces.impl.xs.util.XSObjectListImpl$1",
      "org.apache.xerces.impl.xs.util.XSObjectListImpl",
      "org.apache.xerces.impl.xs.XSDeclarationPool",
      "org.apache.log4j.Category$PrivateFactory",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
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
      "org.apache.logging.log4j.util.ReflectionUtil$PrivateSecurityManager",
      "org.apache.logging.log4j.util.ReflectionUtil",
      "org.apache.logging.log4j.core.AbstractLifeCycle",
      "org.apache.logging.log4j.core.filter.AbstractFilterable",
      "org.apache.logging.log4j.core.config.AbstractConfiguration",
      "org.apache.logging.log4j.core.config.NullConfiguration",
      "org.apache.logging.log4j.core.config.ConfigurationSource",
      "org.apache.logging.log4j.core.config.DefaultConfigurationMonitor",
      "org.apache.logging.log4j.core.config.DefaultAdvertiser",
      "org.apache.logging.log4j.core.lookup.AbstractLookup",
      "org.apache.logging.log4j.core.lookup.Interpolator",
      "org.apache.logging.log4j.core.lookup.MapLookup",
      "org.apache.logging.log4j.core.lookup.Log4jLookup",
      "org.apache.logging.log4j.core.lookup.SystemPropertiesLookup",
      "org.apache.logging.log4j.core.lookup.EnvironmentLookup",
      "org.apache.logging.log4j.core.lookup.MainMapLookup",
      "org.apache.logging.log4j.core.lookup.MarkerLookup",
      "org.apache.logging.log4j.core.lookup.JavaLookup",
      "org.apache.logging.log4j.core.util.Loader",
      "org.apache.logging.log4j.core.lookup.JndiLookup",
      "org.apache.logging.log4j.core.lookup.JmxRuntimeInputArgumentsLookup",
      "org.apache.logging.log4j.core.lookup.DateLookup",
      "org.apache.logging.log4j.core.lookup.ContextMapLookup",
      "org.apache.logging.log4j.core.lookup.StrMatcher$CharMatcher",
      "org.apache.logging.log4j.core.lookup.StrMatcher$CharSetMatcher",
      "org.apache.logging.log4j.core.lookup.StrMatcher$TrimMatcher",
      "org.apache.logging.log4j.core.lookup.StrMatcher$NoMatcher",
      "org.apache.logging.log4j.core.lookup.StrMatcher",
      "org.apache.logging.log4j.util.Strings",
      "org.apache.logging.log4j.core.lookup.StrMatcher$StringMatcher",
      "org.apache.logging.log4j.core.lookup.StrSubstitutor",
      "org.apache.logging.log4j.core.impl.DefaultLogEventFactory",
      "org.apache.logging.log4j.core.config.LoggerConfig",
      "org.apache.logging.log4j.core.config.DefaultReliabilityStrategy",
      "org.apache.logging.log4j.core.config.plugins.util.PluginManager",
      "org.apache.logging.log4j.core.config.Node",
      "org.apache.logging.log4j.core.LoggerContext",
      "org.apache.logging.log4j.core.config.DefaultConfiguration",
      "org.apache.logging.log4j.core.layout.AbstractLayout",
      "org.apache.logging.log4j.core.layout.AbstractStringLayout",
      "org.apache.logging.log4j.core.layout.PatternLayout",
      "org.apache.logging.log4j.core.layout.PatternLayout$Builder",
      "org.apache.logging.log4j.core.layout.PatternLayout$PatternSerializer",
      "org.apache.logging.log4j.core.pattern.PatternParser",
      "org.apache.logging.log4j.core.config.plugins.util.PluginRegistry",
      "org.apache.logging.log4j.core.config.plugins.processor.PluginCache",
      "org.apache.logging.log4j.core.config.plugins.processor.PluginEntry",
      "org.apache.logging.log4j.core.util.Closer",
      "org.apache.logging.log4j.core.config.plugins.util.PluginType",
      "org.apache.logging.log4j.core.pattern.PatternParser$ParserState",
      "org.apache.logging.log4j.core.pattern.FormattingInfo",
      "org.apache.logging.log4j.core.pattern.PatternParser$1",
      "org.apache.logging.log4j.core.pattern.AbstractPatternConverter",
      "org.apache.logging.log4j.core.pattern.LogEventPatternConverter",
      "org.apache.logging.log4j.core.pattern.DatePatternConverter",
      "org.apache.logging.log4j.core.util.datetime.FixedDateFormat",
      "org.apache.logging.log4j.core.util.datetime.FixedDateFormat$FixedFormat",
      "org.apache.logging.log4j.core.pattern.DatePatternConverter$Formatter",
      "org.apache.logging.log4j.core.pattern.DatePatternConverter$FixedFormatter",
      "org.apache.logging.log4j.core.pattern.DatePatternConverter$CachedTime",
      "org.apache.logging.log4j.core.pattern.LiteralPatternConverter",
      "org.apache.logging.log4j.core.util.OptionConverter",
      "org.apache.logging.log4j.core.pattern.ThreadPatternConverter",
      "org.apache.logging.log4j.core.pattern.LevelPatternConverter",
      "org.apache.logging.log4j.core.pattern.NamePatternConverter",
      "org.apache.logging.log4j.core.pattern.NameAbbreviator$NOPAbbreviator",
      "org.apache.logging.log4j.core.pattern.NameAbbreviator",
      "org.apache.logging.log4j.core.pattern.LoggerPatternConverter",
      "org.apache.logging.log4j.core.pattern.NameAbbreviator$MaxElementAbbreviator",
      "org.apache.logging.log4j.core.pattern.MessagePatternConverter",
      "org.apache.logging.log4j.core.util.Constants",
      "org.apache.logging.log4j.core.pattern.LineSeparatorPatternConverter",
      "org.apache.logging.log4j.core.util.NanoClockFactory$Mode",
      "org.apache.logging.log4j.core.util.NanoClockFactory",
      "org.apache.logging.log4j.core.pattern.PatternFormatter",
      "org.apache.logging.log4j.core.pattern.ThrowablePatternConverter",
      "org.apache.logging.log4j.core.pattern.ExtendedThrowablePatternConverter",
      "org.apache.logging.log4j.core.impl.ThrowableFormatOptions",
      "org.apache.logging.log4j.core.appender.AbstractAppender",
      "org.apache.logging.log4j.core.appender.AbstractOutputStreamAppender",
      "org.apache.logging.log4j.core.appender.ConsoleAppender$ConsoleManagerFactory",
      "org.apache.logging.log4j.core.appender.ConsoleAppender$Target",
      "org.apache.logging.log4j.core.appender.ConsoleAppender",
      "org.apache.logging.log4j.core.appender.ConsoleAppender$CloseShieldOutputStream",
      "org.apache.logging.log4j.core.appender.ConsoleAppender$FactoryData",
      "org.apache.logging.log4j.core.appender.AbstractManager",
      "org.apache.logging.log4j.core.appender.OutputStreamManager",
      "org.apache.logging.log4j.core.appender.DefaultErrorHandler",
      "org.apache.logging.log4j.core.config.AppenderControl",
      "org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory",
      "org.apache.logging.log4j.core.config.ConfigurationFactory$Factory",
      "org.apache.logging.log4j.core.config.ConfigurationFactory",
      "org.apache.logging.log4j.core.config.OrderComparator",
      "org.apache.logging.log4j.core.util.ReflectionUtil",
      "org.apache.logging.log4j.core.config.properties.PropertiesConfigurationFactory",
      "org.apache.logging.log4j.core.config.yaml.YamlConfigurationFactory",
      "org.apache.logging.log4j.core.config.json.JsonConfigurationFactory",
      "org.apache.logging.log4j.core.config.xml.XmlConfigurationFactory",
      "org.apache.logging.log4j.message.SimpleMessage",
      "org.apache.logging.log4j.status.StatusData",
      "org.apache.logging.log4j.core.util.NetUtils",
      "org.apache.logging.log4j.core.jmx.Server",
      "org.apache.logging.log4j.core.jmx.LoggerContextAdmin",
      "org.apache.logging.log4j.core.jmx.StatusLoggerAdmin",
      "org.apache.logging.log4j.core.jmx.ContextSelectorAdmin",
      "org.apache.logging.log4j.core.jmx.AppenderAdmin",
      "org.apache.logging.log4j.core.util.DummyNanoClock",
      "org.apache.logging.log4j.core.util.ClockFactory",
      "org.apache.logging.log4j.core.util.SystemClock",
      "org.apache.logging.log4j.core.impl.Log4jLogEvent",
      "org.apache.logging.log4j.core.util.ShutdownCallbackRegistry",
      "org.apache.logging.log4j.core.LoggerContext$1",
      "org.apache.logging.log4j.core.util.DefaultShutdownCallbackRegistry$1",
      "org.apache.logging.log4j.core.Logger",
      "org.apache.logging.log4j.core.Logger$PrivateConfig",
      "org.apache.logging.log4j.core.util.NameUtil",
      "org.postgresql.util.HostSpec",
      "org.apache.xml.utils.DefaultErrorHandler",
      "org.apache.xml.utils.UnImplNode",
      "org.apache.xalan.templates.ElemTemplateElement",
      "org.apache.xalan.templates.Stylesheet",
      "org.apache.xalan.templates.StylesheetComposed",
      "org.apache.xalan.templates.StylesheetRoot",
      "org.apache.xpath.XPath",
      "org.apache.xpath.Expression",
      "org.apache.xpath.functions.Function",
      "org.apache.xpath.functions.FuncCurrent",
      "org.apache.xpath.functions.FuncLast",
      "org.apache.xpath.functions.FuncPosition",
      "org.apache.xpath.functions.FunctionOneArg",
      "org.apache.xpath.functions.FuncCount",
      "org.apache.xpath.functions.FuncId",
      "org.apache.xpath.functions.Function2Args",
      "org.apache.xalan.templates.FuncKey",
      "org.apache.xpath.functions.FunctionDef1Arg",
      "org.apache.xpath.functions.FuncLocalPart",
      "org.apache.xpath.functions.FuncNamespace",
      "org.apache.xpath.functions.FuncQname",
      "org.apache.xpath.functions.FuncGenerateId",
      "org.apache.xpath.functions.FuncNot",
      "org.apache.xpath.functions.FuncTrue",
      "org.apache.xpath.functions.FuncFalse",
      "org.apache.xpath.functions.FuncBoolean",
      "org.apache.xpath.functions.FuncLang",
      "org.apache.xpath.functions.FuncNumber",
      "org.apache.xpath.functions.FuncFloor",
      "org.apache.xpath.functions.FuncCeiling",
      "org.apache.xpath.functions.FuncRound",
      "org.apache.xpath.functions.FuncSum",
      "org.apache.xpath.functions.FuncString",
      "org.apache.xpath.functions.FuncStartsWith",
      "org.apache.xpath.functions.FuncContains",
      "org.apache.xpath.functions.FuncSubstringBefore",
      "org.apache.xpath.functions.FuncSubstringAfter",
      "org.apache.xpath.functions.FuncNormalizeSpace",
      "org.apache.xpath.functions.Function3Args",
      "org.apache.xpath.functions.FuncTranslate",
      "org.apache.xpath.functions.FunctionMultiArgs",
      "org.apache.xpath.functions.FuncConcat",
      "org.apache.xpath.functions.FuncSystemProperty",
      "org.apache.xpath.functions.FuncExtFunctionAvailable",
      "org.apache.xpath.functions.FuncExtElementAvailable",
      "org.apache.xpath.functions.FuncSubstring",
      "org.apache.xpath.functions.FuncStringLength",
      "org.apache.xpath.functions.FuncDoclocation",
      "org.apache.xpath.functions.FuncUnparsedEntityURI",
      "org.apache.xpath.compiler.FunctionTable",
      "org.apache.xpath.compiler.XPathParser",
      "org.apache.xpath.compiler.OpMap",
      "org.apache.xpath.compiler.Compiler",
      "org.apache.xml.utils.ObjectVector",
      "org.apache.xpath.compiler.Lexer",
      "org.apache.xpath.compiler.OpMapVector",
      "org.apache.xpath.compiler.Keywords",
      "org.apache.xpath.axes.WalkerFactory",
      "org.apache.xpath.objects.XObject",
      "org.apache.xpath.objects.XNumber",
      "org.apache.xpath.patterns.NodeTest",
      "org.apache.xpath.axes.PredicatedNodeTest",
      "org.apache.xpath.axes.LocPathIterator",
      "org.apache.xpath.axes.ChildIterator",
      "org.apache.xpath.axes.IteratorPool",
      "org.apache.xalan.templates.ElemTemplate",
      "org.apache.xpath.patterns.StepPattern",
      "org.apache.xalan.templates.ElemForEach",
      "org.apache.xalan.templates.ElemCallTemplate",
      "org.apache.xalan.templates.ElemApplyTemplates",
      "org.apache.xpath.patterns.UnionPattern",
      "org.apache.xalan.templates.ElemValueOf",
      "org.apache.xpath.axes.SelfIteratorNoPredicate",
      "org.apache.manifoldcf.core.interfaces.StringSetBuffer",
      "org.apache.xerces.impl.dv.xs.ExtendedSchemaDVFactoryImpl",
      "org.apache.manifoldcf.core.cachemanager.BaseDescription",
      "org.apache.manifoldcf.core.database.QueryDescription",
      "org.apache.manifoldcf.core.cachemanager.BaseDescription$LocalCacheClass",
      "org.apache.xerces.impl.xs.XSAttributeUseImpl",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFException",
      "org.apache.xerces.impl.xs.XSElementDecl",
      "org.apache.xerces.impl.xs.util.XSNamedMapImpl",
      "org.apache.xerces.impl.xs.util.XSNamedMapImpl$1",
      "org.apache.xerces.impl.xs.util.XSNamedMapImpl$2",
      "org.apache.xerces.util.XMLResourceIdentifierImpl",
      "org.apache.xerces.impl.xs.XSDDescription",
      "org.apache.xerces.util.SymbolTable",
      "org.apache.xerces.dom.NodeImpl",
      "org.apache.xerces.dom.ChildNode",
      "org.apache.xerces.dom.ParentNode",
      "org.apache.xerces.dom.CoreDocumentImpl",
      "org.apache.xerces.dom.DocumentImpl",
      "org.apache.xerces.dom.DeferredDocumentImpl",
      "org.apache.xerces.dom.AttrImpl",
      "org.apache.xerces.dom.AttrNSImpl",
      "org.apache.xerces.dom.PSVIAttrNSImpl",
      "org.apache.xerces.dom.DOMMessageFormatter",
      "org.apache.xerces.impl.xs.util.ShortListImpl",
      "org.apache.manifoldcf.core.database.DBInterfaceHSQLDB",
      "org.apache.xerces.impl.xs.XSAttributeDecl",
      "org.apache.xerces.dom.PSVIDocumentImpl",
      "org.apache.xerces.dom.DocumentTypeImpl",
      "org.apache.xerces.dom.NamedNodeMapImpl",
      "org.apache.xerces.dom.ElementImpl",
      "org.apache.xerces.dom.ElementNSImpl",
      "org.apache.xerces.dom.PSVIElementNSImpl",
      "org.apache.xerces.impl.xs.XSParticleDecl",
      "org.postgresql.jdbc.PgConnection",
      "org.postgresql.PGProperty",
      "org.apache.manifoldcf.core.database.RRow",
      "org.apache.xerces.xni.NamespaceContext",
      "org.apache.xerces.impl.xs.util.StringListImpl",
      "org.hsqldb.jdbc.JDBCStatementBase",
      "org.hsqldb.jdbc.JDBCPreparedStatement",
      "org.hsqldb.jdbc.JDBCCallableStatement",
      "org.apache.manifoldcf.core.interfaces.ThreadContextFactory"
    );
  }
}
