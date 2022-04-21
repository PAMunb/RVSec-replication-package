/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 17:18:42 GMT 2022
 */

package org.apache.deltaspike.core.impl.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Serializable;
import java.util.Locale;
import org.apache.deltaspike.core.impl.message.MessageFormatMessageInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MessageFormatMessageInterpolator_ESTest extends MessageFormatMessageInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MessageFormatMessageInterpolator messageFormatMessageInterpolator0 = new MessageFormatMessageInterpolator();
      Serializable[] serializableArray0 = new Serializable[4];
      Locale locale0 = Locale.TAIWAN;
      String string0 = messageFormatMessageInterpolator0.interpolate("", serializableArray0, locale0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MessageFormatMessageInterpolator messageFormatMessageInterpolator0 = new MessageFormatMessageInterpolator();
      Serializable[] serializableArray0 = new Serializable[0];
      Locale locale0 = Locale.KOREA;
      // Undeclared exception!
      try { 
        messageFormatMessageInterpolator0.interpolate((String) null, serializableArray0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MessageFormatMessageInterpolator messageFormatMessageInterpolator0 = new MessageFormatMessageInterpolator();
      Serializable[] serializableArray0 = new Serializable[0];
      Locale locale0 = Locale.JAPANESE;
      // Undeclared exception!
      try { 
        messageFormatMessageInterpolator0.interpolate("lyT{,MY~Gj80ANs", serializableArray0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MessageFormatMessageInterpolator messageFormatMessageInterpolator0 = new MessageFormatMessageInterpolator();
      Locale locale0 = Locale.CHINESE;
      String string0 = messageFormatMessageInterpolator0.interpolate("6]/eCW<L.*29C-Ds", (Serializable[]) null, locale0);
      assertEquals("6]/eCW<L.*29C-Ds", string0);
  }
}
