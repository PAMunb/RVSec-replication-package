/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:16:42 GMT 2022
 */

package org.apache.wicket.util.convert.converter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import org.apache.wicket.util.convert.IConverter;
import org.apache.wicket.util.convert.converter.BooleanConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BooleanConverter_ESTest extends BooleanConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BooleanConverter booleanConverter0 = new BooleanConverter();
      Class<Boolean> class0 = booleanConverter0.getTargetType();
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IConverter<Boolean> iConverter0 = BooleanConverter.INSTANCE;
      Locale locale0 = Locale.KOREAN;
      Boolean boolean0 = iConverter0.convertToObject("", locale0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BooleanConverter booleanConverter0 = new BooleanConverter();
      Locale locale0 = Locale.UK;
      // Undeclared exception!
      try { 
        booleanConverter0.convertToObject("org.apache.wicket.util.convert.converter.BooleanConverter", locale0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot convert 'org.apache.wicket.util.convert.converter.BooleanConverter' to Boolean
         //
         verifyException("org.apache.wicket.util.convert.converter.AbstractConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BooleanConverter booleanConverter0 = new BooleanConverter();
      FormatStyle formatStyle0 = FormatStyle.LONG;
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.ofLocalizedDateTime(formatStyle0);
      Locale locale0 = dateTimeFormatter0.getLocale();
      Boolean boolean0 = booleanConverter0.convertToObject("1", locale0);
      assertTrue(boolean0);
  }
}
