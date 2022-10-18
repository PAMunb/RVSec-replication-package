/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.admin.config;

import org.apache.shenyu.admin.service.register.ShenyuClientRegisterService;
import org.apache.shenyu.register.common.config.ShenyuRegisterCenterConfig;
import org.apache.shenyu.register.server.api.ShenyuServerRegisterRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Test cases for {@link RegisterCenterConfiguration}.
 */
@ExtendWith(MockitoExtension.class)
public class RegisterCenterConfigurationTest {

    @InjectMocks
    private RegisterCenterConfiguration registerCenterConfiguration;

    @Test
    public void testShenyuRegisterCenterConfig() {
        assertEquals(ShenyuRegisterCenterConfig.class, registerCenterConfiguration.shenyuRegisterCenterConfig().getClass());
    }

    @Test
    public void testShenyuServerRegisterRepository() {
        ShenyuRegisterCenterConfig shenyuRegisterCenterConfig = mock(ShenyuRegisterCenterConfig.class);
        List<ShenyuClientRegisterService> shenyuClientRegisterService = new ArrayList<>();
        when(shenyuRegisterCenterConfig.getRegisterType()).thenReturn("http");
        ShenyuServerRegisterRepository registerRepository = registerCenterConfiguration
                .shenyuServerRegisterRepository(shenyuRegisterCenterConfig, shenyuClientRegisterService);
        assertNotNull(registerRepository);
    }
}
