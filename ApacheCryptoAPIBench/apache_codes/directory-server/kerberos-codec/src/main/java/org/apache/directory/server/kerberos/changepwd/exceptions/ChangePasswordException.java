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

package org.apache.directory.server.kerberos.changepwd.exceptions;


import org.apache.directory.shared.kerberos.exceptions.KerberosException;


/**
 * The root of the Change Password exception hierarchy.
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class ChangePasswordException extends KerberosException
{
    private static final long serialVersionUID = 4880242751298831543L;


    /**
     * Creates a ChangePasswordException with an {@link ChangePasswdErrorType}.
     *
     * @param errorType The {@link ChangePasswdErrorType} associated with this ChangePasswordException.
     */
    public ChangePasswordException( ChangePasswdErrorType errorType )
    {
        super( errorType.getValue(), errorType.getMessage() );
    }

    
    /**
     * Creates a new instance of ChangePasswordException.
     *
     * @param errorType the error type
     * @param message the message
     */
    public ChangePasswordException( ChangePasswdErrorType errorType, String message )
    {
        super( errorType.getValue(), message );
    }

    
    /**
     * Creates a ChangePasswordException with an {@link ChangePasswdErrorType} and an
     * underlying throwable that caused this fault.
     *
     * @param errorType The {@link ChangePasswdErrorType} associated with this ChangePasswordException.
     * @param cause The underlying failure, if any.
     */
    public ChangePasswordException( ChangePasswdErrorType errorType, Throwable cause )
    {
        super( errorType.getValue(), errorType.getMessage(), cause );
    }


    /**
     * Creates a ChangePasswordException with an {@link ChangePasswdErrorType} and
     * data helping to explain what caused this fault.
     *
     * @param errorType The {@link ChangePasswdErrorType} associated with this ChangePasswordException.
     * @param explanatoryData Data helping to explain this fault, if any.
     */
    public ChangePasswordException( ChangePasswdErrorType errorType, byte[] explanatoryData )
    {
        super( errorType.getValue(), errorType.getMessage(), explanatoryData );
    }


    /**
     * Creates a ChangePasswordException with an {@link ChangePasswdErrorType}, data helping to explain
     * what caused this fault, and an underlying throwable that caused this fault.
     *
     * @param errorType The error type associated with this ChangePasswordException.
     * @param explanatoryData Data helping to explain this fault, if any.
     * @param cause The underlying failure, if any.
     */
    public ChangePasswordException( ChangePasswdErrorType errorType, byte[] explanatoryData, Throwable cause )
    {
        super( errorType.getValue(), errorType.getMessage(), explanatoryData, cause );
    }
}
