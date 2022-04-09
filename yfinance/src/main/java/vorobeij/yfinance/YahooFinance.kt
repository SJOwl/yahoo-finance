package vorobeij.yfinance

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path
import vorobeij.yfinance.data.QuoteSummary
import vorobeij.yfinance.data.QuoteSummaryResponse
import java.io.File

object YahooFinance {

}

private val retrofit = Retrofit.Builder()

interface YahooApi {

    //    @GET("quoteSummary/{ticker}?modules=incomeStatementHistoryQuarterly")
    //    suspend fun quoteSummaryQuarterly(
    //        @Path("ticker") ticker: String
    //    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=assetProfile,balanceSheetHistory,balanceSheetHistoryQuarterly,calendarEvents,cashflowStatementHistory,cashflowStatementHistoryQuarterly,defaultKeyStatistics,earnings,earningsHistory,earningsTrend,financialData,fundOwnership,incomeStatementHistory,incomeStatementHistoryQuarterly,indexTrend,industryTrend,insiderHolders,insiderTransactions,institutionOwnership,majorDirectHolders,majorHoldersBreakdown,netSharePurchaseActivity,price,quoteType,recommendationTrend,secFilings,sectorTrend,summaryDetail,summaryProfile,symbol,upgradeDowngradeHistory,fundProfile,topHoldings,fundPerformance")
    suspend fun quoteSummary(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse
}

class YahooRepository(
    private val api: YahooApi
) {

    private val cache = YahooCache()

    suspend fun quoteSummary(ticker: String, refresh: Boolean = false): QuoteSummary {
        return getData("quoteSummary-$ticker", refresh) {
            api.quoteSummary(ticker).quoteSummary
        }
    }

    private inline fun <reified T> getData(key: String, refresh: Boolean, fetch: () -> T): T {
        return if (refresh) {
            fetch.invoke()
        } else cache.get(key)?.let { Json.decodeFromString<T>(it) }
            ?: fetch.invoke().also {
                cache.save(key, Json.encodeToString(it))
            }
    }
}

class YahooCache {

    private val root = "./cache"

    init {
        File(root).mkdirs()
    }

    fun get(key: String): String? {
        val f = file(key)
        return if (f.exists()) f.readText() else null
    }

    fun save(key: String, json: String) {
        file(key).writeText(json)
    }

    private fun file(key: String): File {
        return File(root, key)
    }
}

// https://query2.finance.yahoo.com/v10/finance/quoteSummary/AAPL?modules=
//
//assetProfile
//balanceSheetHistory
//balanceSheetHistoryQuarterly
//calendarEvents
//cashflowStatementHistory
//cashflowStatementHistoryQuarterly
//defaultKeyStatistics
//earnings
//earningsHistory
//earningsTrend
//financialData
//fundOwnership
//incomeStatementHistory
//incomeStatementHistoryQuarterly
//indexTrend
//industryTrend
//insiderHolders
//insiderTransactions
//institutionOwnership
//majorDirectHolders
//majorHoldersBreakdown
//netSharePurchaseActivity
//price
//quoteType
//recommendationTrend
//secFilings
//sectorTrend
//summaryDetail
//summaryProfile
//symbol
//upgradeDowngradeHistory
//fundProfile
//topHoldings
//fundPerformance