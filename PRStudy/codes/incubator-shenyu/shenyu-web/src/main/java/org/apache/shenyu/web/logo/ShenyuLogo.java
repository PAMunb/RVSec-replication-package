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

package org.apache.shenyu.web.logo;

import org.apache.shenyu.common.constant.Constants;
import org.apache.shenyu.common.utils.VersionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.logging.LoggingApplicationListener;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * the shenyu logo.
 */
@Order(LoggingApplicationListener.DEFAULT_ORDER + 1)
public class ShenyuLogo implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    
    /**
     * logger.
     */
    private static final Logger LOG = LoggerFactory.getLogger(ShenyuLogo.class);

    private static final String SHENYU_LOGO = "\n"
        + "   _____ _                            \n"
        + "  / ____| |                           \n"
        + " | (___ | |__   ___ _ __  _   _ _   _ \n"
        + "  \\___ \\| '_ \\ / _ \\ '_ \\| | | | | | |\n"
        + "  ____) | | | |  __/ | | | |_| | |_| |\n"
        + " |_____/|_| |_|\\___|_| |_|\\__, |\\__,_|\n"
        + "                           __/ |      \n"
        + "                          |___/       ";

    private static final AtomicBoolean ALREADY_LOG = new AtomicBoolean(false);

    @Override
    public void onApplicationEvent(final ApplicationEnvironmentPreparedEvent event) {
        if (!ALREADY_LOG.compareAndSet(false, true)) {
            return;
        }
        LOG.info(buildBannerText());
    }

    private String buildBannerText() {
        return Constants.LINE_SEPARATOR
                + Constants.LINE_SEPARATOR
                + SHENYU_LOGO
                + Constants.LINE_SEPARATOR
                + " :: Shenyu :: (v" + VersionUtils.getVersion(getClass(), "2.3.0") + ")"
                + Constants.LINE_SEPARATOR;
    }
}
