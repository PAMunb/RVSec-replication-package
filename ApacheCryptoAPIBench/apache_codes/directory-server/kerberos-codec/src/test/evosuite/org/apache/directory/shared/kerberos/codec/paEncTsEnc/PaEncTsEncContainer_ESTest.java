/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:22:56 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.paEncTsEnc;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.shared.kerberos.codec.paEncTsEnc.PaEncTsEncContainer;
import org.apache.directory.shared.kerberos.components.PaEncTsEnc;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PaEncTsEncContainer_ESTest extends PaEncTsEncContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PaEncTsEncContainer paEncTsEncContainer0 = new PaEncTsEncContainer();
      paEncTsEncContainer0.setPaEncTsEnc((PaEncTsEnc) null);
      PaEncTsEnc paEncTsEnc0 = paEncTsEncContainer0.getPaEncTsEnc();
      assertNull(paEncTsEnc0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PaEncTsEncContainer paEncTsEncContainer0 = new PaEncTsEncContainer();
      PaEncTsEnc paEncTsEnc0 = paEncTsEncContainer0.getPaEncTsEnc();
      paEncTsEncContainer0.setPaEncTsEnc(paEncTsEnc0);
      assertEquals(0, paEncTsEncContainer0.getDecodedBytes());
  }
}
