/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:11:31 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.shared.kerberos.codec.krbCredInfo.actions.StoreStartTime;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractReadKerberosTime_ESTest extends AbstractReadKerberosTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreStartTime storeStartTime0 = new StoreStartTime();
      assertEquals("KrbCredInfo starttime", storeStartTime0.toString());
  }
}
