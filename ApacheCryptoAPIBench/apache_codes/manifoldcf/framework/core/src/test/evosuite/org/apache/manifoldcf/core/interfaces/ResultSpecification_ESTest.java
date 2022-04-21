/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:44:13 GMT 2022
 */

package org.apache.manifoldcf.core.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.manifoldcf.core.interfaces.ResultSpecification;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ResultSpecification_ESTest extends ResultSpecification_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ResultSpecification.ColumnSpecification resultSpecification_ColumnSpecification0 = new ResultSpecification.ColumnSpecification();
      assertEquals("0", resultSpecification_ColumnSpecification0.toString());
      
      resultSpecification_ColumnSpecification0.formValue = (-4281);
      ResultSpecification.ColumnSpecification resultSpecification_ColumnSpecification1 = new ResultSpecification.ColumnSpecification();
      boolean boolean0 = resultSpecification_ColumnSpecification1.equals(resultSpecification_ColumnSpecification0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      resultSpecification0.setForm("TVebIAkI'", 4848);
      resultSpecification0.setForm("TVebIAkI'", 1823);
      assertEquals(2, ResultSpecification.FORM_STREAM);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      resultSpecification0.setForm("km^M15,.q#RVS4", (-1217));
      resultSpecification0.setForm("org.apache.manifoldcf.core.interfaces.ResultSpecification", (-1));
      String string0 = resultSpecification0.toString();
      assertEquals("2-km^M15,.q#RVS4--1217-org.apache.manifoldcf.core.interfaces.ResultSpecification--1", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      resultSpecification0.setForm("", 1);
      ResultSpecification resultSpecification1 = new ResultSpecification();
      boolean boolean0 = resultSpecification0.equals(resultSpecification1);
      assertFalse(resultSpecification1.equals((Object)resultSpecification0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      resultSpecification0.setForm("km^M15,.q#RVS4", (-1217));
      resultSpecification0.setForm("org.apache.manifoldcf.core.interfaces.ResultSpecification", (-1));
      resultSpecification0.hashCode();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      resultSpecification0.setForm("&:A0q=@*.N@>*{#6", 1604);
      int int0 = resultSpecification0.getForm("&:A0q=@*.N@>*{#6");
      assertEquals(1604, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      resultSpecification0.columnSpecifications = null;
      // Undeclared exception!
      try { 
        resultSpecification0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ResultSpecification", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      resultSpecification0.columnSpecifications = null;
      // Undeclared exception!
      try { 
        resultSpecification0.setForm("~GI", 2685);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ResultSpecification", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      resultSpecification0.columnSpecifications = null;
      // Undeclared exception!
      try { 
        resultSpecification0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ResultSpecification", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      ResultSpecification resultSpecification1 = new ResultSpecification();
      resultSpecification1.columnSpecifications = null;
      // Undeclared exception!
      try { 
        resultSpecification0.equals(resultSpecification1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ResultSpecification", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ResultSpecification.ColumnSpecification resultSpecification_ColumnSpecification0 = new ResultSpecification.ColumnSpecification();
      ResultSpecification.ColumnSpecification resultSpecification_ColumnSpecification1 = new ResultSpecification.ColumnSpecification();
      resultSpecification_ColumnSpecification0.setForm(656);
      boolean boolean0 = resultSpecification_ColumnSpecification1.equals(resultSpecification_ColumnSpecification0);
      assertEquals("656", resultSpecification_ColumnSpecification0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ResultSpecification.ColumnSpecification resultSpecification_ColumnSpecification0 = new ResultSpecification.ColumnSpecification();
      boolean boolean0 = resultSpecification_ColumnSpecification0.equals(resultSpecification_ColumnSpecification0);
      assertEquals(0, resultSpecification_ColumnSpecification0.getForm());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      ResultSpecification.ColumnSpecification resultSpecification_ColumnSpecification0 = new ResultSpecification.ColumnSpecification();
      boolean boolean0 = resultSpecification_ColumnSpecification0.equals(resultSpecification0);
      assertFalse(boolean0);
      assertEquals(0, resultSpecification_ColumnSpecification0.getForm());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      int int0 = resultSpecification0.getForm("p(B<Tetv");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      resultSpecification0.setForm("0", (-236));
      int int0 = resultSpecification0.getForm("0");
      assertEquals((-236), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      resultSpecification0.setForm("", 1);
      resultSpecification0.setForm("", 0);
      assertEquals(1, ResultSpecification.FORM_STRING);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      resultSpecification0.setForm("q&-", 0);
      assertEquals(0, ResultSpecification.FORM_DEFAULT);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      resultSpecification0.setForm("", (-165));
      resultSpecification0.setForm("", (-165));
      assertEquals(1, ResultSpecification.FORM_STRING);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      ResultSpecification resultSpecification1 = new ResultSpecification();
      assertTrue(resultSpecification1.equals((Object)resultSpecification0));
      
      resultSpecification0.setForm("Pa+~WLM/ehkY5h", 646);
      resultSpecification1.setForm("Pa+~WLM/ehkY5h", (-2194));
      boolean boolean0 = resultSpecification1.equals(resultSpecification0);
      assertFalse(resultSpecification1.equals((Object)resultSpecification0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      ResultSpecification resultSpecification1 = new ResultSpecification();
      assertTrue(resultSpecification1.equals((Object)resultSpecification0));
      
      resultSpecification0.setForm("Pa+~WLM/ehkY5h", 646);
      resultSpecification1.setForm("u)d'1*MIx", (-2194));
      boolean boolean0 = resultSpecification1.equals(resultSpecification0);
      assertFalse(resultSpecification1.equals((Object)resultSpecification0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      resultSpecification0.setForm("-", (-1506));
      boolean boolean0 = resultSpecification0.equals(resultSpecification0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      ResultSpecification resultSpecification1 = new ResultSpecification();
      assertTrue(resultSpecification1.equals((Object)resultSpecification0));
      
      resultSpecification1.setForm("Vgr^:scL1|yX", 2);
      boolean boolean0 = resultSpecification0.equals(resultSpecification1);
      assertFalse(resultSpecification1.equals((Object)resultSpecification0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ResultSpecification resultSpecification0 = new ResultSpecification();
      boolean boolean0 = resultSpecification0.equals("0");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ResultSpecification.ColumnSpecification resultSpecification_ColumnSpecification0 = new ResultSpecification.ColumnSpecification();
      String string0 = resultSpecification_ColumnSpecification0.toString();
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ResultSpecification.ColumnSpecification resultSpecification_ColumnSpecification0 = new ResultSpecification.ColumnSpecification();
      int int0 = resultSpecification_ColumnSpecification0.getForm();
      assertEquals(0, int0);
  }
}
