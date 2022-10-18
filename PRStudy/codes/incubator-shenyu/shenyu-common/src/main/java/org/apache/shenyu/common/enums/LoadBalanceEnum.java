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

/**
 * load balance enum.
 */
public enum LoadBalanceEnum {

    /**
     * Hash load balance enum.
     */
    HASH(1, "hash", true),

    /**
     * Random load balance enum.
     */
    RANDOM(2, "random", true),

    /**
     * Round robin load balance enum.
     */
    ROUND_ROBIN(3, "roundRobin", true);

    private final int code;

    private final String name;

    private final boolean support;

    /**
     * all args constructor.
     *
     * @param code    code
     * @param name    name
     * @param support support
     */
    LoadBalanceEnum(final int code, final String name, final boolean support) {
        this.code = code;
        this.name = name;
        this.support = support;
    }

    /**
     * get code.
     *
     * @return code
     */
    public int getCode() {
        return code;
    }

    /**
     * get name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * get support.
     *
     * @return support
     */
    public boolean isSupport() {
        return support;
    }
}
