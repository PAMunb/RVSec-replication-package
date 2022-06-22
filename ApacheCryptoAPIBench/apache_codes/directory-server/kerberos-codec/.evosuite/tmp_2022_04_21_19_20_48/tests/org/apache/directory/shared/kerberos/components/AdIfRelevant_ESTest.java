/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:31:10 GMT 2022
 */

package org.apache.directory.shared.kerberos.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.components.AdIfRelevant;
import org.apache.directory.shared.kerberos.components.AuthorizationDataEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AdIfRelevant_ESTest extends AdIfRelevant_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AdIfRelevant adIfRelevant0 = new AdIfRelevant();
      adIfRelevant0.addEntry((AuthorizationDataEntry) null);
      // Undeclared exception!
      try { 
        adIfRelevant0.toString("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.AuthorizationData", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AdIfRelevant adIfRelevant0 = new AdIfRelevant();
      adIfRelevant0.addEntry((AuthorizationDataEntry) null);
      // Undeclared exception!
      try { 
        adIfRelevant0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.AuthorizationData", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AdIfRelevant adIfRelevant0 = new AdIfRelevant();
      String string0 = adIfRelevant0.toString("oO-o>p-o\"Cus+L0tf>\"");
      assertEquals("oO-o>p-o\"Cus+L0tf>\"AD-IF-RELEVANT : {\noO-o>p-o\"Cus+L0tf>\"    oO-o>p-o\"Cus+L0tf>\"AuthorizationData : \n\noO-o>p-o\"Cus+L0tf>\"}\n", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AdIfRelevant adIfRelevant0 = new AdIfRelevant();
      String string0 = adIfRelevant0.toString();
      assertEquals("AD-IF-RELEVANT : {\n    AuthorizationData : \n\n}\n", string0);
  }
}