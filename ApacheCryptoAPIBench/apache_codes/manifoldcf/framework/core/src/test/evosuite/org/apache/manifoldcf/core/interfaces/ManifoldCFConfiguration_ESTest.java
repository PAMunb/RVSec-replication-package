/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:43:29 GMT 2022
 */

package org.apache.manifoldcf.core.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import org.apache.manifoldcf.core.interfaces.Configuration;
import org.apache.manifoldcf.core.interfaces.ManifoldCFConfiguration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ManifoldCFConfiguration_ESTest extends ManifoldCFConfiguration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      String string0 = manifoldCFConfiguration0.getStringProperty("PKK1 x~KmKwV(p1+>]", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      String string0 = manifoldCFConfiguration0.getStringProperty("name", "name");
      assertNotNull(string0);
      assertEquals("name", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      String string0 = manifoldCFConfiguration0.getPossiblyObfuscatedStringProperty((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      String string0 = manifoldCFConfiguration0.getPossiblyObfuscatedStringProperty("value", "value");
      assertNotNull(string0);
      assertEquals("value", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      long long0 = manifoldCFConfiguration0.getLongProperty("", 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      long long0 = manifoldCFConfiguration0.getLongProperty("@(#)$Id: ManifoldCFConfiguration.java 988245 2010-08-23 18:39:35Z kwright $", (-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      int int0 = manifoldCFConfiguration0.getIntProperty("", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      int int0 = manifoldCFConfiguration0.getIntProperty("\n", (-6));
      assertEquals((-6), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      double double0 = manifoldCFConfiguration0.getDoubleProperty("Illegal property value for boolean property '", 1221.6819475);
      assertEquals(1221.6819475, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      double double0 = manifoldCFConfiguration0.getDoubleProperty("value", (-1L));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      boolean boolean0 = manifoldCFConfiguration0.getBooleanProperty("name", true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      manifoldCFConfiguration0.children = null;
      // Undeclared exception!
      try { 
        manifoldCFConfiguration0.parseProperties();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.Configuration", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)6, (byte)6);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      // Undeclared exception!
      try { 
        manifoldCFConfiguration0.fromXML((InputStream) sequenceInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.common.XMLDoc", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      String string0 = manifoldCFConfiguration0.getProperty("F~R=|{zgQber1TPy8");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      manifoldCFConfiguration0.parseProperties();
      assertEquals(0, manifoldCFConfiguration0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      double double0 = manifoldCFConfiguration0.getDoubleProperty(".obfuscated", 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      long long0 = manifoldCFConfiguration0.getLongProperty("", 1544L);
      assertEquals(1544L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      int int0 = manifoldCFConfiguration0.getIntProperty("\n", 3);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      boolean boolean0 = manifoldCFConfiguration0.getBooleanProperty("", false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      String string0 = manifoldCFConfiguration0.getPossiblyObfuscatedStringProperty("no", "");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      String string0 = manifoldCFConfiguration0.getStringProperty("", "");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      ManifoldCFConfiguration manifoldCFConfiguration0 = null;
      try {
        manifoldCFConfiguration0 = new ManifoldCFConfiguration(bufferedInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.common.XMLDoc", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ManifoldCFConfiguration manifoldCFConfiguration0 = new ManifoldCFConfiguration();
      Configuration configuration0 = manifoldCFConfiguration0.createNew();
      assertTrue(configuration0.equals((Object)manifoldCFConfiguration0));
  }
}