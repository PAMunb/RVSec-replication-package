/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.admin.listener.zookeeper;

import org.I0Itec.zkclient.ZkClient;
import org.apache.shenyu.admin.service.SyncDataService;
import org.apache.shenyu.common.constant.DefaultPathConstants;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

/**
 * Test cases for {@link ZookeeperDataInit}.
 */
@ExtendWith(MockitoExtension.class)
public final class ZookeeperDataInitTest {

    @Mock
    private ZkClient zkClient;

    @Mock
    private SyncDataService syncDataService;

    @Test
    public void testRun() {
        ZookeeperDataInit zookeeperDataInit = new ZookeeperDataInit(zkClient, syncDataService);

        when(zkClient.exists(Mockito.anyString())).thenReturn(false);
        zookeeperDataInit.run();

        when(zkClient.exists(Mockito.anyString()))
                .then(invocation -> pathExist(invocation, Collections.singletonList(
                        DefaultPathConstants.APP_AUTH_PARENT
                )));
        zookeeperDataInit.run();

        when(zkClient.exists(Mockito.anyString()))
                .thenAnswer(invocation -> pathExist(invocation, Arrays.asList(
                        DefaultPathConstants.PLUGIN_PARENT,
                        DefaultPathConstants.APP_AUTH_PARENT
                )));
        zookeeperDataInit.run();

        assertNotNull(zookeeperDataInit);
    }

    private boolean pathExist(final InvocationOnMock invocation, final List<String> pathList) {
        String arg = invocation.getArgument(0);
        return pathList.contains(arg);
    }
}
