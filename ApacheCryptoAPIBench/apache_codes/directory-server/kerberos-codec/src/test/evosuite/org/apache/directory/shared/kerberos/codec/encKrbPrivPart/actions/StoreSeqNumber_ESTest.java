/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:21:19 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.encKrbPrivPart.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.encKrbPrivPart.EncKrbPrivPartContainer;
import org.apache.directory.shared.kerberos.codec.encKrbPrivPart.actions.StoreSeqNumber;
import org.apache.directory.shared.kerberos.components.EncKrbPrivPart;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreSeqNumber_ESTest extends StoreSeqNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreSeqNumber storeSeqNumber0 = new StoreSeqNumber();
      EncKrbPrivPartContainer encKrbPrivPartContainer0 = mock(EncKrbPrivPartContainer.class, new ViolatedAssumptionAnswer());
      doReturn((EncKrbPrivPart) null).when(encKrbPrivPartContainer0).getEncKrbPrivPart();
      // Undeclared exception!
      try { 
        storeSeqNumber0.setIntegerValue((-5043), encKrbPrivPartContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.encKrbPrivPart.actions.StoreSeqNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreSeqNumber storeSeqNumber0 = new StoreSeqNumber();
      EncKrbPrivPart encKrbPrivPart0 = mock(EncKrbPrivPart.class, new ViolatedAssumptionAnswer());
      EncKrbPrivPartContainer encKrbPrivPartContainer0 = mock(EncKrbPrivPartContainer.class, new ViolatedAssumptionAnswer());
      doReturn(encKrbPrivPart0).when(encKrbPrivPartContainer0).getEncKrbPrivPart();
      storeSeqNumber0.setIntegerValue((-677), encKrbPrivPartContainer0);
      assertEquals("EncKrbPrivPart seq-number", storeSeqNumber0.toString());
  }
}