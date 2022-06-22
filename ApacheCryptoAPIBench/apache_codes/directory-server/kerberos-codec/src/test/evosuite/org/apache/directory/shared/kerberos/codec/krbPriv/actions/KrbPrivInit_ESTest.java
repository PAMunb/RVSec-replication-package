/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:09:32 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.krbPriv.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import org.apache.directory.shared.kerberos.codec.krbPriv.KrbPrivContainer;
import org.apache.directory.shared.kerberos.codec.krbPriv.actions.KrbPrivInit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class KrbPrivInit_ESTest extends KrbPrivInit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KrbPrivInit krbPrivInit0 = new KrbPrivInit();
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      KrbPrivContainer krbPrivContainer0 = new KrbPrivContainer(byteBuffer0);
      // Undeclared exception!
      try { 
        krbPrivInit0.action(krbPrivContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.krbPriv.actions.KrbPrivInit", e);
      }
  }
}