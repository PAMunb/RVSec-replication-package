/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 02:09:57 GMT 2022
 */

package org.apache.wicket.util.parse.metapattern.parsers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.wicket.util.parse.metapattern.MetaPattern;
import org.apache.wicket.util.parse.metapattern.parsers.ListParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ListParser_ESTest extends ListParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MetaPattern metaPattern0 = mock(MetaPattern.class, new ViolatedAssumptionAnswer());
      MetaPattern metaPattern1 = mock(MetaPattern.class, new ViolatedAssumptionAnswer());
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(charSequence0).length();
      ListParser listParser0 = new ListParser(metaPattern0, metaPattern1, charSequence0);
      assertTrue(listParser0.atEnd());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MetaPattern metaPattern0 = mock(MetaPattern.class, new ViolatedAssumptionAnswer());
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(charSequence0).length();
      doReturn((CharSequence) null).when(charSequence0).subSequence(anyInt() , anyInt());
      ListParser listParser0 = new ListParser(metaPattern0, metaPattern0, charSequence0);
      // Undeclared exception!
      try { 
        listParser0.matches();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.parse.metapattern.MetaPattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(charSequence0).length();
      ListParser listParser0 = null;
      try {
        listParser0 = new ListParser((MetaPattern) null, (MetaPattern) null, charSequence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.wicket.util.parse.metapattern.MetaPattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MetaPattern metaPattern0 = mock(MetaPattern.class, new ViolatedAssumptionAnswer());
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(charSequence0).length();
      ListParser listParser0 = new ListParser(metaPattern0, metaPattern0, charSequence0);
      List<String> list0 = listParser0.getValues();
      assertEquals(0, list0.size());
  }
}