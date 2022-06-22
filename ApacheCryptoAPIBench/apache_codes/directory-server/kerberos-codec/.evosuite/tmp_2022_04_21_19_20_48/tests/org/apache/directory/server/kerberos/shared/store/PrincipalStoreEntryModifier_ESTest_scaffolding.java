/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 21 20:11:59 GMT 2022
 */

package org.apache.directory.server.kerberos.shared.store;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PrincipalStoreEntryModifier_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.directory.server.kerberos.shared.store.PrincipalStoreEntryModifier"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PrincipalStoreEntryModifier_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.directory.api.asn1.actions.AbstractReadOctetString",
      "org.apache.directory.shared.kerberos.components.EncryptionKey",
      "org.apache.directory.api.ldap.model.exception.LdapInvalidAttributeValueException",
      "org.apache.directory.api.util.Strings",
      "org.apache.directory.shared.kerberos.exceptions.KerberosException",
      "org.apache.directory.shared.kerberos.codec.types.SamType",
      "org.apache.directory.api.asn1.ber.AbstractContainer",
      "org.apache.directory.shared.kerberos.codec.encryptionKey.actions.EncryptionKeyInit",
      "org.apache.directory.api.asn1.Asn1Object",
      "org.apache.directory.shared.kerberos.codec.encryptionKey.EncryptionKeyContainer",
      "org.apache.directory.api.ldap.model.entry.DefaultAttribute",
      "org.apache.directory.api.asn1.ber.grammar.States",
      "org.apache.directory.shared.kerberos.codec.KerberosDecoder",
      "org.apache.directory.api.ldap.model.schema.normalizers.NoOpNormalizer",
      "org.apache.directory.api.ldap.model.exception.LdapOperationException",
      "org.apache.directory.api.asn1.ber.grammar.Grammar",
      "org.apache.directory.shared.kerberos.KerberosUtils",
      "org.apache.directory.api.ldap.model.schema.SchemaObjectType",
      "org.apache.directory.api.asn1.ber.tlv.TLVStateEnum",
      "org.apache.directory.api.ldap.model.entry.Value",
      "org.apache.directory.server.kerberos.changepwd.exceptions.ChangePasswordException",
      "org.apache.directory.api.asn1.ber.grammar.GrammarTransition",
      "org.apache.directory.api.asn1.ber.grammar.GrammarAction",
      "org.apache.directory.api.asn1.actions.AbstractReadInteger",
      "org.apache.directory.api.ldap.model.schema.AttributeType",
      "org.apache.directory.api.ldap.model.schema.SchemaObject",
      "org.apache.directory.api.ldap.model.schema.LdapComparator",
      "org.apache.directory.api.asn1.ber.Asn1Decoder",
      "org.apache.directory.api.ldap.model.schema.comparators.StringComparator",
      "org.apache.directory.api.asn1.EncoderException",
      "org.apache.directory.api.asn1.util.Asn1StringUtils",
      "org.apache.directory.shared.kerberos.codec.types.EncryptionType",
      "org.apache.directory.api.asn1.ber.tlv.BerValue",
      "org.apache.directory.server.kerberos.shared.store.PrincipalStoreEntryModifier",
      "org.apache.directory.shared.kerberos.exceptions.ErrorType",
      "org.apache.directory.shared.kerberos.codec.encryptionKey.actions.StoreKeyValue",
      "org.apache.directory.server.kerberos.shared.store.PrincipalStoreEntry",
      "org.apache.directory.shared.kerberos.codec.encryptionKey.EncryptionKeyGrammar",
      "org.apache.directory.api.asn1.ber.tlv.IntegerDecoderException",
      "org.apache.directory.shared.kerberos.codec.encryptionKey.EncryptionKeyStatesEnum",
      "org.apache.directory.api.asn1.DecoderException",
      "org.apache.directory.api.ldap.model.schema.AbstractSchemaObject",
      "org.apache.directory.api.asn1.ber.tlv.UniversalTag",
      "org.apache.directory.api.asn1.actions.CheckNotNullLength",
      "org.apache.directory.api.i18n.I18n",
      "org.apache.directory.api.asn1.ber.grammar.AbstractGrammar",
      "org.apache.directory.shared.kerberos.codec.encryptionKey.actions.StoreKeyType",
      "org.apache.directory.api.asn1.ber.tlv.TLVBerDecoderMBean",
      "org.apache.directory.server.i18n.I18n",
      "org.apache.directory.shared.kerberos.KerberosTime",
      "org.apache.directory.api.asn1.ber.Asn1Decoder$1",
      "org.apache.directory.api.ldap.model.schema.LoadableSchemaObject",
      "org.apache.directory.api.asn1.ber.grammar.Action",
      "org.apache.directory.api.ldap.model.entry.Attribute",
      "org.apache.directory.api.asn1.ber.Asn1Container",
      "org.apache.directory.api.ldap.model.schema.Normalizer",
      "org.apache.directory.api.asn1.ber.tlv.TLV",
      "org.apache.directory.api.ldap.model.exception.LdapException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PrincipalStoreEntryModifier_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.directory.server.kerberos.shared.store.PrincipalStoreEntryModifier",
      "org.apache.directory.api.util.Strings",
      "org.apache.directory.shared.kerberos.codec.types.EncryptionType",
      "org.apache.directory.shared.kerberos.KerberosUtils",
      "org.apache.directory.shared.kerberos.KerberosTime",
      "org.apache.directory.server.i18n.I18n",
      "org.apache.directory.shared.kerberos.codec.KerberosDecoder",
      "org.apache.directory.shared.kerberos.exceptions.ErrorType",
      "org.apache.directory.server.kerberos.shared.store.PrincipalStoreEntry",
      "org.apache.directory.api.ldap.model.entry.DefaultAttribute",
      "org.apache.directory.api.ldap.model.schema.AbstractSchemaObject",
      "org.apache.directory.api.ldap.model.schema.LoadableSchemaObject",
      "org.apache.directory.api.ldap.model.schema.LdapComparator",
      "org.apache.directory.api.ldap.model.schema.comparators.StringComparator",
      "org.apache.directory.api.ldap.model.schema.SchemaObjectType",
      "org.apache.directory.api.ldap.model.schema.Normalizer",
      "org.apache.directory.api.ldap.model.schema.normalizers.NoOpNormalizer",
      "org.apache.directory.api.ldap.model.entry.Value",
      "org.apache.directory.api.i18n.I18n",
      "org.apache.directory.api.ldap.model.schema.AttributeType",
      "org.apache.directory.api.ldap.model.schema.MutableAttributeType",
      "org.apache.directory.api.ldap.model.schema.UsageEnum",
      "org.apache.directory.api.asn1.ber.AbstractContainer",
      "org.apache.directory.shared.kerberos.codec.encryptionKey.EncryptionKeyContainer",
      "org.apache.directory.api.asn1.ber.tlv.TLVStateEnum",
      "org.apache.directory.api.asn1.ber.grammar.AbstractGrammar",
      "org.apache.directory.shared.kerberos.codec.encryptionKey.EncryptionKeyStatesEnum",
      "org.apache.directory.api.asn1.ber.tlv.UniversalTag",
      "org.apache.directory.api.asn1.ber.grammar.GrammarTransition",
      "org.apache.directory.api.asn1.ber.grammar.GrammarAction",
      "org.apache.directory.shared.kerberos.codec.encryptionKey.actions.EncryptionKeyInit",
      "org.apache.directory.api.asn1.actions.CheckNotNullLength",
      "org.apache.directory.api.asn1.actions.AbstractReadInteger",
      "org.apache.directory.shared.kerberos.codec.encryptionKey.actions.StoreKeyType",
      "org.apache.directory.api.asn1.actions.AbstractReadOctetString",
      "org.apache.directory.shared.kerberos.codec.encryptionKey.actions.StoreKeyValue",
      "org.apache.directory.shared.kerberos.codec.encryptionKey.EncryptionKeyGrammar",
      "org.apache.directory.api.asn1.ber.Asn1Decoder",
      "org.apache.directory.api.asn1.ber.Asn1Decoder$1",
      "org.apache.directory.api.asn1.ber.tlv.TLV",
      "org.apache.directory.api.asn1.ber.tlv.BerValue",
      "org.apache.directory.api.asn1.DecoderException",
      "org.apache.directory.shared.kerberos.exceptions.KerberosException",
      "org.apache.directory.api.ldap.model.schema.normalizers.NumericNormalizer",
      "org.apache.directory.api.ldap.model.name.Ava",
      "org.apache.directory.api.ldap.model.exception.LdapException",
      "org.apache.directory.api.ldap.model.exception.LdapOperationException",
      "org.apache.directory.api.ldap.model.exception.LdapInvalidDnException",
      "org.apache.directory.api.ldap.model.message.ResultCodeEnum",
      "org.apache.directory.api.ldap.model.exception.LdapInvalidDnException$1",
      "org.apache.directory.api.asn1.util.Asn1StringUtils",
      "org.apache.directory.api.ldap.model.name.Dn",
      "org.apache.directory.api.ldap.model.name.Rdn",
      "org.apache.directory.api.ldap.model.exception.LdapInvalidAttributeValueException",
      "org.apache.directory.api.ldap.model.exception.LdapInvalidAttributeValueException$1",
      "org.apache.directory.api.ldap.model.name.FastDnParser",
      "org.apache.directory.api.util.Position",
      "org.apache.directory.api.asn1.util.Oid",
      "org.apache.directory.api.asn1.util.Oid$OidFSAState",
      "org.apache.directory.api.asn1.util.Oid$1",
      "org.apache.directory.api.ldap.model.schema.ObjectClass",
      "org.apache.directory.api.ldap.model.schema.MutableObjectClass",
      "org.apache.directory.api.ldap.model.schema.ObjectClassTypeEnum",
      "org.apache.directory.api.ldap.model.schema.PrepareString$AssertionType",
      "org.apache.directory.api.ldap.model.schema.PrepareString",
      "org.apache.directory.shared.kerberos.components.EncryptionKey",
      "org.apache.directory.api.ldap.model.schema.DitContentRule"
    );
  }
}