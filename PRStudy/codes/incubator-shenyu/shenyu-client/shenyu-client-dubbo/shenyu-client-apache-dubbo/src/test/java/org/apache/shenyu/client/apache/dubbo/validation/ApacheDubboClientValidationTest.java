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

package org.apache.shenyu.client.apache.dubbo.validation;

import org.apache.dubbo.common.URL;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test case for {@link ApacheDubboClientValidation}.
 */
public final class ApacheDubboClientValidationTest {

    private ApacheDubboClientValidation apacheDubboClientValidationUnderTest;

    @BeforeEach
    public void setUp() {
        apacheDubboClientValidationUnderTest = new ApacheDubboClientValidation();
    }

    @Test
    public void testGetValidator() {
        String mockServiceUrl =
                "mock://localhost:28000/org.apache.shenyu.client.apache.dubbo.validation.mock.MockValidatorTarget";
        final URL url = URL.valueOf(mockServiceUrl);
        apacheDubboClientValidationUnderTest.getValidator(url);
    }
}
