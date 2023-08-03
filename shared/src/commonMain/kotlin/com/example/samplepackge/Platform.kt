package com.example.samplepackge

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform