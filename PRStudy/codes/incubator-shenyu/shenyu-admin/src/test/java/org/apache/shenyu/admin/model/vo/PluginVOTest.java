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

package org.apache.shenyu.admin.model.vo;

import org.apache.shenyu.admin.AbstractReflectGetterSetterTest;
import org.apache.shenyu.admin.model.entity.PluginDO;
import org.apache.shenyu.common.enums.PluginEnum;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Test case for PluginVO.
 */
public final class PluginVOTest extends AbstractReflectGetterSetterTest {

    @Override
    protected Class<?> getTargetClass() {
        return PluginVO.class;
    }

    @Test
    public void testBuildPluginVO() {
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        assertNotNull(PluginVO.buildPluginVO(PluginDO.builder()
                .name(PluginEnum.GLOBAL.getName())
                .dateCreated(currentTime)
                .dateUpdated(currentTime)
                .build()));
    }
}
