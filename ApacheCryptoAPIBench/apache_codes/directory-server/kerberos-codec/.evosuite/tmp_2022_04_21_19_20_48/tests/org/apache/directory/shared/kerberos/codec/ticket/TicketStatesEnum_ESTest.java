/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:58:42 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.ticket;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.shared.kerberos.codec.ticket.TicketContainer;
import org.apache.directory.shared.kerberos.codec.ticket.TicketStatesEnum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TicketStatesEnum_ESTest extends TicketStatesEnum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TicketStatesEnum ticketStatesEnum0 = TicketStatesEnum.TICKET_SNAME_TAG_STATE;
      String string0 = ticketStatesEnum0.getState(5806);
      assertEquals("TICKET_SNAME_TAG_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TicketStatesEnum[] ticketStatesEnumArray0 = TicketStatesEnum.values();
      assertEquals(10, ticketStatesEnumArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TicketStatesEnum ticketStatesEnum0 = TicketStatesEnum.valueOf("LAST_TICKET_STATE");
      assertTrue(ticketStatesEnum0.isEndState());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TicketStatesEnum ticketStatesEnum0 = TicketStatesEnum.valueOf("TICKET_SNAME_TAG_STATE");
      assertEquals(TicketStatesEnum.TICKET_SNAME_TAG_STATE, ticketStatesEnum0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TicketStatesEnum ticketStatesEnum0 = TicketStatesEnum.LAST_TICKET_STATE;
      boolean boolean0 = ticketStatesEnum0.isEndState();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TicketStatesEnum ticketStatesEnum0 = TicketStatesEnum.TICKET_ENC_PART_TAG_STATE;
      boolean boolean0 = ticketStatesEnum0.isEndState();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TicketStatesEnum ticketStatesEnum0 = TicketStatesEnum.TICKET_REALM_STATE;
      String string0 = ticketStatesEnum0.getState(9);
      assertEquals("TICKET_END_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TicketStatesEnum ticketStatesEnum0 = TicketStatesEnum.TICKET_ENC_PART_TAG_STATE;
      String string0 = ticketStatesEnum0.getState(0);
      assertEquals("TICKET_ENC_PART_TAG_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TicketStatesEnum ticketStatesEnum0 = TicketStatesEnum.START_STATE;
      String string0 = ticketStatesEnum0.getGrammarName((Grammar<TicketContainer>) null);
      assertEquals("UNKNOWN GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TicketStatesEnum ticketStatesEnum0 = TicketStatesEnum.TICKET_VNO_TAG_STATE;
      TicketStatesEnum ticketStatesEnum1 = ticketStatesEnum0.getStartState();
      assertEquals(TicketStatesEnum.START_STATE, ticketStatesEnum1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TicketStatesEnum ticketStatesEnum0 = TicketStatesEnum.TICKET_ENC_PART_TAG_STATE;
      String string0 = ticketStatesEnum0.getGrammarName((-1970));
      assertEquals("TICKET_GRAMMAR", string0);
  }
}
