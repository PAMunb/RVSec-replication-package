/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:32:41 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.krbSafe.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.shared.kerberos.codec.krbSafe.actions.CheckMsgType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CheckMsgType_ESTest extends CheckMsgType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CheckMsgType checkMsgType0 = new CheckMsgType();
      assertEquals("KRB-SAFE msg-type", checkMsgType0.toString());
  }
}
