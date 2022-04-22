/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 20:32:33 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.changePwdData;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ChangePasswdDataContainer_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.directory.shared.kerberos.codec.changePwdData.ChangePasswdDataContainer"; 
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
    java.lang.System.setProperty("user.dir", "/home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/directory-server/kerberos-codec"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ChangePasswdDataContainer_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.directory.shared.kerberos.codec.changePwdData.ChangePasswdDataStatesEnum",
      "org.apache.directory.api.asn1.actions.AbstractReadOctetString",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadRealm",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadPrincipalName",
      "org.apache.directory.api.asn1.EncoderException",
      "org.apache.directory.api.asn1.ber.AbstractContainer",
      "org.apache.directory.shared.kerberos.codec.changePwdData.actions.StoreNewPassword",
      "org.apache.directory.api.asn1.Asn1Object",
      "org.apache.directory.api.asn1.ber.grammar.States",
      "org.apache.directory.shared.kerberos.codec.changePwdData.ChangePasswdDataGrammar",
      "org.apache.directory.api.asn1.ber.grammar.Grammar",
      "org.apache.directory.api.asn1.DecoderException",
      "org.apache.directory.shared.kerberos.messages.ChangePasswdData",
      "org.apache.directory.api.asn1.ber.tlv.UniversalTag",
      "org.apache.directory.api.asn1.actions.CheckNotNullLength",
      "org.apache.directory.shared.kerberos.codec.changePwdData.actions.StoreTargRealm",
      "org.apache.directory.shared.kerberos.components.PrincipalName",
      "org.apache.directory.api.asn1.ber.grammar.AbstractGrammar",
      "org.apache.directory.api.asn1.ber.tlv.TLVStateEnum",
      "org.apache.directory.shared.kerberos.codec.changePwdData.actions.StoreTargName",
      "org.apache.directory.shared.kerberos.codec.changePwdData.ChangePasswdDataContainer",
      "org.apache.directory.api.asn1.ber.grammar.GrammarTransition",
      "org.apache.directory.api.asn1.ber.grammar.GrammarAction",
      "org.apache.directory.api.asn1.ber.grammar.Action",
      "org.apache.directory.shared.kerberos.codec.changePwdData.actions.ChangePasswdDataInit",
      "org.apache.directory.api.asn1.ber.Asn1Container",
      "org.apache.directory.api.asn1.ber.tlv.TLV"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ChangePasswdDataContainer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.directory.api.asn1.ber.AbstractContainer",
      "org.apache.directory.shared.kerberos.codec.changePwdData.ChangePasswdDataContainer",
      "org.apache.directory.api.asn1.ber.grammar.AbstractGrammar",
      "org.apache.directory.shared.kerberos.codec.changePwdData.ChangePasswdDataStatesEnum",
      "org.apache.directory.api.asn1.ber.tlv.UniversalTag",
      "org.apache.directory.api.asn1.ber.grammar.GrammarTransition",
      "org.apache.directory.api.asn1.ber.grammar.GrammarAction",
      "org.apache.directory.shared.kerberos.codec.changePwdData.actions.ChangePasswdDataInit",
      "org.apache.directory.api.asn1.actions.CheckNotNullLength",
      "org.apache.directory.api.asn1.actions.AbstractReadOctetString",
      "org.apache.directory.shared.kerberos.codec.changePwdData.actions.StoreNewPassword",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadPrincipalName",
      "org.apache.directory.shared.kerberos.codec.changePwdData.actions.StoreTargName",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadRealm",
      "org.apache.directory.shared.kerberos.codec.changePwdData.actions.StoreTargRealm",
      "org.apache.directory.shared.kerberos.codec.changePwdData.ChangePasswdDataGrammar",
      "org.apache.directory.api.asn1.ber.tlv.TLV",
      "org.apache.directory.api.asn1.ber.tlv.TLVStateEnum"
    );
  }
}
