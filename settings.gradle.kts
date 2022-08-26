pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "As_KmmApp"
include(":androidApp")
include(":shared")

include(":library")