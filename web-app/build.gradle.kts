@file:Suppress("UnusedPrivateMember")

plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    js {
        browser()
    }
}
