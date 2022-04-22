/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:25:24 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.apReq;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.shared.kerberos.codec.apReq.ApReqContainer;
import org.apache.directory.shared.kerberos.codec.apReq.ApReqGrammar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ApReqGrammar_ESTest extends ApReqGrammar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grammar<ApReqContainer> grammar0 = ApReqGrammar.getInstance();
      assertEquals("org.apache.directory.shared.kerberos.codec.apReq.ApReqGrammar", grammar0.getName());
  }
}
