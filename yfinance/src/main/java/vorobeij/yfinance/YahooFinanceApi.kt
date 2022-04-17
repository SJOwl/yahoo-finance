package vorobeij.yfinance

import java.util.Calendar

internal interface YahooFinanceApi {

    suspend fun historicalQuotes(ticker: String, from: Calendar, to: Calendar, interval: QueryInterval, refresh: Boolean = false): List<HistoricalQuote>

    suspend fun quoteSummary(ticker: String, refresh: Boolean = false): Summary

    suspend fun assetProfile(ticker: String, refresh: Boolean = false): AssetProfile

    suspend fun balanceSheetHistory(ticker: String, refresh: Boolean = false): BalanceSheetHistory

    suspend fun balanceSheetHistoryQuarterly(ticker: String, refresh: Boolean = false): BalanceSheetHistory

    suspend fun calendarEvents(ticker: String, refresh: Boolean = false): CalendarEvents

    suspend fun cashflowStatementHistory(ticker: String, refresh: Boolean = false): CashflowStatementHistory

    suspend fun cashflowStatementHistoryQuarterly(ticker: String, refresh: Boolean = false): CashflowStatementHistory

    suspend fun defaultKeyStatistics(ticker: String, refresh: Boolean = false): DefaultKeyStatistics

    suspend fun earnings(ticker: String, refresh: Boolean = false): EarningsOverview

    suspend fun earningsHistory(ticker: String, refresh: Boolean = false): EarningsHistory

    suspend fun earningsTrend(ticker: String, refresh: Boolean = false): EarningsTrend

    suspend fun financialData(ticker: String, refresh: Boolean = false): FinancialData

    suspend fun fundOwnership(ticker: String, refresh: Boolean = false): FundOwnership

    suspend fun incomeStatementHistory(ticker: String, refresh: Boolean = false): IncomeStatementHistory

    suspend fun incomeStatementHistoryQuarterly(ticker: String, refresh: Boolean = false): IncomeStatementHistory

    suspend fun indexTrend(ticker: String, refresh: Boolean = false): IndexTrend

    suspend fun industryTrend(ticker: String, refresh: Boolean = false): IndexTrend

    suspend fun insiderHolders(ticker: String, refresh: Boolean = false): InsiderHolders

    suspend fun insiderTransactions(ticker: String, refresh: Boolean = false): InsiderTransactions

    suspend fun institutionOwnership(ticker: String, refresh: Boolean = false): InstitutionOwnership

    suspend fun majorDirectHolders(ticker: String, refresh: Boolean = false): MajorDirectHolders

    suspend fun majorHoldersBreakdown(ticker: String, refresh: Boolean = false): MajorHoldersBreakdown

    suspend fun netSharePurchaseActivity(ticker: String, refresh: Boolean = false): NetSharePurchaseActivity

    suspend fun price(ticker: String, refresh: Boolean = false): Price

    suspend fun quoteType(ticker: String, refresh: Boolean = false): QuoteType

    suspend fun recommendationTrend(ticker: String, refresh: Boolean = false): RecommendationTrend

    suspend fun secFilings(ticker: String, refresh: Boolean = false): SecFilings

    suspend fun sectorTrend(ticker: String, refresh: Boolean = false): IndexTrend

    suspend fun summaryDetail(ticker: String, refresh: Boolean = false): SummaryDetail

    suspend fun upgradeDowngradeHistory(ticker: String, refresh: Boolean = false): UpgradeDowngradeHistory
}