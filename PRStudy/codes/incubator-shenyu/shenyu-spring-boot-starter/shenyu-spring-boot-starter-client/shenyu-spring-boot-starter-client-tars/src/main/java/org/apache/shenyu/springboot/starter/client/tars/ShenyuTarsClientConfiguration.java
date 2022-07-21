/*
 *   Licensed to the Apache Software Foundation (ASF) under one or more
 *   contributor license agreements.  See the NOTICE file distributed with
 *   this work for additional information regarding copyright ownership.
 *   The ASF licenses this file to You under the Apache License, Version 2.0
 *   (the "License"); you may not use this file except in compliance with
 *   the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package org.apache.shenyu.springboot.starter.client.tars;

import org.apache.shenyu.client.tars.TarsContextRefreshedEventListener;
import org.apache.shenyu.client.tars.TarsServiceBeanPostProcessor;
import org.apache.shenyu.common.enums.RpcTypeEnum;
import org.apache.shenyu.register.client.api.ShenyuClientRegisterRepository;
import org.apache.shenyu.register.common.config.ShenyuClientConfig;
import org.apache.shenyu.springboot.starter.client.common.config.ShenyuClientCommonBeanConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Tars type client bean postprocessor.
 */
@Configuration
@ImportAutoConfiguration(ShenyuClientCommonBeanConfiguration.class)
public class ShenyuTarsClientConfiguration {
    
    /**
     * Tars service bean post processor sofa service bean post processor.
     *
     * @param clientConfig the client config
     * @param shenyuClientRegisterRepository the shenyuClientRegisterRepository
     * @return the tars service bean post processor
     */
    @Bean
    public TarsServiceBeanPostProcessor tarsServiceBeanPostProcessor(final ShenyuClientConfig clientConfig, final ShenyuClientRegisterRepository shenyuClientRegisterRepository) {
        return new TarsServiceBeanPostProcessor(clientConfig.getClient().get(RpcTypeEnum.TARS.getName()), shenyuClientRegisterRepository);
    }
    
    /**
     * Tars context refreshed event listener tars context refreshed event listener.
     *
     * @param clientConfig the client config
     * @return the tars context refreshed event listener
     */
    @Bean
    public TarsContextRefreshedEventListener tarsContextRefreshedEventListener(final ShenyuClientConfig clientConfig) {
        return new TarsContextRefreshedEventListener(clientConfig.getClient().get(RpcTypeEnum.TARS.getName()));
    }
}
