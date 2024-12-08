pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        maven("https://us-central1-maven.pkg.dev/varabyte-repos/public")
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
        maven("https://us-central1-maven.pkg.dev/varabyte-repos/public")
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "kspreproducer"
include(":web-app")
include(":components:core-krate")
include(":components:core-localization")
include(":components:wiki")
