plugins {
    alias(libs.plugins.wineup.kotlinMultiplatform)
    alias(libs.plugins.wineup.composeMultiplatform)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(libs.kotlin.stdlib)

            implementation(projects.core.navigation)
            implementation(libs.navigation.compose)

            implementation(libs.androidx.lifecycle.viewmodelCompose)
            implementation(libs.androidx.lifecycle.runtimeCompose)
        }
    }
}