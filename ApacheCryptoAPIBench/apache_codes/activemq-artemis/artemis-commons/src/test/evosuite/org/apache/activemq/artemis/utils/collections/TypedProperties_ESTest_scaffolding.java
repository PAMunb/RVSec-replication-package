/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Apr 16 13:22:24 GMT 2022
 */

package org.apache.activemq.artemis.utils.collections;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TypedProperties_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.activemq.artemis.utils.collections.TypedProperties"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TypedProperties_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.activemq.artemis.utils.collections.TypedProperties$BooleanValue",
      "io.netty.util.internal.SystemPropertyUtil$1",
      "org.apache.activemq.artemis.api.core.SimpleString$ByteBufSimpleStringPool",
      "org.apache.activemq.artemis.api.core.ActiveMQUnBlockedException",
      "io.netty.util.internal.Cleaner",
      "io.netty.util.IllegalReferenceCountException",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL1Pad",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$NullValue",
      "io.netty.buffer.ByteBufUtil$1",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.buffer.ByteBufUtil$2",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledDirectByteBuf",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$TypedPropertiesDecoderPools",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$TypedPropertiesStringSimpleStringPools",
      "io.netty.buffer.CompositeByteBuf$Component",
      "io.netty.util.internal.ReflectionUtil",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$ExitCondition",
      "org.apache.activemq.artemis.api.core.ActiveMQException",
      "io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedDuplicateByteBuf",
      "io.netty.buffer.DuplicatedByteBuf",
      "io.netty.util.concurrent.FastThreadLocalThread",
      "io.netty.buffer.PoolThreadCache$SubPageMemoryRegionCache",
      "org.apache.activemq.artemis.api.core.ActiveMQDuplicateIdException",
      "io.netty.util.internal.ThreadLocalRandom",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$StringValue$ByteBufStringValuePool",
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
      "org.apache.activemq.artemis.api.core.ActiveMQInvalidFilterExpressionException",
      "io.netty.util.internal.logging.InternalLogger",
      "org.apache.activemq.artemis.api.core.ActiveMQAlreadyReplicatingException",
      "org.apache.activemq.artemis.api.core.ActiveMQBuffer",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache$Entry",
      "io.netty.util.internal.ObjectCleaner$1",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "io.netty.util.internal.ObjectCleaner$2",
      "io.netty.buffer.UnpooledHeapByteBuf",
      "io.netty.util.internal.PlatformDependent$1",
      "io.netty.util.internal.PlatformDependent$2",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$PropertyValue",
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
      "org.apache.activemq.artemis.api.core.ActiveMQInvalidTransientQueueUseException",
      "org.jboss.logging.BasicLogger",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$Consumer",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueConsumerIndexField",
      "io.netty.util.internal.LongAdderCounter",
      "io.netty.util.Recycler$3",
      "io.netty.buffer.FixedCompositeByteBuf$Component",
      "org.jboss.logging.LoggingLocale$1",
      "io.netty.buffer.SimpleLeakAwareByteBuf",
      "io.netty.buffer.PoolArena$SizeClass",
      "org.apache.activemq.artemis.api.core.ActiveMQNonExistentQueueException",
      "io.netty.util.Recycler$1",
      "io.netty.util.Recycler$2",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueL2Pad",
      "io.netty.buffer.PoolThreadCache$NormalMemoryRegionCache",
      "io.netty.util.internal.UnpaddedInternalThreadLocalMap",
      "io.netty.buffer.PooledByteBuf",
      "org.apache.activemq.artemis.api.core.ActiveMQAddressExistsException",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache$1",
      "org.apache.activemq.artemis.api.core.ActiveMQTransactionRolledBackException",
      "io.netty.util.ReferenceCounted",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory",
      "io.netty.buffer.PooledDuplicatedByteBuf$1",
      "io.netty.buffer.AbstractPooledDerivedByteBuf",
      "io.netty.util.ResourceLeakDetector$LeakEntry",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueConsumerIndexField",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess",
      "org.apache.activemq.artemis.api.core.ActiveMQSecurityException",
      "io.netty.buffer.PooledHeapByteBuf",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeHeapByteBuf",
      "io.netty.util.ResourceLeakDetectorFactory",
      "org.jboss.logging.Messages",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf",
      "io.netty.util.HashingStrategy$1",
      "io.netty.buffer.ByteBufAllocatorMetricProvider",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.buffer.UnreleasableByteBuf",
      "io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf$1",
      "io.netty.buffer.PoolChunkList",
      "io.netty.util.internal.ObjectCleaner",
      "io.netty.buffer.CompositeByteBuf$ComponentList",
      "io.netty.buffer.SwappedByteBuf",
      "io.netty.buffer.PoolSubpage",
      "io.netty.util.internal.ConcurrentSet",
      "io.netty.buffer.Unpooled",
      "io.netty.buffer.ReadOnlyByteBufferBuf",
      "io.netty.util.NettyRuntime$AvailableProcessorsHolder",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.Recycler$Handle",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$BytesValue",
      "org.apache.activemq.artemis.api.core.ActiveMQQueueMaxConsumerLimitReached",
      "io.netty.buffer.HeapByteBufUtil",
      "org.apache.activemq.artemis.utils.AbstractPool",
      "org.apache.activemq.artemis.api.core.ActiveMQPropertyConversionException",
      "io.netty.buffer.AbstractByteBufAllocator",
      "io.netty.buffer.WrappedUnpooledUnsafeDirectByteBuf",
      "io.netty.buffer.PoolArenaMetric",
      "io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.buffer.PooledDirectByteBuf$1",
      "io.netty.buffer.PoolThreadCache",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$LongValue",
      "io.netty.buffer.PooledDuplicatedByteBuf",
      "io.netty.buffer.PooledUnsafeHeapByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad2",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL3Pad",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad0",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueuePad1",
      "org.apache.activemq.artemis.api.core.ActiveMQAddressFullException",
      "org.apache.activemq.artemis.api.core.ActiveMQDuplicateMetaDataException",
      "io.netty.util.concurrent.FastThreadLocal$1",
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
      "io.netty.buffer.PooledUnsafeDirectByteBuf",
      "io.netty.util.HashingStrategy",
      "io.netty.util.internal.MathUtil",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$16",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$17",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueProducerLimitField",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$14",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$15",
      "org.apache.activemq.artemis.api.core.ActiveMQSessionCreationException",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$12",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$13",
      "io.netty.util.ResourceLeakTracker",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$10",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$11",
      "org.apache.activemq.artemis.api.core.ActiveMQIncompatibleClientServerException",
      "org.apache.activemq.artemis.api.core.ActiveMQClusterSecurityException",
      "org.apache.activemq.artemis.api.core.ActiveMQQueueExistsException",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$18",
      "org.apache.activemq.artemis.utils.ByteUtil",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$19",
      "io.netty.buffer.AbstractUnpooledSlicedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$Supplier",
      "org.apache.activemq.artemis.api.core.ActiveMQObjectClosedException",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$20",
      "io.netty.util.internal.shaded.org.jctools.queues.QueueProgressIndicators",
      "io.netty.buffer.EmptyByteBuf",
      "io.netty.buffer.AbstractPooledDerivedByteBuf$PooledNonRetainedSlicedByteBuf",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$27",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$28",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$25",
      "org.apache.activemq.artemis.api.core.ActiveMQInterceptorRejectedPacketException",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$26",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$23",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$24",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$21",
      "io.netty.util.ByteProcessor$IndexNotOfProcessor",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$22",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueueConsumerNodeRef",
      "io.netty.buffer.ReadOnlyByteBuf",
      "io.netty.buffer.PooledSlicedByteBuf$1",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$29",
      "io.netty.util.AsciiString",
      "io.netty.util.ResourceLeakDetector$Record",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerIndexField",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$30",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$31",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL2Pad",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory$1",
      "io.netty.buffer.UnsafeByteBufUtil",
      "org.apache.activemq.artemis.utils.collections.TypedProperties",
      "io.netty.util.CharsetUtil",
      "org.apache.activemq.artemis.api.core.ActiveMQRemoteDisconnectException",
      "io.netty.buffer.PoolArena$HeapArena",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$34",
      "io.netty.buffer.PooledDirectByteBuf",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$32",
      "io.netty.buffer.AbstractUnsafeSwappedByteBuf",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$33",
      "org.apache.activemq.artemis.api.core.ActiveMQLargeMessageInterruptedException",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "org.apache.activemq.artemis.api.core.ActiveMQConnectionTimedOutException",
      "io.netty.util.internal.shaded.org.jctools.queues.SpscLinkedQueue",
      "io.netty.buffer.UnsafeDirectSwappedByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueMidPad",
      "io.netty.util.NettyRuntime",
      "io.netty.buffer.PooledSlicedByteBuf",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeDirectByteBuf",
      "org.apache.activemq.artemis.logs.ActiveMQUtilBundle_$bundle",
      "io.netty.util.Recycler",
      "io.netty.util.internal.shaded.org.jctools.util.Pow2",
      "io.netty.buffer.UnpooledDirectByteBuf",
      "io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric",
      "io.netty.util.internal.PlatformDependent0$10",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicReferenceArrayQueue",
      "org.apache.activemq.artemis.api.core.ActiveMQLargeMessageException",
      "io.netty.buffer.PooledByteBufAllocator$PoolThreadLocalCache",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad0",
      "io.netty.util.ResourceLeakDetector$Level",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueue",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledHeapByteBuf",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$9",
      "io.netty.util.concurrent.FastThreadLocalRunnable",
      "io.netty.util.Recycler$DefaultHandle",
      "io.netty.util.internal.shaded.org.jctools.queues.CircularArrayOffsetCalculator",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueueMidPad",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.buffer.PooledUnsafeDirectByteBuf$1",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.BaseLinkedAtomicQueuePad2",
      "org.apache.activemq.artemis.api.core.ActiveMQUnsupportedPacketException",
      "org.apache.activemq.artemis.api.core.ActiveMQInvalidQueueConfiguration",
      "io.netty.buffer.UnsafeHeapSwappedByteBuf",
      "org.apache.activemq.artemis.api.core.ActiveMQIOErrorException",
      "io.netty.util.ByteProcessor$IndexOfProcessor",
      "io.netty.util.ByteProcessor",
      "org.apache.activemq.artemis.api.core.ActiveMQAddressDoesNotExistException",
      "io.netty.util.internal.ObjectCleaner$AutomaticCleanerReference",
      "io.netty.buffer.ByteBufAllocatorMetric",
      "io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueueL0Pad",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$2",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$1",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$4",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$3",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$6",
      "io.netty.buffer.PooledUnsafeHeapByteBuf$1",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$5",
      "io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueueConsumerNodeRef",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$8",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$7",
      "io.netty.buffer.PoolArena$DirectArena",
      "io.netty.util.internal.PlatformDependent$ThreadLocalRandomProvider",
      "io.netty.buffer.ReadOnlyUnsafeDirectByteBuf",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeAccess",
      "io.netty.buffer.AdvancedLeakAwareCompositeByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.IndexedQueueSizeUtil$IndexedQueue",
      "org.apache.activemq.artemis.logs.ActiveMQUtilBundle",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$DoubleValue",
      "io.netty.buffer.PoolSubpageMetric",
      "org.apache.activemq.artemis.api.core.ActiveMQTransactionTimeoutException",
      "io.netty.buffer.WrappedCompositeByteBuf",
      "org.apache.activemq.artemis.api.core.ActiveMQNotConnectedException",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$CharValue",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueProducerLimitField",
      "org.apache.activemq.artemis.api.core.ActiveMQDisconnectedException",
      "io.netty.buffer.UnpooledUnsafeHeapByteBuf",
      "io.netty.util.Recycler$WeakOrderQueue",
      "io.netty.util.internal.shaded.org.jctools.queues.MpscArrayQueue",
      "io.netty.util.internal.ObjectUtil",
      "org.apache.activemq.artemis.api.core.ActiveMQIllegalStateException",
      "io.netty.buffer.AbstractByteBuf",
      "org.jboss.logging.Messages$1",
      "io.netty.buffer.UnpooledUnsafeDirectByteBuf",
      "io.netty.buffer.PoolArena",
      "io.netty.util.AsciiString$CharEqualityComparator",
      "io.netty.util.internal.logging.InternalLogLevel",
      "io.netty.util.ResourceLeakDetector",
      "io.netty.buffer.ByteBufUtil$ThreadLocalDirectByteBuf$1",
      "io.netty.buffer.CompositeByteBuf",
      "io.netty.buffer.UnpooledDuplicatedByteBuf",
      "io.netty.buffer.PooledHeapByteBuf$1",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$ByteValue",
      "io.netty.buffer.AbstractDerivedByteBuf",
      "io.netty.buffer.PoolChunkMetric",
      "io.netty.buffer.PoolChunk",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$ShortValue",
      "org.apache.activemq.artemis.api.core.ActiveMQTransactionOutcomeUnknownException",
      "io.netty.buffer.UnpooledSlicedByteBuf",
      "io.netty.buffer.AbstractByteBufAllocator$1",
      "io.netty.util.Recycler$Stack",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$FloatValue",
      "io.netty.buffer.CompositeByteBuf$CompositeByteBufIterator",
      "io.netty.buffer.ByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.LinkedQueueAtomicNode",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.concurrent.FastThreadLocal",
      "io.netty.buffer.SimpleLeakAwareCompositeByteBuf",
      "io.netty.util.internal.OutOfDirectMemoryError",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.SpscLinkedAtomicQueue",
      "io.netty.util.internal.IntegerHolder",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$StringValue",
      "io.netty.buffer.PoolThreadCache$1",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$IntValue",
      "io.netty.buffer.WrappedByteBuf",
      "io.netty.buffer.ByteBufUtil$ThreadLocalUnsafeDirectByteBuf",
      "io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue$WaitStrategy",
      "io.netty.util.internal.SystemPropertyUtil",
      "org.apache.activemq.artemis.api.core.ActiveMQDeleteAddressException",
      "io.netty.buffer.ByteBufUtil",
      "org.apache.activemq.artemis.utils.AbstractByteBufPool",
      "io.netty.util.internal.shaded.org.jctools.queues.atomic.MpscAtomicArrayQueueL1Pad",
      "io.netty.buffer.PoolChunkListMetric",
      "org.apache.activemq.artemis.api.core.ActiveMQInternalErrorException",
      "org.jboss.logging.Logger$Level",
      "org.apache.activemq.artemis.api.core.ActiveMQUnexpectedRoutingTypeForAddress"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TypedProperties_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.activemq.artemis.api.core.SimpleString",
      "org.apache.activemq.artemis.utils.collections.TypedProperties",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$PropertyValue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$BooleanValue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$ByteValue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$NullValue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$BytesValue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$ShortValue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$IntValue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$LongValue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$FloatValue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$DoubleValue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$StringValue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$CharValue",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$TypedPropertiesDecoderPools",
      "org.apache.activemq.artemis.utils.AbstractByteBufPool",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$StringValue$ByteBufStringValuePool",
      "org.jboss.logging.LoggingLocale$1",
      "org.jboss.logging.LoggingLocale",
      "org.jboss.logging.Messages",
      "org.jboss.logging.Messages$1",
      "org.apache.activemq.artemis.logs.ActiveMQUtilBundle_$bundle",
      "org.apache.activemq.artemis.logs.ActiveMQUtilBundle",
      "org.apache.activemq.artemis.utils.ByteUtil",
      "io.netty.util.internal.MathUtil",
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
      "org.apache.activemq.artemis.api.core.SimpleString$ByteBufSimpleStringPool",
      "org.apache.activemq.artemis.utils.AbstractPool",
      "org.apache.activemq.artemis.api.core.SimpleString$StringSimpleStringPool",
      "org.apache.activemq.artemis.api.core.ActiveMQPropertyConversionException",
      "io.netty.buffer.UnpooledByteBufAllocator$UnpooledByteBufAllocatorMetric",
      "io.netty.buffer.UnpooledByteBufAllocator",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory",
      "io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory$1",
      "io.netty.util.ResourceLeakDetectorFactory",
      "io.netty.buffer.AbstractByteBuf",
      "io.netty.buffer.AbstractReferenceCountedByteBuf",
      "io.netty.buffer.Unpooled",
      "io.netty.buffer.CompositeByteBuf",
      "io.netty.buffer.CompositeByteBuf$ComponentList",
      "io.netty.buffer.UnpooledHeapByteBuf",
      "io.netty.buffer.UnpooledUnsafeHeapByteBuf",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeHeapByteBuf",
      "io.netty.buffer.CompositeByteBuf$Component",
      "io.netty.buffer.AbstractDerivedByteBuf",
      "io.netty.buffer.AbstractUnpooledSlicedByteBuf",
      "io.netty.buffer.UnpooledSlicedByteBuf",
      "io.netty.buffer.UnsafeByteBufUtil",
      "org.apache.activemq.artemis.utils.collections.TypedProperties$TypedPropertiesStringSimpleStringPools",
      "io.netty.buffer.UnpooledUnsafeDirectByteBuf",
      "io.netty.buffer.ReadOnlyByteBuf",
      "io.netty.util.IllegalReferenceCountException",
      "io.netty.buffer.UnpooledDirectByteBuf",
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
      "io.netty.buffer.ByteBufUtil$1",
      "io.netty.util.CharsetUtil",
      "io.netty.buffer.ByteBufUtil$2",
      "io.netty.buffer.ByteBufUtil",
      "io.netty.buffer.ByteBufAllocator",
      "io.netty.buffer.PooledByteBuf",
      "io.netty.buffer.PooledUnsafeDirectByteBuf$1",
      "io.netty.buffer.PooledUnsafeDirectByteBuf",
      "io.netty.util.Recycler$Stack",
      "io.netty.util.Recycler$DefaultHandle",
      "io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess",
      "io.netty.buffer.PoolChunk",
      "io.netty.buffer.HeapByteBufUtil",
      "io.netty.buffer.PoolThreadCache$1",
      "io.netty.buffer.PoolThreadCache$MemoryRegionCache$Entry",
      "io.netty.buffer.UnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeNoCleanerDirectByteBuf",
      "io.netty.buffer.UnpooledByteBufAllocator$InstrumentedUnpooledUnsafeDirectByteBuf",
      "io.netty.util.ResourceLeakDetector$DefaultResourceLeak",
      "io.netty.util.ResourceLeakDetector$LeakEntry",
      "io.netty.util.ResourceLeakDetector$Record",
      "io.netty.buffer.WrappedCompositeByteBuf",
      "io.netty.buffer.SimpleLeakAwareCompositeByteBuf",
      "io.netty.util.ByteProcessor$IndexOfProcessor",
      "io.netty.buffer.DuplicatedByteBuf",
      "io.netty.buffer.UnpooledDuplicatedByteBuf",
      "io.netty.buffer.PoolArena$HeapArena",
      "io.netty.util.ByteProcessor$IndexNotOfProcessor",
      "io.netty.util.ByteProcessor$1",
      "io.netty.util.ByteProcessor$2",
      "io.netty.util.ByteProcessor$3",
      "io.netty.util.ByteProcessor$4",
      "io.netty.util.ByteProcessor",
      "io.netty.util.internal.OutOfDirectMemoryError"
    );
  }
}