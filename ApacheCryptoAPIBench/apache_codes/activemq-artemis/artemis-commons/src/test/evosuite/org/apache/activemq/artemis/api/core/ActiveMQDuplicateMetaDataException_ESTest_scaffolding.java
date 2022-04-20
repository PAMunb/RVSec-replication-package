/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 20 11:29:20 GMT 2022
 */

package org.apache.activemq.artemis.api.core;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ActiveMQDuplicateMetaDataException_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.activemq.artemis.api.core.ActiveMQDuplicateMetaDataException"; 
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
    java.lang.System.setProperty("user.dir", "/pedro/desenvolvimento/workspaces/workspaces-doutorado/workspace-rv/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/activemq-artemis/artemis-commons"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ActiveMQDuplicateMetaDataException_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.activemq.artemis.api.core.ActiveMQUnBlockedException",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$29",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType",
      "org.apache.activemq.artemis.api.core.ActiveMQTransactionTimeoutException",
      "org.apache.activemq.artemis.api.core.ActiveMQNotConnectedException",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$30",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$31",
      "org.apache.activemq.artemis.api.core.ActiveMQException",
      "org.apache.activemq.artemis.api.core.ActiveMQDisconnectedException",
      "org.apache.activemq.artemis.api.core.ActiveMQDuplicateIdException",
      "org.apache.activemq.artemis.api.core.ActiveMQRemoteDisconnectException",
      "org.apache.activemq.artemis.api.core.ActiveMQIllegalStateException",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$34",
      "org.apache.activemq.artemis.api.core.ActiveMQQueueMaxConsumerLimitReached",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$32",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$33",
      "org.apache.activemq.artemis.api.core.ActiveMQLargeMessageInterruptedException",
      "org.apache.activemq.artemis.api.core.ActiveMQConnectionTimedOutException",
      "org.apache.activemq.artemis.api.core.ActiveMQInvalidFilterExpressionException",
      "org.apache.activemq.artemis.api.core.ActiveMQAlreadyReplicatingException",
      "org.apache.activemq.artemis.api.core.ActiveMQAddressFullException",
      "org.apache.activemq.artemis.api.core.ActiveMQDuplicateMetaDataException",
      "org.apache.activemq.artemis.api.core.ActiveMQTransactionOutcomeUnknownException",
      "org.apache.activemq.artemis.api.core.ActiveMQLargeMessageException",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$9",
      "org.apache.activemq.artemis.api.core.ActiveMQInvalidTransientQueueUseException",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$16",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$17",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$14",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$15",
      "org.apache.activemq.artemis.api.core.ActiveMQUnsupportedPacketException",
      "org.apache.activemq.artemis.api.core.ActiveMQSessionCreationException",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$12",
      "org.apache.activemq.artemis.api.core.ActiveMQInvalidQueueConfiguration",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$13",
      "org.apache.activemq.artemis.api.core.ActiveMQNonExistentQueueException",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$10",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$11",
      "org.apache.activemq.artemis.api.core.ActiveMQIOErrorException",
      "org.apache.activemq.artemis.api.core.ActiveMQIncompatibleClientServerException",
      "org.apache.activemq.artemis.api.core.ActiveMQClusterSecurityException",
      "org.apache.activemq.artemis.api.core.ActiveMQQueueExistsException",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$18",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$19",
      "org.apache.activemq.artemis.api.core.ActiveMQAddressDoesNotExistException",
      "org.apache.activemq.artemis.api.core.ActiveMQAddressExistsException",
      "org.apache.activemq.artemis.api.core.ActiveMQTransactionRolledBackException",
      "org.apache.activemq.artemis.api.core.ActiveMQObjectClosedException",
      "org.apache.activemq.artemis.api.core.ActiveMQDeleteAddressException",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$2",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$1",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$20",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$4",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$3",
      "org.apache.activemq.artemis.api.core.ActiveMQInternalErrorException",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$6",
      "org.apache.activemq.artemis.api.core.ActiveMQSecurityException",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$5",
      "org.apache.activemq.artemis.api.core.ActiveMQUnexpectedRoutingTypeForAddress",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$8",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$7",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$27",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$28",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$25",
      "org.apache.activemq.artemis.api.core.ActiveMQInterceptorRejectedPacketException",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$26",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$23",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$24",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$21",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType$22"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ActiveMQDuplicateMetaDataException_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.activemq.artemis.api.core.ActiveMQException",
      "org.apache.activemq.artemis.api.core.ActiveMQDuplicateMetaDataException",
      "org.apache.activemq.artemis.api.core.ActiveMQExceptionType"
    );
  }
}
