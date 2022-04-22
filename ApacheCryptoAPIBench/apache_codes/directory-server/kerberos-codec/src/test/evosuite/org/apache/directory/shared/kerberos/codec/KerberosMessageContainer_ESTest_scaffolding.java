/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 20:33:21 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class KerberosMessageContainer_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.directory.shared.kerberos.codec.KerberosMessageContainer"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(KerberosMessageContainer_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.directory.shared.kerberos.messages.KrbError",
      "org.apache.directory.shared.kerberos.KerberosMessageType",
      "org.apache.directory.api.asn1.EncoderException",
      "org.apache.directory.api.asn1.ber.AbstractContainer",
      "org.apache.directory.shared.kerberos.components.EncryptedData",
      "org.apache.directory.shared.kerberos.components.KdcReq",
      "org.apache.directory.api.asn1.Asn1Object",
      "org.apache.directory.shared.kerberos.components.KdcRep",
      "org.apache.directory.api.asn1.ber.grammar.States",
      "org.apache.directory.shared.kerberos.messages.KrbSafe",
      "org.apache.directory.shared.kerberos.messages.AsReq",
      "org.apache.directory.shared.kerberos.messages.AsRep",
      "org.apache.directory.shared.kerberos.codec.types.PrincipalNameType",
      "org.apache.directory.api.asn1.ber.grammar.Grammar",
      "org.apache.directory.shared.kerberos.messages.KrbCred",
      "org.apache.directory.api.asn1.DecoderException",
      "org.apache.directory.shared.kerberos.codec.KerberosMessageStatesEnum",
      "org.apache.directory.shared.kerberos.components.PrincipalName",
      "org.apache.directory.shared.kerberos.messages.Ticket",
      "org.apache.directory.shared.kerberos.messages.TgsReq",
      "org.apache.directory.api.asn1.ber.grammar.AbstractGrammar",
      "org.apache.directory.shared.kerberos.messages.TgsRep",
      "org.apache.directory.shared.kerberos.codec.KerberosMessageGrammar$DecodeKerberosMessage",
      "org.apache.directory.api.asn1.ber.tlv.TLVStateEnum",
      "org.apache.directory.api.asn1.ber.tlv.TLVBerDecoderMBean",
      "org.apache.directory.api.asn1.ber.grammar.GrammarTransition",
      "org.apache.directory.shared.kerberos.messages.KerberosMessage",
      "org.apache.directory.api.asn1.ber.grammar.GrammarAction",
      "org.apache.directory.api.asn1.ber.grammar.Action",
      "org.apache.directory.api.asn1.ber.Asn1Container",
      "org.apache.directory.shared.kerberos.messages.ApReq",
      "org.apache.directory.shared.kerberos.messages.ApRep",
      "org.apache.directory.api.asn1.ber.tlv.TLV",
      "org.apache.directory.shared.kerberos.codec.KerberosMessageGrammar",
      "org.apache.directory.api.asn1.ber.Asn1Decoder",
      "org.apache.directory.shared.kerberos.messages.KrbPriv",
      "org.apache.directory.shared.kerberos.codec.KerberosMessageContainer",
      "org.apache.directory.shared.kerberos.components.EncTicketPart"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(KerberosMessageContainer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.directory.api.asn1.ber.AbstractContainer",
      "org.apache.directory.shared.kerberos.codec.KerberosMessageContainer",
      "org.apache.directory.api.asn1.ber.grammar.AbstractGrammar",
      "org.apache.directory.api.asn1.ber.Asn1Decoder",
      "org.apache.directory.shared.kerberos.codec.KerberosMessageStatesEnum",
      "org.apache.directory.api.asn1.ber.grammar.GrammarTransition",
      "org.apache.directory.api.asn1.ber.grammar.GrammarAction",
      "org.apache.directory.shared.kerberos.codec.KerberosMessageGrammar$DecodeKerberosMessage",
      "org.apache.directory.shared.kerberos.codec.KerberosMessageGrammar",
      "org.apache.directory.shared.kerberos.messages.KerberosMessage",
      "org.apache.directory.shared.kerberos.messages.Ticket",
      "org.apache.directory.api.asn1.ber.tlv.TLV",
      "org.apache.directory.api.asn1.ber.tlv.TLVStateEnum"
    );
  }
}
