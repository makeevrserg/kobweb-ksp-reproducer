@file:Suppress("UnusedPrivateMember")

import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.kobweb.application)
}
// project.extra["kotlin.js.ir.output.granularity"] = "per-module"
// kobweb {
//    app {
//        index {
//            description.set("Powered by Kobweb")
//        }
//    }
// }
kotlin {
    configAsKobwebApplication("kspreproducer")

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.compose.runtime)
                implementation(projects.components.coreKrate)
                implementation(projects.components.coreLocalization)
                implementation(projects.components.wiki)
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
