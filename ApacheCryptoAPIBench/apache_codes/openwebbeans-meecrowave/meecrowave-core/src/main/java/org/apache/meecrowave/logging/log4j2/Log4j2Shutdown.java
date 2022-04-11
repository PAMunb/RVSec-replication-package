/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.meecrowave.logging.log4j2;

import org.apache.logging.log4j.LogManager;

/**
 * Hide away Log4j2 stuff
 */
public class Log4j2Shutdown {

    public void shutodwn() {
        try {
            // We disabled the log4j shutdown hook to gain more control and keep logs during shutdown.
            // See #disableLog4jShutdownHook()
            // Otoh that means we need to shutdown Log4j manually.
            // So here we go...
            LogManager.shutdown();
        } catch (final Exception e) {
            System.out.println("A problem happened when shutting down Log4j: " + e + "\n" + e.getMessage());
        }
    }
}
