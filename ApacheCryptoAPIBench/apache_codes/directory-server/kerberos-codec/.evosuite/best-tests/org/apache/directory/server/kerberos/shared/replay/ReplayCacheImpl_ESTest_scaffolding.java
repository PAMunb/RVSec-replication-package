/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 19:53:48 GMT 2022
 */

package org.apache.directory.server.kerberos.shared.replay;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ReplayCacheImpl_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.directory.server.kerberos.shared.replay.ReplayCacheImpl"; 
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
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/directory-server/kerberos-codec"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ReplayCacheImpl_ESTest_scaffolding.class.getClassLoader() ,
      "org.terracotta.context.AbstractTreeNode",
      "net.sf.ehcache.CacheOperationOutcomes$RemoveAllOutcome",
      "net.sf.ehcache.search.Attribute",
      "net.sf.ehcache.constructs.nonstop.NonStopCacheException",
      "org.apache.directory.server.kerberos.shared.replay.ReplayCacheImpl",
      "org.terracotta.context.ContextManager$1",
      "net.sf.ehcache.statistics.StatisticBuilder$OperationStatisticBuilder",
      "net.sf.ehcache.event.CacheEventListener",
      "net.sf.ehcache.constructs.nonstop.concurrency.LockOperationTimedOutNonstopException",
      "org.terracotta.statistics.util.VicariousThreadLocal$Holder",
      "net.sf.ehcache.config.CacheWriterConfiguration$WriteMode$2",
      "net.sf.ehcache.writer.CacheWriter",
      "org.terracotta.statistics.observer.ChainedObserver",
      "org.terracotta.statistics.PassThroughStatistic",
      "net.sf.ehcache.store.Store",
      "net.sf.ehcache.store.MemoryStoreEvictionPolicy",
      "org.terracotta.context.extractor.WeakAttributeGetter",
      "net.sf.ehcache.terracotta.InternalEhcache",
      "org.terracotta.statistics.Statistic",
      "org.terracotta.context.ContextManager$Association",
      "org.terracotta.statistics.SourceStatistic",
      "net.sf.ehcache.config.CacheConfiguration$TransactionalMode",
      "net.sf.ehcache.store.ElementValueComparator",
      "net.sf.ehcache.store.Policy",
      "net.sf.ehcache.event.RegisteredEventListeners$ElementCreationCallback",
      "net.sf.ehcache.Cache",
      "net.sf.ehcache.CacheOperationOutcomes$PutIfAbsentOutcome",
      "net.sf.ehcache.writer.CacheWriterManager",
      "net.sf.ehcache.config.CacheConfigurationListener",
      "net.sf.ehcache.loader.CacheLoader",
      "org.terracotta.context.annotations.ContextChild",
      "net.sf.ehcache.transaction.manager.TransactionManagerLookup",
      "net.sf.ehcache.CacheManager",
      "org.terracotta.context.extractor.MethodAttributeGetter",
      "org.terracotta.statistics.StatisticsManager$MethodCallable",
      "net.sf.ehcache.search.Query",
      "org.terracotta.context.annotations.ContextAttribute",
      "net.sf.ehcache.CacheException",
      "net.sf.ehcache.bootstrap.BootstrapCacheLoader",
      "org.terracotta.statistics.StatisticsManager",
      "org.terracotta.statistics.jsr166e.Striped64",
      "net.sf.ehcache.Cache$CacheStatus",
      "org.terracotta.context.annotations.ContextParent",
      "org.terracotta.statistics.util.VicariousThreadLocal",
      "net.sf.ehcache.config.CacheWriterConfiguration$WriteMode$1",
      "net.sf.ehcache.pool.PoolEvictor",
      "net.sf.ehcache.config.CacheConfiguration",
      "org.terracotta.statistics.AbstractSourceStatistic",
      "net.sf.ehcache.statistics.StatisticBuilder",
      "org.terracotta.context.WeakIdentityHashMap$Cleanable",
      "org.terracotta.context.extractor.LazyContextElement",
      "net.sf.ehcache.search.attribute.DynamicAttributesExtractor",
      "net.sf.ehcache.Cache$1",
      "net.sf.ehcache.statistics.FlatStatistics",
      "net.sf.ehcache.CacheOperationOutcomes$ExpiredOutcome",
      "org.terracotta.context.ContextManager",
      "net.sf.ehcache.CacheOperationOutcomes$SearchOutcome",
      "net.sf.ehcache.config.CopyStrategyConfiguration",
      "net.sf.ehcache.transaction.xa.XATransactionStore",
      "net.sf.ehcache.writer.CacheWriterManagerException",
      "net.sf.ehcache.terracotta.TerracottaNotRunningException",
      "org.terracotta.statistics.jsr166e.Striped64$Cell",
      "org.terracotta.context.WeakIdentityHashMap",
      "net.sf.ehcache.cluster.ClusterSchemeNotAvailableException",
      "net.sf.ehcache.EhcacheDefaultClassLoader",
      "net.sf.ehcache.Ehcache",
      "net.sf.ehcache.store.AbstractStore",
      "net.sf.ehcache.store.TerracottaStore",
      "net.sf.ehcache.transaction.AbstractTransactionStore",
      "net.sf.ehcache.Status",
      "org.terracotta.statistics.StatisticsManager$1",
      "org.apache.directory.api.util.Strings",
      "org.apache.directory.shared.kerberos.exceptions.KerberosException",
      "net.sf.ehcache.config.CacheWriterConfiguration$WriteMode",
      "net.sf.ehcache.event.RegisteredEventListeners",
      "org.terracotta.context.extractor.WeakFieldAttributeGetter",
      "org.terracotta.context.MutableTreeNode",
      "net.sf.ehcache.CacheOperationOutcomes$RemoveElementOutcome",
      "net.sf.ehcache.store.StoreListener",
      "net.sf.ehcache.exceptionhandler.CacheExceptionHandler",
      "net.sf.ehcache.transaction.local.LocalTransactionStore",
      "org.apache.directory.shared.kerberos.KerberosUtils",
      "org.terracotta.context.ContextCreationListener",
      "net.sf.ehcache.CacheClusterStateStatisticsListener",
      "net.sf.ehcache.search.attribute.UnknownAttributeException",
      "net.sf.ehcache.store.disk.StoreUpdateException",
      "net.sf.ehcache.Element",
      "net.sf.ehcache.concurrent.CacheLockProvider",
      "org.terracotta.statistics.GeneralOperationStatistic",
      "org.terracotta.context.extractor.WeakMethodAttributeGetter",
      "org.terracotta.statistics.jsr166e.LongAdder",
      "net.sf.ehcache.config.InvalidConfigurationException",
      "org.terracotta.context.extractor.AttributeGetter",
      "net.sf.ehcache.config.AbstractCacheConfigurationListener",
      "net.sf.ehcache.store.DefaultElementValueComparator",
      "org.terracotta.context.extractor.FieldAttributeGetter",
      "net.sf.ehcache.CacheStoreHelper",
      "net.sf.ehcache.CacheOperationOutcomes$PutAllOutcome",
      "org.apache.directory.shared.kerberos.codec.types.EncryptionType",
      "net.sf.ehcache.transaction.local.JtaLocalTransactionStore",
      "org.apache.directory.server.kerberos.shared.replay.ReplayCacheImpl$ReplayCacheEntry",
      "net.sf.ehcache.LoaderTimeoutException",
      "net.sf.ehcache.pool.Pool",
      "net.sf.ehcache.CacheOperationOutcomes$RemoveOutcome",
      "org.terracotta.statistics.ValueStatistic",
      "org.terracotta.statistics.observer.OperationObserver",
      "org.terracotta.context.ContextManager$Dissociation",
      "net.sf.ehcache.config.CacheWriterConfiguration",
      "net.sf.ehcache.store.AbstractPolicy",
      "org.terracotta.statistics.OperationStatistic",
      "net.sf.ehcache.CacheOperationOutcomes$PutOutcome",
      "net.sf.ehcache.CacheOperationOutcomes$ReplaceTwoArgOutcome",
      "org.terracotta.context.extractor.ObjectContextExtractor",
      "org.terracotta.context.ContextElement",
      "net.sf.ehcache.search.SearchException",
      "org.terracotta.statistics.jsr166e.Striped64$ThreadHashCode",
      "net.sf.ehcache.statistics.StatisticBuilder$AbstractStatisticBuilder",
      "org.apache.directory.server.kerberos.shared.replay.ReplayCache",
      "org.apache.directory.shared.kerberos.KerberosTime",
      "net.sf.ehcache.CacheOperationOutcomes$ReplaceOneArgOutcome",
      "net.sf.ehcache.store.compound.ReadWriteCopyStrategy",
      "org.terracotta.context.WeakIdentityHashMap$IdentityWeakReference",
      "net.sf.ehcache.CacheOperationOutcomes$GetOutcome",
      "net.sf.ehcache.statistics.StatisticsGateway",
      "org.apache.directory.server.kerberos.shared.replay.ReplayCacheImpl$ClockskewExpirationPolicy",
      "org.terracotta.context.TreeNode",
      "net.sf.ehcache.cluster.ClusterTopologyListener",
      "org.terracotta.statistics.AbstractOperationStatistic",
      "net.sf.ehcache.event.NotificationScope",
      "net.sf.ehcache.config.ElementValueComparatorConfiguration",
      "net.sf.ehcache.CacheOperationOutcomes$GetAllOutcome",
      "net.sf.ehcache.extension.CacheExtension"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ReplayCacheImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.directory.server.kerberos.shared.replay.ReplayCacheImpl",
      "net.sf.ehcache.store.AbstractPolicy",
      "org.apache.directory.server.kerberos.shared.replay.ReplayCacheImpl$ClockskewExpirationPolicy",
      "org.apache.directory.server.kerberos.shared.replay.ReplayCacheImpl$ReplayCacheEntry",
      "net.sf.ehcache.Status",
      "net.sf.ehcache.store.MemoryStoreEvictionPolicy",
      "net.sf.ehcache.config.CacheWriterConfiguration$WriteMode",
      "net.sf.ehcache.config.CacheWriterConfiguration",
      "net.sf.ehcache.config.CacheConfiguration$TransactionalMode",
      "net.sf.ehcache.config.CopyStrategyConfiguration",
      "net.sf.ehcache.config.CacheConfiguration",
      "net.sf.ehcache.config.ElementValueComparatorConfiguration",
      "net.sf.ehcache.EhcacheDefaultClassLoader",
      "net.sf.ehcache.Cache",
      "net.sf.ehcache.Cache$CacheStatus",
      "net.sf.ehcache.statistics.StatisticBuilder",
      "net.sf.ehcache.statistics.StatisticBuilder$AbstractStatisticBuilder",
      "net.sf.ehcache.statistics.StatisticBuilder$OperationStatisticBuilder",
      "org.terracotta.context.WeakIdentityHashMap",
      "org.terracotta.context.ContextManager",
      "org.terracotta.statistics.StatisticsManager$1",
      "org.terracotta.statistics.StatisticsManager",
      "org.terracotta.statistics.AbstractSourceStatistic",
      "org.terracotta.statistics.AbstractOperationStatistic",
      "org.terracotta.statistics.GeneralOperationStatistic",
      "net.sf.ehcache.CacheOperationOutcomes$GetOutcome",
      "org.terracotta.statistics.util.VicariousThreadLocal",
      "org.terracotta.statistics.jsr166e.Striped64$ThreadHashCode",
      "org.terracotta.statistics.jsr166e.Striped64",
      "org.terracotta.statistics.jsr166e.LongAdder",
      "org.terracotta.context.ContextManager$1",
      "org.terracotta.context.WeakIdentityHashMap$IdentityWeakReference",
      "org.terracotta.context.extractor.ObjectContextExtractor",
      "org.terracotta.context.extractor.MethodAttributeGetter",
      "org.terracotta.context.extractor.WeakMethodAttributeGetter",
      "org.terracotta.context.extractor.LazyContextElement",
      "org.terracotta.context.AbstractTreeNode",
      "org.terracotta.context.MutableTreeNode",
      "org.terracotta.statistics.StatisticsManager$MethodCallable",
      "org.terracotta.statistics.PassThroughStatistic",
      "org.terracotta.context.extractor.WeakAttributeGetter",
      "org.terracotta.context.extractor.FieldAttributeGetter",
      "org.terracotta.context.extractor.WeakFieldAttributeGetter",
      "net.sf.ehcache.CacheOperationOutcomes$PutOutcome",
      "net.sf.ehcache.CacheOperationOutcomes$RemoveOutcome",
      "net.sf.ehcache.CacheOperationOutcomes$GetAllOutcome",
      "net.sf.ehcache.CacheOperationOutcomes$PutAllOutcome",
      "net.sf.ehcache.CacheOperationOutcomes$RemoveAllOutcome",
      "net.sf.ehcache.CacheOperationOutcomes$SearchOutcome",
      "net.sf.ehcache.CacheOperationOutcomes$ReplaceOneArgOutcome",
      "net.sf.ehcache.CacheOperationOutcomes$ReplaceTwoArgOutcome",
      "net.sf.ehcache.CacheOperationOutcomes$PutIfAbsentOutcome",
      "net.sf.ehcache.CacheOperationOutcomes$RemoveElementOutcome",
      "net.sf.ehcache.CacheException",
      "net.sf.ehcache.config.InvalidConfigurationException",
      "net.sf.ehcache.event.RegisteredEventListeners",
      "net.sf.ehcache.CacheStoreHelper",
      "net.sf.ehcache.CacheOperationOutcomes$ExpiredOutcome",
      "net.sf.ehcache.store.MemoryLimitedCacheLoader",
      "net.sf.ehcache.terracotta.TerracottaBootstrapCacheLoader",
      "net.sf.ehcache.DiskStorePathManager",
      "net.sf.ehcache.management.provider.MBeanRegistrationProviderFactoryImpl",
      "net.sf.ehcache.CacheManager",
      "net.sf.ehcache.config.ConfigurationFactory",
      "net.sf.ehcache.config.Configuration$Monitoring",
      "net.sf.ehcache.config.SizeOfPolicyConfiguration$MaxDepthExceededBehavior",
      "net.sf.ehcache.config.SizeOfPolicyConfiguration",
      "net.sf.ehcache.config.FactoryConfiguration",
      "net.sf.ehcache.config.Configuration",
      "net.sf.ehcache.config.CacheConfiguration$CacheEventListenerFactoryConfiguration",
      "net.sf.ehcache.store.DiskStoreBootstrapCacheLoader",
      "net.sf.ehcache.config.DiskStoreConfiguration",
      "net.sf.ehcache.config.DiskStoreConfiguration$Env",
      "org.apache.directory.api.util.Strings",
      "org.apache.directory.shared.kerberos.codec.types.EncryptionType",
      "org.apache.directory.shared.kerberos.KerberosUtils",
      "org.apache.directory.shared.kerberos.KerberosTime",
      "net.sf.ehcache.event.CacheManagerEventListenerRegistry",
      "net.sf.ehcache.config.Configuration$RuntimeCfg",
      "net.sf.ehcache.util.PropertyUtil",
      "net.sf.ehcache.transaction.manager.DefaultTransactionManagerLookup",
      "net.sf.ehcache.transaction.manager.selector.Selector",
      "net.sf.ehcache.transaction.manager.selector.JndiSelector",
      "net.sf.ehcache.transaction.manager.selector.GenericJndiSelector",
      "net.sf.ehcache.transaction.manager.selector.GlassfishSelector",
      "net.sf.ehcache.transaction.manager.selector.FactorySelector",
      "net.sf.ehcache.transaction.manager.selector.WeblogicSelector",
      "net.sf.ehcache.transaction.manager.selector.BitronixSelector",
      "net.sf.ehcache.transaction.manager.selector.ClassSelector",
      "net.sf.ehcache.transaction.manager.selector.AtomikosSelector",
      "net.sf.ehcache.CacheManager$1",
      "net.sf.ehcache.terracotta.TerracottaClient",
      "net.sf.ehcache.terracotta.TerracottaCacheCluster",
      "net.sf.ehcache.config.ConfigurationHelper",
      "net.sf.ehcache.TransactionController",
      "net.sf.ehcache.transaction.DelegatingTransactionIDFactory",
      "net.sf.ehcache.util.lang.VicariousThreadLocal",
      "net.sf.ehcache.TransactionController$TransactionControllerStatistics",
      "net.sf.ehcache.transaction.local.LocalRecoveryManager",
      "net.sf.ehcache.util.FailSafeTimer",
      "net.sf.ehcache.management.provider.MBeanRegistrationProviderImpl",
      "net.sf.ehcache.management.provider.MBeanRegistrationProviderImpl$1",
      "net.sf.ehcache.CacheManager$2",
      "net.sf.ehcache.config.TimeoutBehaviorConfiguration$TimeoutBehaviorType",
      "net.sf.ehcache.config.TimeoutBehaviorConfiguration",
      "net.sf.ehcache.config.NonstopConfiguration",
      "net.sf.ehcache.config.TerracottaConfiguration$Consistency",
      "net.sf.ehcache.config.TerracottaConfiguration",
      "net.sf.ehcache.util.ClassLoaderUtil",
      "net.sf.ehcache.store.DefaultElementValueComparator",
      "net.sf.ehcache.concurrent.LockType",
      "net.sf.ehcache.config.CacheConfiguration$CacheExceptionHandlerFactoryConfiguration",
      "net.sf.ehcache.config.PinningConfiguration",
      "net.sf.ehcache.config.CacheConfiguration$BootstrapCacheLoaderFactoryConfiguration",
      "net.sf.ehcache.config.PersistenceConfiguration",
      "net.sf.ehcache.distribution.RMIBootstrapCacheLoader",
      "net.sf.ehcache.config.Searchable",
      "net.sf.ehcache.search.Attribute",
      "net.sf.ehcache.search.Query",
      "net.sf.ehcache.config.SearchAttribute",
      "net.sf.ehcache.config.CacheConfiguration$CacheLoaderFactoryConfiguration",
      "net.sf.ehcache.config.CacheConfiguration$CacheExtensionFactoryConfiguration",
      "net.sf.ehcache.event.TerracottaCacheEventReplication",
      "net.sf.ehcache.config.BeanHandler",
      "net.sf.ehcache.distribution.RMIBootstrapCacheLoader$BootstrapThread",
      "net.sf.ehcache.config.ManagementRESTServiceConfiguration",
      "net.sf.ehcache.config.generator.ConfigurationSource",
      "net.sf.ehcache.config.generator.ConfigurationSource$DefaultConfigurationSource",
      "net.sf.ehcache.management.sampled.SampledMBeanRegistrationProvider",
      "net.sf.ehcache.hibernate.management.impl.BaseEmitterBean",
      "net.sf.ehcache.management.sampled.SampledCacheManager",
      "net.sf.ehcache.hibernate.management.impl.BaseEmitterBean$Emitter",
      "net.sf.ehcache.management.sampled.CacheManagerSamplerImpl",
      "net.sf.ehcache.management.sampled.SampledEhcacheMBeans",
      "net.sf.ehcache.hibernate.management.impl.EhcacheHibernateMbeanNames",
      "net.sf.ehcache.store.CacheStore",
      "net.sf.ehcache.pool.impl.BalancedAccessEvictor",
      "net.sf.ehcache.pool.impl.AbstractPool",
      "net.sf.ehcache.pool.impl.BoundedPool"
    );
  }
}