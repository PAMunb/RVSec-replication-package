/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:45:33 GMT 2022
 */

package org.apache.tika.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.tika.exception.AccessPermissionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AccessPermissionException_ESTest extends AccessPermissionException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AccessPermissionException accessPermissionException0 = new AccessPermissionException("");
      AccessPermissionException accessPermissionException1 = new AccessPermissionException((String) null, accessPermissionException0);
      assertFalse(accessPermissionException1.equals((Object)accessPermissionException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AccessPermissionException accessPermissionException0 = new AccessPermissionException("");
      AccessPermissionException accessPermissionException1 = new AccessPermissionException(accessPermissionException0);
      assertFalse(accessPermissionException1.equals((Object)accessPermissionException0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AccessPermissionException accessPermissionException0 = new AccessPermissionException();
  }
}