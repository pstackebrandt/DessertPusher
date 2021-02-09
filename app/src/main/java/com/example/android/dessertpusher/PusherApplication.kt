<<<<<<< HEAD
=======
/*
 * Copyright 2018, The Android Open Source Project
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

>>>>>>> f438421a58b54020ef89df28eacd3782a3a7706b
package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

class PusherApplication : Application() {
<<<<<<< HEAD
    /**
     * Called when the application is starting, before any activity, service,
     * or receiver objects (excluding content providers) have been created.
     *
     *
     * Implementations should be as quick as possible (for example using
     * lazy initialization of state) since the time spent in this function
     * directly impacts the performance of starting the first activity,
     * service, or receiver in a process.
     */
=======

>>>>>>> f438421a58b54020ef89df28eacd3782a3a7706b
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}