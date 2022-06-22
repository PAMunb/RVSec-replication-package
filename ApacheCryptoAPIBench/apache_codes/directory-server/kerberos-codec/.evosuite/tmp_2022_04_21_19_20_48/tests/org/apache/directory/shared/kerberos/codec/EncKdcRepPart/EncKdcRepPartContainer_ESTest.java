/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:33:35 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.EncKdcRepPart;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.ByteBuffer;
import org.apache.directory.shared.kerberos.codec.EncKdcRepPart.EncKdcRepPartContainer;
import org.apache.directory.shared.kerberos.components.EncKdcRepPart;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EncKdcRepPartContainer_ESTest extends EncKdcRepPartContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EncKdcRepPartContainer encKdcRepPartContainer0 = new EncKdcRepPartContainer((ByteBuffer) null);
      encKdcRepPartContainer0.setEncKdcRepPart((EncKdcRepPart) null);
      assertEquals(0, encKdcRepPartContainer0.getDecodedBytes());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EncKdcRepPartContainer encKdcRepPartContainer0 = new EncKdcRepPartContainer((ByteBuffer) null);
      EncKdcRepPart encKdcRepPart0 = encKdcRepPartContainer0.getEncKdcRepPart();
      assertNull(encKdcRepPart0);
  }
}