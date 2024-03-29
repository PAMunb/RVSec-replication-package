/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:42:58 GMT 2022
 */

package org.apache.tika.sax;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tika.sax.EndDocumentShieldingContentHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xml.sax.ContentHandler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EndDocumentShieldingContentHandler_ESTest extends EndDocumentShieldingContentHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EndDocumentShieldingContentHandler endDocumentShieldingContentHandler0 = new EndDocumentShieldingContentHandler((ContentHandler) null);
      // Undeclared exception!
      try { 
        endDocumentShieldingContentHandler0.reallyEndDocument();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.ContentHandlerDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContentHandler contentHandler0 = mock(ContentHandler.class, new ViolatedAssumptionAnswer());
      EndDocumentShieldingContentHandler endDocumentShieldingContentHandler0 = new EndDocumentShieldingContentHandler(contentHandler0);
      endDocumentShieldingContentHandler0.reallyEndDocument();
      assertFalse(endDocumentShieldingContentHandler0.getEndDocumentWasCalled());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ContentHandler contentHandler0 = mock(ContentHandler.class, new ViolatedAssumptionAnswer());
      EndDocumentShieldingContentHandler endDocumentShieldingContentHandler0 = new EndDocumentShieldingContentHandler(contentHandler0);
      boolean boolean0 = endDocumentShieldingContentHandler0.getEndDocumentWasCalled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContentHandler contentHandler0 = mock(ContentHandler.class, new ViolatedAssumptionAnswer());
      EndDocumentShieldingContentHandler endDocumentShieldingContentHandler0 = new EndDocumentShieldingContentHandler(contentHandler0);
      assertFalse(endDocumentShieldingContentHandler0.getEndDocumentWasCalled());
      
      endDocumentShieldingContentHandler0.endDocument();
      boolean boolean0 = endDocumentShieldingContentHandler0.getEndDocumentWasCalled();
      assertTrue(boolean0);
  }
}
