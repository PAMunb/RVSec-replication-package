/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:55:14 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.apReq;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.shared.kerberos.codec.apReq.ApReqContainer;
import org.apache.directory.shared.kerberos.codec.apReq.ApReqGrammar;
import org.apache.directory.shared.kerberos.codec.apReq.ApReqStatesEnum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ApReqStatesEnum_ESTest extends ApReqStatesEnum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ApReqStatesEnum apReqStatesEnum0 = ApReqStatesEnum.AP_REQ_AP_OPTIONS_TAG_STATE;
      String string0 = apReqStatesEnum0.getState(4);
      assertEquals("AP_REQ_AP_OPTIONS_TAG_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ApReqStatesEnum[] apReqStatesEnumArray0 = ApReqStatesEnum.values();
      assertEquals(12, apReqStatesEnumArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ApReqStatesEnum apReqStatesEnum0 = ApReqStatesEnum.valueOf("LAST_AP_REQ_STATE");
      assertTrue(apReqStatesEnum0.isEndState());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ApReqStatesEnum apReqStatesEnum0 = ApReqStatesEnum.valueOf("AP_REQ_AP_OPTIONS_TAG_STATE");
      assertEquals(ApReqStatesEnum.AP_REQ_AP_OPTIONS_TAG_STATE, apReqStatesEnum0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ApReqStatesEnum apReqStatesEnum0 = ApReqStatesEnum.LAST_AP_REQ_STATE;
      boolean boolean0 = apReqStatesEnum0.isEndState();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ApReqStatesEnum apReqStatesEnum0 = ApReqStatesEnum.AP_REQ_STATE;
      boolean boolean0 = apReqStatesEnum0.isEndState();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ApReqStatesEnum apReqStatesEnum0 = ApReqStatesEnum.AP_REQ_AP_OPTIONS_TAG_STATE;
      String string0 = apReqStatesEnum0.getState(11);
      assertEquals("AP_REQ_END_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ApReqStatesEnum apReqStatesEnum0 = ApReqStatesEnum.LAST_AP_REQ_STATE;
      String string0 = apReqStatesEnum0.getState(64);
      assertEquals("LAST_AP_REQ_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ApReqStatesEnum apReqStatesEnum0 = ApReqStatesEnum.AP_REQ_STATE;
      Grammar<ApReqContainer> grammar0 = ApReqGrammar.getInstance();
      String string0 = apReqStatesEnum0.getGrammarName(grammar0);
      assertEquals("AP_REQ_GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ApReqStatesEnum apReqStatesEnum0 = ApReqStatesEnum.AP_REQ_AP_OPTIONS_STATE;
      String string0 = apReqStatesEnum0.getGrammarName((Grammar<ApReqContainer>) null);
      assertEquals("UNKNOWN GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ApReqStatesEnum apReqStatesEnum0 = ApReqStatesEnum.AP_REQ_STATE;
      String string0 = apReqStatesEnum0.getGrammarName(551);
      assertEquals("AP_REQ_GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ApReqStatesEnum apReqStatesEnum0 = ApReqStatesEnum.LAST_AP_REQ_STATE;
      ApReqStatesEnum apReqStatesEnum1 = apReqStatesEnum0.getStartState();
      assertEquals(ApReqStatesEnum.START_STATE, apReqStatesEnum1);
  }
}
