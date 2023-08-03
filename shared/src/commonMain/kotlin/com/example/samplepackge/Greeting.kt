package com.example.samplepackge

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    fun welcome(): String {
        return "Welcome to Mobile Platform..."
    }
}