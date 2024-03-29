/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:57:58 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.encAsRepPart;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.shared.kerberos.codec.encAsRepPart.EncAsRepPartContainer;
import org.apache.directory.shared.kerberos.codec.encAsRepPart.EncAsRepPartGrammar;
import org.apache.directory.shared.kerberos.codec.encAsRepPart.EncAsRepPartStatesEnum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EncAsRepPartStatesEnum_ESTest extends EncAsRepPartStatesEnum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EncAsRepPartStatesEnum encAsRepPartStatesEnum0 = EncAsRepPartStatesEnum.START_STATE;
      String string0 = encAsRepPartStatesEnum0.getState(713);
      assertEquals("START_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EncAsRepPartStatesEnum[] encAsRepPartStatesEnumArray0 = EncAsRepPartStatesEnum.values();
      assertEquals(3, encAsRepPartStatesEnumArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EncAsRepPartStatesEnum encAsRepPartStatesEnum0 = EncAsRepPartStatesEnum.valueOf("LAST_ENC_AS_REP_PART_STATE");
      assertEquals(EncAsRepPartStatesEnum.LAST_ENC_AS_REP_PART_STATE, encAsRepPartStatesEnum0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EncAsRepPartStatesEnum encAsRepPartStatesEnum0 = EncAsRepPartStatesEnum.valueOf("START_STATE");
      assertEquals(EncAsRepPartStatesEnum.START_STATE, encAsRepPartStatesEnum0.getStartState());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EncAsRepPartStatesEnum encAsRepPartStatesEnum0 = EncAsRepPartStatesEnum.LAST_ENC_AS_REP_PART_STATE;
      boolean boolean0 = encAsRepPartStatesEnum0.isEndState();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EncAsRepPartStatesEnum encAsRepPartStatesEnum0 = EncAsRepPartStatesEnum.START_STATE;
      boolean boolean0 = encAsRepPartStatesEnum0.isEndState();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EncAsRepPartStatesEnum encAsRepPartStatesEnum0 = EncAsRepPartStatesEnum.START_STATE;
      String string0 = encAsRepPartStatesEnum0.getState(2);
      assertEquals("ENC_AS_REP_PART_END_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EncAsRepPartStatesEnum encAsRepPartStatesEnum0 = EncAsRepPartStatesEnum.LAST_ENC_AS_REP_PART_STATE;
      String string0 = encAsRepPartStatesEnum0.getState((-1044));
      assertEquals("LAST_ENC_AS_REP_PART_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EncAsRepPartStatesEnum encAsRepPartStatesEnum0 = EncAsRepPartStatesEnum.ENC_AS_REP_PART_STATE;
      Grammar<EncAsRepPartContainer> grammar0 = EncAsRepPartGrammar.getInstance();
      String string0 = encAsRepPartStatesEnum0.getGrammarName(grammar0);
      assertEquals("ENC_AS_REP_PART_GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncAsRepPartStatesEnum encAsRepPartStatesEnum0 = EncAsRepPartStatesEnum.ENC_AS_REP_PART_STATE;
      String string0 = encAsRepPartStatesEnum0.getGrammarName((Grammar<EncAsRepPartContainer>) null);
      assertEquals("UNKNOWN GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EncAsRepPartStatesEnum encAsRepPartStatesEnum0 = EncAsRepPartStatesEnum.LAST_ENC_AS_REP_PART_STATE;
      EncAsRepPartStatesEnum encAsRepPartStatesEnum1 = encAsRepPartStatesEnum0.getStartState();
      assertEquals(EncAsRepPartStatesEnum.START_STATE, encAsRepPartStatesEnum1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EncAsRepPartStatesEnum encAsRepPartStatesEnum0 = EncAsRepPartStatesEnum.ENC_AS_REP_PART_STATE;
      String string0 = encAsRepPartStatesEnum0.getGrammarName(1148);
      assertEquals("ENC_AS_REP_PART_GRAMMAR", string0);
  }
}
