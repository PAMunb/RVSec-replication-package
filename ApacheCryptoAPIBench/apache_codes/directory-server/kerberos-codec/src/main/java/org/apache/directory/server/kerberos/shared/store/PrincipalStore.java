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
package org.apache.directory.server.kerberos.shared.store;


import javax.security.auth.kerberos.KerberosPrincipal;

import org.apache.directory.server.kerberos.changepwd.exceptions.ChangePasswordException;


/**
 * The store interface used by Kerberos services.
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public interface PrincipalStore
{

    /**
     * Change a principal's password.
     * @param byPrincipal the principal which is changing the password for the forPrincipal
     * @param forPrincipal the principal whose password is being set or changed
     * @param newPassword the new password
     * @param isInitialTicket tells if the ticket is a freshly obtained ticket
     * @throws Exception
     */
    void changePassword( KerberosPrincipal byPrincipal, KerberosPrincipal forPrincipal, String newPassword,
        boolean isInitialTicket ) throws ChangePasswordException;


    /**
     * Get a {@link PrincipalStoreEntry} given a Kerberos principal.
     *
     * @param principal
     * @return The {@link PrincipalStoreEntry} for the given Kerberos principal.
     * @throws Exception
     */
    PrincipalStoreEntry getPrincipal( KerberosPrincipal principal ) throws Exception;
}
