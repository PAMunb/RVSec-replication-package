/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:33:04 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.paEncTsEnc.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.paEncTsEnc.PaEncTsEncContainer;
import org.apache.directory.shared.kerberos.codec.paEncTsEnc.actions.StorePaUsec;
import org.apache.directory.shared.kerberos.components.PaEncTsEnc;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StorePaUsec_ESTest extends StorePaUsec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StorePaUsec storePaUsec0 = new StorePaUsec();
      // Undeclared exception!
      try { 
        storePaUsec0.setIntegerValue(999999, (PaEncTsEncContainer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.paEncTsEnc.actions.StorePaUsec", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StorePaUsec storePaUsec0 = new StorePaUsec();
      PaEncTsEnc paEncTsEnc0 = mock(PaEncTsEnc.class, new ViolatedAssumptionAnswer());
      PaEncTsEncContainer paEncTsEncContainer0 = mock(PaEncTsEncContainer.class, new ViolatedAssumptionAnswer());
      doReturn(paEncTsEnc0).when(paEncTsEncContainer0).getPaEncTsEnc();
      storePaUsec0.setIntegerValue(0, paEncTsEncContainer0);
      assertEquals("EncApRepPart pausec", storePaUsec0.toString());
  }
}
