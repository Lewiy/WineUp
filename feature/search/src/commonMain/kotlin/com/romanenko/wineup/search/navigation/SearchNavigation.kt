package com.romanenko.wineup.search.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.romanenko.wineup.navigation.NavigableGraph
import kotlinx.serialization.Serializable

fun NavGraphBuilder.searchGraph() {
    navigation<NavigableGraph.Search>(
        startDestination = SearchRoute.Search
    ) {
        composable<SearchRoute.Search> { SearchScreen()  }
    }
}

@Composable
fun SearchScreen() {
    Scaffold(
        topBar = {},
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Search Screen",
                    fontSize = 40.sp
                )
            }
        }
    )
}