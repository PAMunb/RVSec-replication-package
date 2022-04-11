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
package org.apache.directory.shared.kerberos.codec.principalName.actions;


import org.apache.directory.api.asn1.DecoderException;
import org.apache.directory.api.asn1.ber.grammar.GrammarAction;
import org.apache.directory.api.asn1.ber.tlv.BerValue;
import org.apache.directory.api.asn1.ber.tlv.TLV;
import org.apache.directory.api.util.Strings;
import org.apache.directory.server.i18n.I18n;
import org.apache.directory.shared.kerberos.KerberosUtils;
import org.apache.directory.shared.kerberos.codec.principalName.PrincipalNameContainer;
import org.apache.directory.shared.kerberos.components.PrincipalName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * The action used to store the PrincipalName string
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class StoreNameString extends GrammarAction<PrincipalNameContainer>
{
    /** The logger */
    private static final Logger LOG = LoggerFactory.getLogger( StoreNameString.class );

    /** Speedup for logs */
    private static final boolean IS_DEBUG = LOG.isDebugEnabled();

    /** A flag used to allow UTF-8 chars in the name. THanks Microsoft for, once again, blowing a specification */
    private static boolean ALLOW_UTF8_NAMES = false;

    static 
    {
        String allowUTF8Names = System.getProperty( "sun.security.krb5.msinterop.kstring" );

        if ( "true".equalsIgnoreCase( Strings.trim( allowUTF8Names ) ) )
        {
            ALLOW_UTF8_NAMES = true;
        }
    }

    /**
     * Instantiates a new PrincipalNameInit action.
     */
    public StoreNameString()
    {
        super( "Store the PrincipalName string" );
    }


    /**
     * {@inheritDoc}
     */
    public void action( PrincipalNameContainer principalNameContainer ) throws DecoderException
    {
        TLV tlv = principalNameContainer.getCurrentTLV();

        // The Length should not be null
        if ( tlv.getLength() == 0 )
        {
            LOG.error( I18n.err( I18n.ERR_744_NULL_PDU_LENGTH ) );

            // This will generate a PROTOCOL_ERROR
            throw new DecoderException( I18n.err( I18n.ERR_744_NULL_PDU_LENGTH ) );
        }

        // Get the principalName
        PrincipalName principalName = principalNameContainer.getPrincipalName();

        BerValue value = tlv.getValue();

        // The PrincipalName must be pure ASCII without any control character. We accept UTF-8 if the
        // ALLOW-UTF8-NAMES flag is set, for the sake of being nice to Microsoft.
        if ( ALLOW_UTF8_NAMES || KerberosUtils.isKerberosString( value.getData() ) )
        {
            String nameString = Strings.utf8ToString( value.getData() );

            principalName.addName( nameString );
            principalNameContainer.setGrammarEndAllowed( true );

            if ( IS_DEBUG )
            {
                LOG.debug( "PrincipalName String : {}", nameString );
            }
        }
        else
        {
            String valBytes = Strings.dumpBytes( value.getData() );
            String valStr = Strings.utf8ToString( value.getData() );
            String valAll = valBytes + "/" + valStr;
            LOG.error( I18n.err( I18n.ERR_745_NOT_A_KERBEROS_STRING, valAll ) );

            // This will generate a PROTOCOL_ERROR
            throw new DecoderException( I18n.err( I18n.ERR_745_NOT_A_KERBEROS_STRING, valAll ) );
        }
    }
}
