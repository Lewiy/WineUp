package com.romanenko.wineup.list.navigation

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


fun NavGraphBuilder.listGraph() {
    navigation<NavigableGraph.List>(
        startDestination = ListRoute.List
    ) {
            composable<ListRoute.List> { ListScreen()  }
    }
}

@Composable
fun ListScreen() {
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
                    text = "List Screen",
                    fontSize = 40.sp
                )
            }
        }
    )
}