/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:14:28 GMT 2022
 */

package org.apache.deltaspike.core.impl.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import org.apache.deltaspike.core.api.message.Message;
import org.apache.deltaspike.core.api.message.MessageContext;
import org.apache.deltaspike.core.impl.message.DefaultMessage;
import org.apache.deltaspike.core.impl.message.DefaultMessageContext;
import org.apache.deltaspike.core.impl.message.DefaultMessageInterpolator;
import org.apache.deltaspike.core.impl.message.DefaultMessageResolver;
import org.apache.deltaspike.core.impl.message.MessageFormatMessageInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultMessage_ESTest extends DefaultMessage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      defaultMessage0.template("{{");
      DefaultMessageResolver defaultMessageResolver0 = new DefaultMessageResolver();
      defaultMessageContext0.messageResolver(defaultMessageResolver0);
      String string0 = defaultMessage0.toString("{{");
      assertEquals("{", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      defaultMessage0.reset();
      assertNull(defaultMessage0.getTemplate());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      defaultMessage0.template("Y7rvx! !");
      String string0 = defaultMessage0.toString((MessageContext) defaultMessageContext0, "");
      assertEquals("Y7rvx! !", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      defaultMessage0.template("Y7rvx! !");
      String string0 = defaultMessage0.toString();
      assertEquals("Y7rvx! !", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      defaultMessage0.template(" ");
      String string0 = defaultMessage0.getTemplate();
      assertEquals(" ", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      defaultMessage0.template("");
      String string0 = defaultMessage0.getTemplate();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      Locale locale0 = defaultMessageContext0.getLocale();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      LinkedList<Serializable> linkedList0 = new LinkedList<Serializable>();
      linkedList0.add((Serializable) locale0);
      defaultMessage0.argument((Collection<Serializable>) linkedList0);
      Serializable[] serializableArray0 = defaultMessage0.getArguments();
      assertEquals(1, serializableArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultMessage defaultMessage0 = new DefaultMessage((MessageContext) null);
      // Undeclared exception!
      try { 
        defaultMessage0.toString((MessageContext) null, "_7");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.deltaspike.core.impl.message.DefaultMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      defaultMessage0.template("N");
      MessageFormatMessageInterpolator messageFormatMessageInterpolator0 = new MessageFormatMessageInterpolator();
      MessageContext messageContext0 = defaultMessageContext0.messageInterpolator(messageFormatMessageInterpolator0);
      defaultMessageContext0.localeResolver(messageContext0);
      // Undeclared exception!
      defaultMessage0.toString((MessageContext) defaultMessageContext0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultMessage defaultMessage0 = new DefaultMessage((MessageContext) null);
      // Undeclared exception!
      try { 
        defaultMessage0.toString((MessageContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.deltaspike.core.impl.message.DefaultMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      defaultMessage0.template("{");
      MessageFormatMessageInterpolator messageFormatMessageInterpolator0 = new MessageFormatMessageInterpolator();
      defaultMessageContext0.messageInterpolator(messageFormatMessageInterpolator0);
      // Undeclared exception!
      try { 
        defaultMessage0.toString((MessageContext) defaultMessageContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultMessage defaultMessage0 = new DefaultMessage((MessageContext) null);
      defaultMessage0.template("O{");
      // Undeclared exception!
      try { 
        defaultMessage0.toString("O{");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.deltaspike.core.impl.message.DefaultMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      defaultMessage0.template("Q|o<3SY6g");
      DefaultMessageInterpolator defaultMessageInterpolator0 = new DefaultMessageInterpolator();
      MessageContext messageContext0 = defaultMessageContext0.messageInterpolator(defaultMessageInterpolator0);
      defaultMessageContext0.localeResolver(messageContext0);
      // Undeclared exception!
      defaultMessage0.toString();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultMessage defaultMessage0 = new DefaultMessage((MessageContext) null);
      defaultMessage0.template("R;ZX-m)6vXhK5]U");
      // Undeclared exception!
      try { 
        defaultMessage0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.deltaspike.core.impl.message.DefaultMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      MessageFormatMessageInterpolator messageFormatMessageInterpolator0 = new MessageFormatMessageInterpolator();
      defaultMessageContext0.messageInterpolator(messageFormatMessageInterpolator0);
      Message message0 = defaultMessage0.template("O{");
      // Undeclared exception!
      try { 
        message0.toString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      // Undeclared exception!
      try { 
        defaultMessage0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.deltaspike.core.impl.message.DefaultMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      MessageFormatMessageInterpolator messageFormatMessageInterpolator0 = new MessageFormatMessageInterpolator();
      defaultMessageContext0.messageInterpolator(messageFormatMessageInterpolator0);
      defaultMessage0.template("O{");
      // Undeclared exception!
      try { 
        defaultMessage0.toString("O{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      String string0 = defaultMessage0.toString("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      Serializable[] serializableArray0 = new Serializable[8];
      Message message0 = defaultMessage0.argument(serializableArray0);
      assertSame(defaultMessage0, message0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      String string0 = defaultMessage0.toString((MessageContext) defaultMessageContext0, "{");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      String string0 = defaultMessage0.getTemplate();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      Serializable[] serializableArray0 = defaultMessage0.getArguments();
      assertEquals(0, serializableArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      Message message0 = defaultMessage0.argument((Collection<Serializable>) null);
      assertNull(message0.getTemplate());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      Message message0 = defaultMessage0.argumentArray((Serializable[]) null);
      assertSame(message0, defaultMessage0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      defaultMessage0.template("}");
      defaultMessage0.hashCode();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      DefaultMessage defaultMessage1 = new DefaultMessage(defaultMessageContext0);
      assertTrue(defaultMessage1.equals((Object)defaultMessage0));
      
      Serializable[] serializableArray0 = new Serializable[8];
      defaultMessage1.argumentArray(serializableArray0);
      boolean boolean0 = defaultMessage0.equals(defaultMessage1);
      assertFalse(defaultMessage1.equals((Object)defaultMessage0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      defaultMessage0.template("{");
      DefaultMessage defaultMessage1 = new DefaultMessage(defaultMessageContext0);
      assertFalse(defaultMessage1.equals((Object)defaultMessage0));
      
      defaultMessage1.template("{");
      boolean boolean0 = defaultMessage0.equals(defaultMessage1);
      assertTrue(defaultMessage1.equals((Object)defaultMessage0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      DefaultMessage defaultMessage1 = new DefaultMessage(defaultMessageContext0);
      defaultMessage0.template("4");
      boolean boolean0 = defaultMessage1.equals(defaultMessage0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      Message message0 = defaultMessage0.template("N");
      DefaultMessage defaultMessage1 = new DefaultMessage(defaultMessageContext0);
      boolean boolean0 = defaultMessage0.equals(defaultMessage1);
      assertFalse(boolean0);
      assertFalse(defaultMessage1.equals((Object)message0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      boolean boolean0 = defaultMessage0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      boolean boolean0 = defaultMessage0.equals(defaultMessage0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      Message message0 = defaultMessage0.template("N");
      MessageFormatMessageInterpolator messageFormatMessageInterpolator0 = new MessageFormatMessageInterpolator();
      defaultMessageContext0.messageInterpolator(messageFormatMessageInterpolator0);
      String string0 = message0.toString((MessageContext) defaultMessageContext0);
      assertNotNull(string0);
      assertEquals("N", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      Message message0 = defaultMessage0.argument((Serializable[]) null);
      assertNull(message0.getTemplate());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      String string0 = defaultMessage0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      DefaultMessage defaultMessage0 = new DefaultMessage(defaultMessageContext0);
      String string0 = defaultMessage0.toString((MessageContext) defaultMessageContext0);
      assertEquals("", string0);
  }
}
