package com.romanenko.wineup.main.bottomnav

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun AppBottomNavigation(navController: NavController) {
    val currentDestination = navController.currentBackStackEntryAsState().value?.destination

    NavigationBar {
        bottomScreens.forEach { screen ->
            val isSelected =
                currentDestination?.hierarchy?.any { it.hasRoute(screen.route::class) } == true
            NavigationBarItem(
                selected = isSelected,
                icon = {
                    Icon(
                        imageVector = if (isSelected) screen.selectedIcon else screen.unselectedIcon,
                        contentDescription = screen.name,
                    )
                },
                label = { Text(screen.name) },
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

private val bottomScreens = listOf(
    BottomItem.List,
    BottomItem.Search,
    BottomItem.Add
)