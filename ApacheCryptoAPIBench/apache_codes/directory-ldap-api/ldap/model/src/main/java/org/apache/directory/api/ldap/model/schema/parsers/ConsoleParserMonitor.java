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
package org.apache.directory.api.ldap.model.schema.parsers;


/**
 * A console reporting monitor.  Add system property 'maven.eve.schema.parser.trace'
 * to get this monitor to trace parser production execution.
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class ConsoleParserMonitor implements ParserMonitor
{
    public static final String TRACE_KEY = "maven.eve.schema.parser.trace";


    public void matchedProduction( String prod )
    {
        if ( System.getProperties().containsKey( TRACE_KEY ) )
        {
            System.out.println( prod );
        }
    }


    public void startedParse( String s )
    {
        if ( System.getProperties().containsKey( TRACE_KEY ) )
        {
            System.out.println( s );
        }
    }


    public void finishedParse( String s )
    {
        if ( System.getProperties().containsKey( TRACE_KEY ) )
        {
            System.out.println( s );
        }
    }
}
