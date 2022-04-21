/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 20 11:23:25 GMT 2022
 */

package org.apache.activemq.artemis.utils.uri;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.apache.activemq.artemis.utils.uri.URISchema;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class URISchema_ESTest extends URISchema_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Map<String, String> map0 = URISchema.parseQuery("V/>n", (Map<String, String>) null);
      Map<String, String> map1 = URISchema.parseQuery("rD~;,le&p", map0);
      assertEquals(3, map1.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Map<String, String> map0 = URISchema.parseQuery("=", (Map<String, String>) null);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        URISchema.parseQuery("h%>L:)[='", (Map<String, String>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // URLDecoder: Illegal hex characters in escape (%) pattern - For input string: \">L\"
         //
         verifyException("java.net.URLDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Map<String, String> map0 = URISchema.parseQuery("\n", (Map<String, String>) null);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Map<String, String> map0 = URISchema.parseQuery("", (Map<String, String>) null);
      Map<String, String> map1 = URISchema.parseQuery("fruit://some:guy@port?color=green&fluentName=something", map0);
      assertEquals(2, map1.size());
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Map<String, String> map0 = URISchema.parseQuery("V/>n", (Map<String, String>) null);
      Map<String, String> map1 = URISchema.parseQuery((String) null, map0);
      assertFalse(map0.isEmpty());
      assertEquals(1, map1.size());
  }
}