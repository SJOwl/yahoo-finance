package vorobeij.yfinance.utils

import vorobeij.yfinance.HistoricalQuote

internal class QuotesCsvParser {

    fun parseCsv(ticker: String, csv: String): List<HistoricalQuote> {
        val quotes = mutableListOf<HistoricalQuote>()
        csv.lineSequence().forEachIndexed { index, s ->
            if (index != 0) {
                quotes.add(parseCSVLine(ticker, s))
            }
        }
        return quotes
    }


    private fun parseCSVLine(ticker: String, line: String): HistoricalQuote {
        val data: Array<String> = line.split(",").toTypedArray()
        return HistoricalQuote(
            ticker,
            Utils.parseHistDate(data[0]),
            Utils.getDouble(data[1]),
            Utils.getDouble(data[3]),
            Utils.getDouble(data[2]),
            Utils.getDouble(data[4]),
            Utils.getDouble(data[5]),
            Utils.getLong(data[6])
        )
    }
}