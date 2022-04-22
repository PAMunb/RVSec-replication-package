/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:18:52 GMT 2022
 */

package org.apache.deltaspike.core.impl.scope.viewaccess;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.deltaspike.core.impl.scope.viewaccess.ViewAccessViewHistory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ViewAccessViewHistory_ESTest extends ViewAccessViewHistory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ViewAccessViewHistory viewAccessViewHistory0 = new ViewAccessViewHistory();
      viewAccessViewHistory0.setLastView("1Z");
      String string0 = viewAccessViewHistory0.getLastView();
      assertEquals("1Z", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ViewAccessViewHistory viewAccessViewHistory0 = new ViewAccessViewHistory();
      viewAccessViewHistory0.setLastView("");
      String string0 = viewAccessViewHistory0.getLastView();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ViewAccessViewHistory viewAccessViewHistory0 = new ViewAccessViewHistory();
      String string0 = viewAccessViewHistory0.getLastView();
      assertNull(string0);
  }
}
