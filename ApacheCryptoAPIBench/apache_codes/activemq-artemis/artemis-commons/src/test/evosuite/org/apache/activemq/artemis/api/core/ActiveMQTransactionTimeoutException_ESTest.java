/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 13:25:28 GMT 2022
 */

package org.apache.activemq.artemis.api.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.activemq.artemis.api.core.ActiveMQTransactionTimeoutException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ActiveMQTransactionTimeoutException_ESTest extends ActiveMQTransactionTimeoutException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ActiveMQTransactionTimeoutException activeMQTransactionTimeoutException0 = new ActiveMQTransactionTimeoutException("");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ActiveMQTransactionTimeoutException activeMQTransactionTimeoutException0 = new ActiveMQTransactionTimeoutException();
  }
}
