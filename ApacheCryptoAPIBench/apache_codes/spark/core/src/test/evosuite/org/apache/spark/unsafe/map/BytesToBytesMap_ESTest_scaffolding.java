/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 21:43:12 GMT 2022
 */

package org.apache.spark.unsafe.map;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BytesToBytesMap_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.spark.unsafe.map.BytesToBytesMap"; 
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
    java.lang.System.setProperty("user.dir", "/home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/spark/core"); 
    java.lang.System.setProperty("user.home", "/home/pedro"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "pedro"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
    java.lang.System.setProperty("strategy", "MOSuite"); 
    java.lang.System.setProperty("sun.java.launcher", "SUN_STANDARD"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
    java.lang.System.setProperty("sun.boot.class.path", "/usr/lib/jvm/adoptopenjdk-8-hotspot-amd64/jre/lib/resources.jar:/usr/lib/jvm/adoptopenjdk-8-hotspot-amd64/jre/lib/rt.jar:/usr/lib/jvm/adoptopenjdk-8-hotspot-amd64/jre/lib/sunrsasign.jar:/usr/lib/jvm/adoptopenjdk-8-hotspot-amd64/jre/lib/jsse.jar:/usr/lib/jvm/adoptopenjdk-8-hotspot-amd64/jre/lib/jce.jar:/usr/lib/jvm/adoptopenjdk-8-hotspot-amd64/jre/lib/charsets.jar:/usr/lib/jvm/adoptopenjdk-8-hotspot-amd64/jre/lib/jfr.jar:/usr/lib/jvm/adoptopenjdk-8-hotspot-amd64/jre/classes"); 
    java.lang.System.setProperty("show_progress", "false"); 
    java.lang.System.setProperty("extra_timeout", "34"); 
    java.lang.System.setProperty("process_communication_port", "3217"); 
    java.lang.System.setProperty("initialization_timeout", "34"); 
    java.lang.System.setProperty("assertion_timeout", "34"); 
    java.lang.System.setProperty("junit_tests", "true"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
    java.lang.System.setProperty("analysis_criteria", ""); 
    java.lang.System.setProperty("sun.boot.library.path", "/usr/lib/jvm/adoptopenjdk-8-hotspot-amd64/jre/lib/amd64"); 
    java.lang.System.setProperty("enable_asserts_for_evosuite", "false"); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
    java.lang.System.setProperty("sun.cpu.isalist", ""); 
    java.lang.System.setProperty("sun.jnu.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.encoding.pkg", "sun.io"); 
    java.lang.System.setProperty("configuration_id", "default"); 
    java.lang.System.setProperty("num_parallel_clients", "1"); 
    java.lang.System.setProperty("PROJECT_PREFIX", ""); 
    java.lang.System.setProperty("ctg_time_per_class", "2"); 
    java.lang.System.setProperty("write_pool", "/home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/spark/core/.evosuite/tmp_2022_04_21_21_19_14/pools/org.apache.spark.unsafe.map.BytesToBytesMap.pool"); 
    java.lang.System.setProperty("save_all_data", "false"); 
    java.lang.System.setProperty("logback.configurationFile", "logback-ctg.xml"); 
    java.lang.System.setProperty("junit_check_timeout", "34"); 
    java.lang.System.setProperty("replace_calls", "true"); 
    java.lang.System.setProperty("coverage", "true"); 
    java.lang.System.setProperty("ctg_schedule", "BUDGET"); 
    java.lang.System.setProperty("sun.io.unicode.encoding", "UnicodeLittle"); 
    java.lang.System.setProperty("stopping_condition", "MAXTIME"); 
    java.lang.System.setProperty("print_to_system", "false"); 
    java.lang.System.setProperty("output_variables", "TARGET_CLASS,configuration_id,criterion,ctg_min_time_per_job,ctg_schedule,search_budget,p_object_pool,ctg_time_per_class,Size,Length,Total_Time,Random_Seed,LineCoverage,LineCoverageBitString,BranchCoverage,BranchCoverageBitString,ExceptionCoverage,ExceptionCoverageBitString,Explicit_MethodExceptions,Explicit_TypeExceptions,Implicit_MethodExceptions,Implicit_TypeExceptions,WeakMutationScore,WeakMutationCoverageBitString,OutputCoverage,OutputCoverageBitString,MethodCoverage,MethodCoverageBitString,MethodNoExceptionCoverage,MethodNoExceptionCoverageBitString,CBranchCoverage,CBranchCoverageBitString"); 
    java.lang.System.setProperty("global_timeout", "210"); 
    java.lang.System.setProperty("assertions", "true"); 
    java.lang.System.setProperty("log_timeout", "false"); 
    java.lang.System.setProperty("master_log_port", "38785"); 
    java.lang.System.setProperty("reset_static_fields", "true"); 
    java.lang.System.setProperty("sun.java.command", "org.evosuite.ClientProcess Client-0"); 
    java.lang.System.setProperty("junit_check", "TRUE"); 
    java.lang.System.setProperty("evosuite.log.folder", "/home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/spark/core/.evosuite/tmp_2022_04_21_21_19_14/logs/org.apache.spark.unsafe.map.BytesToBytesMap"); 
    java.lang.System.setProperty("minimize", "true"); 
    java.lang.System.setProperty("max_size", "100"); 
    java.lang.System.setProperty("sun.os.patch.level", "unknown"); 
    java.lang.System.setProperty("sun.cpu.endian", "little"); 
    java.lang.System.setProperty("ctg_min_time_per_job", "1"); 
    java.lang.System.setProperty("junit_suffix", "_ESTest"); 
    java.lang.System.setProperty("java.vendor.url.bug", "https://github.com/AdoptOpenJDK/openjdk-support/issues"); 
    java.lang.System.setProperty("report_dir", "/home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/spark/core/.evosuite/tmp_2022_04_21_21_19_14/reports/org.apache.spark.unsafe.map.BytesToBytesMap"); 
    java.lang.System.setProperty("minimization_timeout", "34"); 
    java.lang.System.setProperty("CP_file_path", "/tmp/EvoSuite_classpathFile4680474099365998947.txt"); 
    java.lang.System.setProperty("java.rmi.server.hostname", "127.0.0.1"); 
    java.lang.System.setProperty("inline", "true"); 
    java.lang.System.setProperty("TARGET_CLASS", "org.apache.spark.unsafe.map.BytesToBytesMap"); 
    java.lang.System.setProperty("spawn_process_manager_port", "38853"); 
    java.lang.System.setProperty("selection_function", "RANK_CROWD_DISTANCE_TOURNAMENT"); 
    java.lang.System.setProperty("evosuite.log.appender", "CLIENT"); 
    java.lang.System.setProperty("write_junit_timeout", "34"); 
    java.lang.System.setProperty("test_dir", "/home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/spark/core/.evosuite/tmp_2022_04_21_21_19_14/tests"); 
    java.lang.System.setProperty("search_budget", "210"); 
    java.lang.System.setProperty("plot", "false"); 
    java.lang.System.setProperty("algorithm", "DYNAMOSA"); 
    java.lang.System.setProperty("p_object_pool", "0.3"); 
    java.lang.System.setProperty("criterion", "LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH"); 
    java.lang.System.setProperty("test_comments", "false"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BytesToBytesMap_ESTest_scaffolding.class.getClassLoader() ,
      "scala.collection.Parallelizable",
      "scala.math.Equiv",
      "scala.collection.immutable.Iterable",
      "scala.Serializable",
      "org.apache.spark.network.shuffle.ShuffleClient",
      "org.apache.spark.rpc.RpcEndpointRef",
      "org.apache.spark.internal.Logging$class",
      "org.apache.spark.storage.BlockManager",
      "scala.collection.GenIterable",
      "org.apache.spark.unsafe.map.BytesToBytesMap",
      "org.apache.spark.network.BlockDataManager",
      "org.apache.spark.memory.TaskMemoryManager",
      "scala.Cloneable",
      "org.apache.spark.MapOutputTrackerMaster",
      "org.apache.spark.unsafe.array.ByteArrayMethods",
      "scala.Some",
      "scala.MatchError",
      "scala.PartialFunction",
      "scala.collection.Map",
      "org.apache.spark.unsafe.Platform",
      "org.apache.spark.memory.MemoryManager",
      "scala.collection.Seq",
      "org.apache.spark.memory.StaticMemoryManager",
      "org.apache.spark.serializer.SerializerManager",
      "org.apache.spark.network.netty.NettyBlockTransferService",
      "scala.collection.TraversableOnce",
      "org.apache.spark.memory.MemoryConsumer",
      "scala.collection.TraversableLike",
      "scala.math.PartialOrdering",
      "scala.collection.IterableLike",
      "scala.collection.MapLike",
      "scala.collection.immutable.Map",
      "org.apache.spark.rpc.RpcEnv",
      "org.apache.spark.SparkEnv$",
      "scala.collection.generic.FilterMonadic",
      "org.apache.spark.unsafe.map.HashMapGrowthStrategy",
      "scala.collection.GenIterableLike",
      "scala.Function0",
      "scala.Equals",
      "scala.Function1",
      "scala.collection.generic.HasNewBuilder",
      "scala.collection.GenTraversableOnce",
      "org.apache.spark.unsafe.map.HashMapGrowthStrategy$Doubling",
      "org.apache.spark.MapOutputTrackerWorker",
      "org.apache.spark.scheduler.LiveListenerBus",
      "org.apache.spark.network.BlockTransferService",
      "scala.collection.GenTraversableLike",
      "scala.collection.generic.GenericTraversableTemplate",
      "scala.collection.immutable.MapLike",
      "org.apache.spark.storage.memory.BlockEvictionHandler",
      "scala.math.Ordering",
      "scala.Immutable",
      "scala.collection.GenMapLike",
      "org.apache.spark.memory.SparkOutOfMemoryError",
      "scala.collection.GenMap",
      "scala.collection.GenTraversable",
      "scala.collection.GenSeq",
      "org.apache.spark.SparkEnv",
      "scala.collection.Traversable",
      "scala.collection.immutable.Traversable",
      "scala.collection.GenSeqLike",
      "org.apache.spark.SparkConf",
      "org.apache.spark.internal.Logging",
      "scala.collection.Iterable",
      "scala.Option",
      "scala.None$",
      "org.apache.spark.serializer.JavaSerializer",
      "scala.collection.generic.Subtractable",
      "org.apache.spark.serializer.Serializer",
      "scala.collection.SeqLike",
      "scala.Product",
      "org.apache.spark.memory.UnifiedMemoryManager",
      "org.apache.spark.MapOutputTracker"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BytesToBytesMap_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.spark.memory.MemoryConsumer",
      "org.apache.spark.unsafe.Platform",
      "org.apache.spark.unsafe.array.ByteArrayMethods",
      "org.apache.spark.unsafe.map.HashMapGrowthStrategy$Doubling",
      "org.apache.spark.unsafe.map.HashMapGrowthStrategy",
      "org.apache.spark.unsafe.map.BytesToBytesMap",
      "org.apache.spark.unsafe.map.BytesToBytesMap$Location",
      "org.apache.spark.unsafe.map.BytesToBytesMap$MapIterator",
      "org.apache.spark.internal.Logging$class",
      "org.apache.spark.SparkEnv$",
      "org.apache.spark.unsafe.hash.Murmur3_x86_32",
      "org.apache.spark.unsafe.UnsafeAlignedOffset",
      "org.apache.spark.memory.TaskMemoryManager",
      "org.apache.spark.memory.MemoryManager",
      "org.apache.spark.memory.TestMemoryManager",
      "org.apache.spark.memory.MemoryPool",
      "org.apache.spark.memory.StorageMemoryPool",
      "org.apache.spark.memory.ExecutionMemoryPool",
      "scala.collection.AbstractTraversable",
      "scala.collection.AbstractIterable",
      "scala.collection.AbstractMap",
      "scala.collection.mutable.AbstractMap",
      "scala.collection.mutable.HashMap",
      "scala.collection.TraversableOnce$class",
      "scala.collection.Parallelizable$class",
      "scala.collection.TraversableLike$class",
      "scala.collection.generic.GenericTraversableTemplate$class",
      "scala.collection.GenTraversable$class",
      "scala.collection.Traversable$class",
      "scala.collection.GenIterable$class",
      "scala.collection.IterableLike$class",
      "scala.collection.Iterable$class",
      "scala.collection.GenMapLike$class",
      "scala.Function1$class",
      "scala.PartialFunction$class",
      "scala.collection.generic.Subtractable$class",
      "scala.collection.MapLike$class",
      "scala.collection.Map$class",
      "scala.collection.mutable.Traversable$class",
      "scala.collection.mutable.Iterable$class",
      "scala.collection.generic.Growable$class",
      "scala.collection.mutable.Builder$class",
      "scala.collection.generic.Shrinkable$class",
      "scala.collection.mutable.Cloneable$class",
      "scala.collection.mutable.MapLike$class",
      "scala.collection.mutable.Map$class",
      "scala.collection.mutable.HashTable$HashUtils$class",
      "scala.collection.mutable.HashTable$class",
      "scala.collection.mutable.HashTable$",
      "scala.collection.CustomParallelizable$class",
      "scala.LowPriorityImplicits",
      "scala.DeprecatedPredef$class",
      "scala.package$$anon$1",
      "scala.collection.generic.GenericCompanion",
      "scala.collection.generic.GenTraversableFactory",
      "scala.collection.generic.GenTraversableFactory$GenericCanBuildFrom",
      "scala.collection.generic.GenTraversableFactory$$anon$1",
      "scala.util.control.Breaks",
      "scala.util.control.BreakControl",
      "scala.util.control.NoStackTrace$class",
      "scala.sys.SystemProperties$",
      "scala.sys.BooleanProp$",
      "scala.sys.PropImpl",
      "scala.sys.BooleanProp$BooleanPropImpl",
      "scala.runtime.AbstractFunction1",
      "scala.sys.BooleanProp$$anonfun$keyExists$1",
      "scala.collection.generic.GenMapFactory",
      "scala.collection.generic.MapFactory",
      "scala.collection.generic.MutableMapFactory",
      "scala.collection.mutable.Map$",
      "scala.collection.AbstractSeq",
      "scala.collection.immutable.List",
      "scala.collection.GenSeqLike$class",
      "scala.collection.GenSeq$class",
      "scala.collection.SeqLike$class",
      "scala.collection.Seq$class",
      "scala.collection.immutable.Traversable$class",
      "scala.collection.immutable.Iterable$class",
      "scala.collection.immutable.Seq$class",
      "scala.collection.LinearSeqLike$class",
      "scala.collection.LinearSeq$class",
      "scala.collection.immutable.LinearSeq$class",
      "scala.Product$class",
      "scala.collection.LinearSeqOptimized$class",
      "scala.collection.immutable.Nil$",
      "scala.runtime.BoxedUnit",
      "scala.runtime.ScalaRunTime$",
      "scala.util.hashing.package$",
      "scala.collection.mutable.DefaultEntry",
      "scala.collection.mutable.HashEntry$class",
      "scala.Option",
      "scala.None$",
      "scala.sys.package$",
      "scala.sys.SystemProperties",
      "scala.runtime.AbstractFunction0",
      "scala.runtime.AbstractFunction0$mcZ$sp",
      "scala.sys.SystemProperties$$anonfun$contains$1",
      "scala.Function0$class",
      "scala.Function0$mcZ$sp$class",
      "scala.Some",
      "scala.sys.SystemProperties$$anonfun$get$1",
      "scala.Option$",
      "scala.runtime.BoxesRunTime",
      "scala.util.control.NoStackTrace$",
      "scala.collection.Traversable$",
      "scala.collection.Iterable$",
      "scala.collection.generic.GenSeqFactory",
      "scala.collection.generic.SeqFactory",
      "scala.collection.Seq$",
      "scala.collection.generic.IndexedSeqFactory",
      "scala.collection.IndexedSeq$$anon$1",
      "scala.collection.IndexedSeq$",
      "scala.collection.AbstractIterator",
      "scala.collection.Iterator$$anon$2",
      "scala.collection.Iterator$class",
      "scala.collection.Iterator$",
      "scala.collection.immutable.List$$anon$1",
      "scala.collection.immutable.List$",
      "scala.collection.immutable.$colon$colon$",
      "scala.collection.$plus$colon$",
      "scala.collection.$colon$plus$",
      "scala.collection.immutable.Stream$",
      "scala.collection.immutable.Stream$$hash$colon$colon$",
      "scala.collection.immutable.Vector",
      "scala.collection.IndexedSeqLike$class",
      "scala.collection.IndexedSeq$class",
      "scala.collection.immutable.IndexedSeq$class",
      "scala.collection.immutable.VectorPointer$class",
      "scala.collection.immutable.Vector$",
      "scala.collection.mutable.StringBuilder$",
      "scala.collection.immutable.Range$",
      "scala.math.BigDecimal$",
      "scala.math.BigInt$",
      "scala.math.LowPriorityEquiv$class",
      "scala.math.Equiv$",
      "scala.math.Fractional$",
      "scala.math.Integral$",
      "scala.math.Numeric$",
      "scala.math.Ordered$",
      "scala.math.LowPriorityOrderingImplicits$class",
      "scala.math.Ordering$",
      "scala.util.Either$",
      "scala.util.Left$",
      "scala.util.Right$",
      "scala.package$",
      "scala.collection.generic.ImmutableMapFactory",
      "scala.collection.immutable.Map$",
      "scala.collection.generic.GenSetFactory",
      "scala.collection.generic.SetFactory",
      "scala.collection.generic.ImmutableSetFactory",
      "scala.collection.immutable.Set$",
      "scala.reflect.AnyValManifest",
      "scala.reflect.ManifestFactory$$anon$6",
      "scala.reflect.ClassManifestDeprecatedApis$class",
      "scala.reflect.ClassTag$class",
      "scala.reflect.Manifest$class",
      "scala.reflect.ManifestFactory$$anon$7",
      "scala.reflect.ManifestFactory$$anon$8",
      "scala.reflect.ManifestFactory$$anon$9",
      "scala.reflect.ManifestFactory$$anon$10",
      "scala.reflect.ManifestFactory$$anon$11",
      "scala.reflect.ManifestFactory$$anon$12",
      "scala.reflect.ManifestFactory$$anon$13",
      "scala.reflect.ManifestFactory$$anon$14",
      "scala.reflect.ManifestFactory$ClassTypeManifest",
      "scala.reflect.ManifestFactory$PhantomManifest",
      "scala.reflect.ManifestFactory$$anon$1",
      "scala.reflect.ManifestFactory$$anon$2",
      "scala.reflect.ManifestFactory$$anon$3",
      "scala.reflect.ManifestFactory$$anon$4",
      "scala.reflect.ManifestFactory$$anon$5",
      "scala.reflect.ManifestFactory$",
      "scala.reflect.ClassManifestFactory$",
      "scala.reflect.package$",
      "scala.reflect.NoManifest$",
      "scala.Predef$$anon$3",
      "scala.Predef$$less$colon$less",
      "scala.Predef$$anon$1",
      "scala.Predef$$eq$colon$eq",
      "scala.Predef$$anon$2",
      "scala.Predef$",
      "org.apache.spark.internal.config.ConfigBuilder",
      "org.apache.spark.internal.config.TypedConfigBuilder",
      "org.apache.spark.internal.config.ConfigBuilder$$anonfun$stringConf$1",
      "org.apache.spark.internal.config.TypedConfigBuilder$$anonfun$$lessinit$greater$1",
      "org.apache.spark.internal.config.ConfigEntry",
      "org.apache.spark.internal.config.OptionalConfigEntry",
      "org.apache.spark.internal.config.OptionalConfigEntry$$anonfun$$lessinit$greater$1",
      "org.apache.spark.internal.config.OptionalConfigEntry$$anonfun$$lessinit$greater$2",
      "org.apache.spark.internal.config.ConfigEntry$",
      "org.apache.spark.internal.config.ConfigEntry$$anonfun$registerEntry$1",
      "org.apache.spark.internal.config.TypedConfigBuilder$$anonfun$createOptional$1",
      "org.apache.spark.internal.config.ConfigBuilder$$anonfun$booleanConf$1",
      "org.apache.spark.internal.config.TypedConfigBuilder$$anonfun$$lessinit$greater$1$$anonfun$apply$1",
      "scala.Option$$anonfun$orNull$1",
      "org.apache.spark.internal.config.ConfigHelpers$",
      "scala.collection.immutable.StringOps",
      "scala.collection.IndexedSeqOptimized$class",
      "scala.math.Ordered$class",
      "scala.collection.immutable.StringLike$class",
      "scala.collection.immutable.StringOps$",
      "scala.collection.mutable.AbstractSeq",
      "scala.collection.mutable.StringBuilder",
      "scala.collection.mutable.SeqLike$class",
      "scala.collection.mutable.Seq$class",
      "scala.collection.mutable.IndexedSeqLike$class",
      "scala.collection.mutable.IndexedSeq$class",
      "scala.StringContext",
      "scala.collection.mutable.WrappedArray",
      "scala.collection.mutable.WrappedArray$ofRef",
      "scala.collection.mutable.ArrayLike$class",
      "scala.collection.mutable.WrappedArray$",
      "scala.StringContext$$anonfun$s$1",
      "scala.collection.IndexedSeqLike$Elements",
      "scala.collection.BufferedIterator$class",
      "scala.StringContext$",
      "org.apache.spark.internal.config.package$",
      "org.apache.spark.rpc.TestRpcEndpoint",
      "org.apache.spark.rpc.RpcEndpoint$class",
      "org.scalactic.TripleEqualsSupport$class",
      "org.scalactic.TripleEquals$class",
      "scala.collection.mutable.ArrayBuffer$",
      "scala.collection.mutable.AbstractBuffer",
      "scala.collection.mutable.ArrayBuffer",
      "scala.collection.mutable.BufferLike$class",
      "scala.collection.mutable.Buffer$class",
      "scala.collection.mutable.ResizableArray$class",
      "scala.math.package$",
      "org.apache.spark.SparkConf",
      "org.apache.spark.rpc.RpcEndpointAddress",
      "org.apache.spark.rpc.RpcEndpointRef",
      "org.apache.spark.rpc.netty.NettyRpcEndpointRef",
      "org.apache.spark.util.RpcUtils$",
      "org.apache.spark.SparkConf$$anonfun$getOption$1",
      "org.apache.spark.SparkConf$DeprecatedConfig",
      "scala.collection.immutable.Seq$",
      "scala.collection.mutable.ListBuffer",
      "scala.collection.generic.TraversableForwarder$class",
      "scala.collection.generic.IterableForwarder$class",
      "scala.collection.generic.SeqForwarder$class",
      "scala.collection.generic.Growable$$anonfun$$plus$plus$eq$1",
      "scala.collection.immutable.$colon$colon",
      "org.apache.spark.SparkConf$$anonfun$2",
      "scala.collection.TraversableLike$$anonfun$map$1",
      "scala.Predef$ArrowAssoc$",
      "scala.Tuple2",
      "scala.Product2$class",
      "scala.collection.mutable.MapBuilder",
      "scala.collection.immutable.AbstractMap",
      "scala.collection.immutable.MapLike$class",
      "scala.collection.immutable.Map$class",
      "scala.collection.immutable.Map$EmptyMap$",
      "scala.collection.immutable.Map$Map1",
      "scala.collection.immutable.Map$Map2",
      "scala.collection.immutable.Map$Map3",
      "scala.collection.immutable.Map$Map4",
      "scala.collection.immutable.HashMap",
      "scala.collection.immutable.HashMap$HashMap1",
      "scala.collection.generic.BitOperations$Int$class",
      "scala.runtime.AbstractFunction2",
      "scala.collection.immutable.HashMap$$anonfun$1",
      "scala.Function2$class",
      "scala.collection.immutable.HashMap$Merger",
      "scala.collection.immutable.HashMap$$anon$2",
      "scala.collection.immutable.HashMap$$anon$2$$anon$3",
      "scala.collection.immutable.HashMap$",
      "scala.collection.immutable.HashMap$HashTrieMap",
      "scala.collection.generic.GenMapFactory$MapCanBuildFrom",
      "scala.collection.immutable.HashMap$EmptyHashMap$",
      "scala.FallbackArrayBuilding",
      "scala.Array$",
      "scala.util.PropertiesTrait$class",
      "scala.runtime.AbstractFunction0$mcV$sp",
      "scala.util.PropertiesTrait$$anonfun$scalaProps$1",
      "scala.Function0$mcV$sp$class",
      "scala.util.PropertiesTrait$$anonfun$scalaProps$2",
      "scala.util.PropertiesTrait$$anonfun$1",
      "scala.Option$WithFilter",
      "scala.util.PropertiesTrait$$anonfun$2",
      "scala.util.PropertiesTrait$$anonfun$3",
      "scala.util.PropertiesTrait$$anonfun$4",
      "scala.util.PropertiesTrait$$anonfun$scalaPropOrElse$1",
      "scala.util.Properties$",
      "scala.compat.Platform$",
      "org.apache.spark.SparkConf$AlternateConfig",
      "scala.runtime.AbstractFunction3",
      "scala.Function3$class",
      "org.apache.spark.SparkConf$AlternateConfig$",
      "org.apache.spark.internal.config.ConfigEntryWithDefaultString",
      "org.apache.spark.internal.config.TypedConfigBuilder$$anonfun$createWithDefaultString$1",
      "org.apache.spark.internal.config.ConfigBuilder$$anonfun$timeConf$1",
      "org.apache.spark.internal.config.ConfigBuilder$$anonfun$timeConf$2",
      "org.apache.spark.network.util.ByteUnit",
      "org.apache.spark.internal.config.ConfigBuilder$$anonfun$bytesConf$1",
      "org.apache.spark.internal.config.ConfigBuilder$$anonfun$bytesConf$2",
      "org.apache.spark.internal.config.ConfigBuilder$$anonfun$intConf$1",
      "org.apache.spark.internal.config.ConfigBuilder$$anonfun$intConf$1$$anonfun$apply$2",
      "org.apache.spark.deploy.history.config$",
      "org.apache.spark.SparkConf$",
      "org.apache.spark.util.SparkUncaughtExceptionHandler",
      "org.apache.spark.util.SparkUncaughtExceptionHandler$",
      "scala.collection.convert.DecorateAsJava$class",
      "scala.collection.convert.DecorateAsScala$class",
      "scala.collection.JavaConverters$",
      "scala.collection.convert.Decorators$AsScala",
      "scala.collection.convert.Decorators$class",
      "scala.collection.convert.Decorators$",
      "scala.collection.convert.DecorateAsScala$$anonfun$mapAsScalaMapConverter$1",
      "scala.collection.convert.WrapAsScala$class",
      "scala.collection.convert.WrapAsScala$",
      "scala.collection.convert.Wrappers$JMapWrapper",
      "scala.collection.convert.Wrappers$class",
      "scala.collection.convert.Wrappers$",
      "scala.collection.convert.Wrappers$JMapWrapperLike$class",
      "scala.collection.convert.Wrappers$JMapWrapperLike$$anon$2",
      "org.apache.commons.lang3.math.NumberUtils",
      "org.apache.commons.lang3.JavaVersion",
      "org.apache.commons.lang3.SystemUtils",
      "scala.util.matching.Regex",
      "scala.collection.AbstractSet",
      "scala.collection.GenSetLike$class",
      "scala.collection.generic.GenericSetTemplate$class",
      "scala.collection.GenSet$class",
      "scala.collection.SetLike$class",
      "scala.collection.Set$class",
      "scala.collection.immutable.Set$class",
      "scala.collection.immutable.Set$EmptySet$",
      "org.apache.spark.util.Utils$",
      "scala.collection.convert.DecorateAsScala$$anonfun$asScalaSetConverter$1",
      "scala.collection.mutable.AbstractIterable",
      "scala.collection.mutable.AbstractSet",
      "scala.collection.convert.Wrappers$JSetWrapper",
      "scala.collection.mutable.SetLike$class",
      "scala.collection.mutable.Set$class",
      "org.apache.spark.util.Utils$$anonfun$getSystemProperties$1",
      "scala.collection.generic.MutableSetFactory",
      "scala.collection.mutable.Set$",
      "scala.collection.generic.GenSetFactory$$anon$1",
      "scala.collection.mutable.GrowingBuilder",
      "scala.collection.mutable.HashSet$",
      "scala.collection.mutable.HashSet",
      "scala.collection.mutable.FlatHashTable$HashUtils$class",
      "scala.collection.mutable.FlatHashTable$class",
      "scala.collection.mutable.FlatHashTable$",
      "scala.collection.convert.Wrappers$JIteratorWrapper",
      "scala.collection.TraversableOnce$$anonfun$toMap$1",
      "scala.collection.mutable.FlatHashTable$NullSentinel$",
      "org.apache.spark.SparkConf$$anonfun$loadFromSystemProperties$1",
      "scala.collection.TraversableLike$WithFilter",
      "org.apache.spark.SparkConf$$anonfun$loadFromSystemProperties$2",
      "scala.collection.TraversableLike$WithFilter$$anonfun$withFilter$1",
      "org.apache.spark.SparkConf$$anonfun$loadFromSystemProperties$3",
      "scala.collection.TraversableLike$WithFilter$$anonfun$foreach$1",
      "org.apache.spark.memory.StaticMemoryManager",
      "org.apache.spark.memory.StaticMemoryManager$",
      "org.apache.spark.memory.UnifiedMemoryManager",
      "org.apache.spark.SparkEnv",
      "org.apache.spark.SecurityManager",
      "org.apache.spark.memory.UnifiedMemoryManager$",
      "org.apache.spark.util.Utils$$anonfun$getContextOrSparkClassLoader$1",
      "org.apache.spark.internal.Logging$",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.helpers.NullEnumeration",
      "org.apache.log4j.AppenderSkeleton",
      "org.apache.log4j.WriterAppender",
      "org.apache.log4j.ConsoleAppender",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "org.apache.log4j.Layout",
      "org.apache.log4j.PatternLayout",
      "org.apache.log4j.helpers.PatternParser",
      "org.apache.log4j.helpers.FormattingInfo",
      "org.apache.log4j.helpers.PatternConverter",
      "org.apache.log4j.helpers.PatternParser$BasicPatternConverter",
      "org.apache.log4j.helpers.PatternParser$LiteralPatternConverter",
      "org.apache.log4j.config.PropertySetter",
      "org.apache.log4j.helpers.PatternParser$DatePatternConverter",
      "org.apache.log4j.helpers.PatternParser$NamedPatternConverter",
      "org.apache.log4j.helpers.PatternParser$CategoryPatternConverter",
      "org.apache.log4j.helpers.QuietWriter",
      "org.apache.log4j.SortedKeyEnumeration",
      "org.apache.log4j.helpers.AppenderAttachableImpl",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.apache.spark.internal.Logging$$anonfun$1",
      "scala.ref.WeakReference",
      "scala.ref.Reference$class",
      "scala.Proxy$class",
      "scala.ref.ReferenceWrapper$class",
      "scala.ref.WeakReferenceWithWrapper",
      "org.apache.spark.SparkConf$$anonfun$getAll$1",
      "scala.reflect.ClassTag$",
      "scala.reflect.ClassTag$$anon$1",
      "scala.runtime.RichInt$",
      "scala.collection.mutable.FlatHashTable$$anon$1",
      "scala.Some$",
      "org.apache.spark.storage.BlockManagerMaster",
      "org.apache.spark.rpc.RpcTimeout$",
      "scala.collection.LinearSeqLike$$anon$1",
      "scala.runtime.ObjectRef",
      "scala.ref.SoftReference",
      "scala.ref.SoftReferenceWithWrapper",
      "scala.ScalaReflectionException$",
      "scala.ScalaReflectionException",
      "org.apache.spark.serializer.Serializer",
      "org.apache.spark.serializer.TestSerializer",
      "scala.collection.mutable.ArrayOps$ofRef",
      "scala.collection.mutable.ArrayOps$class",
      "org.apache.spark.SparkConf$$anonfun$getAllWithPrefix$1",
      "scala.collection.mutable.ArrayOps$ofRef$",
      "scala.collection.mutable.ArrayBuilder",
      "scala.collection.mutable.ArrayBuilder$ofRef",
      "scala.collection.TraversableLike$$anonfun$filterImpl$1",
      "org.apache.spark.SparkConf$$anonfun$getAllWithPrefix$2",
      "scala.Array$$anon$2",
      "scala.collection.mutable.ArrayBuilder$",
      "org.apache.spark.SparkConf$$anonfun$clone$1",
      "org.apache.spark.rpc.RpcEnv",
      "org.apache.spark.rpc.netty.NettyRpcEnv",
      "org.apache.spark.serializer.JavaSerializer",
      "scala.ref.ReferenceQueue",
      "scala.ref.PhantomReference",
      "scala.ref.PhantomReferenceWithWrapper",
      "org.apache.spark.TaskContext",
      "org.apache.spark.TaskContext$",
      "org.apache.hadoop.fs.Path"
    );
  }
}
