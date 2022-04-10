package vorobeij.yfinance

import kotlinx.coroutines.runBlocking
import org.junit.Test

class YahooRepositoryTest {

    private val ticker: String = "JNJ"

    private val yahooFinance = YahooFinance()

    @Test fun quoteSummary() {
        runBlocking { println(yahooFinance.quoteSummary(ticker)) }
    }

    @Test fun assetProfile() {
        runBlocking { println(yahooFinance.assetProfile(ticker)) }
    }

    @Test fun balanceSheetHistory() {
        runBlocking { println(yahooFinance.balanceSheetHistory(ticker)) }
    }

    @Test fun balanceSheetHistoryQuarterly() {
        runBlocking { println(yahooFinance.balanceSheetHistoryQuarterly(ticker)) }
    }

    @Test fun calendarEvents() {
        runBlocking { println(yahooFinance.calendarEvents(ticker)) }
    }

    @Test fun cashflowStatementHistory() {
        runBlocking { println(yahooFinance.cashflowStatementHistory(ticker)) }
    }

    @Test fun cashflowStatementHistoryQuarterly() {
        runBlocking { println(yahooFinance.cashflowStatementHistoryQuarterly(ticker)) }
    }

    @Test fun defaultKeyStatistics() {
        runBlocking { println(yahooFinance.defaultKeyStatistics(ticker)) }
    }

    @Test fun earnings() {
        runBlocking { println(yahooFinance.earnings(ticker)) }
    }

    @Test fun earningsHistory() {
        runBlocking { println(yahooFinance.earningsHistory(ticker)) }
    }

    @Test fun earningsTrend() {
        runBlocking { println(yahooFinance.earningsTrend(ticker)) }
    }

    @Test fun financialData() {
        runBlocking { println(yahooFinance.financialData(ticker)) }
    }

    @Test fun fundOwnership() {
        runBlocking { println(yahooFinance.fundOwnership(ticker)) }
    }

    @Test fun incomeStatementHistory() {
        runBlocking { println(yahooFinance.incomeStatementHistory(ticker)) }
    }

    @Test fun incomeStatementHistoryQuarterly() {
        runBlocking { println(yahooFinance.incomeStatementHistoryQuarterly(ticker)) }
    }

    @Test fun indexTrend() {
        runBlocking { println(yahooFinance.indexTrend(ticker)) }
    }

    @Test fun industryTrend() {
        runBlocking { println(yahooFinance.industryTrend(ticker)) }
    }

    @Test fun insiderHolders() {
        runBlocking { println(yahooFinance.insiderHolders(ticker)) }
    }

    @Test fun insiderTransactions() {
        runBlocking { println(yahooFinance.insiderTransactions(ticker)) }
    }

    @Test fun institutionOwnership() {
        runBlocking { println(yahooFinance.institutionOwnership(ticker)) }
    }

    @Test fun majorDirectHolders() {
        runBlocking { println(yahooFinance.majorDirectHolders(ticker)) }
    }

    @Test fun majorHoldersBreakdown() {
        runBlocking { println(yahooFinance.majorHoldersBreakdown(ticker)) }
    }

    @Test fun netSharePurchaseActivity() {
        runBlocking { println(yahooFinance.netSharePurchaseActivity(ticker)) }
    }

    @Test fun price() {
        runBlocking { println(yahooFinance.price(ticker)) }
    }

    @Test fun quoteType() {
        runBlocking { println(yahooFinance.quoteType(ticker)) }
    }

    @Test fun recommendationTrend() {
        runBlocking { println(yahooFinance.recommendationTrend(ticker)) }
    }

    @Test fun secFilings() {
        runBlocking { println(yahooFinance.secFilings(ticker)) }
    }

    @Test fun sectorTrend() {
        runBlocking { println(yahooFinance.sectorTrend(ticker)) }
    }

    @Test fun summaryDetail() {
        runBlocking { println(yahooFinance.summaryDetail(ticker)) }
    }

    @Test fun upgradeDowngradeHistory() {
        runBlocking { println(yahooFinance.upgradeDowngradeHistory(ticker)) }
    }
}