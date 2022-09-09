package com.kmm.app

import android.content.Context
import com.kmm.app.storage.StorageUtils
import com.russhwolf.settings.AndroidSettings
import com.russhwolf.settings.Settings
import com.russhwolf.settings.get


actual class Platform actual constructor() {

    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"

     fun putString(context: Context, key: String, value: String) {
        val factory: Settings.Factory = AndroidSettings.Factory(context)
        var settings: Settings=factory.create("Setting");
        StorageUtils(settings).putString(key,value)




         putString(key,value)
    }


    actual fun putString(key: String, value: String) {

    }


    fun getData(context: Context,key: String): String? {
        val factory: Settings.Factory = AndroidSettings.Factory(context)
        var settings: Settings=factory.create("Setting");

       return settings.get<String>(key)
    }




}