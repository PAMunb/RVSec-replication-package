/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 21:45:13 GMT 2022
 */

package org.apache.spark.io;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ReadAheadInputStream_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.spark.io.ReadAheadInputStream"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ReadAheadInputStream_ESTest_scaffolding.class.getClassLoader() ,
      "scala.collection.Parallelizable",
      "scala.Serializable",
      "scala.concurrent.forkjoin.ForkJoinTask",
      "scala.concurrent.impl.ExecutionContextImpl",
      "scala.concurrent.ExecutionContextExecutorService",
      "scala.Function1$class",
      "scala.collection.GenIterable",
      "scala.concurrent.Awaitable",
      "org.apache.spark.io.ReadAheadInputStream",
      "scala.concurrent.forkjoin.ForkJoinPool",
      "scala.MatchError",
      "scala.PartialFunction",
      "scala.collection.Seq",
      "scala.concurrent.ExecutionContext$$anonfun$defaultReporter$1",
      "scala.collection.TraversableOnce",
      "scala.concurrent.impl.ExecutionContextImpl$$anon$1",
      "scala.math.Ordered",
      "scala.concurrent.impl.ExecutionContextImpl$$anon$3",
      "scala.concurrent.duration.Duration",
      "scala.concurrent.impl.ExecutionContextImpl$AdaptedForkJoinTask",
      "scala.collection.TraversableLike",
      "scala.collection.IterableLike",
      "scala.concurrent.ExecutionContextExecutor",
      "scala.runtime.AbstractFunction1",
      "org.apache.spark.util.ThreadUtils$$anon$2",
      "com.google.common.util.concurrent.MoreExecutors$SameThreadExecutorService",
      "scala.collection.generic.FilterMonadic",
      "scala.concurrent.ExecutionContext$",
      "com.google.common.util.concurrent.ListeningExecutorService",
      "scala.concurrent.ExecutionContext$class",
      "com.google.common.util.concurrent.ThreadFactoryBuilder",
      "com.google.common.util.concurrent.MoreExecutors",
      "com.google.common.util.concurrent.ListenableFuture",
      "scala.collection.GenIterableLike",
      "scala.Equals",
      "scala.Function0",
      "scala.Function1",
      "scala.collection.generic.HasNewBuilder",
      "scala.concurrent.ExecutionContext",
      "scala.collection.GenTraversableOnce",
      "scala.collection.GenTraversableLike",
      "scala.collection.generic.GenericTraversableTemplate",
      "com.google.common.util.concurrent.ThreadFactoryBuilder$1",
      "com.google.common.util.concurrent.AbstractListeningExecutorService",
      "scala.collection.GenTraversable",
      "scala.collection.GenSeq",
      "org.apache.spark.util.ThreadUtils$",
      "org.apache.spark.SparkException",
      "com.google.common.util.concurrent.ListeningScheduledExecutorService",
      "scala.collection.Traversable",
      "scala.concurrent.impl.ExecutionContextImpl$",
      "scala.collection.GenSeqLike",
      "com.google.common.base.Throwables",
      "scala.collection.Iterable",
      "scala.concurrent.forkjoin.ForkJoinPool$ForkJoinWorkerThreadFactory",
      "org.apache.spark.io.ReadAheadInputStream$1",
      "scala.collection.SeqLike",
      "com.google.common.base.Preconditions",
      "org.apache.spark.util.ThreadUtils"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ReadAheadInputStream_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.spark.io.ReadAheadInputStream",
      "org.apache.spark.io.ReadAheadInputStream$1",
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
      "org.apache.spark.util.ThreadUtils",
      "com.google.common.util.concurrent.ThreadFactoryBuilder",
      "com.google.common.util.concurrent.ThreadFactoryBuilder$1",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Throwables"
    );
  }
}
