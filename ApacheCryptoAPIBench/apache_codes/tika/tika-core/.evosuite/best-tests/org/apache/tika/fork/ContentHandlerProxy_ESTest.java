/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:36:07 GMT 2022
 */

package org.apache.tika.fork;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import org.apache.tika.fork.ContentHandlerProxy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ContentHandlerProxy_ESTest extends ContentHandlerProxy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ContentHandlerProxy contentHandlerProxy0 = new ContentHandlerProxy(3147);
      // Undeclared exception!
      try { 
        contentHandlerProxy0.startElement("", "", "", (Attributes) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.fork.ContentHandlerProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContentHandlerProxy contentHandlerProxy0 = new ContentHandlerProxy(2628);
      DataInputStream dataInputStream0 = mock(DataInputStream.class, new ViolatedAssumptionAnswer());
      DataOutputStream dataOutputStream0 = mock(DataOutputStream.class, new ViolatedAssumptionAnswer());
      contentHandlerProxy0.init(dataInputStream0, dataOutputStream0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContentHandlerProxy contentHandlerProxy0 = new ContentHandlerProxy(3567);
      // Undeclared exception!
      try { 
        contentHandlerProxy0.startDocument();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.fork.ContentHandlerProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ContentHandlerProxy contentHandlerProxy0 = new ContentHandlerProxy(0);
      // Undeclared exception!
      try { 
        contentHandlerProxy0.processingInstruction("xIprJ,-nC5.bXB", "xIprJ,-nC5.bXB");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.fork.ContentHandlerProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ContentHandlerProxy contentHandlerProxy0 = new ContentHandlerProxy(3092);
      // Undeclared exception!
      try { 
        contentHandlerProxy0.endDocument();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.fork.ContentHandlerProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ContentHandlerProxy contentHandlerProxy0 = new ContentHandlerProxy(0);
      // Undeclared exception!
      try { 
        contentHandlerProxy0.endElement("", (String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.fork.ContentHandlerProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ContentHandlerProxy contentHandlerProxy0 = new ContentHandlerProxy(5);
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        contentHandlerProxy0.ignorableWhitespace(charArray0, 5, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.fork.ContentHandlerProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContentHandlerProxy contentHandlerProxy0 = new ContentHandlerProxy(5);
      // Undeclared exception!
      try { 
        contentHandlerProxy0.startPrefixMapping("gkRy4W*#go}c.;dC", "gkRy4W*#go}c.;dC");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.fork.ContentHandlerProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ContentHandlerProxy contentHandlerProxy0 = new ContentHandlerProxy(3617);
      // Undeclared exception!
      try { 
        contentHandlerProxy0.skippedEntity(")z%:Fvf$hy");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.fork.ContentHandlerProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ContentHandlerProxy contentHandlerProxy0 = new ContentHandlerProxy(1);
      Locator locator0 = mock(Locator.class, new ViolatedAssumptionAnswer());
      contentHandlerProxy0.setDocumentLocator(locator0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContentHandlerProxy contentHandlerProxy0 = new ContentHandlerProxy(3);
      // Undeclared exception!
      try { 
        contentHandlerProxy0.endPrefixMapping((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.fork.ContentHandlerProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ContentHandlerProxy contentHandlerProxy0 = new ContentHandlerProxy(5);
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        contentHandlerProxy0.characters(charArray0, 2, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.fork.ContentHandlerProxy", e);
      }
  }
}