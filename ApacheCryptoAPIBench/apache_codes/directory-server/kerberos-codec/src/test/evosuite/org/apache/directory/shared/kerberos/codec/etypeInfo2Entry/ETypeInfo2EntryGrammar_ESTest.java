/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:26:35 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.etypeInfo2Entry;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.shared.kerberos.codec.etypeInfo2Entry.ETypeInfo2EntryContainer;
import org.apache.directory.shared.kerberos.codec.etypeInfo2Entry.ETypeInfo2EntryGrammar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ETypeInfo2EntryGrammar_ESTest extends ETypeInfo2EntryGrammar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grammar<ETypeInfo2EntryContainer> grammar0 = ETypeInfo2EntryGrammar.getInstance();
      assertEquals("org.apache.directory.shared.kerberos.codec.etypeInfo2Entry.ETypeInfo2EntryGrammar", grammar0.getName());
  }
}
