/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:41:02 GMT 2022
 */

package org.apache.manifoldcf.core.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StringReader;
import org.apache.manifoldcf.core.interfaces.CharacterInput;
import org.apache.manifoldcf.core.interfaces.TempFileCharacterInput;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TempFileCharacterInput_ESTest extends TempFileCharacterInput_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      TempFileCharacterInput tempFileCharacterInput0 = null;
      try {
        tempFileCharacterInput0 = new TempFileCharacterInput(mockFile0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.system.ManifoldCF", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput();
      MockFile mockFile0 = new MockFile("@(#)$Id: CharacterInput.java 988245 2010-08-23 18:39:35Z kwright $", "c~ c*Jzu3vA");
      File file0 = MockFile.createTempFile("@(#)$Id: CharacterInput.java 988245 2010-08-23 18:39:35Z kwright $", "@(#)$Id$", (File) mockFile0);
      tempFileCharacterInput0.file = file0;
      tempFileCharacterInput0.openStream();
      assertEquals(0L, tempFileCharacterInput0.getUtf8StreamLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput();
      byte[] byteArray0 = new byte[9];
      tempFileCharacterInput0.inMemoryBuffer = byteArray0;
      tempFileCharacterInput0.calculateHashValue();
      assertEquals(9L, tempFileCharacterInput0.getUtf8StreamLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8w#GTax5OsF0qRFE|8");
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput(stringReader0, 2449L);
      long long0 = tempFileCharacterInput0.getUtf8StreamLength();
      assertEquals(18L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput();
      // Undeclared exception!
      try { 
        tempFileCharacterInput0.calculateLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@(#)$Id: CharacterInput.java 988245 2010-08-23 18:39:35Z kwright $");
      TempFileCharacterInput tempFileCharacterInput0 = null;
      try {
        tempFileCharacterInput0 = new TempFileCharacterInput(stringReader0, (-2008), (-2008));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      TempFileCharacterInput tempFileCharacterInput0 = null;
      try {
        tempFileCharacterInput0 = new TempFileCharacterInput(pipedReader0, 19, 19);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TempFileCharacterInput tempFileCharacterInput0 = null;
      try {
        tempFileCharacterInput0 = new TempFileCharacterInput((Reader) null, (-1528L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.TempFileCharacterInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@(#)$Id$");
      TempFileCharacterInput tempFileCharacterInput0 = null;
      try {
        tempFileCharacterInput0 = new TempFileCharacterInput(stringReader0, (-1725L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader(14950);
      TempFileCharacterInput tempFileCharacterInput0 = null;
      try {
        tempFileCharacterInput0 = new TempFileCharacterInput(pipedReader0, 14950);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TempFileCharacterInput tempFileCharacterInput0 = null;
      try {
        tempFileCharacterInput0 = new TempFileCharacterInput((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.TempFileCharacterInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      TempFileCharacterInput tempFileCharacterInput0 = null;
      try {
        tempFileCharacterInput0 = new TempFileCharacterInput(pipedReader0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("opening backing file");
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput(stringReader0, 178L);
      tempFileCharacterInput0.calculateLength();
      assertEquals(20L, tempFileCharacterInput0.getUtf8StreamLength());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("b*NNu]>_+");
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput(stringReader0, 1261L);
      MockFile mockFile0 = new MockFile("Doubles.stringConverter()", "");
      tempFileCharacterInput0.file = (File) mockFile0;
      try { 
        tempFileCharacterInput0.calculateLength();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO exception while scanning file: null
         //
         verifyException("org.apache.manifoldcf.core.interfaces.CharacterInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput();
      MockFile mockFile0 = new MockFile("com.google.common.base.CharMatcher$RangesMatcher", "c~ c*Jzu3vA");
      tempFileCharacterInput0.file = (File) mockFile0;
      // Undeclared exception!
      try { 
        tempFileCharacterInput0.discard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.system.ManifoldCF", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("opening backing file");
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput(stringReader0, 178L);
      tempFileCharacterInput0.discard();
      assertEquals(20L, tempFileCharacterInput0.getUtf8StreamLength());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput(pipedReader0, 0L);
      tempFileCharacterInput0.openStream();
      assertEquals(0L, tempFileCharacterInput0.getUtf8StreamLength());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput();
      MockFile mockFile0 = new MockFile("@(#)$Id: CharacterInput.java 988245 2010-08-23 18:39:35Z kwright $", "c~ c*Jzu3vA");
      tempFileCharacterInput0.file = (File) mockFile0;
      try { 
        tempFileCharacterInput0.openStream();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Can't create stream: null
         //
         verifyException("org.apache.manifoldcf.core.interfaces.TempFileCharacterInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput();
      tempFileCharacterInput0.openStream();
      assertEquals(0L, tempFileCharacterInput0.getUtf8StreamLength());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput();
      long long0 = tempFileCharacterInput0.getUtf8StreamLength();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput();
      MockFile mockFile0 = new MockFile("@(#)$Id: CharacterInput.java 988245 2010-08-23 18:39:35Z kwright $", "c~ c*Jzu3vA");
      tempFileCharacterInput0.file = (File) mockFile0;
      long long0 = tempFileCharacterInput0.getUtf8StreamLength();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput();
      InputStream inputStream0 = tempFileCharacterInput0.getUtf8Stream();
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("b*NNu]>_+");
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput(stringReader0, 1261L);
      MockFile mockFile0 = new MockFile("Doubles.stringConverter()", "");
      tempFileCharacterInput0.file = (File) mockFile0;
      try { 
        tempFileCharacterInput0.getUtf8Stream();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No such file: null
         //
         verifyException("org.apache.manifoldcf.core.interfaces.TempFileCharacterInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput(stringReader0, 1L);
      InputStream inputStream0 = tempFileCharacterInput0.getUtf8Stream();
      assertNotNull(inputStream0);
      assertEquals(0, inputStream0.available());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@(#)$Id: TempFileCharacterInput.java 988245 2010-08-23 18:39:35Z kwright $");
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput(stringReader0, 1, 1);
      assertEquals(1L, tempFileCharacterInput0.getUtf8StreamLength());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      TempFileCharacterInput tempFileCharacterInput0 = null;
      try {
        tempFileCharacterInput0 = new TempFileCharacterInput(stringReader0, 9223372036854775807L, (-778));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.system.ManifoldCF", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput();
      // Undeclared exception!
      try { 
        tempFileCharacterInput0.calculateHashValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("b*NNu]>_+");
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput(stringReader0, 1261L);
      assertEquals(9L, tempFileCharacterInput0.getUtf8StreamLength());
      
      CharacterInput characterInput0 = tempFileCharacterInput0.transfer();
      assertEquals(9L, characterInput0.getUtf8StreamLength());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@(#)$Id: CharacterInput.java 988245 2010-08-23 18:39:35Z kwright $");
      TempFileCharacterInput tempFileCharacterInput0 = new TempFileCharacterInput(stringReader0);
      assertEquals(66L, tempFileCharacterInput0.getUtf8StreamLength());
  }
}