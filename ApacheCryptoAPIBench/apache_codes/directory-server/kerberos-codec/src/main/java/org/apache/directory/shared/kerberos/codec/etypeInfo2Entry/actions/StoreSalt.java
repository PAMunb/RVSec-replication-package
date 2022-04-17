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
package org.apache.directory.shared.kerberos.codec.etypeInfo2Entry.actions;


import org.apache.directory.api.asn1.DecoderException;
import org.apache.directory.api.asn1.ber.grammar.GrammarAction;
import org.apache.directory.api.asn1.ber.tlv.BerValue;
import org.apache.directory.api.asn1.ber.tlv.TLV;
import org.apache.directory.api.util.Strings;
import org.apache.directory.shared.kerberos.codec.etypeInfo2Entry.ETypeInfo2EntryContainer;
import org.apache.directory.shared.kerberos.components.ETypeInfo2Entry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * The action used to store the ETYPE-INFO2-ENTRY cipher
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class StoreSalt extends GrammarAction<ETypeInfo2EntryContainer>
{
    /** The logger */
    private static final Logger LOG = LoggerFactory.getLogger( StoreSalt.class );

    /** Speedup for logs */
    private static final boolean IS_DEBUG = LOG.isDebugEnabled();


    /**
     * Instantiates a new StoreSalt action.
     */
    public StoreSalt()
    {
        super( "ETYPE-INFO2-ENTRY salt" );
    }


    /**
     * {@inheritDoc}
     */
    public void action( ETypeInfo2EntryContainer eTypeInfo2EntryContainer ) throws DecoderException
    {
        TLV tlv = eTypeInfo2EntryContainer.getCurrentTLV();
        ETypeInfo2Entry etypeInfo2Entry = eTypeInfo2EntryContainer.getETypeInfo2Entry();

        // The Length may be null
        if ( tlv.getLength() != 0 )
        {
            BerValue value = tlv.getValue();

            // The encrypted data may be null
            if ( value.getData() != null )
            {
                String salt = Strings.utf8ToString( value.getData() );
                etypeInfo2Entry.setSalt( salt );
            }
        }

        if ( IS_DEBUG )
        {
            LOG.debug( "salt : {}", etypeInfo2Entry.getSalt() );
        }

        // We can end here
        eTypeInfo2EntryContainer.setGrammarEndAllowed( true );
    }
}
