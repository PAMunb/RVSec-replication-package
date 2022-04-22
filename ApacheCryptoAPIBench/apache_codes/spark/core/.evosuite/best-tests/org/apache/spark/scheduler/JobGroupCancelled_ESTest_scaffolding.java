/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 22:53:40 GMT 2022
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
public class JobGroupCancelled_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.spark.scheduler.JobGroupCancelled"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JobGroupCancelled_ESTest_scaffolding.class.getClassLoader() ,
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
      "scala.util.hashing.MurmurHash3$ArrayHashing$mcI$sp",
      "scala.collection.AbstractMap",
      "scala.util.hashing.MurmurHash3$ArrayHashing$mcC$sp",
      "scala.collection.immutable.IndexedSeq",
      "scala.collection.immutable.StringLike",
      "scala.collection.Map",
      "scala.collection.mutable.HashTable",
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
      "scala.util.hashing.MurmurHash3$ArrayHashing",
      "scala.collection.GenIterableLike",
      "scala.Equals",
      "scala.collection.GenIterable$class",
      "scala.collection.generic.GenericSetTemplate",
      "scala.collection.mutable.StringBuilder",
      "scala.collection.generic.GenericTraversableTemplate",
      "scala.Mutable",
      "scala.math.Ordering",
      "scala.util.hashing.MurmurHash3$ArrayHashing$mcS$sp",
      "scala.collection.GenSet",
      "scala.collection.GenTraversable",
      "scala.collection.GenSeq",
      "scala.collection.GenSeqLike",
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
      "scala.util.hashing.MurmurHash3$ArrayHashing$mcB$sp",
      "scala.collection.mutable.IndexedSeq$class",
      "scala.collection.mutable.IndexedSeqView",
      "scala.Function1$$anonfun$compose$1",
      "scala.collection.IndexedSeq$",
      "scala.collection.IndexedSeqLike",
      "scala.collection.mutable.IndexedSeqOptimized",
      "scala.collection.mutable.MapLike",
      "org.apache.spark.scheduler.JobGroupCancelled",
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
      "scala.util.hashing.MurmurHash3",
      "scala.runtime.BoxedUnit",
      "scala.Option",
      "org.apache.spark.scheduler.JobGroupCancelled$",
      "scala.collection.SeqLike$$anon$1",
      "scala.collection.generic.Subtractable",
      "scala.collection.IndexedSeq$class",
      "scala.collection.mutable.Traversable",
      "scala.collection.mutable.AbstractMap",
      "scala.Function1$$anonfun$andThen$1",
      "scala.collection.Parallelizable",
      "scala.Serializable",
      "scala.reflect.ScalaSignature",
      "scala.collection.immutable.Stream$Cons",
      "scala.collection.mutable.BufferLike",
      "scala.collection.AbstractSeq",
      "scala.runtime.BoxesRunTime",
      "scala.collection.Iterable$",
      "scala.collection.immutable.List",
      "scala.collection.TraversableLike$class",
      "scala.collection.Seq",
      "scala.util.hashing.MurmurHash3$ArrayHashing$mcV$sp",
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
      "scala.collection.immutable.Stream$Empty$",
      "scala.collection.Traversable$class",
      "scala.util.hashing.MurmurHash3$ArrayHashing$mcF$sp",
      "scala.collection.mutable.Iterable$",
      "scala.reflect.ClassTag",
      "scala.Function0",
      "scala.Function1",
      "scala.Function2",
      "scala.collection.GenMapLike",
      "scala.collection.ViewMkString",
      "scala.collection.GenMap",
      "scala.util.Either",
      "scala.collection.Parallelizable$class",
      "scala.collection.generic.GenericSeqCompanion",
      "scala.math.Ordered$class",
      "scala.collection.SeqView",
      "scala.collection.SeqLike$class",
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
      "scala.collection.GenSeqLike$class",
      "scala.collection.generic.SeqFactory",
      "scala.Cloneable",
      "scala.collection.mutable.Cloneable$class",
      "scala.util.hashing.MurmurHash3$ArrayHashing$mcZ$sp",
      "scala.Some",
      "scala.MatchError",
      "scala.collection.generic.GenSeqFactory",
      "scala.reflect.OptManifest",
      "scala.collection.TraversableOnce$class",
      "scala.collection.GenSeq$class",
      "scala.math.Ordered",
      "scala.UninitializedError",
      "scala.collection.TraversableLike",
      "scala.collection.SetLike",
      "scala.collection.IterableLike",
      "scala.collection.immutable.Map",
      "scala.util.hashing.MurmurHash3$ArrayHashing$mcJ$sp",
      "scala.collection.generic.CanBuildFrom",
      "scala.util.hashing.MurmurHash3$ArrayHashing$mcD$sp",
      "scala.collection.GenSetLike",
      "scala.collection.IndexedSeq",
      "scala.collection.IterableViewLike",
      "scala.util.hashing.MurmurHash3$",
      "scala.collection.mutable.Traversable$",
      "scala.collection.generic.HasNewBuilder",
      "scala.collection.GenTraversableOnce",
      "scala.collection.AbstractTraversable",
      "scala.collection.immutable.MapLike",
      "scala.collection.AbstractIterator",
      "scala.Immutable",
      "scala.collection.AbstractIterable",
      "scala.runtime.ScalaRunTime$$anon$1",
      "org.apache.spark.scheduler.DAGSchedulerEvent",
      "scala.collection.Traversable",
      "scala.collection.immutable.$colon$colon",
      "scala.collection.immutable.Traversable",
      "scala.util.hashing.Hashing",
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
      "scala.collection.CustomParallelizable"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JobGroupCancelled_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.spark.scheduler.JobGroupCancelled",
      "scala.runtime.AbstractFunction1",
      "scala.Function1$class",
      "org.apache.spark.scheduler.JobGroupCancelled$",
      "scala.runtime.ScalaRunTime$",
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
      "scala.runtime.BoxedUnit",
      "scala.Option",
      "scala.Some",
      "scala.Function1$$anonfun$compose$1",
      "scala.runtime.BoxesRunTime",
      "scala.util.hashing.MurmurHash3",
      "scala.util.hashing.MurmurHash3$",
      "scala.Function1$$anonfun$andThen$1",
      "scala.None$"
    );
  }
}
