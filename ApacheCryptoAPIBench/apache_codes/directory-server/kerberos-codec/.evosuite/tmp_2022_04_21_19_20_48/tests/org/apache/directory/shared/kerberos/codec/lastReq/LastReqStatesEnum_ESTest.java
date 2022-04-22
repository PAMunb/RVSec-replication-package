/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:03:35 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.lastReq;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.shared.kerberos.codec.lastReq.LastReqContainer;
import org.apache.directory.shared.kerberos.codec.lastReq.LastReqGrammar;
import org.apache.directory.shared.kerberos.codec.lastReq.LastReqStatesEnum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LastReqStatesEnum_ESTest extends LastReqStatesEnum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LastReqStatesEnum lastReqStatesEnum0 = LastReqStatesEnum.LAST_REQ_SEQ_STATE;
      String string0 = lastReqStatesEnum0.getState(63);
      assertEquals("LAST_REQ_SEQ_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LastReqStatesEnum[] lastReqStatesEnumArray0 = LastReqStatesEnum.values();
      assertEquals(8, lastReqStatesEnumArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LastReqStatesEnum lastReqStatesEnum0 = LastReqStatesEnum.valueOf("LAST_LAST_REQ_STATE");
      assertEquals(LastReqStatesEnum.START_STATE, lastReqStatesEnum0.getStartState());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LastReqStatesEnum lastReqStatesEnum0 = LastReqStatesEnum.valueOf("LAST_REQ_SEQ_STATE");
      assertEquals(LastReqStatesEnum.START_STATE, lastReqStatesEnum0.getStartState());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LastReqStatesEnum lastReqStatesEnum0 = LastReqStatesEnum.LAST_LAST_REQ_STATE;
      boolean boolean0 = lastReqStatesEnum0.isEndState();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LastReqStatesEnum lastReqStatesEnum0 = LastReqStatesEnum.LAST_REQ_SEQ_STATE;
      boolean boolean0 = lastReqStatesEnum0.isEndState();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LastReqStatesEnum lastReqStatesEnum0 = LastReqStatesEnum.LAST_REQ_SEQ_SEQ_STATE;
      LastReqStatesEnum lastReqStatesEnum1 = lastReqStatesEnum0.getStartState();
      assertEquals(LastReqStatesEnum.START_STATE, lastReqStatesEnum1);
      
      String string0 = lastReqStatesEnum1.getState(7);
      assertEquals("LAST_LAST_REQ_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LastReqStatesEnum lastReqStatesEnum0 = LastReqStatesEnum.LAST_REQ_SEQ_STATE;
      String string0 = lastReqStatesEnum0.getState((-1548));
      assertEquals("LAST_REQ_SEQ_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LastReqStatesEnum lastReqStatesEnum0 = LastReqStatesEnum.LAST_LAST_REQ_STATE;
      Grammar<LastReqContainer> grammar0 = LastReqGrammar.getInstance();
      String string0 = lastReqStatesEnum0.getGrammarName(grammar0);
      assertEquals("LAST_REQ_GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LastReqStatesEnum lastReqStatesEnum0 = LastReqStatesEnum.LAST_REQ_SEQ_STATE;
      String string0 = lastReqStatesEnum0.getGrammarName((Grammar<LastReqContainer>) null);
      assertEquals("UNKNOWN GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LastReqStatesEnum lastReqStatesEnum0 = LastReqStatesEnum.LAST_REQ_LR_VALUE_STATE;
      String string0 = lastReqStatesEnum0.getGrammarName((-1045));
      assertEquals("LAST_REQ_GRAMMAR", string0);
  }
}
