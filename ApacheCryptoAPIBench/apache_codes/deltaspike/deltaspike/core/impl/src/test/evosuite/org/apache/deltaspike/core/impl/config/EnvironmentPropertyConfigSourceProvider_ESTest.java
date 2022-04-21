/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 17:12:51 GMT 2022
 */

package org.apache.deltaspike.core.impl.config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.deltaspike.core.impl.config.EnvironmentPropertyConfigSourceProvider;
import org.apache.deltaspike.core.spi.config.ConfigSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EnvironmentPropertyConfigSourceProvider_ESTest extends EnvironmentPropertyConfigSourceProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EnvironmentPropertyConfigSourceProvider environmentPropertyConfigSourceProvider0 = null;
      try {
        environmentPropertyConfigSourceProvider0 = new EnvironmentPropertyConfigSourceProvider("://", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // problem while loading DeltaSpike property files
         //
         verifyException("org.apache.deltaspike.core.impl.config.EnvironmentPropertyConfigSourceProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EnvironmentPropertyConfigSourceProvider environmentPropertyConfigSourceProvider0 = new EnvironmentPropertyConfigSourceProvider(")1", true);
      List<ConfigSource> list0 = environmentPropertyConfigSourceProvider0.getConfigSources();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EnvironmentPropertyConfigSourceProvider environmentPropertyConfigSourceProvider0 = null;
      try {
        environmentPropertyConfigSourceProvider0 = new EnvironmentPropertyConfigSourceProvider((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EnvironmentPropertyConfigSourceProvider environmentPropertyConfigSourceProvider0 = null;
      try {
        environmentPropertyConfigSourceProvider0 = new EnvironmentPropertyConfigSourceProvider("deltaspike_ordinal", false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // deltaspike_ordinal wasn't found.
         //
         verifyException("org.apache.deltaspike.core.impl.config.EnvironmentPropertyConfigSourceProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EnvironmentPropertyConfigSourceProvider environmentPropertyConfigSourceProvider0 = null;
      try {
        environmentPropertyConfigSourceProvider0 = new EnvironmentPropertyConfigSourceProvider("", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EnvironmentPropertyConfigSourceProvider environmentPropertyConfigSourceProvider0 = new EnvironmentPropertyConfigSourceProvider(".", true);
      List<ConfigSource> list0 = environmentPropertyConfigSourceProvider0.getConfigSources();
      assertFalse(list0.isEmpty());
  }
}
