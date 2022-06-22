/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:40:50 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.ticket.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.ticket.TicketContainer;
import org.apache.directory.shared.kerberos.codec.ticket.actions.StoreTktVno;
import org.apache.directory.shared.kerberos.messages.Ticket;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreTktVno_ESTest extends StoreTktVno_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreTktVno storeTktVno0 = new StoreTktVno();
      Ticket ticket0 = mock(Ticket.class, new ViolatedAssumptionAnswer());
      TicketContainer ticketContainer0 = mock(TicketContainer.class, new ViolatedAssumptionAnswer());
      doReturn(ticket0).when(ticketContainer0).getTicket();
      storeTktVno0.setIntegerValue(0, ticketContainer0);
      assertEquals("Kerberos Ticket tktvno value", storeTktVno0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreTktVno storeTktVno0 = new StoreTktVno();
      // Undeclared exception!
      try { 
        storeTktVno0.setIntegerValue(1754, (TicketContainer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.ticket.actions.StoreTktVno", e);
      }
  }
}