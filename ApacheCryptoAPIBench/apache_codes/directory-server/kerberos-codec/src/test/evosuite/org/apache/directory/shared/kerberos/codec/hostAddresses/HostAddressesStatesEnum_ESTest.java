/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:59:32 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.hostAddresses;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.shared.kerberos.codec.hostAddresses.HostAddressesContainer;
import org.apache.directory.shared.kerberos.codec.hostAddresses.HostAddressesGrammar;
import org.apache.directory.shared.kerberos.codec.hostAddresses.HostAddressesStatesEnum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HostAddressesStatesEnum_ESTest extends HostAddressesStatesEnum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HostAddressesStatesEnum hostAddressesStatesEnum0 = HostAddressesStatesEnum.LAST_HOST_ADDRESSES_STATE;
      String string0 = hostAddressesStatesEnum0.getState(0);
      assertEquals("LAST_HOST_ADDRESSES_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HostAddressesStatesEnum[] hostAddressesStatesEnumArray0 = HostAddressesStatesEnum.values();
      assertEquals(4, hostAddressesStatesEnumArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HostAddressesStatesEnum hostAddressesStatesEnum0 = HostAddressesStatesEnum.valueOf("LAST_HOST_ADDRESSES_STATE");
      assertEquals(HostAddressesStatesEnum.START_STATE, hostAddressesStatesEnum0.getStartState());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HostAddressesStatesEnum hostAddressesStatesEnum0 = HostAddressesStatesEnum.valueOf("START_STATE");
      assertEquals(HostAddressesStatesEnum.START_STATE, hostAddressesStatesEnum0.getStartState());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HostAddressesStatesEnum hostAddressesStatesEnum0 = HostAddressesStatesEnum.LAST_HOST_ADDRESSES_STATE;
      boolean boolean0 = hostAddressesStatesEnum0.isEndState();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HostAddressesStatesEnum hostAddressesStatesEnum0 = HostAddressesStatesEnum.HOST_ADDRESSES_SEQ_STATE;
      boolean boolean0 = hostAddressesStatesEnum0.isEndState();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HostAddressesStatesEnum hostAddressesStatesEnum0 = HostAddressesStatesEnum.HOST_ADDRESSES_SEQ_STATE;
      String string0 = hostAddressesStatesEnum0.getState(3);
      assertEquals("HOST_ADDRESSES_END_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HostAddressesStatesEnum hostAddressesStatesEnum0 = HostAddressesStatesEnum.HOST_ADDRESSES_SEQ_STATE;
      String string0 = hostAddressesStatesEnum0.getState(57);
      assertEquals("HOST_ADDRESSES_SEQ_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HostAddressesStatesEnum hostAddressesStatesEnum0 = HostAddressesStatesEnum.HOST_ADDRESSES_ADDRESS_STATE;
      Grammar<HostAddressesContainer> grammar0 = HostAddressesGrammar.getInstance();
      String string0 = hostAddressesStatesEnum0.getGrammarName(grammar0);
      assertEquals("HOST_ADDRESSES_GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HostAddressesStatesEnum hostAddressesStatesEnum0 = HostAddressesStatesEnum.HOST_ADDRESSES_SEQ_STATE;
      String string0 = hostAddressesStatesEnum0.getGrammarName((Grammar<HostAddressesContainer>) null);
      assertEquals("UNKNOWN GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HostAddressesStatesEnum hostAddressesStatesEnum0 = HostAddressesStatesEnum.HOST_ADDRESSES_SEQ_STATE;
      HostAddressesStatesEnum hostAddressesStatesEnum1 = hostAddressesStatesEnum0.getStartState();
      assertEquals(HostAddressesStatesEnum.START_STATE, hostAddressesStatesEnum1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HostAddressesStatesEnum hostAddressesStatesEnum0 = HostAddressesStatesEnum.START_STATE;
      String string0 = hostAddressesStatesEnum0.getGrammarName(3200);
      assertEquals("HOST_ADDRESSES_GRAMMAR", string0);
  }
}
