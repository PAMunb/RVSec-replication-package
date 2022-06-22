/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:33:20 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.types;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.shared.kerberos.codec.types.PrincipalNameType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PrincipalNameType_ESTest extends PrincipalNameType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PrincipalNameType[] principalNameTypeArray0 = PrincipalNameType.values();
      assertEquals(9, principalNameTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.valueOf("KRB_NT_UNKNOWN");
      assertEquals(PrincipalNameType.KRB_NT_UNKNOWN, principalNameType0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.KRB_NT_UNKNOWN;
      int int0 = principalNameType0.getValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.KRB_NT_X500_PRINCIPAL;
      String string0 = principalNameType0.toString();
      assertEquals("Encoded X.509 Distinguished name [RFC2253](6)", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.KRB_NT_UID;
      String string0 = principalNameType0.toString();
      assertEquals("Unique ID(5)", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.KRB_NT_SRV_XHST;
      String string0 = principalNameType0.toString();
      assertEquals("Service with host as remaining components(4)", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.valueOf("KRB_NT_SRV_INST");
      String string0 = principalNameType0.toString();
      assertEquals("Service and other unique instance (krbtgt)(2)", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.KRB_NT_PRINCIPAL;
      String string0 = principalNameType0.toString();
      assertEquals("Just the name of the principal as in DCE, or for users(1)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.KRB_NT_ENTERPRISE;
      String string0 = principalNameType0.toString();
      assertEquals("Enterprise name; may be mapped to principal name(10)", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.KRB_NT_UNKNOWN;
      String string0 = principalNameType0.toString();
      assertEquals("Name type not known(0)", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.getTypeByValue(10);
      assertEquals(PrincipalNameType.KRB_NT_ENTERPRISE, principalNameType0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.getTypeByValue(9);
      assertEquals(PrincipalNameType.KRB_NT_UNKNOWN, principalNameType0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.getTypeByValue(8);
      assertEquals(PrincipalNameType.KRB_NT_UNKNOWN, principalNameType0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.getTypeByValue(7);
      assertEquals(PrincipalNameType.KRB_NT_SMTP_NAME, principalNameType0);
      
      principalNameType0.toString();
      assertEquals(7, principalNameType0.getValue());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.getTypeByValue(6);
      assertEquals(PrincipalNameType.KRB_NT_X500_PRINCIPAL, principalNameType0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.getTypeByValue(5);
      assertEquals(PrincipalNameType.KRB_NT_UID, principalNameType0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.getTypeByValue(4);
      assertEquals(PrincipalNameType.KRB_NT_SRV_XHST, principalNameType0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.getTypeByValue(3);
      assertEquals(PrincipalNameType.KRB_NT_SRV_HST, principalNameType0);
      
      String string0 = principalNameType0.toString();
      assertEquals("Service with host name as instance (telnet, rcommands)(3)", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.getTypeByValue(2);
      assertEquals(PrincipalNameType.KRB_NT_SRV_INST, principalNameType0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.getTypeByValue(1);
      assertEquals(PrincipalNameType.KRB_NT_PRINCIPAL, principalNameType0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.getTypeByValue((-1500));
      assertEquals(PrincipalNameType.KRB_NT_UNKNOWN, principalNameType0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.getTypeByValue(0);
      assertEquals(PrincipalNameType.KRB_NT_UNKNOWN, principalNameType0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrincipalNameType principalNameType0 = PrincipalNameType.KRB_NT_SRV_XHST;
      int int0 = principalNameType0.getValue();
      assertEquals(4, int0);
  }
}