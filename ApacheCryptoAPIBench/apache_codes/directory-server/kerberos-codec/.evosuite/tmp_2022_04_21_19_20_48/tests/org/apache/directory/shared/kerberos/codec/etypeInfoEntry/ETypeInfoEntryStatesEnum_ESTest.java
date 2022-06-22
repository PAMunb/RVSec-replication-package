/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:55:23 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.etypeInfoEntry;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.api.asn1.ber.grammar.Grammar;
import org.apache.directory.shared.kerberos.codec.etypeInfoEntry.ETypeInfoEntryContainer;
import org.apache.directory.shared.kerberos.codec.etypeInfoEntry.ETypeInfoEntryGrammar;
import org.apache.directory.shared.kerberos.codec.etypeInfoEntry.ETypeInfoEntryStatesEnum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ETypeInfoEntryStatesEnum_ESTest extends ETypeInfoEntryStatesEnum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ETypeInfoEntryStatesEnum[] eTypeInfoEntryStatesEnumArray0 = ETypeInfoEntryStatesEnum.values();
      assertEquals(7, eTypeInfoEntryStatesEnumArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ETypeInfoEntryStatesEnum eTypeInfoEntryStatesEnum0 = ETypeInfoEntryStatesEnum.valueOf("LAST_ETYPE_INFO_ENTRY_STATE");
      assertEquals(ETypeInfoEntryStatesEnum.LAST_ETYPE_INFO_ENTRY_STATE, eTypeInfoEntryStatesEnum0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ETypeInfoEntryStatesEnum eTypeInfoEntryStatesEnum0 = ETypeInfoEntryStatesEnum.valueOf("START_STATE");
      assertEquals(ETypeInfoEntryStatesEnum.START_STATE, eTypeInfoEntryStatesEnum0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ETypeInfoEntryStatesEnum eTypeInfoEntryStatesEnum0 = ETypeInfoEntryStatesEnum.LAST_ETYPE_INFO_ENTRY_STATE;
      boolean boolean0 = eTypeInfoEntryStatesEnum0.isEndState();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ETypeInfoEntryStatesEnum eTypeInfoEntryStatesEnum0 = ETypeInfoEntryStatesEnum.ETYPE_INFO_ENTRY_SALT_STATE;
      ETypeInfoEntryStatesEnum eTypeInfoEntryStatesEnum1 = eTypeInfoEntryStatesEnum0.getStartState();
      assertEquals(ETypeInfoEntryStatesEnum.START_STATE, eTypeInfoEntryStatesEnum1);
      
      boolean boolean0 = eTypeInfoEntryStatesEnum1.isEndState();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ETypeInfoEntryStatesEnum eTypeInfoEntryStatesEnum0 = ETypeInfoEntryStatesEnum.ETYPE_INFO_ENTRY_ETYPE_TAG_STATE;
      String string0 = eTypeInfoEntryStatesEnum0.getState(6);
      assertEquals("LAST_ETYPE_INFO_ENTRY_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ETypeInfoEntryStatesEnum eTypeInfoEntryStatesEnum0 = ETypeInfoEntryStatesEnum.ETYPE_INFO_ENTRY_SALT_STATE;
      ETypeInfoEntryStatesEnum eTypeInfoEntryStatesEnum1 = eTypeInfoEntryStatesEnum0.getStartState();
      String string0 = eTypeInfoEntryStatesEnum1.getState(461);
      assertEquals("START_STATE", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ETypeInfoEntryStatesEnum eTypeInfoEntryStatesEnum0 = ETypeInfoEntryStatesEnum.LAST_ETYPE_INFO_ENTRY_STATE;
      Grammar<ETypeInfoEntryContainer> grammar0 = ETypeInfoEntryGrammar.getInstance();
      String string0 = eTypeInfoEntryStatesEnum0.getGrammarName(grammar0);
      assertEquals("ETYPE_INFO_ENTRY_GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ETypeInfoEntryStatesEnum eTypeInfoEntryStatesEnum0 = ETypeInfoEntryStatesEnum.ETYPE_INFO_ENTRY_SALT_STATE;
      ETypeInfoEntryStatesEnum eTypeInfoEntryStatesEnum1 = eTypeInfoEntryStatesEnum0.getStartState();
      assertEquals(ETypeInfoEntryStatesEnum.START_STATE, eTypeInfoEntryStatesEnum1);
      
      String string0 = eTypeInfoEntryStatesEnum1.getGrammarName((Grammar<ETypeInfoEntryContainer>) null);
      assertEquals("UNKNOWN GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ETypeInfoEntryStatesEnum eTypeInfoEntryStatesEnum0 = ETypeInfoEntryStatesEnum.LAST_ETYPE_INFO_ENTRY_STATE;
      String string0 = eTypeInfoEntryStatesEnum0.getGrammarName((-404));
      assertEquals("ETYPE_INFO_ENTRY_GRAMMAR", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ETypeInfoEntryStatesEnum eTypeInfoEntryStatesEnum0 = ETypeInfoEntryStatesEnum.LAST_ETYPE_INFO_ENTRY_STATE;
      ETypeInfoEntryStatesEnum eTypeInfoEntryStatesEnum1 = eTypeInfoEntryStatesEnum0.getStartState();
      String string0 = eTypeInfoEntryStatesEnum1.getState((-404));
      assertEquals("START_STATE", string0);
  }
}