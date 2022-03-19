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
package org.apache.directory.api.ldap.model.exception;


/**
 * The URI parsing and escape encoding exception.
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class LdapUriException extends LdapException
{
    private static final long serialVersionUID = 1L;


    /**
     * The constructor with a reason string argument.
     * 
     * @param reason the reason
     * @param cause the root cause
     */
    public LdapUriException( String reason, Throwable cause )
    {
        // for backward compatibility of Throwable
        super( reason, cause );
        this.reason = reason;
        this.reasonCode = UNKNOWN;
    }

    /**
     * No specified reason code.
     */
    public static final int UNKNOWN = 0;

    /**
     * The reason code.
     */
    protected int reasonCode;

    /**
     * The reason message.
     */
    protected String reason;


    /**
     * Get the reason code.
     * 
     * @return the reason code
     */
    public int getReasonCode()
    {
        return reasonCode;
    }
}