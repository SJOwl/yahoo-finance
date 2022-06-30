package ru.vorobeij.app

import kotlinx.coroutines.runBlocking
import vorobeij.yfinance.YahooFinance

fun main() = runBlocking {
    // Use in-memory cache
//    YahooFinance(cache = MemoryNetworkCache())
    // Use file cache
//    CrumbManager.refresh()
    val yf = YahooFinance()

    println(yf.earningsTrend("AAPL"))
    System.exit(0)
}