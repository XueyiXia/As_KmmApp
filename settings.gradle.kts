//pluginManagement {
//    repositories {
//        google()
//        gradlePluginPortal()
//        mavenCentral()
//    }
//}

plugins {
    //   https://github.com/alexvasilkov/GradleGitDependenciesPlugin
//   id("com.alexvasilkov.git-dependencies") version "2.0.4"
}


rootProject.name = "As_KmmApp"
include(":androidApp")
//include(":shared")

include(":library")
include(":KmmSharedLibrary")
