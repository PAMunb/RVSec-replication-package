/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:22:23 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.krbCredInfo;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.shared.kerberos.codec.krbCredInfo.KrbCredInfoContainer;
import org.apache.directory.shared.kerberos.codec.krbCredInfo.KrbCredInfoGrammar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class KrbCredInfoGrammar_ESTest extends KrbCredInfoGrammar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grammar<KrbCredInfoContainer> grammar0 = KrbCredInfoGrammar.getInstance();
      assertEquals("org.apache.directory.shared.kerberos.codec.krbCredInfo.KrbCredInfoGrammar", grammar0.getName());
  }
}
