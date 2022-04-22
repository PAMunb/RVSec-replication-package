/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:40:20 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.encKrbPrivPart;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.shared.kerberos.codec.encKrbPrivPart.EncKrbPrivPartContainer;
import org.apache.directory.shared.kerberos.codec.encKrbPrivPart.EncKrbPrivPartGrammar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EncKrbPrivPartGrammar_ESTest extends EncKrbPrivPartGrammar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grammar<EncKrbPrivPartContainer> grammar0 = EncKrbPrivPartGrammar.getInstance();
      assertEquals("org.apache.directory.shared.kerberos.codec.encKrbPrivPart.EncKrbPrivPartGrammar", grammar0.getName());
  }
}
