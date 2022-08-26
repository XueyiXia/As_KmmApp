package com.kmm.app

import com.russhwolf.settings.Settings
import kotlinx.serialization.json.Json
import platform.UIKit.UIDevice

actual class Platform actual constructor() {

    actual fun putString(settings: Settings, json: Json){

    }

    actual val platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}