/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:10:20 GMT 2022
 */

package org.apache.wicket.util.convert.converter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormat;
import java.text.Format;
import java.util.Locale;
import org.apache.wicket.util.convert.ConversionException;
import org.apache.wicket.util.convert.converter.CharacterConverter;
import org.apache.wicket.util.convert.converter.LocalDateTimeConverter;
import org.apache.wicket.util.convert.converter.LongConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractConverter_ESTest extends AbstractConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LongConverter longConverter0 = new LongConverter();
      Object object0 = new Object();
      Locale locale0 = new Locale("Hk]OPX?{+.u+W!,(8", "org.apache.wicket.util.convert.converter.LocalDateConverter", "f.j");
      ConversionException conversionException0 = longConverter0.newConversionException("=`SC|v]k{", object0, locale0);
      assertNull(conversionException0.getResourceKey());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CharacterConverter characterConverter0 = new CharacterConverter();
      Locale locale0 = Locale.FRENCH;
      DateFormat dateFormat0 = DateFormat.getDateInstance();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        characterConverter0.parse(dateFormat0, object0, locale0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot parse 'java.lang.Object@10d93ce' using format java.text.SimpleDateFormat@ce9bf0a5
         //
         verifyException("org.apache.wicket.util.convert.converter.AbstractConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      LocalDateTimeConverter localDateTimeConverter0 = new LocalDateTimeConverter();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        localDateTimeConverter0.parse((Format) null, object0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.convert.converter.AbstractConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CharacterConverter characterConverter0 = new CharacterConverter();
      Locale locale0 = Locale.ENGLISH;
      String string0 = characterConverter0.convertToString((Character) null, locale0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CharacterConverter characterConverter0 = new CharacterConverter();
      Locale locale0 = Locale.FRENCH;
      Character character0 = Character.valueOf(',');
      String string0 = characterConverter0.convertToString(character0, locale0);
      assertNotNull(string0);
  }
}