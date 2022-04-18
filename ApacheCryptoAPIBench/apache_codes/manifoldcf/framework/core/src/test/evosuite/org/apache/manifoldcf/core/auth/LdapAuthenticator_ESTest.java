/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 18 12:26:43 GMT 2022
 */

package org.apache.manifoldcf.core.auth;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.manifoldcf.core.auth.LdapAuthenticator;
import org.apache.manifoldcf.core.threadcontext.ThreadContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LdapAuthenticator_ESTest extends LdapAuthenticator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ThreadContext threadContext0 = new ThreadContext();
      LdapAuthenticator ldapAuthenticator0 = null;
      try {
        ldapAuthenticator0 = new LdapAuthenticator(threadContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.system.ManifoldCF", e);
      }
  }
}
