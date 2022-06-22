/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:36:11 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.ticket;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.shared.kerberos.codec.ticket.TicketContainer;
import org.apache.directory.shared.kerberos.codec.ticket.TicketGrammar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TicketGrammar_ESTest extends TicketGrammar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grammar<TicketContainer> grammar0 = TicketGrammar.getInstance();
      assertEquals("org.apache.directory.shared.kerberos.codec.ticket.TicketGrammar", grammar0.getName());
  }
}