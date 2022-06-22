/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 21:08:17 GMT 2022
 */

package org.apache.manifoldcf.core.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.Map;
import org.apache.manifoldcf.core.interfaces.ConfigurationNode;
import org.apache.manifoldcf.core.interfaces.SpecificationNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SpecificationNode_ESTest extends SpecificationNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("o)");
      SpecificationNode specificationNode1 = new SpecificationNode("@(#)$Id: ConfigurationNode.java 988245 2010-08-23 18:39:35Z kwright $");
      specificationNode0.addChild(0, specificationNode1);
      SpecificationNode specificationNode2 = specificationNode0.getChild(0);
      specificationNode0.createNewNode(specificationNode2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("::SLBoX^dpTu4R?UqD.");
      specificationNode0.addChild(0, specificationNode0);
      boolean boolean0 = true;
      // Undeclared exception!
      specificationNode0.duplicate(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("#NiM<LZ,");
      SpecificationNode specificationNode1 = new SpecificationNode(specificationNode0);
      specificationNode1.addChild(0, specificationNode0);
      specificationNode0.addChild(0, specificationNode1);
      // Undeclared exception!
      try { 
        specificationNode0.getChild(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("3F");
      SpecificationNode specificationNode1 = new SpecificationNode("@(#)$Id: SpecificationNode.java 988245 2010-08-23 18:39:35Z kwright $");
      specificationNode0.addChild(0, specificationNode1);
      // Undeclared exception!
      try { 
        specificationNode0.getChild((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode(", ");
      SpecificationNode specificationNode1 = new SpecificationNode("Ll]q@Iz7fQErOMScL");
      specificationNode1.addChild(0, specificationNode0);
      specificationNode1.equals((Object) null);
      specificationNode1.readOnly = true;
      // Undeclared exception!
      try { 
        specificationNode0.createNewNode(specificationNode1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Attempt to change read-only object
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ConfigurationNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("::SLBoX^dpTu4R?UqD.");
      SpecificationNode specificationNode1 = new SpecificationNode("@(#)$Id: SpecificationNode.java 988245 2010-08-23 18:39:35Z kwright $");
      specificationNode0.addChild(0, specificationNode1);
      SpecificationNode specificationNode2 = specificationNode0.duplicate(true);
      assertEquals("::SLBoX^dpTu4R?UqD.", specificationNode2.getType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("nhn!{*");
      specificationNode0.toString();
      specificationNode0.toString();
      SpecificationNode specificationNode1 = new SpecificationNode("TvoqM)nl- (S");
      specificationNode1.addChild(0, specificationNode0);
      ConfigurationNode configurationNode0 = specificationNode0.createNewNode(specificationNode1);
      specificationNode1.createNewNode(specificationNode0);
      ConfigurationNode configurationNode1 = specificationNode0.createNewNode();
      specificationNode1.createNewNode(configurationNode0);
      assertTrue(specificationNode0.equals((Object)configurationNode1));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("h9MUYS;=");
      specificationNode0.addChild(0, (ConfigurationNode) null);
      // Undeclared exception!
      try { 
        specificationNode0.duplicate(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ConfigurationNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode(" [");
      specificationNode0.setAttribute("", " [");
      SpecificationNode specificationNode1 = specificationNode0.duplicate(false);
      SpecificationNode specificationNode2 = specificationNode1.duplicate(true);
      assertTrue(specificationNode0.equals((Object)specificationNode1));
      assertNotSame(specificationNode2, specificationNode1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode((String) null);
      SpecificationNode specificationNode1 = null;
      try {
        specificationNode1 = new SpecificationNode((ConfigurationNode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ConfigurationNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("");
      assertEquals("", specificationNode0.getType());
      
      int int0 = 0;
      boolean boolean0 = false;
      specificationNode0.readOnly = false;
      specificationNode0.addChild(0, (ConfigurationNode) null);
      specificationNode0.getChild(0);
      SpecificationNode specificationNode1 = null;
      try {
        specificationNode1 = new SpecificationNode((ConfigurationNode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ConfigurationNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("\"N");
      specificationNode0.setAttribute("\"N", "\"N");
      SpecificationNode specificationNode1 = new SpecificationNode(specificationNode0);
      ConfigurationNode configurationNode0 = specificationNode0.createNewNode(specificationNode1);
      assertNotSame(specificationNode0, configurationNode0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("'w R: ^");
      // Undeclared exception!
      try { 
        specificationNode0.createNewNode((ConfigurationNode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ConfigurationNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("");
      SpecificationNode specificationNode1 = specificationNode0.duplicate(false);
      specificationNode0.duplicate(true);
      int int0 = 1;
      specificationNode0.getAttributes();
      // Undeclared exception!
      try { 
        specificationNode1.clearChildren();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ConfigurationNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("");
      specificationNode0.createNewNode();
      // Undeclared exception!
      try { 
        specificationNode0.getChild(3440);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ConfigurationNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode((String) null);
      SpecificationNode specificationNode1 = new SpecificationNode("'");
      specificationNode0.createNewNode(specificationNode1);
      // Undeclared exception!
      try { 
        specificationNode0.equals(specificationNode1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("3");
      SpecificationNode specificationNode1 = new SpecificationNode(specificationNode0);
      ConfigurationNode configurationNode0 = specificationNode0.createNewNode(specificationNode1);
      assertTrue(configurationNode0.equals((Object)specificationNode1));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode(":");
      ConfigurationNode configurationNode0 = specificationNode0.createNewNode();
      assertEquals(":", configurationNode0.getType());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("@(#)$Id: ConfigurationNode.java 988245 2010-08-23 18:39:35Z kwright $");
      SpecificationNode specificationNode1 = specificationNode0.duplicate(false);
      assertEquals("@(#)$Id: ConfigurationNode.java 988245 2010-08-23 18:39:35Z kwright $", specificationNode1.getType());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("@(#)$Id: ConfigurationNode.java 988245 2010-08-23 18:39:35Z kwright $");
      // Undeclared exception!
      try { 
        specificationNode0.getChild(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ConfigurationNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode((String) null);
      // Undeclared exception!
      try { 
        specificationNode0.getChild(718);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ConfigurationNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("4U");
      SpecificationNode specificationNode1 = new SpecificationNode(specificationNode0);
      assertEquals("4U", specificationNode1.getType());
  }
}