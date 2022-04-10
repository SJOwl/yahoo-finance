package ru.vorobeij.app

import kotlinx.coroutines.runBlocking
import vorobeij.yfinance.YahooFinance
import vorobeij.yfinance.cache.MemoryNetworkCache

fun main() = runBlocking {
    // Use in-memory cache
    YahooFinance(cache = MemoryNetworkCache())
    // Use file cache
    val yf = YahooFinance()

    println(yf.earningsTrend("AAPL"))
}