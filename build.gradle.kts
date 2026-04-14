plugins {
    id("com.android.application") version "9.1.0" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.2.10" apply false
    id("com.google.devtools.ksp") version "2.2.10-2.0.2" apply false
    id("com.google.dagger.hilt.android") version "2.59.2" apply false
    id("io.gitlab.arturbosch.detekt") version "1.23.5" apply false
    id("org.jlleitschuh.gradle.ktlint") version "12.1.0" apply false
    id("org.sonarqube") version "5.0.0.4638"
}

sonar {
    properties {
        property("sonar.projectKey", "rudrigaum_TMDBExplorer")
        property("sonar.organization", "rudrigaum")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.kotlin.detekt.reportPaths", "build/reports/detekt/detekt.xml")
    }
}