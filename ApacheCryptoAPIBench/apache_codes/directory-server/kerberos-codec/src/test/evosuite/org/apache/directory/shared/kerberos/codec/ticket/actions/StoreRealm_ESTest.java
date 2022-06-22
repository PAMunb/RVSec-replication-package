/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:30:45 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.ticket.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.ticket.TicketContainer;
import org.apache.directory.shared.kerberos.codec.ticket.actions.StoreRealm;
import org.apache.directory.shared.kerberos.messages.Ticket;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreRealm_ESTest extends StoreRealm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreRealm storeRealm0 = new StoreRealm();
      Ticket ticket0 = mock(Ticket.class, new ViolatedAssumptionAnswer());
      TicketContainer ticketContainer0 = mock(TicketContainer.class, new ViolatedAssumptionAnswer());
      doReturn(ticket0).when(ticketContainer0).getTicket();
      storeRealm0.setRealm("", ticketContainer0);
      assertEquals("Kerberos Ticket realm value", storeRealm0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreRealm storeRealm0 = new StoreRealm();
      // Undeclared exception!
      try { 
        storeRealm0.setRealm(":{YRg1x#cfLuZiI:", (TicketContainer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.ticket.actions.StoreRealm", e);
      }
  }
}