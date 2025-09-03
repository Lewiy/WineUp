package org.romanenko.wineup

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.romanenko.wineup.navigation.WineUpNavGraph

@Composable
@Preview
fun App() {
    MaterialTheme {
        WineUpNavGraph()
    }
}