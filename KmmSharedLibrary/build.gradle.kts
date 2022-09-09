plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
    kotlin("plugin.serialization") version "1.6.21"
}

version = "1.0"
kotlin {
    android()
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        ios.deploymentTarget = "14.1"
        podfile = project.file("../iosApp/Podfile")
        framework {
            baseName = "KmmSharedLibrary"
        }
    }

    sourceSets {
        val ktorVersion = "2.1.0"

//        val commonTest by getting {
//            dependencies {
//                implementation(kotlin("test"))
//            }
//        }
        val commonMain by getting{
            dependencies {
//                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
                //网络请求
//                implementation("io.ktor:ktor-client-core:$ktorVersion")
//                implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
//                implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")

                //存储
//                implementation("androidx.preference:preference-ktx:1.2.0")
//                implementation("com.russhwolf:multiplatform-settings:0.9")


                implementation (com.hi.dhl.Deps.coroutines_core)
                implementation (com.hi.dhl.Deps.ktor_client_core)
                implementation (com.hi.dhl.Deps.ktor_client_content_negotiation)
                implementation (com.hi.dhl.Deps.ktor_serialization_json)
                implementation (com.hi.dhl.Deps.multiplatform_setting)
            }
        }



//        val androidTest by getting
        val androidMain by getting{
            dependencies {
                //网络请求
//                implementation("io.ktor:ktor-client-android:$ktorVersion")
                implementation (com.hi.dhl.Deps.ktor_client_core_android)
            }
        }



        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting

        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)

            dependencies {
                //网络请求
                implementation("io.ktor:ktor-client-darwin:$ktorVersion")
            }
        }
//        val iosX64Test by getting
//        val iosArm64Test by getting
//        val iosSimulatorArm64Test by getting
//        val iosTest by creating {
//            dependsOn(commonTest)
//            iosX64Test.dependsOn(this)
//            iosArm64Test.dependsOn(this)
//            iosSimulatorArm64Test.dependsOn(this)
//        }
    }
}

android {
    namespace = "com.shared.library"
    compileSdk = 32
//    compileSdk build_versions.compileSdk
    defaultConfig {
        minSdk = 21
        targetSdk = 32

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}


//android {
//    compileSdk = 32
//    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
//    defaultConfig {
//        minSdk = 21
//        targetSdk = 32
//    }
//}



