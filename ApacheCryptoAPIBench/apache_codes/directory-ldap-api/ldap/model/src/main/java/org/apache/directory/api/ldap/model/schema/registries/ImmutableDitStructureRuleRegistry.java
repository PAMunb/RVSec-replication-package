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
package org.apache.directory.api.ldap.model.schema.registries;


import java.util.Iterator;

import org.apache.directory.api.i18n.I18n;
import org.apache.directory.api.ldap.model.exception.LdapException;
import org.apache.directory.api.ldap.model.exception.LdapUnwillingToPerformException;
import org.apache.directory.api.ldap.model.message.ResultCodeEnum;
import org.apache.directory.api.ldap.model.schema.DitStructureRule;
import org.apache.directory.api.ldap.model.schema.SchemaObjectType;


/**
 * An immutable wrapper of the DitStructureRule registry.
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class ImmutableDitStructureRuleRegistry implements DitStructureRuleRegistry
{
    /** The wrapped DitStructureRule registry */
    DitStructureRuleRegistry immutableDITStructureRuleRegistry;


    /**
     * Creates a new instance of ImmutableDitStructureRuleRegistry.
     *
     * @param ditStructureRuleRegistry The wrapped DitStructureRule registry
     */
    public ImmutableDitStructureRuleRegistry( DitStructureRuleRegistry ditStructureRuleRegistry )
    {
        immutableDITStructureRuleRegistry = ditStructureRuleRegistry;
    }


    /**
     * {@inheritDoc}
     */
    public boolean contains( int ruleId )
    {
        return immutableDITStructureRuleRegistry.contains( ruleId );
    }


    /**
     * {@inheritDoc}
     */
    public Iterator<DitStructureRule> iterator()
    {
        return immutableDITStructureRuleRegistry.iterator();
    }


    /**
     * {@inheritDoc}
     */
    public Iterator<Integer> ruleIdIterator()
    {
        return immutableDITStructureRuleRegistry.ruleIdIterator();
    }


    /**
     * {@inheritDoc}
     */
    public String getSchemaName( int ruleId ) throws LdapException
    {
        return immutableDITStructureRuleRegistry.getSchemaName( ruleId );
    }


    /**
     * {@inheritDoc}
     */
    public void register( DitStructureRule ditStructureRule ) throws LdapException
    {
    }


    /**
     * {@inheritDoc}
     */
    public DitStructureRule lookup( int ruleId ) throws LdapException
    {
        return immutableDITStructureRuleRegistry.lookup( ruleId );
    }


    /**
     * {@inheritDoc}
     */
    public void unregister( int ruleId ) throws LdapException
    {
        throw new LdapUnwillingToPerformException( ResultCodeEnum.NO_SUCH_OPERATION, I18n.err( I18n.ERR_04278 ) );
    }


    /**
     * {@inheritDoc}
     */
    public void unregisterSchemaElements( String schemaName ) throws LdapException
    {
        throw new LdapUnwillingToPerformException( ResultCodeEnum.NO_SUCH_OPERATION, I18n.err( I18n.ERR_04278 ) );
    }


    /**
     * {@inheritDoc}
     */
    public void renameSchema( String originalSchemaName, String newSchemaName ) throws LdapException
    {
        throw new LdapUnwillingToPerformException( ResultCodeEnum.NO_SUCH_OPERATION, I18n.err( I18n.ERR_04278 ) );
    }


    /**
     * {@inheritDoc}
     */
    public ImmutableDitStructureRuleRegistry copy()
    {
        return ( ImmutableDitStructureRuleRegistry ) immutableDITStructureRuleRegistry.copy();
    }


    /**
     * {@inheritDoc}
     */
    public int size()
    {
        return immutableDITStructureRuleRegistry.size();
    }


    /**
     * {@inheritDoc}
     */
    public boolean contains( String oid )
    {
        return immutableDITStructureRuleRegistry.contains( oid );
    }


    /**
     * {@inheritDoc}
     */
    public String getOidByName( String name ) throws LdapException
    {
        return immutableDITStructureRuleRegistry.getOidByName( name );
    }


    /**
     * {@inheritDoc}
     */
    public String getSchemaName( String oid ) throws LdapException
    {
        return immutableDITStructureRuleRegistry.getSchemaName( oid );
    }


    /**
     * {@inheritDoc}
     */
    public SchemaObjectType getType()
    {
        return immutableDITStructureRuleRegistry.getType();
    }


    /**
     * {@inheritDoc}
     */
    public DitStructureRule lookup( String oid ) throws LdapException
    {
        return immutableDITStructureRuleRegistry.lookup( oid );
    }


    /**
     * {@inheritDoc}
     */
    public Iterator<String> oidsIterator()
    {
        return immutableDITStructureRuleRegistry.oidsIterator();
    }


    /**
     * {@inheritDoc}
     */
    public DitStructureRule unregister( String numericOid ) throws LdapException
    {
        throw new LdapUnwillingToPerformException( ResultCodeEnum.NO_SUCH_OPERATION, I18n.err( I18n.ERR_04278 ) );
    }


    /**
     * {@inheritDoc}
     */
    public DitStructureRule get( String oid )
    {
        return immutableDITStructureRuleRegistry.get( oid );
    }


    /**
     * {@inheritDoc}
     */
    public void clear() throws LdapException
    {
        throw new LdapUnwillingToPerformException( ResultCodeEnum.NO_SUCH_OPERATION, I18n.err( I18n.ERR_04278 ) );
    }


    /**
     * {@inheritDoc}
     */
    public DitStructureRule unregister( DitStructureRule schemaObject ) throws LdapException
    {
        throw new LdapUnwillingToPerformException( ResultCodeEnum.NO_SUCH_OPERATION, I18n.err( I18n.ERR_04278 ) );
    }
}
