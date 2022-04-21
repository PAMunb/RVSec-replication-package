/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 16:37:45 GMT 2022
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
public class Database_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.manifoldcf.core.database.Database"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Database_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.manifoldcf.core.interfaces.ResultSpecification",
      "org.apache.manifoldcf.core.cachemanager.BaseDescription$LocalCacheClass",
      "org.apache.manifoldcf.core.interfaces.IResultRow",
      "org.apache.manifoldcf.core.interfaces.ClauseDescription",
      "org.apache.manifoldcf.core.database.Database",
      "org.apache.xerces.xs.XSObject",
      "org.apache.manifoldcf.core.database.DBInterfaceMySQL",
      "org.apache.xerces.xs.XSObjectList",
      "org.apache.xerces.impl.xs.util.ShortListImpl",
      "org.apache.manifoldcf.core.interfaces.IThreadContext",
      "org.apache.manifoldcf.core.threadcontext.ThreadContext",
      "org.apache.manifoldcf.core.database.DBInterfaceHSQLDB",
      "org.apache.manifoldcf.core.interfaces.IndexDescription",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFException",
      "org.apache.manifoldcf.core.interfaces.ICacheClass",
      "org.apache.manifoldcf.core.interfaces.ICacheExecutor",
      "org.apache.manifoldcf.core.database.Database$Modifications",
      "org.apache.manifoldcf.core.database.DBInterfaceMariaDB",
      "org.apache.xerces.xs.ShortList",
      "org.apache.xerces.impl.xs.util.XSObjectListImpl$1",
      "org.apache.manifoldcf.core.interfaces.LockManagerFactory",
      "org.apache.manifoldcf.core.cachemanager.ExecutorBase",
      "org.apache.manifoldcf.core.interfaces.ICacheDescription",
      "org.apache.manifoldcf.core.interfaces.StringSet",
      "org.apache.manifoldcf.core.cachemanager.BaseDescription",
      "org.apache.manifoldcf.core.database.Database$ExecuteQueryThread",
      "org.apache.manifoldcf.core.interfaces.StringSetBuffer",
      "org.apache.xerces.impl.xs.util.XSObjectListImpl",
      "org.apache.manifoldcf.core.interfaces.IResultSet",
      "org.apache.manifoldcf.core.database.Database$QueryCacheExecutor",
      "org.apache.manifoldcf.core.database.QueryDescription",
      "org.apache.xerces.xs.XSException",
      "org.apache.manifoldcf.core.interfaces.IDBInterface",
      "org.apache.manifoldcf.core.interfaces.ILimitChecker"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.manifoldcf.core.interfaces.ILimitChecker", false, Database_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Database_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.manifoldcf.core.database.Database",
      "org.apache.manifoldcf.core.cachemanager.ExecutorBase",
      "org.apache.manifoldcf.core.database.Database$QueryCacheExecutor",
      "org.apache.manifoldcf.core.database.Database$Modifications",
      "org.apache.manifoldcf.core.database.Database$ExecuteQueryThread",
      "org.apache.manifoldcf.core.database.DBInterfaceMySQL",
      "org.apache.manifoldcf.core.database.DBInterfacePostgreSQL",
      "org.apache.manifoldcf.core.database.DBInterfaceHSQLDB",
      "org.apache.manifoldcf.core.system.ManifoldCF$ShutdownThread",
      "org.apache.manifoldcf.core.system.ManifoldCF",
      "org.apache.manifoldcf.core.database.ConnectionFactory$PoolManager",
      "org.apache.manifoldcf.core.database.ConnectionFactory",
      "org.apache.manifoldcf.core.system.Logging",
      "org.apache.manifoldcf.core.threadcontext.ThreadContext",
      "org.apache.manifoldcf.core.interfaces.LockManagerFactory",
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
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.map.ValuePoolHashMap",
      "org.hsqldb.map.ValuePool",
      "org.hsqldb.jdbc.JDBCConnection",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.jdbc.JDBCUtil",
      "org.postgresql.util.SharedTimer",
      "org.postgresql.Driver",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.hsqldb.lib.FileUtil$FileAccessRes",
      "org.hsqldb.lib.FileUtil",
      "org.hsqldb.lib.java.JavaSystem",
      "org.apache.manifoldcf.core.database.DBInterfaceMariaDB",
      "org.hsqldb.ClientConnectionHTTP",
      "org.hsqldb.lib.DataOutputStream",
      "org.hsqldb.lib.StringConverter",
      "org.apache.manifoldcf.core.interfaces.ResultSpecification",
      "org.apache.xerces.impl.xs.XSParticleDecl",
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
      "org.hsqldb.server.HsqlSocketFactorySecure",
      "org.apache.xerces.impl.xs.util.XSObjectListImpl$1",
      "org.apache.xerces.impl.xs.util.XSObjectListImpl",
      "org.hsqldb.Database",
      "org.hsqldb.persist.LobManager",
      "org.apache.xerces.impl.xs.XSDeclarationPool",
      "org.apache.xerces.impl.xs.XSWildcardDecl",
      "org.apache.xerces.impl.xs.XSAttributeGroupDecl",
      "org.apache.xerces.util.SymbolTable",
      "org.hsqldb.jdbc.JDBCResultSet",
      "org.hsqldb.jdbc.JDBCResultSet$JDBCResultSetBasic",
      "org.hsqldb.lib.HashSet",
      "org.hsqldb.lib.OrderedHashSet",
      "org.hsqldb.SessionManager",
      "org.hsqldb.lib.LongKeyHashMap",
      "org.apache.xml.dtm.ref.IncrementalSAXSource_Filter",
      "org.apache.xml.dtm.ref.CoroutineManager",
      "org.postgresql.util.HostSpec",
      "org.apache.xml.utils.UnImplNode",
      "org.apache.xalan.templates.ElemTemplateElement",
      "org.apache.xalan.templates.OutputProperties",
      "org.apache.xml.serializer.SerializerBase",
      "org.apache.xml.serializer.OutputPropertiesFactory",
      "org.apache.xml.serializer.OutputPropertiesFactory$1",
      "org.postgresql.jdbc.PgConnection",
      "org.postgresql.PGProperty",
      "org.postgresql.core.ConnectionFactory",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.postgresql.hostchooser.HostRequirement",
      "org.postgresql.core.SocketFactoryFactory",
      "org.postgresql.hostchooser.HostChooserFactory",
      "org.postgresql.hostchooser.MultiHostChooser",
      "org.postgresql.hostchooser.GlobalHostStatusTracker",
      "org.postgresql.hostchooser.GlobalHostStatusTracker$HostSpecStatus",
      "org.postgresql.core.PGStream",
      "org.apache.xerces.impl.dv.xs.XSSimpleTypeDelegate",
      "org.apache.manifoldcf.core.interfaces.ColumnDescription",
      "org.apache.xerces.impl.dv.xs.ExtendedSchemaDVFactoryImpl",
      "org.hsqldb.lib.ArrayUtil",
      "org.apache.xerces.impl.xs.util.XSObjectListImpl$XSObjectListIterator",
      "org.apache.xml.serializer.ToSAXHandler",
      "org.apache.xml.serializer.ToXMLSAXHandler",
      "org.apache.xml.serializer.AttributesImplSerializer",
      "org.apache.xml.serializer.ElemContext",
      "org.apache.xml.serializer.NamespaceMappings",
      "org.apache.xml.serializer.NamespaceMappings$Stack",
      "org.apache.xml.serializer.NamespaceMappings$MappingRecord",
      "org.apache.xerces.dom.ASModelImpl",
      "org.apache.xerces.impl.xs.XSAttributeUseImpl",
      "org.apache.xerces.impl.xs.util.ShortListImpl",
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
      "org.hsqldb.dbinfo.DatabaseInformation",
      "org.hsqldb.types.UserTypeModifier",
      "org.hsqldb.Constraint",
      "org.hsqldb.TypeInvariants",
      "org.hsqldb.dbinfo.DatabaseInformationMain",
      "org.hsqldb.dbinfo.DatabaseInformationFull$1",
      "org.hsqldb.lib.LineGroupReader",
      "org.hsqldb.lib.HashMappedList",
      "org.hsqldb.dbinfo.DatabaseInformationFull",
      "org.hsqldb.TableBase",
      "org.hsqldb.Table",
      "org.hsqldb.TableDerived",
      "org.apache.xerces.impl.xs.XSModelGroupImpl",
      "org.hsqldb.jdbc.JDBCStatementBase",
      "org.hsqldb.jdbc.JDBCPreparedStatement",
      "org.hsqldb.jdbc.JDBCCallableStatement",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.BloomFilterStrategies",
      "com.google.common.base.Preconditions",
      "org.apache.xerces.dom.DocumentTypeImpl",
      "org.apache.xerces.dom.NamedNodeMapImpl",
      "org.apache.xerces.dom.ElementImpl",
      "org.apache.xerces.dom.ElementNSImpl",
      "org.apache.xerces.dom.PSVIElementNSImpl",
      "org.apache.xerces.impl.xs.XSGroupDecl",
      "org.hsqldb.jdbc.JDBCCommonDataSource",
      "org.hsqldb.jdbc.pool.JDBCXADataSource",
      "org.hsqldb.jdbc.pool.JDBCPooledConnection",
      "org.hsqldb.jdbc.pool.JDBCXAConnection",
      "org.hsqldb.jdbc.pool.JDBCXAResource",
      "org.hsqldb.ExpressionLogical",
      "org.hsqldb.RangeVariable",
      "org.hsqldb.lib.OrderedIntHashSet",
      "org.hsqldb.Expression",
      "org.hsqldb.ColumnSchema",
      "org.hsqldb.ExpressionColumn",
      "org.apache.xerces.impl.xs.identity.IdentityConstraint",
      "org.apache.xerces.impl.xs.identity.UniqueOrKey",
      "org.apache.xerces.impl.xs.identity.KeyRef",
      "org.apache.xerces.impl.xs.util.StringListImpl",
      "org.apache.manifoldcf.core.database.RRow",
      "org.apache.manifoldcf.core.interfaces.StringSet",
      "org.apache.xerces.impl.xs.XSElementDecl",
      "org.postgresql.core.ServerVersion",
      "org.hsqldb.jdbc.JDBCPool",
      "org.hsqldb.jdbc.pool.JDBCPooledDataSource",
      "org.apache.xerces.util.XMLResourceIdentifierImpl",
      "org.apache.xerces.impl.xs.XSDDescription",
      "com.google.common.hash.BloomFilterStrategies$BitArray",
      "com.google.common.math.LongMath",
      "com.google.common.math.LongMath$1",
      "com.google.common.primitives.Ints",
      "org.apache.manifoldcf.core.interfaces.IndexDescription",
      "org.hsqldb.result.ResultProperties",
      "org.apache.manifoldcf.core.lockmanager.LockPool",
      "org.apache.manifoldcf.core.lockmanager.LockObjectFactory",
      "org.apache.manifoldcf.core.lockmanager.BaseLockManager",
      "org.apache.manifoldcf.core.lockmanager.FileLockManager",
      "org.apache.wml.dom.WMLElementImpl",
      "org.apache.wml.dom.WMLBElementImpl",
      "org.apache.wml.dom.WMLNoopElementImpl",
      "org.apache.wml.dom.WMLAElementImpl",
      "org.apache.wml.dom.WMLSetvarElementImpl",
      "org.apache.wml.dom.WMLAccessElementImpl",
      "org.apache.wml.dom.WMLStrongElementImpl",
      "org.apache.wml.dom.WMLPostfieldElementImpl",
      "org.apache.wml.dom.WMLDoElementImpl",
      "org.apache.wml.dom.WMLWmlElementImpl",
      "org.apache.wml.dom.WMLTrElementImpl",
      "org.apache.wml.dom.WMLGoElementImpl",
      "org.apache.wml.dom.WMLBigElementImpl",
      "org.apache.wml.dom.WMLAnchorElementImpl",
      "org.apache.wml.dom.WMLTimerElementImpl",
      "org.apache.wml.dom.WMLSmallElementImpl",
      "org.apache.wml.dom.WMLOptgroupElementImpl",
      "org.apache.wml.dom.WMLHeadElementImpl",
      "org.apache.wml.dom.WMLTdElementImpl",
      "org.apache.wml.dom.WMLFieldsetElementImpl",
      "org.apache.wml.dom.WMLImgElementImpl",
      "org.apache.wml.dom.WMLRefreshElementImpl",
      "org.apache.wml.dom.WMLOneventElementImpl",
      "org.apache.wml.dom.WMLInputElementImpl",
      "org.apache.wml.dom.WMLPrevElementImpl",
      "org.apache.wml.dom.WMLTableElementImpl",
      "org.apache.wml.dom.WMLMetaElementImpl",
      "org.apache.wml.dom.WMLTemplateElementImpl",
      "org.apache.wml.dom.WMLBrElementImpl",
      "org.apache.wml.dom.WMLOptionElementImpl",
      "org.apache.wml.dom.WMLUElementImpl",
      "org.apache.wml.dom.WMLPElementImpl",
      "org.apache.wml.dom.WMLSelectElementImpl",
      "org.apache.wml.dom.WMLEmElementImpl",
      "org.apache.wml.dom.WMLIElementImpl",
      "org.apache.wml.dom.WMLCardElementImpl",
      "org.apache.wml.dom.WMLDocumentImpl",
      "org.hsqldb.result.ResultLob",
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
      "org.apache.xml.utils.DefaultErrorHandler",
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
      "org.apache.xalan.transformer.TransformerImpl",
      "org.apache.xml.utils.ObjectPool",
      "org.apache.xml.serializer.SecuritySupport12",
      "org.apache.xml.serializer.SecuritySupport",
      "org.apache.xml.serializer.SecuritySupport12$4",
      "org.apache.xml.serializer.ToStream",
      "org.apache.xml.serializer.ToTextStream",
      "org.apache.xml.utils.ObjectStack",
      "org.apache.xml.utils.NodeVector",
      "org.apache.xalan.transformer.KeyManager",
      "org.apache.xml.utils.BoolStack",
      "org.apache.xalan.trace.TraceManager",
      "org.apache.xml.dtm.DTMManager",
      "org.apache.xpath.XPathContext",
      "org.apache.xml.utils.IntVector",
      "org.apache.xml.utils.IntStack",
      "org.apache.xml.utils.XMLStringFactory",
      "org.apache.xpath.objects.XMLStringFactoryImpl",
      "org.apache.xml.dtm.ObjectFactory",
      "org.apache.xml.dtm.SecuritySupport",
      "org.apache.xml.dtm.SecuritySupport$4",
      "org.apache.xml.dtm.SecuritySupport$7",
      "org.apache.xml.dtm.SecuritySupport$1",
      "org.apache.xml.dtm.SecuritySupport$2",
      "org.apache.xml.dtm.SecuritySupport$3",
      "org.apache.xml.dtm.SecuritySupport$6",
      "org.apache.xml.dtm.ref.DTMManagerDefault",
      "org.apache.xml.dtm.ref.ExtendedType",
      "org.apache.xml.dtm.ref.ExpandedNameTable",
      "org.apache.xml.dtm.ref.ExpandedNameTable$HashEntry",
      "org.apache.xpath.SourceTreeManager",
      "org.apache.xpath.XPathContext$XPathExpressionContext",
      "org.apache.xpath.VariableStack",
      "org.apache.xalan.transformer.StackGuard",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFException",
      "org.apache.xerces.impl.xs.XSAttributeDecl",
      "org.apache.xml.serializer.ToUnknownStream",
      "org.apache.xml.serializer.ToXMLStream",
      "org.apache.xml.serializer.ToStream$BoolStack",
      "org.apache.xml.serializer.EncodingInfo",
      "org.apache.xml.serializer.CharInfo",
      "org.apache.xml.serializer.CharInfo$1",
      "org.apache.xml.serializer.CharInfo$CharKey",
      "org.apache.xml.serializer.ToHTMLStream$Trie",
      "org.apache.xml.serializer.ToHTMLStream$Trie$Node",
      "org.apache.xml.serializer.ElemDesc",
      "org.apache.xml.serializer.utils.StringToIntTable",
      "org.apache.xml.serializer.ToHTMLStream",
      "com.google.common.collect.Range$1",
      "com.google.common.collect.Range$2",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.Range$RangeLexOrdering",
      "com.google.common.collect.Cut",
      "com.google.common.collect.Cut$BelowAll",
      "com.google.common.collect.Cut$AboveAll",
      "com.google.common.collect.Range",
      "com.google.common.collect.Cut$BelowValue",
      "org.apache.xerces.xni.NamespaceContext",
      "com.google.common.base.Converter",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "org.apache.xml.serializer.EmptySerializer",
      "org.hsqldb.rowio.RowOutputBinary180",
      "org.apache.xml.serializer.ToHTMLSAXHandler",
      "org.apache.xml.res.XMLMessages",
      "org.apache.xml.res.XMLErrorResources",
      "org.apache.xml.res.XMLErrorResources_en",
      "org.hsqldb.Statement",
      "org.hsqldb.StatementSession",
      "org.apache.xerces.impl.validation.ValidationState",
      "org.apache.manifoldcf.core.cachemanager.BaseDescription",
      "org.apache.manifoldcf.core.database.QueryDescription",
      "org.apache.manifoldcf.core.cachemanager.BaseDescription$LocalCacheClass",
      "org.apache.xerces.dom.PSVIDocumentImpl",
      "org.apache.html.dom.HTMLDocumentImpl",
      "org.apache.html.dom.SecuritySupport",
      "org.apache.html.dom.SecuritySupport$4",
      "org.apache.html.dom.ObjectFactory",
      "org.apache.manifoldcf.core.interfaces.PersistentDatabaseObject",
      "org.apache.manifoldcf.core.interfaces.CharacterInput",
      "org.apache.manifoldcf.core.interfaces.NullCharacterInput",
      "org.hsqldb.lib.HashMap$KeySet",
      "org.hsqldb.persist.HsqlDatabaseProperties",
      "org.apache.xalan.processor.StylesheetHandler",
      "org.apache.xalan.processor.XSLTElementDef",
      "org.apache.xalan.processor.XSLTSchema",
      "org.apache.xalan.processor.XSLTAttributeDef",
      "org.apache.xml.utils.StringToIntTable",
      "org.apache.xalan.processor.XSLTElementProcessor",
      "org.apache.xalan.processor.ProcessorCharacters",
      "org.apache.xalan.templates.ElemTextLiteral",
      "org.apache.xalan.processor.ProcessorTemplateElem",
      "org.apache.xalan.processor.ProcessorLRE",
      "org.apache.xalan.templates.ElemUse",
      "org.apache.xalan.templates.ElemLiteralResult",
      "org.apache.xalan.processor.ProcessorUnknown",
      "org.apache.xalan.templates.ElemUnknown",
      "org.apache.xml.utils.QName",
      "org.apache.xalan.templates.ElemCopyOf",
      "org.apache.xalan.transformer.DecimalToRoman",
      "org.apache.xalan.templates.ElemNumber",
      "org.apache.xalan.templates.ElemSort",
      "org.apache.xalan.templates.ElemWithParam",
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
      "org.apache.xalan.templates.FuncDocument",
      "org.apache.xalan.templates.FuncFormatNumb",
      "org.apache.xalan.processor.TransformerFactoryImpl",
      "org.apache.xml.utils.NamespaceSupport2",
      "org.apache.xml.utils.Context2",
      "org.apache.xalan.transformer.TransformerIdentityImpl",
      "org.apache.xml.serializer.ToTextSAXHandler",
      "org.apache.xerces.impl.xs.XSNotationDecl",
      "org.apache.xml.utils.ListingErrorHandler",
      "org.apache.manifoldcf.core.database.RSet",
      "org.apache.xerces.impl.dv.xs.XSSimpleTypeDecl$AbstractObjectList",
      "org.apache.xerces.impl.dv.xs.XSSimpleTypeDecl$3",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.base.Converter$ReverseConverter",
      "org.apache.xerces.util.NamespaceSupport",
      "org.apache.xerces.impl.xpath.XPath",
      "org.apache.xerces.impl.xs.identity.Field$XPath",
      "org.apache.xerces.impl.xpath.XPath$Tokens",
      "org.postgresql.hostchooser.SingleHostChooser",
      "com.google.common.collect.Cut$AboveValue",
      "org.hsqldb.QueryExpression",
      "org.hsqldb.SortAndSlice",
      "org.hsqldb.jdbc.JDBCSQLXML",
      "org.apache.xml.serializer.SerializerFactory",
      "org.apache.xml.serializer.ObjectFactory",
      "org.apache.xml.serializer.SecuritySupport12$1",
      "org.apache.xml.serializer.SecuritySupport12$2",
      "org.apache.xml.serializer.SecuritySupport12$3",
      "org.apache.xml.serializer.SecuritySupport12$6",
      "org.apache.xml.serializer.Encodings",
      "org.apache.xml.serializer.WriterToUTF8Buffered",
      "org.apache.xml.utils.XMLReaderManager",
      "org.apache.xerces.parsers.XMLParser",
      "org.apache.xerces.parsers.AbstractXMLDocumentParser",
      "org.apache.xerces.parsers.AbstractSAXParser",
      "org.apache.xerces.parsers.SAXParser",
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
      "org.apache.xerces.impl.XMLEntityManager$1",
      "org.apache.xerces.impl.XMLEntityManager",
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
      "org.apache.xerces.impl.dtd.XMLElementDecl",
      "org.apache.xerces.impl.dtd.XMLSimpleType",
      "org.apache.xerces.impl.dtd.XMLAttributeDecl",
      "org.apache.xerces.impl.dtd.DTDGrammarBucket",
      "org.apache.xerces.impl.dv.DTDDVFactory",
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
      "org.apache.xerces.parsers.AbstractSAXParser$AttributesProxy",
      "org.apache.xerces.xni.XNIException",
      "org.apache.xerces.xni.parser.XMLConfigurationException",
      "org.apache.xerces.util.SAXMessageFormatter",
      "org.apache.xerces.xni.parser.XMLInputSource",
      "org.apache.xerces.impl.XMLEntityManager$RewindableInputStream",
      "org.hsqldb.jdbc.JDBCSQLXML$Exceptions",
      "org.postgresql.ds.PGPooledConnection",
      "org.postgresql.xa.PGXAConnection",
      "org.postgresql.util.PSQLException",
      "org.postgresql.util.GT",
      "org.postgresql.util.PSQLState",
      "org.hsqldb.jdbc.JDBCBlob",
      "org.hsqldb.types.RowType",
      "org.hsqldb.persist.Crypto"
    );
  }
}
