/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 22:41:41 GMT 2022
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
public class StageCancelled_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.spark.scheduler.StageCancelled"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(StageCancelled_ESTest_scaffolding.class.getClassLoader() ,
      "scala.collection.Seq$",
      "scala.runtime.BooleanRef",
      "scala.math.Equiv",
      "scala.collection.mutable.Iterable$class",
      "scala.Product2$mcDJ$sp",
      "scala.Tuple2$mcID$sp",
      "scala.Function1$class",
      "scala.collection.generic.Shrinkable",
      "scala.collection.mutable.Seq$class",
      "scala.collection.LinearSeqOptimized",
      "scala.collection.Iterator$class",
      "scala.collection.generic.IndexedSeqFactory",
      "scala.collection.AbstractMap",
      "scala.collection.immutable.IndexedSeq",
      "scala.collection.immutable.StringLike",
      "org.apache.spark.scheduler.StageCancelled",
      "scala.collection.Map",
      "scala.Product2$class",
      "scala.Function2$$anonfun$tupled$1",
      "scala.collection.mutable.HashTable",
      "scala.Tuple2$mcII$sp",
      "scala.Predef$StringAdd",
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
      "scala.Predef$RichException$",
      "scala.collection.GenIterableLike",
      "scala.Equals",
      "scala.collection.GenIterable$class",
      "scala.Predef$Triple$",
      "scala.collection.generic.GenericSetTemplate",
      "scala.Tuple2$mcIJ$sp",
      "scala.collection.mutable.StringBuilder",
      "scala.collection.generic.GenericTraversableTemplate",
      "scala.Tuple2$mcZC$sp",
      "scala.Mutable",
      "scala.math.Ordering",
      "scala.Tuple2$mcIZ$sp",
      "scala.collection.GenSet",
      "scala.collection.GenTraversable",
      "scala.collection.GenSeq",
      "scala.collection.GenSeqLike",
      "scala.Function2$class",
      "scala.collection.immutable.Vector",
      "scala.collection.mutable.Seq",
      "scala.collection.SeqLike",
      "scala.collection.LinearSeq",
      "scala.collection.TraversableView",
      "scala.collection.GenSeq$",
      "scala.Tuple2$mcCZ$sp",
      "scala.Predef$$eq$colon$eq$",
      "scala.collection.LinearSeqLike",
      "scala.Tuple2$mcZI$sp",
      "scala.Tuple2$mcCJ$sp",
      "scala.collection.mutable.SeqLike",
      "scala.util.Left",
      "scala.collection.immutable.Nil$",
      "scala.Predef$$eq$colon$eq",
      "scala.Predef$$less$colon$less",
      "scala.PartialFunction",
      "scala.collection.generic.GenericTraversableTemplate$class",
      "scala.collection.Seq$class",
      "scala.collection.IndexedSeqLike$class",
      "scala.collection.TraversableOnce",
      "scala.Tuple2",
      "scala.collection.mutable.IndexedSeqLike$class",
      "scala.Predef$any2stringadd",
      "scala.Predef$ArrowAssoc",
      "scala.collection.IterableView",
      "scala.collection.BufferedIterator",
      "scala.runtime.AbstractFunction1",
      "scala.runtime.AbstractFunction2",
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
      "scala.Product2$mcDD$sp",
      "scala.Predef",
      "scala.Tuple2$mcZZ$sp",
      "scala.Product2",
      "scala.Predef$Pair$",
      "scala.math.Numeric",
      "scala.Product2$mcIJ$sp",
      "scala.collection.GenIterable$",
      "scala.collection.mutable.HashMap",
      "scala.util.control.NoStackTrace",
      "scala.Predef$DummyImplicit$",
      "scala.util.Right",
      "scala.Tuple2$mcCD$sp",
      "scala.collection.generic.TraversableFactory",
      "scala.Predef$StringFormat",
      "scala.collection.mutable.IndexedSeq",
      "scala.PartialFunction$class",
      "scala.Product2$mcDI$sp",
      "scala.runtime.BoxedUnit",
      "scala.Option",
      "scala.Tuple2$mcZD$sp",
      "scala.collection.SeqLike$$anon$1",
      "scala.collection.generic.Subtractable",
      "scala.Tuple2$mcCI$sp",
      "scala.collection.IndexedSeq$class",
      "scala.collection.mutable.Traversable",
      "scala.collection.mutable.AbstractMap",
      "scala.collection.Parallelizable",
      "scala.Tuple2$mcCC$sp",
      "scala.Serializable",
      "scala.reflect.ScalaSignature",
      "scala.Function2$$anonfun$curried$1",
      "scala.Predef$ArrowAssoc$",
      "scala.collection.immutable.Stream$Cons",
      "scala.Tuple2$mcDZ$sp",
      "scala.collection.mutable.BufferLike",
      "scala.collection.AbstractSeq",
      "scala.Tuple2$mcDJ$sp",
      "scala.runtime.BoxesRunTime",
      "scala.Product2$mcID$sp",
      "scala.collection.Iterable$",
      "scala.collection.immutable.List",
      "scala.collection.TraversableLike$class",
      "scala.collection.Seq",
      "scala.collection.Set",
      "scala.collection.generic.GenericCompanion",
      "scala.collection.mutable.SeqLike$class",
      "scala.collection.immutable.VectorPointer",
      "scala.Tuple2$mcZJ$sp",
      "scala.collection.immutable.LinearSeq",
      "scala.util.control.ControlThrowable",
      "scala.math.PartialOrdering",
      "scala.collection.GenTraversable$",
      "scala.collection.MapLike",
      "scala.collection.IndexedSeqOptimized$class",
      "scala.Product2$mcII$sp",
      "scala.collection.mutable.Builder",
      "scala.collection.immutable.Stream$Empty$",
      "scala.collection.Traversable$class",
      "scala.collection.mutable.Iterable$",
      "scala.reflect.ClassTag",
      "scala.Function0",
      "scala.Product2$mcJJ$sp",
      "scala.Function1",
      "scala.Function2",
      "scala.Predef$DummyImplicit",
      "scala.Tuple2$mcDD$sp",
      "scala.collection.GenMapLike",
      "scala.collection.ViewMkString",
      "scala.collection.GenMap",
      "scala.util.Either",
      "scala.collection.Parallelizable$class",
      "scala.Tuple2$mcJC$sp",
      "scala.collection.generic.GenericSeqCompanion",
      "scala.math.Ordered$class",
      "scala.collection.SeqView",
      "scala.collection.SeqLike$class",
      "scala.runtime.Statics",
      "scala.collection.mutable.Builder$class",
      "scala.None$",
      "scala.collection.TraversableViewLike",
      "scala.collection.mutable.Map",
      "scala.Predef$Ensuring$",
      "scala.collection.immutable.Stream",
      "scala.Tuple2$mcDI$sp",
      "scala.Product",
      "scala.collection.GenTraversable$class",
      "scala.collection.Iterator$GroupedIterator",
      "scala.collection.immutable.Iterable",
      "scala.Predef$StringFormat$",
      "scala.Predef$RichException",
      "scala.collection.mutable.HashTable$HashUtils",
      "scala.Product2$mcJD$sp",
      "scala.reflect.ClassManifestDeprecatedApis",
      "scala.collection.GenIterable",
      "scala.collection.script.Scriptable",
      "scala.collection.immutable.StringLike$class",
      "scala.collection.GenSeqLike$class",
      "scala.collection.generic.SeqFactory",
      "scala.Cloneable",
      "scala.collection.mutable.Cloneable$class",
      "scala.Predef$any2stringadd$",
      "scala.Some",
      "scala.MatchError",
      "scala.Tuple2$mcJZ$sp",
      "scala.collection.generic.GenSeqFactory",
      "scala.reflect.OptManifest",
      "scala.collection.TraversableOnce$class",
      "scala.runtime.Null$",
      "scala.Product2$mcJI$sp",
      "scala.collection.GenSeq$class",
      "org.apache.spark.scheduler.StageCancelled$",
      "scala.math.Ordered",
      "scala.Tuple2$mcDC$sp",
      "scala.UninitializedError",
      "scala.collection.TraversableLike",
      "scala.collection.SetLike",
      "scala.collection.IterableLike",
      "scala.Predef$Ensuring",
      "scala.collection.immutable.Map",
      "scala.Tuple2$mcJJ$sp",
      "scala.collection.generic.CanBuildFrom",
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
      "scala.Tuple2$mcJI$sp",
      "org.apache.spark.scheduler.DAGSchedulerEvent",
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
      "scala.Predef$StringAdd$",
      "scala.collection.Iterable",
      "scala.Tuple2$mcIC$sp",
      "scala.collection.mutable.AbstractSeq",
      "scala.collection.mutable.IndexedSeq$",
      "scala.collection.generic.Clearable",
      "scala.collection.mutable.Traversable$class",
      "scala.collection.generic.Growable",
      "scala.collection.IterableLike$class",
      "scala.collection.Iterable$class",
      "scala.collection.CustomParallelizable",
      "scala.Tuple2$mcJD$sp"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("scala.Option", false, StageCancelled_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(StageCancelled_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.spark.scheduler.StageCancelled",
      "scala.runtime.AbstractFunction2",
      "scala.Function2$class",
      "org.apache.spark.scheduler.StageCancelled$",
      "scala.runtime.ScalaRunTime$",
      "scala.runtime.AbstractFunction1",
      "scala.Function2$$anonfun$curried$1",
      "scala.Function1$class",
      "scala.Option",
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
      "scala.Function2$$anonfun$tupled$1",
      "scala.runtime.Statics",
      "scala.Some",
      "scala.Tuple2",
      "scala.Product2$class",
      "scala.None$"
    );
  }
}
