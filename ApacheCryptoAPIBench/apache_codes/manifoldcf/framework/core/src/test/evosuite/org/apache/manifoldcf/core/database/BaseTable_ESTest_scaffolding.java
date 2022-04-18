/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Apr 18 12:28:22 GMT 2022
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
public class BaseTable_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.manifoldcf.core.database.BaseTable"; 
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
    java.lang.System.setProperty("user.timezone", "America/Sao_Paulo"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BaseTable_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.manifoldcf.core.interfaces.ResultSpecification",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFException",
      "org.postgresql.core.Version",
      "org.apache.manifoldcf.core.interfaces.IResultRow",
      "org.apache.manifoldcf.core.interfaces.ClauseDescription",
      "org.apache.manifoldcf.core.database.BaseObject",
      "org.apache.manifoldcf.core.database.BaseTable",
      "org.postgresql.core.ServerVersion",
      "org.apache.manifoldcf.core.interfaces.StringSet",
      "org.apache.manifoldcf.core.interfaces.StringSetBuffer",
      "org.apache.manifoldcf.core.database.RRow",
      "org.apache.manifoldcf.core.interfaces.IResultSet",
      "org.apache.manifoldcf.core.interfaces.IDBInterface",
      "org.apache.manifoldcf.core.interfaces.IndexDescription",
      "org.apache.manifoldcf.core.interfaces.ILimitChecker"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BaseTable_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.manifoldcf.core.database.BaseTable",
      "org.apache.manifoldcf.core.interfaces.StringSet",
      "org.apache.manifoldcf.core.threadcontext.ThreadContext",
      "org.apache.manifoldcf.core.database.Database",
      "org.apache.manifoldcf.core.database.DBInterfaceMySQL",
      "org.apache.manifoldcf.core.interfaces.LockManagerFactory",
      "org.apache.manifoldcf.core.system.ManifoldCF$ShutdownThread",
      "org.apache.manifoldcf.core.system.ManifoldCF",
      "org.apache.manifoldcf.core.interfaces.ThreadContextFactory",
      "org.apache.manifoldcf.core.database.DBInterfacePostgreSQL",
      "org.apache.manifoldcf.core.database.DBInterfaceHSQLDB",
      "org.apache.manifoldcf.core.database.BaseObject",
      "org.apache.manifoldcf.core.database.RRow",
      "org.apache.manifoldcf.core.database.DBInterfaceMariaDB",
      "org.apache.manifoldcf.core.interfaces.IndexDescription",
      "org.apache.manifoldcf.core.interfaces.StringSetBuffer",
      "org.apache.manifoldcf.core.interfaces.JoinClause",
      "org.apache.manifoldcf.core.interfaces.UnitaryClause",
      "org.apache.manifoldcf.core.interfaces.MultiClause",
      "org.apache.manifoldcf.core.interfaces.NullCheckClause",
      "org.postgresql.core.ServerVersion$1",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.BloomFilterStrategies",
      "com.google.common.base.Preconditions",
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
      "org.hsqldb.server.HsqlSocketFactorySecure",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.ResourceBundleHandler",
      "org.hsqldb.error.Error",
      "org.hsqldb.lib.StringUtil",
      "org.hsqldb.HsqlException",
      "org.hsqldb.jdbc.JDBCConnection",
      "com.google.common.base.Converter",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.base.Converter$ConverterComposition",
      "org.hsqldb.ClientConnectionHTTP",
      "org.hsqldb.lib.DataOutputStream",
      "org.hsqldb.lib.StringConverter",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.map.ValuePoolHashMap",
      "org.hsqldb.map.ValuePool",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.jdbc.JDBCUtil",
      "org.postgresql.util.SharedTimer",
      "org.postgresql.Driver",
      "org.hsqldb.jdbc.JDBCDriver",
      "com.google.common.collect.Range$1",
      "com.google.common.collect.Range$2",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.Range$RangeLexOrdering",
      "com.google.common.collect.Cut",
      "com.google.common.collect.Cut$BelowAll",
      "com.google.common.collect.Cut$AboveAll",
      "com.google.common.collect.Range",
      "com.google.common.collect.Cut$AboveValue",
      "org.hsqldb.lib.ArrayUtil",
      "org.postgresql.jdbc.PgResultSet$1",
      "org.postgresql.jdbc.PgResultSet",
      "org.apache.xml.dtm.ref.IncrementalSAXSource_Filter",
      "org.apache.xml.dtm.ref.CoroutineManager"
    );
  }
}
