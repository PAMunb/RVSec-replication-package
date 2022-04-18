/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 13:51:56 GMT 2022
 */

package org.apache.tika.parser.external;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.parser.external.CompositeExternalParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CompositeExternalParser_ESTest extends CompositeExternalParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MediaTypeRegistry mediaTypeRegistry0 = new MediaTypeRegistry();
      CompositeExternalParser compositeExternalParser0 = new CompositeExternalParser(mediaTypeRegistry0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CompositeExternalParser compositeExternalParser0 = new CompositeExternalParser();
  }
}
