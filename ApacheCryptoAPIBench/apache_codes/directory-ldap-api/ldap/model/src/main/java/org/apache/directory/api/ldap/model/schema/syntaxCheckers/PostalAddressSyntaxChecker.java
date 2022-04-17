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
package org.apache.directory.api.ldap.model.schema.syntaxCheckers;


import org.apache.directory.api.ldap.model.constants.SchemaConstants;
import org.apache.directory.api.ldap.model.schema.SyntaxChecker;
import org.apache.directory.api.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * A SyntaxChecker which verifies that a value is a PostalAddress according to 
 * RFC 4517 :
 * 
 * <postal-address> = <dstring> <dstring-list>
 * <dstring-list> = "$" <dstring> <dstring-list> | e
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
@SuppressWarnings("serial")
public class PostalAddressSyntaxChecker extends SyntaxChecker
{
    /** A logger for this class */
    private static final Logger LOG = LoggerFactory.getLogger( PostalAddressSyntaxChecker.class );


    /**
     * Creates a new instance of PostalAddressSyntaxChecker.
     */
    public PostalAddressSyntaxChecker()
    {
        super( SchemaConstants.POSTAL_ADDRESS_SYNTAX );
    }


    /**
     * {@inheritDoc}
     */
    public boolean isValidSyntax( Object value )
    {
        String strValue = null;

        if ( value == null )
        {
            LOG.debug( "Syntax invalid for 'null'" );
            return false;
        }

        if ( value instanceof String )
        {
            strValue = ( String ) value;
        }
        else if ( value instanceof byte[] )
        {
            strValue = Strings.utf8ToString( ( byte[] ) value );
        }
        else
        {
            strValue = value.toString();
        }

        if ( strValue.length() == 0 )
        {
            LOG.debug( "Syntax invalid for '{}'", value );
            return false;
        }

        // Search for the '$' separator
        int dollar = strValue.indexOf( '$' );

        if ( dollar == -1 )
        {
            // No '$' => only a dstring
            LOG.debug( "Syntax valid for '{}'", value );
            return true;
        }

        int pos = 0;
        do
        {
            // check that the element between each '$' is not empty
            String address = strValue.substring( pos, dollar );

            if ( Strings.isEmpty( address ) )
            {
                LOG.debug( "Syntax invalid for '{}'", value );
                return false;
            }

            pos = dollar + 1;

            if ( pos == strValue.length() )
            {
                // we should not have a '$' at the end
                LOG.debug( "Syntax invalid for '{}'", value );
                return false;
            }

            dollar = strValue.indexOf( '$', pos );
        }
        while ( dollar > -1 );

        return true;
    }
}
