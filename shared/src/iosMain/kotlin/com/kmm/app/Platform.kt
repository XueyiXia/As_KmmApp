package com.kmm.app

import com.kmm.app.storage.StorageUtils
import com.russhwolf.settings.AppleSettings
import com.russhwolf.settings.Settings
import kotlinx.serialization.json.Json
import platform.UIKit.UIDevice

actual class Platform actual constructor() {


    actual fun putString( key: String, value: String) {
        val factory: Settings.Factory = AppleSettings.Factory()
        var settings: Settings=factory.create("Setting");
        StorageUtils(settings).putString(key,value)
    }

    actual val platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}