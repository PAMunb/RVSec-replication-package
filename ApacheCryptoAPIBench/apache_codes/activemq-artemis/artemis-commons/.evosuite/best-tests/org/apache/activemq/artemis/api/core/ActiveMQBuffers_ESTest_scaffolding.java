/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 19:10:35 GMT 2022
 */

package org.apache.activemq.artemis.api.core;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ActiveMQBuffers_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.activemq.artemis.api.core.ActiveMQBuffers"; 
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
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/activemq-artemis/artemis-commons"); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
    java.lang.System.setProperty("user.name", "pedro"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ActiveMQBuffers_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "io.netty.buffer.ReadOnlyByteBuf",
      "io.netty.util.internal.Cleaner",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "io.netty.util.IllegalReferenceCountException",
      "io.netty.util.AsciiString",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledDirectByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "io.netty.util.internal.ReflectionUtil",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory$1",
      "io.netty.buffer.DuplicatedByteBuf",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.buffer.PoolThreadCache$SubPageMemoryRegionCache",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "io.netty.buffer.PooledDirectByteBuf",
      "io.netty.buffer.AbstractUnsafeSwappedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.util.internal.PlatformDependent0$3",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.util.internal.PlatformDependent0$4",
      "io.netty.util.NettyRuntime",
      "io.netty.util.internal.PlatformDependent0$5",
      "io.netty.buffer.PooledByteBufAllocator",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueProducerNodeRef",
      "io.netty.util.internal.CleanerJava6",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeDirectByteBuf",
      "io.netty.util.internal.PlatformDependent0$1",
      "io.netty.util.internal.PlatformDependent0$2",
      "io.netty.util.Recycler",
      "io.netty.util.internal.shaded.org.jctools.util.Pow2",
      "io.netty.util.internal.logging.InternalLogger",
      "org.apache.activemq.artemis.api.core.ActiveMQBuffer",
      "io.netty.buffer.UnpooledDirectByteBuf",
      "io.netty.util.internal.PlatformDependent0$10",
      "io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric",
      "io.netty.util.internal.ObjectCleaner$1",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "io.netty.util.internal.ObjectCleaner$2",
      "io.netty.buffer.UnpooledHeapByteBuf",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.util.internal.PlatformDependent$2",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueProducerNodeRef",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "io.netty.buffer.AdvancedLeakAwareByteBuf",
      "io.netty.buffer.FixedCompositeByteBuf",
      "io.netty.util.internal.LongCounter",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledHeapByteBuf",
      "org.apache.activemq.artemis.api.core.SimpleString",
      "io.netty.util.internal.StringUtil",
      "io.netty.util.concurrent.FastThreadLocalRunnable",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.shaded.org.jctools.queues.CircularArrayOffsetCalculator",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "io.netty.util.Recycler$3",
      "io.netty.buffer.SimpleLeakAwareByteBuf",
      "io.netty.buffer.PoolArena$SizeClass",
      "io.netty.util.Recycler$1",
      "io.netty.util.Recycler$2",
      "io.netty.buffer.UnsafeHeapSwappedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "io.netty.buffer.PoolThreadCache$NormalMemoryRegionCache",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.buffer.PooledByteBuf",
      "io.netty.util.ByteProcessor",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache$1",
      "io.netty.util.ReferenceCounted",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory",
      "io.netty.util.internal.ObjectCleaner$AutomaticCleanerReference",
      "io.netty.buffer.ByteBufAllocatorMetric",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "io.netty.buffer.PoolArena$DirectArena",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.buffer.ReadOnlyUnsafeDirectByteBuf",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeHeapByteBuf",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess",
      "org.apache.activemq.artemis.core.buffers.impl.ChannelBufferWrapper",
      "io.netty.buffer.AdvancedLeakAwareCompositeByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "io.netty.buffer.ByteBufAllocatorMetricProvider",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.buffer.UnreleasableByteBuf",
      "io.netty.buffer.PoolChunkList",
      "io.netty.util.internal.ObjectCleaner",
      "io.netty.buffer.PoolSubpageMetric",
      "io.netty.buffer.WrappedCompositeByteBuf",
      "io.netty.buffer.PoolSubpage",
      "io.netty.buffer.SwappedByteBuf",
      "io.netty.util.internal.ConcurrentSet",
      "io.netty.buffer.Unpooled",
      "io.netty.buffer.ReadOnlyByteBufferBuf",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.buffer.UnpooledUnsafeHeapByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "io.netty.util.Recycler$Handle",
      "io.netty.util.internal.ObjectUtil",
      "io.netty.buffer.AbstractByteBuf",
      "io.netty.buffer.UnpooledUnsafeDirectByteBuf",
      "io.netty.buffer.PoolArena",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.buffer.WrappedUnpooledUnsafeDirectByteBuf",
      "io.netty.buffer.PoolArenaMetric",
      "io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.buffer.CompositeByteBuf",
      "io.netty.buffer.UnpooledDuplicatedByteBuf",
      "io.netty.buffer.PoolThreadCache",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "io.netty.buffer.AbstractDerivedByteBuf",
      "io.netty.util.concurrent.FastThreadLocal$1",
      "io.netty.buffer.UnpooledSlicedByteBuf",
      "io.netty.buffer.AbstractByteBufAllocator$1",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "org.apache.activemq.artemis.api.core.ActiveMQBuffers",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueue",
      "io.netty.buffer.PooledByteBufAllocatorMetric",
      "io.netty.util.ResourceLeak",
      "io.netty.buffer.PooledUnsafeDirectByteBuf",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.MathUtil",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.buffer.SimpleLeakAwareCompositeByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "io.netty.util.ResourceLeakTracker",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache",
      "io.netty.buffer.AbstractUnpooledSlicedByteBuf",
      "io.netty.buffer.WrappedByteBuf",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "io.netty.buffer.PoolChunkListMetric",
      "io.netty.buffer.EmptyByteBuf"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("io.netty.buffer.ByteBuf", false, ActiveMQBuffers_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.nio.ByteBuffer", false, ActiveMQBuffers_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ActiveMQBuffers_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.util.NettyRuntime",
      "io.netty.util.internal.ObjectUtil",
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
      "io.netty.buffer.ByteBuf",
      "io.netty.buffer.EmptyByteBuf",
      "io.netty.util.internal.StringUtil",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.util.internal.InternalThreadLocalMap",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache",
      "io.netty.buffer.PoolArena",
      "io.netty.buffer.PoolArena$DirectArena",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.buffer.PoolSubpage",
      "io.netty.buffer.PoolChunkList",
      "io.netty.buffer.PooledByteBufAllocatorMetric",
      "io.netty.buffer.PooledByteBufAllocator",
      "org.apache.activemq.artemis.api.core.ActiveMQBuffers",
      "io.netty.util.internal.logging.Log4JLoggerFactory",
      "io.netty.util.internal.logging.JdkLoggerFactory",
      "io.netty.util.internal.CleanerJava9",
      "io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.buffer.Unpooled",
      "org.apache.activemq.artemis.core.buffers.impl.ChannelBufferWrapper",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory$1",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.buffer.AbstractByteBuf",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "io.netty.buffer.UnpooledHeapByteBuf",
      "io.netty.buffer.UnpooledUnsafeHeapByteBuf",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeHeapByteBuf",
      "io.netty.buffer.WrappedByteBuf",
      "io.netty.buffer.UnreleasableByteBuf",
      "io.netty.util.internal.MathUtil",
      "io.netty.buffer.PoolThreadCache",
      "io.netty.buffer.PoolArena$SizeClass",
      "io.netty.util.Recycler$1",
      "io.netty.util.Recycler$3",
      "io.netty.util.Recycler",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache$1",
      "io.netty.util.Recycler$2",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache",
      "io.netty.buffer.PoolThreadCache$SubPageMemoryRegionCache",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL3Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "io.netty.util.internal.shaded.org.jctools.util.Pow2",
      "io.netty.util.internal.shaded.org.jctools.queues.CircularArrayOffsetCalculator",
      "io.netty.buffer.PoolThreadCache$NormalMemoryRegionCache",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.util.concurrent.FastThreadLocal$1",
      "io.netty.util.internal.ConcurrentSet",
      "io.netty.util.internal.ObjectCleaner$1",
      "io.netty.util.internal.ObjectCleaner",
      "io.netty.util.internal.ObjectCleaner$AutomaticCleanerReference",
      "io.netty.util.concurrent.FastThreadLocalRunnable",
      "io.netty.util.internal.ObjectCleaner$2",
      "io.netty.buffer.AbstractByteBufAllocator$1",
      "io.netty.util.ResourceLeakDetector$DefaultResourceLeak",
      "io.netty.util.ResourceLeakDetector$LeakEntry",
      "io.netty.util.ResourceLeakDetector$Record",
      "io.netty.buffer.SimpleLeakAwareByteBuf"
    );
  }
}
