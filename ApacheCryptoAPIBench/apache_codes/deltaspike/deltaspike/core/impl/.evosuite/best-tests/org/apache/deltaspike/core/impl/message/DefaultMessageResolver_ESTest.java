/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:15:50 GMT 2022
 */

package org.apache.deltaspike.core.impl.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.deltaspike.core.api.message.MessageContext;
import org.apache.deltaspike.core.impl.message.DefaultMessageContext;
import org.apache.deltaspike.core.impl.message.DefaultMessageResolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultMessageResolver_ESTest extends DefaultMessageResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultMessageResolver defaultMessageResolver0 = new DefaultMessageResolver();
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      String string0 = defaultMessageResolver0.getMessage(defaultMessageContext0, "", "2*V9c.8,??&o;)m|EW$");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultMessageResolver defaultMessageResolver0 = new DefaultMessageResolver();
      // Undeclared exception!
      try { 
        defaultMessageResolver0.getMessageSources((MessageContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.deltaspike.core.impl.message.DefaultMessageResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultMessageResolver defaultMessageResolver0 = new DefaultMessageResolver();
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      String[] stringArray0 = new String[1];
      MessageContext messageContext0 = defaultMessageContext0.messageSource(stringArray0);
      messageContext0.localeResolver(defaultMessageContext0);
      // Undeclared exception!
      defaultMessageResolver0.getMessage(messageContext0, "{h3oh+~z~}", "{h3oh+~z~}");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultMessageResolver defaultMessageResolver0 = new DefaultMessageResolver();
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "{,[6^]t75~U}";
      MessageContext messageContext0 = defaultMessageContext0.messageSource(stringArray0);
      String string0 = defaultMessageResolver0.getMessage(messageContext0, "{,[6^]t75~U}", "{,[6^]t75~U}");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultMessageResolver defaultMessageResolver0 = new DefaultMessageResolver();
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "{,[6^]t75~U}";
      MessageContext messageContext0 = defaultMessageContext0.messageSource(stringArray0);
      // Undeclared exception!
      try { 
        defaultMessageResolver0.getMessage(messageContext0, "{,[6^]t75~U}", "{,[6^]t75~U}");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ResourceBundle$CacheKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultMessageResolver defaultMessageResolver0 = new DefaultMessageResolver();
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      String string0 = defaultMessageResolver0.getMessage(defaultMessageContext0, "{", "ljG/kgx*ZC#NxDod");
      assertEquals("{", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultMessageResolver defaultMessageResolver0 = new DefaultMessageResolver();
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      String string0 = defaultMessageResolver0.getMessage(defaultMessageContext0, "{N}", "}");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DefaultMessageResolver defaultMessageResolver0 = new DefaultMessageResolver();
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      String string0 = defaultMessageResolver0.getMessage(defaultMessageContext0, "{{", "ljG/kgx*ZC#NxDod");
      assertEquals("{", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DefaultMessageResolver defaultMessageResolver0 = new DefaultMessageResolver();
      DefaultMessageContext defaultMessageContext0 = new DefaultMessageContext();
      List<String> list0 = defaultMessageResolver0.getMessageSources(defaultMessageContext0);
      assertTrue(list0.isEmpty());
  }
}