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
 * A SyntaxChecker which verifies that a value is an OtherMailbox according to 
 * RFC 4517 :
 * 
 * OtherMailbox = mailbox-type DOLLAR mailbox
 * mailbox-type = PrintableString
 * mailbox      = IA5String
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
@SuppressWarnings("serial")
public class OtherMailboxSyntaxChecker extends SyntaxChecker
{
    /** A logger for this class */
    private static final Logger LOG = LoggerFactory.getLogger( OtherMailboxSyntaxChecker.class );


    /**
     * Creates a new instance of OtherMailboxSyntaxChecker.
     */
    public OtherMailboxSyntaxChecker()
    {
        super( SchemaConstants.OTHER_MAILBOX_SYNTAX );
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
            // No '$' => error
            LOG.debug( "Syntax invalid for '{}'", value );
            return false;
        }

        String mailboxType = strValue.substring( 0, dollar );

        String mailbox = ( ( dollar < strValue.length() - 1 )
            ? strValue.substring( dollar + 1 ) : "" );

        // The mailbox should not contains a '$'
        if ( mailbox.indexOf( '$' ) != -1 )
        {
            LOG.debug( "Syntax invalid for '{}'", value );
            return false;
        }

        // Check that the mailboxType is a PrintableString
        if ( !Strings.isPrintableString( mailboxType ) )
        {
            LOG.debug( "Syntax invalid for '{}'", value );
            return false;
        }

        // Check that the mailbox is an IA5String
        boolean result = ( Strings.isIA5String( mailbox ) );

        if ( result )
        {
            LOG.debug( "Syntax valid for '{}'", value );
        }
        else
        {
            LOG.debug( "Syntax invalid for '{}'", value );
        }

        return result;
    }
}
