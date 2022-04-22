/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:36:15 GMT 2022
 */

package org.apache.tika.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.io.TaggedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TaggedInputStream_ESTest extends TaggedInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TaggedInputStream taggedInputStream0 = TaggedInputStream.get((InputStream) null);
      // Undeclared exception!
      try { 
        taggedInputStream0.handleIOException((IOException) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.io.TaggedIOException", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      TaggedInputStream taggedInputStream0 = new TaggedInputStream(inputStream0);
      Exception exception0 = mock(Exception.class, new ViolatedAssumptionAnswer());
      taggedInputStream0.throwIfCauseOf(exception0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(inputStream0).toString();
      TaggedInputStream taggedInputStream0 = new TaggedInputStream(inputStream0);
      TaggedInputStream taggedInputStream1 = TaggedInputStream.get(taggedInputStream0);
      assertSame(taggedInputStream0, taggedInputStream1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TaggedInputStream taggedInputStream0 = TaggedInputStream.get((InputStream) null);
      assertNotNull(taggedInputStream0);
      
      boolean boolean0 = taggedInputStream0.isCauseOf((IOException) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      TaggedInputStream taggedInputStream0 = new TaggedInputStream(inputStream0);
      IOException iOException0 = mock(IOException.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(iOException0).getMessage();
      try { 
        taggedInputStream0.handleIOException(iOException0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.io.TaggedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(inputStream0).toString();
      TaggedInputStream taggedInputStream0 = new TaggedInputStream(inputStream0);
      String string0 = taggedInputStream0.toString();
      assertEquals("Tika Tagged InputStream wrapping null", string0);
  }
}
