/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:05:47 GMT 2022
 */

package org.apache.wicket.util.parse.metapattern;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.apache.wicket.util.parse.metapattern.MetaPattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MetaPattern_ESTest extends MetaPattern_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MetaPattern metaPattern0 = MetaPattern.ANYTHING;
      MetaPattern metaPattern1 = new MetaPattern(metaPattern0);
      assertFalse(metaPattern1.equals((Object)metaPattern0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MetaPattern metaPattern0 = MetaPattern.VARIABLE_NAME;
      Pattern pattern0 = metaPattern0.RIGHT_SQUARE.pattern(598);
      assertEquals(0, pattern0.flags());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MetaPattern metaPattern0 = MetaPattern.VARIABLE_NAME;
      Pattern pattern0 = metaPattern0.XML_ELEMENT_NAME.pattern((-170));
      assertEquals("[A-Za-z_][A-Za-z0-9_.-]*", pattern0.pattern());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MetaPattern metaPattern0 = MetaPattern.VARIABLE_NAME;
      Pattern pattern0 = metaPattern0.RIGHT_SQUARE.pattern();
      assertEquals("\\]", pattern0.pattern());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MetaPattern[] metaPatternArray0 = new MetaPattern[4];
      MetaPattern metaPattern0 = MetaPattern.LEFT_PAREN;
      metaPatternArray0[1] = metaPattern0;
      Pattern pattern0 = metaPatternArray0[1].pattern();
      assertEquals(0, pattern0.flags());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MetaPattern metaPattern0 = MetaPattern.STAR;
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn((-340)).when(charSequence0).length();
      Matcher matcher0 = metaPattern0.RIGHT_SQUARE.matcher(charSequence0);
      assertEquals(0, matcher0.groupCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MetaPattern metaPattern0 = new MetaPattern((List<MetaPattern>) null);
      // Undeclared exception!
      try { 
        metaPattern0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.parse.metapattern.MetaPattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MetaPattern metaPattern0 = new MetaPattern((List<MetaPattern>) null);
      // Undeclared exception!
      try { 
        metaPattern0.pattern(3532);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.parse.metapattern.MetaPattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MetaPattern metaPattern0 = null;
      try {
        metaPattern0 = new MetaPattern((MetaPattern) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.parse.metapattern.MetaPattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MetaPattern metaPattern0 = null;
      try {
        metaPattern0 = new MetaPattern("Ji]qMX*9''fU(nY}");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed group near index 16
         // Ji]qMX*9''fU(nY}
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MetaPattern metaPattern0 = null;
      try {
        metaPattern0 = new MetaPattern((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      MetaPattern[] metaPatternArray0 = new MetaPattern[2];
      MetaPattern metaPattern0 = new MetaPattern(metaPatternArray0);
      // Undeclared exception!
      try { 
        metaPattern0.matcher(charSequence0, (-2261));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.parse.metapattern.MetaPattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MetaPattern[] metaPatternArray0 = new MetaPattern[3];
      MetaPattern metaPattern0 = new MetaPattern(metaPatternArray0);
      String string0 = metaPattern0.toString();
      assertEquals("nullnullnull", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MetaPattern[] metaPatternArray0 = new MetaPattern[3];
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn(1133).when(charSequence0).length();
      Matcher matcher0 = metaPatternArray0[0].DIGIT.matcher(charSequence0, 0);
      assertTrue(matcher0.hasAnchoringBounds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MetaPattern[] metaPatternArray0 = new MetaPattern[3];
      MetaPattern metaPattern0 = MetaPattern.STAR;
      metaPatternArray0[0] = metaPattern0;
      metaPatternArray0[0].XML_ATTRIBUTE_NAME.toString();
      Pattern pattern0 = metaPattern0.pattern(1133);
      assertNotNull(pattern0);
      assertEquals(1133, pattern0.flags());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MetaPattern metaPattern0 = MetaPattern.PLUS;
      MetaPattern[] metaPatternArray0 = new MetaPattern[7];
      metaPatternArray0[0] = metaPattern0;
      metaPatternArray0[1] = metaPattern0;
      metaPatternArray0[2] = metaPattern0;
      metaPatternArray0[3] = metaPattern0;
      metaPatternArray0[4] = metaPattern0;
      metaPatternArray0[5] = metaPattern0;
      metaPatternArray0[6] = metaPattern0;
      MetaPattern metaPattern1 = new MetaPattern(metaPatternArray0);
      Pattern pattern0 = metaPattern1.pattern();
      assertNotNull(pattern0);
      assertEquals(0, pattern0.flags());
      assertEquals("\\+\\+\\+\\+\\+\\+\\+", pattern0.pattern());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MetaPattern metaPattern0 = new MetaPattern("");
      String string0 = metaPattern0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MetaPattern metaPattern0 = MetaPattern.PERL_INTERPOLATION;
      MetaPattern metaPattern1 = new MetaPattern(metaPattern0);
      assertFalse(metaPattern1.equals((Object)metaPattern0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MetaPattern[] metaPatternArray0 = new MetaPattern[7];
      MetaPattern metaPattern0 = new MetaPattern(metaPatternArray0);
      // Undeclared exception!
      try { 
        metaPattern0.pattern();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.parse.metapattern.MetaPattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MetaPattern metaPattern0 = MetaPattern.POSITIVE_INTEGER;
      // Undeclared exception!
      try { 
        metaPattern0.matcher((CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
