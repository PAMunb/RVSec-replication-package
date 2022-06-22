/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:51:01 GMT 2022
 */

package org.apache.manifoldcf.core.common;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.apache.manifoldcf.core.common.DateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DateParser_ESTest extends DateParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = DateParser.isNumeral("1970-01-01T0000:02.965ZZZZ", 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Date date0 = DateParser.parseISO8601Date("GT(+01:00");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Date date0 = DateParser.parseISO8601Date("T");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Date date0 = DateParser.parseISO8601Date("1970-01-01T00:00:02.965Z");
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      String string0 = DateParser.formatISO8601Date(mockDate0);
      assertEquals("2014-02-14T20:21:21.320Z", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateParser.isNumeral("<'U=1vrM", 1959);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateParser.isNumeral((String) null, 57);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.common.DateParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Date date0 = DateParser.parseChinaDate(" ~/K;]R/c 7}");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Date date0 = DateParser.parseChinaDate("]GK|{`#h>/:G");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Date date0 = DateParser.parseChinaDate("8/q^# +]zw@ON/6vel");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Date date0 = DateParser.parseChinaDate((String) null);
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Date date0 = DateParser.parseChinaDate("1970-01-01T00:00:02.965ZZZZZ");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Date date0 = DateParser.parseRFC822Date("?;$5uj Aa 3");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Date date0 = DateParser.parseRFC822Date("System in*o:Fhost: '%s~( ip: '%s', As.namv: '%', os.0rch: 's',xo<.versiZn: '%s', jaa.version '%s'");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Date date0 = DateParser.parseRFC822Date("sfem]info: h&st '%s, i: '%s'` A'n(me: 'o', f6.0rchT '%s', os.vdmsion: '%s,kjava9vzrsion: '%s'");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Date date0 = DateParser.parseRFC822Date("System info: host: '%s', ip: '%s', As.name: '%s', os.0rch: '%s', os.version: '%s', java.version: '%s'");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Date date0 = DateParser.parseRFC822Date("Unable to coerce type to URI: ");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Date date0 = DateParser.parseRFC822Date("_(,HX-d Qqr_V8~");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Date date0 = DateParser.parseRFC822Date(",z!8S?PIB_;;.=G!");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Date date0 = DateParser.parseRFC822Date((String) null);
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Date date0 = DateParser.parseRFC822Date("Owner type for unenclosed %s");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = DateParser.isNumeral("1970-01-01T00:00:02.965ZZZZZ", 17);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = DateParser.isNumeral(".rB", 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = DateParser.isNumeral("C-=TH+7K$H:{v2", (-3339));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Date date0 = DateParser.parseISO8601Date("C-=TH+7K$H:{v2");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Date date0 = DateParser.parseISO8601Date("GMT+01:00");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Date date0 = DateParser.parseISO8601Date("@T-1<:00");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Date date0 = DateParser.parseISO8601Date("UT");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Date date0 = DateParser.parseISO8601Date("_(,HX-d Qqr_V8~");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Date date0 = DateParser.parseISO8601Date((String) null);
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateParser dateParser0 = new DateParser();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateParser.formatISO8601Date((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }
}