/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:20:37 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.ticket.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.api.asn1.ber.tlv.TLV;
import org.apache.directory.shared.kerberos.codec.ticket.TicketContainer;
import org.apache.directory.shared.kerberos.codec.ticket.actions.TicketInit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TicketInit_ESTest extends TicketInit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TicketInit ticketInit0 = new TicketInit();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn((-1089)).when(tLV0).getLength();
      TicketContainer ticketContainer0 = mock(TicketContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(ticketContainer0).getCurrentTLV();
      ticketInit0.action(ticketContainer0);
      assertEquals("Ticket initialization", ticketInit0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TicketInit ticketInit0 = new TicketInit();
      TicketContainer ticketContainer0 = mock(TicketContainer.class, new ViolatedAssumptionAnswer());
      doReturn((TLV) null).when(ticketContainer0).getCurrentTLV();
      // Undeclared exception!
      try { 
        ticketInit0.action(ticketContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.ticket.actions.TicketInit", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TicketInit ticketInit0 = new TicketInit();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(tLV0).getLength();
      TicketContainer ticketContainer0 = mock(TicketContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(ticketContainer0).getCurrentTLV();
      try { 
        ticketInit0.action(ticketContainer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_744_NULL_PDU_LENGTH The PDU length is null, this is not allowed
         //
         verifyException("org.apache.directory.shared.kerberos.codec.ticket.actions.TicketInit", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TicketInit ticketInit0 = new TicketInit();
      TLV tLV0 = mock(TLV.class, new ViolatedAssumptionAnswer());
      doReturn(1709).when(tLV0).getLength();
      TicketContainer ticketContainer0 = mock(TicketContainer.class, new ViolatedAssumptionAnswer());
      doReturn(tLV0).when(ticketContainer0).getCurrentTLV();
      ticketInit0.action(ticketContainer0);
      assertEquals("Ticket initialization", ticketInit0.toString());
  }
}
