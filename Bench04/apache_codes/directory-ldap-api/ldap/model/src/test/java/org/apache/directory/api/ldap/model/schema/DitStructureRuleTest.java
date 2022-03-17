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
package org.apache.directory.api.ldap.model.schema;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.mycila.junit.concurrent.Concurrency;
import com.mycila.junit.concurrent.ConcurrentJunitRunner;


/**
 * Unit tests class DitStructureRule.
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
@RunWith(ConcurrentJunitRunner.class)
@Concurrency()
public class DitStructureRuleTest
{
    private DitStructureRule ditStructureRule;


    /**
     * Initialize attribute type instances
     */
    @Before
    public void initDitStructureRules() throws Exception
    {
        ditStructureRule = new DitStructureRule( 1234 );
        ditStructureRule.setNames( "name1", "name2" );
        ditStructureRule.setDescription( "description" );
        ditStructureRule.setObsolete( false );
        ditStructureRule.setForm( "form1" );
        ditStructureRule.setSuperRules( Arrays.asList( 111, 222, 333 ) );
    }


    @Test
    public void testToString() throws Exception
    {
        String string = ditStructureRule.toString();

        assertNotNull( string );
        assertTrue( string.startsWith( "ditstructurerule (" ) );
        assertTrue( string.contains( " NAME " ) );
        assertTrue( string.contains( "\n\tDESC " ) );
        assertTrue( string.contains( "\n\tFORM " ) );
        assertTrue( string.contains( "\n\tSUP" ) );
    }
}
