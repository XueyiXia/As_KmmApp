package com.kmm.app.network

import com.kmm.app.api.HttpApi
import io.ktor.client.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json


/**
 * @author: xiaxueyi
 * @date: 2022-08-26
 * @time: 09:24
 * @说明: 网络加载工具类
 */
class NetLoader {


    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
    }


    /**
     * 获取数据
     */
    suspend fun getData(): String{
        val result:String = httpClient.get(HttpApi.BASE_URL).bodyAsText()

        return result
    }
}