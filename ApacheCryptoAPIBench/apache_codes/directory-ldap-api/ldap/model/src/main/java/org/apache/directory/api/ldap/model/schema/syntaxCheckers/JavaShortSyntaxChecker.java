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
import org.apache.directory.api.util.Chars;
import org.apache.directory.api.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * A SyntaxChecker which verifies that a value is a valid Java primitive Short or
 * the Short wrapper.  Essentially this constrains the min and max values of
 * the Short.
 *
 * From RFC 4517 :
 *
 * Integer = ( HYPHEN LDIGIT *DIGIT ) | number
 *
 * From RFC 4512 :
 * number  = DIGIT | ( LDIGIT 1*DIGIT )
 * DIGIT   = %x30 | LDIGIT       ; "0"-"9"
 * LDIGIT  = %x31-39             ; "1"-"9"
 * HYPHEN  = %x2D                ; hyphen ("-")
 *
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
@SuppressWarnings("serial")
public class JavaShortSyntaxChecker extends SyntaxChecker
{
    /** A logger for this class */
    private static final Logger LOG = LoggerFactory.getLogger( JavaShortSyntaxChecker.class );


    /**
     * Creates a new instance of JavaShortSyntaxChecker.
     */
    public JavaShortSyntaxChecker()
    {
        super( SchemaConstants.JAVA_SHORT_SYNTAX );
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

        // The first char must be either a '-' or in [0..9].
        // If it's a '0', then there should be any other char after
        int pos = 0;
        char c = strValue.charAt( pos );

        if ( c == '-' )
        {
            pos = 1;
        }
        else if ( !Chars.isDigit( c ) )
        {
            LOG.debug( "Syntax invalid for '{}'", value );
            return false;
        }
        else if ( c == '0' )
        {
            if ( strValue.length() > 1 )
            {
                LOG.debug( "Syntax invalid for '{}'", value );
                return false;
            }
            else
            {
                LOG.debug( "Syntax valid for '{}'", value );
                return true;
            }
        }

        // We must have at least a digit which is not '0'
        if ( !Chars.isDigit( strValue, pos ) )
        {
            LOG.debug( "Syntax invalid for '{}'", value );
            return false;
        }
        else if ( Strings.isCharASCII( strValue, pos, '0' ) )
        {
            LOG.debug( "Syntax invalid for '{}'", value );
            return false;
        }
        else
        {
            pos++;
        }

        while ( Chars.isDigit( strValue, pos ) )
        {
            pos++;
        }

        if ( pos != strValue.length() )
        {
            LOG.debug( "Syntax invalid for '{}'", value );
            return false;
        }

        // Should get a NumberFormatException for Byte values out of range
        try
        {
            Short.valueOf( strValue );
            LOG.debug( "Syntax valid for '{}'", value );
            return true;
        }
        catch ( NumberFormatException e )
        {
            LOG.debug( "Syntax invalid for '{}'", value );
            return false;
        }
    }
}
