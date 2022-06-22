/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 19:20:16 GMT 2022
 */

package org.apache.deltaspike.core.impl.scope.conversation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Set;
import org.apache.deltaspike.core.impl.scope.conversation.ConversationKey;
import org.apache.deltaspike.core.impl.scope.conversation.InjectableGroupedConversation;
import org.apache.deltaspike.core.spi.scope.conversation.GroupedConversationManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InjectableGroupedConversation_ESTest extends InjectableGroupedConversation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConversationKey conversationKey0 = mock(ConversationKey.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(conversationKey0).getConversationGroup();
      doReturn((Set) null).when(conversationKey0).getQualifiers();
      GroupedConversationManager groupedConversationManager0 = mock(GroupedConversationManager.class, new ViolatedAssumptionAnswer());
      InjectableGroupedConversation injectableGroupedConversation0 = new InjectableGroupedConversation(conversationKey0, groupedConversationManager0);
      // Undeclared exception!
      try { 
        injectableGroupedConversation0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.deltaspike.core.impl.scope.conversation.InjectableGroupedConversation", e);
      }
  }
}