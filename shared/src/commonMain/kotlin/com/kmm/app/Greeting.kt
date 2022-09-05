package com.kmm.app

import com.kmm.app.network.NetLoader

class Greeting {

   suspend fun greeting(): String {
        val res=NetLoader().getData()
        return res
    }



}