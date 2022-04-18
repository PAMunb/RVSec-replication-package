/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 13:26:53 GMT 2022
 */

package org.apache.activemq.artemis.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.apache.activemq.artemis.utils.DefaultSensitiveStringCodec;
import org.apache.activemq.artemis.utils.SecureHashProcessor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SecureHashProcessor_ESTest extends SecureHashProcessor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SecureHashProcessor secureHashProcessor0 = new SecureHashProcessor((DefaultSensitiveStringCodec) null);
      try { 
        secureHashProcessor0.hash("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.utils.SecureHashProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultSensitiveStringCodec defaultSensitiveStringCodec0 = new DefaultSensitiveStringCodec();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("key", "");
      defaultSensitiveStringCodec0.init(hashMap0);
      SecureHashProcessor secureHashProcessor0 = new SecureHashProcessor(defaultSensitiveStringCodec0);
      try { 
        secureHashProcessor0.hash(".lrz|(K");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultSensitiveStringCodec defaultSensitiveStringCodec0 = new DefaultSensitiveStringCodec();
      SecureHashProcessor secureHashProcessor0 = new SecureHashProcessor(defaultSensitiveStringCodec0);
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        secureHashProcessor0.compare(charArray0, "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultSensitiveStringCodec defaultSensitiveStringCodec0 = new DefaultSensitiveStringCodec();
      SecureHashProcessor secureHashProcessor0 = new SecureHashProcessor(defaultSensitiveStringCodec0);
      char[] charArray0 = new char[14];
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("algorithm", "one-way");
      defaultSensitiveStringCodec0.init(hashMap0);
      // Undeclared exception!
      try { 
        secureHashProcessor0.compare(charArray0, "two-way");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"wa\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultSensitiveStringCodec defaultSensitiveStringCodec0 = new DefaultSensitiveStringCodec();
      SecureHashProcessor secureHashProcessor0 = new SecureHashProcessor(defaultSensitiveStringCodec0);
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        secureHashProcessor0.compare(charArray0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.activemq.artemis.utils.SecureHashProcessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultSensitiveStringCodec defaultSensitiveStringCodec0 = new DefaultSensitiveStringCodec();
      SecureHashProcessor secureHashProcessor0 = new SecureHashProcessor(defaultSensitiveStringCodec0);
      String string0 = secureHashProcessor0.hash("algorithm");
      assertEquals("ENC(1733592ded9448ba196b2694488a38f0)", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultSensitiveStringCodec defaultSensitiveStringCodec0 = new DefaultSensitiveStringCodec();
      SecureHashProcessor secureHashProcessor0 = new SecureHashProcessor(defaultSensitiveStringCodec0);
      char[] charArray0 = new char[14];
      boolean boolean0 = secureHashProcessor0.compare(charArray0, "two-way");
      assertFalse(boolean0);
  }
}
