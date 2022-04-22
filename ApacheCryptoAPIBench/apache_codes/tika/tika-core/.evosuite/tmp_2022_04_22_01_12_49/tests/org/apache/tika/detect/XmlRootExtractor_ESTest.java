/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:43:07 GMT 2022
 */

package org.apache.tika.detect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import javax.xml.namespace.QName;
import org.apache.tika.detect.XmlRootExtractor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class XmlRootExtractor_ESTest extends XmlRootExtractor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlRootExtractor xmlRootExtractor0 = new XmlRootExtractor();
      // Undeclared exception!
      try { 
        xmlRootExtractor0.extractRootElement((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlRootExtractor xmlRootExtractor0 = new XmlRootExtractor();
      QName qName0 = xmlRootExtractor0.extractRootElement((InputStream) null);
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmlRootExtractor xmlRootExtractor0 = new XmlRootExtractor();
      byte[] byteArray0 = new byte[0];
      QName qName0 = xmlRootExtractor0.extractRootElement(byteArray0);
      assertNull(qName0);
  }
}
