/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 20:26:49 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.kdcReqBody;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class KdcReqBodyContainer_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.directory.shared.kerberos.codec.kdcReqBody.KdcReqBodyContainer"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(KdcReqBodyContainer_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.directory.shared.kerberos.components.HostAddresses",
      "org.apache.directory.api.asn1.ber.AbstractContainer",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.KdcReqBodyInit",
      "org.apache.directory.api.asn1.Asn1Object",
      "org.apache.directory.api.asn1.ber.grammar.States",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreRTime",
      "org.apache.directory.shared.kerberos.flags.AbstractKerberosFlags",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreCName",
      "org.apache.directory.api.asn1.ber.grammar.Grammar",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadKerberosTime",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.KdcReqBodyStatesEnum",
      "org.apache.directory.shared.kerberos.components.PrincipalName",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreAddresses",
      "org.apache.directory.api.asn1.ber.tlv.TLVStateEnum",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.AddTicket",
      "org.apache.directory.api.asn1.ber.grammar.GrammarTransition",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.ETypeSequence",
      "org.apache.directory.api.asn1.ber.grammar.GrammarAction",
      "org.apache.directory.shared.kerberos.messages.KerberosMessage",
      "org.apache.directory.api.asn1.actions.AbstractReadInteger",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreKdcOptions",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreTill",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.KdcReqBodyGrammar",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadRealm",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadPrincipalName",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreSName",
      "org.apache.directory.api.asn1.util.BitString",
      "org.apache.directory.api.asn1.EncoderException",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreNonce",
      "org.apache.directory.shared.kerberos.components.EncryptedData",
      "org.apache.directory.shared.kerberos.components.KdcReqBody",
      "org.apache.directory.shared.kerberos.codec.types.EncryptionType",
      "org.apache.directory.api.asn1.ber.tlv.IntegerDecoderException",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreFrom",
      "org.apache.directory.shared.kerberos.codec.options.Options",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.AddEType",
      "org.apache.directory.api.asn1.DecoderException",
      "org.apache.directory.api.asn1.ber.tlv.UniversalTag",
      "org.apache.directory.api.asn1.actions.CheckNotNullLength",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreEncAuthorizationData",
      "org.apache.directory.shared.kerberos.messages.Ticket",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadHostAddresses",
      "org.apache.directory.api.asn1.ber.grammar.AbstractGrammar",
      "org.apache.directory.shared.kerberos.codec.options.KdcOptions",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadEncryptedPart",
      "org.apache.directory.shared.kerberos.KerberosTime",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.KdcReqBodyContainer",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreRealm",
      "org.apache.directory.api.asn1.ber.grammar.Action",
      "org.apache.directory.api.asn1.ber.Asn1Container",
      "org.apache.directory.api.asn1.ber.tlv.TLV"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(KdcReqBodyContainer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.directory.api.asn1.ber.AbstractContainer",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.KdcReqBodyContainer",
      "org.apache.directory.api.asn1.ber.grammar.AbstractGrammar",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.KdcReqBodyStatesEnum",
      "org.apache.directory.api.asn1.ber.tlv.UniversalTag",
      "org.apache.directory.api.asn1.ber.grammar.GrammarTransition",
      "org.apache.directory.api.asn1.ber.grammar.GrammarAction",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.KdcReqBodyInit",
      "org.apache.directory.api.asn1.actions.CheckNotNullLength",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreKdcOptions",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadPrincipalName",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreCName",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadRealm",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreRealm",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreSName",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreFrom",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreTill",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadKerberosTime",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreRTime",
      "org.apache.directory.api.asn1.actions.AbstractReadInteger",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreNonce",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.ETypeSequence",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.AddEType",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadHostAddresses",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreAddresses",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadEncryptedPart",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.StoreEncAuthorizationData",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.actions.AddTicket",
      "org.apache.directory.shared.kerberos.codec.kdcReqBody.KdcReqBodyGrammar",
      "org.apache.directory.api.asn1.ber.tlv.TLV",
      "org.apache.directory.api.asn1.ber.tlv.TLVStateEnum"
    );
  }
}
