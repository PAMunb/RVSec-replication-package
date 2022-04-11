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


import org.apache.directory.api.asn1.util.Oid;
import org.apache.directory.api.ldap.model.constants.SchemaConstants;
import org.apache.directory.api.ldap.model.schema.SyntaxChecker;
import org.apache.directory.api.util.Chars;
import org.apache.directory.api.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * A SyntaxChecker which verifies that a value is an oid according to RFC 4512.
 * 
 * From RFC 4512 :
 * 
 * oid = descr | numericoid
 * descr = keystring
 * keystring = leadkeychar *keychar
 * leadkeychar = ALPHA
 * keychar = ALPHA | DIGIT | HYPHEN
 * number  = DIGIT | ( LDIGIT 1*DIGIT )
 * ALPHA   = %x41-5A | %x61-7A              ; "A"-"Z" | "a"-"z"
 * DIGIT   = %x30 | LDIGIT                  ; "0"-"9"
 * LDIGIT  = %x31-39                        ; "1"-"9"
 * HYPHEN  = %x2D                           ; hyphen ("-")
 * numericoid = number 1*( DOT number )
 * DOT     = %x2E                           ; period (".")
 * 
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
@SuppressWarnings("serial")
public class OidSyntaxChecker extends SyntaxChecker
{
    /** A logger for this class */
    private static final Logger LOG = LoggerFactory.getLogger( OidSyntaxChecker.class );


    /**
     * Creates a new instance of OidSyntaxChecker.
     */
    public OidSyntaxChecker()
    {
        super( SchemaConstants.OID_SYNTAX );
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

        // if the first character is a digit it's an attempt at an OID and must be
        // checked to make sure there are no other chars except '.' and digits.
        if ( Chars.isDigit( strValue.charAt( 0 ) ) )
        {
            if ( !Oid.isOid( strValue ) )
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

        // here we just need to make sure that we have the right characters in the 
        // string and that it starts with a letter.
        if ( Chars.isAlphaASCII( strValue, 0 ) )
        {
            for ( int index = 0; index < strValue.length(); index++ )
            {
                char c = strValue.charAt( index );
                
                if ( !Chars.isAlphaDigitMinus( c ) )
                {
                    LOG.debug( "Syntax invalid for '{}'", value );
                    return false;
                }
            }

            LOG.debug( "Syntax valid for '{}'", value );
            return true;
        }
        else
        {
            LOG.debug( "Syntax invalid for '{}'", value );
            return false;
        }
    }
}
