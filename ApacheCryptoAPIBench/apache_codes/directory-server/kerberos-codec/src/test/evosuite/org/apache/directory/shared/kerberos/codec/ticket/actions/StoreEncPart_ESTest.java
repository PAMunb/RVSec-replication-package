/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:29:41 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.ticket.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.ticket.TicketContainer;
import org.apache.directory.shared.kerberos.codec.ticket.actions.StoreEncPart;
import org.apache.directory.shared.kerberos.components.EncryptedData;
import org.apache.directory.shared.kerberos.messages.Ticket;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreEncPart_ESTest extends StoreEncPart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreEncPart storeEncPart0 = new StoreEncPart();
      EncryptedData encryptedData0 = mock(EncryptedData.class, new ViolatedAssumptionAnswer());
      TicketContainer ticketContainer0 = mock(TicketContainer.class, new ViolatedAssumptionAnswer());
      doReturn((Ticket) null).when(ticketContainer0).getTicket();
      // Undeclared exception!
      try { 
        storeEncPart0.setEncryptedData(encryptedData0, ticketContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.ticket.actions.StoreEncPart", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreEncPart storeEncPart0 = new StoreEncPart();
      EncryptedData encryptedData0 = mock(EncryptedData.class, new ViolatedAssumptionAnswer());
      Ticket ticket0 = mock(Ticket.class, new ViolatedAssumptionAnswer());
      TicketContainer ticketContainer0 = mock(TicketContainer.class, new ViolatedAssumptionAnswer());
      doReturn(ticket0).when(ticketContainer0).getTicket();
      storeEncPart0.setEncryptedData(encryptedData0, ticketContainer0);
      assertEquals("Kerberos Ticket EncodedPart", storeEncPart0.toString());
  }
}