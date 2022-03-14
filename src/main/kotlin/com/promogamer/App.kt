// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.promogamer.core.ui.AppTheme
import com.promogamer.presentation.main.MainPage
import io.appoutlet.karavel.Karavel

@Composable
@Preview
fun App() {
    val karavel = Karavel(MainPage())

    AppTheme {
        karavel.currentPage().content()
    }
}


fun main() = application {
    Window(
        title = "PromoGamer",
        onCloseRequest = ::exitApplication,
    ) {
        Surface { App() }
    }
}
