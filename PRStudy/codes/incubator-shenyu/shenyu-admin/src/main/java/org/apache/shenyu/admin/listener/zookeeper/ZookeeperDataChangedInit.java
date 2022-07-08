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
import org.apache.shenyu.admin.listener.AbstractDataChangedInit;
import org.apache.shenyu.common.constant.DefaultPathConstants;

/**
 * The type Zookeeper data changed init.
 */
public class ZookeeperDataChangedInit extends AbstractDataChangedInit {

    private final ZkClient zkClient;

    /**
     * Instantiates a new Zookeeper data changed init.
     *
     * @param zkClient        the zk client
     */
    public ZookeeperDataChangedInit(final ZkClient zkClient) {
        this.zkClient = zkClient;
    }

    @Override
    protected boolean notExist() {
        return !zkClient.exists(DefaultPathConstants.PLUGIN_PARENT)
                && !zkClient.exists(DefaultPathConstants.APP_AUTH_PARENT)
                && !zkClient.exists(DefaultPathConstants.META_DATA);
    }
}
