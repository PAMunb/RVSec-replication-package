/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Apr 18 12:27:28 GMT 2022
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ConnectionFactory_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.xml.serializer.WriterToUTF8Buffered",
      "org.hsqldb.jdbc.JDBCDatabaseMetaData",
      "org.hsqldb.lib.LongKeyHashMap",
      "org.apache.xml.serializer.ToHTMLStream$Trie$Node",
      "org.postgresql.hostchooser.HostRequirement",
      "org.hsqldb.types.BlobType",
      "org.hsqldb.lib.StringConverter",
      "org.apache.manifoldcf.core.interfaces.IPollingHook",
      "org.hsqldb.SessionManager",
      "org.hsqldb.result.ResultLob",
      "org.postgresql.core.v3.TypeTransferModeRegistry",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.postgresql.xa.PGXAException",
      "org.apache.log4j.Level",
      "org.apache.xml.serializer.NamespaceMappings$Stack",
      "org.postgresql.core.BaseConnection",
      "org.postgresql.core.ResultHandler",
      "org.apache.xml.serializer.SerializerBase",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.hsqldb.types.BooleanType",
      "org.hsqldb.types.BlobDataID",
      "org.apache.manifoldcf.core.database.ConnectionFactory$ConnectionTracker",
      "org.hsqldb.lib.HsqlList",
      "org.postgresql.core.Version",
      "org.apache.xml.serializer.TreeWalker",
      "org.hsqldb.jdbc.JDBCUtil",
      "org.apache.xalan.templates.XSLTVisitor",
      "org.apache.xalan.templates.ElemTemplateElement",
      "org.hsqldb.jdbc.JDBCCommonDataSource",
      "org.hsqldb.rights.User",
      "org.postgresql.core.PGBindException",
      "org.apache.xml.utils.SAXSourceLocator",
      "org.apache.xml.serializer.Serializer",
      "org.apache.xml.serializer.ToHTMLStream",
      "org.postgresql.core.ResultCursor",
      "org.postgresql.replication.fluent.ChainedCreateReplicationSlotBuilder",
      "org.apache.logging.log4j.Logger",
      "org.hsqldb.Row",
      "org.hsqldb.lib.IntKeyHashMap",
      "org.apache.logging.log4j.util.Supplier",
      "org.apache.xml.serializer.WriterChain",
      "org.postgresql.sspi.ISSPIClient",
      "org.hsqldb.lib.FileUtil$DatabaseFilenameFilter",
      "org.postgresql.jdbc.PreferQueryMode",
      "org.hsqldb.navigator.RowIterator",
      "com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl",
      "org.hsqldb.types.OtherType",
      "org.hsqldb.lib.Collection",
      "com.google.gson.internal.$Gson$Types",
      "org.hsqldb.types.TimestampData",
      "org.postgresql.util.ServerErrorMessage",
      "org.apache.xml.serializer.XSLOutputAttributes",
      "org.postgresql.util.PSQLException",
      "org.apache.logging.log4j.spi.LoggerContext",
      "org.hsqldb.resources.ResourceBundleHandler",
      "org.hsqldb.jdbc.JDBCStatement",
      "org.apache.xpath.WhitespaceStrippingElementMatcher",
      "org.hsqldb.map.ValuePoolHashMap",
      "org.apache.xml.utils.DefaultErrorHandler",
      "org.postgresql.fastpath.Fastpath",
      "org.postgresql.util.WriterHandler",
      "org.apache.xml.serializer.NamespaceMappings$MappingRecord",
      "org.postgresql.core.v3.ConnectionFactoryImpl",
      "org.apache.logging.log4j.core.Logger",
      "org.hsqldb.error.Error",
      "org.apache.xml.utils.WrappedRuntimeException",
      "org.hsqldb.jdbc.JDBCConnection$1",
      "org.apache.xml.serializer.ElemContext",
      "org.postgresql.core.ReplicationProtocol",
      "org.apache.xpath.ExtensionsProvider",
      "org.hsqldb.persist.CachedObject",
      "org.hsqldb.types.Charset",
      "org.hsqldb.types.ArrayType",
      "org.hsqldb.jdbc.pool.JDBCPooledConnection",
      "org.postgresql.core.v3.ConnectionFactoryImpl$UnsupportedProtocolException",
      "org.apache.xml.serializer.ToStream",
      "org.hsqldb.jdbc.JDBCConnection",
      "org.hsqldb.navigator.RowSetNavigatorClient",
      "org.hsqldb.HsqlNameManager$HsqlName",
      "org.apache.xml.serializer.SerializerTrace",
      "org.apache.manifoldcf.core.system.ManifoldCF$OverrideableManifoldCFConfiguration",
      "org.apache.manifoldcf.core.jdbcpool.ConnectionPool",
      "org.hsqldb.lib.OrderedHashSet",
      "org.apache.xalan.templates.StylesheetComposed",
      "org.hsqldb.types.BinaryType",
      "org.apache.xml.serializer.OutputPropertiesFactory$1",
      "org.hsqldb.rowio.RowInputBinary",
      "org.hsqldb.lib.HashSet",
      "org.hsqldb.lib.HsqlByteArrayInputStream",
      "org.hsqldb.lib.Iterator",
      "org.apache.xml.serializer.SerializationHandler",
      "org.hsqldb.lib.CountdownInputStream",
      "org.apache.manifoldcf.core.jdbcpool.ConnectionPoolManager$ConnectionCloserThread",
      "org.hsqldb.types.IntervalSecondData",
      "org.apache.xalan.transformer.TransformerIdentityImpl",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFConfiguration",
      "org.apache.xml.serializer.EncodingInfo",
      "org.apache.log4j.Category",
      "org.hsqldb.jdbc.pool.JDBCXAConnection",
      "org.hsqldb.rowio.RowOutputInterface",
      "org.hsqldb.types.Type",
      "org.hsqldb.types.LobData",
      "org.apache.xml.serializer.ExtendedContentHandler",
      "org.apache.xml.serializer.ExtendedLexicalHandler",
      "org.hsqldb.types.DTIType",
      "org.hsqldb.jdbc.pool.JDBCXAConnectionWrapper",
      "org.hsqldb.lib.FileAccess",
      "org.apache.xml.serializer.ElemDesc",
      "org.hsqldb.DatabaseURL",
      "org.apache.xpath.XPathVisitor",
      "org.postgresql.core.SocketFactoryFactory",
      "org.apache.log4j.spi.LoggerFactory",
      "org.hsqldb.SqlInvariants",
      "org.apache.xml.serializer.ToStream$WritertoStringBuffer",
      "org.hsqldb.rowio.RowInputInterface",
      "org.apache.xml.serializer.NamespaceMappings",
      "org.hsqldb.types.Type$TypedComparator",
      "org.postgresql.jdbc.AutoSave",
      "org.apache.xml.serializer.utils.WrappedRuntimeException",
      "org.apache.manifoldcf.core.system.Logging",
      "org.postgresql.util.HostSpec",
      "org.hsqldb.Scanner",
      "org.hsqldb.types.TimeData",
      "org.apache.xalan.templates.Stylesheet",
      "org.hsqldb.types.BitType",
      "org.apache.xml.serializer.CharInfo",
      "org.hsqldb.jdbc.JDBCStatementBase",
      "org.apache.xml.serializer.CharInfo$1",
      "org.apache.xml.serializer.ToStream$BoolStack",
      "org.apache.logging.log4j.message.Message",
      "org.hsqldb.jdbc.pool.JDBCPooledDataSource",
      "org.hsqldb.lib.FileAccess$FileSync",
      "org.apache.xml.serializer.TransformStateSetter",
      "org.apache.xml.serializer.EncodingInfo$InEncoding",
      "org.postgresql.core.ConnectionFactory",
      "org.hsqldb.rowio.RowInputBase",
      "org.apache.manifoldcf.core.jdbcpool.ConnectionPoolManager",
      "org.hsqldb.TransactionManager",
      "org.apache.xml.serializer.ToXMLSAXHandler",
      "org.hsqldb.ClientConnection",
      "org.hsqldb.rights.Grantee",
      "org.hsqldb.lib.ObjectComparator",
      "org.hsqldb.lib.IntKeyIntValueHashMap",
      "org.hsqldb.Database",
      "org.postgresql.hostchooser.SingleHostChooser",
      "org.apache.log4j.Priority",
      "org.apache.manifoldcf.core.database.ConnectionFactory",
      "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl",
      "org.apache.xml.serializer.ToSAXHandler",
      "org.hsqldb.lib.FileUtil",
      "org.hsqldb.server.HsqlSocketFactory",
      "org.hsqldb.result.Result",
      "org.apache.logging.log4j.core.LoggerContext",
      "org.hsqldb.map.BaseHashMap$BaseHashIterator",
      "org.apache.logging.log4j.Level",
      "org.hsqldb.ColumnBase",
      "org.apache.xml.serializer.SecuritySupport12",
      "org.hsqldb.types.Collation",
      "org.hsqldb.types.ClobType",
      "org.postgresql.core.CachedQuery",
      "org.hsqldb.SortAndSlice",
      "org.apache.xml.serializer.AttributesImplSerializer",
      "org.hsqldb.types.BinaryData",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.postgresql.util.SharedTimer",
      "org.apache.log4j.Category$PrivateFactory",
      "org.hsqldb.lib.Set",
      "org.hsqldb.types.CharacterType",
      "org.apache.xml.serializer.SecuritySupport",
      "org.hsqldb.jdbc.JDBCDriver$1",
      "org.hsqldb.lib.FileUtil$FileAccessRes",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFException",
      "org.postgresql.util.LruCache",
      "org.hsqldb.types.ClobDataID",
      "org.apache.logging.log4j.core.LifeCycle",
      "org.apache.xml.utils.QName",
      "org.postgresql.core.PGStream",
      "org.hsqldb.lib.ReaderInputStream",
      "org.apache.manifoldcf.core.system.ManifoldCF$DatabaseConnectionReleaseThread",
      "org.postgresql.core.EncodingPredictor$DecodeResult",
      "org.apache.xml.serializer.DOMSerializer",
      "org.postgresql.core.Encoding",
      "org.postgresql.core.TypeInfo",
      "org.hsqldb.types.NullType",
      "org.hsqldb.ClientConnectionHTTP",
      "org.apache.xml.dtm.DTMManager",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.rowio.RowOutputBase",
      "org.apache.xml.serializer.WriterToASCI",
      "org.apache.manifoldcf.core.system.ManifoldCFResourceLoader",
      "org.hsqldb.navigator.RangeIterator",
      "org.hsqldb.jdbc.pool.JDBCXADataSource",
      "org.hsqldb.types.IntervalMonthData",
      "org.apache.xpath.ExpressionNode",
      "org.apache.xml.serializer.SerializerTraceWriter",
      "org.hsqldb.jdbc.JDBCConnectionEventListener",
      "org.hsqldb.Schema",
      "org.postgresql.util.CanEstimateSize",
      "org.hsqldb.navigator.RowSetNavigator",
      "org.hsqldb.SessionInterface",
      "org.hsqldb.HsqlDateTime",
      "org.hsqldb.lib.StringUtil",
      "org.hsqldb.rights.GranteeManager",
      "org.apache.xalan.templates.XMLNSDecl",
      "org.hsqldb.result.ResultMetaData",
      "org.postgresql.util.ExpressionProperties",
      "org.apache.xpath.XPathContext",
      "org.hsqldb.map.BitMap",
      "org.postgresql.hostchooser.GlobalHostStatusTracker",
      "org.postgresql.copy.CopyManager",
      "org.postgresql.largeobject.LargeObjectManager",
      "org.hsqldb.types.DateTimeType",
      "org.postgresql.replication.fluent.ChainedStreamBuilder",
      "org.apache.xml.serializer.utils.StringToIntTable",
      "org.postgresql.core.Field",
      "org.hsqldb.types.NumberType",
      "org.postgresql.PGProperty",
      "org.postgresql.PGConnection",
      "org.postgresql.core.PGStream$1",
      "org.postgresql.hostchooser.MultiHostChooser",
      "org.hsqldb.jdbc.pool.JDBCXAResource",
      "org.apache.xml.utils.PrefixResolver",
      "org.apache.manifoldcf.core.interfaces.IDBInterface",
      "org.postgresql.Driver",
      "org.hsqldb.jdbc.JDBCPreparedStatement",
      "org.hsqldb.Statement",
      "org.postgresql.core.QueryExecutor",
      "org.hsqldb.types.BlobData",
      "org.hsqldb.lib.IntValueHashMap",
      "org.hsqldb.HsqlNameManager",
      "org.hsqldb.types.ClobData",
      "org.hsqldb.lib.HashMap",
      "org.postgresql.hostchooser.HostRequirement$4",
      "org.hsqldb.result.ResultProperties",
      "org.apache.manifoldcf.core.system.ManifoldCF",
      "org.apache.log4j.Logger",
      "org.apache.xml.serializer.SecuritySupport12$4",
      "org.apache.manifoldcf.core.interfaces.IHierarchyParent",
      "org.apache.manifoldcf.core.database.ConnectionFactory$PoolManager",
      "org.apache.xalan.templates.ElemTemplate",
      "org.apache.xml.utils.UnImplNode",
      "org.apache.xml.serializer.ToHTMLStream$Trie",
      "org.apache.xalan.templates.OutputProperties",
      "org.apache.manifoldcf.core.interfaces.IThreadContext",
      "org.apache.xml.dtm.DTMWSFilter",
      "org.postgresql.hostchooser.GlobalHostStatusTracker$HostSpecStatus",
      "org.apache.manifoldcf.core.interfaces.IShutdownHook",
      "org.postgresql.xa.PGXAConnection",
      "org.postgresql.PGNotification",
      "org.apache.xml.serializer.SerializerConstants",
      "org.hsqldb.rights.UserManager",
      "com.google.gson.internal.$Gson$Types$WildcardTypeImpl",
      "org.apache.logging.log4j.core.AbstractLifeCycle",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.HsqlNameManager$SimpleName",
      "org.apache.manifoldcf.core.system.ManifoldCF$ShutdownThread",
      "org.postgresql.hostchooser.HostChooser",
      "org.hsqldb.map.HashIndex",
      "org.hsqldb.types.JavaObjectData",
      "org.apache.logging.log4j.core.config.ConfigurationListener",
      "org.hsqldb.HsqlException",
      "org.hsqldb.lib.HashMap$KeySet",
      "org.hsqldb.Database$TimeoutRunner",
      "org.hsqldb.persist.HsqlDatabaseProperties",
      "org.apache.xml.serializer.OutputPropertiesFactory",
      "org.apache.xml.serializer.CharInfo$CharKey",
      "org.postgresql.ds.PGPooledConnection$ConnectionHandler",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.server.HsqlSocketFactorySecure",
      "org.hsqldb.jdbc.JDBCCallableStatement",
      "org.postgresql.core.Provider",
      "org.hsqldb.map.BaseHashMap",
      "org.apache.log4j.Appender",
      "org.hsqldb.types.IntervalType",
      "org.postgresql.core.TransactionState",
      "org.hsqldb.lib.HashMappedList",
      "org.postgresql.jdbc.TimestampUtils",
      "org.hsqldb.jdbc.JDBCPool",
      "org.hsqldb.SchemaObject",
      "org.apache.logging.log4j.spi.AbstractLogger",
      "org.postgresql.replication.PGReplicationConnection",
      "org.apache.xalan.templates.XSLTVisitable",
      "org.postgresql.jdbc.PgConnection",
      "org.hsqldb.lib.HashMap$Values",
      "org.hsqldb.map.ValuePool",
      "org.hsqldb.lib.DataOutputStream",
      "org.apache.log4j.spi.LoggingEvent",
      "org.postgresql.hostchooser.HostChooserFactory",
      "org.hsqldb.lib.ArrayUtil",
      "org.apache.manifoldcf.core.interfaces.Configuration",
      "org.apache.xalan.templates.StylesheetRoot",
      "org.apache.manifoldcf.core.jdbcpool.WrappedConnection",
      "org.hsqldb.HsqlNameManager$1",
      "org.hsqldb.Session",
      "org.postgresql.hostchooser.HostStatus",
      "org.postgresql.hostchooser.HostRequirement$2",
      "org.postgresql.hostchooser.HostRequirement$3",
      "org.postgresql.core.Query",
      "org.apache.logging.log4j.spi.ExtendedLogger",
      "org.postgresql.hostchooser.HostRequirement$1",
      "org.postgresql.ds.PGPooledConnection",
      "org.apache.xalan.transformer.TransformerImpl"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ConnectionFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.manifoldcf.core.database.ConnectionFactory$PoolManager",
      "org.apache.manifoldcf.core.database.ConnectionFactory",
      "org.apache.manifoldcf.core.database.ConnectionFactory$ConnectionTracker",
      "org.apache.manifoldcf.core.system.ManifoldCF$ShutdownThread",
      "org.apache.manifoldcf.core.system.ManifoldCF",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFException",
      "org.hsqldb.ClientConnection",
      "org.hsqldb.ClientConnectionHTTP",
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
      "org.hsqldb.lib.DataOutputStream",
      "org.hsqldb.lib.StringConverter",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.ResourceBundleHandler",
      "org.hsqldb.error.Error",
      "org.hsqldb.lib.StringUtil",
      "org.hsqldb.HsqlException",
      "org.apache.manifoldcf.core.jdbcpool.ConnectionPool",
      "org.postgresql.util.SharedTimer",
      "org.postgresql.Driver",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.map.ValuePoolHashMap",
      "org.hsqldb.map.ValuePool",
      "org.hsqldb.jdbc.JDBCConnection",
      "org.hsqldb.jdbc.JDBCUtil",
      "org.hsqldb.server.HsqlSocketFactory",
      "org.hsqldb.Database",
      "org.hsqldb.SessionManager",
      "org.hsqldb.lib.LongKeyHashMap",
      "org.hsqldb.jdbc.JDBCCommonDataSource",
      "org.hsqldb.jdbc.JDBCPool",
      "org.hsqldb.jdbc.pool.JDBCPooledDataSource",
      "org.hsqldb.jdbc.pool.JDBCXADataSource",
      "org.hsqldb.lib.FileUtil$FileAccessRes",
      "org.hsqldb.lib.FileUtil",
      "org.apache.manifoldcf.core.system.Logging",
      "org.hsqldb.server.HsqlSocketFactorySecure",
      "org.postgresql.util.HostSpec",
      "org.apache.xalan.transformer.TransformerIdentityImpl",
      "org.apache.xml.utils.DefaultErrorHandler",
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
      "org.hsqldb.lib.HashMappedList",
      "org.apache.manifoldcf.core.jdbcpool.ConnectionPoolManager",
      "org.apache.manifoldcf.core.jdbcpool.ConnectionPoolManager$ConnectionCloserThread",
      "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl",
      "org.hsqldb.jdbc.JDBCDatabaseMetaData",
      "org.hsqldb.result.ResultProperties",
      "org.hsqldb.jdbc.JDBCStatementBase",
      "org.hsqldb.jdbc.JDBCStatement",
      "org.postgresql.hostchooser.SingleHostChooser",
      "org.hsqldb.jdbc.JDBCPreparedStatement",
      "org.hsqldb.jdbc.JDBCCallableStatement",
      "org.apache.xml.serializer.SecuritySupport12",
      "org.apache.xml.serializer.SecuritySupport",
      "org.apache.xml.serializer.SecuritySupport12$4",
      "org.apache.xml.serializer.ToStream",
      "org.apache.xml.serializer.ToHTMLStream$Trie",
      "org.apache.xml.serializer.ToHTMLStream$Trie$Node",
      "org.apache.xml.serializer.ElemDesc",
      "org.apache.xml.serializer.utils.StringToIntTable",
      "org.apache.xml.serializer.ToHTMLStream",
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
      "org.hsqldb.jdbc.pool.JDBCPooledConnection",
      "org.hsqldb.jdbc.pool.JDBCXAConnection",
      "org.hsqldb.lib.HashSet",
      "org.hsqldb.lib.OrderedHashSet",
      "org.hsqldb.jdbc.pool.JDBCXAResource",
      "org.hsqldb.jdbc.pool.JDBCXAConnectionWrapper",
      "org.hsqldb.lib.HashMap$KeySet",
      "org.hsqldb.persist.HsqlDatabaseProperties",
      "org.hsqldb.lib.ArrayUtil",
      "org.apache.xml.serializer.ToSAXHandler",
      "org.apache.xml.serializer.ToXMLSAXHandler"
    );
  }
}
