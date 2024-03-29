/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 20:59:32 GMT 2022
 */

package org.apache.manifoldcf.core.database;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ConnectionFactory_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.manifoldcf.core.database.ConnectionFactory"; 
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
    java.lang.System.setProperty("user.dir", "/home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/manifoldcf/framework/core"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ConnectionFactory_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.manifoldcf.core.interfaces.ManifoldCFException",
      "org.hsqldb.lib.LongLookup",
      "org.hsqldb.jdbc.JDBCConnectionEventListener",
      "org.hsqldb.jdbc.pool.JDBCPooledConnection",
      "org.hsqldb.jdbc.JDBCCommonDataSource",
      "org.hsqldb.lib.DoubleIntIndex",
      "org.apache.manifoldcf.core.jdbcpool.ConnectionPoolManager$ConnectionCloserThread",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.apache.manifoldcf.core.jdbcpool.WrappedConnection",
      "org.hsqldb.lib.IntLookup",
      "org.apache.manifoldcf.core.database.ConnectionFactory$PoolManager",
      "org.hsqldb.jdbc.pool.JDBCPooledDataSource",
      "org.apache.manifoldcf.core.database.ConnectionFactory",
      "org.hsqldb.jdbc.JDBCPool",
      "org.apache.manifoldcf.core.jdbcpool.ConnectionPoolManager",
      "org.hsqldb.jdbc.JDBCDriver$1",
      "org.apache.manifoldcf.core.jdbcpool.ConnectionPool",
      "org.apache.manifoldcf.core.database.ConnectionFactory$ConnectionTracker"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.sql.Connection", false, ConnectionFactory_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.manifoldcf.core.jdbcpool.ConnectionPool", false, ConnectionFactory_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ConnectionFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.manifoldcf.core.database.ConnectionFactory$PoolManager",
      "org.apache.manifoldcf.core.database.ConnectionFactory",
      "org.apache.manifoldcf.core.database.ConnectionFactory$ConnectionTracker",
      "org.apache.manifoldcf.core.system.ManifoldCF$ShutdownThread",
      "org.apache.manifoldcf.core.system.ManifoldCF",
      "org.apache.manifoldcf.core.jdbcpool.ConnectionPool",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFException",
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
      "org.hsqldb.ClientConnectionHTTP",
      "org.hsqldb.lib.DataOutputStream",
      "org.hsqldb.lib.StringConverter",
      "org.hsqldb.lib.DoubleIntIndex",
      "org.apache.manifoldcf.core.jdbcpool.ConnectionPoolManager",
      "org.apache.manifoldcf.core.jdbcpool.ConnectionPoolManager$ConnectionCloserThread",
      "org.postgresql.ds.PGPooledConnection",
      "org.postgresql.xa.PGXAConnection",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.postgresql.util.SharedTimer",
      "org.postgresql.Driver",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.map.ValuePoolHashMap",
      "org.hsqldb.map.ValuePool",
      "org.hsqldb.jdbc.JDBCCommonDataSource",
      "org.hsqldb.jdbc.JDBCPool",
      "org.hsqldb.jdbc.pool.JDBCPooledDataSource",
      "org.hsqldb.jdbc.pool.JDBCXADataSource",
      "org.hsqldb.SessionManager",
      "org.hsqldb.lib.LongKeyHashMap",
      "org.hsqldb.jdbc.JDBCConnection",
      "org.hsqldb.jdbc.JDBCUtil",
      "org.postgresql.util.HostSpec",
      "org.postgresql.jdbc.PgConnection",
      "org.postgresql.PGProperty",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.hostchooser.HostRequirement",
      "org.postgresql.core.SocketFactoryFactory",
      "org.postgresql.hostchooser.HostChooserFactory",
      "org.postgresql.hostchooser.SingleHostChooser",
      "org.postgresql.core.PGStream",
      "org.hsqldb.lib.FileUtil$FileAccessRes",
      "org.hsqldb.lib.FileUtil",
      "org.apache.xalan.processor.TransformerFactoryImpl",
      "org.apache.xml.utils.DefaultErrorHandler",
      "org.apache.xalan.processor.StylesheetHandler",
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
      "org.apache.xalan.processor.XSLTElementDef",
      "org.apache.xalan.processor.XSLTSchema",
      "org.apache.xalan.processor.XSLTAttributeDef",
      "org.apache.xml.utils.StringToIntTable",
      "org.apache.xml.utils.UnImplNode",
      "org.apache.xalan.templates.ElemTemplateElement",
      "org.apache.xalan.processor.XSLTElementProcessor",
      "org.apache.xalan.processor.ProcessorCharacters",
      "org.apache.xalan.templates.ElemTextLiteral",
      "org.apache.xalan.processor.ProcessorTemplateElem",
      "org.apache.xalan.processor.ProcessorLRE",
      "org.apache.xalan.templates.ElemUse",
      "org.apache.xalan.templates.ElemLiteralResult",
      "org.apache.xalan.processor.ProcessorUnknown",
      "org.apache.xalan.templates.ElemUnknown",
      "org.apache.xalan.templates.ElemValueOf",
      "org.apache.xml.utils.QName",
      "org.apache.xalan.templates.ElemCopyOf",
      "org.apache.xalan.transformer.DecimalToRoman",
      "org.apache.xalan.templates.ElemNumber",
      "org.apache.xalan.templates.ElemSort",
      "org.apache.xalan.templates.ElemWithParam",
      "org.apache.xalan.templates.ElemForEach",
      "org.apache.xalan.templates.ElemCallTemplate",
      "org.apache.xalan.templates.ElemApplyTemplates",
      "org.apache.xalan.templates.ElemApplyImport",
      "org.apache.xalan.templates.ElemIf",
      "org.apache.xalan.templates.ElemWhen",
      "org.apache.xalan.templates.ElemOtherwise",
      "org.apache.xalan.templates.ElemChoose",
      "org.apache.xalan.templates.ElemElement",
      "org.apache.xalan.templates.ElemAttribute",
      "org.apache.xalan.templates.ElemVariable",
      "org.apache.xalan.templates.ElemParam",
      "org.apache.xalan.processor.ProcessorText",
      "org.apache.xalan.templates.ElemText",
      "org.apache.xalan.templates.ElemPI",
      "org.apache.xalan.templates.ElemComment",
      "org.apache.xalan.templates.ElemCopy",
      "org.apache.xalan.templates.ElemMessage",
      "org.apache.xalan.templates.ElemFallback",
      "org.apache.xalan.processor.ProcessorExsltFunction",
      "org.apache.xalan.templates.ElemTemplate",
      "org.apache.xalan.templates.ElemExsltFunction",
      "org.apache.xalan.processor.ProcessorExsltFuncResult",
      "org.apache.xalan.templates.ElemExsltFuncResult",
      "org.apache.xalan.processor.ProcessorInclude",
      "org.apache.xalan.processor.ProcessorImport",
      "org.apache.xalan.processor.ProcessorPreserveSpace",
      "org.apache.xalan.processor.ProcessorStripSpace",
      "org.apache.xalan.processor.ProcessorOutputElem",
      "org.apache.xalan.processor.ProcessorKey",
      "org.apache.xalan.processor.ProcessorDecimalFormat",
      "org.apache.xalan.processor.ProcessorAttributeSet",
      "org.apache.xalan.processor.ProcessorGlobalVariableDecl",
      "org.apache.xalan.processor.ProcessorGlobalParamDecl",
      "org.apache.xalan.processor.ProcessorTemplate",
      "org.apache.xalan.processor.ProcessorNamespaceAlias",
      "org.apache.xalan.templates.ElemExtensionScript",
      "org.apache.xalan.templates.ElemExtensionDecl",
      "org.apache.xalan.processor.ProcessorStylesheetElement",
      "org.apache.xalan.processor.ProcessorStylesheetDoc",
      "org.apache.xml.utils.BoolStack",
      "org.apache.xalan.templates.FuncDocument",
      "org.apache.xalan.templates.FuncFormatNumb",
      "org.apache.xml.utils.NamespaceSupport2",
      "org.apache.xml.utils.Context2",
      "org.apache.xalan.transformer.TransformerImpl",
      "org.apache.xml.utils.ObjectPool",
      "org.apache.xml.serializer.SerializerBase",
      "org.apache.xml.serializer.SecuritySupport12",
      "org.apache.xml.serializer.SecuritySupport",
      "org.apache.xml.serializer.SecuritySupport12$4",
      "org.apache.xml.serializer.ToStream",
      "org.apache.xml.serializer.ToTextStream",
      "org.apache.xalan.templates.OutputProperties",
      "org.apache.xml.serializer.OutputPropertiesFactory",
      "org.apache.xml.serializer.OutputPropertiesFactory$1",
      "org.apache.xml.utils.ObjectVector",
      "org.apache.xml.utils.ObjectStack",
      "org.apache.xml.utils.NodeVector",
      "org.apache.xalan.transformer.KeyManager",
      "org.apache.xalan.trace.TraceManager",
      "org.hsqldb.lib.ArrayUtil",
      "org.apache.manifoldcf.core.jdbcpool.WrappedConnection",
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
      "org.apache.xml.serializer.ToSAXHandler",
      "org.apache.xml.serializer.ToTextSAXHandler",
      "org.apache.xml.serializer.ToHTMLStream$Trie",
      "org.apache.xml.serializer.ToHTMLStream$Trie$Node",
      "org.apache.xml.serializer.ElemDesc",
      "org.apache.xml.serializer.utils.StringToIntTable",
      "org.apache.xml.serializer.ToHTMLStream",
      "org.apache.manifoldcf.core.system.Logging"
    );
  }
}
