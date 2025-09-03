package com.romanenko.wineup.search.navigation

import kotlinx.serialization.Serializable

internal sealed class SearchRoute{
    @Serializable internal data object Search
}
