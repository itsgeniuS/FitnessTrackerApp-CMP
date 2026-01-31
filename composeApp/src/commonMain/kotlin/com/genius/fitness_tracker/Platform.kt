package com.genius.fitness_tracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform