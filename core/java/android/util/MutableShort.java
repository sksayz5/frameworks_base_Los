/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.util;

/**
 * @deprecated This class will be removed from a future version of the Android API.
 */
@Deprecated
@android.ravenwood.annotation.RavenwoodKeepWholeClass
public final class MutableShort {
    public short value;

    public MutableShort(short value) {
        this.value = value;
    }
}