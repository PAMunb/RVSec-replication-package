/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:54:52 GMT 2022
 */

package org.apache.directory.shared.kerberos.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import org.apache.directory.shared.kerberos.codec.types.PaDataType;
import org.apache.directory.shared.kerberos.components.PaData;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PaData_ESTest extends PaData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PaDataType paDataType0 = PaDataType.PA_ASF3_SALT;
      byte[] byteArray0 = new byte[6];
      PaData paData0 = new PaData(paDataType0, byteArray0);
      int int0 = paData0.computeLength();
      assertEquals(17, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PaDataType paDataType0 = PaDataType.SAM_RESPONSE;
      byte[] byteArray0 = new byte[2];
      PaData paData0 = new PaData(paDataType0, byteArray0);
      paData0.computeLength();
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      try { 
        paData0.encode(byteBuffer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_138 The PDU buffer size is too small !
         //
         verifyException("org.apache.directory.shared.kerberos.components.PaData", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PaData paData0 = new PaData();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      try { 
        paData0.encode(byteBuffer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_138 The PDU buffer size is too small !
         //
         verifyException("org.apache.directory.shared.kerberos.components.PaData", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PaData paData0 = new PaData();
      byte[] byteArray0 = paData0.getPaDataValue();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PaDataType paDataType0 = PaDataType.SAM_RESPONSE;
      byte[] byteArray0 = new byte[1];
      PaData paData0 = new PaData(paDataType0, byteArray0);
      byte[] byteArray1 = paData0.getPaDataValue();
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PaData paData0 = new PaData();
      paData0.getPaDataType();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PaDataType paDataType0 = PaDataType.PA_PW_SALT;
      byte[] byteArray0 = new byte[2];
      PaData paData0 = new PaData(paDataType0, byteArray0);
      paData0.setPaDataType((int) (byte)0);
      paData0.getPaDataType();
      assertEquals(PaDataType.NULL, paData0.getPaDataType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PaDataType paDataType0 = PaDataType.PA_TGS_REQ;
      byte[] byteArray0 = new byte[0];
      PaData paData0 = new PaData(paDataType0, byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(11);
      ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
      // Undeclared exception!
      try { 
        paData0.encode(byteBuffer1);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapByteBufferR", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PaData paData0 = new PaData();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1184);
      // Undeclared exception!
      try { 
        paData0.encode(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.PaData", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PaData paData0 = new PaData();
      // Undeclared exception!
      try { 
        paData0.computeLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.PaData", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PaDataType paDataType0 = PaDataType.PA_TGS_REQ;
      byte[] byteArray0 = new byte[0];
      PaData paData0 = new PaData(paDataType0, byteArray0);
      String string0 = paData0.toString("");
      assertEquals("PreAuthenticationData : \n    padata-type: TGS request.(1)\n    padata-value:\n", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PaData paData0 = new PaData();
      String string0 = paData0.toString(" ");
      assertEquals(" PreAuthenticationData : \n     padata-type: null\n", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PaDataType paDataType0 = PaDataType.PA_PW_SALT;
      byte[] byteArray0 = new byte[2];
      PaData paData0 = new PaData(paDataType0, byteArray0);
      try { 
        paData0.encode((ByteBuffer) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_148 Cannot put a PDU in a null buffer !
         //
         verifyException("org.apache.directory.shared.kerberos.components.PaData", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PaDataType paDataType0 = PaDataType.PA_TGS_REQ;
      byte[] byteArray0 = new byte[0];
      PaData paData0 = new PaData(paDataType0, byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(11);
      ByteBuffer byteBuffer1 = paData0.encode(byteBuffer0);
      assertEquals(0, byteBuffer1.arrayOffset());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PaDataType paDataType0 = PaDataType.SAM_RESPONSE;
      PaData paData0 = new PaData(paDataType0, (byte[]) null);
      int int0 = paData0.computeLength();
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PaDataType paDataType0 = PaDataType.PA_TGS_REQ;
      byte[] byteArray0 = new byte[0];
      PaData paData0 = new PaData(paDataType0, byteArray0);
      paData0.setPaDataValue(byteArray0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PaDataType paDataType0 = PaDataType.PA_TGS_REQ;
      byte[] byteArray0 = new byte[0];
      PaData paData0 = new PaData(paDataType0, byteArray0);
      paData0.setPaDataType(paDataType0);
      assertEquals(PaDataType.PA_TGS_REQ, paData0.getPaDataType());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PaDataType paDataType0 = PaDataType.PA_TGS_REQ;
      byte[] byteArray0 = new byte[0];
      PaData paData0 = new PaData(paDataType0, byteArray0);
      String string0 = paData0.toString();
      assertEquals("PreAuthenticationData : \n    padata-type: TGS request.(1)\n    padata-value:\n", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PaDataType paDataType0 = PaDataType.PA_TGS_REQ;
      byte[] byteArray0 = new byte[0];
      PaData paData0 = new PaData(paDataType0, byteArray0);
      PaDataType paDataType1 = paData0.getPaDataType();
      assertSame(paDataType1, paDataType0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PaDataType paDataType0 = PaDataType.PA_TGS_REQ;
      byte[] byteArray0 = new byte[0];
      PaData paData0 = new PaData(paDataType0, byteArray0);
      byte[] byteArray1 = paData0.getPaDataValue();
      assertSame(byteArray0, byteArray1);
  }
}