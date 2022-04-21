/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:02:57 GMT 2022
 */

package org.apache.tika.fork;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.net.URL;
import org.apache.tika.fork.MemoryURLConnection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MemoryURLConnection_ESTest extends MemoryURLConnection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      MemoryURLConnection memoryURLConnection0 = new MemoryURLConnection(uRL0, (byte[]) null);
      // Undeclared exception!
      try { 
        memoryURLConnection0.getInputStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      MemoryURLConnection memoryURLConnection0 = new MemoryURLConnection((URL) null, byteArray0);
      InputStream inputStream0 = memoryURLConnection0.getInputStream();
      assertEquals(1, inputStream0.available());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      MemoryURLConnection memoryURLConnection0 = new MemoryURLConnection(uRL0, (byte[]) null);
      memoryURLConnection0.connect();
      assertTrue(memoryURLConnection0.getDefaultAllowUserInteraction());
  }
}
