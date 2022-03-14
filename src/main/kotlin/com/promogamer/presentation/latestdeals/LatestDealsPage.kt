package com.promogamer.presentation.latestdeals

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import io.appoutlet.karavel.Page

class LatestDealsPage : Page() {
    @Composable
    override fun content() {
        LatestDealsScreen()
    }
}

@Composable
fun LatestDealsScreen() {
    Text(text = "Latest deals", style = MaterialTheme.typography.h1)
}