/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 22:29:22 GMT 2022
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
public class RuntimePercentage_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.spark.scheduler.RuntimePercentage"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RuntimePercentage_ESTest_scaffolding.class.getClassLoader() ,
      "scala.collection.Seq$",
      "scala.runtime.BooleanRef",
      "scala.math.Equiv",
      "scala.collection.mutable.Iterable$class",
      "org.apache.spark.scheduler.AccumulableInfo",
      "scala.Function1$class",
      "scala.collection.generic.Shrinkable",
      "scala.collection.mutable.Seq$class",
      "scala.collection.LinearSeqOptimized",
      "org.apache.spark.executor.ShuffleWriteMetrics",
      "scala.collection.Iterator$class",
      "scala.collection.generic.IndexedSeqFactory",
      "scala.collection.AbstractMap",
      "scala.collection.immutable.IndexedSeq",
      "scala.collection.immutable.StringLike",
      "scala.collection.Map",
      "org.apache.spark.SparkContext",
      "scala.collection.mutable.HashTable",
      "scala.Predef$StringAdd",
      "scala.collection.mutable.IndexedSeqLike",
      "scala.Option$WithFilter",
      "scala.collection.mutable.Buffer",
      "scala.Function0$mcJ$sp",
      "scala.Product$class",
      "scala.collection.generic.FilterMonadic",
      "scala.runtime.ScalaRunTime$",
      "scala.runtime.NonLocalReturnControl",
      "scala.collection.mutable.Cloneable",
      "scala.collection.generic.GenTraversableFactory",
      "scala.collection.SeqViewLike",
      "scala.Predef$RichException$",
      "scala.collection.GenIterableLike",
      "scala.Equals",
      "scala.collection.GenIterable$class",
      "scala.Predef$Triple$",
      "scala.collection.generic.GenericSetTemplate",
      "scala.collection.mutable.StringBuilder",
      "scala.collection.generic.GenericTraversableTemplate",
      "scala.Mutable",
      "scala.math.Ordering",
      "scala.collection.GenSet",
      "scala.collection.GenTraversable",
      "scala.collection.GenSeq",
      "scala.collection.GenSeqLike",
      "org.apache.spark.internal.Logging",
      "org.apache.spark.util.LongAccumulator",
      "scala.collection.immutable.Vector",
      "scala.collection.mutable.Seq",
      "scala.collection.SeqLike",
      "scala.collection.LinearSeq",
      "scala.collection.TraversableView",
      "scala.collection.GenSeq$",
      "scala.Predef$$eq$colon$eq$",
      "scala.collection.LinearSeqLike",
      "scala.collection.mutable.SeqLike",
      "scala.util.Left",
      "org.apache.spark.storage.BlockStatus",
      "scala.collection.immutable.Nil$",
      "org.apache.spark.executor.TempShuffleReadMetrics",
      "scala.Predef$$eq$colon$eq",
      "scala.Predef$$less$colon$less",
      "scala.PartialFunction",
      "scala.collection.generic.GenericTraversableTemplate$class",
      "scala.Function0$class",
      "scala.Function0$mcD$sp$class",
      "scala.collection.Seq$class",
      "scala.collection.IndexedSeqLike$class",
      "scala.collection.TraversableOnce",
      "scala.Tuple2",
      "org.apache.spark.executor.OutputMetrics",
      "scala.Tuple3",
      "scala.collection.mutable.IndexedSeqLike$class",
      "scala.Predef$any2stringadd",
      "scala.Predef$ArrowAssoc",
      "scala.collection.IterableView",
      "scala.collection.BufferedIterator",
      "scala.runtime.AbstractFunction0",
      "scala.runtime.AbstractFunction1",
      "scala.collection.immutable.Seq",
      "scala.collection.mutable.Iterable",
      "scala.Predef$SeqCharSequence",
      "scala.collection.immutable.Set",
      "scala.collection.mutable.IndexedSeq$class",
      "scala.collection.mutable.IndexedSeqView",
      "scala.collection.IndexedSeq$",
      "scala.collection.IndexedSeqLike",
      "scala.collection.mutable.IndexedSeqOptimized",
      "scala.collection.mutable.MapLike",
      "scala.collection.GenTraversableLike",
      "scala.Predef",
      "scala.Product3",
      "scala.Product2",
      "scala.Predef$Pair$",
      "scala.math.Numeric",
      "scala.collection.GenIterable$",
      "scala.collection.mutable.HashMap",
      "scala.util.control.NoStackTrace",
      "scala.Predef$DummyImplicit$",
      "scala.util.Right",
      "scala.collection.generic.TraversableFactory",
      "scala.Predef$StringFormat",
      "scala.collection.mutable.IndexedSeq",
      "scala.PartialFunction$class",
      "scala.runtime.BoxedUnit",
      "scala.Function1$mcDJ$sp",
      "scala.Function1$mcDJ$sp$class",
      "org.apache.spark.util.CollectionAccumulator",
      "scala.Option",
      "scala.collection.SeqLike$$anon$1",
      "scala.collection.generic.Subtractable",
      "scala.collection.IndexedSeq$class",
      "scala.collection.mutable.Traversable",
      "scala.collection.mutable.AbstractMap",
      "scala.Product3$class",
      "scala.collection.Parallelizable",
      "scala.Serializable",
      "org.apache.spark.executor.ShuffleReadMetrics",
      "scala.reflect.ScalaSignature",
      "org.apache.spark.scheduler.RuntimePercentage$",
      "scala.Predef$ArrowAssoc$",
      "scala.collection.immutable.Stream$Cons",
      "scala.collection.mutable.BufferLike",
      "scala.collection.AbstractSeq",
      "scala.runtime.BoxesRunTime",
      "scala.collection.Iterable$",
      "scala.collection.immutable.List",
      "org.apache.spark.storage.BlockId",
      "scala.collection.TraversableLike$class",
      "scala.collection.Seq",
      "org.apache.spark.executor.TaskMetrics",
      "scala.collection.Set",
      "scala.collection.generic.GenericCompanion",
      "scala.collection.mutable.SeqLike$class",
      "scala.collection.immutable.VectorPointer",
      "scala.collection.immutable.LinearSeq",
      "scala.util.control.ControlThrowable",
      "scala.math.PartialOrdering",
      "scala.runtime.AbstractFunction1$mcDJ$sp",
      "scala.collection.MapLike",
      "scala.collection.GenTraversable$",
      "scala.collection.IndexedSeqOptimized$class",
      "scala.collection.mutable.Builder",
      "scala.collection.immutable.Stream$Empty$",
      "scala.collection.Traversable$class",
      "scala.collection.mutable.Iterable$",
      "scala.reflect.ClassTag",
      "scala.Function0",
      "scala.Function1",
      "scala.Function2",
      "scala.Predef$DummyImplicit",
      "scala.collection.GenMapLike",
      "scala.collection.ViewMkString",
      "scala.collection.GenMap",
      "scala.util.Either",
      "scala.collection.Parallelizable$class",
      "scala.collection.generic.GenericSeqCompanion",
      "scala.math.Ordered$class",
      "scala.collection.SeqView",
      "scala.collection.SeqLike$class",
      "scala.runtime.Statics",
      "org.apache.spark.scheduler.RuntimePercentage$$anonfun$5",
      "scala.collection.mutable.ResizableArray",
      "scala.collection.mutable.Builder$class",
      "org.apache.spark.scheduler.RuntimePercentage$$anonfun$3",
      "org.apache.spark.scheduler.RuntimePercentage$$anonfun$4",
      "scala.None$",
      "scala.collection.TraversableViewLike",
      "scala.collection.mutable.Map",
      "scala.runtime.AbstractFunction0$mcJ$sp",
      "scala.Predef$Ensuring$",
      "scala.collection.immutable.Stream",
      "scala.Product",
      "scala.collection.GenTraversable$class",
      "scala.collection.Iterator$GroupedIterator",
      "scala.collection.immutable.Iterable",
      "scala.Predef$StringFormat$",
      "scala.Predef$RichException",
      "scala.collection.mutable.HashTable$HashUtils",
      "org.apache.spark.scheduler.RuntimePercentage",
      "scala.reflect.ClassManifestDeprecatedApis",
      "scala.collection.GenIterable",
      "scala.collection.script.Scriptable",
      "scala.collection.mutable.AbstractBuffer",
      "scala.collection.immutable.StringLike$class",
      "scala.collection.GenSeqLike$class",
      "scala.collection.generic.SeqFactory",
      "scala.Cloneable",
      "scala.collection.mutable.Cloneable$class",
      "scala.Predef$any2stringadd$",
      "scala.Some",
      "scala.Function0$mcJ$sp$class",
      "scala.MatchError",
      "scala.collection.generic.GenSeqFactory",
      "scala.reflect.OptManifest",
      "scala.collection.TraversableOnce$class",
      "scala.runtime.Null$",
      "scala.collection.GenSeq$class",
      "scala.math.Ordered",
      "scala.UninitializedError",
      "scala.collection.TraversableLike",
      "scala.collection.SetLike",
      "scala.collection.IterableLike",
      "scala.Predef$Ensuring",
      "scala.runtime.AbstractFunction0$mcD$sp",
      "scala.collection.immutable.Map",
      "org.apache.spark.util.AccumulatorV2",
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
      "scala.collection.mutable.ArrayBuffer",
      "scala.collection.immutable.$colon$colon",
      "scala.collection.immutable.Traversable",
      "scala.collection.generic.Growable$class",
      "scala.runtime.Nothing$",
      "scala.collection.Iterator",
      "scala.collection.TraversableOnce$$anonfun$addString$1",
      "scala.collection.IndexedSeqOptimized",
      "scala.collection.mutable.Seq$",
      "scala.collection.Traversable$",
      "scala.Predef$StringAdd$",
      "scala.collection.Iterable",
      "scala.collection.mutable.AbstractSeq",
      "scala.collection.mutable.IndexedSeq$",
      "scala.collection.generic.Clearable",
      "scala.collection.mutable.Traversable$class",
      "scala.collection.generic.Growable",
      "scala.Function0$mcD$sp",
      "org.apache.spark.executor.InputMetrics",
      "scala.collection.IterableLike$class",
      "scala.collection.CustomParallelizable",
      "scala.collection.Iterable$class"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.spark.executor.ShuffleReadMetrics", false, RuntimePercentage_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.spark.executor.TaskMetrics", false, RuntimePercentage_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("scala.Option", false, RuntimePercentage_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RuntimePercentage_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.spark.scheduler.RuntimePercentage",
      "org.apache.spark.scheduler.RuntimePercentage$",
      "scala.runtime.AbstractFunction1",
      "scala.runtime.AbstractFunction1$mcDJ$sp",
      "org.apache.spark.scheduler.RuntimePercentage$$anonfun$3",
      "scala.runtime.AbstractFunction0",
      "scala.runtime.AbstractFunction0$mcJ$sp",
      "org.apache.spark.scheduler.RuntimePercentage$$anonfun$4",
      "scala.runtime.AbstractFunction0$mcD$sp",
      "org.apache.spark.scheduler.RuntimePercentage$$anonfun$5",
      "scala.runtime.ScalaRunTime$",
      "org.apache.spark.executor.TaskMetrics",
      "scala.Option",
      "scala.Some",
      "scala.Product$class",
      "scala.collection.AbstractIterator",
      "scala.runtime.ScalaRunTime$$anon$1",
      "scala.collection.TraversableOnce$class",
      "scala.collection.Iterator$class",
      "scala.collection.AbstractTraversable",
      "scala.collection.AbstractIterable",
      "scala.collection.AbstractSeq",
      "scala.collection.mutable.AbstractSeq",
      "scala.collection.mutable.StringBuilder",
      "scala.collection.Parallelizable$class",
      "scala.collection.TraversableLike$class",
      "scala.collection.generic.GenericTraversableTemplate$class",
      "scala.collection.GenTraversable$class",
      "scala.collection.Traversable$class",
      "scala.collection.GenIterable$class",
      "scala.collection.IterableLike$class",
      "scala.collection.Iterable$class",
      "scala.Function1$class",
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
      "scala.runtime.BooleanRef",
      "scala.collection.TraversableOnce$$anonfun$addString$1",
      "scala.runtime.BoxesRunTime",
      "scala.runtime.BoxedUnit",
      "scala.Tuple3",
      "scala.Product3$class",
      "scala.runtime.Statics",
      "scala.None$",
      "org.apache.spark.executor.ShuffleReadMetrics",
      "scala.Function1$mcDJ$sp$class",
      "scala.Function0$class",
      "scala.Function0$mcJ$sp$class",
      "scala.Function0$mcD$sp$class"
    );
  }
}
