package vorobeij.yfinance

import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path
import vorobeij.yfinance.data.QuoteSummary
import vorobeij.yfinance.data.QuoteSummaryResponse

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
    suspend fun quoteSummary(ticker: String): QuoteSummary {
        return api.quoteSummary(ticker).quoteSummary
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