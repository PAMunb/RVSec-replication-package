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
package org.apache.directory.shared.kerberos.codec.actions;


import org.apache.directory.api.asn1.DecoderException;
import org.apache.directory.api.asn1.ber.Asn1Container;
import org.apache.directory.api.asn1.ber.Asn1Decoder;
import org.apache.directory.api.asn1.ber.grammar.GrammarAction;
import org.apache.directory.api.asn1.ber.tlv.TLV;
import org.apache.directory.api.i18n.I18n;
import org.apache.directory.shared.kerberos.codec.hostAddresses.HostAddressesContainer;
import org.apache.directory.shared.kerberos.components.HostAddresses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * The abstract action used to read the HostAddresses
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public abstract class AbstractReadHostAddresses<E extends Asn1Container> extends GrammarAction<E>
{
    /** The logger */
    private static final Logger LOG = LoggerFactory.getLogger( AbstractReadHostAddresses.class );

    /** Speedup for logs */
    private static final boolean IS_DEBUG = LOG.isDebugEnabled();


    /**
     * Instantiates a new AbstractReadHostAddresses action.
     */
    public AbstractReadHostAddresses( String name )
    {
        super( name );
    }


    /**
     * set HostAddresses on the ASN.1 object present in the container
     *
     * @param hostAddresses the host addresses
     * @param container the container holding the ASN.1 object
     */
    protected abstract void setHostAddresses( HostAddresses hostAddresses, E container );


    /**
     * {@inheritDoc}
     */
    public final void action( E container ) throws DecoderException
    {
        TLV tlv = container.getCurrentTLV();

        // The Length should not be null
        if ( tlv.getLength() == 0 )
        {
            LOG.error( I18n.err( I18n.ERR_04066 ) );

            // This will generate a PROTOCOL_ERROR
            throw new DecoderException( I18n.err( I18n.ERR_04067 ) );
        }

        // Now, let's decode the HostAddresses
        Asn1Decoder hostAddressesDecoder = new Asn1Decoder();

        HostAddressesContainer hostAddressesContainer = new HostAddressesContainer();

        // Passes the Stream to the decoder
        hostAddressesContainer.setStream( container.getStream() );

        // Decode the HostAddresses PDU
        try
        {
            hostAddressesDecoder.decode( container.getStream(), hostAddressesContainer );
        }
        catch ( DecoderException de )
        {
            throw de;
        }

        // Store the HostAddresses in the container
        HostAddresses hostAddresses = hostAddressesContainer.getHostAddresses();
        setHostAddresses( hostAddresses, container );

        // Update the expected length for the current TLV
        tlv.setExpectedLength( tlv.getExpectedLength() - tlv.getLength() );

        // Update the parent
        container.updateParent();

        if ( IS_DEBUG )
        {
            LOG.debug( "HostAddresses : {}", hostAddresses );
        }
    }
}
