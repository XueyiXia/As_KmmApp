package com.kmm.app.storage


import com.russhwolf.settings.Settings
import kotlinx.serialization.json.Json

/**
 * @author: xiaxueyi
 * @date: 2022-08-26
 * @time: 09:26
 * @说明: key value 存储
 */
 public class StorageUtils {

    private var settings: Settings?=null;

    private var json: Json?=null;

    constructor(settings: Settings){
        this.settings=settings;
    }


    fun putInt(key: String, value: Int){
        settings?.putInt(key,value)
    }

    fun putString(key: String, value: String){
        settings?.putString(key,value)
    }

    fun putLong(key: String, value: Long){
        settings?.putLong(key,value)
    }

    fun putFloat(key: String, value: Float){
        settings?.putFloat(key,value)
    }

}