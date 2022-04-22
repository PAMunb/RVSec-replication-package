/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 23:58:37 GMT 2022
 */

package org.apache.spark.rpc.netty;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.spark.rpc.RpcAddress;
import org.apache.spark.rpc.netty.LocalNettyRpcCallContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import scala.Function0;
import scala.concurrent.Promise;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LocalNettyRpcCallContext_ESTest extends LocalNettyRpcCallContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RpcAddress rpcAddress0 = mock(RpcAddress.class, new ViolatedAssumptionAnswer());
      LocalNettyRpcCallContext localNettyRpcCallContext0 = new LocalNettyRpcCallContext(rpcAddress0, (Promise<Object>) null);
      localNettyRpcCallContext0.org$apache$spark$internal$Logging$$log_();
      localNettyRpcCallContext0.org$apache$spark$internal$Logging$$log__$eq((Logger) null);
      Object object0 = null;
      // Undeclared exception!
      try { 
        localNettyRpcCallContext0.send((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.spark.rpc.netty.LocalNettyRpcCallContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RpcAddress rpcAddress0 = mock(RpcAddress.class, new ViolatedAssumptionAnswer());
      Promise<Object> promise0 = (Promise<Object>) mock(Promise.class, new ViolatedAssumptionAnswer());
      doReturn((Promise) null).when(promise0).success(any());
      LocalNettyRpcCallContext localNettyRpcCallContext0 = new LocalNettyRpcCallContext(rpcAddress0, promise0);
      localNettyRpcCallContext0.send((Object) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Promise<Object> promise0 = (Promise<Object>) mock(Promise.class, new ViolatedAssumptionAnswer());
      doReturn((Promise) null, (Promise) null, (Promise) null, (Promise) null, (Promise) null).when(promise0).success(any());
      LocalNettyRpcCallContext localNettyRpcCallContext0 = new LocalNettyRpcCallContext((RpcAddress) null, promise0);
      Logger logger0 = localNettyRpcCallContext0.log();
      localNettyRpcCallContext0.initializeLogIfNecessary$default$2();
      localNettyRpcCallContext0.isTraceEnabled();
      localNettyRpcCallContext0.org$apache$spark$internal$Logging$$log__$eq(logger0);
      Function0<String> function0_0 = (Function0<String>) mock(Function0.class, new ViolatedAssumptionAnswer());
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      localNettyRpcCallContext0.logTrace(function0_0, throwable0);
      localNettyRpcCallContext0.initializeLogIfNecessary(false, false);
      localNettyRpcCallContext0.send((Object) null);
      localNettyRpcCallContext0.send((Object) null);
      Throwable throwable1 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      localNettyRpcCallContext0.sendFailure(throwable1);
      localNettyRpcCallContext0.send((Object) null);
      localNettyRpcCallContext0.send((Object) null);
      localNettyRpcCallContext0.send((Object) null);
      localNettyRpcCallContext0.send((Object) null);
      localNettyRpcCallContext0.send((Object) null);
      localNettyRpcCallContext0.send((Object) null);
      localNettyRpcCallContext0.send((Object) null);
      localNettyRpcCallContext0.send((Object) null);
      localNettyRpcCallContext0.send((Object) null);
      Throwable throwable2 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      Function0<String> function0_1 = (Function0<String>) mock(Function0.class, new ViolatedAssumptionAnswer());
      Throwable throwable3 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      localNettyRpcCallContext0.logWarning(function0_1, throwable3);
      localNettyRpcCallContext0.sendFailure(throwable2);
      localNettyRpcCallContext0.send((Object) null);
      localNettyRpcCallContext0.send((Object) null);
      localNettyRpcCallContext0.send((Object) null);
      localNettyRpcCallContext0.send((Object) null);
      localNettyRpcCallContext0.send((Object) null);
      localNettyRpcCallContext0.send((Object) null);
  }
}
