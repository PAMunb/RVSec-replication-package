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

package org.apache.shenyu.common.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test case for SerializeEnum.
 */
public final class SerializeEnumTest {

    /**
     * test SerializeEnum#getSerialize.
     */
    @Test
    public void testGetSerialize() {
        assertEquals(SerializeEnum.JDK.getSerialize(), "jdk");
        assertEquals(SerializeEnum.KRYO.getSerialize(), "kryo");
        assertEquals(SerializeEnum.HESSIAN.getSerialize(), "hessian");
        assertEquals(SerializeEnum.FAST_JSON.getSerialize(), "fastJson");
        assertEquals(SerializeEnum.PROTOSTUFF.getSerialize(), "protostuff");
    }

    /**
     * test SerializeEnum#acquire.
     */
    @Test
    public void testAcquire() {
        assertEquals(SerializeEnum.acquire("unknown"), SerializeEnum.JDK);
        assertEquals(SerializeEnum.acquire("jdk"), SerializeEnum.JDK);
        assertEquals(SerializeEnum.acquire("kryo"), SerializeEnum.KRYO);
        assertEquals(SerializeEnum.acquire("hessian"), SerializeEnum.HESSIAN);
        assertEquals(SerializeEnum.acquire("fastJson"), SerializeEnum.FAST_JSON);
        assertEquals(SerializeEnum.acquire("protostuff"), SerializeEnum.PROTOSTUFF);
    }
}
