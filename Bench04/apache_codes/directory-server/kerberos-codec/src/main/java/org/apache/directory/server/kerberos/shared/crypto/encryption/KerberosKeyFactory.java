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


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.security.auth.kerberos.KerberosKey;
import javax.security.auth.kerberos.KerberosPrincipal;

import org.apache.directory.shared.kerberos.KerberosUtils;
import org.apache.directory.shared.kerberos.codec.types.EncryptionType;
import org.apache.directory.shared.kerberos.components.EncryptionKey;


/**
 * A factory class for producing {@link KerberosKey}'s.  For a list of desired cipher
 * types, Kerberos string-to-key functions are used to derive keys for DES-, DES3-, AES-,
 * and RC4-based encryption types.
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class KerberosKeyFactory
{
    /** A map of default encryption types mapped to cipher names. */
    public static final Map<EncryptionType, String> DEFAULT_CIPHERS;

    static
    {
        Map<EncryptionType, String> map = new HashMap<EncryptionType, String>();

        map.put( EncryptionType.DES_CBC_MD5, "DES" );
        map.put( EncryptionType.DES3_CBC_SHA1_KD, "DESede" );
        map.put( EncryptionType.RC4_HMAC, "ArcFourHmac" );
        map.put( EncryptionType.AES128_CTS_HMAC_SHA1_96, "AES128" );
        map.put( EncryptionType.AES256_CTS_HMAC_SHA1_96, "AES256" );

        DEFAULT_CIPHERS = Collections.unmodifiableMap( map );
    }


    /**
     * Get a map of KerberosKey's for a given principal name and passphrase.  The default set
     * of encryption types is used.
     * 
     * @param principalName The principal name to use for key derivation.
     * @param passPhrase The passphrase to use for key derivation.
     * @return The map of KerberosKey's.
     */
    public static Map<EncryptionType, EncryptionKey> getKerberosKeys( String principalName, String passPhrase )
    {
        return getKerberosKeys( principalName, passPhrase, DEFAULT_CIPHERS.keySet() );
    }


    /**
     * Get a list of KerberosKey's for a given principal name and passphrase and list of cipher
     * types to derive keys for.
     *
     * @param principalName The principal name to use for key derivation.
     * @param passPhrase The passphrase to use for key derivation.
     * @param ciphers The set of ciphers to derive keys for.
     * @return The list of KerberosKey's.
     */
    // This will suppress PMD.EmptyCatchBlock warnings in this method
    public static Map<EncryptionType, EncryptionKey> getKerberosKeys( String principalName, String passPhrase,
        Set<EncryptionType> ciphers )
    {
        Map<EncryptionType, EncryptionKey> kerberosKeys = new HashMap<EncryptionType, EncryptionKey>();

        for ( EncryptionType encryptionType : ciphers )
        {
            try
            {
                kerberosKeys.put( encryptionType, string2Key( principalName, passPhrase, encryptionType ) );
            }
            catch ( IllegalArgumentException iae )
            {
                // Algorithm AES256 not enabled by policy.
                // Algorithm ArcFourHmac not supported by IBM JREs.
                // Algorithm DESede not supported by IBM JREs.
            }
        }

        return kerberosKeys;
    }


    public static EncryptionKey string2Key( String principalName, String passPhrase, EncryptionType encryptionType )
    {
        KerberosPrincipal principal = new KerberosPrincipal( principalName );
        KerberosKey kerberosKey = new KerberosKey( principal, passPhrase.toCharArray(),
            KerberosUtils.getAlgoNameFromEncType( encryptionType ) );
        EncryptionKey encryptionKey = new EncryptionKey( encryptionType, kerberosKey.getEncoded(), kerberosKey
            .getVersionNumber() );

        return encryptionKey;
    }
}
