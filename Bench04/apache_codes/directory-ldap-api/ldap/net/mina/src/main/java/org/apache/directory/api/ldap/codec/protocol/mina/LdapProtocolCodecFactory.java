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
package org.apache.directory.api.ldap.codec.protocol.mina;


import org.apache.directory.api.ldap.codec.api.LdapApiService;
import org.apache.directory.api.ldap.codec.api.LdapApiServiceFactory;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;


/**
 * The factory used to create the LDAP encoder and decoder.
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class LdapProtocolCodecFactory implements ProtocolCodecFactory
{
    /** The tag stored into the session if we want to set a max PDU size */
    public static final String MAX_PDU_SIZE = "MAX_PDU_SIZE";

    /** The LdapDecoder key */
    public static final String LDAP_DECODER = "LDAP_DECODER";

    /** The LdapEncoder key */
    public static final String LDAP_ENCODER = "LDAP_ENCODER";

    /** The statefull LDAP decoder */
    private LdapProtocolDecoder ldapDecoder;

    /** The statefull LDAP edcoder */
    private LdapProtocolEncoder ldapEncoder;
    
    
    /**
     * Creates a new instance of LdapProtocolCodecFactory.
     */
    public LdapProtocolCodecFactory() 
    {
        this( LdapApiServiceFactory.getSingleton() );
    }

    
    /**
     * 
     * Creates a new instance of LdapProtocolCodecFactory.
     *
     * @param ldapApiService The associated LdapApiService instance
     */
    public LdapProtocolCodecFactory( LdapApiService ldapApiService ) 
    {
        ldapDecoder = new LdapProtocolDecoder();
        ldapEncoder = new LdapProtocolEncoder( ldapApiService );
    }
    

    /**
     * Get the LDAP decoder.
     *
     * @param session the IO session
     * @return the decoder
     */
    public ProtocolDecoder getDecoder( IoSession session )
    {
        return ldapDecoder;
    }


    /**
     * Get the LDAP encoder.
     *
     * @param session the IO session
     * @return the encoder
     */
    public ProtocolEncoder getEncoder( IoSession session )
    {
        return ldapEncoder;
    }
}
