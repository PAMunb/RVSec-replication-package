/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License,  Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,  software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,  either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.plugin.base.condition.strategy;

import com.google.common.collect.Lists;
import org.apache.shenyu.common.dto.ConditionData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.http.server.reactive.MockServerHttpRequest;
import org.springframework.mock.web.server.MockServerWebExchange;
import org.springframework.web.server.ServerWebExchange;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test cases for AndMatchStrategy.
 */
@ExtendWith(MockitoExtension.class)
public final class AndMatchStrategyTest {

    private ServerWebExchange exchange;

    private List<ConditionData> conditionDataList;

    private MatchStrategy matchStrategy;

    @BeforeEach
    public void setUp() {
        this.conditionDataList = Lists.newArrayListWithCapacity(2);
        ConditionData matchConditionData = new ConditionData();
        matchConditionData.setOperator("match");
        matchConditionData.setParamName("shenyu");
        matchConditionData.setParamType("uri");
        matchConditionData.setParamValue("/http/**");
        ConditionData eqConditionData = new ConditionData();
        eqConditionData.setOperator("=");
        eqConditionData.setParamName("shenyu");
        eqConditionData.setParamType("uri");
        eqConditionData.setParamValue("/http/test");
        conditionDataList.add(matchConditionData);
        conditionDataList.add(eqConditionData);
        this.exchange = MockServerWebExchange.from(MockServerHttpRequest.get("/http/test")
                .build());
        matchStrategy = new AndMatchStrategy();
    }

    @Test
    public void testMatch() {
        assertTrue(matchStrategy.match(conditionDataList, exchange));
    }
}
