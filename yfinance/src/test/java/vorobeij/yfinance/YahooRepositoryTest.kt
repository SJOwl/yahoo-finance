package vorobeij.yfinance

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.create

class YahooRepositoryTest {

    @ExperimentalSerializationApi
    companion object {

        private val retrofit = Retrofit.Builder()
            .baseUrl("https://query2.finance.yahoo.com/v10/finance/")
            .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
            .client(
                OkHttpClient.Builder()
                    .addInterceptor(HttpLoggingInterceptor().apply {
                        level = HttpLoggingInterceptor.Level.BASIC
                    })
                    .build()
            ).build()
        private val api = retrofit.create<YahooApi>()
        private val yahooRepository = YahooRepository(api)
    }

    private val ticker: String = "AMZN"

    @Test fun quoteSummary() {
        runBlocking { println(yahooRepository.quoteSummary(ticker)) }
    }

    @Test fun assetProfile() {
        runBlocking { println(yahooRepository.assetProfile(ticker)) }
    }

    @Test fun balanceSheetHistory() {
        runBlocking { println(yahooRepository.balanceSheetHistory(ticker)) }
    }

    @Test fun balanceSheetHistoryQuarterly() {
        runBlocking { println(yahooRepository.balanceSheetHistoryQuarterly(ticker)) }
    }

    @Test fun calendarEvents() {
        runBlocking { println(yahooRepository.calendarEvents(ticker)) }
    }

    @Test fun cashflowStatementHistory() {
        runBlocking { println(yahooRepository.cashflowStatementHistory(ticker)) }
    }

    @Test fun cashflowStatementHistoryQuarterly() {
        runBlocking { println(yahooRepository.cashflowStatementHistoryQuarterly(ticker)) }
    }

    @Test fun defaultKeyStatistics() {
        runBlocking { println(yahooRepository.defaultKeyStatistics(ticker)) }
    }

    @Test fun earnings() {
        runBlocking { println(yahooRepository.earnings(ticker)) }
    }

    @Test fun earningsHistory() {
        runBlocking { println(yahooRepository.earningsHistory(ticker)) }
    }

    @Test fun earningsTrend() {
        runBlocking { println(yahooRepository.earningsTrend(ticker)) }
    }

    @Test fun financialData() {
        runBlocking { println(yahooRepository.financialData(ticker)) }
    }

    @Test fun fundOwnership() {
        runBlocking { println(yahooRepository.fundOwnership(ticker)) }
    }

    @Test fun incomeStatementHistory() {
        runBlocking { println(yahooRepository.incomeStatementHistory(ticker)) }
    }

    @Test fun incomeStatementHistoryQuarterly() {
        runBlocking { println(yahooRepository.incomeStatementHistoryQuarterly(ticker)) }
    }

    @Test fun indexTrend() {
        runBlocking { println(yahooRepository.indexTrend(ticker)) }
    }

    @Test fun industryTrend() {
        runBlocking { println(yahooRepository.industryTrend(ticker)) }
    }

    @Test fun insiderHolders() {
        runBlocking { println(yahooRepository.insiderHolders(ticker)) }
    }

    @Test fun insiderTransactions() {
        runBlocking { println(yahooRepository.insiderTransactions(ticker)) }
    }

    @Test fun institutionOwnership() {
        runBlocking { println(yahooRepository.institutionOwnership(ticker)) }
    }

    @Test fun majorDirectHolders() {
        runBlocking { println(yahooRepository.majorDirectHolders(ticker)) }
    }

    @Test fun majorHoldersBreakdown() {
        runBlocking { println(yahooRepository.majorHoldersBreakdown(ticker)) }
    }

    @Test fun netSharePurchaseActivity() {
        runBlocking { println(yahooRepository.netSharePurchaseActivity(ticker)) }
    }

    @Test fun price() {
        runBlocking { println(yahooRepository.price(ticker)) }
    }

    @Test fun quoteType() {
        runBlocking { println(yahooRepository.quoteType(ticker)) }
    }

    @Test fun recommendationTrend() {
        runBlocking { println(yahooRepository.recommendationTrend(ticker)) }
    }

    @Test fun secFilings() {
        runBlocking { println(yahooRepository.secFilings(ticker)) }
    }

    @Test fun sectorTrend() {
        runBlocking { println(yahooRepository.sectorTrend(ticker)) }
    }

    @Test fun summaryDetail() {
        runBlocking { println(yahooRepository.summaryDetail(ticker)) }
    }

    @Test fun upgradeDowngradeHistory() {
        runBlocking { println(yahooRepository.upgradeDowngradeHistory(ticker)) }
    }
}