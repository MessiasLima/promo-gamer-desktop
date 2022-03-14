package com.promogamer.presentation.search

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import io.appoutlet.karavel.Page

class SearchPage : Page() {
    @Composable
    override fun content() {
        SearchScreen()
    }
}

@Composable
fun SearchScreen(){
    Text(text = "Search", style = MaterialTheme.typography.h1)
}