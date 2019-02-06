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

package io.shardingsphere.shardingjdbc.spring.algorithm;

import org.apache.shardingsphere.api.algorithm.sharding.hint.HintShardingAlgorithm;

import java.util.Collection;

public final class DefaultHintShardingAlgorithm implements HintShardingAlgorithm<Integer> {
    
    @Override
    public Collection<String> doSharding(final Collection<String> availableTargetNames, final String logicTableName, final String columnName, Collection<Integer> shardingValues) {
        return availableTargetNames;
    }
}
