package org.romanenko.wineup

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform