/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 13:18:51 GMT 2022
 */

package org.apache.activemq.artemis.utils.uri;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.apache.activemq.artemis.utils.uri.URISchema;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class URISchema_ESTest extends URISchema_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Map<String, String> map0 = URISchema.parseQuery("$&7c|q;4!EDLALy|?P", hashMap0);
      assertEquals(2, map0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Map<String, String> map0 = URISchema.parseQuery("org.apache.activemq.artemis.utils.uri.BeanSupport", (Map<String, String>) null);
      Map<String, String> map1 = URISchema.parseQuery("=", map0);
      assertEquals(1, map0.size());
      assertEquals(2, map1.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put((String) null, (String) null);
      Map<String, String> map0 = URISchema.parseQuery((String) null, hashMap0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Map<String, String> map0 = URISchema.parseQuery("&b6h:3i=q<BW", hashMap0);
      assertEquals(1, map0.size());
      assertEquals(0, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Map<String, String> map0 = URISchema.parseQuery("", hashMap0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        URISchema.parseQuery("%4=you", hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // URLDecoder: Incomplete trailing escape (%) pattern
         //
         verifyException("java.net.URLDecoder", e);
      }
  }
}
