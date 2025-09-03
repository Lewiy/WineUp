package com.romanenko.wineup.add

import kotlinx.serialization.Serializable

internal sealed class AddRoute{
    @Serializable internal data object Add:AddRoute()
}
