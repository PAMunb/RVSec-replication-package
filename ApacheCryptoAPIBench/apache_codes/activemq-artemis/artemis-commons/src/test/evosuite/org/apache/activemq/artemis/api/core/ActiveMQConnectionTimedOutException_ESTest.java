/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 20 11:28:04 GMT 2022
 */

package org.apache.activemq.artemis.api.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.activemq.artemis.api.core.ActiveMQConnectionTimedOutException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ActiveMQConnectionTimedOutException_ESTest extends ActiveMQConnectionTimedOutException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ActiveMQConnectionTimedOutException activeMQConnectionTimedOutException0 = new ActiveMQConnectionTimedOutException((String) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ActiveMQConnectionTimedOutException activeMQConnectionTimedOutException0 = new ActiveMQConnectionTimedOutException();
  }
}
