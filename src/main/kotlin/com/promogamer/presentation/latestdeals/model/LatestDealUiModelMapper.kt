package com.promogamer.presentation.latestdeals.model

import com.promogamer.core.network.deal.DealResponse

fun List<DealResponse>.toUiModel() = map {
    LatestDealUiModel(
        title = it.title.orEmpty(),
        image = it.thumb,
        normalPrice = it.normalPrice.orEmpty(),
        priceWithDiscount = it.salePrice.orEmpty(),
        dealLink = "https://www.cheapshark.com/redirect?dealID=${it.dealId}",
    )
}