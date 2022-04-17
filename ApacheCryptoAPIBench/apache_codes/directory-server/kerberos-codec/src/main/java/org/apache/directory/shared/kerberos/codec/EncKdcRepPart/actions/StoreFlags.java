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
package org.apache.directory.shared.kerberos.codec.EncKdcRepPart.actions;


import org.apache.directory.api.asn1.actions.AbstractReadBitString;
import org.apache.directory.shared.kerberos.codec.EncKdcRepPart.EncKdcRepPartContainer;
import org.apache.directory.shared.kerberos.components.EncKdcRepPart;
import org.apache.directory.shared.kerberos.flags.TicketFlags;


/**
 * The action used to store the TicketFlags
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class StoreFlags extends AbstractReadBitString<EncKdcRepPartContainer>
{

    /**
     * Instantiates a new StoreFlagss action.
     */
    public StoreFlags()
    {
        super( "Stores the flags" );
    }


    /**
     * {@inheritDoc}
     */
    @Override
    protected void setBitString( byte[] data, EncKdcRepPartContainer encKdcRepPartContainer )
    {
        EncKdcRepPart encKdcRepPart = encKdcRepPartContainer.getEncKdcRepPart();
        TicketFlags flags = new TicketFlags( data );

        encKdcRepPart.setFlags( flags );

    }
}
