package com.example.kotlinappday1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform