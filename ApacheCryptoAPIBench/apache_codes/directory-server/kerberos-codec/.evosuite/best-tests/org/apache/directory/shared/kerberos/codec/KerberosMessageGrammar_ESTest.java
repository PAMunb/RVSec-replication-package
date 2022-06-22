/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:39:03 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.shared.kerberos.codec.KerberosMessageContainer;
import org.apache.directory.shared.kerberos.codec.KerberosMessageGrammar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class KerberosMessageGrammar_ESTest extends KerberosMessageGrammar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grammar<KerberosMessageContainer> grammar0 = KerberosMessageGrammar.getInstance();
      assertEquals("org.apache.directory.shared.kerberos.codec.KerberosMessageGrammar", grammar0.getName());
  }
}