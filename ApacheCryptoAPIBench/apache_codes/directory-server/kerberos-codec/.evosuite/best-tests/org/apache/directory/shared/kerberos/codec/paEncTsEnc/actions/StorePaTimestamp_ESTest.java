/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:23:39 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.paEncTsEnc.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.KerberosTime;
import org.apache.directory.shared.kerberos.codec.paEncTsEnc.PaEncTsEncContainer;
import org.apache.directory.shared.kerberos.codec.paEncTsEnc.actions.StorePaTimestamp;
import org.apache.directory.shared.kerberos.components.PaEncTsEnc;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StorePaTimestamp_ESTest extends StorePaTimestamp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StorePaTimestamp storePaTimestamp0 = new StorePaTimestamp();
      KerberosTime kerberosTime0 = mock(KerberosTime.class, new ViolatedAssumptionAnswer());
      PaEncTsEncContainer paEncTsEncContainer0 = mock(PaEncTsEncContainer.class, new ViolatedAssumptionAnswer());
      doReturn((PaEncTsEnc) null).when(paEncTsEncContainer0).getPaEncTsEnc();
      // Undeclared exception!
      try { 
        storePaTimestamp0.setKerberosTime(kerberosTime0, paEncTsEncContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.paEncTsEnc.actions.StorePaTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StorePaTimestamp storePaTimestamp0 = new StorePaTimestamp();
      KerberosTime kerberosTime0 = mock(KerberosTime.class, new ViolatedAssumptionAnswer());
      PaEncTsEnc paEncTsEnc0 = mock(PaEncTsEnc.class, new ViolatedAssumptionAnswer());
      PaEncTsEncContainer paEncTsEncContainer0 = mock(PaEncTsEncContainer.class, new ViolatedAssumptionAnswer());
      doReturn(paEncTsEnc0).when(paEncTsEncContainer0).getPaEncTsEnc();
      storePaTimestamp0.setKerberosTime(kerberosTime0, paEncTsEncContainer0);
      assertEquals("Stores the CTime", storePaTimestamp0.toString());
  }
}
