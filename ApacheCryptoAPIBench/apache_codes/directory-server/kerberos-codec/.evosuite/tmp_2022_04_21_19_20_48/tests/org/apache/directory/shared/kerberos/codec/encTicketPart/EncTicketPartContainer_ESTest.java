/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:34:49 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.encTicketPart;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.ByteBuffer;
import org.apache.directory.shared.kerberos.codec.encTicketPart.EncTicketPartContainer;
import org.apache.directory.shared.kerberos.components.EncTicketPart;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EncTicketPartContainer_ESTest extends EncTicketPartContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EncTicketPartContainer encTicketPartContainer0 = new EncTicketPartContainer((ByteBuffer) null);
      encTicketPartContainer0.setEncTicketPart((EncTicketPart) null);
      EncTicketPart encTicketPart0 = encTicketPartContainer0.getEncTicketPart();
      assertNull(encTicketPart0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EncTicketPartContainer encTicketPartContainer0 = new EncTicketPartContainer((ByteBuffer) null);
      EncTicketPart encTicketPart0 = encTicketPartContainer0.getEncTicketPart();
      encTicketPartContainer0.setEncTicketPart(encTicketPart0);
      assertFalse(encTicketPartContainer0.isGathering());
  }
}