/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:26:15 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.krbError;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.ByteBuffer;
import org.apache.directory.api.asn1.ber.tlv.TLVStateEnum;
import org.apache.directory.shared.kerberos.codec.krbError.KrbErrorContainer;
import org.apache.directory.shared.kerberos.messages.KrbError;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class KrbErrorContainer_ESTest extends KrbErrorContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KrbErrorContainer krbErrorContainer0 = new KrbErrorContainer((ByteBuffer) null);
      KrbError krbError0 = krbErrorContainer0.getKrbError();
      assertNull(krbError0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KrbErrorContainer krbErrorContainer0 = new KrbErrorContainer((ByteBuffer) null);
      krbErrorContainer0.setKrbError((KrbError) null);
      assertEquals(TLVStateEnum.TAG_STATE_START, krbErrorContainer0.getState());
  }
}