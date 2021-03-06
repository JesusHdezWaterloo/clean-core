/*
 * Copyright 2021 Root101 (jhernandezb96@gmail.com, +53-5-426-8660).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Or read it directly from LICENCE.txt file at the root of this project.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.root101.clean.core.utils.validation.checkables.impl;

import com.root101.clean.core.utils.validation.checkables.Checkable;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class SizeExactCheckable implements Checkable<String> {

    private final String source;
    private final String value;
    private final int length;

    public SizeExactCheckable(String source, String value, int length) {
        this.source = source;
        this.value = value;
        this.length = length;
    }

    @Override
    public boolean check() {
        return source.length() == length;
    }

    @Override
    public String getSource() {
        return source;
    }

    @Override
    public String getValue() {
        return value;
    }

}
