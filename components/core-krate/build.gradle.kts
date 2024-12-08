@file:Suppress("UnusedPrivateMember")

import com.varabyte.kobweb.gradle.library.util.configAsKobwebLibrary


plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.kobweb.library)
}

kotlin {
    configAsKobwebLibrary(includeServer = false)
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.compose.runtime)
                implementation(libs.kotlinx.coroutines)
            }
        }
        val jsMain by getting {
            dependencies {
                implementation(libs.compose.html.core)
            }
        }
    }
}
