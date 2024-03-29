/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:28:42 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.krbPriv;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.shared.kerberos.codec.krbPriv.KrbPrivContainer;
import org.apache.directory.shared.kerberos.codec.krbPriv.KrbPrivGrammar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class KrbPrivGrammar_ESTest extends KrbPrivGrammar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grammar<KrbPrivContainer> grammar0 = KrbPrivGrammar.getInstance();
      assertEquals("org.apache.directory.shared.kerberos.codec.krbPriv.KrbPrivGrammar", grammar0.getName());
  }
}
