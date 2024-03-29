/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 22:34:22 GMT 2022
 */

package org.apache.spark.launcher;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class LauncherBackend_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.spark.launcher.LauncherBackend"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(LauncherBackend_ESTest_scaffolding.class.getClassLoader() ,
      "scala.collection.Seq$",
      "scala.collection.Parallelizable",
      "scala.math.Equiv",
      "scala.collection.mutable.Iterable$class",
      "scala.Serializable",
      "scala.concurrent.forkjoin.ForkJoinTask",
      "scala.concurrent.ExecutionContextExecutorService",
      "scala.reflect.ScalaSignature",
      "org.apache.spark.launcher.LauncherProtocol$Message",
      "scala.Function1$class",
      "org.apache.spark.launcher.LauncherBackend",
      "scala.collection.generic.Shrinkable",
      "scala.collection.mutable.Seq$class",
      "scala.concurrent.Awaitable",
      "org.apache.spark.launcher.SparkAppHandle",
      "org.apache.spark.launcher.LauncherProtocol",
      "scala.collection.mutable.BufferLike",
      "scala.collection.generic.IndexedSeqFactory",
      "scala.collection.AbstractSeq",
      "scala.collection.AbstractMap",
      "scala.collection.Iterable$",
      "scala.collection.immutable.StringLike",
      "scala.collection.Map",
      "scala.collection.TraversableLike$class",
      "scala.collection.Seq",
      "scala.collection.mutable.HashTable",
      "scala.concurrent.ExecutionContext$$anonfun$defaultReporter$1",
      "scala.collection.generic.GenericCompanion",
      "scala.collection.mutable.SeqLike$class",
      "scala.concurrent.duration.Duration",
      "scala.collection.mutable.IndexedSeqLike",
      "scala.util.control.ControlThrowable",
      "scala.math.PartialOrdering",
      "scala.collection.mutable.Buffer",
      "scala.collection.GenTraversable$",
      "scala.collection.MapLike",
      "scala.collection.IndexedSeqOptimized$class",
      "org.apache.spark.util.ThreadUtils$$anon$2",
      "scala.collection.mutable.Builder",
      "scala.collection.Traversable$class",
      "scala.collection.generic.FilterMonadic",
      "scala.concurrent.ExecutionContext$",
      "com.google.common.util.concurrent.ListeningExecutorService",
      "scala.concurrent.ExecutionContext$class",
      "scala.runtime.NonLocalReturnControl",
      "org.apache.spark.launcher.LauncherBackend$BackendConnection",
      "scala.collection.mutable.Cloneable",
      "scala.collection.generic.GenTraversableFactory",
      "scala.collection.mutable.Iterable$",
      "scala.collection.SeqViewLike",
      "scala.collection.GenIterableLike",
      "scala.Function0",
      "scala.Equals",
      "scala.Function1",
      "scala.collection.GenIterable$class",
      "org.apache.spark.launcher.LauncherProtocol$SetState",
      "scala.collection.generic.GenericSetTemplate",
      "scala.Function2",
      "scala.concurrent.ExecutionContext",
      "scala.collection.mutable.StringBuilder",
      "scala.collection.generic.GenericTraversableTemplate",
      "com.google.common.util.concurrent.ThreadFactoryBuilder$1",
      "scala.Mutable",
      "scala.math.Ordering",
      "scala.collection.GenMapLike",
      "com.google.common.util.concurrent.AbstractListeningExecutorService",
      "scala.collection.GenSet",
      "scala.collection.ViewMkString",
      "scala.collection.GenMap",
      "scala.collection.GenTraversable",
      "scala.collection.GenSeq",
      "org.apache.spark.launcher.SparkAppHandle$Listener",
      "com.google.common.util.concurrent.ListeningScheduledExecutorService",
      "scala.collection.Parallelizable$class",
      "scala.collection.generic.GenericSeqCompanion",
      "scala.math.Ordered$class",
      "scala.collection.SeqView",
      "scala.collection.SeqLike$class",
      "org.apache.spark.launcher.LauncherBackend$",
      "org.apache.spark.SparkConf",
      "org.apache.spark.launcher.LauncherConnection",
      "scala.collection.GenSeqLike",
      "org.apache.spark.internal.Logging",
      "scala.collection.mutable.Builder$class",
      "scala.None$",
      "scala.collection.TraversableViewLike",
      "scala.collection.mutable.Map",
      "scala.collection.mutable.Seq",
      "scala.collection.SeqLike",
      "scala.Product",
      "scala.collection.GenTraversable$class",
      "scala.collection.TraversableView",
      "scala.collection.GenSeq$",
      "scala.collection.mutable.HashTable$HashUtils",
      "scala.concurrent.impl.ExecutionContextImpl",
      "scala.collection.GenIterable",
      "scala.collection.script.Scriptable",
      "scala.collection.mutable.SeqLike",
      "scala.collection.immutable.StringLike$class",
      "scala.collection.GenSeqLike$class",
      "scala.collection.generic.SeqFactory",
      "scala.concurrent.forkjoin.ForkJoinPool",
      "scala.Cloneable",
      "scala.collection.mutable.Cloneable$class",
      "scala.Some",
      "scala.MatchError",
      "scala.PartialFunction",
      "scala.collection.generic.GenSeqFactory",
      "scala.collection.TraversableOnce$class",
      "scala.collection.generic.GenericTraversableTemplate$class",
      "org.apache.spark.launcher.LauncherProtocol$Hello",
      "scala.collection.Seq$class",
      "scala.collection.IndexedSeqLike$class",
      "scala.collection.GenSeq$class",
      "scala.collection.TraversableOnce",
      "scala.concurrent.impl.ExecutionContextImpl$$anon$1",
      "scala.collection.mutable.IndexedSeqLike$class",
      "org.apache.spark.launcher.SparkAppHandle$State",
      "scala.math.Ordered",
      "scala.concurrent.impl.ExecutionContextImpl$$anon$3",
      "scala.concurrent.impl.ExecutionContextImpl$AdaptedForkJoinTask",
      "scala.collection.IterableView",
      "scala.collection.TraversableLike",
      "scala.collection.IterableLike",
      "scala.concurrent.ExecutionContextExecutor",
      "scala.runtime.AbstractFunction1",
      "com.google.common.util.concurrent.MoreExecutors$SameThreadExecutorService",
      "scala.collection.mutable.Iterable",
      "org.apache.spark.launcher.LauncherProtocol$SetAppId",
      "com.google.common.util.concurrent.ThreadFactoryBuilder",
      "scala.collection.GenSetLike",
      "com.google.common.util.concurrent.MoreExecutors",
      "com.google.common.util.concurrent.ListenableFuture",
      "scala.collection.IndexedSeq",
      "scala.collection.IterableViewLike",
      "scala.collection.mutable.Traversable$",
      "scala.collection.mutable.IndexedSeq$class",
      "scala.collection.mutable.IndexedSeqView",
      "scala.collection.IndexedSeq$",
      "scala.collection.IndexedSeqLike",
      "scala.collection.mutable.IndexedSeqOptimized",
      "scala.collection.generic.HasNewBuilder",
      "scala.collection.mutable.MapLike",
      "scala.collection.GenTraversableOnce",
      "scala.collection.GenTraversableLike",
      "scala.collection.AbstractTraversable",
      "scala.collection.AbstractIterable",
      "org.apache.spark.util.ThreadUtils$",
      "org.apache.spark.SparkException",
      "scala.collection.Traversable",
      "scala.collection.GenIterable$",
      "scala.collection.mutable.HashMap",
      "scala.util.control.NoStackTrace",
      "scala.concurrent.impl.ExecutionContextImpl$",
      "scala.collection.generic.Growable$class",
      "scala.collection.Iterator",
      "scala.collection.generic.TraversableFactory",
      "scala.collection.mutable.IndexedSeq",
      "scala.collection.IndexedSeqOptimized",
      "scala.PartialFunction$class",
      "scala.collection.mutable.Seq$",
      "scala.collection.Traversable$",
      "scala.collection.Iterable",
      "scala.concurrent.forkjoin.ForkJoinPool$ForkJoinWorkerThreadFactory",
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
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.spark.launcher.LauncherBackend", false, LauncherBackend_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(LauncherBackend_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.spark.launcher.LauncherBackend",
      "scala.concurrent.ExecutionContext$",
      "com.google.common.util.concurrent.MoreExecutors",
      "com.google.common.util.concurrent.AbstractListeningExecutorService",
      "com.google.common.util.concurrent.MoreExecutors$SameThreadExecutorService",
      "scala.runtime.AbstractFunction1",
      "scala.concurrent.ExecutionContext$$anonfun$defaultReporter$1",
      "scala.Function1$class",
      "scala.concurrent.impl.ExecutionContextImpl$",
      "scala.concurrent.impl.ExecutionContextImpl",
      "scala.concurrent.impl.ExecutionContextImpl$$anon$1",
      "scala.concurrent.ExecutionContext$class",
      "scala.concurrent.impl.ExecutionContextImpl$$anon$3",
      "org.apache.spark.util.ThreadUtils$",
      "com.google.common.util.concurrent.ThreadFactoryBuilder",
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
      "com.google.common.util.concurrent.ThreadFactoryBuilder$1",
      "org.apache.spark.launcher.LauncherBackend$",
      "scala.runtime.AbstractFunction0",
      "org.apache.spark.launcher.LauncherBackend$$anonfun$1",
      "org.apache.spark.launcher.LauncherBackend$$anonfun$2",
      "org.apache.spark.launcher.LauncherBackend$$anonfun$3",
      "org.apache.spark.launcher.LauncherConnection",
      "org.apache.spark.launcher.LauncherBackend$BackendConnection",
      "org.apache.spark.launcher.LauncherBackend$$anon$1",
      "scala.runtime.AbstractFunction0$mcV$sp",
      "org.apache.spark.launcher.LauncherBackend$$anon$1$$anonfun$run$1",
      "scala.Option",
      "scala.Product$class",
      "scala.None$",
      "scala.Tuple6",
      "scala.Product6$class",
      "org.apache.spark.package$SparkBuildInfo$",
      "org.apache.spark.package$",
      "org.apache.spark.launcher.LauncherProtocol$Message"
    );
  }
}
