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

package io.shardingsphere.shardingjdbc.orchestration.spring.registry;

import org.apache.shardingsphere.orchestration.reg.api.RegistryCenter;
import org.apache.shardingsphere.orchestration.reg.api.RegistryCenterConfiguration;
import org.apache.shardingsphere.orchestration.reg.listener.DataChangedEventListener;

import java.util.Collections;
import java.util.List;

public final class TestRegistryCenter implements RegistryCenter {
    
    @Override
    public void init(final RegistryCenterConfiguration config) {
    }
    
    @Override
    public String get(final String key) {
        return "";
    }
    
    @Override
    public String getDirectly(final String key) {
        return "";
    }
    
    @Override
    public boolean isExisted(final String key) {
        return true;
    }
    
    @Override
    public List<String> getChildrenKeys(final String key) {
        return Collections.emptyList();
    }
    
    @Override
    public void persist(final String key, final String value) {
    }
    
    @Override
    public void update(final String key, final String value) {
    }
    
    @Override
    public void persistEphemeral(final String key, final String value) {
    }
    
    @Override
    public void watch(final String key, final DataChangedEventListener dataChangedEventListener) {
    }
    
    @Override
    public void close() {
    }
}
