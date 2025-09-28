package com.romanenko.wineup.home.bottomnav


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ListAlt
import androidx.compose.material.icons.automirrored.outlined.ListAlt
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.romanenko.wineup.navigation.Navigable
import com.romanenko.wineup.navigation.NavigableGraph


sealed class BottomItem(
    val name: String,
    val unselectedIcon: ImageVector,
    val selectedIcon: ImageVector,
    val route: Navigable
) {

    data object List : BottomItem(
        name = "List",
        unselectedIcon = Icons.AutoMirrored.Outlined.ListAlt,
        selectedIcon =  Icons.AutoMirrored.Filled.ListAlt,
        route = NavigableGraph.List
    )

    data object Search : BottomItem(
        name = "Search",
        unselectedIcon = Icons.Outlined.Search,
        selectedIcon = Icons.Filled.Search,
        route = NavigableGraph.Search
    )

    data object Add : BottomItem(
        name = "Add",
        unselectedIcon = Icons.Outlined.Add,
        selectedIcon = Icons.Filled.Add,
        route = NavigableGraph.Add
    )
}