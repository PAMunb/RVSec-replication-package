/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:10:15 GMT 2022
 */

package org.apache.wicket.util.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.wicket.util.file.Folder;
import org.apache.wicket.util.file.Path;
import org.apache.wicket.util.resource.IResourceStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Path_ESTest extends Path_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Folder folder0 = new Folder("");
      Path path0 = new Path(folder0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Path path0 = new Path("");
      String string0 = path0.toString();
      assertEquals("[Path: exception while inspecting folder]", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Path path0 = new Path("");
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        path0.find(class0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Path path0 = null;
      try {
        path0 = new Path((Folder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.file.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Folder folder0 = new Folder("6j?rxqq9M`%hmsiq-)");
      Path path0 = null;
      try {
        path0 = new Path(folder0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Folder 6j?rxqq9M`%hmsiq-) does not exist
         //
         verifyException("org.apache.wicket.util.file.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Path path0 = null;
      try {
        path0 = new Path((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Path path0 = new Path("");
      Class<Integer> class0 = Integer.class;
      IResourceStream iResourceStream0 = path0.find(class0, "");
      assertNull(iResourceStream0.getStyle());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Path path0 = new Path("");
      Class<Integer> class0 = Integer.class;
      IResourceStream iResourceStream0 = path0.find(class0, "Pattern is missing");
      assertNull(iResourceStream0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Path path0 = null;
      try {
        path0 = new Path("%s");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Folder %s does not exist
         //
         verifyException("org.apache.wicket.util.file.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Path path0 = new Path("");
      String string0 = path0.toString();
      assertEquals("[Path: folder = /home/pedro/projects/RVSec-replication-package/ApacheCryptoAPIBench/apache_codes/wicket/wicket-util]", string0);
  }
}
