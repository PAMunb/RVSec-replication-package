/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 22 00:26:38 GMT 2022
 */

package org.apache.spark.util.collection.unsafe.sort;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.spark.util.collection.unsafe.sort.RecordPointerAndKeyPrefix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RecordPointerAndKeyPrefix_ESTest extends RecordPointerAndKeyPrefix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RecordPointerAndKeyPrefix recordPointerAndKeyPrefix0 = new RecordPointerAndKeyPrefix();
      assertEquals(0L, recordPointerAndKeyPrefix0.recordPointer);
  }
}
