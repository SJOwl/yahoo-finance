package vorobeij.yfinance

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

internal interface YahooApi {

    @GET("https://query1.finance.yahoo.com/v7/finance/download/{ticker}")
    suspend fun getHistoryQuotes(
        @Header("Cookie") token: String,
        @Path("ticker") ticker: String,
        @Query("period1") period1: Long,
        @Query("period2") period2: Long,
        @Query("interval") interval: String,
        @Query("crumb") crumb: String
    ): ResponseBody

    @GET("quoteSummary/{ticker}?modules=assetProfile,balanceSheetHistory,balanceSheetHistoryQuarterly,calendarEvents,cashflowStatementHistory,cashflowStatementHistoryQuarterly,defaultKeyStatistics,earnings,earningsHistory,earningsTrend,financialData,fundOwnership,incomeStatementHistory,incomeStatementHistoryQuarterly,indexTrend,industryTrend,insiderHolders,insiderTransactions,institutionOwnership,majorDirectHolders,majorHoldersBreakdown,netSharePurchaseActivity,price,quoteType,recommendationTrend,secFilings,sectorTrend,summaryDetail,summaryProfile,symbol,upgradeDowngradeHistory,fundProfile,topHoldings,fundPerformance")
    suspend fun quoteSummary(@Path("ticker") ticker: String): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=assetProfile")
    suspend fun assetProfile(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=balanceSheetHistory")
    suspend fun balanceSheetHistory(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=balanceSheetHistoryQuarterly")
    suspend fun balanceSheetHistoryQuarterly(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=calendarEvents")
    suspend fun calendarEvents(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=cashflowStatementHistory")
    suspend fun cashflowStatementHistory(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=cashflowStatementHistoryQuarterly")
    suspend fun cashflowStatementHistoryQuarterly(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=defaultKeyStatistics")
    suspend fun defaultKeyStatistics(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=earnings")
    suspend fun earnings(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=earningsHistory")
    suspend fun earningsHistory(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=earningsTrend")
    suspend fun earningsTrend(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=financialData")
    suspend fun financialData(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=fundOwnership")
    suspend fun fundOwnership(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=incomeStatementHistory")
    suspend fun incomeStatementHistory(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=incomeStatementHistoryQuarterly")
    suspend fun incomeStatementHistoryQuarterly(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=indexTrend")
    suspend fun indexTrend(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=industryTrend")
    suspend fun industryTrend(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=insiderHolders")
    suspend fun insiderHolders(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=insiderTransactions")
    suspend fun insiderTransactions(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=institutionOwnership")
    suspend fun institutionOwnership(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=majorDirectHolders")
    suspend fun majorDirectHolders(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=majorHoldersBreakdown")
    suspend fun majorHoldersBreakdown(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=netSharePurchaseActivity")
    suspend fun netSharePurchaseActivity(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=price")
    suspend fun price(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=quoteType")
    suspend fun quoteType(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=recommendationTrend")
    suspend fun recommendationTrend(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=secFilings")
    suspend fun secFilings(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=sectorTrend")
    suspend fun sectorTrend(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=summaryDetail")
    suspend fun summaryDetail(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=summaryProfile")
    suspend fun summaryProfile(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=symbol")
    suspend fun symbol(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=upgradeDowngradeHistory")
    suspend fun upgradeDowngradeHistory(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=fundProfile")
    suspend fun fundProfile(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=topHoldings")
    suspend fun topHoldings(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse

    @GET("quoteSummary/{ticker}?modules=fundPerformance")
    suspend fun fundPerformance(
        @Path("ticker") ticker: String
    ): QuoteSummaryResponse
}