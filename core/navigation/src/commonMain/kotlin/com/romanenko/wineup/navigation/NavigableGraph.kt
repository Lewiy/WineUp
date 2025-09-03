package com.romanenko.wineup.navigation

import kotlinx.serialization.Serializable

sealed class NavigableGraph : Navigable {
    @Serializable
    data object Home : NavigableGraph()
    @Serializable
    data object List : NavigableGraph()
    @Serializable
    data object Search : NavigableGraph()
    @Serializable
    data object Add : NavigableGraph()
}
