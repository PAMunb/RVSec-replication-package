/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 21:05:16 GMT 2022
 */

package org.apache.manifoldcf.core.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.manifoldcf.core.interfaces.TimeMarker;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TimeMarker_ESTest extends TimeMarker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeMarker timeMarker0 = new TimeMarker(5006L);
      long long0 = timeMarker0.longValue();
      assertEquals(5006L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TimeMarker timeMarker0 = new TimeMarker(0L);
      timeMarker0.timeValue = 0L;
      timeMarker0.timeValue = (-2639L);
      long long0 = timeMarker0.longValue();
      assertEquals((-2639L), long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimeMarker timeMarker0 = new TimeMarker(0L);
      long long0 = timeMarker0.longValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TimeMarker timeMarker0 = new TimeMarker(0L);
      String string0 = timeMarker0.toString();
      assertEquals("0", string0);
  }
}