/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:24:09 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.apReq;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.ByteBuffer;
import org.apache.directory.shared.kerberos.codec.apReq.ApReqContainer;
import org.apache.directory.shared.kerberos.messages.ApReq;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ApReqContainer_ESTest extends ApReqContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ApReqContainer apReqContainer0 = new ApReqContainer((ByteBuffer) null);
      ApReq apReq0 = apReqContainer0.getApReq();
      assertNull(apReq0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ApReqContainer apReqContainer0 = new ApReqContainer((ByteBuffer) null);
      apReqContainer0.setApReq((ApReq) null);
      assertEquals(0, apReqContainer0.getDecodedBytes());
  }
}
