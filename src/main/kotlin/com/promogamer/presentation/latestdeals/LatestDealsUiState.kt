package com.promogamer.presentation.latestdeals

import com.promogamer.presentation.latestdeals.model.LatestDealUiModel

sealed class LatestDealsUiState {
    object Loading : LatestDealsUiState()
    object Error : LatestDealsUiState()
    data class Success(val uiModels: List<LatestDealUiModel>) : LatestDealsUiState()
}