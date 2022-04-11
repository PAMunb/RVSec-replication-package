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


import java.security.SecureRandom;

import org.apache.directory.shared.kerberos.codec.types.EncryptionType;
import org.apache.directory.shared.kerberos.components.EncryptedData;
import org.apache.directory.shared.kerberos.components.EncryptionKey;
import org.apache.directory.shared.kerberos.exceptions.KerberosException;


/**
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public abstract class EncryptionEngine
{
    private static final SecureRandom random = new SecureRandom();


    protected abstract byte[] getDecryptedData( EncryptionKey key, EncryptedData data, KeyUsage usage )
        throws KerberosException;


    protected abstract EncryptedData getEncryptedData( EncryptionKey key, byte[] plainText, KeyUsage usage );


    protected abstract EncryptionType getEncryptionType();


    protected abstract int getConfounderLength();


    protected abstract int getChecksumLength();


    protected abstract byte[] encrypt( byte[] plainText, byte[] key );


    protected abstract byte[] decrypt( byte[] cipherText, byte[] key );


    protected abstract byte[] calculateIntegrity( byte[] plainText, byte[] key, KeyUsage usage );


    protected byte[] deriveRandom( byte[] key, byte[] usage, int n, int k )
    {
        byte[] nFoldedUsage = NFold.nFold( n, usage );

        int kBytes = k / 8;
        byte[] result = new byte[kBytes];

        byte[] fillingKey = encrypt( nFoldedUsage, key );

        int pos = 0;

        for ( int i = 0; i < kBytes; i++ )
        {
            if ( pos < fillingKey.length )
            {
                result[i] = fillingKey[pos];
                pos++;
            }
            else
            {
                fillingKey = encrypt( fillingKey, key );
                pos = 0;
                result[i] = fillingKey[pos];
                pos++;
            }
        }

        return result;
    }


    // Encryption
    protected byte[] getRandomBytes( int size )
    {
        byte[] bytes = new byte[size];

        // SecureRandom.nextBytes is already synchronized
        random.nextBytes( bytes );

        return bytes;
    }


    // Encryption
    protected byte[] padString( byte encodedString[] )
    {
        int x;
        if ( encodedString.length < 8 )
        {
            x = encodedString.length;
        }
        else
        {
            x = encodedString.length % 8;
        }

        if ( x == 0 )
        {
            return encodedString;
        }

        byte paddedByteArray[] = new byte[( 8 - x ) + encodedString.length];

        for ( int y = paddedByteArray.length - 1; y > encodedString.length - 1; y-- )
        {
            paddedByteArray[y] = 0;
        }

        System.arraycopy( encodedString, 0, paddedByteArray, 0, encodedString.length );

        return paddedByteArray;
    }


    // Encryption
    protected byte[] concatenateBytes( byte[] array1, byte[] array2 )
    {
        int l1 = array1.length;
        int l2 = array2.length;
        byte concatenatedBytes[] = new byte[l1 + l2];

        System.arraycopy( array1, 0, concatenatedBytes, 0, l1 );
        System.arraycopy( array2, 0, concatenatedBytes, l1, l2 );

        return concatenatedBytes;
    }


    // Decryption
    protected byte[] removeLeadingBytes( byte[] array, int confounder, int checksum )
    {
        byte lessBytes[] = new byte[array.length - confounder - checksum];

        int j = 0;
        for ( int i = confounder + checksum; i < array.length; i++ )
        {
            lessBytes[j] = array[i];
            j++;
        }

        return lessBytes;
    }


    protected byte[] removeTrailingBytes( byte[] array, int confounder, int checksum )
    {
        byte lessBytes[] = new byte[array.length - confounder - checksum];

        int j = 0;
        for ( int i = 0; i < array.length - confounder - checksum; i++ )
        {
            lessBytes[j] = array[i];
            j++;
        }

        return lessBytes;
    }


    protected int getBit( byte[] data, int pos )
    {
        int posByte = pos / 8;
        int posBit = pos % 8;

        byte valByte = data[posByte];
        int valInt = valByte >> ( 8 - ( posBit + 1 ) ) & 0x0001;
        return valInt;
    }


    protected void setBit( byte[] data, int pos, int val )
    {
        int posByte = pos / 8;
        int posBit = pos % 8;
        byte oldByte = data[posByte];
        oldByte = ( byte ) ( ( ( 0xFF7F >> posBit ) & oldByte ) & 0x00FF );
        byte newByte = ( byte ) ( ( val << ( 8 - ( posBit + 1 ) ) ) | oldByte );
        data[posByte] = newByte;
    }


    /**
     * The "well-known constant" used for the DK function is the key
     * usage number, expressed as four octets in big-endian order,
     * followed by one octet indicated below.
     * 
     *  Kc = DK(base-key, usage | 0x99);
     */
    protected byte[] getUsageKc( KeyUsage usage )
    {
        return getUsage( usage.getOrdinal(), ( byte ) 0x99 );
    }


    /**
     * The "well-known constant" used for the DK function is the key
     * usage number, expressed as four octets in big-endian order,
     * followed by one octet indicated below.
     * 
     *  Ke = DK(base-key, usage | 0xAA);
     */
    protected byte[] getUsageKe( KeyUsage usage )
    {
        return getUsage( usage.getOrdinal(), ( byte ) 0xAA );
    }


    /**
     * The "well-known constant" used for the DK function is the key
     * usage number, expressed as four octets in big-endian order,
     * followed by one octet indicated below.
     * 
     *  Ki = DK(base-key, usage | 0x55);
     */
    protected byte[] getUsageKi( KeyUsage usage )
    {
        return getUsage( usage.getOrdinal(), ( byte ) 0x55 );
    }


    private byte[] getUsage( int usage, byte constant )
    {
        byte[] bytes = new byte[5];
        bytes[0] = ( byte ) ( ( usage >>> 24 ) & 0x000000FF );
        bytes[1] = ( byte ) ( ( usage >> 16 ) & 0x000000FF );
        bytes[2] = ( byte ) ( ( usage >> 8 ) & 0x000000FF );
        bytes[3] = ( byte ) ( usage & 0x00FF );
        bytes[4] = constant;

        return bytes;
    }
}
