/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 00:05:55 GMT 2022
 */

package org.apache.spark;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.spark.SparkFirehoseListener;
import org.apache.spark.scheduler.SparkListenerApplicationEnd;
import org.apache.spark.scheduler.SparkListenerApplicationStart;
import org.apache.spark.scheduler.SparkListenerBlockManagerAdded;
import org.apache.spark.scheduler.SparkListenerBlockManagerRemoved;
import org.apache.spark.scheduler.SparkListenerBlockUpdated;
import org.apache.spark.scheduler.SparkListenerEnvironmentUpdate;
import org.apache.spark.scheduler.SparkListenerEvent;
import org.apache.spark.scheduler.SparkListenerExecutorAdded;
import org.apache.spark.scheduler.SparkListenerExecutorBlacklisted;
import org.apache.spark.scheduler.SparkListenerExecutorBlacklistedForStage;
import org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate;
import org.apache.spark.scheduler.SparkListenerExecutorRemoved;
import org.apache.spark.scheduler.SparkListenerExecutorUnblacklisted;
import org.apache.spark.scheduler.SparkListenerJobEnd;
import org.apache.spark.scheduler.SparkListenerJobStart;
import org.apache.spark.scheduler.SparkListenerNodeBlacklisted;
import org.apache.spark.scheduler.SparkListenerNodeBlacklistedForStage;
import org.apache.spark.scheduler.SparkListenerNodeUnblacklisted;
import org.apache.spark.scheduler.SparkListenerSpeculativeTaskSubmitted;
import org.apache.spark.scheduler.SparkListenerStageCompleted;
import org.apache.spark.scheduler.SparkListenerStageSubmitted;
import org.apache.spark.scheduler.SparkListenerTaskEnd;
import org.apache.spark.scheduler.SparkListenerTaskGettingResult;
import org.apache.spark.scheduler.SparkListenerTaskStart;
import org.apache.spark.scheduler.SparkListenerUnpersistRDD;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SparkFirehoseListener_ESTest extends SparkFirehoseListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = mock(SparkListenerBlockUpdated.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onBlockUpdated(sparkListenerBlockUpdated0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerNodeUnblacklisted sparkListenerNodeUnblacklisted0 = mock(SparkListenerNodeUnblacklisted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onNodeUnblacklisted(sparkListenerNodeUnblacklisted0);
      SparkListenerExecutorRemoved sparkListenerExecutorRemoved0 = mock(SparkListenerExecutorRemoved.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorRemoved(sparkListenerExecutorRemoved0);
      SparkListenerNodeUnblacklisted sparkListenerNodeUnblacklisted1 = mock(SparkListenerNodeUnblacklisted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onNodeUnblacklisted(sparkListenerNodeUnblacklisted1);
      sparkFirehoseListener0.onApplicationStart((SparkListenerApplicationStart) null);
      SparkListenerStageCompleted sparkListenerStageCompleted0 = mock(SparkListenerStageCompleted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onStageCompleted(sparkListenerStageCompleted0);
      SparkListenerExecutorBlacklistedForStage sparkListenerExecutorBlacklistedForStage0 = mock(SparkListenerExecutorBlacklistedForStage.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorBlacklistedForStage(sparkListenerExecutorBlacklistedForStage0);
      SparkListenerEnvironmentUpdate sparkListenerEnvironmentUpdate0 = mock(SparkListenerEnvironmentUpdate.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onEnvironmentUpdate(sparkListenerEnvironmentUpdate0);
      SparkListenerTaskEnd sparkListenerTaskEnd0 = mock(SparkListenerTaskEnd.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onTaskEnd(sparkListenerTaskEnd0);
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = mock(SparkListenerExecutorUnblacklisted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorUnblacklisted(sparkListenerExecutorUnblacklisted0);
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = mock(SparkListenerBlockUpdated.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onBlockUpdated(sparkListenerBlockUpdated0);
      SparkListenerNodeBlacklistedForStage sparkListenerNodeBlacklistedForStage0 = mock(SparkListenerNodeBlacklistedForStage.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onNodeBlacklistedForStage(sparkListenerNodeBlacklistedForStage0);
      SparkListenerExecutorMetricsUpdate sparkListenerExecutorMetricsUpdate0 = mock(SparkListenerExecutorMetricsUpdate.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorMetricsUpdate(sparkListenerExecutorMetricsUpdate0);
      SparkListenerBlockManagerAdded sparkListenerBlockManagerAdded0 = mock(SparkListenerBlockManagerAdded.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onBlockManagerAdded(sparkListenerBlockManagerAdded0);
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = mock(SparkListenerNodeBlacklisted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onNodeBlacklisted(sparkListenerNodeBlacklisted0);
      SparkListenerTaskGettingResult sparkListenerTaskGettingResult0 = mock(SparkListenerTaskGettingResult.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onTaskGettingResult(sparkListenerTaskGettingResult0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerApplicationStart sparkListenerApplicationStart0 = mock(SparkListenerApplicationStart.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onApplicationStart(sparkListenerApplicationStart0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerExecutorMetricsUpdate sparkListenerExecutorMetricsUpdate0 = mock(SparkListenerExecutorMetricsUpdate.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorMetricsUpdate(sparkListenerExecutorMetricsUpdate0);
      SparkListenerUnpersistRDD sparkListenerUnpersistRDD0 = mock(SparkListenerUnpersistRDD.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onUnpersistRDD(sparkListenerUnpersistRDD0);
      SparkListenerJobStart sparkListenerJobStart0 = mock(SparkListenerJobStart.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onJobStart(sparkListenerJobStart0);
      SparkListenerUnpersistRDD sparkListenerUnpersistRDD1 = mock(SparkListenerUnpersistRDD.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onUnpersistRDD(sparkListenerUnpersistRDD1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerTaskGettingResult sparkListenerTaskGettingResult0 = mock(SparkListenerTaskGettingResult.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onTaskGettingResult(sparkListenerTaskGettingResult0);
      SparkListenerEnvironmentUpdate sparkListenerEnvironmentUpdate0 = mock(SparkListenerEnvironmentUpdate.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onEnvironmentUpdate(sparkListenerEnvironmentUpdate0);
      SparkListenerEnvironmentUpdate sparkListenerEnvironmentUpdate1 = mock(SparkListenerEnvironmentUpdate.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onEnvironmentUpdate(sparkListenerEnvironmentUpdate1);
      SparkListenerJobStart sparkListenerJobStart0 = mock(SparkListenerJobStart.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onJobStart(sparkListenerJobStart0);
      SparkListenerJobStart sparkListenerJobStart1 = mock(SparkListenerJobStart.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onJobStart(sparkListenerJobStart1);
      SparkListenerJobEnd sparkListenerJobEnd0 = mock(SparkListenerJobEnd.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onJobEnd(sparkListenerJobEnd0);
      SparkListenerJobStart sparkListenerJobStart2 = mock(SparkListenerJobStart.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onJobStart(sparkListenerJobStart2);
      SparkListenerExecutorRemoved sparkListenerExecutorRemoved0 = mock(SparkListenerExecutorRemoved.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorRemoved(sparkListenerExecutorRemoved0);
      SparkListenerApplicationEnd sparkListenerApplicationEnd0 = mock(SparkListenerApplicationEnd.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onApplicationEnd(sparkListenerApplicationEnd0);
      SparkListenerBlockManagerRemoved sparkListenerBlockManagerRemoved0 = mock(SparkListenerBlockManagerRemoved.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onBlockManagerRemoved(sparkListenerBlockManagerRemoved0);
      SparkListenerUnpersistRDD sparkListenerUnpersistRDD0 = mock(SparkListenerUnpersistRDD.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onUnpersistRDD(sparkListenerUnpersistRDD0);
      SparkListenerSpeculativeTaskSubmitted sparkListenerSpeculativeTaskSubmitted0 = mock(SparkListenerSpeculativeTaskSubmitted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onSpeculativeTaskSubmitted(sparkListenerSpeculativeTaskSubmitted0);
      SparkListenerTaskGettingResult sparkListenerTaskGettingResult1 = mock(SparkListenerTaskGettingResult.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onTaskGettingResult(sparkListenerTaskGettingResult1);
      SparkListenerBlockManagerRemoved sparkListenerBlockManagerRemoved1 = mock(SparkListenerBlockManagerRemoved.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onBlockManagerRemoved(sparkListenerBlockManagerRemoved1);
      SparkListenerStageCompleted sparkListenerStageCompleted0 = mock(SparkListenerStageCompleted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onStageCompleted(sparkListenerStageCompleted0);
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = mock(SparkListenerStageSubmitted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onStageSubmitted(sparkListenerStageSubmitted0);
      sparkFirehoseListener0.onStageCompleted((SparkListenerStageCompleted) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerEvent sparkListenerEvent0 = mock(SparkListenerEvent.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onOtherEvent(sparkListenerEvent0);
      sparkFirehoseListener0.onTaskGettingResult((SparkListenerTaskGettingResult) null);
      SparkListenerExecutorRemoved sparkListenerExecutorRemoved0 = mock(SparkListenerExecutorRemoved.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorRemoved(sparkListenerExecutorRemoved0);
      sparkFirehoseListener0.onEvent((SparkListenerEvent) null);
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = mock(SparkListenerBlockUpdated.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onBlockUpdated(sparkListenerBlockUpdated0);
      SparkListenerNodeBlacklistedForStage sparkListenerNodeBlacklistedForStage0 = mock(SparkListenerNodeBlacklistedForStage.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onNodeBlacklistedForStage(sparkListenerNodeBlacklistedForStage0);
      SparkListenerApplicationEnd sparkListenerApplicationEnd0 = mock(SparkListenerApplicationEnd.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onApplicationEnd(sparkListenerApplicationEnd0);
      SparkListenerExecutorRemoved sparkListenerExecutorRemoved1 = mock(SparkListenerExecutorRemoved.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorRemoved(sparkListenerExecutorRemoved1);
      SparkListenerSpeculativeTaskSubmitted sparkListenerSpeculativeTaskSubmitted0 = mock(SparkListenerSpeculativeTaskSubmitted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onSpeculativeTaskSubmitted(sparkListenerSpeculativeTaskSubmitted0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerNodeUnblacklisted sparkListenerNodeUnblacklisted0 = mock(SparkListenerNodeUnblacklisted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onNodeUnblacklisted(sparkListenerNodeUnblacklisted0);
      SparkListenerExecutorMetricsUpdate sparkListenerExecutorMetricsUpdate0 = mock(SparkListenerExecutorMetricsUpdate.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorMetricsUpdate(sparkListenerExecutorMetricsUpdate0);
      SparkListenerBlockUpdated sparkListenerBlockUpdated0 = mock(SparkListenerBlockUpdated.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onBlockUpdated(sparkListenerBlockUpdated0);
      sparkFirehoseListener0.onEnvironmentUpdate((SparkListenerEnvironmentUpdate) null);
      SparkListenerApplicationEnd sparkListenerApplicationEnd0 = mock(SparkListenerApplicationEnd.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onApplicationEnd(sparkListenerApplicationEnd0);
      SparkListenerApplicationEnd sparkListenerApplicationEnd1 = mock(SparkListenerApplicationEnd.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onApplicationEnd(sparkListenerApplicationEnd1);
      sparkFirehoseListener0.onExecutorUnblacklisted((SparkListenerExecutorUnblacklisted) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerApplicationEnd sparkListenerApplicationEnd0 = mock(SparkListenerApplicationEnd.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onApplicationEnd(sparkListenerApplicationEnd0);
      SparkListenerNodeUnblacklisted sparkListenerNodeUnblacklisted0 = mock(SparkListenerNodeUnblacklisted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onNodeUnblacklisted(sparkListenerNodeUnblacklisted0);
      SparkListenerSpeculativeTaskSubmitted sparkListenerSpeculativeTaskSubmitted0 = mock(SparkListenerSpeculativeTaskSubmitted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onSpeculativeTaskSubmitted(sparkListenerSpeculativeTaskSubmitted0);
      SparkListenerSpeculativeTaskSubmitted sparkListenerSpeculativeTaskSubmitted1 = mock(SparkListenerSpeculativeTaskSubmitted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onSpeculativeTaskSubmitted(sparkListenerSpeculativeTaskSubmitted1);
      SparkListenerNodeBlacklistedForStage sparkListenerNodeBlacklistedForStage0 = mock(SparkListenerNodeBlacklistedForStage.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onNodeBlacklistedForStage(sparkListenerNodeBlacklistedForStage0);
      SparkListenerNodeUnblacklisted sparkListenerNodeUnblacklisted1 = mock(SparkListenerNodeUnblacklisted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onNodeUnblacklisted(sparkListenerNodeUnblacklisted1);
      SparkListenerTaskStart sparkListenerTaskStart0 = mock(SparkListenerTaskStart.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onTaskStart(sparkListenerTaskStart0);
      SparkListenerSpeculativeTaskSubmitted sparkListenerSpeculativeTaskSubmitted2 = mock(SparkListenerSpeculativeTaskSubmitted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onSpeculativeTaskSubmitted(sparkListenerSpeculativeTaskSubmitted2);
      SparkListenerExecutorMetricsUpdate sparkListenerExecutorMetricsUpdate0 = mock(SparkListenerExecutorMetricsUpdate.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorMetricsUpdate(sparkListenerExecutorMetricsUpdate0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerJobStart sparkListenerJobStart0 = mock(SparkListenerJobStart.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onJobStart(sparkListenerJobStart0);
      SparkListenerTaskEnd sparkListenerTaskEnd0 = mock(SparkListenerTaskEnd.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onTaskEnd(sparkListenerTaskEnd0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerJobEnd sparkListenerJobEnd0 = mock(SparkListenerJobEnd.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onJobEnd(sparkListenerJobEnd0);
      SparkListenerApplicationStart sparkListenerApplicationStart0 = mock(SparkListenerApplicationStart.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onApplicationStart(sparkListenerApplicationStart0);
      SparkListenerApplicationStart sparkListenerApplicationStart1 = mock(SparkListenerApplicationStart.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onApplicationStart(sparkListenerApplicationStart1);
      SparkListenerExecutorAdded sparkListenerExecutorAdded0 = mock(SparkListenerExecutorAdded.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorAdded(sparkListenerExecutorAdded0);
      sparkFirehoseListener0.onExecutorBlacklistedForStage((SparkListenerExecutorBlacklistedForStage) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerBlockManagerRemoved sparkListenerBlockManagerRemoved0 = mock(SparkListenerBlockManagerRemoved.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onBlockManagerRemoved(sparkListenerBlockManagerRemoved0);
      sparkFirehoseListener0.onApplicationEnd((SparkListenerApplicationEnd) null);
      SparkListenerBlockManagerAdded sparkListenerBlockManagerAdded0 = mock(SparkListenerBlockManagerAdded.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onBlockManagerAdded(sparkListenerBlockManagerAdded0);
      SparkListenerBlockManagerRemoved sparkListenerBlockManagerRemoved1 = mock(SparkListenerBlockManagerRemoved.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onBlockManagerRemoved(sparkListenerBlockManagerRemoved1);
      SparkListenerExecutorAdded sparkListenerExecutorAdded0 = mock(SparkListenerExecutorAdded.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorAdded(sparkListenerExecutorAdded0);
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = mock(SparkListenerStageSubmitted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onStageSubmitted(sparkListenerStageSubmitted0);
      sparkFirehoseListener0.onJobStart((SparkListenerJobStart) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = mock(SparkListenerStageSubmitted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onStageSubmitted(sparkListenerStageSubmitted0);
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = mock(SparkListenerNodeBlacklisted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onNodeBlacklisted(sparkListenerNodeBlacklisted0);
      SparkListenerExecutorBlacklistedForStage sparkListenerExecutorBlacklistedForStage0 = mock(SparkListenerExecutorBlacklistedForStage.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorBlacklistedForStage(sparkListenerExecutorBlacklistedForStage0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      sparkFirehoseListener0.onTaskStart((SparkListenerTaskStart) null);
      SparkListenerJobStart sparkListenerJobStart0 = mock(SparkListenerJobStart.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onJobStart(sparkListenerJobStart0);
      SparkListenerExecutorBlacklistedForStage sparkListenerExecutorBlacklistedForStage0 = mock(SparkListenerExecutorBlacklistedForStage.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorBlacklistedForStage(sparkListenerExecutorBlacklistedForStage0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerSpeculativeTaskSubmitted sparkListenerSpeculativeTaskSubmitted0 = mock(SparkListenerSpeculativeTaskSubmitted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onSpeculativeTaskSubmitted(sparkListenerSpeculativeTaskSubmitted0);
      SparkListenerEvent sparkListenerEvent0 = mock(SparkListenerEvent.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onEvent(sparkListenerEvent0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerStageSubmitted sparkListenerStageSubmitted0 = mock(SparkListenerStageSubmitted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onStageSubmitted(sparkListenerStageSubmitted0);
      SparkListenerNodeBlacklistedForStage sparkListenerNodeBlacklistedForStage0 = mock(SparkListenerNodeBlacklistedForStage.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onNodeBlacklistedForStage(sparkListenerNodeBlacklistedForStage0);
      sparkFirehoseListener0.onExecutorBlacklisted((SparkListenerExecutorBlacklisted) null);
      SparkListenerTaskGettingResult sparkListenerTaskGettingResult0 = mock(SparkListenerTaskGettingResult.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onTaskGettingResult(sparkListenerTaskGettingResult0);
      SparkListenerJobEnd sparkListenerJobEnd0 = mock(SparkListenerJobEnd.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onJobEnd(sparkListenerJobEnd0);
      SparkListenerTaskStart sparkListenerTaskStart0 = mock(SparkListenerTaskStart.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onTaskStart(sparkListenerTaskStart0);
      sparkFirehoseListener0.onOtherEvent((SparkListenerEvent) null);
      sparkFirehoseListener0.onOtherEvent((SparkListenerEvent) null);
      SparkListenerTaskEnd sparkListenerTaskEnd0 = mock(SparkListenerTaskEnd.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onTaskEnd(sparkListenerTaskEnd0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerNodeBlacklistedForStage sparkListenerNodeBlacklistedForStage0 = mock(SparkListenerNodeBlacklistedForStage.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onNodeBlacklistedForStage(sparkListenerNodeBlacklistedForStage0);
      SparkListenerEvent sparkListenerEvent0 = mock(SparkListenerEvent.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onOtherEvent(sparkListenerEvent0);
      SparkListenerBlockManagerAdded sparkListenerBlockManagerAdded0 = mock(SparkListenerBlockManagerAdded.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onBlockManagerAdded(sparkListenerBlockManagerAdded0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerExecutorMetricsUpdate sparkListenerExecutorMetricsUpdate0 = mock(SparkListenerExecutorMetricsUpdate.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorMetricsUpdate(sparkListenerExecutorMetricsUpdate0);
      SparkListenerStageCompleted sparkListenerStageCompleted0 = mock(SparkListenerStageCompleted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onStageCompleted(sparkListenerStageCompleted0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerTaskGettingResult sparkListenerTaskGettingResult0 = mock(SparkListenerTaskGettingResult.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onTaskGettingResult(sparkListenerTaskGettingResult0);
      SparkListenerJobEnd sparkListenerJobEnd0 = mock(SparkListenerJobEnd.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onJobEnd(sparkListenerJobEnd0);
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = mock(SparkListenerExecutorUnblacklisted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorUnblacklisted(sparkListenerExecutorUnblacklisted0);
      SparkListenerNodeBlacklisted sparkListenerNodeBlacklisted0 = mock(SparkListenerNodeBlacklisted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onNodeBlacklisted(sparkListenerNodeBlacklisted0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerStageCompleted sparkListenerStageCompleted0 = mock(SparkListenerStageCompleted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onStageCompleted(sparkListenerStageCompleted0);
      SparkListenerEvent sparkListenerEvent0 = mock(SparkListenerEvent.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onEvent(sparkListenerEvent0);
      sparkFirehoseListener0.onBlockManagerAdded((SparkListenerBlockManagerAdded) null);
      SparkListenerExecutorBlacklisted sparkListenerExecutorBlacklisted0 = mock(SparkListenerExecutorBlacklisted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorBlacklisted(sparkListenerExecutorBlacklisted0);
      SparkListenerTaskGettingResult sparkListenerTaskGettingResult0 = mock(SparkListenerTaskGettingResult.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onTaskGettingResult(sparkListenerTaskGettingResult0);
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = mock(SparkListenerExecutorUnblacklisted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorUnblacklisted(sparkListenerExecutorUnblacklisted0);
      SparkListenerSpeculativeTaskSubmitted sparkListenerSpeculativeTaskSubmitted0 = mock(SparkListenerSpeculativeTaskSubmitted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onSpeculativeTaskSubmitted(sparkListenerSpeculativeTaskSubmitted0);
      SparkListenerSpeculativeTaskSubmitted sparkListenerSpeculativeTaskSubmitted1 = mock(SparkListenerSpeculativeTaskSubmitted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onSpeculativeTaskSubmitted(sparkListenerSpeculativeTaskSubmitted1);
      sparkFirehoseListener0.onExecutorBlacklisted((SparkListenerExecutorBlacklisted) null);
      SparkListenerExecutorBlacklistedForStage sparkListenerExecutorBlacklistedForStage0 = mock(SparkListenerExecutorBlacklistedForStage.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorBlacklistedForStage(sparkListenerExecutorBlacklistedForStage0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SparkFirehoseListener sparkFirehoseListener0 = new SparkFirehoseListener();
      SparkListenerExecutorUnblacklisted sparkListenerExecutorUnblacklisted0 = mock(SparkListenerExecutorUnblacklisted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onExecutorUnblacklisted(sparkListenerExecutorUnblacklisted0);
      SparkListenerSpeculativeTaskSubmitted sparkListenerSpeculativeTaskSubmitted0 = mock(SparkListenerSpeculativeTaskSubmitted.class, new ViolatedAssumptionAnswer());
      sparkFirehoseListener0.onSpeculativeTaskSubmitted(sparkListenerSpeculativeTaskSubmitted0);
  }
}
