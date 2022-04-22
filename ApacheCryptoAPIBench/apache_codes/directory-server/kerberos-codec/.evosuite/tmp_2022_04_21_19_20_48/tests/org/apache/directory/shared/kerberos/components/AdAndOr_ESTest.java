/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:15:18 GMT 2022
 */

package org.apache.directory.shared.kerberos.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import org.apache.directory.shared.kerberos.components.AdAndOr;
import org.apache.directory.shared.kerberos.components.AuthorizationData;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AdAndOr_ESTest extends AdAndOr_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AdAndOr adAndOr0 = new AdAndOr();
      adAndOr0.setConditionCount(3734);
      int int0 = adAndOr0.getConditionCount();
      assertEquals(3734, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AdAndOr adAndOr0 = new AdAndOr();
      adAndOr0.setConditionCount((-1329));
      int int0 = adAndOr0.getConditionCount();
      assertEquals((-1329), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AdAndOr adAndOr0 = new AdAndOr();
      String string0 = adAndOr0.toString("");
      assertEquals("AD-AND-OR : {\n    condition-count: 0\n    elements:null\n}\n", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AdAndOr adAndOr0 = new AdAndOr();
      try { 
        adAndOr0.encode((ByteBuffer) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_148 Cannot put a PDU in a null buffer !
         //
         verifyException("org.apache.directory.shared.kerberos.components.AdAndOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ByteBuffer byteBuffer0 = mock(ByteBuffer.class, new ViolatedAssumptionAnswer());
      doReturn((ByteBuffer) null, (ByteBuffer) null, (ByteBuffer) null, (ByteBuffer) null, (ByteBuffer) null).when(byteBuffer0).put(any(byte.class));
      doReturn((ByteBuffer) null, (ByteBuffer) null).when(byteBuffer0).put(any(byte[].class) , anyInt() , anyInt());
      AdAndOr adAndOr0 = new AdAndOr();
      // Undeclared exception!
      try { 
        adAndOr0.encode(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.AdAndOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AdAndOr adAndOr0 = new AdAndOr();
      AuthorizationData authorizationData0 = adAndOr0.getElements();
      assertNull(authorizationData0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AdAndOr adAndOr0 = new AdAndOr();
      int int0 = adAndOr0.getConditionCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AdAndOr adAndOr0 = new AdAndOr();
      // Undeclared exception!
      try { 
        adAndOr0.computeLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.AdAndOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AdAndOr adAndOr0 = new AdAndOr();
      adAndOr0.setElements((AuthorizationData) null);
      assertEquals(0, adAndOr0.getConditionCount());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      AdAndOr adAndOr0 = new AdAndOr();
      String string0 = adAndOr0.toString();
      assertEquals("AD-AND-OR : {\n    condition-count: 0\n    elements:null\n}\n", string0);
  }
}
