plugins {
    `kotlin-dsl`
}

group = "com.wineup.convention.buildlogic"

dependencies {
    implementation(libs.plugins.kotlinSerialization.toDep())

    compileOnly(libs.plugins.androidApplication.toDep())
    compileOnly(libs.plugins.androidLibrary.toDep())
    compileOnly(libs.plugins.jetbrainsCompose.toDep())
    compileOnly(libs.plugins.kotlinMultiplatform.toDep())
    compileOnly(libs.plugins.compose.compiler.toDep())
}

fun Provider<PluginDependency>.toDep() = map {
    "${it.pluginId}:${it.pluginId}.gradle.plugin:${it.version}"
}

tasks {
    validatePlugins {
        enableStricterValidation = true
        failOnWarning = true
    }
}

gradlePlugin {
    plugins {
        register("kotlinMultiplatform") {
            id = "com.wineup.convention.kotlinMultiplatform"
            implementationClass = "com.wineup.convention.KotlinMultiplatformConventionPlugin"
        }
        register("composeMultiplatform") {
            id = "com.wineup.convention.composeMultiplatform"
            implementationClass = "com.wineup.convention.ComposeMultiplatformConventionPlugin"
        }
    }
}
