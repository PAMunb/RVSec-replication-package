/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:42:28 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.hostAddress;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.shared.kerberos.codec.hostAddress.HostAddressContainer;
import org.apache.directory.shared.kerberos.components.HostAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HostAddressContainer_ESTest extends HostAddressContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HostAddressContainer hostAddressContainer0 = new HostAddressContainer();
      hostAddressContainer0.setHostAddress((HostAddress) null);
      assertEquals(Integer.MAX_VALUE, hostAddressContainer0.getMaxPDUSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HostAddressContainer hostAddressContainer0 = new HostAddressContainer();
      HostAddress hostAddress0 = hostAddressContainer0.getHostAddress();
      assertNull(hostAddress0);
  }
}
