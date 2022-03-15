package com.promogamer.di

import androidx.compose.ui.window.ApplicationScope
import com.promogamer.core.network.networkModule
import com.promogamer.presentation.latestdeals.latestDealsModule
import org.koin.core.context.startKoin

fun ApplicationScope.startDependencyInjection() {
    startKoin {
        printLogger()
        modules(
            networkModule,
            latestDealsModule,
        )
    }
}