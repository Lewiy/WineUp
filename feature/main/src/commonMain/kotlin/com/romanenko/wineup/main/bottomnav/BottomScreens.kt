package com.romanenko.wineup.main.bottomnav


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.romanenko.wineup.navigation.NavigableGraph
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
sealed class BottomScreens<T>(
    val name: String,
    @Transient val selectedIcon: ImageVector? = null,
    @Transient val unselectedIcon: ImageVector? = null,
    val route: T
) {

    @Serializable
    data object Home : BottomScreens<NavigableGraph.List>(
        name = "Home",
        unselectedIcon = Icons.Outlined.Home,
        selectedIcon = Icons.Outlined.Home,
        route = NavigableGraph.List
    )

    @Serializable
    data object Search : BottomScreens<NavigableGraph.Search>(
        name = "Search",
        unselectedIcon = Icons.Outlined.Home,
        selectedIcon = Icons.Outlined.Home,
        route =NavigableGraph.Search
    )

    @Serializable
    data object Profile : BottomScreens<NavigableGraph.Add>(
        name = "Profile",
        unselectedIcon =Icons.Outlined.Home,
        selectedIcon = Icons.Outlined.Home,
        route = NavigableGraph.Add
    )
}