/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.deltaspike.test.core.impl.activation;


import org.apache.deltaspike.core.spi.activation.ClassDeactivator;
import org.apache.deltaspike.core.spi.activation.Deactivatable;

/**
 * Test {@link org.apache.deltaspike.core.spi.activation.ClassDeactivator}
 * which is needed to test {@link org.apache.deltaspike.core.util.ClassDeactivationUtils}
 */
public class TestClassDeactivator implements ClassDeactivator
{
    private static final long serialVersionUID = -3403907272881821406L;

    @Override
    public Boolean isActivated(Class<? extends Deactivatable> targetClass)
    {
        if (targetClass.equals(DeactivatedClass.class))
        {
            return Boolean.FALSE;
        }
        return null;
    }
}
