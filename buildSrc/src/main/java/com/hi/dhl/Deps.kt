package com.hi.dhl

object Versions {
//    val support_lib = "27.0.2"
//    val retrofit = "2.3.0"
//    val rxjava = "2.1.9"
//    val kotlin_stdlib_jdk7 = "1.3.41"
//    val appcompat = "1.1.0"
//    val kts_core = "1.3.0"
//    val constraintlayout = "1.1.3"


    val versions_coroutines_core="1.6.4"
    val ktorVersion="2.1.0"
    val multiplatform_setting="0.9"
}

object Deps {
//    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
//    val kotlinStdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_stdlib_jdk7}"
//    val appcompat =  "androidx.appcompat:appcompat:${Versions.appcompat}"
//    val ktsCode =  "androidx.core:core-ktx:${Versions.kts_core}"
//    val constraintlayout =  "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"

    val coroutines_core="org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.versions_coroutines_core}"
    val ktor_client_core="io.ktor:ktor-client-core:${Versions.ktorVersion}"
    val ktor_client_core_android="io.ktor:ktor-client-android:${Versions.ktorVersion}"
    val ktor_client_content_negotiation="io.ktor:ktor-client-content-negotiation:${Versions.ktorVersion}"
    val ktor_serialization_json="io.ktor:ktor-serialization-kotlinx-json:${Versions.ktorVersion}"
    val multiplatform_setting="com.russhwolf:multiplatform-settings:${
        Versions.multiplatform_setting
    }"
}
