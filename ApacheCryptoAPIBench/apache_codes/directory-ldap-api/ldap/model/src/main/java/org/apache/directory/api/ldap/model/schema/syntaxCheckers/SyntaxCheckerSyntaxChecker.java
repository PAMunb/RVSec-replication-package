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


/**
 * A SyntaxChecker for the SyntaxChecker schema element
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
@SuppressWarnings("serial")
public class SyntaxCheckerSyntaxChecker extends Ia5StringSyntaxChecker
{
    /**
     * Creates a new instance of SyntaxCheckerSyntaxChecker.
     */
    public SyntaxCheckerSyntaxChecker()
    {
        super();
        setOid( SchemaConstants.SYNTAX_CHECKER_SYNTAX );
    }
}
