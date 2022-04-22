/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:16:34 GMT 2022
 */

package org.apache.wicket.util.convert.converter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.JapaneseEra;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import org.apache.wicket.util.convert.converter.LocalDateConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LocalDateConverter_ESTest extends LocalDateConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalDateConverter localDateConverter0 = new LocalDateConverter();
      JapaneseEra japaneseEra0 = JapaneseEra.SHOWA;
      // Undeclared exception!
      try { 
        localDateConverter0.createTemporal(japaneseEra0);
        fail("Expecting exception: DateTimeException");
      
      } catch(DateTimeException e) {
         //
         // Unable to obtain LocalDate from TemporalAccessor: Showa of type java.time.chrono.JapaneseEra
         //
         verifyException("java.time.LocalDate", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalDateConverter localDateConverter0 = new LocalDateConverter();
      // Undeclared exception!
      try { 
        localDateConverter0.createTemporal((TemporalAccessor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // temporal
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocalDateConverter localDateConverter0 = new LocalDateConverter();
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
      Chronology chronology0 = dateTimeFormatter0.getChronology();
      ChronoLocalDate chronoLocalDate0 = chronology0.dateEpochDay(293L);
      LocalDate localDate0 = localDateConverter0.createTemporal(chronoLocalDate0);
      assertSame(chronoLocalDate0, localDate0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LocalDateConverter localDateConverter0 = new LocalDateConverter();
      Class<LocalDate> class0 = localDateConverter0.getTargetType();
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LocalDateConverter localDateConverter0 = new LocalDateConverter();
      DateTimeFormatter dateTimeFormatter0 = localDateConverter0.getDateTimeFormatter();
      assertNotNull(dateTimeFormatter0);
  }
}
