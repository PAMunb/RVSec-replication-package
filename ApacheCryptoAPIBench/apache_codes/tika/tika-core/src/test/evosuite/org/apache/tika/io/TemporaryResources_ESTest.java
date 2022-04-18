/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 13:45:52 GMT 2022
 */

package org.apache.tika.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.file.Path;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.tika.io.TemporaryResources;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TemporaryResources_ESTest extends TemporaryResources_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TemporaryResources temporaryResources0 = new TemporaryResources();
      PipedInputStream pipedInputStream0 = new PipedInputStream(342);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      temporaryResources0.addResource(pipedOutputStream0);
      // Undeclared exception!
      try { 
        temporaryResources0.getResource((Class<PipedOutputStream>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.io.TemporaryResources", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TemporaryResources temporaryResources0 = new TemporaryResources();
      temporaryResources0.addResource(temporaryResources0);
      // Undeclared exception!
      try { 
        temporaryResources0.dispose();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TemporaryResources temporaryResources0 = new TemporaryResources();
      temporaryResources0.addResource((Closeable) null);
      // Undeclared exception!
      try { 
        temporaryResources0.dispose();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.io.TemporaryResources", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TemporaryResources temporaryResources0 = new TemporaryResources();
      temporaryResources0.addResource((Closeable) null);
      // Undeclared exception!
      try { 
        temporaryResources0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.io.TemporaryResources", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          TemporaryResources temporaryResources0 = new TemporaryResources();
          // Undeclared exception!
          try { 
            temporaryResources0.createTempFile();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Unable to create temporary file or directory
             //
             verifyException("java.nio.file.TempFileHelper", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          TemporaryResources temporaryResources0 = new TemporaryResources();
          File file0 = MockFile.createTempFile("wmzWps&,p%Qg{#?ha)", "wmzWps&,p%Qg{#?ha)");
          temporaryResources0.setTemporaryFileDirectory(file0);
          // Undeclared exception!
          try { 
            temporaryResources0.createTempFile();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/tmp/wmzWps&,p%Qg{#?ha)0wmzWps&,p%Qg{#?ha)/apache-tika-8202031262049469428.tmp\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // sun.nio.fs.UnixChannelFactory.open(UnixChannelFactory.java:247)
             // sun.nio.fs.UnixChannelFactory.newFileChannel(UnixChannelFactory.java:136)
             // sun.nio.fs.UnixChannelFactory.newFileChannel(UnixChannelFactory.java:148)
             // sun.nio.fs.UnixFileSystemProvider.newByteChannel(UnixFileSystemProvider.java:212)
             // java.nio.file.Files.newByteChannel(Files.java:361)
             // java.nio.file.Files.createFile(Files.java:632)
             // java.nio.file.TempFileHelper.create(TempFileHelper.java:138)
             // java.nio.file.TempFileHelper.createTempFile(TempFileHelper.java:161)
             // java.nio.file.Files.createTempFile(Files.java:852)
             // org.apache.tika.io.TemporaryResources.createTempFile(TemporaryResources.java:81)
             // sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             // sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TemporaryResources temporaryResources0 = new TemporaryResources();
      PipedInputStream pipedInputStream0 = new PipedInputStream(342);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      temporaryResources0.addResource(pipedOutputStream0);
      temporaryResources0.dispose();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TemporaryResources temporaryResources0 = new TemporaryResources();
      PipedInputStream pipedInputStream0 = new PipedInputStream(342);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0, 342);
      MockPrintStream mockPrintStream0 = new MockPrintStream(bufferedOutputStream0);
      temporaryResources0.addResource(mockPrintStream0);
      Class<PipedOutputStream> class0 = PipedOutputStream.class;
      PipedOutputStream pipedOutputStream1 = temporaryResources0.getResource(class0);
      assertNull(pipedOutputStream1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TemporaryResources temporaryResources0 = new TemporaryResources();
      PipedInputStream pipedInputStream0 = new PipedInputStream(342);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      temporaryResources0.addResource(pipedOutputStream0);
      Class<PipedOutputStream> class0 = PipedOutputStream.class;
      PipedOutputStream pipedOutputStream1 = temporaryResources0.getResource(class0);
      assertSame(pipedOutputStream1, pipedOutputStream0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TemporaryResources temporaryResources0 = new TemporaryResources();
      temporaryResources0.setTemporaryFileDirectory((File) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TemporaryResources temporaryResources0 = new TemporaryResources();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("!", true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      temporaryResources0.addResource(dataOutputStream0);
      temporaryResources0.close();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          TemporaryResources temporaryResources0 = new TemporaryResources();
          // Undeclared exception!
          try { 
            temporaryResources0.createTemporaryFile();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Unable to create temporary file or directory
             //
             verifyException("java.nio.file.TempFileHelper", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          TemporaryResources temporaryResources0 = new TemporaryResources();
          MockFile mockFile0 = new MockFile("", "");
          Path path0 = mockFile0.toPath();
          temporaryResources0.setTemporaryFileDirectory(path0);
          // Undeclared exception!
          try { 
            temporaryResources0.createTemporaryFile();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/apache-tika-5323672899993636076.tmp\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // sun.nio.fs.UnixChannelFactory.open(UnixChannelFactory.java:247)
             // sun.nio.fs.UnixChannelFactory.newFileChannel(UnixChannelFactory.java:136)
             // sun.nio.fs.UnixChannelFactory.newFileChannel(UnixChannelFactory.java:148)
             // sun.nio.fs.UnixFileSystemProvider.newByteChannel(UnixFileSystemProvider.java:212)
             // java.nio.file.Files.newByteChannel(Files.java:361)
             // java.nio.file.Files.createFile(Files.java:632)
             // java.nio.file.TempFileHelper.create(TempFileHelper.java:138)
             // java.nio.file.TempFileHelper.createTempFile(TempFileHelper.java:161)
             // java.nio.file.Files.createTempFile(Files.java:852)
             // org.apache.tika.io.TemporaryResources.createTempFile(TemporaryResources.java:81)
             // org.apache.tika.io.TemporaryResources.createTemporaryFile(TemporaryResources.java:99)
             // sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             // sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
