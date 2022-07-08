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

package org.apache.shenyu.web.filter;

import org.apache.shenyu.common.constant.Constants;
import org.apache.shenyu.common.utils.PathMatchUtils;
import org.apache.shenyu.common.utils.ShaUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.DispatcherHandler;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

import javax.annotation.Nonnull;
import java.util.Objects;

/**
 * The type Local dispatcher filter.
 */
public class LocalDispatcherFilter implements WebFilter {
    
    private static final String DISPATCHER_PATH = "/shenyu/**";

    private final DispatcherHandler dispatcherHandler;
    
    private String sha512Key;
    
    /**
     * Instantiates a new Local dispatcher filter.
     *
     * @param dispatcherHandler the dispatcher handler
     * @param sha512Key the sha512 key
     */
    public LocalDispatcherFilter(final DispatcherHandler dispatcherHandler, final String sha512Key) {
        this.dispatcherHandler = dispatcherHandler;
        this.sha512Key = sha512Key;
    }
    
    /**
     * Process the Web request and (optionally) delegate to the next
     * {@code WebFilter} through the given {@link WebFilterChain}.
     *
     * @param exchange the current server exchange
     * @param chain provides a way to delegate to the next filter
     * @return {@code Mono<Void>} to indicate when request processing is complete
     */
    @Override
    @Nonnull
    public Mono<Void> filter(@Nonnull final ServerWebExchange exchange, @Nonnull final WebFilterChain chain) {
        String path = exchange.getRequest().getURI().getPath();
        if (PathMatchUtils.match(DISPATCHER_PATH, path)) {
            String localKey = exchange.getRequest().getHeaders().getFirst(Constants.LOCAL_KEY);
            if (Objects.isNull(sha512Key) || !sha512Key.equalsIgnoreCase(ShaUtils.shaEncryption(localKey)) || Objects.isNull(localKey)) {
                return Mono.error(new ResponseStatusException(HttpStatus.FORBIDDEN, "The key is not correct."));
            }
            return dispatcherHandler.handle(exchange);
        }
        return chain.filter(exchange);
    }
}
