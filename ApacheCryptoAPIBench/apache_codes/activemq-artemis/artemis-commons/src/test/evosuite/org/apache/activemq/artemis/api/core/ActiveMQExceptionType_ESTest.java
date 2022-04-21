/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 20 11:27:49 GMT 2022
 */

package org.apache.activemq.artemis.api.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.activemq.artemis.api.core.ActiveMQException;
import org.apache.activemq.artemis.api.core.ActiveMQExceptionType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ActiveMQExceptionType_ESTest extends ActiveMQExceptionType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ActiveMQExceptionType[] activeMQExceptionTypeArray0 = ActiveMQExceptionType.values();
      assertEquals(45, activeMQExceptionTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.valueOf("NATIVE_ERROR_PREALLOCATE_FILE");
      assertEquals(ActiveMQExceptionType.NATIVE_ERROR_PREALLOCATE_FILE, activeMQExceptionType0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.INTERNAL_ERROR;
      int int0 = activeMQExceptionType0.getCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.getType((-1056));
      assertEquals(ActiveMQExceptionType.GENERIC_EXCEPTION, activeMQExceptionType0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ActiveMQExceptionType.getType(112);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.GENERIC_EXCEPTION;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("");
      assertEquals(ActiveMQExceptionType.GENERIC_EXCEPTION, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.TRANSACTION_OUTCOME_UNKNOWN;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("4Wa+P=,fQ?M");
      assertEquals(ActiveMQExceptionType.TRANSACTION_OUTCOME_UNKNOWN, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.DUPLICATE_METADATA;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("Ix'd_Nm6fs-");
      assertEquals(ActiveMQExceptionType.DUPLICATE_METADATA, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ActiveMQException activeMQException0 = ActiveMQExceptionType.createException(117, "X0.NJ%");
      assertEquals(ActiveMQExceptionType.INTERCEPTOR_REJECTED_PACKET, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.ALREADY_REPLICATING;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("");
      assertEquals(ActiveMQExceptionType.ALREADY_REPLICATING, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.REMOTE_DISCONNECT;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("ALREADY_REPLICATING");
      assertEquals(ActiveMQExceptionType.REMOTE_DISCONNECT, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.INVALID_TRANSIENT_QUEUE_USE;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException((String) null);
      assertEquals(ActiveMQExceptionType.INVALID_TRANSIENT_QUEUE_USE, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.ADDRESS_FULL;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("");
      assertEquals(ActiveMQExceptionType.ADDRESS_FULL, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.TRANSACTION_TIMEOUT;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException((String) null);
      assertEquals(ActiveMQExceptionType.TRANSACTION_TIMEOUT, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.IO_ERROR;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("");
      assertEquals(ActiveMQExceptionType.IO_ERROR, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.QUEUE_DOES_NOT_EXIST;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("~eV?q7\"_smWfs?p$F");
      assertEquals(ActiveMQExceptionType.QUEUE_DOES_NOT_EXIST, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.DISCONNECTED;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("");
      assertEquals(ActiveMQExceptionType.DISCONNECTED, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ActiveMQException activeMQException0 = ActiveMQExceptionType.createException(5, (String) null);
      assertEquals(ActiveMQExceptionType.UNBLOCKED, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.NOT_CONNECTED;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("=b>reLo2A@~{%9X~");
      assertEquals(ActiveMQExceptionType.NOT_CONNECTED, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.CONNECTION_TIMEDOUT;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("%");
      assertEquals(ActiveMQExceptionType.CONNECTION_TIMEDOUT, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.DUPLICATE_ID_REJECTED;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException(";f+wR-Jm");
      assertEquals(ActiveMQExceptionType.DUPLICATE_ID_REJECTED, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ActiveMQException activeMQException0 = ActiveMQExceptionType.createException(0, "5]819");
      assertEquals(ActiveMQExceptionType.INTERNAL_ERROR, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ActiveMQException activeMQException0 = ActiveMQExceptionType.createException(1, "org.apache.activemq.artemis.api.core.ActiveMQInvalidTransientQueueUseException");
      assertEquals(ActiveMQExceptionType.UNSUPPORTED_PACKET, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ActiveMQException activeMQException0 = ActiveMQExceptionType.createException(112, "&n-<,]bu");
      assertEquals(ActiveMQExceptionType.SESSION_CREATION_REJECTED, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.TRANSACTION_ROLLED_BACK;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("NATIVE_ERROR_INTERNAL");
      assertEquals(ActiveMQExceptionType.TRANSACTION_ROLLED_BACK, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.INVALID_QUEUE_CONFIGURATION;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("T=/+~$@ U4J]ih");
      assertEquals(ActiveMQExceptionType.INVALID_QUEUE_CONFIGURATION, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.INVALID_FILTER_EXPRESSION;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("org.apache.activemq.artemis.api.core.ActiveMQTransactionOutcomeUnknownException");
      assertEquals(ActiveMQExceptionType.INVALID_FILTER_EXPRESSION, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.UNEXPECTED_ROUTING_TYPE_FOR_ADDRESS;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("");
      assertEquals(ActiveMQExceptionType.MAX_CONSUMER_LIMIT_EXCEEDED, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.OBJECT_CLOSED;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("");
      assertEquals(ActiveMQExceptionType.OBJECT_CLOSED, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.SECURITY_EXCEPTION;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException((String) null);
      assertEquals(ActiveMQExceptionType.SECURITY_EXCEPTION, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ActiveMQException activeMQException0 = ActiveMQExceptionType.createException(217, "AmV]fUZ<-lU:E8H-q*");
      assertEquals(ActiveMQExceptionType.DELETE_ADDRESS_ERROR, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.ILLEGAL_STATE;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("");
      assertEquals(ActiveMQExceptionType.ILLEGAL_STATE, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.ADDRESS_EXISTS;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("");
      assertEquals(ActiveMQExceptionType.ADDRESS_EXISTS, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.ADDRESS_DOES_NOT_EXIST;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("TYPE_MAP");
      assertEquals(ActiveMQExceptionType.ADDRESS_DOES_NOT_EXIST, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.valueOf("LARGE_MESSAGE_ERROR_BODY");
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("LARGE_MESSAGE_ERROR_BODY");
      assertEquals(ActiveMQExceptionType.LARGE_MESSAGE_ERROR_BODY, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.INCOMPATIBLE_CLIENT_SERVER_VERSIONS;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("$kB);~SBP2q8ioX");
      assertEquals(ActiveMQExceptionType.INCOMPATIBLE_CLIENT_SERVER_VERSIONS, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.MAX_CONSUMER_LIMIT_EXCEEDED;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("");
      assertEquals(ActiveMQExceptionType.MAX_CONSUMER_LIMIT_EXCEEDED, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.CLUSTER_SECURITY_EXCEPTION;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("F/x5N#TmE4^_X~@EN");
      assertEquals(ActiveMQExceptionType.CLUSTER_SECURITY_EXCEPTION, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.QUEUE_EXISTS;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("IbDw25;<mPo6-jHvC.z");
      assertEquals(ActiveMQExceptionType.QUEUE_EXISTS, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.LARGE_MESSAGE_INTERRUPTED;
      ActiveMQException activeMQException0 = activeMQExceptionType0.createException("org.apache.activemq.artemis.api.core.ActiveMQObjectClosedException");
      assertEquals(ActiveMQExceptionType.LARGE_MESSAGE_INTERRUPTED, activeMQException0.getType());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ActiveMQExceptionType activeMQExceptionType0 = ActiveMQExceptionType.OBJECT_CLOSED;
      int int0 = activeMQExceptionType0.getCode();
      assertEquals(102, int0);
  }
}