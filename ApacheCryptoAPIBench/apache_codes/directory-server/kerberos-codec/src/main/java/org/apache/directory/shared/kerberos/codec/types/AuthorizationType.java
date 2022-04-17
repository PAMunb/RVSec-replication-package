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
package org.apache.directory.shared.kerberos.codec.types;


/**
 * The Authorization types
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public enum AuthorizationType
{
    /**
     * Constant for the "null" authorization type.
     */
    NULL(0),

    /**
     * Constant for the "if relevant" authorization type.
     * 
     * RFC 4120
     */
    AD_IF_RELEVANT(1),

    /**
     * Constant for the "intended for server" authorization type.
     * 
     * RFC 4120
     */
    AD_INTENDED_FOR_SERVER(2),

    /**
     * Constant for the  "intended for application class" authorization type.
     * 
     * RFC 4120
     */
    AD_INTENDED_FOR_APPLICATION_CLASS(3),

    /**
     * Constant for the "kdc issued" authorization type.
     * 
     * RFC 4120
     */
    AD_KDC_ISSUED(4),

    /**
     * Constant for the "or" authorization type.
     * 
     * RFC 4120
     */
    AD_OR(5),

    /**
     * Constant for the "mandatory ticket extensions" authorization type.
     * 
     * RFC 4120
     */
    AD_MANDATORY_TICKET_EXTENSIONS(6),

    /**
     * Constant for the "in ticket extensions" authorization type.
     * 
     * RFC 4120
     */
    AD_IN_TICKET_EXTENSIONS(7),

    /**
     * Constant for the "mandatory-for-kdc" authorization type.
     * 
     * RFC 4120
     */
    AD_MANDATORY_FOR_KDC(8),

    /**
     * Constant for the "OSF DCE" authorization type.
     * 
     * RFC 1510
     */
    OSF_DCE(64),

    /**
     * Constant for the "sesame" authorization type.
     * 
     * RFC 1510
     */
    SESAME(65),

    /**
     * Constant for the "OSF-DCE pki certid" authorization type.
     * 
     * RFC 1510
     */
    AD_OSF_DCE_PKI_CERTID(66),

    /**
     * Constant for the "sesame" authorization type.
     * 
     * RFC 1510
     */
    AD_WIN2K_PAC(128),

    /**
     * Constant for the "sesame" authorization type.
     * 
     * RFC 1510
     */
    AD_ETYPE_NEGOTIATION(129);

    /**
     * The value/code for the authorization type.
     */
    private final int value;


    /**
     * Private constructor prevents construction outside of this class.
     */
    private AuthorizationType( int value )
    {
        this.value = value;
    }


    /**
     * Returns the authorization type when specified by its ordinal.
     *
     * @param type The numeric value
     * @return The authorization type.
     */
    public static AuthorizationType getTypeByValue( int type )
    {
        switch ( type )
        {
            case 1:
                return AD_IF_RELEVANT;
            case 2:
                return AD_INTENDED_FOR_SERVER;
            case 3:
                return AD_INTENDED_FOR_APPLICATION_CLASS;
            case 4:
                return AD_KDC_ISSUED;
            case 5:
                return AD_OR;
            case 6:
                return AD_MANDATORY_TICKET_EXTENSIONS;
            case 7:
                return AD_IN_TICKET_EXTENSIONS;
            case 8:
                return AD_MANDATORY_FOR_KDC;
            case 64:
                return OSF_DCE;
            case 65:
                return SESAME;
            case 66:
                return AD_OSF_DCE_PKI_CERTID;
            case 128:
                return AD_WIN2K_PAC;
            case 129:
                return AD_ETYPE_NEGOTIATION;
            default:
                return NULL;
        }
    }


    /**
     * Returns the number associated with this authorization type.
     *
     * @return The authorization type ordinal.
     */
    public int getValue()
    {
        return value;
    }


    /**
     * @see Object#toString()
     */
    public String toString()
    {
        switch ( this )
        {
            case AD_IF_RELEVANT:
                return "if relevant" + "(" + value + ")";

            case AD_INTENDED_FOR_SERVER:
                return "intended for server" + "(" + value + ")";

            case AD_INTENDED_FOR_APPLICATION_CLASS:
                return "intended for application class" + "(" + value + ")";

            case AD_KDC_ISSUED:
                return "kdc issued" + "(" + value + ")";

            case AD_OR:
                return "or" + "(" + value + ")";

            case AD_MANDATORY_TICKET_EXTENSIONS:
                return "mandatory ticket extensions" + "(" + value + ")";

            case AD_IN_TICKET_EXTENSIONS:
                return "in ticket extensions" + "(" + value + ")";

            case AD_MANDATORY_FOR_KDC:
                return "mandatory-for-kdc" + "(" + value + ")";

            case OSF_DCE:
                return "OSF DCE" + "(" + value + ")";

            case SESAME:
                return "sesame" + "(" + value + ")";

            case AD_OSF_DCE_PKI_CERTID:
                return "OSF DCE pki certid" + "(" + value + ")";

            case AD_WIN2K_PAC:
                return "win 2000 PAC" + "(" + value + ")";

            case AD_ETYPE_NEGOTIATION:
                return "etype negociation" + "(" + value + ")";

            default:
                return "null" + "(" + value + ")";
        }
    }
}
