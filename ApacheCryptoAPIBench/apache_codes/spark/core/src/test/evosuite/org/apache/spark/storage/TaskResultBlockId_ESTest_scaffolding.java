/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 23:12:20 GMT 2022
 */

package org.apache.spark.storage;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TaskResultBlockId_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.spark.storage.TaskResultBlockId"; 
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
    java.lang.System.setProperty("user.dir", "/home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/spark/core"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TaskResultBlockId_ESTest_scaffolding.class.getClassLoader() ,
      "scala.collection.Seq$",
      "scala.runtime.BooleanRef",
      "scala.math.Equiv",
      "scala.collection.mutable.Iterable$class",
      "scala.Function1$class",
      "scala.collection.generic.Shrinkable",
      "scala.collection.mutable.Seq$class",
      "scala.collection.LinearSeqOptimized",
      "scala.collection.Iterator$class",
      "scala.collection.generic.IndexedSeqFactory",
      "scala.collection.AbstractMap",
      "scala.collection.immutable.IndexedSeq",
      "scala.collection.immutable.StringLike",
      "scala.collection.Map",
      "scala.collection.mutable.HashTable",
      "org.apache.spark.storage.TaskResultBlockId$",
      "scala.collection.mutable.IndexedSeqLike",
      "scala.Option$WithFilter",
      "scala.collection.mutable.Buffer",
      "scala.Product$class",
      "scala.collection.generic.FilterMonadic",
      "scala.runtime.ScalaRunTime$",
      "scala.runtime.NonLocalReturnControl",
      "scala.collection.mutable.Cloneable",
      "scala.collection.generic.GenTraversableFactory",
      "scala.collection.SeqViewLike",
      "scala.collection.GenIterableLike",
      "scala.Equals",
      "scala.collection.GenIterable$class",
      "scala.collection.generic.GenericSetTemplate",
      "scala.collection.mutable.StringBuilder",
      "scala.collection.generic.GenericTraversableTemplate",
      "scala.Mutable",
      "scala.math.Ordering",
      "scala.collection.GenSet",
      "scala.collection.GenTraversable",
      "scala.collection.GenSeq",
      "scala.collection.GenSeqLike",
      "org.apache.spark.storage.RDDBlockId",
      "scala.collection.immutable.Vector",
      "scala.collection.mutable.Seq",
      "scala.collection.SeqLike",
      "scala.collection.LinearSeq",
      "scala.collection.TraversableView",
      "scala.collection.GenSeq$",
      "scala.collection.LinearSeqLike",
      "scala.collection.mutable.SeqLike",
      "scala.util.Left",
      "scala.collection.immutable.Nil$",
      "scala.Predef$$less$colon$less",
      "scala.PartialFunction",
      "scala.collection.generic.GenericTraversableTemplate$class",
      "scala.collection.Seq$class",
      "scala.collection.IndexedSeqLike$class",
      "scala.collection.TraversableOnce",
      "scala.Tuple2",
      "scala.collection.mutable.IndexedSeqLike$class",
      "scala.collection.IterableView",
      "scala.collection.BufferedIterator",
      "scala.runtime.AbstractFunction1",
      "scala.collection.immutable.Seq",
      "scala.collection.mutable.Iterable",
      "scala.collection.immutable.Set",
      "scala.collection.mutable.IndexedSeq$class",
      "scala.collection.mutable.IndexedSeqView",
      "scala.collection.IndexedSeq$",
      "scala.Function1$$anonfun$compose$1",
      "scala.collection.IndexedSeqLike",
      "scala.collection.mutable.IndexedSeqOptimized",
      "scala.collection.mutable.MapLike",
      "scala.collection.GenTraversableLike",
      "scala.Product2",
      "scala.math.Numeric",
      "scala.collection.GenIterable$",
      "scala.collection.mutable.HashMap",
      "scala.util.control.NoStackTrace",
      "scala.util.Right",
      "scala.collection.generic.TraversableFactory",
      "scala.collection.mutable.IndexedSeq",
      "scala.PartialFunction$class",
      "scala.runtime.BoxedUnit",
      "scala.Option",
      "scala.collection.SeqLike$$anon$1",
      "scala.collection.generic.Subtractable",
      "scala.collection.IndexedSeq$class",
      "scala.collection.mutable.Traversable",
      "scala.collection.mutable.AbstractMap",
      "scala.Function1$$anonfun$andThen$1",
      "scala.collection.Parallelizable",
      "scala.Serializable",
      "scala.reflect.ScalaSignature",
      "scala.util.matching.Regex",
      "scala.collection.immutable.Stream$Cons",
      "scala.collection.mutable.BufferLike",
      "scala.collection.AbstractSeq",
      "scala.runtime.BoxesRunTime",
      "scala.collection.Iterable$",
      "org.apache.spark.storage.BlockId",
      "scala.collection.immutable.List",
      "scala.collection.TraversableLike$class",
      "scala.collection.Seq",
      "scala.collection.Set",
      "scala.collection.generic.GenericCompanion",
      "scala.collection.mutable.SeqLike$class",
      "scala.collection.immutable.VectorPointer",
      "scala.collection.immutable.LinearSeq",
      "scala.util.control.ControlThrowable",
      "scala.math.PartialOrdering",
      "scala.collection.GenTraversable$",
      "scala.collection.MapLike",
      "scala.collection.IndexedSeqOptimized$class",
      "scala.collection.mutable.Builder",
      "scala.collection.Traversable$class",
      "scala.collection.immutable.Stream$Empty$",
      "scala.collection.mutable.Iterable$",
      "scala.reflect.ClassTag",
      "scala.Function0",
      "scala.Function1",
      "scala.Function2",
      "scala.collection.GenMapLike",
      "scala.collection.ViewMkString",
      "scala.collection.GenMap",
      "org.apache.spark.storage.TaskResultBlockId",
      "scala.util.Either",
      "scala.collection.Parallelizable$class",
      "scala.collection.generic.GenericSeqCompanion",
      "scala.math.Ordered$class",
      "scala.collection.SeqView",
      "scala.collection.SeqLike$class",
      "scala.runtime.Statics",
      "scala.collection.mutable.Builder$class",
      "scala.None$",
      "scala.collection.TraversableViewLike",
      "scala.collection.mutable.Map",
      "scala.collection.immutable.Stream",
      "scala.Product",
      "scala.collection.GenTraversable$class",
      "scala.collection.Iterator$GroupedIterator",
      "scala.collection.immutable.Iterable",
      "scala.collection.mutable.HashTable$HashUtils",
      "scala.reflect.ClassManifestDeprecatedApis",
      "scala.collection.GenIterable",
      "scala.collection.script.Scriptable",
      "scala.collection.immutable.StringLike$class",
      "scala.collection.generic.IsTraversableLike",
      "scala.collection.GenSeqLike$class",
      "scala.collection.generic.SeqFactory",
      "scala.Cloneable",
      "scala.collection.mutable.Cloneable$class",
      "scala.Some",
      "scala.MatchError",
      "scala.collection.generic.GenSeqFactory",
      "scala.reflect.OptManifest",
      "scala.collection.TraversableOnce$class",
      "scala.collection.GenSeq$class",
      "scala.math.Ordered",
      "scala.UninitializedError",
      "scala.collection.TraversableLike",
      "org.apache.spark.storage.ShuffleBlockId",
      "scala.collection.SetLike",
      "scala.collection.IterableLike",
      "scala.collection.immutable.Map",
      "scala.collection.generic.CanBuildFrom",
      "org.apache.spark.annotation.DeveloperApi",
      "scala.collection.GenSetLike",
      "scala.collection.IndexedSeq",
      "scala.collection.IterableViewLike",
      "scala.collection.mutable.Traversable$",
      "scala.collection.generic.HasNewBuilder",
      "scala.collection.GenTraversableOnce",
      "scala.collection.AbstractTraversable",
      "scala.collection.immutable.MapLike",
      "scala.collection.AbstractIterator",
      "scala.Immutable",
      "scala.collection.AbstractIterable",
      "scala.runtime.ScalaRunTime$$anon$1",
      "scala.collection.Traversable",
      "scala.collection.immutable.$colon$colon",
      "scala.collection.immutable.Traversable",
      "scala.collection.generic.Growable$class",
      "scala.runtime.Nothing$",
      "scala.collection.Iterator",
      "scala.collection.TraversableOnce$$anonfun$addString$1",
      "scala.collection.IndexedSeqOptimized",
      "scala.collection.mutable.Seq$",
      "scala.collection.Traversable$",
      "scala.collection.Iterable",
      "scala.collection.mutable.AbstractSeq",
      "scala.collection.mutable.IndexedSeq$",
      "scala.collection.generic.Clearable",
      "scala.collection.mutable.Traversable$class",
      "scala.collection.generic.Growable",
      "scala.collection.IterableLike$class",
      "scala.collection.Iterable$class",
      "scala.collection.CustomParallelizable",
      "org.apache.spark.storage.BroadcastBlockId"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TaskResultBlockId_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.spark.storage.BlockId",
      "org.apache.spark.storage.TaskResultBlockId",
      "scala.runtime.AbstractFunction1",
      "scala.Function1$class",
      "org.apache.spark.storage.TaskResultBlockId$",
      "scala.runtime.ScalaRunTime$",
      "scala.Product$class",
      "scala.collection.AbstractTraversable",
      "scala.collection.AbstractIterable",
      "scala.collection.AbstractSeq",
      "scala.collection.mutable.AbstractSeq",
      "scala.collection.mutable.StringBuilder",
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
      "scala.collection.mutable.Traversable$class",
      "scala.collection.mutable.Iterable$class",
      "scala.collection.mutable.Cloneable$class",
      "scala.collection.mutable.SeqLike$class",
      "scala.collection.mutable.Seq$class",
      "scala.collection.IndexedSeqLike$class",
      "scala.collection.IndexedSeq$class",
      "scala.collection.mutable.IndexedSeqLike$class",
      "scala.collection.mutable.IndexedSeq$class",
      "scala.collection.IndexedSeqOptimized$class",
      "scala.math.Ordered$class",
      "scala.collection.immutable.StringLike$class",
      "scala.collection.generic.Growable$class",
      "scala.collection.mutable.Builder$class",
      "scala.runtime.BoxesRunTime",
      "scala.Option",
      "scala.Some",
      "scala.collection.AbstractIterator",
      "scala.runtime.ScalaRunTime$$anon$1",
      "scala.collection.Iterator$class",
      "scala.runtime.BooleanRef",
      "scala.collection.TraversableOnce$$anonfun$addString$1",
      "scala.runtime.BoxedUnit",
      "scala.collection.immutable.StringOps",
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
      "scala.sys.BooleanProp$$anonfun$keyExists$1",
      "scala.collection.generic.GenMapFactory",
      "scala.collection.generic.MapFactory",
      "scala.collection.generic.MutableMapFactory",
      "scala.collection.mutable.Map$",
      "scala.collection.immutable.List",
      "scala.collection.immutable.Traversable$class",
      "scala.collection.immutable.Iterable$class",
      "scala.collection.immutable.Seq$class",
      "scala.collection.LinearSeqLike$class",
      "scala.collection.LinearSeq$class",
      "scala.collection.immutable.LinearSeq$class",
      "scala.collection.LinearSeqOptimized$class",
      "scala.collection.immutable.Nil$",
      "scala.collection.AbstractMap",
      "scala.collection.mutable.AbstractMap",
      "scala.collection.mutable.HashMap",
      "scala.collection.GenMapLike$class",
      "scala.collection.generic.Subtractable$class",
      "scala.collection.MapLike$class",
      "scala.collection.Map$class",
      "scala.collection.generic.Shrinkable$class",
      "scala.collection.mutable.MapLike$class",
      "scala.collection.mutable.Map$class",
      "scala.collection.mutable.HashTable$HashUtils$class",
      "scala.collection.mutable.HashTable$class",
      "scala.collection.mutable.HashTable$",
      "scala.collection.CustomParallelizable$class",
      "scala.util.hashing.package$",
      "scala.collection.mutable.DefaultEntry",
      "scala.collection.mutable.HashEntry$class",
      "scala.None$",
      "scala.sys.package$",
      "scala.sys.SystemProperties",
      "scala.runtime.AbstractFunction0",
      "scala.runtime.AbstractFunction0$mcZ$sp",
      "scala.sys.SystemProperties$$anonfun$contains$1",
      "scala.Function0$class",
      "scala.Function0$mcZ$sp$class",
      "scala.sys.SystemProperties$$anonfun$get$1",
      "scala.Option$",
      "scala.util.control.NoStackTrace$",
      "scala.collection.Traversable$",
      "scala.collection.Iterable$",
      "scala.collection.generic.GenSeqFactory",
      "scala.collection.generic.SeqFactory",
      "scala.collection.Seq$",
      "scala.collection.generic.IndexedSeqFactory",
      "scala.collection.IndexedSeq$$anon$1",
      "scala.collection.IndexedSeq$",
      "scala.collection.Iterator$$anon$2",
      "scala.collection.Iterator$",
      "scala.collection.immutable.List$$anon$1",
      "scala.collection.immutable.List$",
      "scala.collection.immutable.$colon$colon$",
      "scala.collection.$plus$colon$",
      "scala.collection.$colon$plus$",
      "scala.collection.immutable.Stream$",
      "scala.collection.immutable.Stream$$hash$colon$colon$",
      "scala.collection.immutable.Vector",
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
      "scala.util.matching.Regex",
      "scala.collection.immutable.StringOps$",
      "org.apache.spark.storage.BlockId$",
      "scala.Function1$$anonfun$andThen$1",
      "org.apache.spark.SparkException",
      "org.apache.spark.storage.UnrecognizedBlockId",
      "scala.StringContext",
      "scala.collection.mutable.WrappedArray",
      "scala.collection.mutable.WrappedArray$ofRef",
      "scala.collection.mutable.ArrayLike$class",
      "scala.collection.mutable.WrappedArray$",
      "scala.StringContext$$anonfun$s$1",
      "scala.collection.IndexedSeqLike$Elements",
      "scala.collection.BufferedIterator$class",
      "scala.StringContext$",
      "scala.runtime.Statics",
      "scala.Function1$$anonfun$compose$1",
      "scala.runtime.RichInt$",
      "scala.collection.immutable.Range",
      "scala.collection.immutable.Range$Inclusive",
      "scala.collection.mutable.AbstractBuffer",
      "scala.collection.mutable.ListBuffer",
      "scala.collection.mutable.BufferLike$class",
      "scala.collection.mutable.Buffer$class",
      "scala.collection.generic.TraversableForwarder$class",
      "scala.collection.generic.IterableForwarder$class",
      "scala.collection.generic.SeqForwarder$class",
      "scala.collection.generic.Growable$$anonfun$$plus$plus$eq$1",
      "scala.collection.immutable.$colon$colon",
      "scala.util.matching.Regex$$anonfun$unapplySeq$1"
    );
  }
}
