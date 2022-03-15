package com.promogamer.presentation.latestdeals

import com.promogamer.core.network.deal.DealDataSource
import com.promogamer.presentation.latestdeals.model.LatestDealUiModel
import com.promogamer.presentation.latestdeals.model.toUiModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart

class LatestDealsViewModel(
    private val dealDataSource: DealDataSource,
) {
    val uiModel: Flow<LatestDealsUiState> = dealDataSource.getLatestDeals()
        .map { it.toUiModel() }
        .map<List<LatestDealUiModel>, LatestDealsUiState> { LatestDealsUiState.Success(it) }
        .catch { emit(LatestDealsUiState.Error) }
        .onStart { LatestDealsUiState.Loading }
}

