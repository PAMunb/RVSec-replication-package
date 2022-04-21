/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 21 15:44:57 GMT 2022
 */

package org.apache.tika.fork;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.config.LoadErrorHandler;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.fork.ForkParser;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.DelegatingParser;
import org.apache.tika.parser.DummyInitializableParser;
import org.apache.tika.parser.DummyParser;
import org.apache.tika.parser.ErrorParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.xml.sax.ContentHandler;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.helpers.XMLFilterImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ForkParser_ESTest extends ForkParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      DummyInitializableParser dummyInitializableParser0 = new DummyInitializableParser();
      ForkParser forkParser0 = new ForkParser(classLoader0, dummyInitializableParser0);
      ParseContext parseContext0 = new ParseContext();
      forkParser0.getSupportedTypes(parseContext0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      DummyInitializableParser dummyInitializableParser0 = new DummyInitializableParser();
      ForkParser forkParser0 = new ForkParser(classLoader0, dummyInitializableParser0);
      // Undeclared exception!
      try { 
        forkParser0.setJavaCommand((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.fork.ForkParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      Metadata metadata0 = new Metadata();
      ParseContext parseContext0 = new ParseContext();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/apache-tika-fork-0.jar");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      DelegatingParser delegatingParser0 = new DelegatingParser();
      ForkParser forkParser0 = new ForkParser(classLoader0, delegatingParser0);
      try { 
        forkParser0.parse((InputStream) mockFileInputStream0, (ContentHandler) xMLFilterImpl0, metadata0, parseContext0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ErrorParser errorParser0 = new ErrorParser();
      ForkParser forkParser0 = new ForkParser(classLoader0, errorParser0);
      LoadErrorHandler loadErrorHandler0 = mock(LoadErrorHandler.class, new ViolatedAssumptionAnswer());
      ServiceLoader serviceLoader0 = new ServiceLoader(classLoader0, loadErrorHandler0, false);
      Class<String> class0 = String.class;
      List<String> list0 = serviceLoader0.loadStaticServiceProviders(class0);
      forkParser0.setJavaCommand(list0);
      // Undeclared exception!
      try { 
        forkParser0.getJavaCommand();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      DummyInitializableParser dummyInitializableParser0 = new DummyInitializableParser();
      ForkParser forkParser0 = new ForkParser(classLoader0, dummyInitializableParser0);
      assertEquals(5, forkParser0.getPoolSize());
      
      forkParser0.close();
      int int0 = forkParser0.getPoolSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      DummyInitializableParser dummyInitializableParser0 = new DummyInitializableParser();
      ForkParser forkParser0 = new ForkParser(classLoader0, dummyInitializableParser0);
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      Metadata metadata0 = new Metadata();
      ParseContext parseContext0 = new ParseContext();
      // Undeclared exception!
      try { 
        forkParser0.parse((InputStream) null, (ContentHandler) defaultHandler2_0, metadata0, parseContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null stream
         //
         verifyException("org.apache.tika.fork.ForkParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      DummyInitializableParser dummyInitializableParser0 = new DummyInitializableParser();
      ForkParser forkParser0 = new ForkParser(classLoader0, dummyInitializableParser0);
      String string0 = forkParser0.getJavaCommand();
      assertEquals(5, forkParser0.getPoolSize());
      assertEquals("java -Xmx32m", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      DummyInitializableParser dummyInitializableParser0 = new DummyInitializableParser();
      ForkParser forkParser0 = new ForkParser(classLoader0, dummyInitializableParser0);
      ForkParser forkParser1 = null;
      try {
        forkParser1 = new ForkParser(classLoader0, forkParser0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The underlying parser of a ForkParser should not be a ForkParser, but a specific implementation.
         //
         verifyException("org.apache.tika.fork.ForkParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ForkParser forkParser0 = new ForkParser(classLoader0, (Parser) null);
      ParseContext parseContext0 = new ParseContext();
      // Undeclared exception!
      try { 
        forkParser0.getSupportedTypes(parseContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.fork.ForkParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      DummyInitializableParser dummyInitializableParser0 = new DummyInitializableParser();
      ForkParser forkParser0 = new ForkParser(classLoader0, dummyInitializableParser0);
      int int0 = forkParser0.getPoolSize();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      DummyInitializableParser dummyInitializableParser0 = new DummyInitializableParser();
      ForkParser forkParser0 = new ForkParser(classLoader0, dummyInitializableParser0);
      forkParser0.setServerPulseMillis(3361L);
      assertEquals(5, forkParser0.getPoolSize());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ForkParser forkParser0 = new ForkParser(classLoader0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      MediaType mediaType0 = MediaType.APPLICATION_XML;
      Map<String, String> map0 = mediaType0.getParameters();
      DummyParser dummyParser0 = new DummyParser((Set<MediaType>) null, map0, (String) null);
      ForkParser forkParser0 = new ForkParser(classLoader0, dummyParser0);
      forkParser0.setPoolSize(1902);
      assertEquals(1902, forkParser0.getPoolSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      MediaType mediaType0 = MediaType.APPLICATION_XML;
      Map<String, String> map0 = mediaType0.getParameters();
      DummyParser dummyParser0 = new DummyParser((Set<MediaType>) null, map0, (String) null);
      ForkParser forkParser0 = new ForkParser(classLoader0, dummyParser0);
      forkParser0.setJavaCommand("m;D!d/[@(udz+=S!0D}");
      assertEquals(5, forkParser0.getPoolSize());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ForkParser forkParser0 = new ForkParser(classLoader0, (Parser) null);
      List<String> list0 = forkParser0.getJavaCommandAsList();
      assertEquals(5, forkParser0.getPoolSize());
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForkParser forkParser0 = new ForkParser();
  }
}
