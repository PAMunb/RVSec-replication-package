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

package org.apache.shenyu.admin.mapper;

import org.apache.shenyu.admin.AbstractSpringIntegrationTest;
import org.apache.shenyu.admin.model.entity.SelectorConditionDO;
import org.apache.shenyu.admin.model.query.SelectorConditionQuery;
import org.apache.shenyu.common.utils.UUIDUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Test case for SelectorConditionMapper.
 */
public final class SelectorConditionMapperTest extends AbstractSpringIntegrationTest {

    private final SelectorConditionDO record = buildSelectorConditionDO();

    @Resource
    private SelectorConditionMapper selectorConditionMapper;

    @BeforeEach
    public void before() {
        int count = selectorConditionMapper.insert(record);
        assertThat(count, greaterThan(0));
    }

    @Test
    public void testSelectById() {
        SelectorConditionDO result = selectorConditionMapper.selectById(record.getId());
        assertNotNull(result);
    }

    @Test
    public void testSelectByQuery() {
        SelectorConditionQuery selectorConditionQuery = new SelectorConditionQuery(record.getSelectorId());
        List<SelectorConditionDO> result = selectorConditionMapper.selectByQuery(selectorConditionQuery);
        assertThat(result.size(), greaterThan(0));

        List<SelectorConditionDO> selectorWithoutSelectorId = selectorConditionMapper.selectByQuery(null);
        assertThat(selectorWithoutSelectorId.size(), greaterThan(0));
    }

    @Test
    public void testSelectBySelectorIds() {

        SelectorConditionDO record = buildSelectorConditionDO();
        assertThat(selectorConditionMapper.insert(record), equalTo(1));

        SelectorConditionDO record1 = buildSelectorConditionDO();
        assertThat(selectorConditionMapper.insert(record1), equalTo(1));

        Set<String> selectorIds = Stream.of(record.getSelectorId(), record1.getSelectorId()).collect(Collectors.toSet());
        List<SelectorConditionDO> selectorConditionDOList = selectorConditionMapper.selectBySelectorIds(selectorIds);

        assertThat(selectorConditionDOList, hasItems(record, record1));
    }

    @Test
    public void testInsert() {
        SelectorConditionDO newRecord = buildSelectorConditionDO();
        int count = selectorConditionMapper.insert(newRecord);
        assertThat(count, greaterThan(0));
    }

    @Test
    public void testInsertSelective() {
        SelectorConditionDO newRecord = buildSelectorConditionDO();
        int count = selectorConditionMapper.insertSelective(newRecord);
        assertThat(count, greaterThan(0));
    }

    @Test
    public void testUpdate() {
        record.setParamValue("update_param_value");
        record.setDateUpdated(Timestamp.valueOf(LocalDateTime.now()));
        int count = selectorConditionMapper.update(record);
        assertThat(count, greaterThan(0));
    }

    @Test
    public void testUpdateSelective() {
        record.setParamValue("update_param_value");
        record.setDateUpdated(Timestamp.valueOf(LocalDateTime.now()));
        int count = selectorConditionMapper.updateSelective(record);
        assertThat(count, greaterThan(0));
    }

    @Test
    public void testDelete() {
        int count = selectorConditionMapper.delete(record.getId());
        assertThat(count, greaterThan(0));
    }

    @Test
    public void testDeleteByQuery() {
        SelectorConditionQuery selectorConditionQuery = new SelectorConditionQuery(record.getSelectorId());
        int count = selectorConditionMapper.deleteByQuery(selectorConditionQuery);
        assertThat(count, greaterThan(0));
    }

    private SelectorConditionDO buildSelectorConditionDO() {
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());

        return SelectorConditionDO.builder()
                .id(UUIDUtils.getInstance().generateShortUuid())
                .selectorId(UUIDUtils.getInstance().generateShortUuid())
                .paramType("post")
                .operator("=")
                .paramName("test_param_Name")
                .paramValue("test_param_value")
                .dateCreated(currentTime)
                .dateUpdated(currentTime)
                .build();
    }
}
