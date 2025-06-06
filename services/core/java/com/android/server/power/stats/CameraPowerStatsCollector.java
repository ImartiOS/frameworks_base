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

package com.android.server.power.stats;

import android.hardware.power.stats.EnergyConsumerType;
import android.os.BatteryConsumer;

import com.android.server.power.stats.format.BinaryStatePowerStatsLayout;

public class CameraPowerStatsCollector extends EnergyConsumerPowerStatsCollector {

    public CameraPowerStatsCollector(Injector injector) {
        super(injector, BatteryConsumer.POWER_COMPONENT_CAMERA,
                BatteryConsumer.powerComponentIdToString(BatteryConsumer.POWER_COMPONENT_CAMERA),
                EnergyConsumerType.CAMERA, new BinaryStatePowerStatsLayout());
    }
}
