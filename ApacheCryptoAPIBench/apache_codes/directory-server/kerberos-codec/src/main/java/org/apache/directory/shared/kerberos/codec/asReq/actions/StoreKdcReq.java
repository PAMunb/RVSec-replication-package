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
package org.apache.directory.shared.kerberos.codec.asReq.actions;


import org.apache.directory.api.asn1.DecoderException;
import org.apache.directory.api.asn1.ber.Asn1Decoder;
import org.apache.directory.api.asn1.ber.grammar.GrammarAction;
import org.apache.directory.api.asn1.ber.tlv.TLV;
import org.apache.directory.api.i18n.I18n;
import org.apache.directory.shared.kerberos.KerberosMessageType;
import org.apache.directory.shared.kerberos.codec.asReq.AsReqContainer;
import org.apache.directory.shared.kerberos.codec.kdcReq.KdcReqContainer;
import org.apache.directory.shared.kerberos.messages.AsReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * The action used to add a KDC-REQ object
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class StoreKdcReq extends GrammarAction<AsReqContainer>
{
    /** The logger */
    private static final Logger LOG = LoggerFactory.getLogger( StoreKdcReq.class );

    /** Speedup for logs */
    private static final boolean IS_DEBUG = LOG.isDebugEnabled();


    /**
     * Instantiates a new KDC-REQ action.
     */
    public StoreKdcReq()
    {
        super( "Add an KDC-REQ instance" );
    }


    /**
     * {@inheritDoc}
     */
    public void action( AsReqContainer asReqContainer ) throws DecoderException
    {
        TLV tlv = asReqContainer.getCurrentTLV();

        // The Length should not be null
        if ( tlv.getLength() == 0 )
        {
            LOG.error( I18n.err( I18n.ERR_04066 ) );

            // This will generate a PROTOCOL_ERROR
            throw new DecoderException( I18n.err( I18n.ERR_04067 ) );
        }

        // Now, let's decode the KDC-REQ
        Asn1Decoder kdcReqDecoder = new Asn1Decoder();

        KdcReqContainer kdcReqContainer = new KdcReqContainer( asReqContainer.getStream() );

        // Store the created AS-REQ object into the KDC-REQ container
        AsReq asReq = new AsReq();
        kdcReqContainer.setKdcReq( asReq );

        // Decode the KDC_REQ PDU
        try
        {
            kdcReqDecoder.decode( asReqContainer.getStream(), kdcReqContainer );
        }
        catch ( DecoderException de )
        {
            throw de;
        }

        // Update the expected length for the current TLV
        tlv.setExpectedLength( tlv.getExpectedLength() - tlv.getLength() );

        // Update the parent
        asReqContainer.updateParent();

        if ( asReq.getMessageType() != KerberosMessageType.AS_REQ )
        {
            throw new DecoderException( "Bad message type" );
        }

        asReqContainer.setAsReq( asReq );

        if ( IS_DEBUG )
        {
            LOG.debug( "AS-REQ : {}", asReq );
        }

        asReqContainer.setGrammarEndAllowed( true );
    }
}
