/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:05:37 GMT 2022
 */

package org.apache.wicket.util.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import org.apache.wicket.util.io.Connections;
import org.apache.wicket.util.time.Time;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Connections_ESTest extends Connections_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/some/fake/but/wellformed/url");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      URL uRL0 = MockURL.getFileExample();
      Time time0 = Connections.getLastModified(uRL0);
      assertEquals(1392409281320L, time0.getMilliseconds());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL1 = MockURL.URL(uRL0, "x", uRLStreamHandler0);
      // Undeclared exception!
      try { 
        Connections.getLastModified(uRL1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument 'url' may not be null.
         //
         verifyException("org.apache.wicket.util.lang.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      URLConnection uRLConnection0 = mock(URLConnection.class, new ViolatedAssumptionAnswer());
      doReturn((URL) null).when(uRLConnection0).getURL();
      // Undeclared exception!
      try { 
        Connections.close(uRLConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      URLConnection uRLConnection0 = MockURL.openConnection(uRL0);
      Connections.close(uRLConnection0);
      assertEquals(0, uRLConnection0.getReadTimeout());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Connections.close((URLConnection) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      URLConnection uRLConnection0 = MockURL.openConnection(uRL0);
      Connections.closeQuietly(uRLConnection0);
      assertEquals(0L, uRLConnection0.getIfModifiedSince());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      URLConnection uRLConnection0 = mock(URLConnection.class, new ViolatedAssumptionAnswer());
      doReturn(inputStream0).when(uRLConnection0).getInputStream();
      doReturn(uRL0).when(uRLConnection0).getURL();
      Connections.close(uRLConnection0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      // Undeclared exception!
      try { 
        Connections.getLastModified(uRL0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.io.Connections", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      Time time0 = Connections.getLastModified(uRL0);
      assertNull(time0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Time time0 = Connections.getLastModified(uRL0);
      assertNull(time0);
  }
}
