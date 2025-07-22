
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id("org.jetbrains.kotlin.android") version "1.9.0"
        id("com.android.application") version "8.2.0"
        id("com.android.library") version "8.2.0"
        id("com.google.gms.google-services") version "4.4.1"

    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AppManga"
include(":app")