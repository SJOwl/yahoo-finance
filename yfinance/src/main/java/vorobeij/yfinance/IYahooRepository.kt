package vorobeij.yfinance

import vorobeij.yfinance.data.AssetProfile
import vorobeij.yfinance.data.BalanceSheetHistory
import vorobeij.yfinance.data.CalendarEvents
import vorobeij.yfinance.data.CashflowStatementHistory
import vorobeij.yfinance.data.DefaultKeyStatistics
import vorobeij.yfinance.data.EarningsHistory
import vorobeij.yfinance.data.EarningsOverview
import vorobeij.yfinance.data.EarningsTrend
import vorobeij.yfinance.data.FinancialData
import vorobeij.yfinance.data.FundOwnership
import vorobeij.yfinance.data.IncomeStatementHistory
import vorobeij.yfinance.data.IndexTrend
import vorobeij.yfinance.data.InsiderHolders
import vorobeij.yfinance.data.InsiderTransactions
import vorobeij.yfinance.data.InstitutionOwnership
import vorobeij.yfinance.data.MajorDirectHolders
import vorobeij.yfinance.data.MajorHoldersBreakdown
import vorobeij.yfinance.data.NetSharePurchaseActivity
import vorobeij.yfinance.data.Price
import vorobeij.yfinance.data.QuoteType
import vorobeij.yfinance.data.RecommendationTrend
import vorobeij.yfinance.data.SecFilings
import vorobeij.yfinance.data.Summary
import vorobeij.yfinance.data.SummaryDetail
import vorobeij.yfinance.data.UpgradeDowngradeHistory

interface IYahooRepository {

    suspend fun quoteSummary(ticker: String, refresh: Boolean = true): Summary

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