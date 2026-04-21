// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    id("com.android.application") version "8.2.0" apply false    // alias(libs.plugins.android.application) apply false
    id("com.android.library") version "8.2.0" apply false    // alias(libs.plugins.android.library) apply false // apply plugin: "com.android.library"
    id("com.google.gms.google-services") version "4.4.4" apply false // alias(libs.plugins.google.services) apply false
}

allprojects {
    repositories {
        mavenLocal()
        google()
        mavenCentral()
    }
}
