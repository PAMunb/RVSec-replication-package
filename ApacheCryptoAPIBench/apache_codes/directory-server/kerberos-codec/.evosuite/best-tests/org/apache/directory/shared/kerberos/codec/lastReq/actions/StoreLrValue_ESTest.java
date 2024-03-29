/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:27:20 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.lastReq.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.KerberosTime;
import org.apache.directory.shared.kerberos.codec.lastReq.LastReqContainer;
import org.apache.directory.shared.kerberos.codec.lastReq.actions.StoreLrValue;
import org.apache.directory.shared.kerberos.components.LastReq;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreLrValue_ESTest extends StoreLrValue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreLrValue storeLrValue0 = new StoreLrValue();
      KerberosTime kerberosTime0 = mock(KerberosTime.class, new ViolatedAssumptionAnswer());
      LastReqContainer lastReqContainer0 = mock(LastReqContainer.class, new ViolatedAssumptionAnswer());
      doReturn((LastReq) null).when(lastReqContainer0).getLastReq();
      // Undeclared exception!
      try { 
        storeLrValue0.setKerberosTime(kerberosTime0, lastReqContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.lastReq.actions.StoreLrValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreLrValue storeLrValue0 = new StoreLrValue();
      KerberosTime kerberosTime0 = mock(KerberosTime.class, new ViolatedAssumptionAnswer());
      LastReq lastReq0 = mock(LastReq.class, new ViolatedAssumptionAnswer());
      LastReqContainer lastReqContainer0 = mock(LastReqContainer.class, new ViolatedAssumptionAnswer());
      doReturn(lastReq0).when(lastReqContainer0).getLastReq();
      storeLrValue0.setKerberosTime(kerberosTime0, lastReqContainer0);
      assertEquals("LastReq lr-value", storeLrValue0.toString());
  }
}
