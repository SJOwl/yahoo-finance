package vorobeij.yfinance

import kotlinx.coroutines.runBlocking
import org.junit.Test
import java.util.*

private val tickers = listOf(
    "MMM",
    "AOS",
    "ABT",
    "ABBV",
    "ABMD",
    "ACN",
    "ATVI"
)

private val yahooFinance = YahooFinance()

class YahooRepositoryTest {

    @Test
    fun historicalQuotes() {
        runBlocking {
            tickers.forEach { ticker ->
                println(
                    yahooFinance.historicalQuotes(
                        ticker,
                        Calendar.getInstance().apply {
                            time = Date(0, 0, 0, 0, 0, 0)
                            set(2016, 0, 1)
                        },
                        Calendar.getInstance().apply {
                            time = Date(0, 0, 0, 0, 0, 0)
                            set(2021, 0, 1)
                        },
                        QueryInterval.DAILY
                    )
                )
            }
        }
    }

    @Test fun quoteSummary() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.quoteSummary(ticker)) } }
    }

    @Test fun assetProfile() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.assetProfile(ticker)) } }
    }

    @Test fun balanceSheetHistory() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.balanceSheetHistory(ticker)) } }
    }

    @Test fun balanceSheetHistoryQuarterly() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.balanceSheetHistoryQuarterly(ticker)) } }
    }

    @Test fun calendarEvents() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.calendarEvents(ticker)) } }
    }

    @Test fun cashflowStatementHistory() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.cashflowStatementHistory(ticker)) } }
    }

    @Test fun cashflowStatementHistoryQuarterly() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.cashflowStatementHistoryQuarterly(ticker)) } }
    }

    @Test fun defaultKeyStatistics() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.defaultKeyStatistics(ticker)) } }
    }

    @Test fun earnings() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.earnings(ticker)) } }
    }

    @Test fun earningsHistory() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.earningsHistory(ticker)) } }
    }

    @Test fun earningsTrend() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.earningsTrend(ticker)) } }
    }

    @Test fun financialData() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.financialData(ticker)) } }
    }

    @Test fun fundOwnership() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.fundOwnership(ticker)) } }
    }

    @Test fun incomeStatementHistory() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.incomeStatementHistory(ticker)) } }
    }

    @Test fun incomeStatementHistoryQuarterly() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.incomeStatementHistoryQuarterly(ticker)) } }
    }

    @Test fun indexTrend() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.indexTrend(ticker)) } }
    }

    @Test fun industryTrend() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.industryTrend(ticker)) } }
    }

    @Test fun insiderHolders() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.insiderHolders(ticker)) } }
    }

    @Test fun insiderTransactions() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.insiderTransactions(ticker)) } }
    }

    @Test fun institutionOwnership() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.institutionOwnership(ticker)) } }
    }

    @Test fun majorDirectHolders() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.majorDirectHolders(ticker)) } }
    }

    @Test fun majorHoldersBreakdown() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.majorHoldersBreakdown(ticker)) } }
    }

    @Test fun netSharePurchaseActivity() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.netSharePurchaseActivity(ticker)) } }
    }

    @Test fun price() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.price(ticker)) } }
    }

    @Test fun quoteType() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.quoteType(ticker)) } }
    }

    @Test fun recommendationTrend() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.recommendationTrend(ticker)) } }
    }

    @Test fun secFilings() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.secFilings(ticker)) } }
    }

    @Test fun sectorTrend() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.sectorTrend(ticker)) } }
    }

    @Test fun summaryDetail() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.summaryDetail(ticker)) } }
    }

    @Test fun upgradeDowngradeHistory() {
        runBlocking { tickers.forEach { ticker -> println(yahooFinance.upgradeDowngradeHistory(ticker)) } }
    }
}