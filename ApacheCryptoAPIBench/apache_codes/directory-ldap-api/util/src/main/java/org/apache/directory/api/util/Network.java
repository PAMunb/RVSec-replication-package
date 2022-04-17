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

package org.apache.directory.api.util;


import java.net.InetAddress;


/**
 * Network utils.
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public final class Network
{

    /**
     * Private constructor.
     */
    private Network()
    {
    }

    public static final InetAddress LOOPBACK = getLoopbackAddress();
    public static final String LOOPBACK_HOSTNAME = getLoopbackHostName();


    private static String getLoopbackHostName()
    {
        InetAddress loopbackAddress = InetAddress.getLoopbackAddress();
        return loopbackAddress.getCanonicalHostName();
    }


    private static InetAddress getLoopbackAddress()
    {
        InetAddress loopbackAddress = InetAddress.getLoopbackAddress();
        return loopbackAddress;
    }


    public static String ldapLoopbackUrl( int port )
    {
        return "ldap://" + LOOPBACK_HOSTNAME + ":" + port;
    }

}
