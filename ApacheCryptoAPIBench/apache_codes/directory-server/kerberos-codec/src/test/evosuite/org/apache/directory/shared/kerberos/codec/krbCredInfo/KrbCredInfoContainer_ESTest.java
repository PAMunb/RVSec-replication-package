/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:40:19 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.krbCredInfo;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.shared.kerberos.codec.krbCredInfo.KrbCredInfoContainer;
import org.apache.directory.shared.kerberos.components.KrbCredInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class KrbCredInfoContainer_ESTest extends KrbCredInfoContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KrbCredInfoContainer krbCredInfoContainer0 = new KrbCredInfoContainer();
      KrbCredInfo krbCredInfo0 = krbCredInfoContainer0.getKrbCredInfo();
      assertNull(krbCredInfo0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KrbCredInfoContainer krbCredInfoContainer0 = new KrbCredInfoContainer();
      krbCredInfoContainer0.setKrbCredInfo((KrbCredInfo) null);
      assertEquals(0, krbCredInfoContainer0.getDecodedBytes());
  }
}
