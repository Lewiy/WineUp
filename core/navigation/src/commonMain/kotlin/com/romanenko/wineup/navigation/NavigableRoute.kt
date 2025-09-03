package com.romanenko.wineup.navigation

import kotlinx.serialization.Serializable

/**
 * All the possible "public" routes in the app.
 *
 * You can also split this sealed class to multiple sealed classes, inheriting from [Navigable]
 */
sealed class NavigableRoute : Navigable {
    // Main screen (containing 3 sub-screens)
//    sealed class Home : NavigableRoute() {
//        @Serializable data object List : Home()
//
//        @Serializable data object Search : Home()
//
//        @Serializable data object Add : Home()
//    }

    // Product screen
//    @Serializable data class Product(
//        val name: String,
//    ) : NavigableRoute()
}
