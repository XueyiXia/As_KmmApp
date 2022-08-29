package com.kmm.app

import com.kmm.app.storage.StorageUtils
import com.russhwolf.settings.Settings
import kotlinx.serialization.json.Json
import platform.UIKit.UIDevice

actual class Platform actual constructor() {

    actual fun putString(settings: Settings, json: Json,key: String, value: String) {

        StorageUtils(settings,json).putString(key,value)
    }

    actual val platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}