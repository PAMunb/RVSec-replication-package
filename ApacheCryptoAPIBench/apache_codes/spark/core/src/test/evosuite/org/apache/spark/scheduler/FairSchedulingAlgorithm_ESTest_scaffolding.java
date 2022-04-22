/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 22:58:34 GMT 2022
 */

package org.apache.spark.scheduler;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class FairSchedulingAlgorithm_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.spark.scheduler.FairSchedulingAlgorithm"; 
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
    java.lang.System.setProperty("user.dir", "/home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/spark/core"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FairSchedulingAlgorithm_ESTest_scaffolding.class.getClassLoader() ,
      "scala.collection.Seq$",
      "scala.collection.Iterator$$anon$2",
      "scala.collection.Iterator$$anon$24",
      "scala.math.Equiv",
      "scala.collection.mutable.Iterable$class",
      "scala.collection.mutable.WrappedArray$ofInt",
      "scala.Function0$mcZ$sp",
      "scala.Function1$class",
      "scala.Enumeration$Value",
      "scala.Function0$mcZ$sp$class",
      "scala.NotImplementedError",
      "scala.reflect.ManifestFactory$ClassTypeManifest",
      "scala.collection.generic.Shrinkable",
      "scala.collection.LinearSeqOptimized",
      "scala.collection.immutable.Stream$StreamBuilder",
      "scala.sys.SystemProperties$",
      "scala.reflect.Manifest$class",
      "scala.collection.Iterator$class",
      "scala.collection.generic.IndexedSeqFactory",
      "scala.math.BigInt$",
      "scala.collection.mutable.ArrayOps",
      "scala.collection.AbstractMap",
      "scala.collection.immutable.IndexedSeq",
      "scala.reflect.ManifestFactory$$anon$11",
      "scala.reflect.ManifestFactory$$anon$12",
      "scala.collection.immutable.Seq$",
      "scala.util.Either$",
      "scala.reflect.ManifestFactory$$anon$10",
      "scala.collection.immutable.StringLike",
      "scala.collection.Map",
      "scala.collection.mutable.HashTable",
      "scala.reflect.Manifest",
      "scala.reflect.ManifestFactory$$anon$13",
      "scala.reflect.ManifestFactory$$anon$14",
      "scala.reflect.ManifestFactory$$anon$2",
      "scala.reflect.ManifestFactory$$anon$3",
      "scala.reflect.ManifestFactory$$anon$4",
      "scala.collection.mutable.WrappedArray$ofChar",
      "scala.reflect.ManifestFactory$$anon$5",
      "scala.collection.mutable.IndexedSeqLike",
      "scala.collection.mutable.Buffer",
      "scala.reflect.ManifestFactory$$anon$1",
      "scala.Product$class",
      "scala.math.LowPriorityOrderingImplicits$class",
      "scala.reflect.ManifestFactory$",
      "scala.Enumeration",
      "scala.collection.generic.FilterMonadic",
      "scala.runtime.ScalaRunTime$",
      "scala.runtime.NonLocalReturnControl",
      "scala.collection.mutable.Cloneable",
      "scala.collection.generic.GenTraversableFactory",
      "scala.sys.SystemProperties$$anonfun$contains$1",
      "scala.collection.SeqViewLike",
      "scala.collection.GenIterableLike",
      "scala.collection.LinearSeq$",
      "scala.Equals",
      "scala.collection.GenIterable$class",
      "scala.collection.generic.GenericSetTemplate",
      "scala.collection.LinearSeqLike$class",
      "scala.reflect.ManifestFactory$$anon$6",
      "scala.reflect.ManifestFactory$$anon$7",
      "scala.collection.generic.MutableMapFactory",
      "scala.reflect.ClassManifestFactory$",
      "scala.reflect.ManifestFactory$$anon$8",
      "scala.reflect.ManifestFactory$$anon$9",
      "scala.collection.mutable.StringBuilder",
      "scala.collection.generic.GenericTraversableTemplate",
      "scala.collection.CustomParallelizable$class",
      "scala.Mutable",
      "scala.math.Ordering",
      "scala.collection.GenSet",
      "scala.collection.immutable.Vector$",
      "scala.collection.GenTraversable",
      "scala.collection.GenSeq",
      "scala.collection.MapLike$class",
      "scala.collection.generic.GenSetFactory",
      "scala.collection.immutable.Iterable$",
      "scala.collection.generic.Subtractable$class",
      "scala.collection.GenSeqLike",
      "scala.collection.immutable.WrappedString",
      "org.apache.spark.internal.Logging",
      "scala.collection.mutable.ArrayBuilder$ofByte",
      "scala.math.package$",
      "scala.collection.generic.Shrinkable$class",
      "scala.util.control.Breaks",
      "scala.collection.immutable.Vector",
      "scala.collection.mutable.Seq",
      "scala.collection.SeqLike",
      "scala.collection.LinearSeq",
      "scala.Predef$$anon$2",
      "scala.Predef$$anon$3",
      "scala.collection.mutable.WrappedArray$ofUnit",
      "scala.Predef$$anon$1",
      "scala.sys.PropImpl",
      "scala.collection.TraversableView",
      "scala.collection.immutable.Map$",
      "scala.collection.GenSeq$",
      "scala.sys.SystemProperties$$anonfun$get$1",
      "scala.collection.LinearSeqLike",
      "scala.util.control.Breaks$TryBlock",
      "scala.Enumeration$Val",
      "scala.collection.generic.SetFactory",
      "scala.collection.Iterator$",
      "scala.math.Fractional$",
      "scala.collection.mutable.SeqLike",
      "scala.sys.BooleanProp$",
      "scala.collection.mutable.HashTable$HashUtils$class",
      "scala.util.hashing.package$",
      "scala.util.Left",
      "scala.collection.immutable.Iterable$class",
      "scala.collection.immutable.Seq$class",
      "scala.collection.generic.GenTraversableFactory$GenericCanBuildFrom",
      "scala.collection.immutable.Nil$",
      "org.apache.spark.scheduler.SchedulingAlgorithm",
      "scala.Predef$$eq$colon$eq",
      "scala.Predef$$less$colon$less",
      "scala.PartialFunction",
      "scala.collection.generic.GenericTraversableTemplate$class",
      "scala.Function0$class",
      "scala.collection.mutable.WrappedArray$ofRef",
      "scala.collection.Seq$class",
      "scala.collection.IndexedSeqLike$class",
      "scala.collection.TraversableOnce",
      "scala.Tuple2",
      "scala.Tuple3",
      "scala.util.control.BreakControl",
      "scala.util.control.NoStackTrace$",
      "org.apache.spark.scheduler.Pool",
      "scala.collection.IterableView",
      "scala.runtime.AbstractFunction0",
      "scala.collection.BufferedIterator",
      "scala.runtime.AbstractFunction1",
      "scala.collection.immutable.Seq",
      "scala.collection.mutable.Iterable",
      "scala.Predef$SeqCharSequence",
      "scala.collection.immutable.Set",
      "scala.package$",
      "scala.math.Integral",
      "scala.collection.IndexedSeq$",
      "scala.collection.IndexedSeqLike",
      "scala.collection.mutable.IndexedSeqOptimized",
      "org.apache.spark.scheduler.TaskSetManager",
      "scala.collection.mutable.MapLike",
      "scala.collection.immutable.Set$",
      "scala.Predef$ArrayCharSequence",
      "scala.collection.GenTraversableLike",
      "scala.collection.mutable.WrappedArray$ofBoolean",
      "scala.sys.SystemProperties",
      "scala.collection.mutable.WrappedArray$ofShort",
      "scala.collection.LinearSeq$class",
      "scala.Option$",
      "scala.Product3",
      "scala.Product2",
      "scala.math.Numeric",
      "scala.collection.$plus$colon$",
      "scala.sys.BooleanProp$BooleanPropImpl",
      "scala.collection.GenIterable$",
      "scala.collection.mutable.HashMap",
      "scala.util.control.NoStackTrace",
      "scala.collection.$colon$plus$",
      "scala.util.Right",
      "scala.collection.generic.TraversableFactory",
      "scala.collection.mutable.IndexedSeq",
      "scala.PartialFunction$class",
      "scala.collection.mutable.ArrayBuilder$ofShort",
      "scala.collection.Parallel",
      "scala.runtime.BoxedUnit",
      "scala.Option",
      "scala.collection.SeqLike$$anon$1",
      "scala.collection.generic.Subtractable",
      "org.apache.spark.scheduler.ExecutorLossReason",
      "scala.collection.IndexedSeq$class",
      "org.apache.spark.scheduler.FairSchedulingAlgorithm",
      "scala.collection.TraversableOnce$BufferedCanBuildFrom",
      "scala.collection.mutable.Traversable",
      "scala.collection.mutable.AbstractMap",
      "scala.collection.mutable.ArrayBuilder$ofLong",
      "scala.collection.immutable.Stream$ConsWrapper",
      "scala.sys.BooleanProp$$anonfun$keyExists$1",
      "scala.collection.Parallelizable",
      "scala.collection.immutable.$colon$colon$",
      "scala.Serializable",
      "scala.collection.mutable.HashTable$",
      "scala.collection.immutable.IndexedSeq$",
      "scala.reflect.ScalaSignature",
      "scala.collection.mutable.Map$",
      "scala.collection.immutable.Stream$cons$",
      "scala.math.LowPriorityEquiv",
      "scala.collection.immutable.Stream$Cons",
      "scala.collection.Map$class",
      "scala.reflect.package$",
      "scala.util.Random",
      "scala.collection.mutable.BufferLike",
      "org.apache.spark.scheduler.Schedulable",
      "scala.collection.AbstractSeq",
      "scala.math.Numeric$",
      "scala.runtime.BoxesRunTime",
      "scala.collection.Iterable$",
      "scala.collection.mutable.StringBuilder$",
      "scala.collection.immutable.LinearSeq$",
      "scala.collection.mutable.LazyBuilder",
      "scala.collection.immutable.List",
      "scala.collection.TraversableLike$class",
      "scala.collection.Seq",
      "scala.collection.Set",
      "scala.collection.generic.GenericCompanion",
      "scala.collection.immutable.VectorPointer",
      "scala.collection.immutable.LinearSeq",
      "scala.collection.generic.GenTraversableFactory$$anon$1",
      "scala.collection.generic.ImmutableMapFactory",
      "scala.collection.mutable.HashEntry$class",
      "scala.util.control.ControlThrowable",
      "scala.math.PartialOrdering",
      "scala.reflect.ClassTag$class",
      "scala.collection.mutable.ArrayBuilder$ofFloat",
      "scala.collection.mutable.ArrayLike",
      "scala.collection.MapLike",
      "scala.collection.GenTraversable$",
      "scala.collection.IndexedSeqOptimized$class",
      "scala.collection.mutable.Builder",
      "scala.collection.immutable.VectorPointer$class",
      "scala.collection.generic.ImmutableSetFactory",
      "scala.collection.immutable.Stream$Empty$",
      "scala.collection.Traversable$class",
      "scala.math.ScalaNumericConversions",
      "scala.collection.immutable.StringOps",
      "scala.math.ScalaNumber",
      "scala.collection.mutable.Iterable$",
      "scala.collection.immutable.Range$",
      "scala.reflect.ClassTag",
      "scala.collection.immutable.IndexedSeq$class",
      "scala.collection.mutable.WrappedArray$ofFloat",
      "scala.collection.immutable.Stream$$hash$colon$colon$",
      "scala.collection.immutable.Stream$StreamWithFilter",
      "scala.Function0",
      "scala.Function1",
      "scala.Function2",
      "scala.reflect.ManifestFactory$PhantomManifest",
      "scala.math.BigInt",
      "scala.collection.GenMapLike",
      "scala.collection.ViewMkString",
      "scala.collection.GenMap",
      "scala.collection.mutable.HashEntry",
      "scala.util.Either",
      "scala.collection.Parallelizable$class",
      "scala.collection.mutable.WrappedArray",
      "scala.collection.generic.GenericSeqCompanion",
      "scala.math.Ordered$class",
      "scala.collection.SeqView",
      "scala.collection.SeqLike$class",
      "scala.collection.mutable.ArrayBuilder$ofRef",
      "scala.collection.mutable.ResizableArray",
      "scala.LowPriorityImplicits",
      "scala.collection.mutable.Builder$class",
      "scala.sys.BooleanProp",
      "scala.None$",
      "scala.collection.TraversableViewLike",
      "scala.collection.mutable.Map",
      "scala.collection.mutable.WrappedArray$ofLong",
      "scala.util.Right$",
      "scala.collection.immutable.Stream",
      "scala.collection.immutable.Stream$",
      "scala.math.LowPriorityEquiv$class",
      "scala.Product",
      "scala.collection.GenTraversable$class",
      "scala.runtime.AbstractFunction0$mcZ$sp",
      "scala.Specializable",
      "scala.collection.IndexedSeq$$anon$1",
      "scala.collection.mutable.WrappedArray$ofByte",
      "scala.collection.immutable.List$$anon$1",
      "scala.package$$anon$1",
      "scala.collection.generic.MapFactory",
      "scala.collection.immutable.Iterable",
      "scala.collection.mutable.HashTable$HashUtils",
      "scala.collection.mutable.ArrayBuilder$ofUnit",
      "scala.reflect.ClassManifestDeprecatedApis",
      "scala.collection.GenIterable",
      "scala.collection.immutable.List$",
      "scala.collection.script.Scriptable",
      "scala.collection.mutable.AbstractBuffer",
      "scala.collection.generic.IsTraversableLike",
      "scala.collection.immutable.StringLike$class",
      "scala.collection.mutable.WrappedArray$ofDouble",
      "scala.collection.generic.SeqFactory",
      "scala.collection.GenSeqLike$class",
      "scala.Cloneable",
      "scala.collection.mutable.Cloneable$class",
      "scala.collection.mutable.DefaultEntry",
      "scala.util.Left$",
      "scala.math.BigDecimal",
      "scala.Some",
      "scala.MatchError",
      "scala.collection.mutable.MapLike$class",
      "scala.math.Integral$",
      "scala.collection.mutable.ArrayBuilder$ofDouble",
      "scala.collection.generic.GenSeqFactory",
      "scala.reflect.OptManifest",
      "scala.collection.TraversableOnce$class",
      "scala.collection.immutable.Traversable$",
      "scala.collection.mutable.ArrayBuilder$ofChar",
      "scala.runtime.Null$",
      "scala.DeprecatedPredef$class",
      "scala.collection.GenSeq$class",
      "scala.math.Ordered",
      "scala.sys.Prop",
      "scala.collection.mutable.HashTable$class",
      "scala.collection.mutable.ArrayBuilder$ofBoolean",
      "scala.reflect.ClassManifestDeprecatedApis$class",
      "scala.math.LowPriorityOrderingImplicits",
      "scala.UninitializedError",
      "scala.collection.TraversableLike",
      "scala.collection.SetLike",
      "scala.collection.IterableLike",
      "scala.collection.immutable.Range$Inclusive",
      "scala.collection.immutable.Map",
      "scala.collection.generic.CanBuildFrom",
      "scala.reflect.NoManifest$",
      "scala.collection.GenSetLike",
      "scala.reflect.AnyValManifest",
      "scala.collection.IndexedSeq",
      "scala.collection.IterableViewLike",
      "scala.collection.mutable.Traversable$",
      "scala.math.ScalaNumericAnyConversions",
      "scala.collection.generic.HasNewBuilder",
      "scala.collection.mutable.ArrayBuilder$ofInt",
      "scala.collection.GenTraversableOnce",
      "scala.collection.mutable.Map$class",
      "scala.collection.AbstractTraversable",
      "scala.collection.mutable.ArrayBuilder",
      "scala.collection.immutable.MapLike",
      "scala.collection.AbstractIterator",
      "scala.Immutable",
      "scala.sys.package$",
      "scala.math.Ordered$",
      "scala.collection.AbstractIterable",
      "scala.Predef$",
      "scala.collection.immutable.Traversable$class",
      "scala.DeprecatedPredef",
      "scala.collection.immutable.Range",
      "scala.sys.ShutdownHookThread",
      "scala.collection.Traversable",
      "scala.collection.mutable.ArrayBuffer",
      "scala.collection.immutable.$colon$colon",
      "scala.collection.immutable.Traversable",
      "scala.collection.GenMapLike$class",
      "scala.util.control.NoStackTrace$class",
      "scala.collection.generic.Growable$class",
      "scala.runtime.Nothing$",
      "scala.collection.Iterator",
      "scala.collection.IndexedSeqOptimized",
      "scala.collection.Traversable$",
      "scala.collection.Iterable",
      "scala.collection.immutable.LinearSeq$class",
      "scala.collection.TraversableLike$WithFilter",
      "scala.collection.mutable.AbstractSeq",
      "scala.collection.generic.Clearable",
      "scala.collection.generic.GenMapFactory",
      "scala.collection.mutable.Traversable$class",
      "scala.collection.generic.Growable",
      "scala.math.Equiv$",
      "scala.collection.immutable.StringOps$",
      "scala.collection.IterableLike$class",
      "scala.collection.LinearSeqOptimized$class",
      "scala.collection.CustomParallelizable",
      "scala.collection.Iterable$class",
      "scala.math.BigDecimal$",
      "scala.math.Ordering$"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.spark.scheduler.Schedulable", false, FairSchedulingAlgorithm_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FairSchedulingAlgorithm_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.spark.scheduler.FairSchedulingAlgorithm",
      "scala.math.package$",
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
      "scala.Function1$class",
      "scala.collection.generic.GenMapFactory",
      "scala.collection.generic.MapFactory",
      "scala.collection.generic.MutableMapFactory",
      "scala.collection.mutable.Map$",
      "scala.collection.AbstractTraversable",
      "scala.collection.AbstractIterable",
      "scala.collection.AbstractSeq",
      "scala.collection.immutable.List",
      "scala.collection.TraversableOnce$class",
      "scala.collection.Parallelizable$class",
      "scala.collection.TraversableLike$class",
      "scala.collection.generic.GenericTraversableTemplate$class",
      "scala.collection.GenTraversable$class",
      "scala.collection.Traversable$class",
      "scala.collection.GenIterable$class",
      "scala.collection.IterableLike$class",
      "scala.collection.Iterable$class",
      "scala.PartialFunction$class",
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
      "scala.collection.AbstractMap",
      "scala.collection.mutable.AbstractMap",
      "scala.collection.mutable.HashMap",
      "scala.collection.GenMapLike$class",
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
      "scala.collection.immutable.StringOps",
      "scala.collection.IndexedSeqOptimized$class",
      "scala.math.Ordered$class",
      "scala.collection.immutable.StringLike$class",
      "scala.collection.immutable.StringOps$"
    );
  }
}
