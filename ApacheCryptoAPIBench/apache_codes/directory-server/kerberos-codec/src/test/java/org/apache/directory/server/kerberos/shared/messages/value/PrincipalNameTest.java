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
package org.apache.directory.server.kerberos.shared.messages.value;


import static org.junit.Assert.assertEquals;

import java.nio.ByteBuffer;

import org.apache.directory.api.util.Strings;
import org.apache.directory.shared.kerberos.codec.types.PrincipalNameType;
import org.apache.directory.shared.kerberos.components.PrincipalName;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.mycila.junit.concurrent.Concurrency;
import com.mycila.junit.concurrent.ConcurrentJunitRunner;


/**
 * Test the PrincipalName encoding and decoding
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
@RunWith(ConcurrentJunitRunner.class)
@Concurrency()
public class PrincipalNameTest
{
    @Test
    public void testEncodingPrincipalNameOneName() throws Exception
    {
        PrincipalName principal = new PrincipalName( "Test", PrincipalNameType.KRB_NT_PRINCIPAL );

        ByteBuffer encoded = ByteBuffer.allocate( principal.computeLength() );

        principal.encode( encoded );

        byte[] expectedResult = new byte[]
            {
                0x30, 0x0F,
                ( byte ) 0xA0, 0x03,
                0x02, 0x01, 0x01,
                ( byte ) 0xA1, 0x08,
                0x30, 0x06,
                0x1B, 0x04,
                'T', 'e', 's', 't'
        };

        assertEquals( Strings.dumpBytes( expectedResult ), Strings.dumpBytes( encoded.array() ) );
    }


    @Test
    public void testEncodingPrincipalName3names() throws Exception
    {
        PrincipalName principal = new PrincipalName( "Test1", PrincipalNameType.KRB_NT_PRINCIPAL );
        principal.addName( "Test2" );
        principal.addName( "Test3" );

        ByteBuffer encoded = ByteBuffer.allocate( principal.computeLength() );

        principal.encode( encoded );

        byte[] expectedResult = new byte[]
            {
                0x30, 0x1e,
                ( byte ) 0xA0, 0x03,
                0x02, 0x01, 0x01,
                ( byte ) 0xA1, 0x17,
                0x30, 0x15,
                0x1B, 0x05,
                'T', 'e', 's', 't', '1',
                0x1B, 0x05,
                'T', 'e', 's', 't', '2',
                0x1B, 0x05,
                'T', 'e', 's', 't', '3'
        };

        assertEquals( Strings.dumpBytes( expectedResult ), Strings.dumpBytes( encoded.array() ) );
    }


    @Test
    public void testEncodingPrincipalNameNullName() throws Exception
    {
        PrincipalName principal = new PrincipalName( null, PrincipalNameType.KRB_NT_PRINCIPAL );

        ByteBuffer encoded = ByteBuffer.allocate( principal.computeLength() );

        principal.encode( encoded );

        byte[] expectedResult = new byte[]
            {
                0x30, 0x09,
                ( byte ) 0xA0, 0x03,
                0x02, 0x01, 0x01,
                ( byte ) 0xA1, 0x02,
                0x30, 0x00
        };

        assertEquals( Strings.dumpBytes( expectedResult ), Strings.dumpBytes( encoded.array() ) );
    }
}
