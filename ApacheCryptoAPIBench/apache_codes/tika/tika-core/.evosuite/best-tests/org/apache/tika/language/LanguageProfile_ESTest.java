/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:29:11 GMT 2022
 */

package org.apache.tika.language;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.tika.language.LanguageProfile;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LanguageProfile_ESTest extends LanguageProfile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile();
      assertEquals(0L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      languageProfile0.add("Ups", 65536L);
      assertEquals(65536L, languageProfile0.getCount());
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      double double0 = languageProfile0.distance(languageProfile0);
      assertEquals(65536L, languageProfile0.getCount());
      assertEquals(0.0, double0, 0.01);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile();
      assertEquals(0L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      LanguageProfile languageProfile1 = new LanguageProfile(0);
      assertEquals(0L, languageProfile1.getCount());
      assertNotNull(languageProfile1);
      assertFalse(languageProfile1.equals((Object)languageProfile0));
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      // Undeclared exception!
      try { 
        languageProfile0.distance(languageProfile1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unable to calculage distance of language profiles with different ngram lengths: 0 != 3
         //
         verifyException("org.apache.tika.language.LanguageProfile", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile((-1));
      assertEquals(0L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      LanguageProfile languageProfile1 = new LanguageProfile();
      assertEquals(0L, languageProfile1.getCount());
      assertNotNull(languageProfile1);
      assertFalse(languageProfile1.equals((Object)languageProfile0));
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      // Undeclared exception!
      try { 
        languageProfile0.distance(languageProfile1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unable to calculage distance of language profiles with different ngram lengths: 3 != -1
         //
         verifyException("org.apache.tika.language.LanguageProfile", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile("MvRSEagTHCk^B");
      assertEquals(11L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      LanguageProfile.useInterleaved = false;
      double double0 = languageProfile0.distance(languageProfile0);
      assertEquals(11L, languageProfile0.getCount());
      assertEquals(0.0, double0, 0.01);
      assertFalse(LanguageProfile.useInterleaved);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile("MvRSEagTHCk^B");
      assertEquals(11L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      LanguageProfile languageProfile1 = new LanguageProfile();
      assertEquals(0L, languageProfile1.getCount());
      assertNotNull(languageProfile1);
      assertFalse(languageProfile1.equals((Object)languageProfile0));
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      LanguageProfile.useInterleaved = false;
      double double0 = languageProfile1.distance(languageProfile0);
      assertEquals(11L, languageProfile0.getCount());
      assertEquals(0L, languageProfile1.getCount());
      assertFalse(languageProfile0.equals((Object)languageProfile1));
      assertFalse(languageProfile1.equals((Object)languageProfile0));
      assertEquals(0.30151134457776363, double0, 0.01);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertFalse(LanguageProfile.useInterleaved);
      assertFalse(LanguageProfile.useInterleaved);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertNotSame(languageProfile0, languageProfile1);
      assertNotSame(languageProfile1, languageProfile0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile(";C", 544);
      assertEquals(0L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      LanguageProfile.useInterleaved = false;
      LanguageProfile languageProfile1 = new LanguageProfile(209);
      assertEquals(0L, languageProfile1.getCount());
      assertNotNull(languageProfile1);
      assertFalse(languageProfile1.equals((Object)languageProfile0));
      assertFalse(LanguageProfile.useInterleaved);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      
      // Undeclared exception!
      try { 
        languageProfile1.distance(languageProfile0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unable to calculage distance of language profiles with different ngram lengths: 544 != 209
         //
         verifyException("org.apache.tika.language.LanguageProfile", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile("MvRSEagTHCk^B");
      assertEquals(11L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      // Undeclared exception!
      try { 
        languageProfile0.add("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unable to add an ngram of incorrect length: 0 != 3
         //
         verifyException("org.apache.tika.language.LanguageProfile", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile();
      assertEquals(0L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      languageProfile0.add("Ups", (-408L));
      assertEquals((-408L), languageProfile0.getCount());
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      long long0 = languageProfile0.getCount("Ups");
      assertEquals((-408L), languageProfile0.getCount());
      assertEquals((-408L), long0);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile("L6");
      assertEquals(1L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      long long0 = languageProfile0.getCount();
      assertEquals(1L, languageProfile0.getCount());
      assertEquals(1L, long0);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile();
      assertEquals(0L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      languageProfile0.add("Ups", (-1445L));
      assertEquals((-1445L), languageProfile0.getCount());
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      long long0 = languageProfile0.getCount();
      assertEquals((-1445L), languageProfile0.getCount());
      assertEquals((-1445L), long0);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile();
      assertEquals(0L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertTrue(LanguageProfile.useInterleaved);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      
      // Undeclared exception!
      try { 
        languageProfile0.distance((LanguageProfile) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.language.LanguageProfile", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile((-2796));
      assertEquals(0L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      // Undeclared exception!
      try { 
        languageProfile0.distance(languageProfile0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.language.LanguageProfile$Interleaved$Entry", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile(0);
      assertEquals(0L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      // Undeclared exception!
      try { 
        languageProfile0.add((String) null, (long) 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.language.LanguageProfile", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile();
      assertEquals(0L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      // Undeclared exception!
      try { 
        languageProfile0.add((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.language.LanguageProfile", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile();
      assertEquals(0L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertTrue(LanguageProfile.useInterleaved);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      
      // Undeclared exception!
      try { 
        languageProfile0.add("Ap'AG5X!a.]H!h");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unable to add an ngram of incorrect length: 14 != 3
         //
         verifyException("org.apache.tika.language.LanguageProfile", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LanguageProfile languageProfile0 = null;
      try {
        languageProfile0 = new LanguageProfile((String) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.language.LanguageProfile", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LanguageProfile languageProfile0 = null;
      try {
        languageProfile0 = new LanguageProfile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.language.LanguageProfile", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile("", 0);
      assertEquals(0L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertTrue(LanguageProfile.useInterleaved);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      
      languageProfile0.add("", 0L);
      assertEquals(0L, languageProfile0.getCount());
      assertTrue(LanguageProfile.useInterleaved);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      
      languageProfile0.add("", 0L);
      assertEquals(0L, languageProfile0.getCount());
      assertTrue(LanguageProfile.useInterleaved);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile("MvRSEagTHCk^B");
      assertEquals(11L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      // Undeclared exception!
      try { 
        languageProfile0.add("MvRSEagTHCk^B", 0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unable to add an ngram of incorrect length: 13 != 3
         //
         verifyException("org.apache.tika.language.LanguageProfile", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile();
      assertEquals(0L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertTrue(LanguageProfile.useInterleaved);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      
      languageProfile0.add("V<[", (-605L));
      assertEquals((-605L), languageProfile0.getCount());
      assertTrue(LanguageProfile.useInterleaved);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      
      double double0 = languageProfile0.distance(languageProfile0);
      assertEquals((-605L), languageProfile0.getCount());
      assertEquals(0.0, double0, 0.01);
      assertTrue(LanguageProfile.useInterleaved);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile();
      assertEquals(0L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertTrue(LanguageProfile.useInterleaved);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      
      languageProfile0.add("Ups");
      assertEquals(1L, languageProfile0.getCount());
      assertTrue(LanguageProfile.useInterleaved);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      
      long long0 = languageProfile0.getCount("Ups");
      assertEquals(1L, languageProfile0.getCount());
      assertEquals(1L, long0);
      assertTrue(LanguageProfile.useInterleaved);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile();
      assertEquals(0L, languageProfile0.getCount());
      assertNotNull(languageProfile0);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      languageProfile0.add("Ups");
      assertEquals(1L, languageProfile0.getCount());
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      double double0 = languageProfile0.distance(languageProfile0);
      assertEquals(1L, languageProfile0.getCount());
      assertEquals(0.0, double0, 0.01);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      languageProfile0.add("Ups");
      assertEquals(2L, languageProfile0.getCount());
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
      
      double double1 = languageProfile0.distance(languageProfile0);
      assertEquals(2L, languageProfile0.getCount());
      assertEquals(double1, double0, 0.01);
      assertEquals(0.0, double1, 0.01);
      assertEquals(3, LanguageProfile.DEFAULT_NGRAM_LENGTH);
      assertTrue(LanguageProfile.useInterleaved);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile();
      languageProfile0.distance(languageProfile0);
      languageProfile0.add("[w3");
      double double0 = languageProfile0.distance(languageProfile0);
      assertEquals(1L, languageProfile0.getCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile("I6");
      LanguageProfile languageProfile1 = new LanguageProfile("Unable to calculage distance of language profiles with different ngram lengths: ", 3);
      double double0 = languageProfile1.distance(languageProfile0);
      assertEquals(1.0079699698937505, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile();
      LanguageProfile languageProfile1 = new LanguageProfile(",>@|)bOmIg9*", 3);
      double double0 = languageProfile0.distance(languageProfile1);
      assertEquals(0.447213595499958, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile(29);
      LanguageProfile languageProfile1 = new LanguageProfile(3);
      LanguageProfile.useInterleaved = false;
      // Undeclared exception!
      try { 
        languageProfile0.distance(languageProfile1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unable to calculage distance of language profiles with different ngram lengths: 3 != 29
         //
         verifyException("org.apache.tika.language.LanguageProfile", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LanguageProfile languageProfile0 = null;
      try {
        languageProfile0 = new LanguageProfile("MvRSEagTHCk^B", 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unable to add an ngram of incorrect length: 3 != 0
         //
         verifyException("org.apache.tika.language.LanguageProfile", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile();
      long long0 = languageProfile0.getCount("`>k{5Sq9sKJ");
      assertEquals(0L, languageProfile0.getCount());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile();
      languageProfile0.toString();
      assertEquals(0L, languageProfile0.getCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LanguageProfile languageProfile0 = new LanguageProfile();
      long long0 = languageProfile0.getCount();
      assertEquals(0L, long0);
  }
}
