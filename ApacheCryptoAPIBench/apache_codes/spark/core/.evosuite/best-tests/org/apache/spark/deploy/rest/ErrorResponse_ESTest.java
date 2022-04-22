/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 00:48:17 GMT 2022
 */

package org.apache.spark.deploy.rest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.apache.spark.deploy.rest.ErrorResponse;
import org.apache.spark.deploy.rest.SubmitRestProtocolMessage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ErrorResponse_ESTest extends ErrorResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ErrorResponse errorResponse0 = new ErrorResponse();
      errorResponse0.highestProtocolVersion_$eq("");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "z+L/H{LQ/xra";
      stringArray0[1] = "z+L/H{LQ/xra";
      stringArray0[2] = "";
      stringArray0[3] = "m2*";
      stringArray0[4] = "oC}S\",_";
      stringArray0[5] = "serverSparkVersion";
      errorResponse0.unknownFields_$eq(stringArray0);
      errorResponse0.highestProtocolVersion();
      errorResponse0.highestProtocolVersion_$eq("E6g%");
      // Undeclared exception!
      try { 
        errorResponse0.doValidate();
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // 'serverSparkVersion' is missing in message ErrorResponse.
         //
         verifyException("org.apache.spark.deploy.rest.SubmitRestProtocolMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ErrorResponse errorResponse0 = new ErrorResponse();
      errorResponse0.serverSparkVersion_$eq("USE_DEFAULTS");
      String[] stringArray0 = new String[8];
      errorResponse0.serverSparkVersion_$eq("USE_DEFAULTS");
      errorResponse0.unknownFields_$eq(stringArray0);
      stringArray0[0] = "USE_DEFAULTS";
      stringArray0[1] = "USE_DEFAULTS";
      stringArray0[2] = "USE_DEFAULTS";
      stringArray0[3] = "USE_DEFAULTS";
      errorResponse0.message_$eq("");
      stringArray0[4] = "USE_DEFAULTS";
      stringArray0[5] = "message";
      stringArray0[6] = "USE_DEFAULTS";
      stringArray0[7] = "USE_DEFAULTS";
      errorResponse0.unknownFields_$eq(stringArray0);
      errorResponse0.highestProtocolVersion_$eq("USE_DEFAULTS");
      errorResponse0.doValidate();
      errorResponse0.serverSparkVersion_$eq("USE_DEFAULTS");
      errorResponse0.highestProtocolVersion_$eq("message");
      errorResponse0.highestProtocolVersion_$eq("USE_DEFAULTS");
      errorResponse0.highestProtocolVersion();
      errorResponse0.highestProtocolVersion();
      errorResponse0.doValidate();
      errorResponse0.highestProtocolVersion_$eq(".sR9*s+Tfitc@Eu);.");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ErrorResponse errorResponse0 = new ErrorResponse();
      errorResponse0.highestProtocolVersion_$eq("message");
      errorResponse0.highestProtocolVersion_$eq("message");
      errorResponse0.serverSparkVersion_$eq("message");
      // Undeclared exception!
      try { 
        SubmitRestProtocolMessage.fromJson("NON_EMPTY");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Unrecognized token 'NON_EMPTY': was expecting 'null', 'true', 'false' or NaN
         //  at [Source: java.lang.String@0000000009; line: 1, column: 19]
         //
         verifyException("com.fasterxml.jackson.core.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ErrorResponse errorResponse0 = new ErrorResponse();
      errorResponse0.highestProtocolVersion();
      // Undeclared exception!
      try { 
        errorResponse0.doValidate();
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // 'serverSparkVersion' is missing in message ErrorResponse.
         //
         verifyException("org.apache.spark.deploy.rest.SubmitRestProtocolMessage", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ErrorResponse errorResponse0 = new ErrorResponse();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "ix><I0t+BYQ";
      stringArray0[1] = "DEFAULT";
      stringArray0[2] = "VIVSM!8<}k5\"QT2`?C";
      stringArray0[3] = "";
      errorResponse0.unknownFields_$eq(stringArray0);
      errorResponse0.highestProtocolVersion();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ErrorResponse errorResponse0 = new ErrorResponse();
      String string0 = "Validation of message ";
      // Undeclared exception!
      try { 
        errorResponse0.doValidate();
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // 'serverSparkVersion' is missing in message ErrorResponse.
         //
         verifyException("org.apache.spark.deploy.rest.SubmitRestProtocolMessage", e);
      }
  }
}
