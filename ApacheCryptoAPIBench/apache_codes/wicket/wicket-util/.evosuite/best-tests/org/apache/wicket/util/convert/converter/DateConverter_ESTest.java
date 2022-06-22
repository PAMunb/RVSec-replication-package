/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:17:31 GMT 2022
 */

package org.apache.wicket.util.convert.converter;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import org.apache.wicket.util.convert.converter.DateConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DateConverter_ESTest extends DateConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateConverter dateConverter0 = new DateConverter();
      Date date0 = dateConverter0.createDateLike(1L);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateConverter dateConverter0 = new DateConverter();
      Class<Date> class0 = dateConverter0.getTargetType();
      assertEquals(1, class0.getModifiers());
  }
}