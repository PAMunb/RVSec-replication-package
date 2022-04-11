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
package org.apache.directory.shared.kerberos.codec;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.nio.ByteBuffer;

import com.mycila.junit.concurrent.Concurrency;
import com.mycila.junit.concurrent.ConcurrentJunitRunner;

import org.apache.directory.api.asn1.DecoderException;
import org.apache.directory.api.asn1.EncoderException;
import org.apache.directory.api.asn1.ber.Asn1Container;
import org.apache.directory.api.asn1.ber.Asn1Decoder;
import org.apache.directory.shared.kerberos.codec.kdcReq.KdcReqContainer;
import org.apache.directory.shared.kerberos.components.KdcReq;
import org.apache.directory.shared.kerberos.messages.AsReq;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * Test the decoder for a KDC-REQ
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
@RunWith(ConcurrentJunitRunner.class)
@Concurrency()
public class KdcReqDecoderTest
{
    /**
     * Test the decoding of a KDC-REQ message
     */
    @Test
    public void testDecodeFullKdcReq() throws Exception
    {
        Asn1Decoder kerberosDecoder = new Asn1Decoder();

        ByteBuffer stream = ByteBuffer.allocate( 0x18F );

        stream.put( new byte[]
            {
                0x30, ( byte ) 0x82, 0x01, ( byte ) 0x8B,
                ( byte ) 0xA1, 0x03,
                0x02, 0x01, 0x05,
                ( byte ) 0xA2, 0x03,
                0x02, 0x01, 0x0A,
                ( byte ) 0xA3, 0x20,
                0x30, 0x1E,
                0x30, 0x0D,
                ( byte ) 0xA1, 0x03,
                0x02, 0x01, 01,
                ( byte ) 0xA2, 0x06,
                0x04, 0x04, 'a', 'b', 'c', 'd',
                0x30, 0x0D,
                ( byte ) 0xA1, 0x03,
                0x02, 0x01, 01,
                ( byte ) 0xA2, 0x06,
                0x04, 0x04, 'e', 'f', 'g', 'h',
                ( byte ) 0xA4, ( byte ) 0x82, 0x01, 0x5B,
                0x30, ( byte ) 0x82, 0x01, 0x57,
                ( byte ) 0xA0, 0x07,
                0x03, 0x05,
                0x00, 0x01, 0x04, 0x00, 0x32,
                ( byte ) 0xA1, 0x13,
                0x30, 0x11,
                ( byte ) 0xA0, 0x03,
                0x02, 0x01, 0x0A,
                ( byte ) 0xA1, 0x0A,
                0x30, 0x08,
                0x1B, 0x06,
                'c', 'l', 'i', 'e', 'n', 't',
                ( byte ) 0xA2, 0x0D,
                0x1B, 0x0B,
                'E', 'X', 'A', 'M', 'P', 'L', 'E', '.', 'C', 'O', 'M',
                ( byte ) 0xA3, 0x13,
                0x30, 0x11,
                ( byte ) 0xA0, 0x03,
                0x02, 0x01, 0x0A,
                ( byte ) 0xA1, 0x0A,
                0x30, 0x08,
                0x1B, 0x06,
                's', 'e', 'r', 'v', 'e', 'r',
                ( byte ) 0xA4, 0x11,
                0x18, 0x0F,
                '2', '0', '1', '0', '1', '1', '1', '0', '1', '5', '4', '5', '2', '5', 'Z',
                ( byte ) 0xA5, 0x11,
                0x18, 0x0F,
                '2', '0', '1', '0', '1', '1', '1', '0', '1', '5', '4', '5', '2', '5', 'Z',
                ( byte ) 0xA6, 0x11,
                0x18, 0x0F,
                '2', '0', '1', '0', '1', '1', '1', '0', '1', '5', '4', '5', '2', '5', 'Z',
                ( byte ) 0xA7, 0x04,
                0x02, 0x02,
                0x30, 0x39,
                ( byte ) 0xA8, 0x0B,
                0x30, 0x09,
                0x02, 0x01, 0x06,
                0x02, 0x01, 0x11,
                0x02, 0x01, 0x12,
                ( byte ) 0xA9, 0x2E,
                0x30, 0x2C,
                0x30, 0x14,
                ( byte ) 0xA0, 0x03,
                0x02, 0x01, 0x02,
                ( byte ) 0xA1, 0x0D,
                0x04, 0x0B,
                '1', '9', '2', '.', '1', '6', '8', '.', '0', '.', '1',
                0x30, 0x14,
                ( byte ) 0xA0, 0x03,
                0x02, 0x01, 0x02,
                ( byte ) 0xA1, 0x0D,
                0x04, 0x0B,
                '1', '9', '2', '.', '1', '6', '8', '.', '0', '.', '2',
                ( byte ) 0xAA, 0x11,
                0x30, 0x0F,
                ( byte ) 0xA0, 0x03,
                0x02, 0x01, 0x11,
                ( byte ) 0xA2, 0x08,
                0x04, 0x06,
                'a', 'b', 'c', 'd', 'e', 'f',
                ( byte ) 0xAB, ( byte ) 0x81, ( byte ) 0x83,
                0x30, ( byte ) 0x81, ( byte ) 0x80,
                0x61, 0x3E,
                0x30, 0x3C,
                ( byte ) 0xA0, 0x03,
                0x02, 0x01, 0x05,
                ( byte ) 0xA1, 0x0D,
                0x1B, 0x0B,
                'E', 'X', 'A', 'M', 'P', 'L', 'E', '.', 'C', 'O', 'M',
                ( byte ) 0xA2, 0x13,
                0x30, 0x11,
                ( byte ) 0xA0, 0x03,
                0x02, 0x01, 0x01,
                ( byte ) 0xA1, 0x0A,
                0x30, 0x08,
                0x1B, 0x06,
                'c', 'l', 'i', 'e', 'n', 't',
                ( byte ) 0xA3, 0x11,
                0x30, 0x0F,
                ( byte ) 0xA0, 0x03,
                0x02, 0x01, 0x11,
                ( byte ) 0xA2, 0x08,
                0x04, 0x06,
                'a', 'b', 'c', 'd', 'e', 'f',
                0x61, 0x3E,
                0x30, 0x3C,
                ( byte ) 0xA0, 0x03,
                0x02, 0x01, 0x05,
                ( byte ) 0xA1, 0x0D,
                0x1B, 0x0B,
                'E', 'X', 'A', 'M', 'P', 'L', 'E', '.', 'C', 'O', 'M',
                ( byte ) 0xA2, 0x13,
                0x30, 0x11,
                ( byte ) 0xA0, 0x03,
                0x02, 0x01, 0x01,
                ( byte ) 0xA1, 0x0A,
                0x30, 0x08,
                0x1B, 0x06,
                's', 'e', 'r', 'v', 'e', 'r',
                ( byte ) 0xA3, 0x11,
                0x30, 0x0F,
                ( byte ) 0xA0, 0x03,
                0x02, 0x01, 0x11,
                ( byte ) 0xA2, 0x08,
                0x04, 0x06,
                'a', 'b', 'c', 'd', 'e', 'f'
        } );

        stream.flip();

        // Allocate a KdcReq Container
        KdcReqContainer kdcReqContainer = new KdcReqContainer( stream );
        kdcReqContainer.setKdcReq( new AsReq() );

        // Decode the KdcReq PDU
        try
        {
            kerberosDecoder.decode( stream, kdcReqContainer );
        }
        catch ( DecoderException de )
        {
            fail( de.getMessage() );
        }

        KdcReq kdcReq = kdcReqContainer.getKdcReq();

        // Check the encoding
        int length = kdcReq.computeLength();

        // Check the length
        assertEquals( 0x193, length );

        // Check the encoding
        ByteBuffer encodedPdu = ByteBuffer.allocate( length );

        try
        {
            encodedPdu = kdcReq.encode( encodedPdu );

            // Check the length
            assertEquals( 0x193, encodedPdu.limit() );
        }
        catch ( EncoderException ee )
        {
            fail();
        }
    }


