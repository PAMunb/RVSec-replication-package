/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:05:06 GMT 2022
 */

package org.apache.activemq.artemis.api.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.activemq.artemis.api.core.RoutingType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RoutingType_ESTest extends RoutingType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RoutingType[] routingTypeArray0 = RoutingType.values();
      assertEquals(2, routingTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RoutingType routingType0 = RoutingType.valueOf("MULTICAST");
      assertEquals(RoutingType.MULTICAST, routingType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RoutingType.getType((byte) (-1));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RoutingType routingType0 = RoutingType.getType((byte)1);
      assertEquals(RoutingType.ANYCAST, routingType0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RoutingType routingType0 = RoutingType.getType((byte)0);
      assertEquals(RoutingType.MULTICAST, routingType0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RoutingType routingType0 = RoutingType.ANYCAST;
      byte byte0 = routingType0.getType();
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RoutingType routingType0 = RoutingType.MULTICAST;
      byte byte0 = routingType0.getType();
      assertEquals((byte)0, byte0);
  }
}
