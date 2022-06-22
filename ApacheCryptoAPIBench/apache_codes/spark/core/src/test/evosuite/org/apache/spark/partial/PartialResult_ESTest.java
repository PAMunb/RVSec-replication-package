/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 22:43:18 GMT 2022
 */

package org.apache.spark.partial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.partial.PartialResult;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import scala.Function1;
import scala.Option;
import scala.PartialFunction;
import scala.Some;
import scala.runtime.BoxedUnit;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PartialResult_ESTest extends PartialResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Exception exception0 = mock(Exception.class, new ViolatedAssumptionAnswer());
      PartialResult<Exception> partialResult0 = new PartialResult<Exception>(exception0, false);
      Exception exception1 = mock(Exception.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(exception1).toString();
      partialResult0.setFinalValue(exception1);
      partialResult0.toString();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PartialFunction.Lifted<Exception, Exception> partialFunction_Lifted0 = (PartialFunction.Lifted<Exception, Exception>) mock(PartialFunction.Lifted.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(partialFunction_Lifted0).toString();
      PartialResult<PartialFunction.Lifted<Exception, Exception>> partialResult0 = new PartialResult<PartialFunction.Lifted<Exception, Exception>>(partialFunction_Lifted0, true);
      Function1<PartialFunction.Lifted<Exception, Exception>, PartialFunction.Lifted<Exception, Exception>> function1_0 = (Function1<PartialFunction.Lifted<Exception, Exception>, PartialFunction.Lifted<Exception, Exception>>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null).when(function1_0).apply(any(scala.PartialFunction.Lifted.class));
      PartialResult<PartialFunction.Lifted<Exception, Exception>> partialResult1 = partialResult0.map(function1_0);
      partialResult1.toString();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PartialFunction.Lifted<Object, Exception> partialFunction_Lifted0 = (PartialFunction.Lifted<Object, Exception>) mock(PartialFunction.Lifted.class, new ViolatedAssumptionAnswer());
      PartialResult<PartialFunction.Lifted<Object, Exception>> partialResult0 = new PartialResult<PartialFunction.Lifted<Object, Exception>>(partialFunction_Lifted0, false);
      partialResult0.org$apache$spark$partial$PartialResult$$getFinalValueInternal();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Exception exception0 = mock(Exception.class, new ViolatedAssumptionAnswer());
      PartialResult<Exception> partialResult0 = new PartialResult<Exception>(exception0, false);
      PartialResult<Object> partialResult1 = new PartialResult<Object>(partialResult0, true);
      partialResult1.isInitialValueFinal();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PartialFunction.AndThen<Object, Object, Object> partialFunction_AndThen0 = (PartialFunction.AndThen<Object, Object, Object>) mock(PartialFunction.AndThen.class, new ViolatedAssumptionAnswer());
      PartialResult<PartialFunction.AndThen<Object, Object, Object>> partialResult0 = new PartialResult<PartialFunction.AndThen<Object, Object, Object>>(partialFunction_AndThen0, false);
      Function1<PartialFunction.AndThen<Object, Object, Object>, PartialFunction.AndThen<Object, Object, Object>> function1_0 = (Function1<PartialFunction.AndThen<Object, Object, Object>, PartialFunction.AndThen<Object, Object, Object>>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(function1_0).apply(any(scala.PartialFunction.AndThen.class));
      PartialResult<PartialFunction.AndThen<Object, Object, Object>> partialResult1 = partialResult0.map(function1_0);
      partialResult1.initialValue();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Exception exception0 = mock(Exception.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(exception0).toString();
      PartialResult<Exception> partialResult0 = new PartialResult<Exception>(exception0, false);
      Function1<Exception, Exception> function1_0 = (Function1<Exception, Exception>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(function1_0).apply(any(java.lang.Exception.class));
      PartialResult<Exception> partialResult1 = partialResult0.map(function1_0);
      Function1<Exception, BoxedUnit> function1_1 = (Function1<Exception, BoxedUnit>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((Function1) null).when(function1_1).compose(any(scala.Function1.class));
      partialResult1.onComplete(function1_1);
      // Undeclared exception!
      try { 
        partialResult0.setFinalValue((Exception) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.spark.partial.PartialResult$$anonfun$setFinalValue$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Some<Object> some0 = (Some<Object>) mock(Some.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(some0).toString();
      PartialResult<Some<Object>> partialResult0 = new PartialResult<Some<Object>>(some0, true);
      Function1<Some<Object>, Some<Object>> function1_0 = (Function1<Some<Object>, Some<Object>>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(function1_0).apply(any(scala.Some.class));
      PartialResult<Some<Object>> partialResult1 = partialResult0.map(function1_0);
      Function1<Some<Object>, BoxedUnit> function1_1 = (Function1<Some<Object>, BoxedUnit>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((Function1) null).when(function1_1).compose(any(scala.Function1.class));
      // Undeclared exception!
      try { 
        partialResult1.onComplete(function1_1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.spark.partial.PartialResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Exception exception0 = mock(Exception.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(exception0).toString();
      PartialResult<Exception> partialResult0 = new PartialResult<Exception>(exception0, true);
      partialResult0.getFinalValue();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Exception exception0 = mock(Exception.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(exception0).toString();
      PartialResult<Exception> partialResult0 = new PartialResult<Exception>(exception0, false);
      partialResult0.toString();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Exception exception0 = mock(Exception.class, new ViolatedAssumptionAnswer());
      PartialResult<Exception> partialResult0 = new PartialResult<Exception>(exception0, false);
      Exception exception1 = mock(Exception.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(exception1).toString();
      partialResult0.setFailure(exception1);
      Exception exception2 = mock(Exception.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        partialResult0.setFailure(exception2);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // setFailure called twice on a PartialResult
         //
         verifyException("org.apache.spark.partial.PartialResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PartialResult<Some<Object>> partialResult0 = new PartialResult<Some<Object>>((Some<Object>) null, true);
      // Undeclared exception!
      try { 
        partialResult0.setFinalValue((Some<Object>) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // setFinalValue called twice on a PartialResult
         //
         verifyException("org.apache.spark.partial.PartialResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Exception exception0 = mock(Exception.class, new ViolatedAssumptionAnswer());
      PartialResult<Exception> partialResult0 = new PartialResult<Exception>(exception0, true);
      Exception exception1 = mock(Exception.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(exception1).toString();
      partialResult0.setFailure(exception1);
      Function1<Exception, BoxedUnit> function1_0 = (Function1<Exception, BoxedUnit>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(function1_0).apply(any(java.lang.Exception.class));
      partialResult0.onFail(function1_0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Exception exception0 = mock(Exception.class, new ViolatedAssumptionAnswer());
      PartialResult<Exception> partialResult0 = new PartialResult<Exception>(exception0, true);
      Function1<Exception, BoxedUnit> function1_0 = (Function1<Exception, BoxedUnit>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(function1_0).toString();
      partialResult0.onFail(function1_0);
      Function1<Exception, BoxedUnit> function1_1 = (Function1<Exception, BoxedUnit>) mock(Function1.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        partialResult0.onFail(function1_1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // onFail cannot be called twice
         //
         verifyException("org.apache.spark.partial.PartialResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Some<Object> some0 = (Some<Object>) mock(Some.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(some0).toString();
      PartialResult<Some<Object>> partialResult0 = new PartialResult<Some<Object>>(some0, true);
      Function1<Some<Object>, BoxedUnit> function1_0 = (Function1<Some<Object>, BoxedUnit>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(function1_0).toString();
      doReturn((Object) null).when(function1_0).apply(any(scala.Some.class));
      PartialResult<Some<Object>> partialResult1 = partialResult0.onComplete(function1_0);
      Function1<Some<Object>, BoxedUnit> function1_1 = (Function1<Some<Object>, BoxedUnit>) mock(Function1.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        partialResult1.onComplete(function1_1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // onComplete cannot be called twice
         //
         verifyException("org.apache.spark.partial.PartialResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Some<Exception> some0 = (Some<Exception>) mock(Some.class, new ViolatedAssumptionAnswer());
      PartialResult<Some<Exception>> partialResult0 = new PartialResult<Some<Exception>>(some0, true);
      Exception exception0 = mock(Exception.class, new ViolatedAssumptionAnswer());
      Function1<Exception, BoxedUnit> function1_0 = (Function1<Exception, BoxedUnit>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(function1_0).toString();
      doReturn((Object) null).when(function1_0).apply(any(java.lang.Exception.class));
      partialResult0.onFail(function1_0);
      partialResult0.setFailure(exception0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Exception exception0 = mock(Exception.class, new ViolatedAssumptionAnswer());
      doReturn("q").when(exception0).toString();
      PartialResult<Exception> partialResult0 = new PartialResult<Exception>(exception0, false);
      Function1<Exception, BoxedUnit> function1_0 = (Function1<Exception, BoxedUnit>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(function1_0).toString();
      doReturn((Object) null).when(function1_0).apply(any(java.lang.Exception.class));
      partialResult0.onComplete(function1_0);
      Exception exception1 = mock(Exception.class, new ViolatedAssumptionAnswer());
      partialResult0.setFinalValue(exception1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Exception exception0 = mock(Exception.class, new ViolatedAssumptionAnswer());
      PartialResult<Exception> partialResult0 = new PartialResult<Exception>(exception0, false);
      Function1<Exception, Exception> function1_0 = (Function1<Exception, Exception>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(function1_0).apply(any(java.lang.Exception.class));
      PartialResult<Exception> partialResult1 = partialResult0.map(function1_0);
      Function1<Exception, BoxedUnit> function1_1 = (Function1<Exception, BoxedUnit>) mock(Function1.class, new ViolatedAssumptionAnswer());
      partialResult1.onFail(function1_1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Exception exception0 = mock(Exception.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(exception0).toString();
      PartialResult<Exception> partialResult0 = new PartialResult<Exception>(exception0, false);
      Function1<Exception, Exception> function1_0 = (Function1<Exception, Exception>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null).when(function1_0).apply(any(java.lang.Exception.class));
      PartialResult<Exception> partialResult1 = partialResult0.map(function1_0);
      Function1<Exception, BoxedUnit> function1_1 = (Function1<Exception, BoxedUnit>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((Function1) null).when(function1_1).compose(any(scala.Function1.class));
      PartialResult<Exception> partialResult2 = partialResult1.onComplete(function1_1);
      partialResult2.toString();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Exception exception0 = mock(Exception.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(exception0).toString();
      PartialResult<Exception> partialResult0 = new PartialResult<Exception>(exception0, false);
      PartialResult<Object> partialResult1 = new PartialResult<Object>(partialResult0, true);
      Function1<Object, Object> function1_0 = (Function1<Object, Object>) mock(Function1.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null).when(function1_0).apply(any());
      PartialResult<Object> partialResult2 = partialResult1.map(function1_0);
      Object object0 = partialResult2.getFinalValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PartialFunction.AndThen<Object, Object, Object> partialFunction_AndThen0 = (PartialFunction.AndThen<Object, Object, Object>) mock(PartialFunction.AndThen.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(partialFunction_AndThen0).toString();
      PartialResult<PartialFunction.AndThen<Object, Object, Object>> partialResult0 = new PartialResult<PartialFunction.AndThen<Object, Object, Object>>(partialFunction_AndThen0, false);
      PartialFunction.AndThen<Object, Object, Object> partialFunction_AndThen1 = partialResult0.initialValue();
      assertSame(partialFunction_AndThen1, partialFunction_AndThen0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PartialFunction.AndThen<Exception, Object, Object> partialFunction_AndThen0 = (PartialFunction.AndThen<Exception, Object, Object>) mock(PartialFunction.AndThen.class, new ViolatedAssumptionAnswer());
      PartialResult<PartialFunction.AndThen<Exception, Object, Object>> partialResult0 = new PartialResult<PartialFunction.AndThen<Exception, Object, Object>>(partialFunction_AndThen0, false);
      PartialResult<Object> partialResult1 = new PartialResult<Object>(partialResult0, false);
      boolean boolean0 = partialResult1.isInitialValueFinal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PartialResult<Some<Object>> partialResult0 = new PartialResult<Some<Object>>((Some<Object>) null, true);
      // Undeclared exception!
      try { 
        partialResult0.map((Function1<Some<Object>, Some<Object>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.spark.partial.PartialResult$$anon$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PartialFunction.AndThen<Object, Exception, Object> partialFunction_AndThen0 = (PartialFunction.AndThen<Object, Exception, Object>) mock(PartialFunction.AndThen.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(partialFunction_AndThen0).toString();
      PartialResult<PartialFunction.AndThen<Object, Exception, Object>> partialResult0 = new PartialResult<PartialFunction.AndThen<Object, Exception, Object>>(partialFunction_AndThen0, true);
      Option<PartialFunction.AndThen<Object, Exception, Object>> option0 = partialResult0.org$apache$spark$partial$PartialResult$$getFinalValueInternal();
      assertEquals(1, option0.productArity());
  }
}