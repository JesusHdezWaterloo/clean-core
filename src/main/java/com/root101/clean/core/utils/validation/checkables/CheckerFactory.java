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
package com.root101.clean.core.utils.validation.checkables;

import com.root101.clean.core.utils.validation.checkables.impl.DigitCheckable;
import com.root101.clean.core.utils.validation.checkables.impl.NeverCheckable;
import com.root101.clean.core.utils.validation.checkables.impl.SizeExactCheckable;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class CheckerFactory {

    public static Checkable buildDigitCheckable(String source, Character value) {
        return new DigitCheckable(source, value);
    }

    public static Checkable buildLengthExactCheckable(String source, String value, int length) {
        return new SizeExactCheckable(source, value, length);
    }

    public static Checkable buildNeverCheckable(String source, Object value) {
        return new NeverCheckable(source, value);
    }
}
