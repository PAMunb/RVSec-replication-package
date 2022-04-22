/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 20:56:14 GMT 2022
 */

package org.apache.manifoldcf.core.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;
import org.apache.manifoldcf.core.interfaces.StringSet;
import org.apache.manifoldcf.core.interfaces.StringSetBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StringSet_ESTest extends StringSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[6];
      StringSet stringSet0 = new StringSet(stringArray0);
      StringSet stringSet1 = new StringSet(stringArray0);
      stringSet0.equals(stringSet1);
      assertEquals(1, stringSet1.size());
      assertEquals(1, stringSet0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringSet stringSet0 = new StringSet("@(#)$Id: StringSetBuffer.java 988245 2010-08-23 18:39:35Z kwright $");
      StringSet stringSet1 = new StringSet(stringSet0, "@(#)$Id: StringSet.java 988245 2010-08-23 18:39:35Z kwright $");
      assertEquals(1, stringSet1.size());
      assertFalse(stringSet1.equals((Object)stringSet0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringSetBuffer stringSetBuffer0 = new StringSetBuffer();
      stringSetBuffer0.add("@(#)$Id: StringSetBuffer.java 988245 2010-08-23 18:39:35Z kwright $", "@(#)$Id: StringSetBuffer.java 988245 2010-08-23 18:39:35Z kwright $");
      StringSet stringSet0 = new StringSet(stringSetBuffer0);
      assertEquals(1, stringSet0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[2];
      StringSet stringSet0 = new StringSet(stringArray0);
      HashMap<Object, PriorityQueue<StringSet>> hashMap0 = new HashMap<Object, PriorityQueue<StringSet>>();
      stringSet0.hashtable = hashMap0;
      int int0 = stringSet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringSet stringSet0 = new StringSet("");
      HashMap<DayOfWeek, StringSet> hashMap0 = new HashMap<DayOfWeek, StringSet>();
      stringSet0.hashtable = hashMap0;
      String[] stringArray0 = stringSet0.getArray("");
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[21];
      StringSet stringSet0 = new StringSet(stringArray0);
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
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[6];
      StringSet stringSet0 = new StringSet(stringArray0);
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
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "%`_uo";
      StringSet stringSet0 = new StringSet(stringArray0);
      // Undeclared exception!
      try { 
        stringSet0.getDescriptiveString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[9];
      StringSet stringSet0 = new StringSet(stringArray0);
      HashMap<DayOfWeek, DayOfWeek> hashMap0 = new HashMap<DayOfWeek, DayOfWeek>();
      DayOfWeek dayOfWeek0 = DayOfWeek.TUESDAY;
      hashMap0.put(dayOfWeek0, dayOfWeek0);
      HashMap<StringSet, Object> hashMap1 = new HashMap<StringSet, Object>();
      stringSet0.hashtable = hashMap1;
      stringSet0.hashtable = hashMap0;
      // Undeclared exception!
      try { 
        stringSet0.getDescriptiveString();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.time.DayOfWeek cannot be cast to java.lang.String
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringSet stringSet0 = new StringSet();
      stringSet0.hashtable = null;
      // Undeclared exception!
      try { 
        stringSet0.getArray("JJfgZM,");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringSet stringSet0 = new StringSet();
      // Undeclared exception!
      try { 
        stringSet0.contains((StringSet) null);
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      StringSet stringSet0 = null;
      try {
        stringSet0 = new StringSet((StringSet) null, "@(#)$Id: StringSet.java 988245 2010-08-23 18:39:35Z kwright $");
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
  public void test16()  throws Throwable  {
      Vector<DayOfWeek> vector0 = new Vector<DayOfWeek>();
      DayOfWeek dayOfWeek0 = DayOfWeek.TUESDAY;
      vector0.add(dayOfWeek0);
      StringSet stringSet0 = null;
      try {
        stringSet0 = new StringSet(vector0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.time.DayOfWeek cannot be cast to java.lang.String
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      HashMap<StringSet, Object> hashMap0 = new HashMap<StringSet, Object>();
      StringSet stringSet0 = new StringSet();
      hashMap0.put(stringSet0, stringSet0);
      StringSet stringSet1 = null;
      try {
        stringSet1 = new StringSet(hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.manifoldcf.core.interfaces.StringSet cannot be cast to java.lang.String
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[2];
      StringSet stringSet0 = new StringSet(stringArray0);
      String[] stringArray1 = stringSet0.getArray((String) null);
      assertEquals(1, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Yrs`-lBe>K*~-<`";
      stringArray0[1] = "*";
      StringSet stringSet0 = new StringSet(stringArray0);
      String string0 = stringSet0.getDescriptiveString();
      assertEquals("*:Yrs`-lBe>K*~-<`", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringSet stringSet0 = new StringSet("");
      stringSet0.getDescriptiveString();
      String string0 = stringSet0.getDescriptiveString();
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringSet stringSet0 = new StringSet("");
      boolean boolean0 = stringSet0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringSet stringSet0 = new StringSet("@(#)$Id: StringSetBuffer.java 988245 2010-08-23 18:39:35Z kwright $");
      StringSet stringSet1 = new StringSet(stringSet0, (String) null);
      assertTrue(stringSet1.equals((Object)stringSet0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringSet stringSet0 = new StringSet("[bE:tS2ZpL1CnJ");
      String[] stringArray0 = stringSet0.getArray("[bE:tS2ZpL1CnJ");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringSet stringSet0 = new StringSet("@(#)$Id: StringSetBuffer.java 988245 2010-08-23 18:39:35Z kwright $");
      boolean boolean0 = stringSet0.contains(stringSet0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringSet stringSet0 = new StringSet("");
      boolean boolean0 = stringSet0.contains("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[6];
      StringSet stringSet0 = new StringSet(stringArray0);
      boolean boolean0 = stringSet0.contains(stringSet0);
      assertEquals(1, stringSet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HashMap<StringSet, Object> hashMap0 = new HashMap<StringSet, Object>();
      String[] stringArray0 = new String[5];
      StringSet stringSet0 = new StringSet(stringArray0);
      hashMap0.put(stringSet0, "");
      StringSet stringSet1 = new StringSet(hashMap0);
      assertFalse(stringSet1.equals((Object)stringSet0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashMap<StringSet, Object> hashMap0 = new HashMap<StringSet, Object>();
      StringSet stringSet0 = new StringSet(hashMap0);
      boolean boolean0 = stringSet0.contains("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Stack<Object> stack0 = new Stack<Object>();
      stack0.add((Object) ".7$`@gaQhQU}s%iL");
      StringSet stringSet0 = new StringSet(stack0);
      assertEquals(1, stringSet0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      StringSet stringSet0 = new StringSet(vector0);
      HashMap<Object, StringSet> hashMap0 = new HashMap<Object, StringSet>();
      stringSet0.hashtable = hashMap0;
      LocalDate localDate0 = MockLocalDate.now();
      hashMap0.put(localDate0, stringSet0);
      // Undeclared exception!
      try { 
        stringSet0.getArray("-");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.time.LocalDate cannot be cast to java.lang.String
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringSetBuffer stringSetBuffer0 = new StringSetBuffer();
      StringSet stringSet0 = new StringSet(stringSetBuffer0);
      HashMap<DayOfWeek, Object> hashMap0 = new HashMap<DayOfWeek, Object>();
      stringSet0.hashtable = hashMap0;
      DayOfWeek dayOfWeek0 = DayOfWeek.THURSDAY;
      hashMap0.put(dayOfWeek0, stringSet0.hashtable);
      // Undeclared exception!
      try { 
        stringSet0.hashCode();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringSet stringSet0 = new StringSet();
      StringSet stringSet1 = new StringSet();
      HashMap<DayOfWeek, Object> hashMap0 = new HashMap<DayOfWeek, Object>();
      stringSet1.hashtable = hashMap0;
      DayOfWeek dayOfWeek0 = DayOfWeek.TUESDAY;
      hashMap0.put(dayOfWeek0, (Object) null);
      // Undeclared exception!
      try { 
        stringSet0.contains(stringSet1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.time.DayOfWeek cannot be cast to java.lang.String
         //
         verifyException("org.apache.manifoldcf.core.interfaces.StringSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringSet stringSet0 = new StringSet("");
      int int0 = stringSet0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[2];
      StringSet stringSet0 = new StringSet(stringArray0);
      stringSet0.hashCode();
      assertEquals(1, stringSet0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[9];
      StringSet stringSet0 = new StringSet(stringArray0);
      stringSet0.getKeys();
      assertEquals(1, stringSet0.size());
  }
}
