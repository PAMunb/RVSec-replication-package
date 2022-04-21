/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 16:51:54 GMT 2022
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
public class DBInterfaceMariaDB_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.manifoldcf.core.database.DBInterfaceMariaDB"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DBInterfaceMariaDB_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.manifoldcf.core.database.DBInterfaceMySQL",
      "org.apache.manifoldcf.core.interfaces.ManifoldCFException",
      "org.apache.manifoldcf.core.interfaces.ICacheDescription",
      "org.apache.manifoldcf.core.interfaces.IResultRow",
      "org.apache.manifoldcf.core.interfaces.ICacheExecutor",
      "org.apache.manifoldcf.core.database.DBInterfaceMariaDB",
      "org.apache.manifoldcf.core.database.Database",
      "org.apache.manifoldcf.core.interfaces.IThreadContext",
      "org.apache.manifoldcf.core.interfaces.LockManagerFactory",
      "org.apache.manifoldcf.core.interfaces.IResultSet",
      "org.apache.manifoldcf.core.interfaces.IDBInterface"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DBInterfaceMariaDB_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.manifoldcf.core.database.Database",
      "org.apache.manifoldcf.core.database.DBInterfaceMySQL",
      "org.apache.manifoldcf.core.database.DBInterfaceMariaDB",
      "org.apache.manifoldcf.core.interfaces.LockManagerFactory",
      "org.apache.manifoldcf.core.system.ManifoldCF$ShutdownThread",
      "org.apache.manifoldcf.core.system.ManifoldCF",
      "org.apache.manifoldcf.core.interfaces.ThreadContextFactory",
      "org.apache.manifoldcf.core.threadcontext.ThreadContext",
      "org.apache.manifoldcf.core.interfaces.StringSetBuffer",
      "org.apache.manifoldcf.core.interfaces.StringSet",
      "org.apache.manifoldcf.core.interfaces.ColumnDescription",
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
      "org.apache.xml.utils.ObjectVector",
      "org.apache.xml.utils.ObjectStack",
      "org.apache.xpath.SourceTreeManager",
      "org.apache.xml.utils.NodeVector",
      "org.apache.xpath.XPathContext$XPathExpressionContext",
      "org.apache.xpath.VariableStack",
      "org.apache.xml.utils.XMLStringDefault",
      "org.apache.xml.utils.XMLStringFactoryDefault",
      "org.apache.xml.utils.UnImplNode",
      "org.apache.xalan.templates.ElemTemplateElement",
      "org.apache.xalan.templates.ElemForEach",
      "org.apache.xalan.templates.ElemCallTemplate",
      "org.apache.xalan.templates.ElemApplyTemplates",
      "org.hsqldb.types.NullType",
      "org.hsqldb.map.BaseHashMap",
      "org.hsqldb.lib.HashMap",
      "org.hsqldb.map.HashIndex",
      "org.hsqldb.lib.HashMap$Values",
      "org.hsqldb.map.BaseHashMap$BaseHashIterator",
      "org.hsqldb.HsqlNameManager$SimpleName",
      "org.hsqldb.HsqlNameManager$HsqlName",
      "org.hsqldb.HsqlNameManager",
      "org.hsqldb.SqlInvariants",
      "org.hsqldb.types.Charset",
      "org.hsqldb.types.Collation",
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
      "org.hsqldb.jdbc.JDBCArrayBasic",
      "org.apache.manifoldcf.core.interfaces.IndexDescription",
      "org.postgresql.core.Field",
      "org.postgresql.jdbc.FieldMetadata",
      "org.postgresql.jdbc.PgResultSetMetaData",
      "org.hsqldb.result.ResultMetaData",
      "org.hsqldb.ColumnBase",
      "org.hsqldb.navigator.RowSetNavigator",
      "org.hsqldb.navigator.RowSetNavigatorClient",
      "org.hsqldb.result.Result",
      "org.hsqldb.jdbc.JDBCResultSet",
      "org.hsqldb.jdbc.JDBCResultSet$JDBCResultSetBasic",
      "org.hsqldb.jdbc.JDBCConnection",
      "org.apache.manifoldcf.core.database.Database$Modifications",
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
      "org.apache.xerces.impl.xs.SchemaGrammar"
    );
  }
}
