/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 15:44:22 GMT 2022
 */

package org.apache.tika.sax.xpath;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tika.sax.xpath.Matcher;
import org.apache.tika.sax.xpath.XPathParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class XPathParser_ESTest extends XPathParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XPathParser xPathParser0 = new XPathParser("m~~{/IMEQ397&#u.b^", "//");
      // Undeclared exception!
      try { 
        xPathParser0.parse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XPathParser xPathParser0 = new XPathParser();
      Matcher matcher0 = xPathParser0.parse("");
      assertFalse(matcher0.matchesText());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XPathParser xPathParser0 = new XPathParser();
      xPathParser0.addPrefix("/@", "/@");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XPathParser xPathParser0 = new XPathParser();
      Matcher matcher0 = xPathParser0.parse("/:F#N\u0004['");
      assertFalse(matcher0.matchesElement());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XPathParser xPathParser0 = new XPathParser();
      Matcher matcher0 = xPathParser0.parse("/ /pY(%P9[D7xoBf!g");
      assertFalse(matcher0.matchesElement());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XPathParser xPathParser0 = new XPathParser("m~~{/IMEQ397&#u.b^", "//");
      Matcher matcher0 = xPathParser0.parse("m~~{/IMEQ397&#u.b^");
      assertFalse(matcher0.matchesElement());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XPathParser xPathParser0 = new XPathParser();
      Matcher matcher0 = xPathParser0.parse("//>U");
      assertFalse(matcher0.matchesText());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XPathParser xPathParser0 = new XPathParser();
      Matcher matcher0 = xPathParser0.parse("///vth");
      assertFalse(matcher0.matchesElement());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XPathParser xPathParser0 = new XPathParser();
      Matcher matcher0 = xPathParser0.parse("/*");
      assertFalse(matcher0.matchesText());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XPathParser xPathParser0 = new XPathParser();
      Matcher matcher0 = xPathParser0.parse("/@:K}Zqti4");
      assertFalse(matcher0.matchesElement());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XPathParser xPathParser0 = new XPathParser((String) null, (String) null);
      Matcher matcher0 = xPathParser0.parse("/teUx()");
      assertFalse(matcher0.matchesText());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XPathParser xPathParser0 = new XPathParser();
      Matcher matcher0 = xPathParser0.parse("/@*");
      assertFalse(matcher0.matchesText());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XPathParser xPathParser0 = new XPathParser();
      Matcher matcher0 = xPathParser0.parse("/descendant:node()");
      assertFalse(matcher0.matchesElement());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XPathParser xPathParser0 = new XPathParser();
      Matcher matcher0 = xPathParser0.parse("/descendant::node()");
      assertFalse(matcher0.matchesElement());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XPathParser xPathParser0 = new XPathParser();
      Matcher matcher0 = xPathParser0.parse("/node()");
      assertTrue(matcher0.matchesElement());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XPathParser xPathParser0 = new XPathParser();
      Matcher matcher0 = xPathParser0.parse("/text()");
      assertFalse(matcher0.matchesElement());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XPathParser xPathParser0 = new XPathParser((String) null, (String) null);
      Matcher matcher0 = xPathParser0.parse("/@///");
      assertFalse(matcher0.matchesText());
  }
}
