/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 21:06:03 GMT 2022
 */

package org.apache.manifoldcf.core.cachemanager;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.manifoldcf.core.database.Database;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExecutorBase_ESTest extends ExecutorBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Database.QueryCacheExecutor database_QueryCacheExecutor0 = new Database.QueryCacheExecutor((Database) null, true);
  }
}