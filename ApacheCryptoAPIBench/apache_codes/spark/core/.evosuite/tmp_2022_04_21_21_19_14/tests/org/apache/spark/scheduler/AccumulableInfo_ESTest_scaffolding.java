/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 21:51:08 GMT 2022
 */

package org.apache.spark.scheduler;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AccumulableInfo_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.spark.scheduler.AccumulableInfo"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AccumulableInfo_ESTest_scaffolding.class.getClassLoader() ,
      "scala.collection.Seq$",
      "scala.runtime.BooleanRef",
      "scala.collection.Parallelizable",
      "scala.math.Equiv",
      "scala.collection.mutable.Iterable$class",
      "scala.Serializable",
      "scala.reflect.ScalaSignature",
      "org.apache.spark.scheduler.AccumulableInfo",
      "scala.Function1$class",
      "scala.collection.generic.Shrinkable",
      "scala.collection.mutable.Seq$class",
      "scala.collection.LinearSeqOptimized",
      "scala.collection.immutable.Stream$Cons",
      "scala.collection.Iterator$class",
      "scala.collection.mutable.BufferLike",
      "scala.collection.generic.IndexedSeqFactory",
      "scala.collection.AbstractSeq",
      "scala.collection.AbstractMap",
      "scala.Product7$class",
      "scala.runtime.BoxesRunTime",
      "scala.collection.immutable.IndexedSeq",
      "scala.collection.Iterable$",
      "scala.collection.immutable.StringLike",
      "scala.collection.Map",
      "scala.collection.immutable.List",
      "scala.collection.TraversableLike$class",
      "scala.collection.Seq",
      "scala.collection.mutable.HashTable",
      "scala.collection.Set",
      "scala.collection.generic.GenericCompanion",
      "scala.collection.mutable.SeqLike$class",
      "scala.collection.immutable.VectorPointer",
      "scala.collection.immutable.LinearSeq",
      "scala.util.control.ControlThrowable",
      "scala.collection.mutable.IndexedSeqLike",
      "scala.math.PartialOrdering",
      "scala.Option$WithFilter",
      "scala.collection.mutable.Buffer",
      "scala.collection.GenTraversable$",
      "scala.collection.MapLike",
      "scala.collection.IndexedSeqOptimized$class",
      "scala.Product$class",
      "scala.collection.mutable.Builder",
      "scala.collection.immutable.Stream$Empty$",
      "scala.collection.Traversable$class",
      "scala.collection.generic.FilterMonadic",
      "scala.runtime.ScalaRunTime$",
      "scala.runtime.NonLocalReturnControl",
      "scala.collection.mutable.Cloneable",
      "scala.collection.generic.GenTraversableFactory",
      "scala.collection.mutable.Iterable$",
      "scala.reflect.ClassTag",
      "scala.collection.SeqViewLike",
      "scala.collection.GenIterableLike",
      "scala.Equals",
      "scala.Function0",
      "scala.Function1",
      "scala.collection.GenIterable$class",
      "scala.collection.generic.GenericSetTemplate",
      "scala.Function2",
      "scala.collection.mutable.StringBuilder",
      "scala.collection.generic.GenericTraversableTemplate",
      "scala.Mutable",
      "scala.math.Ordering",
      "scala.collection.GenMapLike",
      "scala.collection.GenSet",
      "scala.collection.ViewMkString",
      "scala.collection.GenMap",
      "scala.collection.GenTraversable",
      "scala.collection.GenSeq",
      "scala.util.Either",
      "scala.collection.Parallelizable$class",
      "scala.collection.generic.GenericSeqCompanion",
      "scala.math.Ordered$class",
      "scala.collection.SeqView",
      "scala.collection.SeqLike$class",
      "scala.runtime.Statics",
      "scala.collection.GenSeqLike",
      "scala.collection.mutable.Builder$class",
      "scala.None$",
      "scala.collection.TraversableViewLike",
      "scala.collection.mutable.Map",
      "scala.collection.immutable.Vector",
      "scala.collection.mutable.Seq",
      "scala.collection.immutable.Stream",
      "scala.collection.SeqLike",
      "scala.collection.LinearSeq",
      "scala.Product",
      "scala.collection.GenTraversable$class",
      "scala.collection.Iterator$GroupedIterator",
      "scala.collection.TraversableView",
      "scala.collection.immutable.Iterable",
      "scala.collection.GenSeq$",
      "scala.collection.mutable.HashTable$HashUtils",
      "scala.collection.LinearSeqLike",
      "scala.reflect.ClassManifestDeprecatedApis",
      "scala.collection.GenIterable",
      "scala.collection.script.Scriptable",
      "scala.collection.mutable.SeqLike",
      "scala.util.Left",
      "scala.collection.immutable.StringLike$class",
      "scala.collection.GenSeqLike$class",
      "scala.collection.generic.SeqFactory",
      "scala.Cloneable",
      "scala.collection.mutable.Cloneable$class",
      "scala.collection.immutable.Nil$",
      "scala.Some",
      "scala.Predef$$less$colon$less",
      "scala.MatchError",
      "scala.PartialFunction",
      "scala.collection.generic.GenSeqFactory",
      "scala.reflect.OptManifest",
      "scala.collection.TraversableOnce$class",
      "scala.collection.generic.GenericTraversableTemplate$class",
      "scala.Tuple7",
      "scala.collection.Seq$class",
      "scala.collection.IndexedSeqLike$class",
      "scala.collection.GenSeq$class",
      "scala.collection.TraversableOnce",
      "scala.Tuple2",
      "scala.collection.mutable.IndexedSeqLike$class",
      "scala.math.Ordered",
      "scala.UninitializedError",
      "scala.collection.IterableView",
      "scala.collection.TraversableLike",
      "scala.collection.SetLike",
      "scala.collection.IterableLike",
      "scala.collection.BufferedIterator",
      "scala.collection.immutable.Map",
      "scala.runtime.AbstractFunction1",
      "scala.collection.immutable.Seq",
      "scala.collection.generic.CanBuildFrom",
      "scala.collection.mutable.Iterable",
      "org.apache.spark.annotation.DeveloperApi",
      "scala.collection.immutable.Set",
      "scala.collection.GenSetLike",
      "scala.collection.IndexedSeq",
      "scala.collection.IterableViewLike",
      "org.apache.spark.scheduler.AccumulableInfo$",
      "scala.collection.mutable.Traversable$",
      "scala.collection.mutable.IndexedSeq$class",
      "scala.collection.mutable.IndexedSeqView",
      "scala.collection.IndexedSeq$",
      "scala.collection.IndexedSeqLike",
      "scala.collection.mutable.IndexedSeqOptimized",
      "scala.collection.generic.HasNewBuilder",
      "scala.collection.mutable.MapLike",
      "scala.collection.GenTraversableOnce",
      "scala.Product7",
      "scala.collection.GenTraversableLike",
      "scala.collection.AbstractTraversable",
      "scala.collection.immutable.MapLike",
      "scala.Option$",
      "scala.collection.AbstractIterator",
      "scala.Immutable",
      "scala.collection.AbstractIterable",
      "scala.Product2",
      "scala.runtime.ScalaRunTime$$anon$1",
      "scala.math.Numeric",
      "scala.collection.Traversable",
      "scala.collection.GenIterable$",
      "scala.collection.mutable.HashMap",
      "scala.collection.immutable.$colon$colon",
      "scala.util.control.NoStackTrace",
      "scala.collection.immutable.Traversable",
      "scala.util.Right",
      "scala.collection.generic.Growable$class",
      "scala.runtime.Nothing$",
      "scala.collection.Iterator",
      "scala.collection.generic.TraversableFactory",
      "scala.collection.TraversableOnce$$anonfun$addString$1",
      "scala.collection.mutable.IndexedSeq",
      "scala.collection.IndexedSeqOptimized",
      "scala.PartialFunction$class",
      "scala.collection.mutable.Seq$",
      "scala.collection.Traversable$",
      "scala.collection.Iterable",
      "scala.runtime.BoxedUnit",
      "scala.Option",
      "scala.collection.SeqLike$$anon$1",
      "scala.collection.mutable.AbstractSeq",
      "scala.collection.generic.Subtractable",
      "scala.collection.mutable.IndexedSeq$",
      "scala.collection.generic.Clearable",
      "scala.collection.mutable.Traversable$class",
      "scala.collection.generic.Growable",
      "scala.collection.IndexedSeq$class",
      "scala.collection.mutable.Traversable",
      "scala.collection.IterableLike$class",
      "scala.collection.mutable.AbstractMap",
      "scala.collection.Iterable$class",
      "scala.collection.CustomParallelizable"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AccumulableInfo_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.spark.scheduler.AccumulableInfo",
      "org.apache.spark.scheduler.AccumulableInfo$",
      "scala.runtime.ScalaRunTime$",
      "scala.Option$",
      "scala.Option",
      "scala.Some",
      "scala.Product$class",
      "scala.None$",
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
      "scala.runtime.AbstractFunction1",
      "scala.collection.TraversableOnce$$anonfun$addString$1",
      "scala.runtime.BoxesRunTime",
      "scala.runtime.BoxedUnit",
      "scala.Tuple7",
      "scala.Product7$class",
      "scala.runtime.Statics"
    );
  }
}
