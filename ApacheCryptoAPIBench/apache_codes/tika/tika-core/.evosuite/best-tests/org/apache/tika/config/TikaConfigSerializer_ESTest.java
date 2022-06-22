/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:20:33 GMT 2022
 */

package org.apache.tika.config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Writer;
import java.nio.charset.Charset;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.config.TikaConfigSerializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TikaConfigSerializer_ESTest extends TikaConfigSerializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TikaConfigSerializer tikaConfigSerializer0 = new TikaConfigSerializer();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      TikaConfigSerializer.Mode tikaConfigSerializer_Mode0 = TikaConfigSerializer.Mode.STATIC;
      try { 
        TikaConfigSerializer.serialize((TikaConfig) null, tikaConfigSerializer_Mode0, (Writer) null, charset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.config.TikaConfigSerializer", e);
      }
  }
}