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
//                implementation(projects.components.coreTheme)
//                implementation(projects.components.coreResources)
//                implementation(projects.components.coreUi)
            }
        }
        val jsMain by getting {
            dependencies {
                implementation(libs.compose.html.core)
                implementation(libs.kobweb.core)
                implementation(libs.kobweb.silk.core)
                implementation(libs.kobweb.silk.icons.fa)
                implementation(libs.kobweb.silk.icons.mdi)
                implementation(libs.kobweb.markdown)
            }
        }
    }
}
