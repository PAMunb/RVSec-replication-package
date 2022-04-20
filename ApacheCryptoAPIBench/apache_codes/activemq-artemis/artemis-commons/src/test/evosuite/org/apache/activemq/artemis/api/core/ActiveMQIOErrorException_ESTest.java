/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 20 11:28:35 GMT 2022
 */

package org.apache.activemq.artemis.api.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.activemq.artemis.api.core.ActiveMQIOErrorException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ActiveMQIOErrorException_ESTest extends ActiveMQIOErrorException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ActiveMQIOErrorException activeMQIOErrorException0 = new ActiveMQIOErrorException("NATIVE_ERROR_CANT_RELEASE_AIO");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ActiveMQIOErrorException activeMQIOErrorException0 = new ActiveMQIOErrorException();
      ActiveMQIOErrorException activeMQIOErrorException1 = new ActiveMQIOErrorException((String) null, activeMQIOErrorException0);
      assertFalse(activeMQIOErrorException1.equals((Object)activeMQIOErrorException0));
  }
}
