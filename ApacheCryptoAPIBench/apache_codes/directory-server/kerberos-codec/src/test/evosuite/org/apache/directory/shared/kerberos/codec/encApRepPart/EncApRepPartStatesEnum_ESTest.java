/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:00:12 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.encApRepPart;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.shared.kerberos.codec.encApRepPart.EncApRepPartContainer;
import org.apache.directory.shared.kerberos.codec.encApRepPart.EncApRepPartGrammar;
import org.apache.directory.shared.kerberos.codec.encApRepPart.EncApRepPartStatesEnum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EncApRepPartStatesEnum_ESTest extends EncApRepPartStatesEnum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EncApRepPartStatesEnum encApRepPartStatesEnum0 = EncApRepPartStatesEnum.ENC_AP_REP_PART_CUSEC_TAG_STATE;
      String string0 = encApRepPartStatesEnum0.getState(24);
      assertEquals("ENC_AP_REP_PART_CUSEC_TAG_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EncApRepPartStatesEnum[] encApRepPartStatesEnumArray0 = EncApRepPartStatesEnum.values();
      assertEquals(11, encApRepPartStatesEnumArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EncApRepPartStatesEnum encApRepPartStatesEnum0 = EncApRepPartStatesEnum.valueOf("LAST_ENC_AP_REP_PART_STATE");
      assertEquals(EncApRepPartStatesEnum.LAST_ENC_AP_REP_PART_STATE, encApRepPartStatesEnum0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EncApRepPartStatesEnum encApRepPartStatesEnum0 = EncApRepPartStatesEnum.valueOf("ENC_AP_REP_PART_CUSEC_STATE");
      assertEquals(EncApRepPartStatesEnum.ENC_AP_REP_PART_CUSEC_STATE, encApRepPartStatesEnum0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EncApRepPartStatesEnum encApRepPartStatesEnum0 = EncApRepPartStatesEnum.LAST_ENC_AP_REP_PART_STATE;
      boolean boolean0 = encApRepPartStatesEnum0.isEndState();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EncApRepPartStatesEnum encApRepPartStatesEnum0 = EncApRepPartStatesEnum.START_STATE;
      boolean boolean0 = encApRepPartStatesEnum0.isEndState();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EncApRepPartStatesEnum encApRepPartStatesEnum0 = EncApRepPartStatesEnum.ENC_AP_REP_PART_CTIME_TAG_STATE;
      EncApRepPartStatesEnum encApRepPartStatesEnum1 = encApRepPartStatesEnum0.getStartState();
      assertEquals(EncApRepPartStatesEnum.START_STATE, encApRepPartStatesEnum1);
      
      String string0 = encApRepPartStatesEnum1.getState(10);
      assertEquals("ENC_AP_REP_PART_END_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EncApRepPartStatesEnum encApRepPartStatesEnum0 = EncApRepPartStatesEnum.START_STATE;
      String string0 = encApRepPartStatesEnum0.getState(3);
      assertEquals("START_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EncApRepPartStatesEnum encApRepPartStatesEnum0 = EncApRepPartStatesEnum.ENC_AP_REP_PART_CUSEC_TAG_STATE;
      Grammar<EncApRepPartContainer> grammar0 = EncApRepPartGrammar.getInstance();
      String string0 = encApRepPartStatesEnum0.getGrammarName(grammar0);
      assertEquals("ENC_AP_REP_PART_GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncApRepPartStatesEnum encApRepPartStatesEnum0 = EncApRepPartStatesEnum.ENC_AP_REP_PART_SEQ_NUMBER_STATE;
      String string0 = encApRepPartStatesEnum0.getGrammarName((Grammar<EncApRepPartContainer>) null);
      assertEquals("UNKNOWN GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EncApRepPartStatesEnum encApRepPartStatesEnum0 = EncApRepPartStatesEnum.ENC_AP_REP_PART_CUSEC_TAG_STATE;
      String string0 = encApRepPartStatesEnum0.getGrammarName((-4857));
      assertEquals("ENC_AP_REP_PART_GRAMMAR", string0);
  }
}
