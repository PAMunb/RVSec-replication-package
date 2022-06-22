/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:36:10 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.krbSafe;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.nio.ByteBuffer;
import org.apache.directory.shared.kerberos.codec.krbSafe.KrbSafeContainer;
import org.apache.directory.shared.kerberos.messages.KrbSafe;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class KrbSafeContainer_ESTest extends KrbSafeContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      KrbSafeContainer krbSafeContainer0 = new KrbSafeContainer(byteBuffer0);
      KrbSafe krbSafe0 = krbSafeContainer0.getKrbSafe();
      assertNull(krbSafe0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      KrbSafeContainer krbSafeContainer0 = new KrbSafeContainer(byteBuffer0);
      krbSafeContainer0.setKrbSafe((KrbSafe) null);
      assertFalse(krbSafeContainer0.isGathering());
  }
}