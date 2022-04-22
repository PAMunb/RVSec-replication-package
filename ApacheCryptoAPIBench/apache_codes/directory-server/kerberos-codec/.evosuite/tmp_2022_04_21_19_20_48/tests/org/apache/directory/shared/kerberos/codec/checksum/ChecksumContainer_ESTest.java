/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:29:24 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.checksum;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.shared.kerberos.codec.checksum.ChecksumContainer;
import org.apache.directory.shared.kerberos.components.Checksum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ChecksumContainer_ESTest extends ChecksumContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChecksumContainer checksumContainer0 = new ChecksumContainer();
      checksumContainer0.setChecksum((Checksum) null);
      assertFalse(checksumContainer0.isGrammarEndAllowed());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ChecksumContainer checksumContainer0 = new ChecksumContainer();
      Checksum checksum0 = checksumContainer0.getChecksum();
      assertNull(checksum0);
  }
}
