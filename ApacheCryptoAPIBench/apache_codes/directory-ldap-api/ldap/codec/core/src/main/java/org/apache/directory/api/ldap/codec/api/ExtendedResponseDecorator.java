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
package org.apache.directory.api.ldap.codec.api;


import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

import org.apache.directory.api.asn1.EncoderException;
import org.apache.directory.api.asn1.ber.tlv.TLV;
import org.apache.directory.api.i18n.I18n;
import org.apache.directory.api.ldap.codec.decorators.LdapResultDecorator;
import org.apache.directory.api.ldap.codec.decorators.ResponseDecorator;
import org.apache.directory.api.ldap.model.message.ExtendedResponse;
import org.apache.directory.api.util.Strings;


/**
 * A decorator for the ExtendedResponse message
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class ExtendedResponseDecorator<R extends ExtendedResponse> extends ResponseDecorator<R>
    implements ExtendedResponse
{
    /** The response name (OID) as a byte[] */
    private byte[] responseNameBytes;

    /** The encoded extendedResponse length */
    private int extendedResponseLength;

    /** The response value */
    protected byte[] responseValue;


    /**
     * Makes a ExtendedResponse encodable.
     *
     * @param decoratedMessage the decorated ExtendedResponse
     */
    public ExtendedResponseDecorator( LdapApiService codec, R decoratedMessage )
    {
        super( codec, decoratedMessage );
    }


    //-------------------------------------------------------------------------
    // The ExtendedResponse methods
    //-------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public String getResponseName()
    {
        return getDecorated().getResponseName();
    }


    /**
     * {@inheritDoc}
     */
    public void setResponseName( String oid )
    {
        getDecorated().setResponseName( oid );
    }


    /**
     * {@inheritDoc}
     */
    public byte[] getResponseValue()
    {
        return responseValue;
    }


    /**
     * {@inheritDoc}
     */
    public void setResponseValue( byte[] responseValue )
    {
        this.responseValue = responseValue;
    }


    //-------------------------------------------------------------------------
    // The Decorator methods
    //-------------------------------------------------------------------------
    /**
     * Compute the ExtendedResponse length
     * 
     * ExtendedResponse :
     * 
     * 0x78 L1
     *  |
     *  +--> LdapResult
     * [+--> 0x8A L2 name
     * [+--> 0x8B L3 response]]
     * 
     * L1 = Length(LdapResult)
     *      [ + Length(0x8A) + Length(L2) + L2
     *       [ + Length(0x8B) + Length(L3) + L3]]
     * 
     * Length(ExtendedResponse) = Length(0x78) + Length(L1) + L1
     * 
     * @return The ExtendedResponse length
     */
    public int computeLength()
    {
        int ldapResultLength = ( ( LdapResultDecorator ) getLdapResult() ).computeLength();

        extendedResponseLength = ldapResultLength;

        String id = getResponseName();

        if ( !Strings.isEmpty( id ) )
        {
            responseNameBytes = Strings.getBytesUtf8( id );
            int idLength = responseNameBytes.length;
            extendedResponseLength += 1 + TLV.getNbBytes( idLength ) + idLength;
        }

        byte[] encodedValue = getResponseValue();

        if ( encodedValue != null )
        {
            extendedResponseLength += 1 + TLV.getNbBytes( encodedValue.length ) + encodedValue.length;
        }

        return 1 + TLV.getNbBytes( extendedResponseLength ) + extendedResponseLength;
    }


    /**
     * Encode the ExtendedResponse message to a PDU. 
     * ExtendedResponse :
     * LdapResult.encode()
     * [0x8A LL response name]
     * [0x8B LL response]
     * 
     * @param buffer The buffer where to put the PDU
     * @return The PDU.
     */
    public ByteBuffer encode( ByteBuffer buffer ) throws EncoderException
    {
        try
        {
            // The ExtendedResponse Tag
            buffer.put( LdapCodecConstants.EXTENDED_RESPONSE_TAG );
            buffer.put( TLV.getBytes( extendedResponseLength ) );

            // The LdapResult
            ( ( LdapResultDecorator ) getLdapResult() ).encode( buffer );

            // The ID, if any
            if ( responseNameBytes != null )
            {
                buffer.put( ( byte ) LdapCodecConstants.EXTENDED_RESPONSE_RESPONSE_NAME_TAG );
                buffer.put( TLV.getBytes( responseNameBytes.length ) );

                if ( responseNameBytes.length != 0 )
                {
                    buffer.put( responseNameBytes );
                }
            }

            // The encodedValue, if any
            byte[] encodedValue = getResponseValue();

            if ( encodedValue != null )
            {
                buffer.put( ( byte ) LdapCodecConstants.EXTENDED_RESPONSE_RESPONSE_TAG );

                buffer.put( TLV.getBytes( encodedValue.length ) );

                if ( encodedValue.length != 0 )
                {
                    buffer.put( encodedValue );
                }
            }
        }
        catch ( BufferOverflowException boe )
        {
            throw new EncoderException( I18n.err( I18n.ERR_04005 ), boe );
        }

        return buffer;
    }
}
