plugins {
    alias(libs.plugins.kotlin.multiplatform) apply false
}

group = libs.versions.application.group.get()
version = libs.versions.application.version.get()
