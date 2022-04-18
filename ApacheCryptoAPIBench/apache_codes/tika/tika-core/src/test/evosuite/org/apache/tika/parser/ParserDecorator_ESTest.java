/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 13:50:35 GMT 2022
 */

package org.apache.tika.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.detect.NonDetectingEncodingDetector;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.CryptoParserTest;
import org.apache.tika.parser.DefaultParser;
import org.apache.tika.parser.DelegatingParser;
import org.apache.tika.parser.DigestingParser;
import org.apache.tika.parser.DummyInitializableParser;
import org.apache.tika.parser.DummyParameterizedParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.ParserDecorator;
import org.apache.tika.parser.ParserPostProcessor;
import org.apache.tika.parser.RecursiveParserWrapper;
import org.apache.tika.parser.digest.CompositeDigester;
import org.apache.tika.parser.digest.InputStreamDigester;
import org.apache.tika.sax.BasicContentHandlerFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;
import org.xml.sax.ContentHandler;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.helpers.XMLReaderAdapter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParserDecorator_ESTest extends ParserDecorator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DelegatingParser delegatingParser0 = new DelegatingParser();
      CryptoParserTest cryptoParserTest0 = new CryptoParserTest();
      CryptoParserTest.CryptoParserImpl cryptoParserTest_CryptoParserImpl0 = cryptoParserTest0.new CryptoParserImpl("YoK)o[8JFU&21");
      ParseContext parseContext0 = new ParseContext();
      Set<MediaType> set0 = cryptoParserTest_CryptoParserImpl0.getSupportedTypes(parseContext0);
      Parser parser0 = ParserDecorator.withoutTypes(delegatingParser0, set0);
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.IGNORE;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, 0);
      RecursiveParserWrapper recursiveParserWrapper0 = new RecursiveParserWrapper(parser0, basicContentHandlerFactory0);
      ParserPostProcessor parserPostProcessor0 = new ParserPostProcessor(recursiveParserWrapper0);
      Set<MediaType> set1 = parserPostProcessor0.getSupportedTypes(parseContext0);
      assertTrue(set1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DummyInitializableParser dummyInitializableParser0 = new DummyInitializableParser();
      ParserPostProcessor parserPostProcessor0 = new ParserPostProcessor(dummyInitializableParser0);
      File file0 = MockFile.createTempFile("SUM", "SUM", (File) null);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      Metadata metadata0 = new Metadata();
      ParseContext parseContext0 = new ParseContext();
      parserPostProcessor0.parse((InputStream) mockFileInputStream0, (ContentHandler) xMLFilterImpl0, metadata0, parseContext0);
      assertNull(parserPostProcessor0.getDecorationName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ParserPostProcessor parserPostProcessor0 = new ParserPostProcessor((Parser) null);
      Parser parser0 = parserPostProcessor0.getWrappedParser();
      assertNull(parser0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[2];
      DummyInitializableParser dummyInitializableParser0 = new DummyInitializableParser();
      DigestingParser.Encoder digestingParser_Encoder0 = mock(DigestingParser.Encoder.class, new ViolatedAssumptionAnswer());
      InputStreamDigester inputStreamDigester0 = new InputStreamDigester(0, stringArray0[1], digestingParser_Encoder0);
      DigestingParser digestingParser0 = new DigestingParser(dummyInitializableParser0, inputStreamDigester0);
      ParseContext parseContext0 = new ParseContext();
      Set<MediaType> set0 = digestingParser0.getSupportedTypes(parseContext0);
      assertEquals(1, set0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        ParserDecorator.withFallbacks((Collection<? extends Parser>) null, (Set<MediaType>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[2];
      DummyInitializableParser dummyInitializableParser0 = new DummyInitializableParser();
      DigestingParser.Encoder digestingParser_Encoder0 = mock(DigestingParser.Encoder.class, new ViolatedAssumptionAnswer());
      InputStreamDigester inputStreamDigester0 = new InputStreamDigester(0, stringArray0[1], digestingParser_Encoder0);
      DigestingParser digestingParser0 = new DigestingParser(dummyInitializableParser0, inputStreamDigester0);
      ParseContext parseContext0 = new ParseContext();
      BasicContentHandlerFactory.HANDLER_TYPE basicContentHandlerFactory_HANDLER_TYPE0 = BasicContentHandlerFactory.HANDLER_TYPE.BODY;
      BasicContentHandlerFactory basicContentHandlerFactory0 = new BasicContentHandlerFactory(basicContentHandlerFactory_HANDLER_TYPE0, 0);
      ContentHandler contentHandler0 = basicContentHandlerFactory0.getNewContentHandler();
      Metadata metadata0 = new Metadata();
      // Undeclared exception!
      try { 
        digestingParser0.parse((InputStream) null, contentHandler0, metadata0, parseContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The Stream must not be null
         //
         verifyException("org.apache.tika.io.TikaInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DummyInitializableParser dummyInitializableParser0 = new DummyInitializableParser();
      DigestingParser.Digester[] digestingParser_DigesterArray0 = new DigestingParser.Digester[2];
      DigestingParser.Encoder digestingParser_Encoder0 = mock(DigestingParser.Encoder.class, new ViolatedAssumptionAnswer());
      InputStreamDigester inputStreamDigester0 = new InputStreamDigester(0, "F`tR`J6|'>Py@},Zq", "SUM", digestingParser_Encoder0);
      digestingParser_DigesterArray0[0] = (DigestingParser.Digester) inputStreamDigester0;
      CompositeDigester compositeDigester0 = new CompositeDigester(digestingParser_DigesterArray0);
      DigestingParser digestingParser0 = new DigestingParser(dummyInitializableParser0, compositeDigester0);
      ParseContext parseContext0 = new ParseContext();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 219, (-150));
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      Metadata metadata0 = new Metadata();
      // Undeclared exception!
      try { 
        digestingParser0.parse((InputStream) dataInputStream0, (ContentHandler) defaultHandler2_0, metadata0, parseContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: F`tR`J6|'>Py@},Zq MessageDigest not available
         //
         verifyException("org.apache.tika.parser.digest.InputStreamDigester", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParserDecorator parserDecorator0 = new ParserDecorator((Parser) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      Metadata metadata0 = new Metadata();
      ParseContext parseContext0 = new ParseContext();
      // Undeclared exception!
      try { 
        parserDecorator0.parse((InputStream) pipedInputStream0, (ContentHandler) xMLReaderAdapter0, metadata0, parseContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.tika.parser.ParserDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          LinkedHashSet<AutoDetectParser> linkedHashSet0 = new LinkedHashSet<AutoDetectParser>();
          Parser parser0 = ParserDecorator.withFallbacks(linkedHashSet0, (Set<MediaType>) null);
          ParserPostProcessor parserPostProcessor0 = new ParserPostProcessor(parser0);
          byte[] byteArray0 = new byte[0];
          ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-10), (-2629));
          Metadata metadata0 = new Metadata();
          XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
          ParseContext parseContext0 = new ParseContext();
          // Undeclared exception!
          try { 
            parserPostProcessor0.parse((InputStream) byteArrayInputStream0, (ContentHandler) xMLFilterImpl0, metadata0, parseContext0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Unable to create temporary file or directory
             //
             verifyException("java.nio.file.TempFileHelper", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashSet<DummyParameterizedParser> linkedHashSet0 = new LinkedHashSet<DummyParameterizedParser>();
      MediaType[] mediaTypeArray0 = new MediaType[4];
      linkedHashSet0.add((DummyParameterizedParser) null);
      Set<MediaType> set0 = MediaType.set(mediaTypeArray0);
      Parser parser0 = ParserDecorator.withFallbacks(linkedHashSet0, set0);
      assertNotNull(parser0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ParseContext parseContext0 = new ParseContext();
      LinkedHashSet<DummyParameterizedParser> linkedHashSet0 = new LinkedHashSet<DummyParameterizedParser>();
      MediaType[] mediaTypeArray0 = new MediaType[4];
      Set<MediaType> set0 = MediaType.set(mediaTypeArray0);
      Parser parser0 = ParserDecorator.withFallbacks(linkedHashSet0, set0);
      ParserPostProcessor parserPostProcessor0 = new ParserPostProcessor(parser0);
      Set<MediaType> set1 = parserPostProcessor0.getSupportedTypes(parseContext0);
      assertEquals(0, set1.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MediaTypeRegistry mediaTypeRegistry0 = new MediaTypeRegistry();
      ServiceLoader serviceLoader0 = new ServiceLoader();
      NonDetectingEncodingDetector nonDetectingEncodingDetector0 = new NonDetectingEncodingDetector();
      DefaultParser defaultParser0 = new DefaultParser(mediaTypeRegistry0, serviceLoader0, nonDetectingEncodingDetector0);
      Parser parser0 = ParserDecorator.withoutTypes(defaultParser0, (Set<MediaType>) null);
      ParserDecorator parserDecorator0 = new ParserDecorator(parser0);
      ParseContext parseContext0 = new ParseContext();
      // Undeclared exception!
      try { 
        parserDecorator0.getSupportedTypes(parseContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DelegatingParser delegatingParser0 = new DelegatingParser();
      ParserDecorator parserDecorator0 = new ParserDecorator(delegatingParser0);
      Parser parser0 = parserDecorator0.getWrappedParser();
      assertSame(parser0, delegatingParser0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Parser parser0 = ParserDecorator.withTypes((Parser) null, (Set<MediaType>) null);
      ParserDecorator parserDecorator0 = new ParserDecorator(parser0);
      ParseContext parseContext0 = new ParseContext();
      Set<MediaType> set0 = parserDecorator0.getSupportedTypes(parseContext0);
      assertNull(set0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DummyInitializableParser dummyInitializableParser0 = new DummyInitializableParser();
      DigestingParser.Digester[] digestingParser_DigesterArray0 = new DigestingParser.Digester[2];
      CompositeDigester compositeDigester0 = new CompositeDigester(digestingParser_DigesterArray0);
      DigestingParser digestingParser0 = new DigestingParser(dummyInitializableParser0, compositeDigester0);
      String string0 = digestingParser0.getDecorationName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CryptoParserTest cryptoParserTest0 = new CryptoParserTest();
      CryptoParserTest.CryptoParserImpl cryptoParserTest_CryptoParserImpl0 = cryptoParserTest0.new CryptoParserImpl("'[F-*jl<Zf;");
      ParseContext parseContext0 = new ParseContext();
      ParserPostProcessor parserPostProcessor0 = new ParserPostProcessor(cryptoParserTest_CryptoParserImpl0);
      Metadata metadata0 = new Metadata();
      try { 
        parserPostProcessor0.parse((InputStream) null, (ContentHandler) null, metadata0, parseContext0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to decrypt document stream
         //
         verifyException("org.apache.tika.parser.CryptoParser", e);
      }
  }
}
