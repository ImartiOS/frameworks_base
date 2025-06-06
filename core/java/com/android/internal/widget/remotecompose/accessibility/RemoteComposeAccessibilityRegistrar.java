/*
 * Copyright (C) 2024 The Android Open Source Project
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
package com.android.internal.widget.remotecompose.accessibility;

import android.view.View;

import com.android.internal.widget.remotecompose.core.CoreDocument;

/**
 * Interface for registering and clearing accessibility delegates for remote compose players.
 *
 * <p>This interface is responsible for managing the accessibility delegate associated with a remote
 * compose player view. It allows for setting and clearing the delegate, which is used to handle
 * accessibility events and provide accessibility information for the remote compose content.
 */
public interface RemoteComposeAccessibilityRegistrar {
    void setAccessibilityDelegate(View remoteComposePlayer, CoreDocument document);

    void clearAccessibilityDelegate(View remoteComposePlayer);
}
