/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:18:17 GMT 2022
 */

package org.apache.wicket.util.convert.converter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Clock;
import java.time.DateTimeException;
import java.time.Month;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import org.apache.wicket.util.convert.converter.ZonedDateTimeConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ZonedDateTimeConverter_ESTest extends ZonedDateTimeConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ZonedDateTimeConverter zonedDateTimeConverter0 = new ZonedDateTimeConverter();
      Month month0 = Month.SEPTEMBER;
      // Undeclared exception!
      try { 
        zonedDateTimeConverter0.createTemporal(month0);
        fail("Expecting exception: DateTimeException");
      
      } catch(DateTimeException e) {
         //
         // Unable to obtain ZonedDateTime from TemporalAccessor: SEPTEMBER of type java.time.Month
         //
         verifyException("java.time.ZonedDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ZonedDateTimeConverter zonedDateTimeConverter0 = new ZonedDateTimeConverter();
      // Undeclared exception!
      try { 
        zonedDateTimeConverter0.createTemporal((TemporalAccessor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.time.ZoneId", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ZonedDateTimeConverter zonedDateTimeConverter0 = new ZonedDateTimeConverter();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(1209);
      Clock clock0 = MockClock.tickMinutes(zoneOffset0);
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now(clock0);
      ZonedDateTime zonedDateTime1 = zonedDateTimeConverter0.createTemporal(zonedDateTime0);
      assertSame(zonedDateTime1, zonedDateTime0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ZonedDateTimeConverter zonedDateTimeConverter0 = new ZonedDateTimeConverter();
      DateTimeFormatter dateTimeFormatter0 = zonedDateTimeConverter0.getDateTimeFormatter();
      assertNotNull(dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ZonedDateTimeConverter zonedDateTimeConverter0 = new ZonedDateTimeConverter();
      Class<ZonedDateTime> class0 = zonedDateTimeConverter0.getTargetType();
      assertEquals(17, class0.getModifiers());
  }
}