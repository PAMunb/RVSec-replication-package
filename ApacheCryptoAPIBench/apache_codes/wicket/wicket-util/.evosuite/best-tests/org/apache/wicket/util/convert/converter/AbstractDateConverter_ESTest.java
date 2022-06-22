/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:08:02 GMT 2022
 */

package org.apache.wicket.util.convert.converter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.wicket.util.convert.converter.DateConverter;
import org.apache.wicket.util.convert.converter.SqlTimestampConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractDateConverter_ESTest extends AbstractDateConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SqlTimestampConverter sqlTimestampConverter0 = new SqlTimestampConverter((-1625));
      Timestamp timestamp0 = sqlTimestampConverter0.createDateLike((-1625));
      Locale locale0 = Locale.ITALIAN;
      // Undeclared exception!
      try { 
        sqlTimestampConverter0.convertToString(timestamp0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style -1625
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SqlTimestampConverter sqlTimestampConverter0 = new SqlTimestampConverter(3132);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      // Undeclared exception!
      try { 
        sqlTimestampConverter0.convertToObject("&1ci}FYr_}b0R}Oq", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal date style 3132
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateConverter dateConverter0 = new DateConverter();
      Locale locale0 = Locale.GERMANY;
      SimpleDateFormat simpleDateFormat0 = (SimpleDateFormat)dateConverter0.getDateFormat(locale0);
      assertEquals("tt.MM.uu", simpleDateFormat0.toLocalizedPattern());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateConverter dateConverter0 = new DateConverter();
      SimpleDateFormat simpleDateFormat0 = (SimpleDateFormat)dateConverter0.getDateFormat((Locale) null);
      assertEquals("M/d/yy", simpleDateFormat0.toLocalizedPattern());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateConverter dateConverter0 = new DateConverter();
      MockDate mockDate0 = new MockDate();
      String string0 = dateConverter0.convertToString((Date) mockDate0, (Locale) null);
      assertEquals("2/14/14", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateConverter dateConverter0 = new DateConverter();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      String string0 = dateConverter0.convertToString((Date) null, locale0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      DateConverter dateConverter0 = new DateConverter();
      // Undeclared exception!
      try { 
        dateConverter0.convertToObject(")htI%|f", locale0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot parse ')htI%|f' using format java.text.SimpleDateFormat@927943a0
         //
         verifyException("org.apache.wicket.util.convert.converter.AbstractConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateConverter dateConverter0 = new DateConverter();
      Locale locale0 = Locale.KOREAN;
      Date date0 = dateConverter0.convertToObject("", locale0);
      assertNull(date0);
  }
}