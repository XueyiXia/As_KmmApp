package com.kmm.app

import com.russhwolf.settings.Settings
import kotlinx.serialization.json.Json


actual class Platform actual constructor() {

    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
    actual fun putString(settings: Settings, json: Json) {

    }




}