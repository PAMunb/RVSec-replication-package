/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 18 12:31:58 GMT 2022
 */

package org.apache.manifoldcf.core.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.manifoldcf.core.interfaces.ConfigurationNode;
import org.apache.manifoldcf.core.interfaces.SpecificationNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SpecificationNode_ESTest extends SpecificationNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode((String) null);
      assertEquals(0, specificationNode0.getChildCount());
      
      specificationNode0.addChild(0, (ConfigurationNode) null);
      // Undeclared exception!
      try { 
        specificationNode0.duplicate(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ConfigurationNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode((String) null);
      specificationNode0.addChild(0, specificationNode0);
      SpecificationNode specificationNode1 = specificationNode0.getChild(0);
      // Undeclared exception!
      try { 
        specificationNode1.getChild(2499);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2499, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("");
      ConfigurationNode configurationNode0 = new ConfigurationNode(specificationNode0);
      configurationNode0.type = "org.apache.manifoldcf.core.interfaces.SpecificationNode";
      ConfigurationNode configurationNode1 = specificationNode0.createNewNode();
      specificationNode0.makeReadOnly();
      configurationNode0.addChild(0, configurationNode1);
      configurationNode0.readOnly = true;
      configurationNode0.toString();
      // Undeclared exception!
      try { 
        specificationNode0.createNewNode(configurationNode0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Attempt to change read-only object
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ConfigurationNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode((String) null);
      specificationNode0.addChild(0, specificationNode0);
      // Undeclared exception!
      try { 
        specificationNode0.createNewNode(specificationNode0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode((String) null);
      SpecificationNode specificationNode1 = specificationNode0.duplicate(false);
      specificationNode1.addChild(0, specificationNode0);
      specificationNode1.createNewNode(specificationNode0);
      SpecificationNode specificationNode2 = specificationNode1.getChild(0);
      assertNotSame(specificationNode1, specificationNode2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode((String) null);
      ConfigurationNode configurationNode0 = new ConfigurationNode("@(#)$Id: SpecificationNode.java 988245 2010-08-23 18:39:35Z kwright $");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      ConfigurationNode.cloneAttributes(hashMap0);
      specificationNode0.addChild(0, configurationNode0);
      // Undeclared exception!
      try { 
        specificationNode0.getChild(0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.manifoldcf.core.interfaces.ConfigurationNode cannot be cast to org.apache.manifoldcf.core.interfaces.SpecificationNode
         //
         verifyException("org.apache.manifoldcf.core.interfaces.SpecificationNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode((String) null);
      ConfigurationNode configurationNode0 = new ConfigurationNode("@(#)$Id: SpecificationNode.java 988245 2010-08-23 18:39:35Z kwright $");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      ConfigurationNode.cloneAttributes(hashMap0);
      specificationNode0.addChild(0, configurationNode0);
      SpecificationNode specificationNode1 = specificationNode0.duplicate(false);
      ConfigurationNode configurationNode1 = specificationNode1.createNewNode(specificationNode0);
      assertNull(configurationNode1.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("=65TRf2oG <Y");
      ConfigurationNode configurationNode0 = new ConfigurationNode(specificationNode0);
      SpecificationNode specificationNode1 = new SpecificationNode(configurationNode0);
      LinkedList<ConfigurationNode> linkedList0 = new LinkedList<ConfigurationNode>();
      specificationNode1.children = (List<ConfigurationNode>) linkedList0;
      // Undeclared exception!
      try { 
        specificationNode1.getChild(12);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 12, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode((String) null);
      SpecificationNode specificationNode1 = specificationNode0.duplicate(true);
      specificationNode1.type = "@(#)$Id: ConfigurationNode.java 988245 2010-08-23 18:39:35Z kwright $";
      ConfigurationNode configurationNode0 = new ConfigurationNode("");
      configurationNode0.setValue("@(#)$Id: SpecificationNode.java 988245 2010-08-23 18:39:35Z kwright $");
      ConfigurationNode configurationNode1 = new ConfigurationNode(configurationNode0);
      specificationNode0.addChild(0, configurationNode1);
      ConfigurationNode configurationNode2 = new ConfigurationNode(specificationNode1);
      specificationNode0.setValue("@(#)$Id: ConfigurationNode.java 988245 2010-08-23 18:39:35Z kwright $");
      SpecificationNode specificationNode2 = new SpecificationNode(configurationNode2);
      SpecificationNode specificationNode3 = specificationNode2.duplicate(true);
      SpecificationNode specificationNode4 = specificationNode3.duplicate(true);
      specificationNode4.createNewNode(configurationNode1);
      ArrayList<ConfigurationNode> arrayList0 = new ArrayList<ConfigurationNode>();
      arrayList0.add((ConfigurationNode) specificationNode1);
      configurationNode2.children = (List<ConfigurationNode>) arrayList0;
      specificationNode1.createNewNode();
      specificationNode3.value = "F";
      SpecificationNode specificationNode5 = specificationNode2.duplicate(false);
      ConfigurationNode configurationNode3 = specificationNode5.createNewNode();
      specificationNode0.setValue("iJvzdw7|?HXc'bL");
      specificationNode5.setAttribute("", "@(#)$Id: SpecificationNode.java 988245 2010-08-23 18:39:35Z kwright $");
      configurationNode3.removeChild(0);
      ConfigurationNode configurationNode4 = specificationNode2.createNewNode(configurationNode3);
      ConfigurationNode configurationNode5 = specificationNode2.createNewNode();
      SpecificationNode specificationNode6 = specificationNode0.duplicate(false);
      configurationNode5.equals(specificationNode6);
      specificationNode5.createNewNode(configurationNode5);
      assertFalse(specificationNode2.equals((Object)specificationNode1));
      assertTrue(specificationNode1.equals((Object)configurationNode4));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode((String) null);
      int int0 = 0;
      specificationNode0.removeChild(0);
      ConfigurationNode configurationNode0 = null;
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
  public void test10()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("");
      SpecificationNode specificationNode1 = specificationNode0.duplicate(false);
      assertTrue(specificationNode1.equals((Object)specificationNode0));
      
      specificationNode1.setAttribute("", "");
      specificationNode1.duplicate(false);
      specificationNode1.createNewNode(specificationNode0);
      specificationNode0.createNewNode(specificationNode1);
      assertEquals("", specificationNode1.getType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("sax6c_v5G4ZGK");
      ConfigurationNode configurationNode0 = specificationNode0.createDuplicate(false);
      SpecificationNode specificationNode1 = new SpecificationNode("@(#)$Id: ConfigurationNode.java 988245 2010-08-23 18:39:35Z kwright $");
      specificationNode0.createNewNode(specificationNode1);
      assertTrue(specificationNode0.equals((Object)configurationNode0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode(":cw#; Pfn]");
      ConfigurationNode configurationNode0 = specificationNode0.createNewNode();
      assertEquals(":cw#; Pfn]", configurationNode0.getType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("j? w[qP&");
      Vector<ConfigurationNode> vector0 = new Vector<ConfigurationNode>();
      specificationNode0.children = (List<ConfigurationNode>) vector0;
      // Undeclared exception!
      try { 
        specificationNode0.getChild(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConfigurationNode configurationNode0 = new ConfigurationNode("tBEhBx>");
      SpecificationNode specificationNode0 = new SpecificationNode(configurationNode0);
      ConfigurationNode configurationNode1 = specificationNode0.createNewNode(configurationNode0);
      assertNotSame(configurationNode1, specificationNode0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("@$");
      SpecificationNode specificationNode1 = specificationNode0.duplicate(false);
      assertEquals("@$", specificationNode1.getType());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SpecificationNode specificationNode0 = null;
      try {
        specificationNode0 = new SpecificationNode((ConfigurationNode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ConfigurationNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("%j.qgA]/");
      int int0 = (-3153);
      // Undeclared exception!
      try { 
        specificationNode0.getChild((-3153));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ConfigurationNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("7PGTE:512B7M7J#");
      // Undeclared exception!
      try { 
        specificationNode0.getChild((-1613));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ConfigurationNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode("v;'Lt3y;'Az$");
      SpecificationNode specificationNode1 = specificationNode0.duplicate(true);
      assertEquals("v;'Lt3y;'Az$", specificationNode1.getType());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ConfigurationNode configurationNode0 = new ConfigurationNode("");
      SpecificationNode specificationNode0 = new SpecificationNode(configurationNode0);
      SpecificationNode specificationNode1 = new SpecificationNode(specificationNode0);
      assertEquals(0, specificationNode1.getAttributeCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SpecificationNode specificationNode0 = new SpecificationNode((String) null);
      SpecificationNode specificationNode1 = specificationNode0.duplicate(true);
      specificationNode1.createNewNode(specificationNode0);
      // Undeclared exception!
      try { 
        specificationNode1.getChild(1899);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.manifoldcf.core.interfaces.ConfigurationNode", e);
      }
  }
}
