/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:04:53 GMT 2022
 */

package org.apache.activemq.artemis.api.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.activemq.artemis.api.core.QueueAttributes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QueueAttributes_ESTest extends QueueAttributes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      queueAttributes0.set("purge-on-no-consumers", "cux%`vR");
      assertNull(queueAttributes0.getLastValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      Boolean boolean0 = Boolean.TRUE;
      queueAttributes0.setPurgeOnNoConsumers(boolean0);
      Boolean boolean1 = queueAttributes0.getPurgeOnNoConsumers();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      Boolean boolean0 = Boolean.valueOf(false);
      queueAttributes0.setPurgeOnNoConsumers(boolean0);
      Boolean boolean1 = queueAttributes0.getPurgeOnNoConsumers();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      Integer integer0 = new Integer(0);
      queueAttributes0.setMaxConsumers(integer0);
      Integer integer1 = queueAttributes0.getMaxConsumers();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      Integer integer0 = new Integer(1);
      queueAttributes0.setMaxConsumers(integer0);
      Integer integer1 = queueAttributes0.getMaxConsumers();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      Integer integer0 = new Integer((-2351));
      queueAttributes0.setMaxConsumers(integer0);
      Integer integer1 = queueAttributes0.getMaxConsumers();
      assertEquals((-2351), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      Boolean boolean0 = Boolean.TRUE;
      queueAttributes0.setLastValue(boolean0);
      Boolean boolean1 = queueAttributes0.getLastValue();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      Boolean boolean0 = Boolean.valueOf(false);
      queueAttributes0.setLastValue(boolean0);
      Boolean boolean1 = queueAttributes0.getLastValue();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      Boolean boolean0 = Boolean.valueOf(true);
      queueAttributes0.setExclusive(boolean0);
      Boolean boolean1 = queueAttributes0.getExclusive();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      Boolean boolean0 = Boolean.valueOf(false);
      queueAttributes0.setExclusive(boolean0);
      Boolean boolean1 = queueAttributes0.getExclusive();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      // Undeclared exception!
      try { 
        queueAttributes0.set("max-consumers", "max-consumers");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"max-consumers\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      queueAttributes0.set("last-value", "9eGL5b`U%~)m$H@{b/`");
      assertNull(queueAttributes0.getPurgeOnNoConsumers());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      queueAttributes0.set("exclusive", "");
      assertNull(queueAttributes0.getPurgeOnNoConsumers());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      queueAttributes0.set("max-consumers", "7");
      assertNull(queueAttributes0.getExclusive());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      queueAttributes0.set("", (String) null);
      assertNull(queueAttributes0.getPurgeOnNoConsumers());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      queueAttributes0.set("cux%`vR", "cux%`vR");
      assertNull(queueAttributes0.getLastValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      queueAttributes0.set((String) null, "Whss");
      assertNull(queueAttributes0.getMaxConsumers());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      Boolean boolean0 = queueAttributes0.getPurgeOnNoConsumers();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      Boolean boolean0 = queueAttributes0.getLastValue();
      queueAttributes0.setExclusive(boolean0);
      assertNull(queueAttributes0.getExclusive());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      Boolean boolean0 = queueAttributes0.getExclusive();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QueueAttributes queueAttributes0 = new QueueAttributes();
      Integer integer0 = queueAttributes0.getMaxConsumers();
      assertNull(integer0);
  }
}