/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 20:28:00 GMT 2022
 */

package org.apache.directory.server.kerberos.changepwd.messages;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class AbstractPasswordMessage_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.directory.server.kerberos.changepwd.messages.AbstractPasswordMessage"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractPasswordMessage_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.directory.shared.kerberos.messages.KrbError",
      "org.apache.directory.api.asn1.util.BitString",
      "org.apache.directory.shared.kerberos.KerberosMessageType",
      "org.apache.directory.shared.kerberos.exceptions.KerberosException",
      "org.apache.directory.api.asn1.EncoderException",
      "org.apache.directory.shared.kerberos.components.EncryptedData",
      "org.apache.directory.api.asn1.Asn1Object",
      "org.apache.directory.shared.kerberos.codec.options.ApOptions",
      "org.apache.directory.shared.kerberos.exceptions.ErrorType",
      "org.apache.directory.shared.kerberos.flags.AbstractKerberosFlags",
      "org.apache.directory.server.kerberos.changepwd.messages.ChangePasswordReply",
      "org.apache.directory.shared.kerberos.codec.options.Options",
      "org.apache.directory.api.asn1.DecoderException",
      "org.apache.directory.shared.kerberos.components.PrincipalName",
      "org.apache.directory.shared.kerberos.messages.Ticket",
      "org.apache.directory.server.kerberos.changepwd.messages.ChangePasswordError",
      "org.apache.directory.server.kerberos.changepwd.exceptions.ChangePasswdErrorType",
      "org.apache.directory.server.kerberos.changepwd.messages.ChangePasswordRequest",
      "org.apache.directory.server.kerberos.changepwd.exceptions.ChangePasswordException",
      "org.apache.directory.shared.kerberos.messages.KerberosMessage",
      "org.apache.directory.shared.kerberos.KerberosTime",
      "org.apache.directory.api.asn1.ber.Asn1Container",
      "org.apache.directory.shared.kerberos.messages.ApReq",
      "org.apache.directory.shared.kerberos.messages.ApRep",
      "org.apache.directory.shared.kerberos.messages.KrbPriv",
      "org.apache.directory.server.kerberos.changepwd.messages.AbstractPasswordMessage"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.nio.ByteBuffer", false, AbstractPasswordMessage_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.directory.shared.kerberos.messages.ApRep", false, AbstractPasswordMessage_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.directory.shared.kerberos.messages.ApReq", false, AbstractPasswordMessage_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.directory.shared.kerberos.messages.KrbError", false, AbstractPasswordMessage_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.directory.shared.kerberos.messages.KrbPriv", false, AbstractPasswordMessage_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractPasswordMessage_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.directory.server.kerberos.changepwd.messages.AbstractPasswordMessage",
      "org.apache.directory.server.kerberos.changepwd.messages.ChangePasswordError",
      "org.apache.directory.shared.kerberos.messages.KerberosMessage",
      "org.apache.directory.shared.kerberos.messages.ApReq",
      "org.apache.directory.shared.kerberos.messages.ApRep",
      "org.apache.directory.shared.kerberos.messages.KrbPriv",
      "org.apache.directory.server.kerberos.changepwd.messages.ChangePasswordReply",
      "org.apache.directory.shared.kerberos.messages.KrbError",
      "org.apache.directory.server.kerberos.changepwd.messages.ChangePasswordRequest",
      "org.apache.directory.shared.kerberos.codec.KerberosDecoder",
      "org.apache.directory.api.asn1.ber.AbstractContainer",
      "org.apache.directory.shared.kerberos.codec.apReq.ApReqContainer",
      "org.apache.directory.api.asn1.ber.tlv.TLVStateEnum",
      "org.apache.directory.api.asn1.ber.grammar.AbstractGrammar",
      "org.apache.directory.shared.kerberos.codec.apReq.ApReqStatesEnum",
      "org.apache.directory.api.asn1.ber.grammar.GrammarTransition",
      "org.apache.directory.api.asn1.ber.grammar.GrammarAction",
      "org.apache.directory.shared.kerberos.codec.apReq.actions.ApReqInit",
      "org.apache.directory.api.asn1.ber.tlv.UniversalTag",
      "org.apache.directory.api.asn1.actions.CheckNotNullLength",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadPvno",
      "org.apache.directory.shared.kerberos.codec.apReq.actions.StorePvno",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadMsgType",
      "org.apache.directory.shared.kerberos.codec.apReq.actions.CheckMsgType",
      "org.apache.directory.shared.kerberos.KerberosMessageType",
      "org.apache.directory.shared.kerberos.codec.apReq.actions.StoreApOptions",
      "org.apache.directory.shared.kerberos.codec.apReq.actions.StoreTicket",
      "org.apache.directory.shared.kerberos.codec.actions.AbstractReadEncryptedPart",
      "org.apache.directory.shared.kerberos.codec.apReq.actions.StoreAuthenticator",
      "org.apache.directory.shared.kerberos.codec.apReq.ApReqGrammar",
      "org.apache.directory.api.asn1.ber.Asn1Decoder",
      "org.apache.directory.shared.kerberos.codec.krbPriv.KrbPrivContainer",
      "org.apache.directory.shared.kerberos.codec.krbPriv.KrbPrivStatesEnum",
      "org.apache.directory.shared.kerberos.codec.krbPriv.actions.KrbPrivInit",
      "org.apache.directory.shared.kerberos.codec.krbPriv.actions.StorePvno",
      "org.apache.directory.shared.kerberos.codec.krbPriv.actions.CheckMsgType",
      "org.apache.directory.shared.kerberos.codec.krbPriv.actions.StoreEncPart",
      "org.apache.directory.shared.kerberos.codec.krbPriv.KrbPrivGrammar",
      "org.apache.directory.api.util.Strings",
      "org.apache.directory.server.kerberos.changepwd.exceptions.ChangePasswdErrorType",
      "org.apache.directory.shared.kerberos.codec.apRep.ApRepContainer",
      "org.apache.directory.shared.kerberos.codec.apRep.ApRepStatesEnum",
      "org.apache.directory.shared.kerberos.codec.apRep.actions.ApRepInit",
      "org.apache.directory.shared.kerberos.codec.apRep.actions.StorePvno",
      "org.apache.directory.shared.kerberos.codec.apRep.actions.CheckMsgType",
      "org.apache.directory.shared.kerberos.codec.apRep.actions.StoreEncPart",
      "org.apache.directory.shared.kerberos.codec.apRep.ApRepGrammar",
      "org.apache.directory.api.asn1.ber.Asn1Decoder$1",
      "org.apache.directory.api.asn1.ber.tlv.TLV",
      "org.apache.directory.api.asn1.ber.tlv.BerValue",
      "org.apache.directory.api.i18n.I18n",
      "org.apache.directory.api.asn1.util.Asn1StringUtils",
      "org.apache.directory.api.asn1.DecoderException",
      "org.apache.directory.shared.kerberos.exceptions.KerberosException",
      "org.apache.directory.shared.kerberos.exceptions.ErrorType",
      "org.apache.directory.server.kerberos.changepwd.exceptions.ChangePasswordException"
    );
  }
}
