/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:19:33 GMT 2022
 */

package org.apache.directory.shared.kerberos.messages;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import org.apache.directory.shared.kerberos.messages.AsReq;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AsReq_ESTest extends AsReq_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AsReq asReq0 = new AsReq();
      // Undeclared exception!
      try { 
        asReq0.computeLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.KdcReq", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AsReq asReq0 = new AsReq();
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      doReturn((ByteBuffer) null, (ByteBuffer) null, (ByteBuffer) null, (ByteBuffer) null, (ByteBuffer) null).when(byteBuffer0).put(any(byte.class));
      doReturn((ByteBuffer) null, (ByteBuffer) null, (ByteBuffer) null, (ByteBuffer) null, (ByteBuffer) null).when(byteBuffer0).put(any(byte[].class) , anyInt() , anyInt());
      // Undeclared exception!
      try { 
        asReq0.encode(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.KdcReq", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AsReq asReq0 = new AsReq();
      // Undeclared exception!
      try { 
        asReq0.encode((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.KdcReq", e);
      }
  }
}
