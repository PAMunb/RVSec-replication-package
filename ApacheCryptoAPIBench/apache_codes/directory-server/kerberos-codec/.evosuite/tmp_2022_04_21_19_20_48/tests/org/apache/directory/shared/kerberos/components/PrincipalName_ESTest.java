/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:28:56 GMT 2022
 */

package org.apache.directory.shared.kerberos.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import java.util.List;
import javax.security.auth.kerberos.KerberosPrincipal;
import org.apache.directory.shared.kerberos.codec.types.PrincipalNameType;
import org.apache.directory.shared.kerberos.components.PrincipalName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PrincipalName_ESTest extends PrincipalName_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName("", 0);
      byte[] byteArray0 = new byte[8];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, 0, (int) (byte)0);
      try { 
        principalName0.encode(byteBuffer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_138 The PDU buffer size is too small !
         //
         verifyException("org.apache.directory.shared.kerberos.components.PrincipalName", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.KRB_NT_SMTP_NAME;
      PrincipalName principalName0 = new PrincipalName("Empty name parts", principalNameType0);
      principalName0.setRealm("Empty name parts");
      String string0 = principalName0.getRealm();
      assertEquals("Empty name parts", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.KRB_NT_SMTP_NAME;
      PrincipalName principalName0 = new PrincipalName("", principalNameType0);
      principalName0.setRealm("");
      String string0 = principalName0.getRealm();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName();
      List<String> list0 = principalName0.getNames();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName();
      principalName0.getNameType();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.KRB_NT_X500_PRINCIPAL;
      PrincipalName principalName0 = new PrincipalName("D/:KzAD/Q9y-)sJ", principalNameType0);
      PrincipalNameType principalNameType1 = principalName0.getNameType();
      assertSame(principalNameType1, principalNameType0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName();
      // Undeclared exception!
      try { 
        principalName0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.PrincipalName", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName();
      // Undeclared exception!
      try { 
        principalName0.computeLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.PrincipalName", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PrincipalName principalName0 = null;
      try {
        principalName0 = new PrincipalName((KerberosPrincipal) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.components.PrincipalName", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrincipalName principalName0 = null;
      try {
        principalName0 = new PrincipalName("@NuTkp", 370);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.text.ParseException: ERR_628 An empty name is not valid in a kerberos name
         //
         verifyException("org.apache.directory.shared.kerberos.components.PrincipalName", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.KRB_NT_SMTP_NAME;
      PrincipalName principalName0 = new PrincipalName("", principalNameType0);
      String string0 = principalName0.toString();
      assertEquals("{ name-type: KRB_NT_SMTP_NAME no name-string }", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.KRB_NT_SRV_INST;
      PrincipalName principalName0 = new PrincipalName();
      PrincipalName principalName1 = new PrincipalName("", principalNameType0);
      boolean boolean0 = principalName0.equals(principalName1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName();
      PrincipalName principalName1 = new PrincipalName();
      boolean boolean0 = principalName1.equals(principalName0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName();
      String[] stringArray0 = new String[2];
      PrincipalName principalName1 = new PrincipalName(stringArray0, 698);
      boolean boolean0 = principalName0.equals(principalName1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName();
      boolean boolean0 = principalName0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName();
      boolean boolean0 = principalName0.equals(principalName0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName("", (-1621));
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3642);
      // Undeclared exception!
      try { 
        principalName0.equals(byteBuffer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.nio.DirectByteBuffer cannot be cast to org.apache.directory.shared.kerberos.components.PrincipalName
         //
         verifyException("org.apache.directory.shared.kerberos.components.PrincipalName", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName();
      principalName0.hashCode();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName("", (-1621));
      principalName0.hashCode();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[1];
      PrincipalName principalName0 = new PrincipalName(stringArray0, (-1));
      principalName0.setRealm("RESERVED_31");
      String string0 = principalName0.toString();
      assertEquals("{ name-type: KRB_NT_UNKNOWN, name-string : <'null'>realm: RESERVED_31 }", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.KRB_NT_ENTERPRISE;
      PrincipalName principalName0 = new PrincipalName((String) null, principalNameType0);
      String string0 = principalName0.toString();
      assertEquals("{ name-type: KRB_NT_ENTERPRISE no name-string }", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName("", (-1621));
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3642);
      principalName0.encode(byteBuffer0);
      assertEquals(3631, byteBuffer0.remaining());
      assertEquals(11, byteBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName();
      try { 
        principalName0.encode((ByteBuffer) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ERR_148 Cannot put a PDU in a null buffer !
         //
         verifyException("org.apache.directory.shared.kerberos.components.PrincipalName", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.KRB_NT_PRINCIPAL;
      PrincipalName principalName0 = new PrincipalName((String) null, principalNameType0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(70374420);
      principalName0.encode(byteBuffer0);
      assertEquals(70374409, byteBuffer0.remaining());
      assertEquals(11, byteBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName("", (-1621));
      int int0 = principalName0.computeLength();
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName();
      principalName0.addName((String) null);
      assertNull(principalName0.getRealm());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName((String) null, 2);
      principalName0.getNameString();
      assertEquals(PrincipalNameType.KRB_NT_SRV_INST, principalName0.getNameType());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName();
      String string0 = principalName0.getNameString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[0];
      PrincipalName principalName0 = null;
      try {
        principalName0 = new PrincipalName(stringArray0, 4628);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty name parts
         //
         verifyException("org.apache.directory.shared.kerberos.components.PrincipalName", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PrincipalName principalName0 = null;
      try {
        principalName0 = new PrincipalName((String[]) null, (-285));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty name parts
         //
         verifyException("org.apache.directory.shared.kerberos.components.PrincipalName", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.KRB_NT_PRINCIPAL;
      PrincipalName principalName0 = new PrincipalName((String) null, principalNameType0);
      principalName0.computeLength();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(70374420);
      principalName0.encode(byteBuffer0);
      assertEquals(11, byteBuffer0.position());
      assertEquals("java.nio.HeapByteBuffer[pos=11 lim=70374420 cap=70374420]", byteBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      KerberosPrincipal kerberosPrincipal0 = new KerberosPrincipal("S(,$<E]QO'rq@[-3H");
      PrincipalName principalName0 = new PrincipalName(kerberosPrincipal0);
      assertEquals("[-3H", principalName0.getRealm());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName("CMom_=", 0);
      principalName0.getNames();
      assertEquals(PrincipalNameType.KRB_NT_UNKNOWN, principalName0.getNameType());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName("", (-1621));
      principalName0.setNameType(3642);
      assertNull(principalName0.getRealm());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[1];
      PrincipalName principalName0 = new PrincipalName(stringArray0, (-1));
      PrincipalNameType principalNameType0 = principalName0.getNameType();
      assertEquals(PrincipalNameType.KRB_NT_UNKNOWN, principalNameType0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName();
      PrincipalNameType principalNameType0 = PrincipalNameType.KRB_NT_SRV_HST;
      principalName0.setNameType(principalNameType0);
      assertNull(principalName0.getRealm());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PrincipalName principalName0 = new PrincipalName("", (-1621));
      String string0 = principalName0.getRealm();
      assertNull(string0);
  }
}