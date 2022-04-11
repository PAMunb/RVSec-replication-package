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
package org.apache.directory.api.ldap.extras.extended.storedProcedure;


import java.util.ArrayList;
import java.util.List;

import org.apache.directory.api.asn1.ber.tlv.BerValue;
import org.apache.directory.api.asn1.ber.tlv.IntegerDecoder;
import org.apache.directory.api.asn1.ber.tlv.IntegerDecoderException;
import org.apache.directory.api.i18n.I18n;
import org.apache.directory.api.ldap.model.message.AbstractExtendedRequest;
import org.apache.directory.api.util.StringConstants;
import org.apache.directory.api.util.Strings;
import org.apache.directory.api.util.exception.NotImplementedException;


/**
 * An extended operation requesting the server to execute a stored procedure.
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class StoredProcedureRequestImpl extends AbstractExtendedRequest implements StoredProcedureRequest
{
    private String language = "Java";

    private byte[] procedure = StringConstants.EMPTY_BYTES;

    private List<StoredProcedureParameter> parameters = new ArrayList<StoredProcedureParameter>();


    /**
     * Instantiates a new stored procedure request.
     *
     * @param messageId the message id
     */
    public StoredProcedureRequestImpl( int messageId )
    {
        super( messageId );
        this.setRequestName( EXTENSION_OID );
    }


    /**
     * Instantiates a new stored procedure request.
     */
    public StoredProcedureRequestImpl()
    {
        this.setRequestName( EXTENSION_OID );
    }


    /**
     * Instantiates a new stored procedure request.
     *
     * @param messageId the message id
     * @param procedure the procedure
     * @param language the language
     */
    public StoredProcedureRequestImpl( int messageId, String procedure, String language )
    {
        super( messageId );
        this.setRequestName( EXTENSION_OID );
        this.language = language;
        this.procedure = Strings.getBytesUtf8( procedure );
    }


    // -----------------------------------------------------------------------
    // Parameters of the Extended Request Payload
    // -----------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public String getLanguage()
    {
        return language;
    }


    /**
     * {@inheritDoc}
     */
    public void setLanguage( String language )
    {
        this.language = language;
    }


    public byte[] getProcedure()
    {
        if ( procedure == null )
        {
            return null;
        }

        final byte[] copy = new byte[procedure.length];
        System.arraycopy( procedure, 0, copy, 0, procedure.length );
        return copy;
    }


    public void setProcedure( byte[] procedure )
    {
        if ( procedure != null )
        {
            this.procedure = new byte[procedure.length];
            System.arraycopy( procedure, 0, this.procedure, 0, procedure.length );
        }
        else
        {
            this.procedure = null;
        }
    }


    public List<StoredProcedureParameter> getParameters()
    {
        return parameters;
    }


    public void addParameter( StoredProcedureParameter parameter )
    {
        parameters.add( parameter );
    }


    /**
     * {@inheritDoc}
     */
    public void setProcedure( String procedure )
    {
        this.procedure = Strings.getBytesUtf8( procedure );
    }


    /**
     * {@inheritDoc}
     */
    public String getProcedureSpecification()
    {
        return Strings.utf8ToString( procedure );
    }


    /**
     * {@inheritDoc}
     */
    public int size()
    {
        return parameters.size();
    }


    /**
     * {@inheritDoc}
     */
    public Object getParameterType( int index )
    {
        if ( !language.equals( "java" ) )
        {
            return parameters.get( index ).getType();
        }

        return getJavaParameterType( index );
    }


    /**
     * {@inheritDoc}
     */
    public Object getParameterTypeString( int index )
    {
        if ( !language.equals( "java" ) )
        {
            Object obj = parameters.get( index ).getType();
            
            if ( obj instanceof byte[] )
            {
                return Strings.utf8ToString( ( byte[] ) obj );
            }
        }

        return getJavaParameterType( index );
    }


    /**
     * {@inheritDoc}
     */
    public Class<?> getJavaParameterType( int index )
    {
        throw new NotImplementedException( I18n.err( I18n.ERR_04175 ) );
    }


    /**
     * {@inheritDoc}
     */
    public Object getParameterValue( int index )
    {
        if ( !language.equals( "java" ) )
        {
            return parameters.get( index ).getValue();
        }

        return getJavaParameterValue( index );
    }


    /**
     * {@inheritDoc}
     */
    public Object getParameterValueString( int index )
    {
        if ( !language.equals( "java" ) )
        {
            Object obj = parameters.get( index ).getValue();
            
            if ( obj instanceof byte[] )
            {
                String str = Strings.utf8ToString( ( byte[] ) obj );
                String type = ( String ) getParameterTypeString( index );

                if ( type.equals( "int" ) )
                {
                    try
                    {
                        return IntegerDecoder.parse( new BerValue( ( byte[] ) obj ) );
                    }
                    catch ( IntegerDecoderException e )
                    {
                        throw new RuntimeException( "Failed to decode INTEGER: "
                            + Strings.dumpBytes( ( byte[] ) obj ), e );
                    }
                }
                else
                {
                    return str;
                }
            }
        }

        return getJavaParameterValue( index );
    }


    /**
     * {@inheritDoc}
     */
    public Object getJavaParameterValue( int index )
    {
        throw new NotImplementedException( I18n.err( I18n.ERR_04176 ) );
    }


    /**
     * {@inheritDoc}
     */
    public void addParameter( Object type, Object value )
    {
        /**
         *
         * FIXME: Why do we check here whether it's Java or not ?
         * Codec has nothing to do with these details.
         *
         if ( ! this.procedure.getLanguage().equals( "java" ) )
         {
             StoredProcedureParameter parameter = new StoredProcedureParameter();
             parameter.setType( ( byte[] ) type );
             parameter.setValue( ( byte[] ) value );
             this.procedure.addParameter( parameter );
         }
         
         * Replacing this code with the one below without the conditional check.
         
         */

        StoredProcedureParameter parameter = new StoredProcedureParameter();
        parameter.setType( ( byte[] ) type );
        parameter.setValue( ( byte[] ) value );
        parameters.add( parameter );

        // below here try to convert parameters to their appropriate byte[] representations

        /**
         * FIXME: What is this for?
         * 
         * throw new NotImplementedException( "conversion of value to java type not implemented" );
         */
    }


    @Override
    /**
     * {@inheritDoc}
     */
    public StoredProcedureResponse getResultResponse()
    {
        if ( getResponse() == null )
        {
            setResponse( new StoredProcedureResponseImpl( getMessageId() ) );
        }

        return ( StoredProcedureResponse ) getResponse();
    }
}
