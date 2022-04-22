/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:20:14 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.encryptedData.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.encryptedData.EncryptedDataContainer;
import org.apache.directory.shared.kerberos.codec.encryptedData.actions.StoreEType;
import org.apache.directory.shared.kerberos.components.EncryptedData;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreEType_ESTest extends StoreEType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreEType storeEType0 = new StoreEType();
      // Undeclared exception!
      try { 
        storeEType0.setIntegerValue(1830, (EncryptedDataContainer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.encryptedData.actions.StoreEType", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreEType storeEType0 = new StoreEType();
      EncryptedData encryptedData0 = mock(EncryptedData.class, new ViolatedAssumptionAnswer());
      EncryptedDataContainer encryptedDataContainer0 = mock(EncryptedDataContainer.class, new ViolatedAssumptionAnswer());
      doReturn(encryptedData0).when(encryptedDataContainer0).getEncryptedData();
      storeEType0.setIntegerValue(1788, encryptedDataContainer0);
      assertEquals("EncryptedPart Etype", storeEType0.toString());
  }
}
