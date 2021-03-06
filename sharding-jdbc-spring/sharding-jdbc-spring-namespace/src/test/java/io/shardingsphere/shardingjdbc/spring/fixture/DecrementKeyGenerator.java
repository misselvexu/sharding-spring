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

package io.shardingsphere.shardingjdbc.spring.fixture;

import lombok.Getter;
import lombok.Setter;
import org.apache.shardingsphere.spi.algorithm.keygen.ShardingKeyGenerator;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicInteger;

public final class DecrementKeyGenerator implements ShardingKeyGenerator {
    
    private final AtomicInteger sequence = new AtomicInteger(100);
    
    @Getter
    @Setter
    private Properties properties = new Properties();
    
    @Override
    public String getType() {
        return "DECREMENT";
    }
    
    @Override
    public Comparable<?> generateKey() {
        return sequence.decrementAndGet();
    }
}
