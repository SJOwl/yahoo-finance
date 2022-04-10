package vorobeij.yfinance

import kotlinx.coroutines.runBlocking
import org.junit.Test

class YahooRepositoryTest {

    private val ticker: String = "MELI"

    @Test fun quoteSummary() {
        runBlocking { println(YahooFinance.quoteSummary(ticker)) }
    }

    @Test fun assetProfile() {
        runBlocking { println(YahooFinance.assetProfile(ticker)) }
    }

    @Test fun balanceSheetHistory() {
        runBlocking { println(YahooFinance.balanceSheetHistory(ticker)) }
    }

    @Test fun balanceSheetHistoryQuarterly() {
        runBlocking { println(YahooFinance.balanceSheetHistoryQuarterly(ticker)) }
    }

    @Test fun calendarEvents() {
        runBlocking { println(YahooFinance.calendarEvents(ticker)) }
    }

    @Test fun cashflowStatementHistory() {
        runBlocking { println(YahooFinance.cashflowStatementHistory(ticker)) }
    }

    @Test fun cashflowStatementHistoryQuarterly() {
        runBlocking { println(YahooFinance.cashflowStatementHistoryQuarterly(ticker)) }
    }

    @Test fun defaultKeyStatistics() {
        runBlocking { println(YahooFinance.defaultKeyStatistics(ticker)) }
    }

    @Test fun earnings() {
        runBlocking { println(YahooFinance.earnings(ticker)) }
    }

    @Test fun earningsHistory() {
        runBlocking { println(YahooFinance.earningsHistory(ticker)) }
    }

    @Test fun earningsTrend() {
        runBlocking { println(YahooFinance.earningsTrend(ticker)) }
    }

    @Test fun financialData() {
        runBlocking { println(YahooFinance.financialData(ticker)) }
    }

    @Test fun fundOwnership() {
        runBlocking { println(YahooFinance.fundOwnership(ticker)) }
    }

    @Test fun incomeStatementHistory() {
        runBlocking { println(YahooFinance.incomeStatementHistory(ticker)) }
    }

    @Test fun incomeStatementHistoryQuarterly() {
        runBlocking { println(YahooFinance.incomeStatementHistoryQuarterly(ticker)) }
    }

    @Test fun indexTrend() {
        runBlocking { println(YahooFinance.indexTrend(ticker)) }
    }

    @Test fun industryTrend() {
        runBlocking { println(YahooFinance.industryTrend(ticker)) }
    }

    @Test fun insiderHolders() {
        runBlocking { println(YahooFinance.insiderHolders(ticker)) }
    }

    @Test fun insiderTransactions() {
        runBlocking { println(YahooFinance.insiderTransactions(ticker)) }
    }

    @Test fun institutionOwnership() {
        runBlocking { println(YahooFinance.institutionOwnership(ticker)) }
    }

    @Test fun majorDirectHolders() {
        runBlocking { println(YahooFinance.majorDirectHolders(ticker)) }
    }

    @Test fun majorHoldersBreakdown() {
        runBlocking { println(YahooFinance.majorHoldersBreakdown(ticker)) }
    }

    @Test fun netSharePurchaseActivity() {
        runBlocking { println(YahooFinance.netSharePurchaseActivity(ticker)) }
    }

    @Test fun price() {
        runBlocking { println(YahooFinance.price(ticker)) }
    }

    @Test fun quoteType() {
        runBlocking { println(YahooFinance.quoteType(ticker)) }
    }

    @Test fun recommendationTrend() {
        runBlocking { println(YahooFinance.recommendationTrend(ticker)) }
    }

    @Test fun secFilings() {
        runBlocking { println(YahooFinance.secFilings(ticker)) }
    }

    @Test fun sectorTrend() {
        runBlocking { println(YahooFinance.sectorTrend(ticker)) }
    }

    @Test fun summaryDetail() {
        runBlocking { println(YahooFinance.summaryDetail(ticker)) }
    }

    @Test fun upgradeDowngradeHistory() {
        runBlocking { println(YahooFinance.upgradeDowngradeHistory(ticker)) }
    }
}