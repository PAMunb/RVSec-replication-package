/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 17:16:56 GMT 2022
 */

package org.apache.deltaspike.core.impl.scope.viewaccess;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.apache.deltaspike.core.impl.scope.viewaccess.ViewAccessBeanAccessHistory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ViewAccessBeanAccessHistory_ESTest extends ViewAccessBeanAccessHistory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ViewAccessBeanAccessHistory viewAccessBeanAccessHistory0 = new ViewAccessBeanAccessHistory();
      List<String> list0 = viewAccessBeanAccessHistory0.getAccessedBeans();
      assertEquals(0, list0.size());
  }
}