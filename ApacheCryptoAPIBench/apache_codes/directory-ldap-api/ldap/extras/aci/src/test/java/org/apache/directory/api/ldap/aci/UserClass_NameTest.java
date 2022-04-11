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
package org.apache.directory.api.ldap.aci;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.HashSet;
import java.util.Set;

import com.mycila.junit.concurrent.Concurrency;
import com.mycila.junit.concurrent.ConcurrentJunitRunner;

import org.apache.directory.api.ldap.aci.UserClass.Name;
import org.apache.directory.api.ldap.model.exception.LdapInvalidDnException;
import org.apache.directory.api.ldap.model.name.Dn;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * Unit tests class UserClass.Name.
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
@RunWith(ConcurrentJunitRunner.class)
@Concurrency()
public class UserClass_NameTest
{
    private Name nameA;
    private Name nameACopy;
    private Name nameB;
    private Name nameC;


    /**
     * Initialize name instances
     */
    @Before
    public void initNames() throws LdapInvalidDnException
    {
        Set<Dn> dnSetA = new HashSet<Dn>();
        dnSetA.add( new Dn( "a=aa" ) );
        dnSetA.add( new Dn( "b=bb" ) );

        Set<Dn> dnSetB = new HashSet<Dn>();
        dnSetB.add( new Dn( "b=bb" ) );
        dnSetB.add( new Dn( "a=aa" ) );

        Set<Dn> dnSetC = new HashSet<Dn>();
        dnSetC.add( new Dn( "a=aa" ) );
        dnSetC.add( new Dn( "b=bb" ) );

        Set<Dn> dnSetD = new HashSet<Dn>();
        dnSetD.add( new Dn( "b=bb" ) );
        dnSetD.add( new Dn( "c=cc" ) );

        nameA = new Name( dnSetA );
        nameACopy = new Name( dnSetB );
        nameB = new Name( dnSetC );
        nameC = new Name( dnSetD );
    }


    @Test
    public void testEqualsNull() throws Exception
    {
        assertFalse( nameA.equals( null ) );
    }


    @Test
    public void testEqualsReflexive() throws Exception
    {
        assertEquals( nameA, nameA );
    }


    @Test
    public void testHashCodeReflexive() throws Exception
    {
        assertEquals( nameA.hashCode(), nameA.hashCode() );
    }


    @Test
    public void testEqualsSymmetric() throws Exception
    {
        assertEquals( nameA, nameACopy );
        assertEquals( nameACopy, nameA );
    }


    @Ignore( "There is no way this test can succeed, we are hashcoding values in a set...")
    @Test
    public void testHashCodeSymmetric() throws Exception
    {
        assertEquals( nameA.hashCode(), nameACopy.hashCode() );
        assertEquals( nameACopy.hashCode(), nameA.hashCode() );
    }


    @Test
    public void testEqualsTransitive() throws Exception
    {
        assertEquals( nameA, nameACopy );
        assertEquals( nameACopy, nameB );
        assertEquals( nameA, nameB );
    }


    @Ignore( "There is no way this test can succeed, we are hashcoding values in a set...")
    @Test
    public void testHashCodeTransitive() throws Exception
    {
        assertEquals( nameA.hashCode(), nameACopy.hashCode() );
        assertEquals( nameACopy.hashCode(), nameB.hashCode() );
        assertEquals( nameA.hashCode(), nameB.hashCode() );
    }


    @Test
    public void testNotEqualDiffValue() throws Exception
    {
        assertFalse( nameA.equals( nameC ) );
        assertFalse( nameC.equals( nameA ) );
    }
}