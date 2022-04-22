/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 21:03:36 GMT 2022
 */

package org.apache.manifoldcf.core.i18n;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import org.apache.commons.collections.ExtendedProperties;
import org.apache.manifoldcf.core.i18n.MCFVelocityResourceLoader;
import org.apache.velocity.runtime.resource.Resource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MCFVelocityResourceLoader_ESTest extends MCFVelocityResourceLoader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      MCFVelocityResourceLoader mCFVelocityResourceLoader0 = new MCFVelocityResourceLoader(class0);
      // Undeclared exception!
      try { 
        mCFVelocityResourceLoader0.getResourceStream((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MCFVelocityResourceLoader mCFVelocityResourceLoader0 = new MCFVelocityResourceLoader(class0);
      try { 
        mCFVelocityResourceLoader0.getResourceStream("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource '' not found.
         //
         verifyException("org.apache.manifoldcf.core.i18n.MCFVelocityResourceLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      MCFVelocityResourceLoader mCFVelocityResourceLoader0 = new MCFVelocityResourceLoader(class0);
      InputStream inputStream0 = mCFVelocityResourceLoader0.getResourceStream("/org/apache/velocity/runtime/defaults/velocity.properties");
      assertNotNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MCFVelocityResourceLoader mCFVelocityResourceLoader0 = new MCFVelocityResourceLoader(class0);
      Resource resource0 = mock(Resource.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = mCFVelocityResourceLoader0.isSourceModified(resource0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MCFVelocityResourceLoader mCFVelocityResourceLoader0 = new MCFVelocityResourceLoader(class0);
      long long0 = mCFVelocityResourceLoader0.getLastModified((Resource) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      MCFVelocityResourceLoader mCFVelocityResourceLoader0 = new MCFVelocityResourceLoader(class0);
      mCFVelocityResourceLoader0.init((ExtendedProperties) null);
      assertFalse(mCFVelocityResourceLoader0.isCachingOn());
  }
}
