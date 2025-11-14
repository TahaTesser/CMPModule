package com.example.gemmasample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform