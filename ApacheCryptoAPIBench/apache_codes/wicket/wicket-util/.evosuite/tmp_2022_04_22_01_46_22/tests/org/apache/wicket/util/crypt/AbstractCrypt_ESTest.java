/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:14:57 GMT 2022
 */

package org.apache.wicket.util.crypt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.wicket.util.crypt.SunJceCrypt;
import org.apache.wicket.util.crypt.TrivialCrypt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractCrypt_ESTest extends AbstractCrypt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SunJceCrypt sunJceCrypt0 = new SunJceCrypt();
      String string0 = sunJceCrypt0.getKey();
      assertEquals("00000000-0100-4000-8200-000003000000", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SunJceCrypt sunJceCrypt0 = new SunJceCrypt("mhszE[O3cSbJ8th8");
      sunJceCrypt0.setKey("");
      String string0 = sunJceCrypt0.getKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TrivialCrypt trivialCrypt0 = new TrivialCrypt();
      String string0 = trivialCrypt0.encryptUrlSafe("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TrivialCrypt trivialCrypt0 = new TrivialCrypt();
      String string0 = trivialCrypt0.decryptUrlSafe("C8eQ");
      assertEquals("\uFFFD8o", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TrivialCrypt trivialCrypt0 = new TrivialCrypt();
      String string0 = trivialCrypt0.decryptUrlSafe("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SunJceCrypt sunJceCrypt0 = new SunJceCrypt();
      // Undeclared exception!
      try { 
        sunJceCrypt0.encryptUrlSafe((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.crypt.AbstractCrypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SunJceCrypt sunJceCrypt0 = new SunJceCrypt();
      String string0 = sunJceCrypt0.encryptUrlSafe("2?mlUJUS{_8");
      assertEquals("joFaY8VrW0w9x7G9tUkFPA", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SunJceCrypt sunJceCrypt0 = new SunJceCrypt("");
      String string0 = sunJceCrypt0.encryptUrlSafe("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SunJceCrypt sunJceCrypt0 = new SunJceCrypt("");
      String string0 = sunJceCrypt0.decryptUrlSafe("");
      assertNull(string0);
  }
}
