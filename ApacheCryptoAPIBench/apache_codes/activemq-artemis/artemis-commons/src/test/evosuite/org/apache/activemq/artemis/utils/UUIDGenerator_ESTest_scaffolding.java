/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Apr 16 13:17:10 GMT 2022
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
public class UUIDGenerator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.activemq.artemis.utils.UUIDGenerator"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(UUIDGenerator_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.util.internal.SystemPropertyUtil$1",
      "org.apache.activemq.artemis.api.core.SimpleString$ByteBufSimpleStringPool",
      "io.netty.util.internal.Cleaner",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "io.netty.util.IllegalReferenceCountException",
      "io.netty.buffer.ByteBufUtil$1",
      "org.jboss.logging.JBossLogRecord",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.buffer.ByteBufUtil$2",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledDirectByteBuf",
      "org.apache.activemq.artemis.utils.ActiveMQThreadFactory$1",
      "io.netty.buffer.CompositeByteBuf$Component",
      "io.netty.util.internal.ReflectionUtil",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$ExitCondition",
      "io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedDuplicateByteBuf",
      "io.netty.buffer.DuplicatedByteBuf",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.util.internal.ThreadLocalRandom",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "io.netty.util.internal.PlatformDependent0$3",
      "io.netty.util.internal.PlatformDependent0$4",
      "io.netty.util.internal.PlatformDependent0$5",
      "io.netty.buffer.PooledByteBufAllocator",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.util.internal.PlatformDependent0$2",
      "org.apache.activemq.artemis.api.core.SimpleString$StringSimpleStringPool",
      "io.netty.util.ByteProcessor$1",
      "io.netty.util.internal.logging.InternalLogger",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache$Entry",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "org.apache.activemq.artemis.utils.ReusableLatch$CountSync",
      "io.netty.buffer.UnpooledHeapByteBuf",
      "io.netty.util.internal.PlatformDependent$1",
      "org.jboss.logmanager.LogContext$1",
      "io.netty.util.internal.PlatformDependent$2",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "io.netty.util.ResourceLeakDetector$DefaultResourceLeak",
      "io.netty.util.internal.shaded.org.jctools.queues.LinkedQueueNode",
      "io.netty.buffer.AdvancedLeakAwareByteBuf",
      "io.netty.buffer.FixedCompositeByteBuf",
      "org.apache.activemq.artemis.api.core.SimpleString",
      "io.netty.util.internal.LongCounter",
      "io.netty.util.ByteProcessor$4",
      "io.netty.util.ByteProcessor$3",
      "io.netty.util.internal.ThreadLocalRandom$1",
      "io.netty.util.internal.StringUtil",
      "io.netty.util.ByteProcessor$2",
      "org.jboss.logmanager.ExtLogRecord",
      "org.jboss.logging.BasicLogger",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$Consumer",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "io.netty.util.internal.LongAdderCounter",
      "org.jboss.logging.LoggingLocale$1",
      "io.netty.util.Recycler$3",
      "io.netty.buffer.FixedCompositeByteBuf$Component",
      "io.netty.buffer.SimpleLeakAwareByteBuf",
      "io.netty.buffer.PoolArena$SizeClass",
      "io.netty.util.Recycler$1",
      "io.netty.util.Recycler$2",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "org.jboss.logmanager.FastCopyHashMap$Entry",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.buffer.PooledByteBuf",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache$1",
      "io.netty.util.ReferenceCounted",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory",
      "io.netty.buffer.PooledDuplicatedByteBuf$1",
      "io.netty.buffer.AbstractPooledDerivedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "org.jboss.logmanager.Level",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeHeapByteBuf",
      "org.jboss.logmanager.Protectable",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf",
      "io.netty.util.HashingStrategy$1",
      "io.netty.buffer.ByteBufAllocatorMetricProvider",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.buffer.UnreleasableByteBuf",
      "io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf$1",
      "io.netty.buffer.PoolChunkList",
      "org.jboss.logging.JDKLoggerProvider",
      "io.netty.buffer.CompositeByteBuf$ComponentList",
      "io.netty.buffer.PoolSubpage",
      "io.netty.buffer.SwappedByteBuf",
      "org.jboss.logmanager.LoggingMXBeanImpl",
      "io.netty.buffer.Unpooled",
      "io.netty.buffer.ReadOnlyByteBufferBuf",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "org.jboss.logmanager.ConfigurationLocator",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.Recycler$Handle",
      "org.jboss.logmanager.AtomicArray",
      "org.apache.activemq.artemis.utils.AbstractPool",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.buffer.WrappedUnpooledUnsafeDirectByteBuf",
      "io.netty.buffer.PoolArenaMetric",
      "io.netty.buffer.PooledDirectByteBuf$1",
      "io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.buffer.PoolThreadCache",
      "io.netty.buffer.PooledDuplicatedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "io.netty.util.AsciiString$2",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "org.jboss.logging.Logger",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "io.netty.buffer.PooledByteBufAllocatorMetric",
      "io.netty.util.AsciiString$1",
      "io.netty.util.ResourceLeak",
      "org.jboss.logging.LoggingLocale",
      "org.apache.activemq.artemis.logs.ActiveMQUtilLogger_$logger",
      "org.jboss.logmanager.LogManager",
      "io.netty.buffer.PooledUnsafeDirectByteBuf",
      "io.netty.util.HashingStrategy",
      "io.netty.util.internal.MathUtil",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.util.ResourceLeakTracker",
      "org.jboss.logging.LoggerProviders",
      "org.jboss.logmanager.WrappedExtLogRecord",
      "org.jboss.logging.DelegatingBasicLogger",
      "io.netty.buffer.AbstractUnpooledSlicedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$Supplier",
      "org.jboss.logging.JDKLogger",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.buffer.EmptyByteBuf",
      "io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedSlicedByteBuf",
      "org.jboss.logmanager.CopyOnWriteWeakMap$Queue",
      "io.netty.util.ByteProcessor$IndexNotOfProcessor",
      "org.apache.activemq.artemis.utils.UUID",
      "org.jboss.logmanager.CopyOnWriteWeakMap$Node",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "io.netty.buffer.ReadOnlyByteBuf",
      "io.netty.buffer.PooledSlicedByteBuf$1",
      "io.netty.util.AsciiString",
      "org.apache.activemq.artemis.utils.UUIDGenerator$1",
      "org.jboss.logmanager.CopyOnWriteMap",
      "io.netty.util.ResourceLeakDetector$Record",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory$1",
      "io.netty.util.CharsetUtil",
      "io.netty.buffer.PooledDirectByteBuf",
      "io.netty.buffer.AbstractUnsafeSwappedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "org.apache.activemq.artemis.logs.ActiveMQUtilLogger",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.buffer.UnsafeDirectSwappedByteBuf",
      "org.jboss.logging.Slf4jLogger",
      "io.netty.util.NettyRuntime",
      "io.netty.buffer.PooledSlicedByteBuf",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeDirectByteBuf",
      "io.netty.util.Recycler",
      "org.jboss.logmanager.Configurator",
      "io.netty.buffer.UnpooledDirectByteBuf",
      "io.netty.util.internal.PlatformDependent0$10",
      "io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "org.jboss.logmanager.FastCopyHashMap",
      "org.jboss.logging.AbstractLoggerProvider",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "org.apache.activemq.artemis.utils.ReusableLatch",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "io.netty.util.ResourceLeakDetector$Level",
      "org.jboss.logmanager.LogContext$LazyHolder",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledHeapByteBuf",
      "org.apache.activemq.artemis.utils.ActiveMQThreadFactory$ThreadCreateAction",
      "io.netty.util.Recycler$DefaultHandle",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.internal.EmptyArrays",
      "org.jboss.logmanager.LogContextSelector",
      "io.netty.buffer.PooledUnsafeDirectByteBuf$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "org.apache.activemq.artemis.utils.UUIDTimer",
      "org.jboss.logmanager.Logger",
      "io.netty.buffer.UnsafeHeapSwappedByteBuf",
      "io.netty.util.ByteProcessor$IndexOfProcessor",
      "org.jboss.logmanager.LogContext$LevelRef",
      "io.netty.util.ByteProcessor",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.buffer.ByteBufAllocatorMetric",
      "org.jboss.logmanager.LoggerNode",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "io.netty.buffer.PoolArena$DirectArena",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.buffer.ReadOnlyUnsafeDirectByteBuf",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "io.netty.buffer.AdvancedLeakAwareCompositeByteBuf",
      "org.jboss.logging.LoggerProvider",
      "io.netty.buffer.PoolSubpageMetric",
      "org.jboss.logmanager.ExtLogRecord$FormatStyle",
      "io.netty.buffer.WrappedCompositeByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.buffer.UnpooledUnsafeHeapByteBuf",
      "io.netty.util.Recycler$WeakOrderQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "io.netty.util.internal.ObjectUtil",
      "org.jboss.logging.AbstractMdcLoggerProvider",
      "io.netty.buffer.AbstractByteBuf",
      "io.netty.buffer.UnpooledUnsafeDirectByteBuf",
      "io.netty.buffer.PoolArena",
      "io.netty.util.AsciiString$CharEqualityComparator",
      "io.netty.util.internal.logging.InternalLogLevel",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf$1",
      "io.netty.buffer.CompositeByteBuf",
      "io.netty.buffer.UnpooledDuplicatedByteBuf",
      "org.jboss.logging.Logger$1",
      "io.netty.buffer.AbstractDerivedByteBuf",
      "io.netty.buffer.PoolChunkMetric",
      "io.netty.buffer.PoolChunk",
      "org.jboss.logmanager.LogManager$1",
      "org.jboss.logmanager.LogContext",
      "io.netty.buffer.UnpooledSlicedByteBuf",
      "org.jboss.logging.LoggerProviders$1",
      "io.netty.util.Recycler$Stack",
      "org.jboss.logmanager.LogContext$StrongLevelRef",
      "org.jboss.logging.JDKLevel",
      "org.jboss.logmanager.CopyOnWriteWeakMap",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.buffer.SimpleLeakAwareCompositeByteBuf",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "org.jboss.logging.Slf4jLoggerProvider",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "io.netty.util.internal.IntegerHolder",
      "org.jboss.logging.Slf4jLocationAwareLogger",
      "org.jboss.logging.Slf4jLocationAwareLogger$1",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache",
      "io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf",
      "io.netty.buffer.WrappedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$WaitStrategy",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.buffer.ByteBufUtil",
      "org.apache.activemq.artemis.utils.AbstractByteBufPool",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "io.netty.buffer.PoolChunkListMetric",
      "org.jboss.logging.Logger$Level",
      "org.jboss.logmanager.Logger$AttachmentKey",
      "org.apache.activemq.artemis.utils.UUIDGenerator",
      "org.apache.activemq.artemis.utils.ActiveMQThreadFactory"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(UUIDGenerator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.activemq.artemis.utils.UUIDGenerator",
      "org.apache.activemq.artemis.utils.UUIDGenerator$1",
      "org.jboss.logging.LoggingLocale$1",
      "org.jboss.logging.LoggingLocale",
      "org.jboss.logging.Logger",
      "org.jboss.logging.Logger$1",
      "org.jboss.logging.DelegatingBasicLogger",
      "org.apache.activemq.artemis.logs.ActiveMQUtilLogger_$logger",
      "org.jboss.logging.LoggerProviders$1",
      "org.jboss.logging.AbstractLoggerProvider",
      "org.jboss.logging.Slf4jLoggerProvider",
      "org.jboss.logging.Slf4jLocationAwareLogger",
      "org.jboss.logging.Logger$Level",
      "org.jboss.logging.Slf4jLocationAwareLogger$1",
      "org.jboss.logging.LoggerProviders",
      "org.apache.activemq.artemis.logs.ActiveMQUtilLogger",
      "org.apache.activemq.artemis.utils.UUIDTimer",
      "org.apache.activemq.artemis.utils.UUID",
      "org.apache.activemq.artemis.api.core.SimpleString",
      "org.apache.activemq.artemis.utils.ActiveMQThreadFactory",
      "org.apache.activemq.artemis.utils.ReusableLatch",
      "org.apache.activemq.artemis.utils.ReusableLatch$CountSync",
      "org.apache.activemq.artemis.utils.ActiveMQThreadFactory$ThreadCreateAction",
      "org.apache.activemq.artemis.utils.ActiveMQThreadFactory$1"
    );
  }
}
