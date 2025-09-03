package com.romanenko.wineup.navigation
import androidx.navigation.NavOptionsBuilder

typealias OnNavigateTo = (Navigable, NavOptionsBuilder.() -> Unit) -> Unit
