/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:47:04 GMT 2022
 */

package org.apache.directory.shared.kerberos.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.List;
import org.apache.directory.shared.kerberos.KerberosMessageType;
import org.apache.directory.shared.kerberos.codec.types.PaDataType;
import org.apache.directory.shared.kerberos.components.KdcReqBody;
import org.apache.directory.shared.kerberos.components.PaData;
import org.apache.directory.shared.kerberos.messages.AsReq;
import org.apache.directory.shared.kerberos.messages.TgsReq;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class KdcReq_ESTest extends KdcReq_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AsReq asReq0 = new AsReq();
      KdcReqBody kdcReqBody0 = new KdcReqBody();
      asReq0.setKdcReqBody(kdcReqBody0);
      String string0 = asReq0.toString("");
      assertEquals("\n>-------------------------------------------------------------------------------\nAS-REQ\npvno : 5\nmsg-type : AS_REQ\nkdc-req-body : \n    realm : null\n    till : null\n    nonce : 0\n    etype : \n\n-------------------------------------------------------------------------------<\n", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AsReq asReq0 = new AsReq();
      KdcReqBody kdcReqBody0 = new KdcReqBody();
      asReq0.setKdcReqBody(kdcReqBody0);
      String string0 = asReq0.toString();
      assertEquals("\n>-------------------------------------------------------------------------------\nAS-REQ\npvno : 5\nmsg-type : AS_REQ\nkdc-req-body : \n    realm : null\n    till : null\n    nonce : 0\n    etype : \n\n-------------------------------------------------------------------------------<\n", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TgsReq tgsReq0 = new TgsReq();
      tgsReq0.setProtocolVersionNumber(0);
      int int0 = tgsReq0.getPvno();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AsReq asReq0 = new AsReq();
      asReq0.setPvno((-1061));
      int int0 = asReq0.getPvno();
      assertEquals((-1061), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AsReq asReq0 = new AsReq();
      PaData paData0 = new PaData();
      asReq0.addPaData(paData0);
      List<PaData> list0 = asReq0.getPaData();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AsReq asReq0 = new AsReq();
      KdcReqBody kdcReqBody0 = new KdcReqBody();
      asReq0.setKdcReqBody(kdcReqBody0);
      KdcReqBody kdcReqBody1 = asReq0.getKdcReqBody();
      assertEquals(0, kdcReqBody1.getNonce());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AsReq asReq0 = new AsReq();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
      try { 
        asReq0.encode(byteBuffer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_00004_PDU_BUFFER_SIZE_TOO_SMALL The PDU buffer size is too small !
         //
         verifyException("org.apache.directory.api.asn1.ber.tlv.BerValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AsReq asReq0 = new AsReq();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
      // Undeclared exception!
      try { 
        asReq0.encode(byteBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TgsReq tgsReq0 = new TgsReq();
      PaDataType paDataType0 = PaDataType.SAM_REDIRECT;
      PaData paData0 = new PaData(paDataType0, (byte[]) null);
      tgsReq0.addPaData(paData0);
      // Undeclared exception!
      try { 
        tgsReq0.toString("U_BoVif");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.KdcReq", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TgsReq tgsReq0 = new TgsReq();
      KerberosMessageType kerberosMessageType0 = KerberosMessageType.AP_REQ;
      tgsReq0.setMessageType(kerberosMessageType0);
      // Undeclared exception!
      try { 
        tgsReq0.toString("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.KdcReq", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TgsReq tgsReq0 = new TgsReq();
      PaData paData0 = new PaData();
      tgsReq0.addPaData(paData0);
      // Undeclared exception!
      try { 
        tgsReq0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.KdcReq", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AsReq asReq0 = new AsReq();
      PaDataType paDataType0 = PaDataType.SAM_CHALLENGE;
      PaData paData0 = new PaData(paDataType0, (byte[]) null);
      asReq0.addPaData(paData0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1902);
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
  public void test12()  throws Throwable  {
      AsReq asReq0 = new AsReq();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(475);
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
  public void test13()  throws Throwable  {
      AsReq asReq0 = new AsReq();
      PaDataType paDataType0 = PaDataType.PA_TGS_REQ;
      PaData paData0 = new PaData(paDataType0, (byte[]) null);
      asReq0.addPaData(paData0);
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
  public void test14()  throws Throwable  {
      TgsReq tgsReq0 = new TgsReq();
      // Undeclared exception!
      try { 
        tgsReq0.computeLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.KdcReq", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AsReq asReq0 = new AsReq();
      List<PaData> list0 = asReq0.getPaData();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AsReq asReq0 = new AsReq();
      int int0 = asReq0.getPvno();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AsReq asReq0 = new AsReq();
      KdcReqBody kdcReqBody0 = asReq0.getKdcReqBody();
      assertNull(kdcReqBody0);
  }
}