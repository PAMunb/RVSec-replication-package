/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 13:54:54 GMT 2022
 */

package org.apache.tika.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.apache.tika.io.TaggedIOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TaggedIOException_ESTest extends TaggedIOException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockIOException mockIOException0 = new MockIOException("^!", (Throwable) null);
      TaggedIOException taggedIOException0 = new TaggedIOException(mockIOException0, (Object) null);
      Object object0 = taggedIOException0.getTag();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      TaggedIOException taggedIOException0 = null;
      try {
        taggedIOException0 = new TaggedIOException((IOException) null, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.io.TaggedIOException", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockIOException mockIOException0 = new MockIOException();
      Object object0 = new Object();
      TaggedIOException taggedIOException0 = new TaggedIOException(mockIOException0, object0);
      Object object1 = taggedIOException0.getTag();
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockIOException mockIOException0 = new MockIOException();
      Object object0 = new Object();
      TaggedIOException taggedIOException0 = new TaggedIOException(mockIOException0, object0);
      IOException iOException0 = taggedIOException0.getCause();
      assertSame(mockIOException0, iOException0);
  }
}
