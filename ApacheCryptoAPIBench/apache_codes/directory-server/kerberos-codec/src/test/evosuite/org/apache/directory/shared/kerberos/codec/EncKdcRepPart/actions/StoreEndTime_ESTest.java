/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:22:17 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.EncKdcRepPart.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.KerberosTime;
import org.apache.directory.shared.kerberos.codec.EncKdcRepPart.EncKdcRepPartContainer;
import org.apache.directory.shared.kerberos.codec.EncKdcRepPart.actions.StoreEndTime;
import org.apache.directory.shared.kerberos.components.EncKdcRepPart;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreEndTime_ESTest extends StoreEndTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreEndTime storeEndTime0 = new StoreEndTime();
      // Undeclared exception!
      try { 
        storeEndTime0.setKerberosTime((KerberosTime) null, (EncKdcRepPartContainer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.EncKdcRepPart.actions.StoreEndTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreEndTime storeEndTime0 = new StoreEndTime();
      EncKdcRepPart encKdcRepPart0 = mock(EncKdcRepPart.class, new ViolatedAssumptionAnswer());
      EncKdcRepPartContainer encKdcRepPartContainer0 = mock(EncKdcRepPartContainer.class, new ViolatedAssumptionAnswer());
      doReturn(encKdcRepPart0).when(encKdcRepPartContainer0).getEncKdcRepPart();
      storeEndTime0.setKerberosTime((KerberosTime) null, encKdcRepPartContainer0);
      assertEquals("EncKdcRepPart end time", storeEndTime0.toString());
  }
}