/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 00:45:29 GMT 2022
 */

package org.apache.spark.status.api.v1;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.spark.status.api.v1.ForbiddenException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ForbiddenException_ESTest extends ForbiddenException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ForbiddenException forbiddenException0 = new ForbiddenException("");
      assertEquals("HTTP 403 Forbidden", forbiddenException0.getMessage());
  }
}