package org.romanenko.wineup.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.romanenko.wineup.main.navigation.homeScreen
import com.romanenko.wineup.navigation.NavigableGraph


@Composable
fun WineUpNavGraph(
    modifier: Modifier = Modifier,
    startDestination: NavigableGraph = NavigableGraph.Home,
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        modifier = modifier,
        startDestination = startDestination,
        navController = navController,
    ) {
        homeScreen{_, _ -> {}}
    }
}