    /**
     * Test the decoding of a KDC-REQ with nothing in it
     */
    @Test(expected = DecoderException.class)
    public void testKdcReqEmpty() throws DecoderException
    {
        Asn1Decoder kerberosDecoder = new Asn1Decoder();

        ByteBuffer stream = ByteBuffer.allocate( 0x02 );

        stream.put( new byte[]
            { 0x30, 0x00 } );

        stream.flip();

        // Allocate a KDC-REQ Container
        Asn1Container kdcReqContainer = new KdcReqContainer( stream );

        // Decode the KDC-REQ PDU
        kerberosDecoder.decode( stream, kdcReqContainer );
        fail();
    }


    /**
     * Test the decoding of a KDC-REQ with empty Pvno tag
     */
    @Test(expected = DecoderException.class)
    public void testKdcReqEmptyPvnoTag() throws DecoderException
    {
        Asn1Decoder kerberosDecoder = new Asn1Decoder();

        ByteBuffer stream = ByteBuffer.allocate( 0x04 );

        stream.put( new byte[]
            {
                0x30, 0x02,
                ( byte ) 0xA1, 0x00
        } );

        stream.flip();

        // Allocate a KDC-REQ Container
        Asn1Container kdcReqContainer = new KdcReqContainer( stream );

        // Decode the KDC-REQ PDU
        kerberosDecoder.decode( stream, kdcReqContainer );
        fail();
    }


    /**
     * Test the decoding of a KDC-REQ with empty Pvno value
     */
    @Test(expected = DecoderException.class)
    public void testKdcReqEmptyPvnoValue() throws DecoderException
    {
        Asn1Decoder kerberosDecoder = new Asn1Decoder();

        ByteBuffer stream = ByteBuffer.allocate( 0x06 );

        stream.put( new byte[]
            {
                0x30, 0x04,
                ( byte ) 0xA1, 0x02,
                0x02, 0x00
        } );

        stream.flip();

        // Allocate a KDC-REQ Container
        Asn1Container kdcReqContainer = new KdcReqContainer( stream );

        // Decode the KDC-REQ PDU
        kerberosDecoder.decode( stream, kdcReqContainer );
        fail();
    }
}
