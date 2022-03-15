package com.promogamer.presentation.latestdeals.model

data class LatestDealUiModel(
    val title: String,
    val image: String?,
    val normalPrice: String,
    val priceWithDiscount: String,
    val dealLink: String
)