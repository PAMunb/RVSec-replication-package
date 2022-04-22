/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:31:36 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.padata;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.shared.kerberos.codec.padata.PaDataContainer;
import org.apache.directory.shared.kerberos.components.PaData;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PaDataContainer_ESTest extends PaDataContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PaDataContainer paDataContainer0 = new PaDataContainer();
      paDataContainer0.setPaData((PaData) null);
      assertFalse(paDataContainer0.isGathering());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PaDataContainer paDataContainer0 = new PaDataContainer();
      PaData paData0 = paDataContainer0.getPaData();
      assertNull(paData0);
  }
}
