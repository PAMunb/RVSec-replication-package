/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 20 11:30:02 GMT 2022
 */

package org.apache.activemq.artemis.api.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.UnpooledUnsafeDirectByteBuf;
import java.nio.ByteBuffer;
import org.apache.activemq.artemis.api.core.ActiveMQBuffer;
import org.apache.activemq.artemis.api.core.ActiveMQBuffers;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ActiveMQBuffers_ESTest extends ActiveMQBuffers_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ActiveMQBuffer activeMQBuffer0 = ActiveMQBuffers.wrappedBuffer(byteArray0);
      assertNotNull(activeMQBuffer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ActiveMQBuffer activeMQBuffer0 = ActiveMQBuffers.fixedBuffer(16384);
      assertNotNull(activeMQBuffer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ActiveMQBuffer activeMQBuffer0 = ActiveMQBuffers.dynamicBuffer(476);
      assertNotNull(activeMQBuffer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ActiveMQBuffer activeMQBuffer0 = ActiveMQBuffers.wrappedBuffer(byteBuffer0);
      assertNotNull(activeMQBuffer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PooledByteBufAllocator pooledByteBufAllocator0 = new PooledByteBufAllocator(true);
      UnpooledUnsafeDirectByteBuf unpooledUnsafeDirectByteBuf0 = new UnpooledUnsafeDirectByteBuf(pooledByteBufAllocator0, 0, 0);
      ActiveMQBuffer activeMQBuffer0 = ActiveMQBuffers.wrappedBuffer((ByteBuf) unpooledUnsafeDirectByteBuf0);
      assertNotNull(activeMQBuffer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ActiveMQBuffer activeMQBuffer0 = ActiveMQBuffers.dynamicBuffer(byteArray0);
      assertNotNull(activeMQBuffer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      ActiveMQBuffers.pooledBuffer(536870912);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        ActiveMQBuffers.pooledBuffer((-549));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // initialCapacity: -549 (expected: 0+)
         //
         verifyException("io.netty.buffer.AbstractByteBufAllocator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ActiveMQBuffers.fixedBuffer((-1609));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // initialCapacity: -1609 (expected: 0+)
         //
         verifyException("io.netty.buffer.AbstractByteBufAllocator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        ActiveMQBuffers.dynamicBuffer((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // initialCapacity: -1 (expected: 0+)
         //
         verifyException("io.netty.buffer.AbstractByteBufAllocator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      ActiveMQBuffers.dynamicBuffer(2147483596);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ActiveMQBuffer activeMQBuffer0 = ActiveMQBuffers.pooledBuffer(2514);
      assertNotNull(activeMQBuffer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        ActiveMQBuffers.wrappedBuffer((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.netty.buffer.Unpooled", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        ActiveMQBuffers.dynamicBuffer((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.api.core.ActiveMQBuffers", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      ActiveMQBuffers.fixedBuffer(Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        ActiveMQBuffers.wrappedBuffer((ByteBuf) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.api.core.ActiveMQBuffers", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        ActiveMQBuffers.wrappedBuffer((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.netty.buffer.Unpooled", e);
      }
  }
}
