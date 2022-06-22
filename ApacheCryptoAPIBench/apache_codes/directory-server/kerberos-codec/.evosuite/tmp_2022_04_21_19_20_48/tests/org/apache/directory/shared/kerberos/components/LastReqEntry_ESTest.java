/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:27:48 GMT 2022
 */

package org.apache.directory.shared.kerberos.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.directory.shared.kerberos.KerberosTime;
import org.apache.directory.shared.kerberos.codec.types.LastReqType;
import org.apache.directory.shared.kerberos.components.LastReqEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LastReqEntry_ESTest extends LastReqEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LastReqEntry lastReqEntry0 = new LastReqEntry();
      LastReqType lastReqType0 = LastReqType.NONE;
      lastReqEntry0.setLrType(lastReqType0);
      LastReqType lastReqType1 = lastReqEntry0.getLrType();
      assertEquals(0, lastReqType1.getValue());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LastReqEntry lastReqEntry0 = new LastReqEntry();
      LastReqType lastReqType0 = LastReqType.TIME_OF_PASSWORD_EXP;
      lastReqEntry0.setLrType(lastReqType0);
      LastReqType lastReqType1 = lastReqEntry0.getLrType();
      assertEquals(LastReqType.TIME_OF_PASSWORD_EXP, lastReqType1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LastReqEntry lastReqEntry0 = new LastReqEntry();
      String string0 = lastReqEntry0.toString("LastRequestEntry : {\n    lrType : null\n    lrValue : Mock for KerberosTime, hashCode: 1695100929\n}");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LastReqEntry lastReqEntry0 = new LastReqEntry();
      lastReqEntry0.getLrType();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LastReqEntry lastReqEntry0 = new LastReqEntry();
      KerberosTime kerberosTime0 = mock(KerberosTime.class, new ViolatedAssumptionAnswer());
      lastReqEntry0.setLrValue(kerberosTime0);
      assertNull(lastReqEntry0.getLrType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LastReqEntry lastReqEntry0 = new LastReqEntry();
      String string0 = lastReqEntry0.toString();
      assertEquals("LastRequestEntry : {\n    lrType : null\n    lrValue : null\n}", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LastReqType lastReqType0 = LastReqType.TIME_OF_INITIAL_REQ;
      LastReqEntry lastReqEntry0 = new LastReqEntry(lastReqType0, (KerberosTime) null);
      KerberosTime kerberosTime0 = lastReqEntry0.getLrValue();
      assertNull(kerberosTime0);
  }
}