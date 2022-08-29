package com.kmm.app


import com.russhwolf.settings.Settings
import kotlinx.serialization.json.Json

expect class Platform() {
    val platform: String

    fun putString(settings: Settings, json: Json,key: String, value: String)
}