/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:29:09 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.asRep;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.ByteBuffer;
import org.apache.directory.shared.kerberos.codec.asRep.AsRepContainer;
import org.apache.directory.shared.kerberos.messages.AsRep;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AsRepContainer_ESTest extends AsRepContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AsRepContainer asRepContainer0 = new AsRepContainer((ByteBuffer) null);
      asRepContainer0.setAsRep((AsRep) null);
      assertEquals(0, asRepContainer0.getDecodedBytes());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AsRepContainer asRepContainer0 = new AsRepContainer((ByteBuffer) null);
      AsRep asRep0 = asRepContainer0.getAsRep();
      assertNull(asRep0);
  }
}
