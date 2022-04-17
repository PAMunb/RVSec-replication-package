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
package org.apache.directory.api.ldap.model.filter;


import java.text.ParseException;

import org.apache.directory.api.i18n.I18n;
import org.apache.directory.api.ldap.model.entry.AttributeUtils;
import org.apache.directory.api.ldap.model.entry.Value;
import org.apache.directory.api.ldap.model.exception.LdapException;
import org.apache.directory.api.ldap.model.exception.LdapInvalidAttributeValueException;
import org.apache.directory.api.ldap.model.schema.AttributeType;
import org.apache.directory.api.ldap.model.schema.SchemaManager;
import org.apache.directory.api.util.Chars;
import org.apache.directory.api.util.Hex;
import org.apache.directory.api.util.Position;
import org.apache.directory.api.util.Strings;
import org.apache.directory.api.util.Unicode;


/**
 * This class parse a Ldap filter. The grammar is given in RFC 4515
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public final class FilterParser
{
    private FilterParser()
    {
    }

    
    /**
     * Parses a search filter from it's string representation to an expression node object.
     * 
     * @param filter the search filter in it's string representation
     * @return the expression node object
     */
    public static ExprNode parse( String filter ) throws ParseException
    {
        return parse( null, filter, false );
    }


    /**
     * Parses a search filter from it's string representation to an expression node object.
     * 
     * In <code>relaxed</code> mode the filter may violate RFC 4515, e.g. the underscore in attribute names is allowed.
     * 
     * @param filter the search filter in it's string representation
     * @param relaxed <code>true</code> to parse the filter in relaxed mode
     * @return the expression node object
     */
    public static ExprNode parse( String filter, boolean relaxed ) throws ParseException
    {
        return parse( null, filter, relaxed );
    }

    
    /**
     * Parses a search filter from it's string representation to an expression node object,
     * using the provided SchemaManager 
     * 
     * @param schemaManager The SchemaManager to use
     * @param filter the search filter in it's string representation
     * @return the expression node object
     */
    public static ExprNode parse( SchemaManager schemaManager, String filter ) throws ParseException
    {
        return parse( schemaManager, filter, false );
    }


    /**
     * Parses a search filter from it's string representation to an expression node object,
     * using the provided SchemaManager 
     * 
     * @param schemaManager The SchemaManager to use
     * @param filter the search filter in it's string representation
     * @param relaxed <code>true</code> to parse the filter in relaxed mode
     * @return the expression node object
     */
    public static ExprNode parse( SchemaManager schemaManager, String filter, boolean relaxed ) throws ParseException
    {
        if ( Strings.isEmpty( filter ) )
        {
            throw new ParseException( I18n.err( I18n.ERR_04158 ), 0 );
        }

        /** Convert the filter to an array of bytes, as this is what we expect */
        byte[] filterBytes = Strings.getBytesUtf8( filter );
        
        Position pos = new Position();
        pos.start = 0;
        pos.end = 0;
        pos.length = filterBytes.length;

        try
        {
            return parseFilterInternal( schemaManager, filterBytes, pos, relaxed );
        }
        catch ( LdapException le )
        {
            throw new ParseException( le.getMessage(), pos.start );
        }
    }


    /**
     * Parse an extensible
     *
     * extensible     = ( attr [":dn"] [':' oid] ":=" assertionvalue )
     *                  / ( [":dn"] ':' oid ":=" assertionvalue )
     * matchingrule   = ":" oid
     */
    private static ExprNode parseExtensible( SchemaManager schemaManager, String attribute, byte[] filterBytes,
        Position pos, boolean relaxed ) throws LdapException, ParseException
    {
        ExtensibleNode node = null;

        if ( schemaManager != null )
        {
            AttributeType attributeType = schemaManager.getAttributeType( attribute );

            if ( attributeType != null )
            {
                node = new ExtensibleNode( attributeType );
            }
            else
            {
                return UndefinedNode.UNDEFINED_NODE;
            }
        }
        else
        {
            node = new ExtensibleNode( attribute );
        }

        if ( attribute != null )
        {
            // First check if we have a ":dn"
            if ( Strings.isCharASCII( filterBytes, pos.start, 'd' ) && Strings.isCharASCII( filterBytes, pos.start + 1, 'n' ) )
            {
                // Set the dnAttributes flag and move forward in the string
                node.setDnAttributes( true );
                pos.start += 2;
            }
            else
            {
                // Push back the ':'
                pos.start--;
            }

            // Do we have a MatchingRule ?
            if ( Strings.byteAt( filterBytes, pos.start ) == ':' )
            {
                pos.start++;

                if ( Strings.byteAt( filterBytes, pos.start ) == '=' )
                {
                    pos.start++;

                    // Get the assertionValue
                    node.setValue( parseAssertionValue( schemaManager, filterBytes, pos ) );

                    return node;
                }
                else
                {
                    String matchingRuleId = AttributeUtils.parseAttribute( filterBytes, pos, false, relaxed );

                    node.setMatchingRuleId( matchingRuleId );

                    if ( Strings.isCharASCII( filterBytes, pos.start, ':' ) && Strings.isCharASCII( filterBytes, pos.start + 1, '=' ) )
                    {
                        pos.start += 2;

                        // Get the assertionValue
                        node.setValue( parseAssertionValue( schemaManager, filterBytes, pos ) );

                        return node;
                    }
                    else
                    {
                        throw new ParseException( I18n.err( I18n.ERR_04146 ), pos.start );
                    }
                }
            }
            else
            {
                throw new ParseException( I18n.err( I18n.ERR_04147 ), pos.start );
            }
        }
        else
        {
            // No attribute
            boolean oidRequested = false;

            // First check if we have a ":dn"
            if ( Strings.isCharASCII( filterBytes, pos.start, ':' )
                 && Strings.isCharASCII( filterBytes, pos.start + 1, 'd' )
                 && Strings.isCharASCII( filterBytes, pos.start + 2, 'n' ) )
            {
                // Set the dnAttributes flag and move forward in the string
                node.setDnAttributes( true );
                pos.start += 3;
            }
            else
            {
                oidRequested = true;
            }

            // Do we have a MatchingRule ?
            if ( Strings.byteAt( filterBytes, pos.start ) == ':' )
            {
                pos.start++;

                if ( Strings.byteAt( filterBytes, pos.start ) == '=' )
                {
                    if ( oidRequested )
                    {
                        throw new ParseException( I18n.err( I18n.ERR_04148_MATCHING_RULE_EXPECTED ), pos.start );
                    }

                    pos.start++;

                    // Get the assertionValue
                    node.setValue( parseAssertionValue( schemaManager, null, filterBytes, pos ) );

                    return node;
                }
                else
                {
                    String matchingRuleId = AttributeUtils.parseAttribute( filterBytes, pos, false, relaxed );

                    node.setMatchingRuleId( matchingRuleId );

                    if ( Strings.isCharASCII( filterBytes, pos.start, ':' ) && Strings.isCharASCII( filterBytes, pos.start + 1, '=' ) )
                    {
                        pos.start += 2;

                        // Get the assertionValue
                        node.setValue( parseAssertionValue( schemaManager, null, filterBytes, pos ) );

                        return node;
                    }
                    else
                    {
                        throw new ParseException( I18n.err( I18n.ERR_04146 ), pos.start );
                    }
                }
            }
            else
            {
                throw new ParseException( I18n.err( I18n.ERR_04147 ), pos.start );
            }
        }
    }


    /**
     * An assertion value :
     * assertionvalue = valueencoding
     * valueencoding  = 0*(normal / escaped)
     * normal         = UTF1SUBSET / UTFMB
     * escaped        = '\' HEX HEX
     * HEX            = '0'-'9' / 'A'-'F' / 'a'-'f'
     * UTF1SUBSET     = %x01-27 / %x2B-5B / %x5D-7F (Everything but '\0', '*', '(', ')' and '\')
     * UTFMB          = UTF2 / UTF3 / UTF4
     * UTF0           = %x80-BF
     * UTF2           = %xC2-DF UTF0
     * UTF3           = %xE0 %xA0-BF UTF0 / %xE1-EC UTF0 UTF0 / %xED %x80-9F UTF0 / %xEE-EF UTF0 UTF0
     * UTF4           = %xF0 %x90-BF UTF0 UTF0 / %xF1-F3 UTF0 UTF0 UTF0 / %xF4 %x80-8F UTF0 UTF0
     *
     * With the specific constraints (RFC 4515):
     *    "The <valueencoding> rule ensures that the entire filter string is a"
     *    "valid UTF-8 string and provides that the octets that represent the"
     *    "ASCII characters "*" (ASCII 0x2a), "(" (ASCII 0x28), ")" (ASCII"
     *    "0x29), "\" (ASCII 0x5c), and NUL (ASCII 0x00) are represented as a"
     *    "backslash "\" (ASCII 0x5c) followed by the two hexadecimal digits"
     *    "representing the value of the encoded octet."
     *
     * The incoming String is already transformed from UTF-8 to unicode, so we must assume that the
     * grammar we have to check is the following :
     *
     * assertionvalue = valueencoding
     * valueencoding  = 0*(normal / escaped)
     * normal         = unicodeSubset
     * escaped        = '\' HEX HEX
     * HEX            = '0'-'9' / 'A'-'F' / 'a'-'f'
     * unicodeSubset     = %x01-27 / %x2B-5B / %x5D-FFFF
     * @throws LdapInvalidAttributeValueException 
     */
    private static Value parseAssertionValue( SchemaManager schemaManager, String attribute, byte[] filterBytes,
        Position pos ) throws ParseException, LdapInvalidAttributeValueException
    {
        byte b = Strings.byteAt( filterBytes, pos.start );

        // Create a buffer big enough to contain the value once converted
        byte[] value = new byte[filterBytes.length - pos.start];
        int current = 0;

        do
        {
            if ( Unicode.isUnicodeSubset( b ) )
            {
                value[current++] = b;
                pos.start++;
            }
            else if ( Strings.isCharASCII( filterBytes, pos.start, '\\' ) )
            {
                // Maybe an escaped
                pos.start++;

                // First hex
                if ( Chars.isHex( filterBytes, pos.start ) )
                {
                    pos.start++;
                }
                else
                {
                    throw new ParseException( I18n.err( I18n.ERR_04149 ), pos.start );
                }

                // second hex
                if ( Chars.isHex( filterBytes, pos.start ) )
                {
                    value[current++] = Hex.getHexValue( filterBytes[pos.start - 1], filterBytes[pos.start] );
                    pos.start++;
                }
                else
                {
                    throw new ParseException( I18n.err( I18n.ERR_04149 ), pos.start );
                }
            }
            else
            {
                // not a valid char, so let's get out
                break;
            }

            b = Strings.byteAt( filterBytes, pos.start );
        }
        while ( b != '\0' );

        if ( current != 0 )
        {
            if ( schemaManager != null )
            {
                AttributeType attributeType = schemaManager.getAttributeType( attribute );

                if ( attributeType == null )
                {
                    return new Value( Strings.utf8ToString( value, current ) );
                }

                if ( attributeType.getSyntax().isHumanReadable() )
                {
                    return new Value( attributeType, Strings.utf8ToString( value, current ) );
                }
                else
                {
                    byte[] bytes = new byte[value.length];
                    System.arraycopy( value, 0, bytes, 0, current );
                    
                    return new Value( attributeType, Strings.utf8ToString( bytes ) );
                }
            }
            else
            {
                return new Value( Strings.utf8ToString( value, current ) );
            }
        }
        else
        {
            if ( schemaManager != null )
            {
                AttributeType attributeType = schemaManager.getAttributeType( attribute );

                if ( attributeType.getEquality().getSyntax().isHumanReadable() )
                {
                    return new Value( attributeType, ( String ) null );
                }
                else
                {
                    return new Value( attributeType, ( byte[] ) null );
                }
            }
            else
            {
                return new Value( ( byte[] ) null );
            }
        }
    }


    /**
     * An assertion value :
     * assertionvalue = valueencoding
     * valueencoding  = 0*(normal / escaped)
     * normal         = UTF1SUBSET / UTFMB
     * escaped        = '\' HEX HEX
     * HEX            = '0'-'9' / 'A'-'F' / 'a'-'f'
     * UTF1SUBSET     = %x01-27 / %x2B-5B / %x5D-7F (Everything but '\0', '*', '(', ')' and '\')
     * UTFMB          = UTF2 / UTF3 / UTF4
     * UTF0           = %x80-BF
     * UTF2           = %xC2-DF UTF0
     * UTF3           = %xE0 %xA0-BF UTF0 / %xE1-EC UTF0 UTF0 / %xED %x80-9F UTF0 / %xEE-EF UTF0 UTF0
     * UTF4           = %xF0 %x90-BF UTF0 UTF0 / %xF1-F3 UTF0 UTF0 UTF0 / %xF4 %x80-8F UTF0 UTF0
     *
     * With the specific constraints (RFC 4515):
     *    "The <valueencoding> rule ensures that the entire filter string is a"
     *    "valid UTF-8 string and provides that the octets that represent the"
     *    "ASCII characters "*" (ASCII 0x2a), "(" (ASCII 0x28), ")" (ASCII"
     *    "0x29), "\" (ASCII 0x5c), and NUL (ASCII 0x00) are represented as a"
     *    "backslash "\" (ASCII 0x5c) followed by the two hexadecimal digits"
     *    "representing the value of the encoded octet."
     *
     * The incoming String is already transformed from UTF-8 to unicode, so we must assume that the
     * grammar we have to check is the following :
     *
     * assertionvalue = valueencoding
     * valueencoding  = 0*(normal / escaped)
     * normal         = unicodeSubset
     * escaped        = '\' HEX HEX
     * HEX            = '0'-'9' / 'A'-'F' / 'a'-'f'
     * unicodeSubset     = %x01-27 / %x2B-5B / %x5D-FFFF
     */
    private static Value parseAssertionValue( SchemaManager schemaManager, byte[] filterBytes, Position pos )
        throws ParseException
    {
        byte b = Strings.byteAt( filterBytes, pos.start );

        // Create a buffer big enough to contain the value once converted
        byte[] value = new byte[filterBytes.length - pos.start];
        int current = 0;

        do
        {
            if ( Unicode.isUnicodeSubset( b ) )
            {
                value[current++] = b;
                pos.start++;
            }
            else if ( Strings.isCharASCII( filterBytes, pos.start, '\\' ) )
            {
                // Maybe an escaped
                pos.start++;

                // First hex
                if ( Chars.isHex( filterBytes, pos.start ) )
                {
                    pos.start++;
                }
                else
                {
                    throw new ParseException( I18n.err( I18n.ERR_04149 ), pos.start );
                }

                // second hex
                if ( Chars.isHex( filterBytes, pos.start ) )
                {
                    value[current++] = Hex.getHexValue( filterBytes[pos.start - 1], filterBytes[pos.start] );
                    pos.start++;
                }
                else
                {
                    throw new ParseException( I18n.err( I18n.ERR_04149 ), pos.start );
                }
            }
            else
            {
                // not a valid char, so let's get out
                break;
            }

            b = Strings.byteAt( filterBytes, pos.start );
        }
        while ( b != '\0' );

        if ( current != 0 )
        {
            byte[] result = new byte[current];
            System.arraycopy( value, 0, result, 0, current );

            return new Value( result );
        }
        else
        {
            return new Value( ( byte[] ) null );
        }
    }


    /**
     * Parse a substring
     */
    private static ExprNode parseSubstring( SchemaManager schemaManager, String attribute, Value initial,
        byte[] filterBytes, Position pos ) throws ParseException, LdapException
    {
        if ( Strings.isCharASCII( filterBytes, pos.start, '*' ) )
        {
            // We have found a '*' : this is a substring
            SubstringNode node = null;

            if ( schemaManager != null )
            {
                AttributeType attributeType = schemaManager.lookupAttributeTypeRegistry( attribute );

                if ( attributeType != null )
                {
                    node = new SubstringNode( schemaManager.lookupAttributeTypeRegistry( attribute ) );
                }
                else
                {
                    return null;
                }
            }
            else
            {
                node = new SubstringNode( attribute );
            }

            if ( ( initial != null ) && !initial.isNull() )
            {
                // We have a substring starting with a value : val*...
                // Set the initial value. It must be a String
                String initialStr = initial.getValue();
                node.setInitial( initialStr );
            }

            pos.start++;

            if ( Strings.isCharASCII( filterBytes, pos.start, ')' ) )
            {
                // No any or final, we are done
                return node;
            }

            //
            while ( true )
            {
                Value assertionValue = parseAssertionValue( schemaManager, attribute, filterBytes, pos );

                // Is there anything else but a ')' after the value ?
                if ( Strings.isCharASCII( filterBytes, pos.start, ')' ) )
                {
                    // Nope : as we have had [initial] '*' (any '*' ) *,
                    // this is the final
                    if ( !assertionValue.isNull() )
                    {
                        String finalStr = assertionValue.getValue();
                        node.setFinal( finalStr );
                    }

                    return node;
                }
                else if ( Strings.isCharASCII( filterBytes, pos.start, '*' ) )
                {
                    // We have a '*' : it's an any
                    // If the value is empty, that means we have more than
                    // one consecutive '*' : do nothing in this case.
                    if ( !assertionValue.isNull() )
                    {
                        String anyStr = assertionValue.getValue();
                        node.addAny( anyStr );
                    }

                    pos.start++;
                }
                else
                {
                    // This is an error
                    throw new ParseException( I18n.err( I18n.ERR_04150 ), pos.start );
                }
            }
        }
        else
        {
            // This is an error
            throw new ParseException( I18n.err( I18n.ERR_04150 ), pos.start );
        }
    }


    /**
     * Here is the grammar to parse :
     *
     * simple    ::= '=' assertionValue
     * present   ::= '=' '*'
     * substring ::= '=' [initial] any [final]
     * initial   ::= assertionValue
     * any       ::= '*' ( assertionValue '*')*
     *
     * As we can see, there is an ambiguity in the grammar : attr=* can be
     * seen as a present or as a substring. As stated in the RFC :
     *
     * "Note that although both the <substring> and <present> productions in"
     * "the grammar above can produce the "attr=*" construct, this construct"
     * "is used only to denote a presence filter." (RFC 4515, 3)
     *
     * We have also to consider the difference between a substring and the
     * equality node : this last node does not contain a '*'
     *
     * @param attributeType
     * @param filter
     * @param pos
     * @return
     */
    private static ExprNode parsePresenceEqOrSubstring( SchemaManager schemaManager, String attribute, byte[] filterBytes,
        Position pos ) throws ParseException, LdapException
    {
        if ( Strings.isCharASCII( filterBytes, pos.start, '*' ) )
        {
            // To be a present node, the next char should be a ')'
            pos.start++;

            if ( Strings.isCharASCII( filterBytes, pos.start, ')' ) )
            {
                // This is a present node
                if ( schemaManager != null )
                {
                    AttributeType attributeType = schemaManager.getAttributeType( attribute );

                    if ( attributeType != null )
                    {
                        return new PresenceNode( attributeType );
                    }
                    else
                    {
                        return null;
                    }
                }
                else
                {
                    return new PresenceNode( attribute );
                }
            }
            else
            {
                // Definitively a substring with no initial or an error
                // Push back the '*' on the string
                pos.start--;
                return parseSubstring( schemaManager, attribute, null, filterBytes, pos );
            }
        }
        else if ( Strings.isCharASCII( filterBytes, pos.start, ')' ) )
        {
            // An empty equality Node
            if ( schemaManager != null )
            {
                AttributeType attributeType = schemaManager.getAttributeType( attribute );

                if ( attributeType != null )
                {
                    return new EqualityNode( attributeType, new Value( ( byte[] ) null ) );
                }

                else
                {
                    return null;
                }
            }
            else
            {
                return new EqualityNode( attribute, ( byte[] ) null );
            }
        }
        else
        {
            // A substring or an equality node
            Value value = parseAssertionValue( schemaManager, attribute, filterBytes, pos );

            // Is there anything else but a ')' after the value ?
            if ( Strings.isCharASCII( filterBytes, pos.start, ')' ) )
            {
                // This is an equality node
                if ( schemaManager != null )
                {
                    AttributeType attributeType = schemaManager.getAttributeType( attribute );

                    if ( attributeType != null )
                    {
                        return new EqualityNode( attributeType, value );
                    }
                    else
                    {
                        return null;
                    }
                }
                else
                {
                    return new EqualityNode( attribute, value.getValue() );
                }
            }

            return parseSubstring( schemaManager, attribute, value, filterBytes, pos );
        }
    }


    /**
     * Parse the following grammar :
     * item           = simple / present / substring / extensible
     * simple         = attr filtertype assertionvalue
     * filtertype     = '=' / '~=' / '>=' / '<='
     * present        = attr '=' '*'
     * substring      = attr '=' [initial] any [final]
     * extensible     = ( attr [":dn"] [':' oid] ":=" assertionvalue )
     *                  / ( [":dn"] ':' oid ":=" assertionvalue )
     * matchingrule   = ":" oid
     *
     * An item starts with an attribute or a colon.
     */
    @SuppressWarnings(
        { "rawtypes", "unchecked" })
    private static ExprNode parseItem( SchemaManager schemaManager, byte[] filterBytes, Position pos, byte b,
        boolean relaxed ) throws ParseException, LdapException
    {
        String attribute = null;

        if ( b == '\0' )
        {
            throw new ParseException( I18n.err( I18n.ERR_04151 ), pos.start );
        }

        if ( b == ':' )
        {
            // If we have a colon, then the item is an extensible one
            return parseExtensible( schemaManager, null, filterBytes, pos, relaxed );
        }
        else
        {
            // We must have an attribute
            attribute = AttributeUtils.parseAttribute( filterBytes, pos, true, relaxed );

            // Now, we may have a present, substring, simple or an extensible
            b = Strings.byteAt( filterBytes, pos.start );

            switch ( b )
            {
                case '=':
                    // It can be a presence, an equal or a substring
                    pos.start++;
                    return parsePresenceEqOrSubstring( schemaManager, attribute, filterBytes, pos );

                case '~':
                    // Approximate node
                    pos.start++;

                    // Check that we have a '='
                    if ( !Strings.isCharASCII( filterBytes, pos.start, '=' ) )
                    {
                        throw new ParseException( I18n.err( I18n.ERR_04152 ), pos.start );
                    }

                    pos.start++;

                    // Parse the value and create the node
                    if ( schemaManager == null )
                    {
                        return new ApproximateNode( attribute, parseAssertionValue( schemaManager, attribute, filterBytes,
                            pos ).getBytes() );
                    }
                    else
                    {
                        AttributeType attributeType = schemaManager.getAttributeType( attribute );

                        if ( attributeType != null )
                        {
                            return new ApproximateNode( attributeType, parseAssertionValue( schemaManager, attribute,
                                filterBytes, pos ) );
                        }
                        else
                        {
                            return UndefinedNode.UNDEFINED_NODE;
                        }
                    }

                case '>':
                    // Greater or equal node
                    pos.start++;

                    // Check that we have a '='
                    if ( !Strings.isCharASCII( filterBytes, pos.start, '=' ) )
                    {
                        throw new ParseException( I18n.err( I18n.ERR_04152 ), pos.start );
                    }

                    pos.start++;

                    // Parse the value and create the node
                    if ( schemaManager == null )
                    {
                        return new GreaterEqNode( attribute,
                            parseAssertionValue( schemaManager, attribute, filterBytes, pos ).getBytes() );
                    }
                    else
                    {
                        AttributeType attributeType = schemaManager.getAttributeType( attribute );

                        if ( attributeType != null )
                        {
                            return new GreaterEqNode( attributeType, parseAssertionValue( schemaManager, attribute,
                                filterBytes, pos ) );
                        }
                        else
                        {
                            return UndefinedNode.UNDEFINED_NODE;
                        }
                    }

                case '<':
                    // Less or equal node
                    pos.start++;

                    // Check that we have a '='
                    if ( !Strings.isCharASCII( filterBytes, pos.start, '=' ) )
                    {
                        throw new ParseException( I18n.err( I18n.ERR_04152 ), pos.start );
                    }

                    pos.start++;

                    // Parse the value and create the node
                    if ( schemaManager == null )
                    {
                        return new LessEqNode( attribute, 
                            parseAssertionValue( schemaManager, attribute, filterBytes, pos ).getBytes() );
                    }
                    else
                    {
                        AttributeType attributeType = schemaManager.getAttributeType( attribute );

                        if ( attributeType != null )
                        {
                            return new LessEqNode( attributeType, parseAssertionValue( schemaManager, attribute,
                                filterBytes, pos ) );
                        }
                        else
                        {
                            return UndefinedNode.UNDEFINED_NODE;
                        }
                    }

                case ':':
                    // An extensible node
                    pos.start++;
                    return parseExtensible( schemaManager, attribute, filterBytes, pos, relaxed );

                default:
                    // This is an error
                    throw new ParseException( I18n.err( I18n.ERR_04153 ), pos.start );
            }
        }
    }


    /**
     * Parse AND, OR and NOT nodes :
     *
     * and            = '&' filterlist
     * or             = '|' filterlist
     * not            = '!' filter
     * filterlist     = 1*filter
     *
     * @return
     */
    private static ExprNode parseBranchNode( SchemaManager schemaManager, ExprNode node, byte[] filterBytes, Position pos,
        boolean relaxed ) throws ParseException, LdapException
    {
        BranchNode branchNode = ( BranchNode ) node;
        int nbChildren = 0;

        // We must have at least one filter
        ExprNode child = parseFilterInternal( schemaManager, filterBytes, pos, relaxed );

        if ( child != UndefinedNode.UNDEFINED_NODE )
        {
            // Add the child to the node children
            branchNode.addNode( child );

            if ( branchNode instanceof NotNode )
            {
                return node;
            }

            nbChildren++;
        }
        else if ( node instanceof AndNode )
        {
            return UndefinedNode.UNDEFINED_NODE;
        }

        // Now, iterate recusively though all the remaining filters, if any
        while ( ( child = parseFilterInternal( schemaManager, filterBytes, pos, relaxed ) ) != UndefinedNode.UNDEFINED_NODE )
        {
            // Add the child to the node children if not null
            if ( child != null )
            {
                branchNode.addNode( child );
                nbChildren++;
            }
            else if ( node instanceof AndNode )
            {
                return UndefinedNode.UNDEFINED_NODE;
            }
        }

        if ( nbChildren > 0 )
        {
            return node;
        }
        else
        {
            return UndefinedNode.UNDEFINED_NODE;
        }
    }


    /**
     * filtercomp     = and / or / not / item
     * and            = '&' filterlist
     * or             = '|' filterlist
     * not            = '!' filter
     * item           = simple / present / substring / extensible
     * simple         = attr filtertype assertionvalue
     * present        = attr EQUALS ASTERISK
     * substring      = attr EQUALS [initial] any [final]
     * extensible     = ( attr [dnattrs]
     *                    [matchingrule] COLON EQUALS assertionvalue )
     *                    / ( [dnattrs]
     *                         matchingrule COLON EQUALS assertionvalue )
     */
    private static ExprNode parseFilterComp( SchemaManager schemaManager, byte[] filterBytes, Position pos,
        boolean relaxed ) throws ParseException, LdapException
    {
        ExprNode node = null;

        if ( pos.start == pos.length )
        {
            throw new ParseException( I18n.err( I18n.ERR_04154 ), pos.start );
        }

        byte b = Strings.byteAt( filterBytes, pos.start );

        switch ( b )
        {
            case '&':
                // This is a AND node
                pos.start++;
                node = new AndNode();
                node = parseBranchNode( schemaManager, node, filterBytes, pos, relaxed );
                break;

            case '|':
                // This is an OR node
                pos.start++;
                node = new OrNode();
                node = parseBranchNode( schemaManager, node, filterBytes, pos, relaxed );
                break;

            case '!':
                // This is a NOT node
                pos.start++;
                node = new NotNode();
                node = parseBranchNode( schemaManager, node, filterBytes, pos, relaxed );
                break;

            default:
                // This is an item
                node = parseItem( schemaManager, filterBytes, pos, b, relaxed );
                break;

        }

        return node;
    }


    /**
     * Parse the grammar rule :
     * filter ::= '(' filterComp ')'
     */
    private static ExprNode parseFilterInternal( SchemaManager schemaManager, byte[] filterBytes, Position pos,
        boolean relaxed ) throws ParseException, LdapException
    {
        // Check for the left '('
        if ( !Strings.isCharASCII( filterBytes, pos.start, '(' ) )
        {
            // No more node, get out
            if ( ( pos.start == 0 ) && ( pos.length != 0 ) )
            {
                throw new ParseException( I18n.err( I18n.ERR_04155 ), 0 );
            }
            else
            {
                return UndefinedNode.UNDEFINED_NODE;
            }
        }

        pos.start++;

        // parse the filter component
        ExprNode node = parseFilterComp( schemaManager, filterBytes, pos, relaxed );

        if ( node == UndefinedNode.UNDEFINED_NODE )
        {
            return UndefinedNode.UNDEFINED_NODE;
        }

        // Check that we have a right ')'
        if ( !Strings.isCharASCII( filterBytes, pos.start, ')' ) )
        {
            throw new ParseException( I18n.err( I18n.ERR_04157 ), pos.start );
        }

        pos.start++;

        return node;
    }
}
