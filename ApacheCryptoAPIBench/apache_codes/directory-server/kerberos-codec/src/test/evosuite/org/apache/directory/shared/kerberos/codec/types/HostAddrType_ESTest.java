/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:35:08 GMT 2022
 */

package org.apache.directory.shared.kerberos.codec.types;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.directory.shared.kerberos.codec.types.HostAddrType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HostAddrType_ESTest extends HostAddrType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HostAddrType[] hostAddrTypeArray0 = HostAddrType.values();
      assertEquals(10, hostAddrTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.valueOf("NULL");
      assertEquals(HostAddrType.NULL, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.valueOf("ADDRTYPE_INET");
      assertEquals(HostAddrType.ADDRTYPE_INET, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.NULL;
      String string0 = hostAddrType0.toString();
      assertEquals("null(0)", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.ADDRTYPE_NETBIOS;
      String string0 = hostAddrType0.toString();
      assertEquals("NetBios(20)", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.ADDRTYPE_APPLETALK;
      String string0 = hostAddrType0.toString();
      assertEquals("null(16)", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.ADDRTYPE_DECNET;
      String string0 = hostAddrType0.toString();
      assertEquals("DECnet(12)", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.ADDRTYPE_OSI;
      String string0 = hostAddrType0.toString();
      assertEquals("OSI(7)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.ADDRTYPE_XNS;
      String string0 = hostAddrType0.toString();
      assertEquals("XEROX Network Services(6)", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.ADDRTYPE_CHAOS;
      String string0 = hostAddrType0.toString();
      assertEquals("CHAOS(5)", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.ADDRTYPE_IMPLINK;
      String string0 = hostAddrType0.toString();
      assertEquals("Arpanet(3)", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.ADDRTYPE_INET6;
      String string0 = hostAddrType0.toString();
      assertEquals("Internet Protocol V6(24)", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.ADDRTYPE_INET;
      String string0 = hostAddrType0.toString();
      assertEquals("Internet(2)", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(1866);
      assertEquals(HostAddrType.NULL, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(24);
      assertEquals(HostAddrType.ADDRTYPE_INET6, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(23);
      assertEquals(HostAddrType.NULL, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(22);
      assertEquals(HostAddrType.NULL, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(21);
      assertEquals(HostAddrType.NULL, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(20);
      assertEquals(HostAddrType.ADDRTYPE_NETBIOS, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(19);
      assertEquals(HostAddrType.NULL, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(17);
      assertEquals(HostAddrType.NULL, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(16);
      assertEquals(HostAddrType.ADDRTYPE_APPLETALK, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(15);
      assertEquals(HostAddrType.NULL, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(14);
      assertEquals(HostAddrType.NULL, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(13);
      assertEquals(HostAddrType.NULL, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(12);
      assertEquals(HostAddrType.ADDRTYPE_DECNET, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(11);
      assertEquals(HostAddrType.NULL, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(10);
      int int0 = hostAddrType0.getValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(9);
      assertEquals(HostAddrType.NULL, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(8);
      assertEquals(HostAddrType.NULL, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(7);
      assertEquals(HostAddrType.ADDRTYPE_OSI, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(6);
      assertEquals(HostAddrType.ADDRTYPE_XNS, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(5);
      assertEquals(HostAddrType.ADDRTYPE_CHAOS, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(4);
      assertEquals(HostAddrType.NULL, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(3);
      assertEquals(HostAddrType.ADDRTYPE_IMPLINK, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(2);
      assertEquals(HostAddrType.ADDRTYPE_INET, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(1);
      assertEquals(HostAddrType.NULL, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(18);
      assertEquals(HostAddrType.NULL, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.getTypeByOrdinal(0);
      assertEquals(HostAddrType.NULL, hostAddrType0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HostAddrType hostAddrType0 = HostAddrType.ADDRTYPE_NETBIOS;
      int int0 = hostAddrType0.getValue();
      assertEquals(20, int0);
  }
}
