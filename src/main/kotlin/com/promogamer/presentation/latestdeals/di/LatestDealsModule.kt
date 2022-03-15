package com.promogamer.presentation.latestdeals

import org.koin.dsl.module

val latestDealsModule = module {
    factory { LatestDealsViewModel(get()) }
}