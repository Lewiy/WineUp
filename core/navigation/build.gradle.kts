plugins {
    alias(libs.plugins.wineup.kotlinMultiplatform)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(libs.kotlin.stdlib)
            implementation(libs.navigation.compose)
        }
    }
}