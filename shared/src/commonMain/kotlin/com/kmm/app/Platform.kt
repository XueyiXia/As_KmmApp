package com.kmm.app


import com.russhwolf.settings.Settings
import kotlinx.serialization.json.Json

expect class Platform() {
    val platform: String

    fun putString(key: String, value: String)
}