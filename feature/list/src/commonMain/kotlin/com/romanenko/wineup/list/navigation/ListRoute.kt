package com.romanenko.wineup.list.navigation

import kotlinx.serialization.Serializable

internal sealed class ListRoute {
    @Serializable data object List:ListRoute()
}