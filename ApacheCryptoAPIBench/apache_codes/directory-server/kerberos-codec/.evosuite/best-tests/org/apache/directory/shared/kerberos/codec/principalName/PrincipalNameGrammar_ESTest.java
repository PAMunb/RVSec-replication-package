/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:33:56 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.principalName;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.shared.kerberos.codec.principalName.PrincipalNameContainer;
import org.apache.directory.shared.kerberos.codec.principalName.PrincipalNameGrammar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PrincipalNameGrammar_ESTest extends PrincipalNameGrammar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grammar<PrincipalNameContainer> grammar0 = PrincipalNameGrammar.getInstance();
      assertEquals("org.apache.directory.shared.kerberos.codec.principalName.PrincipalNameGrammar", grammar0.getName());
  }
}