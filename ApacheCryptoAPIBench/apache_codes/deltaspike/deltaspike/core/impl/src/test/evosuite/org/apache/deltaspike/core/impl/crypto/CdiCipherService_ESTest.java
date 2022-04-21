/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 17:17:01 GMT 2022
 */

package org.apache.deltaspike.core.impl.crypto;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.apache.deltaspike.core.impl.crypto.CdiCipherService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CdiCipherService_ESTest extends CdiCipherService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CdiCipherService cdiCipherService0 = new CdiCipherService();
      // Undeclared exception!
      try { 
        cdiCipherService0.decrypt("org.apache.deltaspike.core.impl.crypto.CdiCipherService", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // not a valid hex string org.apache.deltaspike.core.impl.crypto.CdiCipherService
         //
         verifyException("org.apache.deltaspike.core.impl.crypto.DefaultCipherService", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CdiCipherService cdiCipherService0 = new CdiCipherService();
      // Undeclared exception!
      try { 
        cdiCipherService0.encrypt("sc?GUTd/G:saCL6", "");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not find master.hash file. Create a master password first!
         //
         verifyException("org.apache.deltaspike.core.impl.crypto.DefaultCipherService", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CdiCipherService cdiCipherService0 = new CdiCipherService();
      // Undeclared exception!
      try { 
        cdiCipherService0.setMasterHash("J 1WzR", (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.deltaspike.core.impl.crypto.DefaultCipherService", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CdiCipherService cdiCipherService0 = new CdiCipherService();
      cdiCipherService0.setMasterHash("", "", true);
      // Undeclared exception!
      try { 
        cdiCipherService0.setMasterHash("", "", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CdiCipherService cdiCipherService0 = new CdiCipherService();
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        cdiCipherService0.setMasterHash("t}<Y", "t}<Y", true);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CdiCipherService cdiCipherService0 = new CdiCipherService();
      cdiCipherService0.setMasterHash("", "", false);
      // Undeclared exception!
      try { 
        cdiCipherService0.encrypt((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.deltaspike.core.impl.crypto.DefaultCipherService", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CdiCipherService cdiCipherService0 = new CdiCipherService();
      cdiCipherService0.setMasterHash("J 1WzR", "J 1WzR", false);
      // Undeclared exception!
      try { 
        cdiCipherService0.encrypt("J 1WzR", "J 1WzR");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CdiCipherService cdiCipherService0 = new CdiCipherService();
      cdiCipherService0.setMasterHash("J 1WzR", "J 1WzR", false);
      // Undeclared exception!
      try { 
        cdiCipherService0.decrypt("J 1WzR", "J 1WzR");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CdiCipherService cdiCipherService0 = new CdiCipherService();
      // Undeclared exception!
      try { 
        cdiCipherService0.decrypt((String) null, (String) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not find master.hash file. Create a master password first!
         //
         verifyException("org.apache.deltaspike.core.impl.crypto.DefaultCipherService", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CdiCipherService cdiCipherService0 = new CdiCipherService();
      cdiCipherService0.setMasterHash("", "", true);
      // Undeclared exception!
      try { 
        cdiCipherService0.decrypt((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.deltaspike.core.impl.crypto.DefaultCipherService", e);
      }
  }
}
