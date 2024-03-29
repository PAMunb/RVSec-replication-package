/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 20:23:17 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.encTicketPart.actions;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class StoreCaddr_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.directory.shared.kerberos.codec.encTicketPart.actions.StoreCaddr"; 
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
    java.lang.System.setProperty("user.dir", "/home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/directory-server/kerberos-codec"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(StoreCaddr_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.directory.shared.kerberos.components.AuthorizationData",
      "org.apache.directory.shared.kerberos.components.HostAddresses",
      "org.apache.directory.api.asn1.util.BitString",
      "org.apache.directory.shared.kerberos.components.EncryptionKey",
      "org.apache.directory.shared.kerberos.components.HostAddress",
      "org.apache.directory.api.asn1.EncoderException",
      "org.apache.directory.api.asn1.ber.AbstractContainer",
      "org.apache.directory.api.asn1.Asn1Object",
      "org.apache.directory.api.asn1.ber.grammar.States",
      "org.apache.directory.shared.kerberos.flags.AbstractKerberosFlags",
      "org.apache.directory.shared.kerberos.flags.TicketFlag",
      "org.apache.directory.shared.kerberos.codec.encTicketPart.EncTicketPartContainer",
      "org.apache.directory.api.asn1.ber.grammar.Grammar",
      "org.apache.directory.api.asn1.DecoderException",
      "org.apache.directory.shared.kerberos.flags.KerberosFlag",
      "org.apache.directory.shared.kerberos.components.PrincipalName",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadHostAddresses",
      "org.apache.directory.shared.kerberos.components.TransitedEncoding",
      "org.apache.directory.shared.kerberos.codec.encTicketPart.EncTicketPartStatesEnum",
      "org.apache.directory.api.asn1.ber.tlv.TLVStateEnum",
      "org.apache.directory.shared.kerberos.codec.encTicketPart.actions.StoreCaddr",
      "org.apache.directory.api.asn1.ber.grammar.GrammarAction",
      "org.apache.directory.shared.kerberos.KerberosTime",
      "org.apache.directory.api.asn1.ber.grammar.Action",
      "org.apache.directory.api.asn1.ber.Asn1Container",
      "org.apache.directory.api.asn1.ber.tlv.TLV",
      "org.apache.directory.shared.kerberos.flags.TicketFlags",
      "org.apache.directory.shared.kerberos.components.EncTicketPart"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.directory.shared.kerberos.codec.encTicketPart.EncTicketPartContainer", false, StoreCaddr_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.directory.shared.kerberos.components.EncTicketPart", false, StoreCaddr_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.directory.shared.kerberos.components.HostAddresses", false, StoreCaddr_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(StoreCaddr_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.directory.api.asn1.ber.grammar.GrammarAction",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadHostAddresses",
      "org.apache.directory.shared.kerberos.codec.encTicketPart.actions.StoreCaddr",
      "org.apache.directory.api.asn1.ber.AbstractContainer",
      "org.apache.directory.shared.kerberos.codec.encTicketPart.EncTicketPartContainer",
      "org.apache.directory.shared.kerberos.components.HostAddresses",
      "org.apache.directory.shared.kerberos.components.EncTicketPart"
    );
  }
}
