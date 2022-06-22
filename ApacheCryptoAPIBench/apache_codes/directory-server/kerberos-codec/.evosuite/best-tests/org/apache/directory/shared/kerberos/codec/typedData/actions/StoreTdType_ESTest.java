/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:41:20 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.typedData.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.codec.typedData.TypedDataContainer;
import org.apache.directory.shared.kerberos.codec.typedData.actions.StoreTdType;
import org.apache.directory.shared.kerberos.components.TypedData;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoreTdType_ESTest extends StoreTdType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StoreTdType storeTdType0 = new StoreTdType();
      TypedDataContainer typedDataContainer0 = mock(TypedDataContainer.class, new ViolatedAssumptionAnswer());
      doReturn((TypedData) null).when(typedDataContainer0).getTypedData();
      // Undeclared exception!
      try { 
        storeTdType0.setIntegerValue(4488, typedDataContainer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.codec.typedData.actions.StoreTdType", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoreTdType storeTdType0 = new StoreTdType();
      TypedData typedData0 = mock(TypedData.class, new ViolatedAssumptionAnswer());
      TypedDataContainer typedDataContainer0 = mock(TypedDataContainer.class, new ViolatedAssumptionAnswer());
      doReturn(typedData0).when(typedDataContainer0).getTypedData();
      storeTdType0.setIntegerValue((-105), typedDataContainer0);
      assertEquals("TypedData data-type", storeTdType0.toString());
  }
}