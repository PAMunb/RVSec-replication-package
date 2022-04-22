/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:21:24 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.padata.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.padata.PaDataContainer;
import org.apache.directory.shared.kerberos.codec.padata.actions.PaDataInit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PaDataInit_ESTest extends PaDataInit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PaDataInit paDataInit0 = new PaDataInit();
      // Undeclared exception!
      try { 
        paDataInit0.action((PaDataContainer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.padata.actions.PaDataInit", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PaDataInit paDataInit0 = new PaDataInit();
      PaDataContainer paDataContainer0 = mock(PaDataContainer.class, new ViolatedAssumptionAnswer());
      paDataInit0.action(paDataContainer0);
      assertEquals("Creates a PaData instance", paDataInit0.toString());
  }
}
