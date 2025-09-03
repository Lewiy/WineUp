package com.romanenko.wineup.add

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


fun NavGraphBuilder.addGraph() {
    navigation<NavigableGraph.Add>(
        startDestination = AddRoute.Add
    ) {
        composable<AddRoute.Add> { AddScreen() }
    }
}

@Composable
fun AddScreen() {
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
                    text = "Add Screen",
                    fontSize = 40.sp
                )
            }
        }
    )
}