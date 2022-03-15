package com.promogamer.core.network.deal

import com.promogamer.core.network.CheapSharkService
import com.promogamer.core.network.parseResponse
import kotlinx.coroutines.flow.flow

class DealDataSource(
    private val cheapSharkService: CheapSharkService,
) {
    fun getLatestDeals() = flow {
        emit(cheapSharkService.getDeals().parseResponse().orEmpty())
    }
}