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

package org.apache.shenyu.web.loader;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Test for  ShenyuPluginPathBuilder.
 */
public final class ShenyuPluginPathBuilderTest {
    
    
    /**
     * test for  Custom path.
     */
    @Test
    public void testGetPluginPathByCustomPath() {
        File jarFile = ShenyuPluginPathBuilder.getPluginFile("/testpath");
        assertNotNull(jarFile);
    }
    
    /**
     * test  for plugin-ext.
     * -Dplugin-ext=D:\testUrl
     */
    @Test
    public void testGetPluginPathByPluginExt() {
        System.setProperty("plugin-ext", "/testUrl");
        File jarFile = ShenyuPluginPathBuilder.getPluginFile("");
        assertNotNull(jarFile);
    }
    
    /**
     * test for default path.
     */
    @Test
    public void testGetPluginPathByExtLib() {
        File jarFile = ShenyuPluginPathBuilder.getPluginFile("");
        assertNotNull(jarFile);
    }
}
