/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:01:18 GMT 2022
 */

package org.apache.tika.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.EmptyParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xml.sax.ContentHandler;
import org.xml.sax.ext.DefaultHandler2;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractParser_ESTest extends AbstractParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmptyParser emptyParser0 = new EmptyParser();
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      Metadata metadata0 = new Metadata();
      emptyParser0.parse((InputStream) null, (ContentHandler) defaultHandler2_0, metadata0);
      assertEquals(0, metadata0.size());
  }
}