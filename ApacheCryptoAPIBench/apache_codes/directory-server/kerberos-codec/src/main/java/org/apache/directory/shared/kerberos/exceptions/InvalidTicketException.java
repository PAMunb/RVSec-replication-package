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
package org.apache.directory.shared.kerberos.exceptions;


/**
 * A exception used when there was an error while creating a Ticket
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class InvalidTicketException extends KerberosException
{
    static final long serialVersionUID = 1L;


    public InvalidTicketException( ErrorType errorType )
    {
        super( errorType );
    }


    public InvalidTicketException( ErrorType errorType, String explanation )
    {
        super( errorType, explanation );
    }

}
