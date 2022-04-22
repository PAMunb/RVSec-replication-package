/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 21:46:49 GMT 2022
 */

package org.apache.spark.status.api.v1;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.status.api.v1.ApplicationAttemptInfo;
import org.apache.spark.status.api.v1.ApplicationInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import scala.Function1;
import scala.Option;
import scala.Tuple7;
import scala.collection.Seq;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ApplicationInfo_ESTest extends ApplicationInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Seq<ApplicationAttemptInfo> seq0 = (Seq<ApplicationAttemptInfo>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn("", "sx|2", "{u`2zJ^2.xx2>[", "CZ^UzN").when(seq0).toString();
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("scala.UninitializedError", "org.apache.spark.status.api.v1.ApplicationInfo$", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, seq0);
      Seq<ApplicationAttemptInfo> seq1 = applicationInfo0.attempts();
      ApplicationInfo applicationInfo1 = applicationInfo0.copy("L,T4H]e)cboBS", (String) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, seq1);
      String string0 = applicationInfo1.name();
      assertEquals("scala.UninitializedError", applicationInfo0.copy$default$1());
      assertNull(string0);
      assertEquals("org.apache.spark.status.api.v1.ApplicationInfo$", applicationInfo0.name());
      assertEquals("org.apache.spark.status.api.v1.ApplicationInfo$", applicationInfo0.copy$default$2());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("/^UuMg$nRmn2M;", "/^UuMg$nRmn2M;", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      String string0 = applicationInfo0.name();
      assertEquals("/^UuMg$nRmn2M;", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply((String) null, (String) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      String string0 = applicationInfo0.id();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("", "", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      String string0 = applicationInfo0.id();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seq<ApplicationAttemptInfo> seq0 = (Seq<ApplicationAttemptInfo>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn("", "sx|2", "{u`2zJ^2.xx2>[", "CZ^UzN").when(seq0).toString();
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("scala.UninitializedError", "org.apache.spark.status.api.v1.ApplicationInfo$", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, seq0);
      applicationInfo0.copy$default$7();
      assertEquals("scala.UninitializedError", applicationInfo0.copy$default$1());
      assertEquals("org.apache.spark.status.api.v1.ApplicationInfo$", applicationInfo0.name());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("ApplicationInfo", ",)", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      ApplicationInfo applicationInfo1 = applicationInfo0.copy("Ke,Sw>Umu", (String) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      String string0 = applicationInfo1.copy$default$2();
      assertNull(string0);
      assertEquals(",)", applicationInfo0.copy$default$2());
      assertEquals("ApplicationInfo", applicationInfo0.id());
      assertEquals(",)", applicationInfo0.name());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ApplicationInfo applicationInfo0 = new ApplicationInfo("scala.collecion.convert.Wrappers$JMapWrapper", "scala.collecion.convert.Wrappers$JMapWrapper", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      String string0 = applicationInfo0.copy$default$2();
      assertEquals("scala.collecion.convert.Wrappers$JMapWrapper", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply((String) null, "", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      String string0 = applicationInfo0.copy$default$1();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ApplicationInfo applicationInfo0 = new ApplicationInfo("", "scala.collection.immutable.Queue", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      String string0 = applicationInfo0.copy$default$1();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ApplicationInfo applicationInfo0 = new ApplicationInfo("aDD+NoMqF", "aDD+NoMqF", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      boolean boolean0 = applicationInfo0.canEqual((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("n=WFKVQRn\"X", "...", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      applicationInfo0.productElement(4);
      assertEquals("n=WFKVQRn\"X", applicationInfo0.copy$default$1());
      assertEquals("...", applicationInfo0.name());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("", "", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      Object object0 = applicationInfo0.productElement(5);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ApplicationInfo applicationInfo0 = new ApplicationInfo("scala.collection.convert.Wrappers$JMapWrapper", "scala.collection.convert.Wrappers$JMapWrapper", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      Object object0 = applicationInfo0.productElement(6);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("", "fzmxlwa9TF18", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      applicationInfo0.productElement(3);
      assertEquals("fzmxlwa9TF18", applicationInfo0.copy$default$2());
      assertEquals("", applicationInfo0.copy$default$1());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ApplicationInfo applicationInfo0 = new ApplicationInfo("scala.collection.convert.Wrappers$JMapWrapper", "scala.collection.convert.Wrappers$JMapWrapper", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      Object object0 = applicationInfo0.productElement(2);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seq<ApplicationAttemptInfo> seq0 = (Seq<ApplicationAttemptInfo>) mock(Seq.class, new ViolatedAssumptionAnswer());
      doReturn("", "sx|2").when(seq0).toString();
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("scala.UninitializedError", "org.apache.spark.status.api.v1.ApplicationInfo$", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, seq0);
      Object object0 = applicationInfo0.productElement(0);
      assertEquals("scala.UninitializedError", object0);
      assertEquals("org.apache.spark.status.api.v1.ApplicationInfo$", applicationInfo0.name());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("", "", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      Object object0 = applicationInfo0.productElement(1);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ApplicationInfo applicationInfo0 = new ApplicationInfo("", "", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      Seq<ApplicationAttemptInfo> seq0 = applicationInfo0.attempts();
      assertNull(seq0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ApplicationInfo applicationInfo0 = new ApplicationInfo("", "", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      Option<Object> option0 = applicationInfo0.maxCores();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("org.apache.spark.status.api.v1.ApplicationInfo$", "org.apache.spark.status.api.v1.ApplicationInfo$", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      String string0 = applicationInfo0.id();
      assertEquals("org.apache.spark.status.api.v1.ApplicationInfo$", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ApplicationInfo applicationInfo0 = new ApplicationInfo("scala.collecion.convert.Wrappers$JMapWrapper", "scala.collecion.convert.Wrappers$JMapWrapper", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      Option<Object> option0 = applicationInfo0.coresPerExecutor();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("X5s+$?xee2\"4OV", (String) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      String string0 = applicationInfo0.productPrefix();
      assertEquals("ApplicationInfo", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("X5s+$?xee2\"4OV", (String) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      Option<Object> option0 = applicationInfo0.coresGranted();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ApplicationInfo applicationInfo0 = new ApplicationInfo("", "", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      applicationInfo0.productIterator();
      assertEquals(7, applicationInfo0.productArity());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ApplicationInfo applicationInfo0 = new ApplicationInfo("scala.collection.convert.Wrappers$JMapWrapper", "scala.collection.convert.Wrappers$JMapWrapper", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      int int0 = applicationInfo0.productArity();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("", "", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      String string0 = applicationInfo0.name();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("X5s+$?xee2\"4OV", (String) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      Option<Object> option0 = applicationInfo0.memoryPerExecutorMB();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("", "", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      Option<Tuple7<String, String, Option<Object>, Option<Object>, Option<Object>, Option<Object>, Seq<ApplicationAttemptInfo>>> option0 = ApplicationInfo.unapply(applicationInfo0);
      assertNotNull(option0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("<q", "<q", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      boolean boolean0 = applicationInfo0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("scala.collection.mutable.Seq$", "", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      applicationInfo0.equals(applicationInfo0);
      assertEquals("scala.collection.mutable.Seq$", applicationInfo0.id());
      assertEquals("", applicationInfo0.copy$default$2());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ApplicationInfo applicationInfo0 = new ApplicationInfo("(", "(", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      // Undeclared exception!
      try { 
        applicationInfo0.productElement(455);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.Integer@0000000002
         //
         verifyException("org.apache.spark.status.api.v1.ApplicationInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("", "", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      Seq<ApplicationAttemptInfo> seq0 = applicationInfo0.copy$default$7();
      assertNull(seq0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ApplicationInfo applicationInfo0 = new ApplicationInfo("scala.collection.mutable.AbstractIterable", "scala.collection.mutable.AbstractIterable", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      applicationInfo0.hashCode();
      assertEquals(7, applicationInfo0.productArity());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ApplicationInfo applicationInfo0 = new ApplicationInfo("scala.collecion.convert.Wrappers$JMapWrapper", "scala.collecion.convert.Wrappers$JMapWrapper", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      String string0 = applicationInfo0.copy$default$1();
      assertEquals("scala.collecion.convert.Wrappers$JMapWrapper", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("", "", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      Option<Object> option0 = applicationInfo0.copy$default$3();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("l", "l", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      Option<Object> option0 = applicationInfo0.copy$default$6();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ApplicationInfo applicationInfo0 = new ApplicationInfo("Tuple3", "Tuple3", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      Option<Object> option0 = applicationInfo0.copy$default$4();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ApplicationInfo applicationInfo0 = new ApplicationInfo((String) null, (String) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      Option<Object> option0 = applicationInfo0.copy$default$5();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Function1<String, Function1<String, Function1<Option<Object>, Function1<Option<Object>, Function1<Option<Object>, Function1<Option<Object>, Function1<Seq<ApplicationAttemptInfo>, ApplicationInfo>>>>>>> function1_0 = ApplicationInfo.curried();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ApplicationInfo applicationInfo0 = new ApplicationInfo("", "", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      String string0 = applicationInfo0.copy$default$2();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("", "", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      boolean boolean0 = applicationInfo0.canEqual(applicationInfo0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Function1<Tuple7<String, String, Option<Object>, Option<Object>, Option<Object>, Option<Object>, Seq<ApplicationAttemptInfo>>, ApplicationInfo> function1_0 = ApplicationInfo.tupled();
      assertNotNull(function1_0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ApplicationInfo applicationInfo0 = ApplicationInfo.apply("", "", (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Option<Object>) null, (Seq<ApplicationAttemptInfo>) null);
      String string0 = applicationInfo0.toString();
      assertEquals("ApplicationInfo(,,null,null,null,null,null)", string0);
      assertEquals(7, applicationInfo0.productArity());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Option<Tuple7<String, String, Option<Object>, Option<Object>, Option<Object>, Option<Object>, Seq<ApplicationAttemptInfo>>> option0 = ApplicationInfo.unapply((ApplicationInfo) null);
      assertNotNull(option0);
  }
}
