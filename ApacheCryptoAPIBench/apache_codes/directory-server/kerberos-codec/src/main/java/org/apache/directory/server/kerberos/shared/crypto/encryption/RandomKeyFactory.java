/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *  
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License. 
 *  
 */
package org.apache.directory.server.kerberos.shared.crypto.encryption;


import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.apache.directory.server.i18n.I18n;
import org.apache.directory.shared.kerberos.codec.types.EncryptionType;
import org.apache.directory.shared.kerberos.components.EncryptionKey;
import org.apache.directory.shared.kerberos.exceptions.ErrorType;
import org.apache.directory.shared.kerberos.exceptions.KerberosException;


/**
 * A factory class for producing random keys, suitable for use as session keys.  For a
 * list of desired cipher types, Kerberos random-to-key functions are used to derive
 * keys for DES-, DES3-, AES-, and RC4-based encryption types.
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class RandomKeyFactory
{
    /** A map of default encryption types mapped to cipher names. */
    private static final Map<EncryptionType, String> DEFAULT_CIPHERS;

    static
    {
        Map<EncryptionType, String> map = new HashMap<EncryptionType, String>();

        map.put( EncryptionType.DES_CBC_MD5, "DES" );
        map.put( EncryptionType.DES3_CBC_SHA1_KD, "DESede" );
        map.put( EncryptionType.RC4_HMAC, "RC4" );
        map.put( EncryptionType.AES128_CTS_HMAC_SHA1_96, "AES" );
        map.put( EncryptionType.AES256_CTS_HMAC_SHA1_96, "AES" );

        DEFAULT_CIPHERS = Collections.unmodifiableMap( map );
    }


    /**
     * Get a map of random keys.  The default set of encryption types is used.
     * 
     * @return The map of random keys.
     * @throws KerberosException 
     */
    public static Map<EncryptionType, EncryptionKey> getRandomKeys() throws KerberosException
    {
        return getRandomKeys( DEFAULT_CIPHERS.keySet() );
    }


    /**
     * Get a map of random keys for a list of cipher types to derive keys for.
     *
     * @param ciphers The list of ciphers to derive keys for.
     * @return The list of KerberosKey's.
     * @throws KerberosException 
     */
    public static Map<EncryptionType, EncryptionKey> getRandomKeys( Set<EncryptionType> ciphers )
        throws KerberosException
    {
        Map<EncryptionType, EncryptionKey> map = new HashMap<EncryptionType, EncryptionKey>();

        for ( EncryptionType encryptionType : ciphers )
        {
            map.put( encryptionType, getRandomKey( encryptionType ) );
        }

        return map;
    }


    /**
     * Get a new random key for a given {@link EncryptionType}.
     * 
     * @param encryptionType 
     * 
     * @return The new random key.
     * @throws KerberosException 
     */
    public static EncryptionKey getRandomKey( EncryptionType encryptionType ) throws KerberosException
    {
        String algorithm = DEFAULT_CIPHERS.get( encryptionType );

        if ( algorithm == null )
        {
            throw new KerberosException( ErrorType.KDC_ERR_ETYPE_NOSUPP, I18n.err( I18n.ERR_616,
                encryptionType.getName() ) );
        }

        try
        {
            KeyGenerator keyGenerator = KeyGenerator.getInstance( algorithm );

            if ( encryptionType.equals( EncryptionType.AES128_CTS_HMAC_SHA1_96 ) )
            {
                keyGenerator.init( 128 );
            }

            if ( encryptionType.equals( EncryptionType.AES256_CTS_HMAC_SHA1_96 ) )
            {
                keyGenerator.init( 256 );
            }

            SecretKey key = keyGenerator.generateKey();

            byte[] keyBytes = key.getEncoded();

            return new EncryptionKey( encryptionType, keyBytes );
        }
        catch ( NoSuchAlgorithmException nsae )
        {
            throw new KerberosException( ErrorType.KDC_ERR_ETYPE_NOSUPP, nsae );
        }
    }
}
