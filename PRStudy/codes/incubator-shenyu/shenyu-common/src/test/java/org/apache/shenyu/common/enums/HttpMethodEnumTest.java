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

import java.util.Arrays;
import org.apache.shenyu.common.exception.ShenyuException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

/** Test Cases for HttpMethodEnum. */
public final class HttpMethodEnumTest {

    @Test
    public void testGetName() {
        assertEquals("delete", HttpMethodEnum.DELETE.getName());
        assertEquals("get", HttpMethodEnum.GET.getName());
        assertEquals("post", HttpMethodEnum.POST.getName());
        assertEquals("put", HttpMethodEnum.PUT.getName());
    }

    @Test
    public void testSupport() {
        assertTrue(HttpMethodEnum.DELETE.getSupport());
        assertTrue(HttpMethodEnum.GET.getSupport());
        assertTrue(HttpMethodEnum.POST.getSupport());
        assertTrue(HttpMethodEnum.PUT.getSupport());
    }

    @Test
    public void testAcquireByNameValid() {
        Arrays.stream(HttpMethodEnum.values())
                .forEach(e -> assertEquals(e, HttpMethodEnum.acquireByName(e.getName())));
    }

    @Test
    public void testAcquireByNameInvalid() {
        String httpMethodName = "InvalidName";
        assertThrows(ShenyuException.class, () -> HttpMethodEnum.acquireByName(httpMethodName));
    }
}
