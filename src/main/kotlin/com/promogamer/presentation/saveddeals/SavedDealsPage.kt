package com.promogamer.presentation.saveddeals

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import io.appoutlet.karavel.Page

class SavedDealsPage : Page() {
    @Composable
    override fun content() {
        SavedDealsScreen()
    }
}

@Composable
fun SavedDealsScreen() {
    Text(text = "Saved deals", style = MaterialTheme.typography.h1)
}