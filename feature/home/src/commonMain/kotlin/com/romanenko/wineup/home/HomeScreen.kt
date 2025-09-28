package com.romanenko.wineup.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.romanenko.wineup.add.addGraph
import com.romanenko.wineup.list.navigation.listGraph
import com.romanenko.wineup.home.bottomnav.AppBottomNavigation
import com.romanenko.wineup.navigation.NavigableGraph
import com.romanenko.wineup.navigation.OnNavigateTo
import com.romanenko.wineup.search.navigation.searchGraph


@Composable
internal fun HomeScreen(onNavigate: OnNavigateTo) {
    val navController: NavHostController = rememberNavController()
    Scaffold(
        bottomBar = {
            AppBottomNavigation(navController = navController)
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = NavigableGraph.List,
            modifier = Modifier.padding(innerPadding)
        ) {
            listGraph()
            searchGraph()
            addGraph()
        }
    }
}