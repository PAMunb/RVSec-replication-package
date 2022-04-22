/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:01:08 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.paEncTsEnc;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.shared.kerberos.codec.paEncTsEnc.PaEncTsEncContainer;
import org.apache.directory.shared.kerberos.codec.paEncTsEnc.PaEncTsEncGrammar;
import org.apache.directory.shared.kerberos.codec.paEncTsEnc.PaEncTsEncStatesEnum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PaEncTsEncStatesEnum_ESTest extends PaEncTsEncStatesEnum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PaEncTsEncStatesEnum paEncTsEncStatesEnum0 = PaEncTsEncStatesEnum.PA_ENC_TS_ENC_PA_TIMESTAMP_TAG_STATE;
      String string0 = paEncTsEncStatesEnum0.getState(0);
      assertEquals("PA_ENC_TS_ENC_PA_TIMESTAMP_TAG_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PaEncTsEncStatesEnum[] paEncTsEncStatesEnumArray0 = PaEncTsEncStatesEnum.values();
      assertEquals(7, paEncTsEncStatesEnumArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PaEncTsEncStatesEnum paEncTsEncStatesEnum0 = PaEncTsEncStatesEnum.valueOf("LAST_PA_ENC_TS_ENC_STATE");
      assertEquals(PaEncTsEncStatesEnum.LAST_PA_ENC_TS_ENC_STATE, paEncTsEncStatesEnum0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PaEncTsEncStatesEnum paEncTsEncStatesEnum0 = PaEncTsEncStatesEnum.valueOf("PA_ENC_TS_ENC_PA_TIMESTAMP_TAG_STATE");
      assertEquals(PaEncTsEncStatesEnum.START_STATE, paEncTsEncStatesEnum0.getStartState());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PaEncTsEncStatesEnum paEncTsEncStatesEnum0 = PaEncTsEncStatesEnum.LAST_PA_ENC_TS_ENC_STATE;
      boolean boolean0 = paEncTsEncStatesEnum0.isEndState();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PaEncTsEncStatesEnum paEncTsEncStatesEnum0 = PaEncTsEncStatesEnum.PA_ENC_TS_ENC_PA_TIMESTAMP_TAG_STATE;
      boolean boolean0 = paEncTsEncStatesEnum0.isEndState();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PaEncTsEncStatesEnum paEncTsEncStatesEnum0 = PaEncTsEncStatesEnum.PA_ENC_TS_ENC_PA_TIMESTAMP_TAG_STATE;
      String string0 = paEncTsEncStatesEnum0.getState(6);
      assertEquals("PA_ENC_TS_ENC_END_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PaEncTsEncStatesEnum paEncTsEncStatesEnum0 = PaEncTsEncStatesEnum.PA_ENC_TS_ENC_PA_TIMESTAMP_TAG_STATE;
      String string0 = paEncTsEncStatesEnum0.getState(2372);
      assertEquals("PA_ENC_TS_ENC_PA_TIMESTAMP_TAG_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PaEncTsEncStatesEnum paEncTsEncStatesEnum0 = PaEncTsEncStatesEnum.PA_ENC_TS_PA_TIMESTAMP_STATE;
      Grammar<PaEncTsEncContainer> grammar0 = PaEncTsEncGrammar.getInstance();
      String string0 = paEncTsEncStatesEnum0.getGrammarName(grammar0);
      assertEquals("PA_ENC_TS_ENC_GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PaEncTsEncStatesEnum paEncTsEncStatesEnum0 = PaEncTsEncStatesEnum.PA_ENC_TS_PA_TIMESTAMP_STATE;
      String string0 = paEncTsEncStatesEnum0.getGrammarName((Grammar<PaEncTsEncContainer>) null);
      assertEquals("UNKNOWN GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PaEncTsEncStatesEnum paEncTsEncStatesEnum0 = PaEncTsEncStatesEnum.PA_ENC_TS_ENC_PA_TIMESTAMP_TAG_STATE;
      PaEncTsEncStatesEnum paEncTsEncStatesEnum1 = paEncTsEncStatesEnum0.getStartState();
      assertEquals(PaEncTsEncStatesEnum.START_STATE, paEncTsEncStatesEnum1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PaEncTsEncStatesEnum paEncTsEncStatesEnum0 = PaEncTsEncStatesEnum.PA_ENC_TS_ENC_PA_USEC_STATE;
      String string0 = paEncTsEncStatesEnum0.getGrammarName(77);
      assertEquals("PA_ENC_TS_ENC_GRAMMAR", string0);
  }
}
