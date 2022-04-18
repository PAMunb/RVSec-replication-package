/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 13:34:41 GMT 2022
 */

package org.apache.tika.config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.nio.charset.Charset;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.config.TikaConfigSerializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TikaConfigSerializer_ESTest extends TikaConfigSerializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TikaConfigSerializer tikaConfigSerializer0 = new TikaConfigSerializer();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TikaConfigSerializer.Mode tikaConfigSerializer_Mode0 = TikaConfigSerializer.Mode.CURRENT;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      Charset charset0 = Charset.defaultCharset();
      try { 
        TikaConfigSerializer.serialize((TikaConfig) null, tikaConfigSerializer_Mode0, charArrayWriter0, charset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.config.TikaConfigSerializer", e);
      }
  }
}
