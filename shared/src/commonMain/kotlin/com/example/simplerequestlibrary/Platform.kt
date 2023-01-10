package com.example.simplerequestlibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform