/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 15:54:43 GMT 2022
 */

package org.apache.tika.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import org.apache.tika.utils.DateUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DateUtils_ESTest extends DateUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      Date date0 = dateUtils0.tryToParse("M?`58<X03`F;R:2]");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      Date date0 = dateUtils0.tryToParse("t21,qL^D?eQrIwm{}!3");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      Date date0 = dateUtils0.tryToParse("0000-01-00T00:00:00Z");
      String string0 = DateUtils.formatDate(date0);
      assertEquals("2014-02-14T20:21:21Z", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        dateUtils0.tryToParse("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        dateUtils0.tryToParse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.formatDateUnknownTimezone((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.formatDate((Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.utils.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      Date date0 = dateUtils0.tryToParse("GMT-12:00");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      Date date0 = dateUtils0.tryToParse("GMT$12:00");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.formatDate((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      Date date0 = dateUtils0.tryToParse("0000-01-00T00:00:00Z");
      assertNotNull(date0);
      
      String string0 = DateUtils.formatDateUnknownTimezone(date0);
      assertEquals("2014-02-14T20:21:21", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Calendar calendar0 = mock(Calendar.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(calendar0).get(anyInt());
      String string0 = DateUtils.formatDate(calendar0);
      assertEquals("0000-01-00T00:00:00Z", string0);
  }
}
