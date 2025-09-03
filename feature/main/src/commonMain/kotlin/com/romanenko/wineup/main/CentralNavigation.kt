package com.romanenko.wineup.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.romanenko.wineup.add.addGraph
import com.romanenko.wineup.list.navigation.listGraph
import com.romanenko.wineup.navigation.NavigableGraph
import com.romanenko.wineup.navigation.OnNavigateTo
import com.romanenko.wineup.search.navigation.searchGraph

@Composable
fun CentralNavigation(
    navController: NavHostController = rememberNavController(),
    onNavigate: OnNavigateTo,
) {
    NavHost(navController = navController, startDestination = NavigableGraph.List) {
        listGraph()
        searchGraph()
        addGraph()
    }
}