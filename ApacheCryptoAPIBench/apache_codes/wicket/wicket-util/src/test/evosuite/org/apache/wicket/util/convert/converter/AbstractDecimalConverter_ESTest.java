/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:15:48 GMT 2022
 */

package org.apache.wicket.util.convert.converter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DecimalFormat;
import java.util.Locale;
import org.apache.wicket.util.convert.converter.BigDecimalConverter;
import org.apache.wicket.util.convert.converter.FloatConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractDecimalConverter_ESTest extends AbstractDecimalConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FloatConverter floatConverter0 = new FloatConverter();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DecimalFormat decimalFormat0 = (DecimalFormat)floatConverter0.newNumberFormat(locale0);
      assertFalse(decimalFormat0.isDecimalSeparatorAlwaysShown());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BigDecimalConverter bigDecimalConverter0 = new BigDecimalConverter();
      // Undeclared exception!
      try { 
        bigDecimalConverter0.newNumberFormat((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}