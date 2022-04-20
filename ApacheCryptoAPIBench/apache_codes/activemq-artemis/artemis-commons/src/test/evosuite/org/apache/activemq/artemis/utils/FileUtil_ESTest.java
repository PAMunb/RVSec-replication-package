/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 20 11:26:22 GMT 2022
 */

package org.apache.activemq.artemis.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.activemq.artemis.utils.FileUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FileUtil_ESTest extends FileUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      MockFile mockFile1 = new MockFile("60/)sRn;j`]R_>");
      mockFile1.mkdirs();
      // Undeclared exception!
      FileUtil.deleteDirectory(mockFile0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      boolean boolean0 = mockFile0.setReadOnly();
      MockFile mockFile1 = new MockFile("", "");
      boolean boolean1 = FileUtil.deleteDirectory(mockFile1);
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      // Undeclared exception!
      try { 
        FileUtil.deleteDirectory(mockFile0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      boolean boolean0 = FileUtil.deleteDirectory(mockFile0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Is dvFHrCX Yh)`Bx", "r9WlqZZwfK;,V1<v");
      boolean boolean0 = FileUtil.deleteDirectory(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile("");
          FileUtil.makeExec(mockFile0);
          assertEquals(0L, mockFile0.getUsableSpace());
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
  }
}
