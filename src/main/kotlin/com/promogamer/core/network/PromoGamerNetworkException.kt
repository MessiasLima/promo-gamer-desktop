package com.promogamer.core.network

import okhttp3.ResponseBody

class PromoGamerNetworkException(errorMessage: String, errorBody: ResponseBody?) : Exception()