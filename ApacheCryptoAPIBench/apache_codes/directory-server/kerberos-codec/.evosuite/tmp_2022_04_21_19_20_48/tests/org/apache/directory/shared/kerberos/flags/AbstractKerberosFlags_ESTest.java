/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:48:29 GMT 2022
 */

package org.apache.directory.shared.kerberos.flags;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.directory.shared.kerberos.flags.AbstractKerberosFlags;
import org.apache.directory.shared.kerberos.flags.KerberosFlag;
import org.apache.directory.shared.kerberos.flags.TicketFlag;
import org.apache.directory.shared.kerberos.flags.TicketFlags;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractKerberosFlags_ESTest extends AbstractKerberosFlags_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags(0);
      TicketFlags ticketFlags1 = new TicketFlags(32);
      boolean boolean0 = ticketFlags0.equals(ticketFlags1);
      assertFalse(boolean0);
      assertFalse(ticketFlags1.equals((Object)ticketFlags0));
      assertEquals(32, ticketFlags1.getIntValue());
      assertEquals(32, ticketFlags1.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags(0);
      assertFalse(ticketFlags0.isPostdated());
      
      ticketFlags0.value = 0;
      ticketFlags0.value = (-1149);
      ticketFlags0.hashCode();
      assertEquals(32, ticketFlags0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags(0);
      ticketFlags0.value = (-1367);
      ticketFlags0.setFlag(0);
      assertEquals((-1367), ticketFlags0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags(2801);
      TicketFlag ticketFlag0 = TicketFlag.PROXY;
      ticketFlags0.setFlag((KerberosFlag) ticketFlag0);
      ticketFlags0.setFlag((KerberosFlag) ticketFlag0);
      assertEquals(134220529, ticketFlags0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags((-4796));
      boolean boolean0 = ticketFlags0.isFlagSet((-4796));
      assertEquals((-4796), ticketFlags0.getIntValue());
      assertTrue(boolean0);
      assertEquals(32, ticketFlags0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags();
      ticketFlags0.setFlag(0);
      ticketFlags0.toString();
      assertEquals(Integer.MIN_VALUE, ticketFlags0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = AbstractKerberosFlags.isFlagSet((int) (byte) (-1), 114);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)50;
      TicketFlags ticketFlags0 = new TicketFlags(byteArray0);
      assertEquals(12800, ticketFlags0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)50;
      TicketFlags ticketFlags0 = new TicketFlags(byteArray0);
      assertEquals(3276800, ticketFlags0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-45);
      TicketFlags ticketFlags0 = new TicketFlags(byteArray0);
      assertEquals((-754974720), ticketFlags0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      TicketFlags ticketFlags0 = null;
      try {
        ticketFlags0 = new TicketFlags(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The given flags is not correct
         //
         verifyException("org.apache.directory.shared.kerberos.flags.AbstractKerberosFlags", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags();
      ticketFlags0.setData((-2904));
      assertTrue(ticketFlags0.isProxiable());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags(0);
      TicketFlag ticketFlag0 = TicketFlag.POSTDATED;
      boolean boolean0 = ticketFlags0.isFlagSet((KerberosFlag) ticketFlag0);
      assertEquals(0, ticketFlags0.getIntValue());
      assertEquals(32, ticketFlags0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags(2801);
      int int0 = ticketFlags0.getIntValue();
      assertEquals(32, ticketFlags0.size());
      assertEquals(2801, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags();
      ticketFlags0.setFlag(0);
      int int0 = ticketFlags0.getIntValue();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags();
      // Undeclared exception!
      try { 
        ticketFlags0.setFlag((KerberosFlag) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.flags.AbstractKerberosFlags", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags();
      ticketFlags0.setData((byte[]) null);
      TicketFlag ticketFlag0 = TicketFlag.PRE_AUTHENT;
      // Undeclared exception!
      try { 
        ticketFlags0.setFlag((KerberosFlag) ticketFlag0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // ERR_00030_BIT_NUMBER_OUT_OF_BOUND Bad bit number : out of bound
         //
         verifyException("org.apache.directory.api.asn1.util.BitString", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags();
      TicketFlag ticketFlag0 = TicketFlag.MAX_VALUE;
      // Undeclared exception!
      try { 
        ticketFlags0.setFlag((KerberosFlag) ticketFlag0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.directory.api.asn1.util.BitString", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags();
      // Undeclared exception!
      try { 
        ticketFlags0.setFlag(32);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.directory.api.asn1.util.BitString", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      TicketFlags ticketFlags0 = new TicketFlags(byteArray0);
      // Undeclared exception!
      try { 
        ticketFlags0.isFlagSet((KerberosFlag) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        ticketFlags0.equals(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.directory.shared.kerberos.flags.AbstractKerberosFlags
         //
         verifyException("org.apache.directory.shared.kerberos.flags.AbstractKerberosFlags", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags();
      // Undeclared exception!
      try { 
        ticketFlags0.clearFlag((KerberosFlag) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.directory.shared.kerberos.flags.AbstractKerberosFlags", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags();
      TicketFlag ticketFlag0 = TicketFlag.FORWARDABLE;
      ticketFlags0.setData((byte[]) null);
      // Undeclared exception!
      try { 
        ticketFlags0.clearFlag((KerberosFlag) ticketFlag0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // ERR_00030_BIT_NUMBER_OUT_OF_BOUND Bad bit number : out of bound
         //
         verifyException("org.apache.directory.api.asn1.util.BitString", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags();
      TicketFlag ticketFlag0 = TicketFlag.MAX_VALUE;
      // Undeclared exception!
      try { 
        ticketFlags0.clearFlag((KerberosFlag) ticketFlag0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.directory.api.asn1.util.BitString", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags();
      // Undeclared exception!
      try { 
        ticketFlags0.clearFlag(472);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // ERR_00030_BIT_NUMBER_OUT_OF_BOUND Bad bit number : out of bound
         //
         verifyException("org.apache.directory.api.asn1.util.BitString", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags();
      // Undeclared exception!
      try { 
        ticketFlags0.clearFlag(32);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.directory.api.asn1.util.BitString", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags(0);
      TicketFlags ticketFlags1 = new TicketFlags();
      boolean boolean0 = ticketFlags1.equals(ticketFlags0);
      assertEquals(32, ticketFlags0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags();
      boolean boolean0 = ticketFlags0.equals(ticketFlags0);
      assertTrue(boolean0);
      assertEquals(0, ticketFlags0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags(0);
      TicketFlags ticketFlags1 = new TicketFlags(32);
      boolean boolean0 = ticketFlags1.equals(ticketFlags0);
      assertEquals(32, ticketFlags1.size());
      assertFalse(ticketFlags0.equals((Object)ticketFlags1));
      assertFalse(boolean0);
      assertEquals(32, ticketFlags1.getIntValue());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags();
      ticketFlags0.setFlag(0);
      boolean boolean0 = ticketFlags0.isFlagSet(0);
      assertTrue(ticketFlags0.isReserved());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags();
      boolean boolean0 = ticketFlags0.isFlagSet(2712);
      assertFalse(boolean0);
      assertEquals(0, ticketFlags0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = AbstractKerberosFlags.isFlagSet((int) (byte) (-1), 32);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = AbstractKerberosFlags.isFlagSet(32, 263);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TicketFlags ticketFlags0 = null;
      try {
        ticketFlags0 = new TicketFlags(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The given flags is not correct
         //
         verifyException("org.apache.directory.shared.kerberos.flags.AbstractKerberosFlags", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      TicketFlags ticketFlags0 = new TicketFlags(byteArray0);
      boolean boolean0 = ticketFlags0.equals((Object) null);
      assertEquals(0, ticketFlags0.getIntValue());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TicketFlags ticketFlags0 = null;
      try {
        ticketFlags0 = new TicketFlags((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The given flags is not correct
         //
         verifyException("org.apache.directory.shared.kerberos.flags.AbstractKerberosFlags", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags(0);
      ticketFlags0.clearFlag(0);
      assertEquals(32, ticketFlags0.size());
      assertEquals(0, ticketFlags0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags();
      int int0 = ticketFlags0.getIntValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags(0);
      TicketFlag ticketFlag0 = TicketFlag.PROXY;
      ticketFlags0.setFlag((KerberosFlag) ticketFlag0);
      boolean boolean0 = ticketFlags0.isFlagSet((KerberosFlag) ticketFlag0);
      assertEquals(134217728, ticketFlags0.getIntValue());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags();
      // Undeclared exception!
      try { 
        ticketFlags0.setFlag((-962));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // ERR_00030_BIT_NUMBER_OUT_OF_BOUND Bad bit number : out of bound
         //
         verifyException("org.apache.directory.api.asn1.util.BitString", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TicketFlags ticketFlags0 = new TicketFlags(0);
      TicketFlag ticketFlag0 = TicketFlag.PROXY;
      ticketFlags0.clearFlag((KerberosFlag) ticketFlag0);
      assertEquals(32, ticketFlags0.size());
      assertEquals(0, ticketFlags0.getIntValue());
  }
}