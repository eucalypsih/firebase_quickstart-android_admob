pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

include(":app")

// Required so that gradle can resolve these dependencies even when
// building only a single project.
 include(":internal:lintchecks")
 project(":internal:lintchecks").projectDir.mkdirs() //  = file("../internal/lintchecks")
 include(":internal:lint")
 project(":internal:lint").projectDir.mkdirs() // = file("../internal/lint")
 include(":internal:chooserx")
 project(":internal:chooserx").projectDir.mkdirs() // = file("../internal/chooserx")
