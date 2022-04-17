package vorobeij.yfinance

import java.util.Calendar

data class HistoricalQuote(
    val symbol: String,
    val date: Calendar,
    val open: Double,
    val low: Double,
    val high: Double,
    val close: Double,
    val adjClose: Double,
    val volume: Long
)