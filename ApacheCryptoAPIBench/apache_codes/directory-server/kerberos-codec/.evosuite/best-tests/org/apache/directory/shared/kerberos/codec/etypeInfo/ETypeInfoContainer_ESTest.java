/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:34:51 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.etypeInfo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.etypeInfo.ETypeInfoContainer;
import org.apache.directory.shared.kerberos.components.ETypeInfo;
import org.apache.directory.shared.kerberos.components.ETypeInfoEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ETypeInfoContainer_ESTest extends ETypeInfoContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ETypeInfoContainer eTypeInfoContainer0 = new ETypeInfoContainer();
      eTypeInfoContainer0.setETypeInfo((ETypeInfo) null);
      ETypeInfo eTypeInfo0 = eTypeInfoContainer0.getETypeInfo();
      assertNull(eTypeInfo0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ETypeInfoContainer eTypeInfoContainer0 = new ETypeInfoContainer();
      eTypeInfoContainer0.setETypeInfo((ETypeInfo) null);
      // Undeclared exception!
      try { 
        eTypeInfoContainer0.addEtypeInfoEntry((ETypeInfoEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.etypeInfo.ETypeInfoContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ETypeInfoContainer eTypeInfoContainer0 = new ETypeInfoContainer();
      ETypeInfoEntry eTypeInfoEntry0 = mock(ETypeInfoEntry.class, new ViolatedAssumptionAnswer());
      eTypeInfoContainer0.addEtypeInfoEntry(eTypeInfoEntry0);
      assertFalse(eTypeInfoContainer0.isGathering());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ETypeInfoContainer eTypeInfoContainer0 = new ETypeInfoContainer();
      ETypeInfo eTypeInfo0 = eTypeInfoContainer0.getETypeInfo();
      assertNotNull(eTypeInfo0);
  }
}
