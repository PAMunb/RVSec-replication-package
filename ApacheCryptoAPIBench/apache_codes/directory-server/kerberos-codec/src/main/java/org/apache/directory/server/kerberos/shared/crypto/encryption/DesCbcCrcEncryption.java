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


import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.zip.CRC32;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.directory.shared.kerberos.exceptions.KerberosException;
import org.apache.directory.shared.kerberos.codec.types.EncryptionType;
import org.apache.directory.shared.kerberos.components.EncryptedData;
import org.apache.directory.shared.kerberos.components.EncryptionKey;
import org.apache.directory.shared.kerberos.exceptions.ErrorType;


/**
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class DesCbcCrcEncryption extends EncryptionEngine
{
    private static final byte[] iv = new byte[]
        { ( byte ) 0x00, ( byte ) 0x00, ( byte ) 0x00, ( byte ) 0x00, ( byte ) 0x00, ( byte ) 0x00, ( byte ) 0x00,
            ( byte ) 0x00 };


    public EncryptionType getEncryptionType()
    {
        return EncryptionType.DES_CBC_CRC;
    }


    public int getConfounderLength()
    {
        return 8;
    }


    public int getChecksumLength()
    {
        return 4;
    }


    public byte[] calculateIntegrity( byte[] data, byte[] key, KeyUsage usage )
    {
        CRC32 crc32 = new CRC32();
        crc32.update( data );

        return int2octet( ( int ) crc32.getValue() );
    }


    private byte[] int2octet( int value )
    {
        byte[] bytes = new byte[4];
        int i, shift;

        for ( i = 0, shift = 24; i < 4; i++, shift -= 8 )
        {
            bytes[i] = ( byte ) ( 0xFF & ( value >> shift ) );
        }

        return bytes;
    }


    public byte[] getDecryptedData( EncryptionKey key, EncryptedData data, KeyUsage usage ) throws KerberosException
    {
        // decrypt the data
        byte[] decryptedData = decrypt( data.getCipher(), key.getKeyValue() );

        // extract the old checksum
        byte[] oldChecksum = new byte[getChecksumLength()];
        System.arraycopy( decryptedData, getConfounderLength(), oldChecksum, 0, oldChecksum.length );

        // zero out the old checksum in the cipher text
        for ( int i = getConfounderLength(); i < getConfounderLength() + getChecksumLength(); i++ )
        {
            decryptedData[i] = 0;
        }

        // calculate a new checksum
        byte[] newChecksum = calculateIntegrity( decryptedData, key.getKeyValue(), usage );

        // compare checksums
        if ( !Arrays.equals( oldChecksum, newChecksum ) )
        {
            throw new KerberosException( ErrorType.KRB_AP_ERR_BAD_INTEGRITY );
        }

        // remove leading confounder and checksum
        return removeLeadingBytes( decryptedData, getConfounderLength(), getChecksumLength() );
    }


    public EncryptedData getEncryptedData( EncryptionKey key, byte[] plainText, KeyUsage usage )
    {
        // build the ciphertext structure
        byte[] conFounder = getRandomBytes( getConfounderLength() );
        byte[] zeroedChecksum = new byte[getChecksumLength()];
        byte[] dataBytes = concatenateBytes( conFounder, concatenateBytes( zeroedChecksum, plainText ) );
        byte[] paddedDataBytes = padString( dataBytes );
        byte[] checksumBytes = calculateIntegrity( paddedDataBytes, null, usage );

        // lay the checksum into the ciphertext
        for ( int i = getConfounderLength(); i < getConfounderLength() + getChecksumLength(); i++ )
        {
            paddedDataBytes[i] = checksumBytes[i - getConfounderLength()];
        }

        byte[] encryptedData = encrypt( paddedDataBytes, key.getKeyValue() );

        return new EncryptedData( getEncryptionType(), key.getKeyVersion(), encryptedData );
    }


    public byte[] encrypt( byte[] plainText, byte[] keyBytes )
    {
        return processCipher( true, plainText, keyBytes );
    }


    public byte[] decrypt( byte[] cipherText, byte[] keyBytes )
    {
        return processCipher( false, cipherText, keyBytes );
    }


    private byte[] processCipher( boolean isEncrypt, byte[] data, byte[] keyBytes )
    {
        try
        {
            Cipher cipher = Cipher.getInstance( "DES/CBC/NoPadding" );
            SecretKey key = new SecretKeySpec( keyBytes, "DES" );

            AlgorithmParameterSpec paramSpec = new IvParameterSpec( iv );

            if ( isEncrypt )
            {
                cipher.init( Cipher.ENCRYPT_MODE, key, paramSpec );
            }
            else
            {
                cipher.init( Cipher.DECRYPT_MODE, key, paramSpec );
            }

            return cipher.doFinal( data );
        }
        catch ( GeneralSecurityException nsae )
        {
            nsae.printStackTrace();
            return null;
        }
    }
}
