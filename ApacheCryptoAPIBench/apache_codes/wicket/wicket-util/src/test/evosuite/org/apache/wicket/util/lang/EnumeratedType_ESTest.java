/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:08:01 GMT 2022
 */

package org.apache.wicket.util.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.wicket.util.lang.EnumeratedType;
import org.apache.wicket.util.time.TimeOfDay;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EnumeratedType_ESTest extends EnumeratedType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        EnumeratedType.getValues((Class<? extends EnumeratedType>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.lang.EnumeratedType", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<TimeOfDay.Meridian> class0 = TimeOfDay.Meridian.class;
      List<EnumeratedType> list0 = EnumeratedType.getValues(class0);
      assertEquals(18, list0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimeOfDay.Meridian timeOfDay_Meridian0 = TimeOfDay.PM;
      Object object0 = timeOfDay_Meridian0.readResolve();
      assertSame(object0, timeOfDay_Meridian0);
  }
}
