/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Apr 16 13:18:21 GMT 2022
 */

package org.apache.activemq.artemis.utils;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractByteBufPool_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.activemq.artemis.utils.AbstractByteBufPool"; 
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
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "/pedro/desenvolvimento/workspaces/workspaces-doutorado/workspace-rv/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/activemq-artemis/artemis-commons"); 
    java.lang.System.setProperty("user.home", "/home/pedro"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "pedro"); 
    java.lang.System.setProperty("user.timezone", "America/Sao_Paulo"); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractByteBufPool_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.activemq.artemis.utils.collections.TypedProperties$BooleanValue",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "org.apache.activemq.artemis.api.core.SimpleString$ByteBufSimpleStringPool",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "io.netty.util.internal.Cleaner",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$NullValue",
      "io.netty.buffer.ByteBufUtil$1",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.util.AsciiString",
      "io.netty.buffer.ByteBufUtil$2",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$TypedPropertiesStringSimpleStringPools",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$TypedPropertiesDecoderPools",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "io.netty.util.internal.ReflectionUtil",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$ExitCondition",
      "org.apache.activemq.artemis.utils.collections.TypedProperties",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.util.CharsetUtil",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "io.netty.buffer.PooledDirectByteBuf",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$StringValue$ByteBufStringValuePool",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.util.internal.CleanerJava9",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "io.netty.util.internal.PlatformDependent0$3",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.util.internal.PlatformDependent0$4",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.util.internal.PlatformDependent0$5",
      "io.netty.util.NettyRuntime",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "io.netty.buffer.PooledByteBufAllocator",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.util.internal.PlatformDependent0$2",
      "org.apache.activemq.artemis.api.core.SimpleString$StringSimpleStringPool",
      "io.netty.util.ByteProcessor$1",
      "io.netty.util.internal.logging.InternalLogger",
      "io.netty.buffer.UnpooledDirectByteBuf",
      "io.netty.util.internal.PlatformDependent0$10",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "io.netty.buffer.UnpooledHeapByteBuf",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.util.internal.PlatformDependent$2",
      "io.netty.util.internal.logging.JdkLoggerFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$PropertyValue",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode",
      "io.netty.buffer.AdvancedLeakAwareByteBuf",
      "org.apache.activemq.artemis.api.core.SimpleString",
      "io.netty.util.internal.LongCounter",
      "io.netty.util.ByteProcessor$4",
      "io.netty.util.ByteProcessor$3",
      "io.netty.util.internal.StringUtil",
      "io.netty.util.ByteProcessor$2",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$Consumer",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "io.netty.buffer.SimpleLeakAwareByteBuf",
      "io.netty.util.ByteProcessor$IndexOfProcessor",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "io.netty.util.internal.logging.Log4JLoggerFactory",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.buffer.PooledByteBuf",
      "io.netty.util.ByteProcessor",
      "io.netty.util.ReferenceCounted",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.buffer.ByteBufAllocatorMetric",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "io.netty.buffer.PoolArena$DirectArena",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "io.netty.buffer.AdvancedLeakAwareCompositeByteBuf",
      "io.netty.buffer.ByteBufAllocatorMetricProvider",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$DoubleValue",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.buffer.PoolChunkList",
      "io.netty.buffer.PoolSubpageMetric",
      "io.netty.buffer.WrappedCompositeByteBuf",
      "io.netty.buffer.PoolSubpage",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$CharValue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.buffer.UnpooledUnsafeHeapByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$BytesValue",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.buffer.AbstractByteBuf",
      "io.netty.buffer.UnpooledUnsafeDirectByteBuf",
      "io.netty.buffer.PoolArena",
      "org.apache.activemq.artemis.utils.AbstractPool",
      "io.netty.util.internal.logging.InternalLogLevel",
      "org.apache.activemq.artemis.api.core.ActiveMQPropertyConversionException",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.buffer.PoolArenaMetric",
      "io.netty.buffer.CompositeByteBuf",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$LongValue",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$ByteValue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$ShortValue",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$FloatValue",
      "io.netty.buffer.PooledByteBufAllocatorMetric",
      "io.netty.util.ResourceLeak",
      "io.netty.buffer.PooledUnsafeDirectByteBuf",
      "io.netty.util.internal.MathUtil",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.buffer.SimpleLeakAwareCompositeByteBuf",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "io.netty.util.ResourceLeakTracker",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$StringValue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$IntValue",
      "io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf",
      "io.netty.buffer.WrappedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$WaitStrategy",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$Supplier",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.buffer.ByteBufUtil",
      "org.apache.activemq.artemis.utils.AbstractByteBufPool",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "io.netty.buffer.PoolChunkListMetric",
      "io.netty.buffer.EmptyByteBuf",
      "io.netty.util.ByteProcessor$IndexNotOfProcessor"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractByteBufPool_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.activemq.artemis.utils.AbstractByteBufPool",
      "io.netty.util.internal.MathUtil",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.logging.Log4JLoggerFactory",
      "io.netty.util.internal.logging.JdkLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.util.internal.ReflectionUtil",
      "io.netty.util.internal.PlatformDependent0$2",
      "io.netty.util.internal.PlatformDependent0$3",
      "io.netty.util.internal.PlatformDependent0$4",
      "io.netty.util.internal.PlatformDependent0$5",
      "io.netty.util.internal.PlatformDependent0$10",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.util.internal.PlatformDependent$2",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.internal.CleanerJava9",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$StringValue$ByteBufStringValuePool"
    );
  }
}
