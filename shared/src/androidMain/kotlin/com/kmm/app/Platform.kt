package com.kmm.app

import android.content.Context
import com.kmm.app.storage.StorageUtils
import com.russhwolf.settings.AndroidSettings
import com.russhwolf.settings.Settings
import com.russhwolf.settings.get
import kotlinx.serialization.json.Json


actual class Platform actual constructor() {

    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"

    fun putString(context: Context, key: String, value: String) {
        val factory: Settings.Factory = AndroidSettings.Factory(context)
       var settings: Settings=factory.create("Setting");
        StorageUtils(settings).putString(key,value)
    }


    fun getData(context: Context,key: String): String? {
        val factory: Settings.Factory = AndroidSettings.Factory(context)
        var settings: Settings=factory.create("Setting");

       return settings.get<String>(key)
    }

    actual fun putString(
        settings: Settings,
        json: Json,
        key: String,
        value: String
    ) {



    }


}