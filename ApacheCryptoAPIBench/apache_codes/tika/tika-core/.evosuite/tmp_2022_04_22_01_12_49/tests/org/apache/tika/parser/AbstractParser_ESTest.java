/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:42:30 GMT 2022
 */

package org.apache.tika.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.PipedInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.DelegatingParser;
import org.apache.tika.parser.ErrorParser;
import org.apache.tika.sax.BasicContentHandlerFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xml.sax.ContentHandler;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.helpers.XMLFilterImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractParser_ESTest extends AbstractParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ErrorParser errorParser0 = new ErrorParser();
      PipedInputStream pipedInputStream0 = new PipedInputStream(21);
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      Metadata metadata0 = new Metadata();
      try { 
        errorParser0.parse((InputStream) pipedInputStream0, (ContentHandler) xMLFilterImpl0, metadata0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parse error
         //
         verifyException("org.apache.tika.parser.ErrorParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DelegatingParser delegatingParser0 = new DelegatingParser();
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.BODY;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, 63);
      ContentHandler contentHandler0 = basicContentHandlerFactory0.getNewContentHandler();
      // Undeclared exception!
      try { 
        delegatingParser0.parse((InputStream) null, contentHandler0, (Metadata) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.sax.XHTMLContentHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DelegatingParser delegatingParser0 = new DelegatingParser();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      Metadata metadata0 = new Metadata();
      delegatingParser0.parse((InputStream) pipedInputStream0, (ContentHandler) defaultHandler2_0, metadata0);
      assertEquals(0, metadata0.size());
  }
}
