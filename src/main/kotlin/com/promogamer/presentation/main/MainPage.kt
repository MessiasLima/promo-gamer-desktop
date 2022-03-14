package com.promogamer.presentation.main

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.promogamer.core.ui.AppTheme
import com.promogamer.presentation.latestdeals.LatestDealsPage
import io.appoutlet.karavel.Karavel
import io.appoutlet.karavel.Page

class MainPage : Page() {
    @Composable
    override fun content() {
        MainScreen(karavel)
    }
}

@Composable
fun MainScreen(appKaravel: Karavel? = null) {
    val mainScreenCaravel by remember { mutableStateOf(Karavel(LatestDealsPage())) }

    Box(modifier = Modifier.fillMaxSize()) {
        mainScreenCaravel.currentPage().content()

        TopMenu(mainScreenCaravel)
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    AppTheme {
        MainScreen()
    }
}