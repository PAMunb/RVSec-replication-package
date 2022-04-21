/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 16:42:51 GMT 2022
 */

package org.apache.manifoldcf.core.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;
import org.apache.manifoldcf.core.interfaces.StringSet;
import org.apache.manifoldcf.core.interfaces.StringSetBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StringSet_ESTest extends StringSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringSet stringSet0 = new StringSet();
      StringSet stringSet1 = new StringSet(stringSet0, (String) null);
      boolean boolean0 = stringSet0.equals(stringSet1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringSet stringSet0 = new StringSet("");
      StringSet stringSet1 = new StringSet(stringSet0, "e$BW");
      assertFalse(stringSet1.equals((Object)stringSet0));
      assertEquals(1, stringSet1.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringSet stringSet0 = new StringSet(":");
      int int0 = stringSet0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[1];
      StringSet stringSet0 = new StringSet(stringArray0);
      stringSet0.getKeys();
      assertEquals(1, stringSet0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      StringSet stringSet0 = new StringSet(hashMap0);
      stringSet0.hashtable = null;
      // Undeclared exception!
      try { 
        stringSet0.size();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringSet stringSet0 = new StringSet("");
      stringSet0.hashtable = null;
      // Undeclared exception!
      try { 
        stringSet0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringSet stringSet0 = new StringSet();
      stringSet0.hashtable = null;
      // Undeclared exception!
      try { 
        stringSet0.getKeys();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[4];
      StringSet stringSet0 = new StringSet(stringArray0);
      stringSet0.hashtable = null;
      // Undeclared exception!
      try { 
        stringSet0.getDescriptiveString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[13];
      StringSet stringSet0 = new StringSet(stringArray0);
      HashMap<Object, LinkedList<StringSet>> hashMap0 = new HashMap<Object, LinkedList<StringSet>>();
      LinkedList<StringSet> linkedList0 = new LinkedList<StringSet>();
      hashMap0.put(stringSet0, linkedList0);
      stringSet0.hashtable = hashMap0;
      // Undeclared exception!
      try { 
        stringSet0.getDescriptiveString();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.manifoldcf.core.interfaces.StringSet cannot be cast to java.lang.String
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[4];
      StringSet stringSet0 = new StringSet(stringArray0);
      stringSet0.hashtable = null;
      // Undeclared exception!
      try { 
        stringSet0.getArray("@(#)$Id: StringSet.java 988245 2010-08-23 18:39:35Z kwright $");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringSet stringSet0 = new StringSet();
      HashMap<StringSet, LinkedList<Object>> hashMap0 = new HashMap<StringSet, LinkedList<Object>>();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      hashMap0.put(stringSet0, linkedList0);
      stringSet0.hashtable = hashMap0;
      // Undeclared exception!
      try { 
        stringSet0.getArray((String) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.manifoldcf.core.interfaces.StringSet cannot be cast to java.lang.String
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[3];
      StringSet stringSet0 = new StringSet(stringArray0);
      StringSetBuffer stringSetBuffer0 = new StringSetBuffer();
      StringSet stringSet1 = new StringSet(stringSetBuffer0);
      stringSet1.hashtable = null;
      // Undeclared exception!
      try { 
        stringSet0.contains(stringSet1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringSet stringSet0 = new StringSet();
      StringSet stringSet1 = new StringSet(stringSet0, (String) null);
      HashMap<TextStyle, LinkedList<StringSet>> hashMap0 = new HashMap<TextStyle, LinkedList<StringSet>>();
      TextStyle textStyle0 = TextStyle.FULL;
      LinkedList<StringSet> linkedList0 = new LinkedList<StringSet>();
      hashMap0.put(textStyle0, linkedList0);
      stringSet1.hashtable = hashMap0;
      // Undeclared exception!
      try { 
        stringSet0.contains(stringSet1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.time.format.TextStyle cannot be cast to java.lang.String
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringSet stringSet0 = null;
      try {
        stringSet0 = new StringSet((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringSet stringSet0 = null;
      try {
        stringSet0 = new StringSet((StringSetBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringSet stringSet0 = null;
      try {
        stringSet0 = new StringSet((StringSet) null, "gZY3m");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringSet stringSet0 = null;
      try {
        stringSet0 = new StringSet((Vector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Object object0 = new Object();
      vector0.add(object0);
      StringSet stringSet0 = null;
      try {
        stringSet0 = new StringSet(vector0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringSet stringSet0 = null;
      try {
        stringSet0 = new StringSet((Map) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<TextStyle, Object> hashMap0 = new HashMap<TextStyle, Object>();
      TextStyle textStyle0 = TextStyle.FULL_STANDALONE;
      hashMap0.put(textStyle0, textStyle0);
      StringSet stringSet0 = null;
      try {
        stringSet0 = new StringSet(hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.time.format.TextStyle cannot be cast to java.lang.String
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[7];
      StringSet stringSet0 = new StringSet(stringArray0);
      String[] stringArray1 = stringSet0.getArray((String) null);
      assertEquals(1, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringSet stringSet0 = new StringSet("nKie#");
      boolean boolean0 = stringSet0.contains("nKie#");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "GjDC!U4s_]!X}%";
      StringSet stringSet0 = new StringSet(stringArray0);
      String string0 = stringSet0.getDescriptiveString();
      assertNotNull(string0);
      assertEquals(":GjDC!U4s_]!X}%", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringSet stringSet0 = new StringSet();
      stringSet0.getDescriptiveString();
      String string0 = stringSet0.getDescriptiveString();
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringSetBuffer stringSetBuffer0 = new StringSetBuffer();
      StringSet stringSet0 = new StringSet(stringSetBuffer0);
      boolean boolean0 = stringSet0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringSet stringSet0 = new StringSet((String) null);
      StringSet stringSet1 = new StringSet(stringSet0, (String) null);
      assertTrue(stringSet1.equals((Object)stringSet0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringSet stringSet0 = new StringSet(":");
      String[] stringArray0 = stringSet0.getArray("");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringSetBuffer stringSetBuffer0 = new StringSetBuffer();
      StringSet stringSet0 = new StringSet(stringSetBuffer0);
      String[] stringArray0 = stringSet0.getArray("");
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringSetBuffer stringSetBuffer0 = new StringSetBuffer();
      StringSet stringSet0 = new StringSet(stringSetBuffer0);
      StringSet stringSet1 = new StringSet(":");
      boolean boolean0 = stringSet0.contains(stringSet1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringSetBuffer stringSetBuffer0 = new StringSetBuffer();
      StringSet stringSet0 = new StringSet(stringSetBuffer0);
      boolean boolean0 = stringSet0.contains("@(#)$Id: StringSetBuffer.java 988245 2010-08-23 18:39:35Z kwright $");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TextStyle textStyle0 = TextStyle.NARROW;
      HashMap<TextStyle, Object> hashMap0 = new HashMap<TextStyle, Object>();
      hashMap0.put(textStyle0, ":");
      StringSet stringSet0 = new StringSet(hashMap0);
      assertEquals(1, stringSet0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      vector0.add((Object) "nKie#");
      StringSet stringSet0 = new StringSet(vector0);
      assertEquals(1, stringSet0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringSetBuffer stringSetBuffer0 = new StringSetBuffer();
      StringSet stringSet0 = new StringSet("@(#)$Id: StringSetBuffer.java 988245 2010-08-23 18:39:35Z kwright $");
      stringSetBuffer0.add(stringSet0, "");
      StringSet stringSet1 = new StringSet(stringSetBuffer0);
      assertTrue(stringSet1.equals((Object)stringSet0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringSetBuffer stringSetBuffer0 = new StringSetBuffer();
      StringSet stringSet0 = new StringSet(stringSetBuffer0);
      int int0 = stringSet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringSetBuffer stringSetBuffer0 = new StringSetBuffer();
      StringSet stringSet0 = new StringSet(stringSetBuffer0);
      stringSet0.hashCode();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringSet stringSet0 = new StringSet("xh|B <");
      boolean boolean0 = stringSet0.contains(stringSet0);
      assertTrue(boolean0);
  }
}
