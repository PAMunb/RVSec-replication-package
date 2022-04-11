package org.apache.tika.parser;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.SecureRandom;
import java.util.HashSet;

import javax.crypto.KeyGenerator;

import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.sax.BasicContentHandlerFactory;
import org.junit.Test;
import org.xml.sax.ContentHandler;

public class CryptoParserTest {

    private static final String ALGORITHM = "DES";

    @Test
    public void testCryptoParser() throws Exception {
        ContentHandler handler = new BasicContentHandlerFactory(BasicContentHandlerFactory.HANDLER_TYPE.TEXT, -1).getNewContentHandler();
        
        KeyGenerator keyGen = KeyGenerator.getInstance(ALGORITHM);
        SecureRandom secRandom = new SecureRandom();
        keyGen.init(secRandom);
        Key key = keyGen.generateKey();
        ParseContext context = new ParseContext();
        context.set(Key.class, key);

        CryptoParserImpl parser = new CryptoParserImpl(ALGORITHM);
        System.err.println("parser="+parser);
        parser.parse(TikaInputStream.get("someString".getBytes(StandardCharsets.ISO_8859_1)), handler, new Metadata(), context);
    }

    class CryptoParserImpl extends CryptoParser {
        private static final long serialVersionUID = 1L;

        public CryptoParserImpl(String transformation) {
            super(transformation, new HashSet<MediaType>());
        }
    }

}
