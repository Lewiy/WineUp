package com.romanenko.wineup.home.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.romanenko.wineup.home.HomeScreen
import com.romanenko.wineup.navigation.NavigableGraph
import com.romanenko.wineup.navigation.OnNavigateTo


fun NavGraphBuilder.homeScreen(
    onNavigate: OnNavigateTo
) {
    composable<NavigableGraph.Home> {
        HomeScreen(onNavigate)
    }
}