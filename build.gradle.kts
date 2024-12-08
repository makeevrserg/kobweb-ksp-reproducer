

buildscript {
    dependencies {
        classpath("ru.astrainteractive.gradleplugin:convention:0.5.1")
    }
}
plugins {
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.kobweb.application) apply false
    alias(libs.plugins.kobweb.markdown) apply false
}
apply(plugin = "ru.astrainteractive.gradleplugin.detekt")

group = libs.versions.application.group.get()
version = libs.versions.application.version.get()
