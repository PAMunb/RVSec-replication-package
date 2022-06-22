/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:32:26 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.authenticator;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.shared.kerberos.codec.authenticator.AuthenticatorContainer;
import org.apache.directory.shared.kerberos.codec.authenticator.AuthenticatorGrammar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AuthenticatorGrammar_ESTest extends AuthenticatorGrammar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grammar<AuthenticatorContainer> grammar0 = AuthenticatorGrammar.getInstance();
      assertEquals("org.apache.directory.shared.kerberos.codec.authenticator.AuthenticatorGrammar", grammar0.getName());
  }
}