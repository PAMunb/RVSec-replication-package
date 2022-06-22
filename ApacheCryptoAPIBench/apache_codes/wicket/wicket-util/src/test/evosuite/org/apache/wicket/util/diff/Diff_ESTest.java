/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 01:57:23 GMT 2022
 */

package org.apache.wicket.util.diff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.wicket.util.diff.Diff;
import org.apache.wicket.util.diff.DiffAlgorithm;
import org.apache.wicket.util.diff.Revision;
import org.apache.wicket.util.diff.myers.MyersDiff;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Diff_ESTest extends Diff_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Random.setNextRandom(4244);
      Object[] objectArray1 = Diff.randomEdit(objectArray0, (long) 4244);
      assertEquals(2, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      Object[] objectArray1 = Diff.randomSequence(618);
      boolean boolean0 = Diff.compare(objectArray0, objectArray1);
      assertEquals(618, objectArray1.length);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = Diff.randomSequence(0);
      Object[] objectArray1 = Diff.randomEdit(objectArray0);
      Object[] objectArray2 = Diff.shuffle(objectArray1, (-1L));
      assertEquals(0, objectArray2.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Object[] objectArray1 = Diff.shuffle(objectArray0);
      assertEquals(0, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = Diff.randomSequence(0, (-1L));
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Object[] objectArray1 = Diff.editAll(objectArray0);
      assertEquals(0, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      MyersDiff myersDiff0 = new MyersDiff();
      Revision revision0 = Diff.diff(objectArray0, objectArray0, (DiffAlgorithm) myersDiff0);
      assertEquals(0, revision0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = objectArray0[0];
      objectArray0[2] = objectArray0[1];
      MyersDiff myersDiff0 = new MyersDiff();
      Object[] objectArray1 = new Object[2];
      objectArray1[0] = object0;
      objectArray1[1] = objectArray0[2];
      Revision revision0 = Diff.diff(objectArray1, objectArray0, (DiffAlgorithm) myersDiff0);
      assertEquals(1, revision0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Object[] objectArray1 = new Object[1];
      Revision revision0 = Diff.diff(objectArray0, objectArray1);
      assertEquals(1, revision0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      Diff diff0 = new Diff(objectArray0);
      DiffAlgorithm diffAlgorithm0 = diff0.defaultAlgorithm();
      assertNotNull(diffAlgorithm0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Diff.shuffle((Object[]) null, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Diff.shuffle((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.diff.Diff", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Diff.randomSequence(6447);
      // Undeclared exception!
      Diff.randomSequence(6447, (long) 6447);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Diff.randomSequence((-1668), (long) (-1668));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.diff.Diff", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Diff.randomSequence(5834);
      // Undeclared exception!
      Diff.randomSequence(5834);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Diff.randomSequence((-2544));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.diff.Diff", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Diff.randomEdit((Object[]) null, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Diff.randomEdit((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.diff.Diff", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Diff.editAll((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.diff.Diff", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Object[] objectArray1 = Diff.randomSequence(2902, (long) 2902);
      MyersDiff myersDiff0 = new MyersDiff();
      // Undeclared exception!
      Diff.diff(objectArray1, objectArray0, (DiffAlgorithm) myersDiff0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Object[] objectArray1 = Diff.randomSequence(2680);
      // Undeclared exception!
      Diff.diff(objectArray0, objectArray1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Diff.diff(objectArray0, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Object[] objectArray1 = Diff.randomSequence(111);
      Diff diff0 = new Diff(objectArray1);
      // Undeclared exception!
      diff0.diff(objectArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Diff diff0 = new Diff(objectArray0);
      // Undeclared exception!
      try { 
        diff0.diff(objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Diff.compare(objectArray0, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.diff.Diff", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        Diff.arrayToString((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.diff.ToString", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        Diff.arrayToString(objectArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.wicket.util.diff.ToString", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MyersDiff myersDiff0 = new MyersDiff();
      Diff diff0 = null;
      try {
        diff0 = new Diff((Object[]) null, myersDiff0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.diff.Diff", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object[] objectArray0 = Diff.randomSequence(0);
      Object[] objectArray1 = Diff.randomEdit(objectArray0, 3357L);
      Object[] objectArray2 = Diff.randomEdit(objectArray1);
      Diff diff0 = new Diff(objectArray2, (DiffAlgorithm) null);
      diff0.diff(objectArray1);
      assertEquals(0, objectArray2.length);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Diff.diff(objectArray0, objectArray0, (DiffAlgorithm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object[] objectArray0 = Diff.randomSequence(10);
      Object[] objectArray1 = Diff.shuffle(objectArray0, (long) 10);
      assertEquals(10, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object[] objectArray0 = Diff.randomSequence(10);
      Random.setNextRandom(3493);
      Object[] objectArray1 = Diff.randomEdit(objectArray0, (-1828L));
      assertEquals(15, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Object[] objectArray1 = Diff.editAll(objectArray0);
      boolean boolean0 = Diff.compare(objectArray1, objectArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Object[] objectArray1 = new Object[0];
      boolean boolean0 = Diff.compare(objectArray0, objectArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object[] objectArray0 = Diff.randomSequence(10);
      boolean boolean0 = Diff.compare(objectArray0, objectArray0);
      assertEquals(10, objectArray0.length);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object[] objectArray0 = Diff.randomSequence(13);
      MyersDiff myersDiff0 = new MyersDiff();
      // Undeclared exception!
      try { 
        Diff.diff(objectArray0, (Object[]) null, (DiffAlgorithm) myersDiff0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.diff.Diff", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MyersDiff myersDiff0 = new MyersDiff();
      // Undeclared exception!
      try { 
        Diff.diff((Object[]) null, (Object[]) null, (DiffAlgorithm) myersDiff0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.diff.Diff", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Diff.diff(objectArray0, (Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.diff.Diff", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Revision revision0 = Diff.diff(objectArray0, objectArray0);
      Object[] objectArray1 = new Object[1];
      objectArray1[0] = (Object) revision0;
      String string0 = Diff.arrayToString(objectArray1);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        Diff.diff((Object[]) null, (Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.diff.Diff", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object[] objectArray0 = Diff.randomSequence(0);
      Object[] objectArray1 = Diff.randomEdit(objectArray0, 3357L);
      MyersDiff myersDiff0 = new MyersDiff();
      Diff diff0 = new Diff(objectArray1, myersDiff0);
      Object[] objectArray2 = new Object[5];
      Revision revision0 = diff0.diff(objectArray2);
      assertEquals(0, objectArray1.length);
      assertEquals(1, revision0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Diff diff0 = null;
      try {
        diff0 = new Diff((Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.diff.Diff", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object[] objectArray0 = Diff.randomSequence(10);
      Object[] objectArray1 = Diff.randomEdit(objectArray0);
      assertEquals(10, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object[] objectArray0 = Diff.randomSequence(10);
      Object[] objectArray1 = Diff.shuffle(objectArray0);
      assertEquals(10, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Object[] objectArray0 = Diff.randomSequence(10);
      String string0 = Diff.arrayToString(objectArray0);
      assertEquals("0\n0\n0\n0\n0\n0\n0\n0\n0\n0", string0);
  }
}