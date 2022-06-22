/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:58:34 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.adAndOr;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.shared.kerberos.codec.adAndOr.AdAndOrContainer;
import org.apache.directory.shared.kerberos.codec.adAndOr.AdAndOrGrammar;
import org.apache.directory.shared.kerberos.codec.adAndOr.AdAndOrStatesEnum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AdAndOrStatesEnum_ESTest extends AdAndOrStatesEnum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdAndOrStatesEnum adAndOrStatesEnum0 = AdAndOrStatesEnum.AD_AND_OR_CONDITION_COUNT_STATE;
      AdAndOrStatesEnum adAndOrStatesEnum1 = adAndOrStatesEnum0.getStartState();
      String string0 = adAndOrStatesEnum1.getState(2122);
      assertEquals("START_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdAndOrStatesEnum[] adAndOrStatesEnumArray0 = AdAndOrStatesEnum.values();
      assertEquals(6, adAndOrStatesEnumArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdAndOrStatesEnum adAndOrStatesEnum0 = AdAndOrStatesEnum.valueOf("LAST_AD_AND_OR_STATE");
      assertTrue(adAndOrStatesEnum0.isEndState());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdAndOrStatesEnum adAndOrStatesEnum0 = AdAndOrStatesEnum.valueOf("AD_AND_OR_ELEMENTS_TAG_STATE");
      assertEquals(AdAndOrStatesEnum.AD_AND_OR_ELEMENTS_TAG_STATE, adAndOrStatesEnum0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdAndOrStatesEnum adAndOrStatesEnum0 = AdAndOrStatesEnum.LAST_AD_AND_OR_STATE;
      boolean boolean0 = adAndOrStatesEnum0.isEndState();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdAndOrStatesEnum adAndOrStatesEnum0 = AdAndOrStatesEnum.AD_AND_OR_CONDITION_COUNT_STATE;
      AdAndOrStatesEnum adAndOrStatesEnum1 = adAndOrStatesEnum0.getStartState();
      assertEquals(AdAndOrStatesEnum.START_STATE, adAndOrStatesEnum1);
      
      boolean boolean0 = adAndOrStatesEnum1.isEndState();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdAndOrStatesEnum adAndOrStatesEnum0 = AdAndOrStatesEnum.LAST_AD_AND_OR_STATE;
      String string0 = adAndOrStatesEnum0.getState(5);
      assertEquals("AD_AND_OR_END_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdAndOrStatesEnum adAndOrStatesEnum0 = AdAndOrStatesEnum.START_STATE;
      Grammar<AdAndOrContainer> grammar0 = AdAndOrGrammar.getInstance();
      String string0 = adAndOrStatesEnum0.getGrammarName(grammar0);
      assertEquals("AD_AND_OR_GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdAndOrStatesEnum adAndOrStatesEnum0 = AdAndOrStatesEnum.AD_AND_OR_CONDITION_COUNT_TAG_STATE;
      String string0 = adAndOrStatesEnum0.getGrammarName((Grammar<AdAndOrContainer>) null);
      assertEquals("UNKNOWN GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdAndOrStatesEnum adAndOrStatesEnum0 = AdAndOrStatesEnum.AD_AND_OR_CONDITION_COUNT_STATE;
      String string0 = adAndOrStatesEnum0.getGrammarName(1981);
      assertEquals("AD_AND_OR_GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdAndOrStatesEnum adAndOrStatesEnum0 = AdAndOrStatesEnum.AD_AND_OR_CONDITION_COUNT_STATE;
      AdAndOrStatesEnum adAndOrStatesEnum1 = adAndOrStatesEnum0.getStartState();
      String string0 = adAndOrStatesEnum1.getState(0);
      assertEquals("START_STATE", string0);
  }
}