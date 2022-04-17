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


import java.text.ParseException;

import org.apache.directory.api.ldap.model.constants.SchemaConstants;
import org.apache.directory.api.ldap.model.schema.SyntaxChecker;
import org.apache.directory.api.ldap.model.schema.parsers.ObjectClassDescriptionSchemaParser;
import org.apache.directory.api.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * A SyntaxChecker which verifies that a value follows the
 * object class descripton syntax according to RFC 4512, par 4.2.1:
 * 
 * <pre>
 * ObjectClassDescription = LPAREN WSP
 *     numericoid                 ; object identifier
 *     [ SP "NAME" SP qdescrs ]   ; short names (descriptors)
 *     [ SP "DESC" SP qdstring ]  ; description
 *     [ SP "OBSOLETE" ]          ; not active
 *     [ SP "SUP" SP oids ]       ; superior object classes
 *     [ SP kind ]                ; kind of class
 *     [ SP "MUST" SP oids ]      ; attribute types
 *     [ SP "MAY" SP oids ]       ; attribute types
 *     extensions WSP RPAREN
 *
 * kind = "ABSTRACT" / "STRUCTURAL" / "AUXILIARY"
 * 
 * extensions = *( SP xstring SP qdstrings )
 * xstring = "X" HYPHEN 1*( ALPHA / HYPHEN / USCORE )
 * </pre>
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
@SuppressWarnings("serial")
public class ObjectClassDescriptionSyntaxChecker extends SyntaxChecker
{
    /** A logger for this class */
    private static final Logger LOG = LoggerFactory.getLogger( ObjectClassDescriptionSyntaxChecker.class );

    /** The schema parser used to parse the ObjectClassDescription Syntax */
    private ObjectClassDescriptionSchemaParser schemaParser = new ObjectClassDescriptionSchemaParser();


    /**
     * Creates a new instance of ObjectClassDescriptionSyntaxChecker.
     */
    public ObjectClassDescriptionSyntaxChecker()
    {
        super( SchemaConstants.OBJECT_CLASS_DESCRIPTION_SYNTAX );
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

        try
        {
            schemaParser.parseObjectClassDescription( strValue );
            LOG.debug( "Syntax valid for '{}'", value );
            return true;
        }
        catch ( ParseException pe )
        {
            LOG.debug( "Syntax invalid for '{}'", value );
            return false;
        }
    }
}
